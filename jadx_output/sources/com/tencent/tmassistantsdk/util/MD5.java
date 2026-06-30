package com.tencent.tmassistantsdk.util;

/* loaded from: classes7.dex */
public class MD5 {
    static final byte[] PADDING = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static final int S11 = 7;
    static final int S12 = 12;
    static final int S13 = 17;
    static final int S14 = 22;
    static final int S21 = 5;
    static final int S22 = 9;
    static final int S23 = 14;
    static final int S24 = 20;
    static final int S31 = 4;
    static final int S32 = 11;
    static final int S33 = 16;
    static final int S34 = 23;
    static final int S41 = 6;
    static final int S42 = 10;
    static final int S43 = 15;
    static final int S44 = 21;
    protected final long[] state = new long[4];
    protected final long[] count = new long[2];
    protected final byte[] buffer = new byte[64];
    protected final byte[] digest = new byte[16];

    public MD5() {
        md5Init();
    }

    private void Decode(long[] jArr, byte[] bArr, int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19 += 4) {
            jArr[i18] = b2iu(bArr[i19]) | (b2iu(bArr[i19 + 1]) << 8) | (b2iu(bArr[i19 + 2]) << 16) | (b2iu(bArr[i19 + 3]) << 24);
            i18++;
        }
    }

    private void Encode(byte[] bArr, long[] jArr, int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19 += 4) {
            long j17 = jArr[i18];
            bArr[i19] = (byte) (j17 & 255);
            bArr[i19 + 1] = (byte) ((j17 >>> 8) & 255);
            bArr[i19 + 2] = (byte) ((j17 >>> 16) & 255);
            bArr[i19 + 3] = (byte) ((j17 >>> 24) & 255);
            i18++;
        }
    }

    private long F(long j17, long j18, long j19) {
        return ((~j17) & j19) | (j18 & j17);
    }

    private long FF(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int F = (int) (F(j18, j19, j27) + j28 + j37 + j17);
        return ((F >>> ((int) (32 - j29))) | (F << ((int) j29))) + j18;
    }

    private long G(long j17, long j18, long j19) {
        return (j17 & j19) | (j18 & (~j19));
    }

    private long GG(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int G = (int) (G(j18, j19, j27) + j28 + j37 + j17);
        return ((G >>> ((int) (32 - j29))) | (G << ((int) j29))) + j18;
    }

    private long H(long j17, long j18, long j19) {
        return (j17 ^ j18) ^ j19;
    }

    private long HH(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int H = (int) (H(j18, j19, j27) + j28 + j37 + j17);
        return ((H >>> ((int) (32 - j29))) | (H << ((int) j29))) + j18;
    }

    private long I(long j17, long j18, long j19) {
        return (j17 | (~j19)) ^ j18;
    }

    private long II(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int I = (int) (I(j18, j19, j27) + j28 + j37 + j17);
        return ((I >>> ((int) (32 - j29))) | (I << ((int) j29))) + j18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b2iu(byte r2) {
        /*
            if (r2 >= 0) goto L4
            r2 = r2 & 255(0xff, float:3.57E-43)
        L4:
            long r0 = (long) r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.util.MD5.b2iu(byte):long");
    }

    public static java.lang.String byteHEX(byte b17) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return new java.lang.String(new char[]{cArr[(b17 >>> 4) & 15], cArr[b17 & 15]});
    }

    public static java.lang.String convertHashToString(byte[] bArr) {
        java.lang.String str = "";
        if (bArr == null) {
            return "";
        }
        for (byte b17 : bArr) {
            str = str + java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1);
        }
        return str.toUpperCase();
    }

    public static java.lang.String fileToMD5(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        try {
            inputStream = com.tencent.mm.vfs.w6.E(str);
            try {
                byte[] bArr = new byte[1024];
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                int i17 = 0;
                while (i17 != -1) {
                    i17 = inputStream.read(bArr);
                    if (i17 > 0) {
                        messageDigest.update(bArr, 0, i17);
                    }
                }
                java.lang.String convertHashToString = convertHashToString(messageDigest.digest());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception unused) {
                    }
                }
                return convertHashToString;
            } catch (java.lang.Exception unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
                return null;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception unused4) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception unused5) {
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            inputStream = null;
        }
    }

    private void md5Final() {
        byte[] bArr = new byte[8];
        Encode(bArr, this.count, 8);
        int i17 = ((int) (this.count[0] >>> 3)) & 63;
        md5Update(PADDING, i17 < 56 ? 56 - i17 : 120 - i17);
        md5Update(bArr, 8);
        Encode(this.digest, this.state, 16);
    }

    private void md5Init() {
        long[] jArr = this.count;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.state;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    private void md5Memcpy(byte[] bArr, byte[] bArr2, int i17, int i18, int i19) {
        for (int i27 = 0; i27 < i19; i27++) {
            bArr[i17 + i27] = bArr2[i18 + i27];
        }
    }

    private void md5Transform(byte[] bArr) {
        long[] jArr = this.state;
        long j17 = jArr[0];
        long j18 = jArr[1];
        long j19 = jArr[2];
        long j27 = jArr[3];
        long[] jArr2 = new long[16];
        Decode(jArr2, bArr, 64);
        long FF = FF(j17, j18, j19, j27, jArr2[0], 7L, 3614090360L);
        long FF2 = FF(j27, FF, j18, j19, jArr2[1], 12L, 3905402710L);
        long FF3 = FF(j19, FF2, FF, j18, jArr2[2], 17L, 606105819L);
        long FF4 = FF(j18, FF3, FF2, FF, jArr2[3], 22L, 3250441966L);
        long FF5 = FF(FF, FF4, FF3, FF2, jArr2[4], 7L, 4118548399L);
        long FF6 = FF(FF2, FF5, FF4, FF3, jArr2[5], 12L, 1200080426L);
        long FF7 = FF(FF3, FF6, FF5, FF4, jArr2[6], 17L, 2821735955L);
        long FF8 = FF(FF4, FF7, FF6, FF5, jArr2[7], 22L, 4249261313L);
        long FF9 = FF(FF5, FF8, FF7, FF6, jArr2[8], 7L, 1770035416L);
        long FF10 = FF(FF6, FF9, FF8, FF7, jArr2[9], 12L, 2336552879L);
        long FF11 = FF(FF7, FF10, FF9, FF8, jArr2[10], 17L, 4294925233L);
        long FF12 = FF(FF8, FF11, FF10, FF9, jArr2[11], 22L, 2304563134L);
        long FF13 = FF(FF9, FF12, FF11, FF10, jArr2[12], 7L, 1804603682L);
        long FF14 = FF(FF10, FF13, FF12, FF11, jArr2[13], 12L, 4254626195L);
        long FF15 = FF(FF11, FF14, FF13, FF12, jArr2[14], 17L, 2792965006L);
        long FF16 = FF(FF12, FF15, FF14, FF13, jArr2[15], 22L, 1236535329L);
        long GG = GG(FF13, FF16, FF15, FF14, jArr2[1], 5L, 4129170786L);
        long GG2 = GG(FF14, GG, FF16, FF15, jArr2[6], 9L, 3225465664L);
        long GG3 = GG(FF15, GG2, GG, FF16, jArr2[11], 14L, 643717713L);
        long GG4 = GG(FF16, GG3, GG2, GG, jArr2[0], 20L, 3921069994L);
        long GG5 = GG(GG, GG4, GG3, GG2, jArr2[5], 5L, 3593408605L);
        long GG6 = GG(GG2, GG5, GG4, GG3, jArr2[10], 9L, 38016083L);
        long GG7 = GG(GG3, GG6, GG5, GG4, jArr2[15], 14L, 3634488961L);
        long GG8 = GG(GG4, GG7, GG6, GG5, jArr2[4], 20L, 3889429448L);
        long GG9 = GG(GG5, GG8, GG7, GG6, jArr2[9], 5L, 568446438L);
        long GG10 = GG(GG6, GG9, GG8, GG7, jArr2[14], 9L, 3275163606L);
        long GG11 = GG(GG7, GG10, GG9, GG8, jArr2[3], 14L, 4107603335L);
        long GG12 = GG(GG8, GG11, GG10, GG9, jArr2[8], 20L, 1163531501L);
        long GG13 = GG(GG9, GG12, GG11, GG10, jArr2[13], 5L, 2850285829L);
        long GG14 = GG(GG10, GG13, GG12, GG11, jArr2[2], 9L, 4243563512L);
        long GG15 = GG(GG11, GG14, GG13, GG12, jArr2[7], 14L, 1735328473L);
        long GG16 = GG(GG12, GG15, GG14, GG13, jArr2[12], 20L, 2368359562L);
        long HH = HH(GG13, GG16, GG15, GG14, jArr2[5], 4L, 4294588738L);
        long HH2 = HH(GG14, HH, GG16, GG15, jArr2[8], 11L, 2272392833L);
        long HH3 = HH(GG15, HH2, HH, GG16, jArr2[11], 16L, 1839030562L);
        long HH4 = HH(GG16, HH3, HH2, HH, jArr2[14], 23L, 4259657740L);
        long HH5 = HH(HH, HH4, HH3, HH2, jArr2[1], 4L, 2763975236L);
        long HH6 = HH(HH2, HH5, HH4, HH3, jArr2[4], 11L, 1272893353L);
        long HH7 = HH(HH3, HH6, HH5, HH4, jArr2[7], 16L, 4139469664L);
        long HH8 = HH(HH4, HH7, HH6, HH5, jArr2[10], 23L, 3200236656L);
        long HH9 = HH(HH5, HH8, HH7, HH6, jArr2[13], 4L, 681279174L);
        long HH10 = HH(HH6, HH9, HH8, HH7, jArr2[0], 11L, 3936430074L);
        long HH11 = HH(HH7, HH10, HH9, HH8, jArr2[3], 16L, 3572445317L);
        long HH12 = HH(HH8, HH11, HH10, HH9, jArr2[6], 23L, 76029189L);
        long HH13 = HH(HH9, HH12, HH11, HH10, jArr2[9], 4L, 3654602809L);
        long HH14 = HH(HH10, HH13, HH12, HH11, jArr2[12], 11L, 3873151461L);
        long HH15 = HH(HH11, HH14, HH13, HH12, jArr2[15], 16L, 530742520L);
        long HH16 = HH(HH12, HH15, HH14, HH13, jArr2[2], 23L, 3299628645L);
        long II = II(HH13, HH16, HH15, HH14, jArr2[0], 6L, 4096336452L);
        long II2 = II(HH14, II, HH16, HH15, jArr2[7], 10L, 1126891415L);
        long II3 = II(HH15, II2, II, HH16, jArr2[14], 15L, 2878612391L);
        long II4 = II(HH16, II3, II2, II, jArr2[5], 21L, 4237533241L);
        long II5 = II(II, II4, II3, II2, jArr2[12], 6L, 1700485571L);
        long II6 = II(II2, II5, II4, II3, jArr2[3], 10L, 2399980690L);
        long II7 = II(II3, II6, II5, II4, jArr2[10], 15L, 4293915773L);
        long II8 = II(II4, II7, II6, II5, jArr2[1], 21L, 2240044497L);
        long II9 = II(II5, II8, II7, II6, jArr2[8], 6L, 1873313359L);
        long II10 = II(II6, II9, II8, II7, jArr2[15], 10L, 4264355552L);
        long II11 = II(II7, II10, II9, II8, jArr2[6], 15L, 2734768916L);
        long II12 = II(II8, II11, II10, II9, jArr2[13], 21L, 1309151649L);
        long II13 = II(II9, II12, II11, II10, jArr2[4], 6L, 4149444226L);
        long II14 = II(II10, II13, II12, II11, jArr2[11], 10L, 3174756917L);
        long II15 = II(II11, II14, II13, II12, jArr2[2], 15L, 718787259L);
        long II16 = II(II12, II15, II14, II13, jArr2[9], 21L, 3951481745L);
        long[] jArr3 = this.state;
        jArr3[0] = jArr3[0] + II13;
        jArr3[1] = jArr3[1] + II16;
        jArr3[2] = jArr3[2] + II15;
        jArr3[3] = jArr3[3] + II14;
    }

    private boolean md5Update(java.io.InputStream inputStream, long j17) {
        int i17;
        byte[] bArr = new byte[64];
        long[] jArr = this.count;
        long j18 = jArr[0];
        int i18 = ((int) (j18 >>> 3)) & 63;
        long j19 = j17 << 3;
        long j27 = j18 + j19;
        jArr[0] = j27;
        if (j27 < j19) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (j17 >>> 29);
        int i19 = 64 - i18;
        if (j17 >= i19) {
            byte[] bArr2 = new byte[i19];
            try {
                inputStream.read(bArr2, 0, i19);
                md5Memcpy(this.buffer, bArr2, i18, 0, i19);
                md5Transform(this.buffer);
                while (i19 + 63 < j17) {
                    try {
                        inputStream.read(bArr);
                        md5Transform(bArr);
                        i19 += 64;
                    } catch (java.lang.Exception unused) {
                        return false;
                    }
                }
                i17 = 0;
            } catch (java.lang.Exception unused2) {
                return false;
            }
        } else {
            i17 = i18;
            i19 = 0;
        }
        int i27 = (int) (j17 - i19);
        byte[] bArr3 = new byte[i27];
        try {
            inputStream.read(bArr3);
            md5Memcpy(this.buffer, bArr3, i17, 0, i27);
            return true;
        } catch (java.lang.Exception unused3) {
            return false;
        }
    }

    public static java.lang.String toMD5(java.lang.String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("ISO8859_1");
        } catch (java.io.UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] md52 = new com.tencent.tmassistantsdk.util.MD5().getMD5(bytes);
        java.lang.String str2 = "";
        for (int i17 = 0; i17 < 16; i17++) {
            str2 = str2 + byteHEX(md52[i17]);
        }
        return str2;
    }

    public byte[] getMD5(byte[] bArr) {
        md5Init();
        md5Update(new java.io.ByteArrayInputStream(bArr), bArr.length);
        md5Final();
        return this.digest;
    }

    private void md5Update(byte[] bArr, int i17) {
        int i18;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.count;
        long j17 = jArr[0];
        int i19 = ((int) (j17 >>> 3)) & 63;
        long j18 = i17 << 3;
        long j19 = j17 + j18;
        jArr[0] = j19;
        if (j19 < j18) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (i17 >>> 29);
        int i27 = 64 - i19;
        if (i17 >= i27) {
            md5Memcpy(this.buffer, bArr, i19, 0, i27);
            md5Transform(this.buffer);
            while (i27 + 63 < i17) {
                md5Memcpy(bArr2, bArr, 0, i27, 64);
                md5Transform(bArr2);
                i27 += 64;
            }
            i19 = 0;
            i18 = i27;
        } else {
            i18 = 0;
        }
        md5Memcpy(this.buffer, bArr, i19, i18, i17 - i18);
    }
}
