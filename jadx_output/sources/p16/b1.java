package p16;

/* loaded from: classes14.dex */
public abstract class b1 {
    public static int a(byte[] bArr, int i17, int i18) {
        byte b17 = bArr[i17 - 1];
        int i19 = i18 - i17;
        if (i19 == 0) {
            if (b17 > -12) {
                return -1;
            }
            return b17;
        }
        if (i19 == 1) {
            byte b18 = bArr[i17];
            if (b17 > -12 || b18 > -65) {
                return -1;
            }
            return b17 ^ (b18 << 8);
        }
        if (i19 != 2) {
            throw new java.lang.AssertionError();
        }
        byte b19 = bArr[i17];
        byte b27 = bArr[i17 + 1];
        if (b17 > -12 || b19 > -65 || b27 > -65) {
            return -1;
        }
        return ((b19 << 8) ^ b17) ^ (b27 << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2);
    }

    public static int b(byte[] bArr, int i17, int i18) {
        while (i17 < i18 && bArr[i17] >= 0) {
            i17++;
        }
        if (i17 >= i18) {
            return 0;
        }
        while (i17 < i18) {
            int i19 = i17 + 1;
            byte b17 = bArr[i17];
            if (b17 < 0) {
                if (b17 < -32) {
                    if (i19 >= i18) {
                        return b17;
                    }
                    if (b17 >= -62) {
                        i17 = i19 + 1;
                        if (bArr[i19] > -65) {
                        }
                    }
                    return -1;
                }
                if (b17 < -16) {
                    if (i19 >= i18 - 1) {
                        return a(bArr, i19, i18);
                    }
                    int i27 = i19 + 1;
                    byte b18 = bArr[i19];
                    if (b18 <= -65 && ((b17 != -32 || b18 >= -96) && (b17 != -19 || b18 < -96))) {
                        i17 = i27 + 1;
                        if (bArr[i27] > -65) {
                        }
                    }
                } else {
                    if (i19 >= i18 - 2) {
                        return a(bArr, i19, i18);
                    }
                    int i28 = i19 + 1;
                    byte b19 = bArr[i19];
                    if (b19 <= -65 && (((b17 << 28) + (b19 + 112)) >> 30) == 0) {
                        int i29 = i28 + 1;
                        if (bArr[i28] <= -65) {
                            i19 = i29 + 1;
                            if (bArr[i29] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i17 = i19;
        }
        return 0;
    }
}
