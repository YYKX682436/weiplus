package zn3;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f474491a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & 255;
            int i19 = i17 * 2;
            char[] cArr2 = f474491a;
            cArr[i19] = cArr2[i18 >>> 4];
            cArr[i19 + 1] = cArr2[i18 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static byte[] b(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i17 = 0; i17 < length; i17 += 2) {
            bArr[i17 / 2] = (byte) ((java.lang.Character.digit(str.charAt(i17), 16) << 4) + java.lang.Character.digit(str.charAt(i17 + 1), 16));
        }
        return bArr;
    }
}
