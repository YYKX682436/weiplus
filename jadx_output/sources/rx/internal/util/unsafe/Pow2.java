package rx.internal.util.unsafe;

/* loaded from: classes14.dex */
public final class Pow2 {
    private Pow2() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i17) {
        return (i17 & (i17 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i17) {
        return 1 << (32 - java.lang.Integer.numberOfLeadingZeros(i17 - 1));
    }
}
