# Java Loop Control: Break and Continue Interaction

This example showcases a common misunderstanding in Java involving `break` and `continue` statements inside loops. The code appears straightforward, but the combined effect of `break` and `continue` can be counterintuitive.

## The Bug

The `continue` statement skips to the next iteration, while `break` exits the loop entirely.  The unexpected behavior occurs when these statements appear together and interact with loop counter increments.