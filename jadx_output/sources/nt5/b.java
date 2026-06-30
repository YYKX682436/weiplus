package nt5;

/* loaded from: classes5.dex */
public abstract class b {
    public static byte[] a(java.lang.String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toUpperCase().toCharArray();
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i18 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i18])) << 4));
        }
        return bArr;
    }
}
