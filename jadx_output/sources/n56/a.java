package n56;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f335165a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f335166b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f335165a = charArray;
        int[] iArr = new int[256];
        f335166b = iArr;
        java.util.Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i17 = 0; i17 < length; i17++) {
            f335166b[f335165a[i17]] = i17;
        }
        f335166b[61] = 0;
    }

    public static final byte[] a(java.lang.String str) {
        int[] iArr;
        int length = str != null ? str.length() : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            iArr = f335166b;
            if (i17 >= length) {
                break;
            }
            if (iArr[str.charAt(i17)] < 0) {
                i18++;
            }
            i17++;
        }
        int i19 = length - i18;
        if (i19 % 4 != 0) {
            return null;
        }
        int i27 = 0;
        while (length > 1) {
            length--;
            if (iArr[str.charAt(length)] > 0) {
                break;
            }
            if (str.charAt(length) == '=') {
                i27++;
            }
        }
        int i28 = ((i19 * 6) >> 3) - i27;
        byte[] bArr = new byte[i28];
        int i29 = 0;
        int i37 = 0;
        while (i37 < i28) {
            int i38 = 0;
            int i39 = 0;
            while (i38 < 4) {
                int i47 = i29 + 1;
                int i48 = iArr[str.charAt(i29)];
                if (i48 >= 0) {
                    i39 |= i48 << (18 - (i38 * 6));
                } else {
                    i38--;
                }
                i38++;
                i29 = i47;
            }
            int i49 = i37 + 1;
            bArr[i37] = (byte) (i39 >> 16);
            if (i49 < i28) {
                i37 = i49 + 1;
                bArr[i49] = (byte) (i39 >> 8);
                if (i37 < i28) {
                    i49 = i37 + 1;
                    bArr[i37] = (byte) i39;
                }
            }
            i37 = i49;
        }
        return bArr;
    }

    public static final char[] b(byte[] bArr, boolean z17) {
        char[] cArr;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i17 = (length / 3) * 3;
        int i18 = length - 1;
        int i19 = ((i18 / 3) + 1) << 2;
        int i27 = i19 + (z17 ? ((i19 - 1) / 76) << 1 : 0);
        char[] cArr2 = new char[i27];
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (true) {
            cArr = f335165a;
            if (i28 >= i17) {
                break;
            }
            int i38 = i28 + 1;
            int i39 = i38 + 1;
            int i47 = ((bArr[i28] & 255) << 16) | ((bArr[i38] & 255) << 8);
            int i48 = i39 + 1;
            int i49 = i47 | (bArr[i39] & 255);
            int i57 = i29 + 1;
            cArr2[i29] = cArr[(i49 >>> 18) & 63];
            int i58 = i57 + 1;
            cArr2[i57] = cArr[(i49 >>> 12) & 63];
            int i59 = i58 + 1;
            cArr2[i58] = cArr[(i49 >>> 6) & 63];
            i29 = i59 + 1;
            cArr2[i59] = cArr[i49 & 63];
            if (z17 && (i37 = i37 + 1) == 19 && i29 < i27 - 2) {
                int i66 = i29 + 1;
                cArr2[i29] = '\r';
                i29 = i66 + 1;
                cArr2[i66] = '\n';
                i37 = 0;
            }
            i28 = i48;
        }
        int i67 = length - i17;
        if (i67 > 0) {
            int i68 = ((bArr[i17] & 255) << 10) | (i67 == 2 ? (bArr[i18] & 255) << 2 : 0);
            cArr2[i27 - 4] = cArr[i68 >> 12];
            cArr2[i27 - 3] = cArr[(i68 >>> 6) & 63];
            cArr2[i27 - 2] = i67 == 2 ? cArr[i68 & 63] : '=';
            cArr2[i27 - 1] = '=';
        }
        return cArr2;
    }
}
