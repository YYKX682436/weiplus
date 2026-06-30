package j34;

/* loaded from: classes5.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
    
        if (r6 != 4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j34.d.a(java.lang.String, int):byte[]");
    }

    public static byte[] b(byte[] bArr, int i17) {
        int length = bArr.length;
        int i18 = 0;
        boolean z17 = (i17 & 1) == 0;
        boolean z18 = (i17 & 2) == 0;
        boolean z19 = (i17 & 4) != 0;
        byte[] bArr2 = (i17 & 8) == 0 ? j34.c.f297482a : j34.c.f297483b;
        int i19 = z18 ? 19 : -1;
        int i27 = (length / 3) * 4;
        if (!z17) {
            int i28 = length % 3;
            if (i28 == 1) {
                i27 += 2;
            } else if (i28 == 2) {
                i27 += 3;
            }
        } else if (length % 3 > 0) {
            i27 += 4;
        }
        if (z18 && length > 0) {
            i27 += (((length - 1) / 57) + 1) * (z19 ? 2 : 1);
        }
        byte[] bArr3 = new byte[i27];
        int i29 = length + 0;
        int i37 = i19;
        int i38 = 0;
        while (true) {
            int i39 = i18 + 3;
            if (i39 > i29) {
                break;
            }
            int i47 = (bArr[i18 + 2] & 255) | ((bArr[i18 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16);
            bArr3[i38] = bArr2[(i47 >> 18) & 63];
            bArr3[i38 + 1] = bArr2[(i47 >> 12) & 63];
            bArr3[i38 + 2] = bArr2[(i47 >> 6) & 63];
            bArr3[i38 + 3] = bArr2[i47 & 63];
            i38 += 4;
            i37--;
            if (i37 == 0) {
                if (z19) {
                    bArr3[i38] = 13;
                    i38++;
                }
                bArr3[i38] = 10;
                i38++;
                i37 = 19;
            }
            i18 = i39;
        }
        int i48 = i18 + 0;
        if (i48 == i29 - 1) {
            int i49 = (bArr[i18] & 255) << 4;
            int i57 = i38 + 1;
            bArr3[i38] = bArr2[(i49 >> 6) & 63];
            int i58 = i57 + 1;
            bArr3[i57] = bArr2[i49 & 63];
            if (z17) {
                int i59 = i58 + 1;
                bArr3[i58] = 61;
                i58 = i59 + 1;
                bArr3[i59] = 61;
            }
            if (z18) {
                if (z19) {
                    bArr3[i58] = 13;
                    i58++;
                }
                bArr3[i58] = 10;
            }
        } else if (i48 == i29 - 2) {
            int i66 = ((bArr[i18 + 1] & 255) << 2) | ((bArr[i18] & 255) << 10);
            int i67 = i38 + 1;
            bArr3[i38] = bArr2[(i66 >> 12) & 63];
            int i68 = i67 + 1;
            bArr3[i67] = bArr2[(i66 >> 6) & 63];
            int i69 = i68 + 1;
            bArr3[i68] = bArr2[i66 & 63];
            if (z17) {
                bArr3[i69] = 61;
                i69++;
            }
            if (z18) {
                if (z19) {
                    bArr3[i69] = 13;
                    i69++;
                }
                bArr3[i69] = 10;
            }
        } else if (z18 && i38 > 0 && i37 != 19) {
            if (z19) {
                bArr3[i38] = 13;
                i38++;
            }
            bArr3[i38] = 10;
        }
        return bArr3;
    }
}
