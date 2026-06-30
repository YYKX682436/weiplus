package kk;

/* loaded from: classes12.dex */
public abstract class p {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[256];
        for (int i17 = 0; i17 < 256; i17++) {
            bArr3[i17] = (byte) i17;
        }
        if (bArr2 == null || bArr2.length == 0) {
            bArr3 = null;
        } else {
            int i18 = 0;
            int i19 = 0;
            for (int i27 = 0; i27 < 256; i27++) {
                int i28 = bArr2[i18] & 255;
                byte b17 = bArr3[i27];
                i19 = (i28 + (b17 & 255) + i19) & 255;
                bArr3[i27] = bArr3[i19];
                bArr3[i19] = b17;
                i18 = (i18 + 1) % bArr2.length;
            }
        }
        byte[] bArr4 = new byte[bArr.length];
        int i29 = 0;
        int i37 = 0;
        for (int i38 = 0; i38 < bArr.length; i38++) {
            i29 = (i29 + 1) & 255;
            byte b18 = bArr3[i29];
            i37 = ((b18 & 255) + i37) & 255;
            bArr3[i29] = bArr3[i37];
            bArr3[i37] = b18;
            bArr4[i38] = (byte) (bArr3[((bArr3[i29] & 255) + (b18 & 255)) & 255] ^ bArr[i38]);
        }
        return bArr4;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return a(bArr, bArr2);
    }
}
