# calva-debugger-issues
This is a mininal reproduction project for some issues with the Calva debugger

The problem arises when debugging a function using an atom. In this particular case the atom is declared within a let binding.
In order to reproduce the issue:

0. Clone this repo: https://github.com/javierrweiss/calva-debugger-issues
1. Use "Instrument top level form for debuggin" command.
2. Then either use the "Step over" or "Step out" commands.
3. Finally, in this particular reproduction case it will throw the error when evaluating the swap! function.