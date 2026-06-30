package com.tencent.mm.plugin.sight.base;

/* loaded from: classes10.dex */
public class AdaptiveAdjustBitrate {

    /* renamed from: t, reason: collision with root package name */
    public static volatile boolean f162361t;

    /* renamed from: a, reason: collision with root package name */
    public int f162362a;

    /* renamed from: b, reason: collision with root package name */
    public int f162363b;

    /* renamed from: c, reason: collision with root package name */
    public int f162364c;

    /* renamed from: d, reason: collision with root package name */
    public int f162365d;

    /* renamed from: e, reason: collision with root package name */
    public int f162366e;

    /* renamed from: f, reason: collision with root package name */
    public int f162367f;

    /* renamed from: g, reason: collision with root package name */
    public int f162368g;

    /* renamed from: h, reason: collision with root package name */
    public int f162369h;

    /* renamed from: i, reason: collision with root package name */
    public float f162370i;

    /* renamed from: j, reason: collision with root package name */
    public float f162371j;

    /* renamed from: k, reason: collision with root package name */
    public int f162372k;

    /* renamed from: l, reason: collision with root package name */
    public int f162373l;

    /* renamed from: m, reason: collision with root package name */
    public int f162374m;

    /* renamed from: n, reason: collision with root package name */
    public int f162375n;

    /* renamed from: o, reason: collision with root package name */
    public int f162376o;

    /* renamed from: p, reason: collision with root package name */
    public int f162377p;

    /* renamed from: q, reason: collision with root package name */
    public int f162378q;

    /* renamed from: r, reason: collision with root package name */
    public int f162379r;

    /* renamed from: s, reason: collision with root package name */
    public int f162380s;

    private static native float GetAuQaLevel(java.lang.String str, float f17, float f18, int i17, boolean z17, boolean z18);

    private static native com.tencent.mm.plugin.sight.base.ABAPrams GetBitrate(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37, int i38, int i39, int i47, boolean z17);

    public static float a(java.lang.String str, float f17, float f18, int i17, boolean z17, boolean z18) {
        g();
        return GetAuQaLevel(kk.w.a(str, false), f17, f18, i17, z17, z18);
    }

    public static com.tencent.mm.plugin.sight.base.ABAPrams b(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37, int i38, int i39, int i47, boolean z17, com.tencent.mm.plugin.sight.base.a aVar) {
        g();
        com.tencent.mm.plugin.sight.base.ABAPrams GetBitrate = GetBitrate(kk.w.a(str, false), i17, i18, i19, i27, f17, f18, i28, f19, f27, i29, i37, i38, i39, i47, z17);
        if (GetBitrate == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get null result from GetBitrateVFS: ");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("AdaptiveAdjustBitrate", sb6.toString());
            return null;
        }
        if (aVar.f162381a) {
            GetBitrate.outputHeight = ((GetBitrate.outputHeight + 8) >> 4) << 4;
            GetBitrate.outputWidth = ((GetBitrate.outputWidth + 8) >> 4) << 4;
            java.lang.String str2 = "size[" + GetBitrate.outputWidth + "x" + GetBitrate.outputHeight + "]";
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("modified GetBitrateVFS align 16, size:");
            sb7.append(str2);
            sb7.append(" Scene:");
            sb7.append(i28);
            sb7.append(" stack: ");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("AdaptiveAdjustBitrate", sb7.toString());
        } else {
            java.lang.String str3 = "size[" + GetBitrate.outputWidth + "x" + GetBitrate.outputHeight + "]";
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("modified GetBitrateVFS abort, size:");
            sb8.append(str3);
            sb8.append(" Scene:");
            sb8.append(i28);
            sb8.append(" stack: ");
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb8.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("AdaptiveAdjustBitrate", sb8.toString());
        }
        return GetBitrate;
    }

    public static int d(int i17, int i18, int i19, int i27, float f17) {
        g();
        return getOrignalImageQuality(i17, i18, i19, i27, f17);
    }

    public static int e(int i17, int i18, int i19, int i27, float f17) {
        g();
        return getVideoImageQuality(i17, i18, i19, i27, f17);
    }

    public static com.tencent.mm.plugin.sight.base.ABAPrams f(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37) {
        g();
        return getVideoQuality(kk.w.a(str, false), i17, i18, i19, i27, f17, f18, i28, f19, f27, i29, i37);
    }

    public static void g() {
        if (f162361t) {
            return;
        }
        if (!com.tencent.mm.plugin.sight.base.i.f162416a) {
            fp.d0.o("xffmpeg");
            com.tencent.mm.plugin.sight.base.i.f162416a = true;
        }
        com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.class.getClassLoader();
        fp.d0.n("adaptivebrres");
        f162361t = true;
    }

    private static native int getOrignalImageQuality(int i17, int i18, int i19, int i27, float f17);

    private static native int getVideoImageQuality(int i17, int i18, int i19, int i27, float f17);

    private static native com.tencent.mm.plugin.sight.base.ABAPrams getVideoQuality(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37);

    public static int h(java.lang.String str, float f17, float f18, float f19, float f27, float f28) {
        g();
        return useAlgorithmCheckNonBlackFrameTimeStamp(kk.w.a(str, false), f17, f18, f19, f27, f28);
    }

    private static native int useAlgorithmCheckNonBlackFrameTimeStamp(java.lang.String str, float f17, float f18, float f19, float f27, float f28);

    public void c() {
        this.f162368g = 0;
        this.f162369h = 0;
        this.f162370i = 0.0f;
        this.f162371j = 0.0f;
        this.f162372k = 0;
        this.f162373l = 0;
        this.f162374m = 0;
        this.f162375n = 0;
        this.f162376o = 0;
        this.f162377p = 0;
        this.f162378q = 0;
        this.f162379r = 0;
        this.f162367f = 0;
    }

    public java.lang.String toString() {
        return "[ sourceVideoPath null targetHeight " + this.f162362a + " targetWidth " + this.f162363b + " targetvideoBitrate " + this.f162364c + " reMuxStartTimeMs " + this.f162365d + " reMuxEndTimeMs " + this.f162366e + " remuxScene " + this.f162367f + " abaSwitch " + this.f162368g + " qpSwitch " + this.f162369h + " swHEVCRatio " + this.f162370i + " hwHEVCRatio " + this.f162371j + " ceilingVideoBR " + this.f162372k + " flooringVideoBR " + this.f162373l + " isEnableHEVC " + this.f162374m + " abaPreset " + this.f162375n + " minQP " + this.f162377p + " maxQP " + this.f162378q + " takePhotosVideoBR " + this.f162379r + " remuxScene " + this.f162367f + "]";
    }
}
