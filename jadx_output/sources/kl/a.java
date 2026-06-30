package kl;

/* loaded from: classes13.dex */
public abstract class a {
    public static short[] a(byte[] bArr, int i17) {
        int i18 = i17 / 2;
        short[] sArr = new short[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            int i27 = i19 * 2;
            sArr[i19] = (short) (((bArr[i27 + 1] & 255) << 8) | (bArr[i27] & 255));
        }
        return sArr;
    }

    public static byte[] b(short s17, boolean z17) {
        byte[] bArr = new byte[2];
        if (z17) {
            bArr[1] = (byte) (s17 & 255);
            bArr[0] = (byte) (((short) (s17 >> 8)) & 255);
        } else {
            bArr[0] = (byte) (s17 & 255);
            bArr[1] = (byte) (((short) (s17 >> 8)) & 255);
        }
        return bArr;
    }

    public static short c(byte b17, byte b18, boolean z17) {
        int i17;
        if (z17) {
            i17 = ((short) (((short) ((b17 & 255) | 0)) << 8)) | (b18 & 255);
        } else {
            i17 = (b17 & 255) | ((short) (((short) ((b18 & 255) | 0)) << 8));
        }
        return (short) i17;
    }

    public static byte[] d(short[] sArr) {
        byte[] bArr = new byte[sArr.length << 1];
        for (int i17 = 0; i17 < sArr.length; i17++) {
            int i18 = i17 * 2;
            short s17 = sArr[i17];
            bArr[i18] = (byte) (s17 & 255);
            bArr[i18 + 1] = (byte) ((s17 & 65280) >> 8);
        }
        return bArr;
    }
}
