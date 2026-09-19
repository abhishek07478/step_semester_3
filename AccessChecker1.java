class MovieTicket {

    private String seatNumber;
    String screenId;
    protected double ticketPrice;
    public String movieTitle;
}

class PremiumMovieTicket extends MovieTicket {
}

class AccessChecker1 {

    static String classifyAccess(
            String fieldModifier,
            String accessorContext) {

        // Same class
        if (accessorContext.equals("SAME_CLASS")) {
            return "ALLOWED";
        }

        // Same package
        if (accessorContext.equals("SAME_PACKAGE")) {

            if (fieldModifier.equals("private")) {
                return "DENIED";
            }

            return "ALLOWED";
        }

        // Different package - normal access
        if (accessorContext.equals("DIFFERENT_PACKAGE")) {

            if (fieldModifier.equals("public")) {
                return "ALLOWED";
            }

            return "DENIED";
        }

        // Different-package subclass using its own type
        if (accessorContext.equals(
                "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")) {

            if (fieldModifier.equals("protected") ||
                fieldModifier.equals("public")) {
                return "ALLOWED";
            }

            return "DENIED";
        }

        // Different-package subclass using parent type
        if (accessorContext.equals(
                "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE")) {

            if (fieldModifier.equals("public")) {
                return "ALLOWED";
            }

            return "DENIED";
        }

        return "DENIED";
    }

    public static void main(String[] args) {

        System.out.println(
            classifyAccess(
                "protected",
                "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"
            )
        );

        System.out.println(
            classifyAccess(
                "protected",
                "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"
            )
        );
    }
}