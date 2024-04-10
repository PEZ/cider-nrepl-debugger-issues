# cider-nrepl Debugger, wrong coor for atom

This is a minimal reproduction project for an issue with the cider-nrepl debugger stepping to a dereferenced atom.

The problem arises when debugging a function using an atom. In this particular case the atom is declared within a let binding.
In order to reproduce the [issue](https://github.com/BetterThanTomorrow/calva/issues/2501):

With CIDER or Calva (and probably any cider-nrepl client implementing the nrepl debugger protocol):

1. Load [src/debug_atom_boom.clj](src/debug_atom_boom.clj)
1. Evaluate the `boom` top level functionn
1. Evaluate the `(boom)` expression in the Rich comment

Expected: The debugger should at the `@!a` token and display the value `0`.

Actual: Things go boom! (Different symptoms in CIDER and Calva).

## Findings

Examining what happens, using Calva, the debug response has a `coor` of `[3 1]`, meaning we should

1. navigate into the top level function and go 3 sexpressions forward
1. navigate down the `@!a` symbol and move 1 sexpression forward

But that second step isn't possible, the `coor` should be `[3]` as far as I understand things.