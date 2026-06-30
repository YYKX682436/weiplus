package w95;

/* loaded from: classes11.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f444092a = "0123456789ABCDEF".toCharArray();

    public static java.lang.String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & 255;
            int i19 = i17 * 2;
            char[] cArr2 = f444092a;
            cArr[i19] = cArr2[i18 >>> 4];
            cArr[i19 + 1] = cArr2[i18 & 15];
        }
        return new java.lang.String(cArr);
    }
}
