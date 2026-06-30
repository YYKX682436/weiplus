package x36;

/* loaded from: classes14.dex */
public abstract class b {
    public static final boolean a(byte[] a17, int i17, byte[] b17, int i18, int i19) {
        kotlin.jvm.internal.o.g(a17, "a");
        kotlin.jvm.internal.o.g(b17, "b");
        for (int i27 = 0; i27 < i19; i27++) {
            if (a17[i27 + i17] != b17[i27 + i18]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j17, long j18, long j19) {
        if ((j18 | j19) < 0 || j18 > j17 || j17 - j18 < j19) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + j17 + " offset=" + j18 + " byteCount=" + j19);
        }
    }
}
