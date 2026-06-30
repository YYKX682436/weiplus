package cz0;

/* loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static long a(byte[] bArr, int i17) {
        int i18 = i17 + 7;
        char c17 = bArr[i18];
        long j17 = c17 & 127;
        boolean z17 = (c17 & 128) != 0;
        for (int i19 = 6; i19 >= 0; i19--) {
            long j18 = j17 * 256;
            i18--;
            int i27 = bArr[i18];
            if (i27 < 0) {
                i27 += 256;
            }
            j17 = j18 + ((short) i27);
        }
        return z17 ? -j17 : j17;
    }

    public static java.io.InputStream b(byte[] bArr, long j17, long j18) {
        if (j18 == -1) {
            j18 = bArr.length - j17;
        }
        return new c46.b(new java.io.ByteArrayInputStream(bArr, (int) j17, (int) j18), false);
    }

    public static final boolean c(java.io.InputStream inputStream, byte[] bArr, int i17, int i18) {
        int i19 = 0;
        while (i19 < i18) {
            int read = inputStream.read(bArr, i17 + i19, i18 - i19);
            if (read < 0) {
                return false;
            }
            i19 += read;
        }
        return true;
    }
}
