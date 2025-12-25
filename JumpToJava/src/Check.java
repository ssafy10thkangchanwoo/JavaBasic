public class Check {
        public static Class<Integer> typeof(final int expr) {
            return Integer.TYPE;
        }

        public static Class<Long> typeof(final long expr) {
            return Long.TYPE;
        }

        public static Class<Float> typeof(final float expr) {
            return Float.TYPE;
        }

        public static Class<Double> typeof(final double expr) {
            return Double.TYPE;
        }

        public static Class<String> typeof(final String expr) {
            return String.class;
        }
        // ...
    }

