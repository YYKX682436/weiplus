package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class u {
    public static final java.lang.String[] A;

    /* renamed from: z, reason: collision with root package name */
    public static int f149801z;

    /* renamed from: a, reason: collision with root package name */
    public int f149802a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f149803b;

    /* renamed from: c, reason: collision with root package name */
    public wo.i1 f149804c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaFormat f149805d;

    /* renamed from: e, reason: collision with root package name */
    public int f149806e;

    /* renamed from: f, reason: collision with root package name */
    public int f149807f;

    /* renamed from: g, reason: collision with root package name */
    public int f149808g;

    /* renamed from: h, reason: collision with root package name */
    public int f149809h;

    /* renamed from: i, reason: collision with root package name */
    public final int f149810i;

    /* renamed from: n, reason: collision with root package name */
    public int f149815n;

    /* renamed from: o, reason: collision with root package name */
    public int f149816o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f149817p;

    /* renamed from: q, reason: collision with root package name */
    public long f149818q;

    /* renamed from: r, reason: collision with root package name */
    public long f149819r;

    /* renamed from: t, reason: collision with root package name */
    public int f149821t;

    /* renamed from: u, reason: collision with root package name */
    public int f149822u;

    /* renamed from: v, reason: collision with root package name */
    public int f149823v;

    /* renamed from: w, reason: collision with root package name */
    public int f149824w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ilinkservice.a f149825x;

    /* renamed from: j, reason: collision with root package name */
    public int f149811j = -2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f149812k = false;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f149813l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f149814m = false;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.x f149820s = null;

    /* renamed from: y, reason: collision with root package name */
    public int f149826y = 0;

    static {
        android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        A = new java.lang.String[]{"OMX.qcom.", "OMX.Exynos.", "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};
    }

    public u(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        this.f149803b = "hevc";
        this.f149810i = 1;
        this.f149825x = null;
        this.f149806e = i17;
        this.f149807f = i18;
        this.f149815n = i17;
        this.f149816o = i18;
        this.f149803b = str;
        this.f149808g = i19;
        this.f149809h = i27;
        this.f149810i = i28;
        f149801z = 0;
        this.f149818q = 0L;
        this.f149825x = new com.tencent.mm.plugin.multitalk.ilinkservice.a();
        this.f149804c = null;
        this.f149822u = 8;
        this.f149821t = 0;
        this.f149823v = 0;
        this.f149802a = 0;
        this.f149817p = null;
        this.f149824w = 0;
        this.f149819r = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int a() {
        java.lang.String str;
        android.media.MediaCodecInfo mediaCodecInfo;
        boolean z17;
        boolean z18;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i17;
        boolean z19;
        if (this.f149804c != null) {
            b();
        }
        int codecCount = android.media.MediaCodecList.getCodecCount();
        int i18 = 0;
        loop0: while (true) {
            str = this.f149803b;
            if (i18 >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i18);
            if (mediaCodecInfo.isEncoder()) {
                for (java.lang.String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        mediaCodecInfo.getName();
                        break loop0;
                    }
                }
            }
            i18++;
        }
        if (mediaCodecInfo == null) {
            com.tencent.mars.xlog.Log.e("ILink[HWEnc]", "steve: Unable to find an appropriate codec for " + str);
            this.f149802a = 2001;
            return -2001;
        }
        com.tencent.mars.xlog.Log.i("ILink[HWEnc]", "steve: found HW codec: " + mediaCodecInfo.getName());
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, this.f149806e, this.f149807f);
        this.f149805d = createVideoFormat;
        createVideoFormat.setInteger("color-format", 21);
        this.f149805d.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f149809h * 1000);
        this.f149805d.setInteger("frame-rate", this.f149808g);
        int i19 = 1;
        this.f149805d.setInteger("i-frame-interval", 1);
        java.lang.String string = this.f149805d.getString("mime");
        this.f149821t = 1;
        if (str.equalsIgnoreCase("video/avc")) {
            java.lang.String name = mediaCodecInfo.getName();
            java.lang.String[] strArr = A;
            int length = strArr.length;
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    z17 = false;
                    break;
                }
                if (name.startsWith(strArr[i27])) {
                    z17 = true;
                    break;
                }
                i27++;
            }
            if (z17 && fp.h.c(23)) {
                int i28 = this.f149810i;
                boolean z27 = i28 > 0 && (i28 & 1) != 0;
                boolean z28 = i28 > 0 && (i28 & 4) != 0;
                int i29 = 8;
                if (8 <= this.f149822u) {
                    java.lang.String name2 = mediaCodecInfo.getName();
                    z18 = false;
                    for (java.lang.String str3 : strArr) {
                        if (name2.startsWith(str3)) {
                            try {
                                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(string).profileLevels) {
                                    if (codecProfileLevel.profile == 8) {
                                        z18 = true;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    }
                } else {
                    z18 = false;
                }
                if (z28 && z18) {
                    this.f149805d.setInteger(com.google.android.gms.common.Scopes.PROFILE, 8);
                    this.f149805d.setInteger(ya.b.LEVEL, 256);
                } else if (z27) {
                    this.f149805d.setInteger(com.google.android.gms.common.Scopes.PROFILE, 1);
                    this.f149805d.setInteger(ya.b.LEVEL, 256);
                } else {
                    int i37 = this.f149822u;
                    if (fp.h.c(23)) {
                        try {
                            capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("ILink[HWEnc]", "trySetProfile error: " + e17.getMessage());
                        }
                        if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new android.media.MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.level = 0;
                            codecProfileLevel2.profile = 0;
                            int length2 = codecProfileLevelArr.length;
                            int i38 = 0;
                            while (i38 < length2) {
                                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = codecProfileLevelArr[i38];
                                int i39 = codecProfileLevel3.profile;
                                int i47 = codecProfileLevel3.level;
                                if (((i39 == i19 || i39 == 2 || i39 == i29) ? i19 : 0) != 0) {
                                    if (i39 >= codecProfileLevel2.profile && i47 >= codecProfileLevel2.level && i39 <= i37) {
                                        codecProfileLevel2.profile = i39;
                                        codecProfileLevel2.level = i47;
                                    }
                                    z19 = i19;
                                } else {
                                    z19 = 0;
                                }
                                com.tencent.mars.xlog.Log.i("ILink[HWEnc]", "steve : profile: " + i39 + ", level: " + i47 + ", maxProfile: " + i37 + ", isRecognized:" + z19);
                                i38++;
                                i19 = 1;
                                i29 = 8;
                            }
                            com.tencent.mars.xlog.Log.i("ILink[HWEnc]", "best profile: " + codecProfileLevel2.profile + ", best level: " + codecProfileLevel2.level);
                            int i48 = codecProfileLevel2.profile;
                            if (i48 > 0 && codecProfileLevel2.level >= 256) {
                                this.f149805d.setInteger(com.google.android.gms.common.Scopes.PROFILE, i48);
                                this.f149805d.setInteger(ya.b.LEVEL, 256);
                                i17 = 1;
                                i19 = i17;
                            }
                        }
                    }
                    i17 = 0;
                    i19 = i17;
                }
                if (i19 != 0) {
                    this.f149821t = this.f149805d.getInteger(com.google.android.gms.common.Scopes.PROFILE);
                } else {
                    this.f149821t = 1;
                }
            }
        }
        this.f149805d.setInteger("bitrate-mode", 2);
        try {
            this.f149804c = wo.i1.d(string, false);
            com.tencent.mars.xlog.Log.i("ILink[HWEnc]", "steve: mediaFormat: " + this.f149805d + ", actProfile: " + this.f149821t);
            this.f149804c.a(this.f149805d, null, null, 1);
            this.f149804c.x();
            this.f149820s = new com.tencent.mm.plugin.voip.model.x();
            return 2000;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("ILink[HWEnc]", " error:" + e18.toString());
            this.f149802a = 2002;
            return -2002;
        }
    }

    public final void b() {
        try {
            wo.i1 i1Var = this.f149804c;
            if (i1Var != null) {
                i1Var.y();
                this.f149804c.q();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ILink[HWEnc]", " error:" + e17.toString());
        }
    }

    public void c(byte[] bArr, int i17, int i18) {
        if (bArr != null) {
            int i19 = this.f149803b.equalsIgnoreCase("video/hevc") ? 19 : 18;
            if (this.f149812k) {
                i19 |= 128;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SendVideoData(bArr, bArr.length, this.f149811j, i17, i19);
        }
    }
}
