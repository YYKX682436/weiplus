package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f189558a = {48, -126, 1, 75, 48, -126, 1, 3, 6, 7, 42, -122, 72, -50, 61, 2, 1, 48, -127, -9, 2, 1, 1, 48, 44, 6, 7, 42, -122, 72, -50, 61, 1, 1, 2, 33, 0, -1, -1, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 91, 4, 32, -1, -1, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -4, 4, 32, 90, -58, 53, -40, -86, 58, -109, -25, -77, -21, -67, 85, 118, -104, -122, -68, 101, 29, 6, -80, -52, 83, -80, -10, 59, -50, 60, 62, 39, -46, 96, 75, 3, 21, 0, -60, -99, 54, 8, -122, -25, 4, -109, 106, 102, 120, -31, 19, -99, 38, -73, -127, -97, 126, -112, 4, 65, 4, 107, 23, -47, -14, -31, 44, 66, 71, -8, -68, -26, -27, 99, -92, 64, -14, 119, 3, 125, -127, 45, -21, 51, -96, -12, -95, 57, 69, -40, -104, -62, -106, 79, -29, 66, -30, -2, 26, Byte.MAX_VALUE, -101, -114, -25, -21, 74, 124, 15, -98, 22, 43, -50, 51, 87, 107, 49, 94, -50, -53, -74, 64, 104, 55, -65, 81, -11, 2, 33, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -68, -26, -6, -83, -89, 23, -98, -124, -13, -71, -54, -62, -4, 99, 37, 81, 2, 1, 1, 3, 66, 0, 4, 52, 4, -14, 45, -10, -68, -118, -59, 62, 64, -101, 93, 6, -54, -27, 79, 94, 126, -9, -80, -61, -63, -38, 115, -53, 70, -63, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, -20, -32, -80, -80, 38, 102, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 27, 28, 61, -60, -33, 65, 93, -25, 30, 83, 66, -24, 28, 39, 24, 69, -104, 55, -63, 108, 5, 56, -63, -4, -5, 88, -49, -126, 85};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f189559b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f189560c;

    static {
        lp0.b.D();
        lp0.b.h();
        f189559b = lp0.b.e() + "CheckResUpdate/";
        int[] iArr = new int[34];
        iArr[0] = 27;
        iArr[1] = 187;
        iArr[2] = 35;
        iArr[3] = 29;
        iArr[4] = 38;
        iArr[5] = 40;
        iArr[6] = 33;
        iArr[7] = 37;
        iArr[8] = 39;
        iArr[9] = 49;
        iArr[10] = 46;
        iArr[11] = 47;
        iArr[12] = 56;
        iArr[13] = 59;
        iArr[14] = 62;
        iArr[15] = 66;
        iArr[16] = 55;
        iArr[17] = 63;
        iArr[18] = 73;
        iArr[19] = 79;
        iArr[20] = 58;
        iArr[21] = 104;
        iArr[22] = 200;
        iArr[23] = 216;
        iArr[24] = 85;
        iArr[25] = 87;
        iArr[26] = 86;
        iArr[27] = 89;
        iArr[28] = 97;
        iArr[29] = 96;
        iArr[30] = 95;
        iArr[31] = 145;
        iArr[32] = com.tencent.mm.sdk.platformtools.z.f193115k ? 109 : 108;
        iArr[33] = 70;
        f189560c = iArr;
    }

    public static boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.String b17 = b(str);
        return o35.a.a(b17 + ".decrypted") & o35.a.a(b17) & true & o35.a.a(b17 + ".decompressed");
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String str2 = f189559b;
        com.tencent.mm.vfs.w6.u(str2);
        return str2 + str;
    }

    public static java.lang.String c(int i17, int i18) {
        return java.lang.String.format(java.util.Locale.US, "%d.%d.data", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
