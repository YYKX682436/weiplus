package r46;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f392506a = new byte[4096];

    public static int a(java.io.InputStream inputStream, byte[] bArr, int i17, int i18) {
        int i19;
        if (i18 < 0 || i17 < 0 || (i19 = i18 + i17) > bArr.length || i19 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i27 = 0;
        while (i27 != i18) {
            int read = inputStream.read(bArr, i17 + i27, i18 - i27);
            if (read == -1) {
                break;
            }
            i27 += read;
        }
        return i27;
    }

    public static long b(java.io.InputStream inputStream, long j17) {
        int a17;
        long j18 = j17;
        while (j18 > 0) {
            long skip = inputStream.skip(j18);
            if (skip == 0) {
                break;
            }
            j18 -= skip;
        }
        while (j18 > 0 && (a17 = a(inputStream, f392506a, 0, (int) java.lang.Math.min(j18, 4096L))) >= 1) {
            j18 -= a17;
        }
        return j17 - j18;
    }
}
