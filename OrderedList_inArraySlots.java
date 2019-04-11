/**
  OrderedList_inArraySlots, holding Integers

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  ArrayList<Integer>
 */

public class OrderedList_inArraySlots
    implements OrderedList {

    private java.util.ArrayList<Integer> list_iAS;


    /**
      @return the index of any occurrence of
              \findMe in this list, or -1 if
              \findMe is absent from this list.
     */
    public int indexOf( Integer findMe) {
        return indexOf_whileStyle( findMe);
        // return indexOf_recursive(
            // findMe, 0, list_iAS.size() -1);
    }


    /**
      @return the indexOf value, calculated while-style
     */
    private int indexOf_whileStyle( Integer findMe) {
        int low = 0;
        int hi  = list_iAS.size() -1;  // inclusive

        while( low <= hi){
            int pageToCheck = (low + hi) / 2;
            int comparison =
              findMe.compareTo( list_iAS.get( pageToCheck));
            if( comparison == 0) return pageToCheck;
            else
                if( comparison < 0)
                    // findMe's spot precedes pageToCheck
                    hi = pageToCheck -1;
                // findMe's spot follows pageToCheck
                else low = pageToCheck +1;
        }
        return -3; // value differs from skeleton, just FYI
    }


    /**
      @return the indexOf value, calculated recursively
      [Holmes's comments temporarily elided, so as
       to avoid spoilers for hw60_16]
     */
    private int indexOf_recursive( Integer findMe
                                 , int low
                                 , int hi // inclusive
                                 ) {
        // System.out.println( "debug low: " + low
                          // + "   hi: " + hi);
        if( low > hi)  // detect base case
            return -2;   // solution to base case
              // value differs from while-style method, just FYI
        else{
            int pageToCheck = (low + hi) / 2;
            int comparison =
              findMe.compareTo( list_iAS.get( pageToCheck));


            if( comparison == 0)    // detect base case
                return pageToCheck; // solution other base case
            // recursive cases
            else
                if( comparison < 0)
                    // findMe's spot precedes pageToCheck
                    return indexOf_recursive( findMe
                                             , low
                                             , pageToCheck -1);
                else
                    // findMe's spot follows pageToCheck
                    return indexOf_recursive( findMe
                                            , pageToCheck +1
                                            , hi);
        }
    }


    // ------ code from previous assignments below here ----

    public OrderedList_inArraySlots() {
        list_iAS = new java.util.ArrayList<Integer>();
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return list_iAS.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( Integer value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
              ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
         return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public Integer get( int index ) {
        return list_iAS.get( index);
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public Integer remove( int index) {
        return list_iAS.remove( index);
    }
}
