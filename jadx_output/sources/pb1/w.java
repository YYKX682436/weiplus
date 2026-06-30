package pb1;

/* loaded from: classes15.dex */
public abstract class w {
    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return (obj == null || obj2 == null) ? obj == obj2 : ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) ? java.util.Arrays.deepEquals((java.lang.Object[]) obj, (java.lang.Object[]) obj2) : ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) ? java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2) : ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) obj, (byte[]) obj2) : ((obj instanceof char[]) && (obj2 instanceof char[])) ? java.util.Arrays.equals((char[]) obj, (char[]) obj2) : ((obj instanceof double[]) && (obj2 instanceof double[])) ? java.util.Arrays.equals((double[]) obj, (double[]) obj2) : ((obj instanceof float[]) && (obj2 instanceof float[])) ? java.util.Arrays.equals((float[]) obj, (float[]) obj2) : ((obj instanceof int[]) && (obj2 instanceof int[])) ? java.util.Arrays.equals((int[]) obj, (int[]) obj2) : ((obj instanceof long[]) && (obj2 instanceof long[])) ? java.util.Arrays.equals((long[]) obj, (long[]) obj2) : ((obj instanceof short[]) && (obj2 instanceof short[])) ? java.util.Arrays.equals((short[]) obj, (short[]) obj2) : obj.equals(obj2);
    }

    public static boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
