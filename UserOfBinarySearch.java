/**
  test indexOf in OrderedList_inArraySlots
 */

public class UserOfBinarySearch {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println();
        
        /* create a list whose values are easy to
           distinguish from indexes */
        Integer valNotIndex = 111;
        for( int count = 0; count < 10; count++){
            orderedList.add( valNotIndex);
            valNotIndex += 2;  // to leave gaps
        }
        System.out.println( "sample list: " + orderedList
                          + System.lineSeparator());

        System.out.println( "search for values THAT EXIST");
        Integer findMe;  // value to find
        int foundAt;     // index where value is found
        System.out.println();
        for( int i = 0; i < orderedList.size(); i++) {
            findMe = orderedList.get( i);
            foundAt = orderedList.indexOf( findMe);
            System.out.println( 
                "Value " + findMe
              + " was found at index " + foundAt
              + ". That's correct, eh? " + (foundAt == i)
              );
        }
        System.out.println();


        System.out.println( "search for MISSING values");
        findOne( "not in middle"
               , orderedList.get( orderedList.size() /2) +1);
        findOne( "before first ", orderedList.get(0) -5);
        findOne( "after last   "
               , orderedList.get( orderedList.size() -1) +5);
        System.out.println();
    }


    /**
      report on indexOf's search for the given value
     */
    private static void findOne( String description
                               , Integer value
                              ) {
        int foundAt = orderedList.indexOf( value);
        System.out.println( description + ": "
          + " value " + value
          + " \"found\" at index " + foundAt
          + ". That's correct, eh? " + (foundAt < 0)
          );
     }
}
