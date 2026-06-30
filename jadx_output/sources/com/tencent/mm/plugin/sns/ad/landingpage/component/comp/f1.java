package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class f1 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j8 implements g54.c {
    public com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper A;
    public android.view.View B;
    public android.widget.ImageView C;
    public com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar D;
    public com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f162799J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da W;
    public final android.view.View.OnClickListener X;
    public final android.view.View.OnClickListener Y;
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e1 Z;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f162800l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f162801p0;

    /* renamed from: x, reason: collision with root package name */
    public final android.content.Context f162802x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnClickListener f162803x0;

    /* renamed from: y, reason: collision with root package name */
    public int f162804y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.Runnable f162805y0;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f162806z;

    public f1(android.content.Context context, ab4.g gVar, android.view.ViewGroup viewGroup) {
        super(context, gVar, viewGroup);
        this.f162804y = 0;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.f162799J = false;
        this.K = true;
        this.M = false;
        this.N = true;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSeekBarPlayBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a1 a1Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a1(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSeekBarPlayBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.X = a1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createVoiceBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b1 b1Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b1(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVoiceBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.Y = b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c1 c1Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c1(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.Z = c1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d1 d1Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d1(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f162801p0 = d1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createAutoPlayStatusClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u0 u0Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAutoPlayStatusClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f162803x0 = u0Var;
        this.f162805y0 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v0(this);
        this.f162800l1 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w0(this);
        this.f162802x = context;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.x0 x0Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.x0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.W = x0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 6);
    }

    public static void X(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        f1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView videoView = f1Var.A.getVideoView();
        if (videoView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        } else {
            android.view.View innerVideoView = videoView.getInnerVideoView();
            if ((innerVideoView instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) || (innerVideoView instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView)) {
                android.view.View.OnLayoutChangeListener onLayoutChangeListener = f1Var.f162800l1;
                innerVideoView.removeOnLayoutChangeListener(onLayoutChangeListener);
                innerVideoView.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            if (f1Var.b0().I == 2) {
                android.widget.ImageView thumbView = f1Var.A.getThumbView();
                if (thumbView == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "adjustEnterFullScreenView but videoView or thumb is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                } else if (z17) {
                    videoView.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
                    thumbView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                } else {
                    videoView.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                    thumbView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public static /* synthetic */ ab4.g Y(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        ab4.g b07 = f1Var.b0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return b07;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.B();
        if (com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper.u()) {
            c0();
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.A;
            adLandingGeneralVideoWrapper.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = adLandingGeneralVideoWrapper.f162998d;
            if (adLandingGeneralVideoView != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                android.widget.RelativeLayout relativeLayout = adLandingGeneralVideoView.f189743i;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return false;
        }
        try {
            int playTimeInterval = this.A.getPlayTimeInterval();
            jSONObject.put("videoDuration", this.A.getVideoDurationSec());
            jSONObject.put("playTimeInterval", playTimeInterval);
            jSONObject.put("playCount", this.A.getPlayCount());
            jSONObject.put("playCompletedCount", this.P);
            jSONObject.put("clickFullscreenBtnCount", this.T);
            jSONObject.put("doubleClickCount", this.S);
            jSONObject.put("clickPlayControlCount", this.Q);
            jSONObject.put("clickVoiceControlCount", this.R);
            jSONObject.put("clickSightCount", this.U);
            jSONObject.put("clickSightIconCount", this.V);
            jSONObject.put("isAutoPlay", this.f162799J ? "1" : "0");
            jSONObject.put("isTPPlayer", this.A.v());
            if (!this.F) {
                java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(b0().thumbUrl);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("urlMd5", a17);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("thumbUrlInfo", jSONObject2);
            }
            if (!this.G) {
                java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(b0().F);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("urlMd5", a18);
                jSONObject3.put("needDownload", 1);
                jSONObject.put("videoUrlInfo", jSONObject3);
            }
            j64.a adLandingVideoFullScreenFloatBarReportInfo = this.A.getAdLandingVideoFullScreenFloatBarReportInfo();
            if (adLandingVideoFullScreenFloatBarReportInfo != null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("cid", adLandingVideoFullScreenFloatBarReportInfo.f297905d);
                jSONObject4.put(dm.n.COL_EXPOSURECOUNT, adLandingVideoFullScreenFloatBarReportInfo.f297906e);
                jSONObject4.put("stayTime", adLandingVideoFullScreenFloatBarReportInfo.f297907f);
                jSONObject4.put("clickCount", adLandingVideoFullScreenFloatBarReportInfo.f297908g);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put(dm.n.COL_EXPOSURECOUNT, adLandingVideoFullScreenFloatBarReportInfo.f297902a);
                jSONObject5.put("stayTime", adLandingVideoFullScreenFloatBarReportInfo.f297903b);
                jSONObject5.put("clickCount", adLandingVideoFullScreenFloatBarReportInfo.f297904c);
                jSONObject5.put("btnInfo", jSONObject4);
                jSONObject.put("fullVideoFloatBarInfo", jSONObject5);
            }
            l44.r3.a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, u(), w(), playTimeInterval, "MicroMsg.Sns.AdLandingGeneralVideoComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.AdLandingGeneralVideoComponent", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return false;
        }
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.J();
        int t17 = t();
        int height = x().getHeight();
        float f17 = height * 0.5f;
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNewHalfHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_general_comp_new_half_height, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isNewHalfHeight is " + Ni);
            z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewHalfHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isNewHalfHeight, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewHalfHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            z17 = false;
        }
        if (z17) {
            f17 = java.lang.Math.min(x().getHeight() >>> 1, this.f165059q >>> 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "new halfHeight %f", java.lang.Float.valueOf(f17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "inScreenHeight %d, height %d", java.lang.Integer.valueOf(t17), java.lang.Integer.valueOf(height));
        if (t17 <= 0 || height == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        if (t17 < f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight less 0.5 percent, before handleType = " + this.f162804y);
            this.I = false;
            this.H = false;
            c0();
            this.N = false;
            int i18 = this.f162804y;
            if (i18 == 1 || i18 == 3) {
                this.f162804y = 2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight less 0.5 percent, after handleType = " + this.f162804y);
        } else {
            if (this.H && !this.I) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                return;
            }
            this.H = true;
            this.I = false;
            android.content.Context context = this.f165049d;
            boolean z18 = context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
            boolean z19 = z18 && ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context).I2 && !this.K;
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight over 0.5 percent, before handleType = " + this.f162804y);
            this.N = true;
            int i19 = this.f162804y;
            if (i19 == 0) {
                ab4.n0 u17 = u();
                u17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                long j17 = u17.f2875r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                int i27 = ((int) j17) / 1000;
                if (z18) {
                    ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context).q8();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "snsId = " + u().k() + ", cid = " + b0().f2817d + ", isFirstSightVideoComp = " + this.M);
                    if (this.M && i27 > 0) {
                        this.f162804y = 1;
                        e0(i27, true);
                        this.f162799J = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                        return;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                boolean z27 = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || !b0().N;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                if (!z27 || z19) {
                    this.C.setVisibility(0);
                    this.f162799J = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                    return;
                } else {
                    h0(false);
                    this.f162804y = 1;
                    this.f162799J = true;
                }
            } else if (i19 == 2 && !z19) {
                h0(false);
                this.f162804y = 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight over 0.5 percent, after handleType = " + this.f162804y);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.L();
        com.tencent.mm.sdk.platformtools.u3.l(this.f162805y0);
        this.A.e();
        this.A.x();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.M();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewWillDisappear, before handleType = " + this.f162804y);
        c0();
        this.N = false;
        if (!this.H && !this.I) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        this.I = false;
        this.H = false;
        int i17 = this.f162804y;
        if (i17 == 1 || i17 == 3) {
            this.f162804y = 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewWillDisappear, after handleType = " + this.f162804y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f2809s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.D.b(false);
        this.A.setMute(true);
        this.K = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (T()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f2809s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.D.b(true);
        this.A.setMute(false);
        this.K = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b
    public void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        c0();
        this.f162804y = 4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b
    public void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.N = true;
        this.f162804y = 3;
        h0(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public void Z(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOrRemoveMaskView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        android.view.ViewGroup videoCompContainer = this.A.getVideoCompContainer();
        if (videoCompContainer == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOrRemoveMaskView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        try {
            if (z17) {
                videoCompContainer.addView(this.B);
            } else {
                videoCompContainer.removeView(this.B);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "addOrRemoveMaskView, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOrRemoveMaskView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // g54.c
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.N = true;
        e0(i17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onSeekTo time " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public final void a0(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 4000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // g54.c
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        a0(this.f162805y0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public final ab4.g b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        ab4.g gVar = (ab4.g) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return gVar;
    }

    @Override // g54.c
    public void c() {
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.P++;
        u54.a aVar = this.f2811u;
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            aVar.f424814a = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
        }
        if (b0().S != null && !this.L && (adLandingVideoPlayerToolBar = this.D) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            boolean z17 = adLandingVideoPlayerToolBar.f163472h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            if (!z17) {
                int videoDurationSec = this.A.getVideoDurationSec() * 1000;
                int i17 = b0().S.f2888b;
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "OpenSnsAdFloatPageEvent, onLoopCompletion totalMs = " + videoDurationSec + ", floatStartTime = " + i17 + ", hasShowFloat = " + this.L);
                i0(videoDurationSec, i17);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onLoopCompletion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public void c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "pause play");
        this.A.y();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public final void d0(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportThumbTimeCost", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (o54.g.c()) {
            boolean z17 = this.F;
            ca4.e0.b("landing_page_comp_inner_cost", "" + u().l(), b0().f2827q, b0().f2826p, "snsId=" + u().j() + "|cid=" + b0().f2817d + "|isThumbExist=" + (z17 ? 1 : 0) + "|decodeThumbCostTime=" + j17 + "|fileOpCostTime=" + j18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportThumbTimeCost", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public final void e0(int i17, boolean z17) {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (this.A != null && (imageView = this.C) != null) {
            imageView.setVisibility(8);
            if (!isPlaying() && z17) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.A;
                adLandingGeneralVideoWrapper.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                adLandingGeneralVideoWrapper.K = java.lang.System.currentTimeMillis();
                adLandingGeneralVideoWrapper.M++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            }
            this.A.z(i17, z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public void g0(boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        java.lang.Runnable runnable = this.f162805y0;
        if (z17) {
            this.A.q(z17);
            this.D.setVisibility(0);
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da daVar = this.W;
            if (daVar != null) {
                daVar.a(true);
            }
            a0(runnable);
            str = "setFocus";
        } else {
            this.D.setVisibility(4);
            android.view.View view2 = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da daVar2 = this.W;
            if (daVar2 != null) {
                daVar2.a(false);
            }
            this.A.q(z17);
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            str = "setFocus";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0534  */
    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 1599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1.h():void");
    }

    public final void h0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (this.K) {
            P();
        } else {
            if (z17) {
                O();
            }
            U();
        }
        this.C.setVisibility(8);
        this.A.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // g54.c
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.A.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onVideoPause, %s", str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    public final void i0(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toastBonusSceneFloat", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (i17 <= i18) {
            this.L = true;
            com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent = new com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent();
            openSnsAdFloatPageEvent.f54600g.f8024a = b0().S.f2887a;
            openSnsAdFloatPageEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toastBonusSceneFloat", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // ab4.b
    public boolean isPlaying() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.A;
        boolean z17 = adLandingGeneralVideoWrapper != null && adLandingGeneralVideoWrapper.isPlaying();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return z17;
    }

    @Override // g54.c
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        u54.a aVar = this.f2811u;
        if (aVar != null) {
            aVar.a();
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.A;
        adLandingGeneralVideoWrapper.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        c01.k kVar = adLandingGeneralVideoWrapper.f163004m;
        if (kVar != null) {
            kVar.c(adLandingGeneralVideoWrapper);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        if (!this.N) {
            c0();
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onVideoPlay, but is not appear, pausePlay");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1910, 9);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onVideoPlay, %s", str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    @Override // g54.c
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (b0().L) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return true;
        }
        a0(this.f162805y0);
        this.S++;
        if (isPlaying()) {
            c0();
            this.f162804y = 4;
        } else {
            this.N = true;
            h0(true);
            this.f162804y = 3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return true;
    }

    @Override // g54.c
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (b0().L) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return true;
        }
        this.U++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isProcessBarDisplay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar = this.D;
        boolean z17 = adLandingVideoPlayerToolBar != null && adLandingVideoPlayerToolBar.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isProcessBarDisplay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        g0(!z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return com.tencent.mm.R.layout.cpk;
    }
}
