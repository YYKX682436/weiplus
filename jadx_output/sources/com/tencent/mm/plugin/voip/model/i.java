package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class i {
    public static int I;

    /* renamed from: J, reason: collision with root package name */
    public static int f176615J;
    public static final int K;
    public static final int L;
    public static final java.lang.String[] M;
    public static final int N;
    public java.lang.String A;
    public final int B;
    public final com.tencent.mm.plugin.voip.model.h C;
    public android.view.Surface D;
    public com.tencent.mm.plugin.voip.model.g E;
    public int F;
    public int G;
    public final android.util.Size H;

    /* renamed from: a, reason: collision with root package name */
    public int f176616a;

    /* renamed from: b, reason: collision with root package name */
    public int f176617b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f176618c;

    /* renamed from: d, reason: collision with root package name */
    public final int f176619d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f176620e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f176621f;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f176624i;

    /* renamed from: k, reason: collision with root package name */
    public int f176626k;

    /* renamed from: l, reason: collision with root package name */
    public int f176627l;

    /* renamed from: m, reason: collision with root package name */
    public int f176628m;

    /* renamed from: n, reason: collision with root package name */
    public int f176629n;

    /* renamed from: o, reason: collision with root package name */
    public int f176630o;

    /* renamed from: p, reason: collision with root package name */
    public final int f176631p;

    /* renamed from: q, reason: collision with root package name */
    public int f176632q;

    /* renamed from: r, reason: collision with root package name */
    public int f176633r;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.x f176636u;

    /* renamed from: v, reason: collision with root package name */
    public int f176637v;

    /* renamed from: w, reason: collision with root package name */
    public int f176638w;

    /* renamed from: x, reason: collision with root package name */
    public int f176639x;

    /* renamed from: y, reason: collision with root package name */
    public int f176640y;

    /* renamed from: z, reason: collision with root package name */
    public int f176641z;

    /* renamed from: g, reason: collision with root package name */
    public int f176622g = 8;

    /* renamed from: h, reason: collision with root package name */
    public int f176623h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f176625j = 4;

    /* renamed from: s, reason: collision with root package name */
    public long f176634s = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.g1 f176635t = null;

    static {
        lp0.b.D();
        K = 18;
        L = 19;
        M = new java.lang.String[]{"OMX.qcom.", "OMX.Exynos.", "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc", "c2.xring", "c2.ln"};
        N = 25;
    }

    public i(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        this.f176616a = 0;
        this.f176617b = 0;
        this.f176618c = "h264";
        this.f176619d = 12000;
        this.f176624i = false;
        this.f176631p = 1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f176636u = null;
        this.f176637v = 0;
        this.f176638w = 8;
        this.f176639x = 0;
        this.f176640y = 0;
        this.f176641z = 0;
        this.A = null;
        this.B = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_VOIP_ForceHardEncode_Int, 0);
        this.C = null;
        this.F = 640;
        this.G = 480;
        android.util.Size k17 = vq4.b0.k();
        this.H = k17;
        this.f176624i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_voip_ignore2007, 0) == 1;
        this.f176626k = i17;
        this.f176627l = i18;
        this.f176632q = i17;
        this.f176633r = i18;
        if (k17 != null) {
            this.f176626k = k17.getWidth();
            this.f176627l = k17.getHeight();
            this.f176632q = k17.getWidth();
            this.f176633r = k17.getHeight();
        }
        this.f176618c = str;
        this.f176628m = i19;
        this.f176629n = i27;
        this.f176630o = i27;
        this.f176631p = i28;
        this.f176619d = 5000;
        I = 0;
        this.C = new com.tencent.mm.plugin.voip.model.h(this);
        this.f176620e = null;
        this.f176638w = 8;
        this.f176637v = 0;
        this.f176639x = 0;
        this.f176616a = 0;
        this.f176617b = 0;
        r45.hv3 hv3Var = new r45.hv3();
        hv3Var.f376467d = 1L;
        hv3Var.f376468e = 24;
        hv3Var.f376469f = 1L;
        hv3Var.f376470g = 24;
        hv3Var.f376471h = 0L;
        hv3Var.f376472i = 0;
        linkedList.add(hv3Var);
        linkedList2.add(0);
        this.f176640y = 0;
        this.f176641z = 0;
    }

    public int a(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, boolean z17) {
        int i27;
        com.tencent.mm.plugin.voip.model.g1 g1Var;
        int i28;
        boolean z18 = this.f176624i;
        int i29 = this.f176619d;
        if (this.C.f176549l != 0 || (g1Var = this.f176635t) == null || g1Var.f176532x == null) {
            i27 = 0;
        } else {
            if (i17 != this.f176632q || i18 != this.f176633r) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "update CapW = " + i17 + ", CapH = " + i18);
                this.f176632q = i17;
                this.f176633r = i18;
            }
            i27 = this.f176635t.f176532x.videoGetEncWH(i17, i18);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176635t.f176532x;
            int i37 = v2protocalVar.field_HWEncW;
            int i38 = v2protocalVar.field_HWEncH;
            if (this.B != 0 && vq4.a0.f439265b > 0 && vq4.a0.f439266c > 0) {
                i37 = vq4.a0.f439265b;
                i38 = vq4.a0.f439266c;
            } else if (this.f176626k != i37 || this.f176627l != i38) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "surface update enc size:[%d, %d, %dkbps]", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(this.f176629n));
            }
            if (this.f176626k != i37 || this.f176627l != i38 || this.f176620e == null || this.f176623h != this.f176622g) {
                b();
                com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "restart encoder! clipWH:" + i17 + "x" + i18 + ", wh:" + this.f176626k + "x" + this.f176627l + ", mCodecTypePrev: " + this.f176623h + ", mCodecType: " + this.f176622g + ", m_br_kbps: " + this.f176629n);
                this.f176626k = i37;
                this.f176627l = i38;
                try {
                    i28 = c();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "mediacodec init error: " + e17.getMessage());
                    j(2003);
                    i28 = -2003;
                }
                if (i28 >= 0) {
                    this.f176623h = this.f176622g;
                    return 0;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "mediacodec init failed, stop HW encoding! ret: " + i28);
                f();
                return i28;
            }
        }
        wo.i1 i1Var = this.f176620e;
        if (i1Var == null) {
            int i39 = this.f176640y;
            this.f176640y = i39 + 1;
            if (i39 <= 5) {
                return i27;
            }
            j(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END);
            return -2006;
        }
        try {
            this.f176640y = 0;
            java.nio.ByteBuffer[] n17 = i1Var.n();
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int g17 = this.f176620e.g(bufferInfo, i29);
            if (g17 == -2) {
                android.media.MediaFormat o17 = this.f176620e.o();
                com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve: encoder output format changed: " + o17);
                if (o17.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                    int integer = o17.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                    double d17 = integer;
                    if (d17 > this.f176629n * 1000 * 1.5d && d17 > this.f176630o * 1000 * 1.5d && integer > 2000000) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "steve: bitrate NOT match!! real:" + integer + ", target:" + this.f176629n + ", m_br_kbps_prev: " + this.f176630o + ", mBIgnore2007: " + z18);
                        if (!z18) {
                            j(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING);
                            return -2007;
                        }
                        j(12007);
                    }
                }
            }
            while (g17 >= 0) {
                java.nio.ByteBuffer byteBuffer2 = n17[g17];
                int i47 = bufferInfo.size;
                byte[] bArr = new byte[i47];
                byteBuffer2.get(bArr);
                int h17 = h(bArr, bufferInfo.flags, i47);
                if (bufferInfo.flags == 2) {
                    if (this.f176637v != 1 && this.f176636u.b(bArr)) {
                        this.f176639x = this.f176636u.f176912a;
                        this.f176638w = 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:" + this.f176638w + ", checkCodeForBSlice:" + this.f176639x);
                        try {
                            return c();
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "mediacodec reinit error: " + e18.getMessage());
                            j(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS);
                            return -2005;
                        }
                    }
                    if (h17 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "send stream error! ret: ", java.lang.Integer.valueOf(h17));
                        return h17;
                    }
                    i27 = bufferInfo.flags;
                    this.f176620e.s(g17, false);
                    g17 = this.f176620e.g(bufferInfo, i29);
                } else {
                    if (this.f176637v != 1 && this.f176636u.c(bArr)) {
                        this.f176639x = this.f176636u.f176912a;
                        this.f176638w = 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:" + this.f176638w + ", checkCodeForBSlice:" + this.f176639x);
                        try {
                            return c();
                        } catch (java.lang.Exception e19) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "mediacodec reinit error: " + e19.getMessage());
                            j(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS);
                            return -2005;
                        }
                    }
                    int i48 = bufferInfo.flags;
                    if (i48 != 0 && i48 != 1) {
                        j(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve:unknown frame error!!! type:" + bufferInfo.flags + ", len:" + bufferInfo.size);
                        return -2009;
                    }
                    if (h17 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "send stream error! ret: ", java.lang.Integer.valueOf(h17));
                        return h17;
                    }
                    I++;
                    i27 = bufferInfo.flags;
                    this.f176620e.s(g17, false);
                    g17 = this.f176620e.g(bufferInfo, i29);
                }
            }
            return i27;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvcEncoder", e27, "DoMediaCodecEnc error:" + e27.toString(), new java.lang.Object[0]);
            j(2004);
            return -2004;
        }
    }

    public void b() {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176635t;
        if (g1Var == null || (v2protocalVar = g1Var.f176532x) == null) {
            return;
        }
        com.tencent.mm.plugin.voip.model.h hVar = this.C;
        if (g1Var != null && v2protocalVar != null) {
            byte[] bArr = hVar.f176553p;
            if (v2protocalVar.setAppCmd(N, bArr, bArr.length) >= 0) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(hVar.f176553p);
                wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                hVar.f176538a = wrap.getShort();
                hVar.f176539b = wrap.get();
                hVar.f176540c = wrap.get();
                hVar.f176541d = wrap.get();
                hVar.f176542e = wrap.get();
                hVar.f176543f = wrap.get();
                hVar.f176544g = wrap.get();
                hVar.f176545h = wrap.get();
                hVar.f176546i = wrap.get();
                hVar.f176547j = wrap.get();
                hVar.f176548k = wrap.get();
                hVar.f176549l = wrap.get();
                hVar.f176550m = wrap.get();
                hVar.f176551n = wrap.getShort();
                short s17 = wrap.getShort();
                hVar.f176552o = s17;
                int i17 = hVar.f176551n;
                byte b17 = hVar.f176547j;
                if (1 == (b17 & 1)) {
                    int i18 = b17 >> 1;
                    if (8 == i18) {
                        this.f176622g = 8;
                        this.f176618c = "video/avc";
                    } else if (4 == i18) {
                        this.f176622g = 4;
                        this.f176618c = "video/hevc";
                    }
                    if (this.f176622g != this.f176623h) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "use hw encoder, ENCODING: " + this.f176618c + ", mCodecType: " + this.f176622g + ", mCodecTypePrev: " + this.f176623h);
                        hVar.a();
                    }
                    vq4.a0.f439264a.a(false);
                } else {
                    if (this.f176623h != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "use soft encoder, ENCODING: " + this.f176618c + ", mCodecType: " + this.f176622g + ", mCodecTypePrev: " + this.f176623h);
                        hVar.a();
                    }
                    this.f176623h = 0;
                    vq4.a0.f439264a.a(true);
                }
                int i19 = s17;
                if (!com.tencent.mm.plugin.voip.model.v2protocal.Z1) {
                    i19 = s17;
                    if (i17 >= 1280 || s17 >= 1280) {
                        i17 = (((i17 >> 1) + 8) / 16) * 16;
                        i19 = (((s17 >> 1) + 8) / 16) * 16;
                    }
                }
                int i27 = i19;
                if (!com.tencent.mm.plugin.voip.model.v2protocal.f176814a2) {
                    i27 = i19;
                    if (i17 >= 1920 || i19 >= 1920) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AvcEncoder", "error qos param: exp: %dx%d, used: %dx%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.G));
                        i17 = this.F;
                        i27 = this.G;
                    }
                }
                this.F = i17;
                this.G = i27;
                android.util.Size size = this.H;
                if (size != null) {
                    this.F = size.getWidth();
                    this.G = size.getHeight();
                }
                if (this.B == 0) {
                    vq4.a0.f439264a.b(this.F, this.G);
                }
            }
        }
        int i28 = hVar.f176538a;
        if (this.f176618c.equalsIgnoreCase("video/avc")) {
            if (!(this.f176637v == 8)) {
                i28 = (int) (i28 * (((java.lang.Math.max(java.lang.Math.min(this.f176635t.f176532x.S0, 30), 0) * 1.0d) / 100.0d) + 1.0d));
            }
        }
        if (this.f176629n != i28) {
            try {
                if (this.f176620e != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("video-bitrate", i28 * 1000);
                    this.f176620e.v(bundle);
                    gq4.v.wi().f365985s = i28;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "steve: setRates failed:" + e17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve[QoS]: Update BR! frameID: " + I + ", prev_br: " + this.f176629n + ", new_br:" + i28 + ", tuneRatio:" + this.f176635t.f176532x.S0);
            this.f176629n = i28;
        }
        if ((1 == hVar.f176550m && I > 0) || I - f176615J >= (hVar.f176540c & 255)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "anlin-test: Force I Frame! frameID: " + I + ", mPrevMakeIMs: " + this.f176634s + ", lMakeIMs: " + currentTimeMillis + ", mPrevIFrameID: " + f176615J + ", cIPeriod: " + (hVar.f176540c & 255) + ", stQoS.cIReqFlag: " + ((int) hVar.f176550m));
            if (currentTimeMillis - this.f176634s >= 500) {
                d();
                this.f176634s = currentTimeMillis;
                f176615J = I;
            }
        }
        byte b18 = hVar.f176539b;
        if (b18 != this.f176628m) {
            this.f176628m = b18;
        }
        gq4.v.wi().f365986t = this.f176628m;
        this.f176635t.f176534z.E();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c() {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.i.c():int");
    }

    public void d() {
        if (this.f176620e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "make I failed, mediaCodec is null!!!!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve: Sync frame request soon! frameID： " + I);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("request-sync", 0);
        try {
            this.f176620e.v(bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "make I failed, just ignored, exception: " + e17);
        }
    }

    public final void e() {
        try {
            vq4.a0 a0Var = vq4.a0.f439264a;
            vq4.a0.f439268e = false;
            if (this.f176620e != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "licaguo, now we call StopEncoder");
                this.f176620e.w();
                com.tencent.mm.plugin.voip.model.g gVar = this.E;
                if (gVar != null) {
                    ((dr4.t1) gVar).a(this.D);
                }
                this.f176620e.y();
                this.f176620e.q();
            }
            this.f176620e = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvcEncoder", e17, "StopEncoder error:" + e17.toString(), new java.lang.Object[0]);
        }
    }

    public void f() {
        try {
            e();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", " error:" + e17.toString());
        }
    }

    public final boolean g(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        if (i17 > this.f176638w) {
            return false;
        }
        java.lang.String name = mediaCodecInfo.getName();
        boolean z17 = false;
        for (java.lang.String str2 : M) {
            if (name.startsWith(str2)) {
                try {
                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                        if (codecProfileLevel.profile == i17) {
                            z17 = true;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("steve : [");
                        sb6.append(name);
                        sb6.append("] supported profiles:");
                        sb6.append(codecProfileLevel.profile);
                        sb6.append(", maxAllowedProfile: ");
                        sb6.append(this.f176638w);
                        sb6.append(", MIME:");
                        try {
                            sb6.append(str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", sb6.toString());
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        return z17;
    }

    public int h(byte[] bArr, int i17, int i18) {
        if (bArr == null || this.f176635t.f176532x == null) {
            return 0;
        }
        int videoEncodeToSend = this.f176635t.f176532x.videoEncodeToSend(bArr, i18, this.f176626k, i17, this.f176618c.equalsIgnoreCase("video/hevc") ? L : K);
        if (videoEncodeToSend >= 0) {
            this.f176641z = 0;
            return videoEncodeToSend;
        }
        d();
        com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "licaguo: type = " + i17 + ", length = " + i18 + ", ret = " + videoEncodeToSend);
        int i19 = this.f176641z;
        this.f176641z = i19 + 1;
        if (i19 <= 5) {
            return 0;
        }
        j(2008);
        com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "steve: hw send error for 5 times!! send ret = -2008");
        return -2008;
    }

    public void i(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176635t = g1Var;
    }

    public final void j(int i17) {
        if (this.f176618c.equalsIgnoreCase("video/hevc")) {
            this.f176617b = i17;
        } else {
            this.f176616a = i17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "ENCODING: " + this.f176618c + ", encoder error, ErrCode: ", java.lang.Integer.valueOf(i17));
    }

    public final boolean k(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (!fp.h.c(23)) {
            return false;
        }
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                return false;
            }
            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.level = 0;
            codecProfileLevel.profile = 0;
            int length = codecProfileLevelArr.length;
            int i18 = 0;
            while (true) {
                boolean z17 = true;
                if (i18 >= length) {
                    break;
                }
                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i18];
                int i19 = codecProfileLevel2.profile;
                int i27 = codecProfileLevel2.level;
                if (!(i19 == 1 || i19 == 2 || i19 == 8)) {
                    z17 = false;
                } else if (i19 >= codecProfileLevel.profile && i27 >= codecProfileLevel.level && i19 <= i17) {
                    codecProfileLevel.profile = i19;
                    codecProfileLevel.level = i27;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "steve : profile: " + i19 + ", level: " + i27 + ", maxProfile: " + i17 + ", isRecognized:" + z17);
                i18++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "best profile: " + codecProfileLevel.profile + ", best level: " + codecProfileLevel.level);
            int i28 = codecProfileLevel.profile;
            if (i28 <= 0 || codecProfileLevel.level < 256) {
                return false;
            }
            this.f176621f.setInteger(com.google.android.gms.common.Scopes.PROFILE, i28);
            this.f176621f.setInteger(ya.b.LEVEL, 256);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvcEncoder", "trySetProfile error: " + e17.getMessage());
            return false;
        }
    }
}
