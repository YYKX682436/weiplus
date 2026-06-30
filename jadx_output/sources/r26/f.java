package r26;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f368878a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f368879b;

    static {
        int[] iArr = new int[256];
        int i17 = 0;
        for (int i18 = 0; i18 < 256; i18++) {
            iArr[i18] = "0123456789abcdef".charAt(i18 & 15) | ("0123456789abcdef".charAt(i18 >> 4) << '\b');
        }
        f368878a = iArr;
        int[] iArr2 = new int[256];
        for (int i19 = 0; i19 < 256; i19++) {
            iArr2[i19] = "0123456789ABCDEF".charAt(i19 & 15) | ("0123456789ABCDEF".charAt(i19 >> 4) << '\b');
        }
        f368879b = iArr2;
        int[] iArr3 = new int[256];
        for (int i27 = 0; i27 < 256; i27++) {
            iArr3[i27] = -1;
        }
        int i28 = 0;
        int i29 = 0;
        while (i28 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i28)] = i29;
            i28++;
            i29++;
        }
        int i37 = 0;
        int i38 = 0;
        while (i37 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i37)] = i38;
            i37++;
            i38++;
        }
        long[] jArr = new long[256];
        for (int i39 = 0; i39 < 256; i39++) {
            jArr[i39] = -1;
        }
        int i47 = 0;
        int i48 = 0;
        while (i47 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i47)] = i48;
            i47++;
            i48++;
        }
        int i49 = 0;
        while (i17 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i17)] = i49;
            i17++;
            i49++;
        }
    }

    public static final int a(long j17) {
        boolean z17 = false;
        if (0 <= j17 && j17 <= 2147483647L) {
            z17 = true;
        }
        if (z17) {
            return (int) j17;
        }
        throw new java.lang.IllegalArgumentException("The resulting string length is too big: " + ((java.lang.Object) jz5.x.a(j17)));
    }

    public static final int b(byte[] bArr, int i17, int[] iArr, char[] cArr, int i18) {
        int i19 = iArr[bArr[i17] & 255];
        cArr[i18] = (char) (i19 >> 8);
        cArr[i18 + 1] = (char) (i19 & 255);
        return i18 + 2;
    }

    public static final int c(java.lang.String str, char[] cArr, int i17) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i17);
            } else {
                cArr[i17] = str.charAt(0);
            }
        }
        return i17 + str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(byte[] r20, r26.i r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r26.f.d(byte[], r26.i, int, java.lang.Object):java.lang.String");
    }
}
