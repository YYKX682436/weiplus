package xg3;

/* loaded from: classes11.dex */
public abstract class b {
    public static long a(long j17, int i17, long j18) {
        if (j18 == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j18 = java.lang.System.currentTimeMillis();
        }
        switch (i17) {
            case 2:
                return c(j17, j18) | 4611686018427387904L;
            case 3:
                return c(j17, j18) & (-4611686018427387905L);
            case 4:
                return c(j17, j18) & 4611686018427387904L;
            case 5:
                return c(j17, j18) | 1152921504606846976L;
            case 6:
                return c(j17, j18) & (-1152921504606846977L);
            case 7:
                return c(j17, j18) & 1152921504606846976L;
            default:
                return c(j17, j18);
        }
    }

    public static long b(com.tencent.mm.storage.l4 l4Var, int i17, long j17) {
        if (l4Var == null) {
            return 0L;
        }
        return a(l4Var.G0(), i17, j17);
    }

    public static long c(long j17, long j18) {
        return (j17 & (-72057594037927936L)) | (j18 & 72057594037927935L);
    }
}
