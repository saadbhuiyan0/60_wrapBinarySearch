# implement List.indexOf

`while`-style and recursive implementations at the top of
OrderedList_inArraySlots.java

[Java API on the `indexOf` method](https://docs.oracle.com/javase/10/docs/api/java/util/List.html#indexOf(java.lang.Object))

based on [solutionsHolmes/5D_genericTypes/OrderedList_inArraySlots_v2/](https://github.com/stuyvesant-cs/solutionsHolmes/tree/master/5D_genericTypes/OrderedList_inArraySlots_v2)
as of 2019-04-10 04:48



# logarithmic functions

logarithmic functions are the *inverse* functions of exponential functions

the logarthmic function ``y = log2(x)`` is the inverse function of the exponential function ``y = 2^(x)``

the logarthmic function interchanges the `x` and the `y` of the exponential function

in the exponential function ``y = 2^(x)`` the output `y` is the value resulting from `2^(x)` or "2 to the power of x"

in the logarithmic function ``y = log2(x)`` the output `y` is the value that yields `x` when raised as the exponent of 2 or `2^(y)`

hence, the graph of the logarithmic function ``y = log2(x)`` will look like the graph of the exponential function ``y = 2^(x)`` reflected over the line of symmetry ``y = x`` which is equivalent to a reflection over the `x`-axis and the `y`-axis



# the recursive solution


## the problem

Return the index of a given `Integer` in an ordered list.


## the recursive abstraction
When I am asked to return the index of a given `Integer` in an ordered list, the recursive abstraction can find the index of the given `Integer` in the half of the ordered list which may contain the given `Integer`.


## the solution

0. **binary expression/choice:** Is the `Integer` at the index we are looking at equal to the `Integer` we are looking for?

1. **base case:** True, the `Integer` we are looking at is equal to the `Integer` we are looking for.

- - **processing:** Return the index.

2. **recursive case:** False, the `Integer` we are looking at is not equal to the `Integer` we are looking for.

- - **secondary expression/choice:** Is the `Integer` at the index we are looking at smaller or larger than `Integer` we are looking for?

- - **one case:** The `Integer` at the index we are looking at is smaller than `Integer` we are looking for. 

- - - **recursive abstraction:** We can look for the `Integer` halfway between the the current index and the known lower limit.

- - **other case:** The `Integer` at the index we are looking at is larger than `Integer` we are looking for. 

- - - **recursive abstraction:** We can look for the `Integer` halfway between the the current index and the known higher limit.