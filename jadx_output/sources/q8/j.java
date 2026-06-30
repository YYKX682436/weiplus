package q8;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f360626h = {com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG_L1, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG_L2, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f360627i = {44100, 48000, 32000};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f360628j = {32, 64, 96, 128, 160, 192, 224, 256, 288, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, 384, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, com.tencent.wcdb.FileUtils.S_IRWXU};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f360629k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f360630l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e, 384};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f360631m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f360632n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a, reason: collision with root package name */
    public int f360633a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f360634b;

    /* renamed from: c, reason: collision with root package name */
    public int f360635c;

    /* renamed from: d, reason: collision with root package name */
    public int f360636d;

    /* renamed from: e, reason: collision with root package name */
    public int f360637e;

    /* renamed from: f, reason: collision with root package name */
    public int f360638f;

    /* renamed from: g, reason: collision with root package name */
    public int f360639g;

    public static int a(int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        if ((i17 & (-2097152)) != -2097152 || (i18 = (i17 >>> 19) & 3) == 1 || (i19 = (i17 >>> 17) & 3) == 0 || (i27 = (i17 >>> 12) & 15) == 0 || i27 == 15 || (i28 = (i17 >>> 10) & 3) == 3) {
            return -1;
        }
        int i29 = f360627i[i28];
        if (i18 == 2) {
            i29 /= 2;
        } else if (i18 == 0) {
            i29 /= 4;
        }
        int i37 = (i17 >>> 9) & 1;
        if (i19 == 3) {
            return ((((i18 == 3 ? f360628j[i27 - 1] : f360629k[i27 - 1]) * 12000) / i29) + i37) * 4;
        }
        int i38 = i18 == 3 ? i19 == 2 ? f360630l[i27 - 1] : f360631m[i27 - 1] : f360632n[i27 - 1];
        if (i18 == 3) {
            return ((i38 * 144000) / i29) + i37;
        }
        return (((i19 == 1 ? 72000 : 144000) * i38) / i29) + i37;
    }

    public static boolean b(int i17, q8.j jVar) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        if ((i17 & (-2097152)) != -2097152 || (i18 = (i17 >>> 19) & 3) == 1 || (i19 = (i17 >>> 17) & 3) == 0 || (i27 = (i17 >>> 12) & 15) == 0 || i27 == 15 || (i28 = (i17 >>> 10) & 3) == 3) {
            return false;
        }
        int i47 = f360627i[i28];
        if (i18 == 2) {
            i47 /= 2;
        } else if (i18 == 0) {
            i47 /= 4;
        }
        int i48 = (i17 >>> 9) & 1;
        if (i19 == 3) {
            i29 = i18 == 3 ? f360628j[i27 - 1] : f360629k[i27 - 1];
            i38 = (((i29 * 12000) / i47) + i48) * 4;
            i39 = 384;
        } else {
            int i49 = dc1.e.CTRL_INDEX;
            if (i18 == 3) {
                i29 = i19 == 2 ? f360630l[i27 - 1] : f360631m[i27 - 1];
                i37 = (144000 * i29) / i47;
            } else {
                i29 = f360632n[i27 - 1];
                if (i19 == 1) {
                    i49 = 576;
                }
                i37 = ((i19 == 1 ? 72000 : 144000) * i29) / i47;
            }
            i38 = i37 + i48;
            i39 = i49;
        }
        java.lang.String str = f360626h[3 - i19];
        int i57 = ((i17 >> 6) & 3) == 3 ? 1 : 2;
        jVar.f360633a = i18;
        jVar.f360634b = str;
        jVar.f360635c = i38;
        jVar.f360636d = i47;
        jVar.f360637e = i57;
        jVar.f360638f = i29 * 1000;
        jVar.f360639g = i39;
        return true;
    }
}
