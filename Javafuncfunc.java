/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafuncfunc;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Javafuncfunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean program = true;
        double radius = 0;
        double base = 0;
        double height = 0;
        double sidea = 0;
        double sideb = 0;
        double angleC = 0;
        double centralangle = 0;
        RUNNING:
        do {

            JOptionPane.showMessageDialog(null, "Let's calculate shapes!!!");
            boolean correct = true;
            OPERATIONS:
            do {
                int operation = JOptionPane.showOptionDialog(
                        null,
                        "What do you want calculate?",
                        "Let's get started",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new String[]{"Area of a circle", "Area of a Circle Segment", "Area of a rectangle", "Area of a triangle", "Area of a sphere", "Volume of a sphere", "Volume of a cylinder", "Find a triangles missing side"},
                        null);
                switch (operation) {
                    case -1: {
                        break RUNNING;
                    }
                    case 0: {
                        JOptionPane.showMessageDialog(null, "Provide the radius of the circle");
                        radius = getvalue();
                        if (radius == -1) {
                            break;
                        }
                        double circlearea = getcirclearea(radius);
                        JOptionPane.showMessageDialog(null, String.format("The area of a circle with a radius of %.2f units is %.2f square units.", radius, circlearea));
                        break;
                    }
                    case 1: {
                        JOptionPane.showMessageDialog(null, "Provide the radius of the circle");
                        radius = getvalue();
                        if (radius == -1) {
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Provide the central angle of the circle in degrees");
                        centralangle = getcirlesegmentangle();
                        if (centralangle == -1) {
                            break;
                        }
                        double segmentarea = calculateCircleSegmentArea(radius, centralangle);
                        JOptionPane.showMessageDialog(null, String.format("The area of a circle segment with a radius of %.2f units and a central angle of %.2f degrees is %.2f square units.", radius, centralangle, segmentarea));

                        break;
                    }
                    case 2: {
                        JOptionPane.showMessageDialog(null, "Provide the base of the rectangle");
                        base = getvalue();
                        if (base == -1) {
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Provide the height of the rectangle");
                        height = getvalue();
                        if (height == -1) {
                            break;
                        }
                        double arearectangle = getrectanglearea(base, height);
                        JOptionPane.showMessageDialog(null, String.format("The area of a rectangle with a base of %.2f units and a height  of %.2f units is %.2f square units.", base, height, arearectangle));
                        break;

                    }
                    case 3: {
                        JOptionPane.showMessageDialog(null, "Provide the base of the triangle");
                        base = getvalue();
                        if (base == -1) {
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Provide the height of the triangle");
                        height = getvalue();
                        if (height == -1) {
                            break;
                        }
                        double trianglearea = gettrianglearea(base, height);
                        JOptionPane.showMessageDialog(null, String.format("The area of a triangle with a base of %.2f units and a height  of %.2f units is %.2f square units.", base, height, trianglearea));
                        break;

                    }
                    case 4: {
                        JOptionPane.showMessageDialog(null, "Provide the radius of the sphere");
                        radius = getvalue();
                        if (radius == -1) {
                            break;
                        }
                        double spherearea = calculateSphereSurfaceArea(radius);
                        JOptionPane.showMessageDialog(null, String.format("The area of a sphere with a radius of %.2f units is %.2f square units.", radius, spherearea));
                        break;
                    }
                    case 5: {
                        JOptionPane.showMessageDialog(null, "Provide the radius of the sphere");
                        radius = getvalue();
                        if (radius == -1) {
                            break;
                        }
                        double spherevolume = getspherevolume(radius);
                        JOptionPane.showMessageDialog(null, String.format("The volume of a sphere with a radius of %.2f units is %.2f cubic units.", radius, spherevolume));
                        break;

                    }
                    case 6: {
                        JOptionPane.showMessageDialog(null, "Provide the radius of the cylinder's base");
                        radius = getvalue();
                        if (radius == -1) {
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Provide the height of the cylinder");
                        height = getvalue();
                        if (height == -1) {
                            break;
                        }
                        double cylindervolume = getcylindervolume(radius, height);
                        JOptionPane.showMessageDialog(null, String.format("The volume of a cylinder with a radius of %.2f units and a height of %.2f units is %.2f cubic units.", radius, height, cylindervolume));
                        break;

                    }
                    case 7: {
                        JOptionPane.showMessageDialog(null, "Provide side a of the triangle");
                        sidea = getvalue();
                        if (sidea == -1) {
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Provide side b of the triangle");
                        sideb = getvalue();
                        if (sideb == -1) {
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Provide angle C of the triangle in degrees");
                        angleC = gettriangleangle();
                        if (angleC == -1) {
                            break;
                        }
                        double sidec = calculateTriangleSide(sidea, sideb, angleC);
                        JOptionPane.showMessageDialog(null, String.format("The missing side of a tringle with sides %.2f units and %.2f units and an angle of %.2f degrees is %.2f units.", sidea, sideb, angleC, sidec));
                        break;

                    }
                }
                int more = JOptionPane.showConfirmDialog(null, "Do you want to do another calculation?", "again?", JOptionPane.YES_NO_OPTION);
                switch (more) {
                    case -1: {
                        break RUNNING;
                    }
                    case 0: {
                        break;
                    }
                    case 1: {
                        break OPERATIONS;
                    }
                }

            } while (correct);
            int nextCustomerOption = JOptionPane.showConfirmDialog(null, "Next user?", "", JOptionPane.YES_NO_OPTION);
            switch (nextCustomerOption) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    break RUNNING;
                }
                case -1 -> {
                    break RUNNING;
                }
            }

        } while (program);
        JOptionPane.showMessageDialog(null, "Thank you for using Karl's program.");
    }
//getting value and making sure its valid//

    public static double getvalue() {
        double value = 0;
        boolean validInput = false;
        String toolong = """
                         Value must be:
                         - Greater than 0""";

        while (!validInput) {
            String val = JOptionPane.showInputDialog("Enter the value");

            if (val == null || val.trim().isEmpty()) {
                int changeInput = JOptionPane.showConfirmDialog(
                        null, "Do you want to try again?",
                        "Invalid Value", JOptionPane.YES_NO_OPTION);

                if (changeInput != JOptionPane.YES_OPTION) {
                    return -1;
                }
            } else {
                try {
                    value = Double.parseDouble(val);
                    if (value > 0) {
                        validInput = true;
                    } else {
                        int changeInput = JOptionPane.showConfirmDialog(
                                null,
                                toolong,
                                "Invalid Value",
                                JOptionPane.YES_NO_OPTION);

                        if (changeInput != JOptionPane.YES_OPTION) {
                            return -1;
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
                }
            }
        }

        return value;
    }
//getting angle and making sure its valid//

    public static double getcirlesegmentangle() {
        double value = 0;
        boolean validInput = false;
        String toolong = """
                                 Value must be:
                                 - Greater than 0
                                 - Less than 360""";

        while (!validInput) {
            String val = JOptionPane.showInputDialog("Enter the value");

            if (val == null || val.trim().isEmpty()) {
                int changeInput = JOptionPane.showConfirmDialog(
                        null, "Do you want to try again?",
                        "Invalid Value", JOptionPane.YES_NO_OPTION);

                if (changeInput != JOptionPane.YES_OPTION) {
                    return -1;
                }
            } else {
                try {
                    value = Double.parseDouble(val);
                    if (value > 0 && value < 360) {
                        validInput = true;
                    } else {
                        int changeInput = JOptionPane.showConfirmDialog(
                                null,
                                toolong,
                                "Invalid Value",
                                JOptionPane.YES_NO_OPTION);

                        if (changeInput != JOptionPane.YES_OPTION) {
                            return -1;
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
                }
            }
        }

        return value;
    }

    //getting angle and making sure its valid//
    public static double gettriangleangle() {
        double value = 0;
        boolean validInput = false;
        String toolong = """
                                         Value must be:
                                         - Greater than 0
                                         - Less than 180""";

        while (!validInput) {
            String val = JOptionPane.showInputDialog("Enter the value");

            if (val == null || val.trim().isEmpty()) {
                int changeInput = JOptionPane.showConfirmDialog(
                        null, "Do you want to try again?",
                        "Invalid Value", JOptionPane.YES_NO_OPTION);

                if (changeInput != JOptionPane.YES_OPTION) {
                    return -1;
                }
            } else {
                try {
                    value = Double.parseDouble(val);
                    if (value > 0 && value < 180) {
                        validInput = true;
                    } else {
                        int changeInput = JOptionPane.showConfirmDialog(
                                null,
                                toolong,
                                "Invalid Value",
                                JOptionPane.YES_NO_OPTION);

                        if (changeInput != JOptionPane.YES_OPTION) {
                            return -1;
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
                }
            }
        }

        return value;
    }
//calculations//

    public static double getcirclearea(double r) {
        double areacircle = Math.PI * r * r;
        return areacircle;
    }

    public static double calculateCircleSegmentArea(double r, double angle) {
        double radians = Math.toRadians(angle);
        double area = .5 * r * r * (radians - Math.sin(radians));
        return area;
    }

    public static double getrectanglearea(double b, double h) {
        double arearectangle = b * h;
        return arearectangle;
    }

    public static double gettrianglearea(double b, double h) {
        double trianglearea = (b * h) / 2;
        return trianglearea;
    }

    public static double calculateSphereSurfaceArea(double r) {
        double area = 4 * Math.PI * r * r;
        return area;
    }

    public static double getspherevolume(double r) {
        double volume = (4 * Math.PI * r * r * r) / 3;
        return volume;
    }

    public static double getcylindervolume(double r, double h) {
        double volume = Math.PI * r * r * h;
        return volume;
    }

    public static double calculateTriangleSide(double a, double b, double angleC) {
        double radians = Math.toRadians(angleC);
        double sidec = Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(radians)));
        return sidec;
    }

}
