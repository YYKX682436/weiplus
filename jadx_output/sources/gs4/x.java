package gs4;

/* loaded from: classes5.dex */
public abstract class x {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            try {
                bArr2 = "DFG#$%^#%$RGHR(&*M<><".getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException unused) {
                bArr2 = null;
            }
        }
        if (bArr2 != null && bArr2.length > 16) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(bArr2);
                bArr2 = messageDigest.digest();
            } catch (java.security.NoSuchAlgorithmException unused2) {
                bArr2 = null;
            }
        }
        if (bArr == null || bArr2 == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr.length % 4 == 0) {
            int i17 = 8;
            if (bArr.length >= 8) {
                int length = bArr.length >>> 2;
                int[] iArr = new int[length];
                b(bArr, iArr);
                int length2 = bArr2.length % 4 == 0 ? bArr2.length >>> 2 : (bArr2.length >>> 2) + 1;
                int i18 = length2 >= 4 ? length2 : 4;
                int[] iArr2 = new int[i18];
                int i19 = 0;
                for (int i27 = 0; i27 < i18; i27++) {
                    iArr2[i27] = 0;
                }
                b(bArr2, iArr2);
                int i28 = length - 1;
                int i29 = iArr[i28];
                int i37 = iArr[0];
                for (int i38 = ((52 / (i28 + 1)) + 6) * (-1640531527); i38 != 0; i38 -= -1640531527) {
                    int i39 = (i38 >>> 2) & 3;
                    int i47 = i28;
                    while (i47 > 0) {
                        int i48 = iArr[i47 - 1];
                        i37 = iArr[i47] - (((i37 ^ i38) + (i48 ^ iArr2[(i47 & 3) ^ i39])) ^ (((i48 >>> 5) ^ (i37 << 2)) + ((i37 >>> 3) ^ (i48 << 4))));
                        iArr[i47] = i37;
                        i47--;
                    }
                    int i49 = iArr[i28];
                    i37 = iArr[0] - (((i37 ^ i38) + (iArr2[i39 ^ (i47 & 3)] ^ i49)) ^ (((i49 >>> 5) ^ (i37 << 2)) + ((i37 >>> 3) ^ (i49 << 4))));
                    iArr[0] = i37;
                }
                int i57 = iArr[i28];
                if (i57 >= 0 && i57 <= (i28 << 2)) {
                    byte[] bArr3 = new byte[i57];
                    int i58 = i57 >> 2;
                    if (i58 > i28) {
                        i58 = i28;
                    }
                    int i59 = 0;
                    while (i19 < i58) {
                        int i66 = i59 + 1;
                        int i67 = iArr[i19];
                        bArr3[i59] = (byte) (i67 & 255);
                        int i68 = i66 + 1;
                        bArr3[i66] = (byte) ((i67 >>> 8) & 255);
                        int i69 = i68 + 1;
                        bArr3[i68] = (byte) ((i67 >>> 16) & 255);
                        i59 = i69 + 1;
                        bArr3[i69] = (byte) ((i67 >>> 24) & 255);
                        i19++;
                    }
                    if (i28 > i58 && i59 < i57) {
                        bArr3[i59] = (byte) (iArr[i19] & 255);
                        for (int i76 = i59 + 1; i17 <= 24 && i76 < i57; i76++) {
                            bArr3[i76] = (byte) ((iArr[i19] >>> i17) & 255);
                            i17 += 8;
                        }
                    }
                    return bArr3;
                }
            }
        }
        return null;
    }

    public static void b(byte[] bArr, int[] iArr) {
        int length = bArr.length >> 2;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int i19 = i18 + 1;
            int i27 = bArr[i18] & 255;
            iArr[i17] = i27;
            int i28 = i19 + 1;
            int i29 = i27 | ((bArr[i19] & 255) << 8);
            iArr[i17] = i29;
            int i37 = i28 + 1;
            int i38 = i29 | ((bArr[i28] & 255) << 16);
            iArr[i17] = i38;
            iArr[i17] = i38 | ((bArr[i37] & 255) << 24);
            i17++;
            i18 = i37 + 1;
        }
        if (i18 < bArr.length) {
            int i39 = i18 + 1;
            iArr[i17] = bArr[i18] & 255;
            int i47 = 8;
            while (i39 < bArr.length) {
                iArr[i17] = iArr[i17] | ((bArr[i39] & 255) << i47);
                i39++;
                i47 += 8;
            }
        }
    }
}
