package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class b9 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j8 implements com.tencent.mm.pluginsdk.ui.b1, m34.e, android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.View.OnClickListener, com.tencent.mm.pluginsdk.ui.d1 {
    public android.widget.ImageView A;
    public volatile boolean A1;
    public android.widget.ProgressBar B;
    public volatile int B1;
    public boolean C;
    public int C1;
    public android.view.View D;
    public int D1;
    public android.widget.ImageView E;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a9 E1;
    public final android.content.Context F;
    public long F1;
    public final com.tencent.mm.sdk.platformtools.n3 G;
    public long G1;
    public final java.lang.Runnable H;
    public int H1;
    public boolean I;
    public android.view.View I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f165093J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean P;
    public int Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da X;
    public final android.view.View.OnClickListener Y;
    public final android.view.View.OnClickListener Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f165094l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f165095p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f165096p1;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper f165097x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnClickListener f165098x0;

    /* renamed from: x1, reason: collision with root package name */
    public final android.view.GestureDetector f165099x1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar f165100y;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ImageView f165101y0;

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.Runnable f165102y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f165103z;

    /* renamed from: z1, reason: collision with root package name */
    public volatile boolean f165104z1;

    public b9(android.content.Context context, ab4.u0 u0Var, android.view.ViewGroup viewGroup) {
        super(context, u0Var, viewGroup);
        this.I = false;
        this.f165093J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
        this.P = false;
        this.Q = 0;
        this.R = 0L;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u8 u8Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u8(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.Y = u8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createVoiceTypeClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v8 v8Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v8(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVoiceTypeClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.Z = v8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createVideoStatusClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x8 x8Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x8(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVideoStatusClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f165095p0 = x8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createVideoViewClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y8 y8Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y8(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVideoViewClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f165098x0 = y8Var;
        this.f165104z1 = false;
        this.A1 = false;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.F1 = 0L;
        this.F = context;
        this.G = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        try {
            this.f165099x1 = new android.view.GestureDetector(this);
            this.f165102y1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o8(this);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 5);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        this.H = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p8(this);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q8 q8Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q8(this, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.X = q8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public static /* synthetic */ void X(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b9 b9Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        b9Var.h0(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper Y(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b9 b9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper adLandingVideoWrapper = b9Var.f165097x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return adLandingVideoWrapper;
    }

    public static /* synthetic */ android.view.View Z(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b9 b9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        android.view.View view = b9Var.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.B();
        e0(false);
        java.lang.String l17 = za4.t0.l("adId", c0().streamVideoThumb);
        if (com.tencent.mm.vfs.w6.j(l17)) {
            this.A.setImageBitmap(com.tencent.mm.sdk.platformtools.x.J(l17, null));
            this.A.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return false;
        }
        try {
            jSONObject.put("streamVideoDuraion", this.f165097x.getVideoDurationSec() * 1000);
            jSONObject.put("playTimeInterval", this.S);
            jSONObject.put("playCount", this.T);
            jSONObject.put("playCompletedCount", this.U);
            jSONObject.put("clickFullscreenBtnCount", this.D1);
            jSONObject.put("doubleClickCount", this.C1);
            jSONObject.put("clickPlayControlCount", this.V);
            jSONObject.put("clickVoiceControlCount", this.W);
            jSONObject.put("isAutoPlay", this.N ? "1" : "0");
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(c0().streamVideoThumb);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("urlMd5", a17);
            jSONObject2.put("needDownload", 1);
            jSONObject.put("thumbUrlInfo", jSONObject2);
            java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(c0().F);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("urlMd5", a18);
            jSONObject3.put("needDownload", 1);
            jSONObject.put("streamVideoUrlInfo", jSONObject3);
            if (this.E1 != null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("cid", this.E1.f165071d);
                jSONObject4.put(dm.n.COL_EXPOSURECOUNT, this.E1.f165072e);
                jSONObject4.put("stayTime", this.E1.f165073f);
                jSONObject4.put("clickCount", this.E1.f165074g);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put(dm.n.COL_EXPOSURECOUNT, this.E1.f165068a);
                jSONObject5.put("stayTime", this.E1.f165069b);
                jSONObject5.put("clickCount", this.E1.f165070c);
                jSONObject5.put("btnInfo", jSONObject4);
                jSONObject.put("fullVideoFloatBarInfo", jSONObject5);
            }
            l44.r3.a(62, u(), w(), this.S, "MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return false;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onVideoEnded");
        this.U++;
        h0(true);
        this.f165097x.m();
        if (this.R != 0) {
            this.S = (int) (this.S + (java.lang.System.currentTimeMillis() - this.R));
            this.R = 0L;
        }
        this.Q = 5;
        this.f165097x.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.J();
        int t17 = t();
        int height = x().getHeight();
        if (t17 == 0 || height == 0) {
            this.f165097x.setNeedPause(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        if (t17 < 0) {
            this.f165097x.setNeedPause(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        if (t17 < height * 0.5f) {
            this.M = false;
            this.L = false;
            this.f165097x.setNeedPause(true);
            e0(false);
            if (this.Q == 1) {
                this.Q = 2;
            }
        } else {
            if (this.L && !this.M) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                return;
            }
            this.f165097x.setNeedPause(false);
            this.M = false;
            this.L = true;
            if (this.Q == 6) {
                if (this.f165104z1) {
                    this.Q = 1;
                    if (this.E.getVisibility() == 0) {
                        this.E.setVisibility(8);
                    }
                } else {
                    this.Q = 4;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                return;
            }
            this.A.setVisibility(0);
            boolean z17 = this.K;
            if (!z17 || (z17 && d0())) {
                h0(true);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m8(this), 3000L);
            }
            if (this.K) {
                if (!d0()) {
                    this.E.setVisibility(0);
                    this.N = false;
                    this.K = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    return;
                }
                this.N = true;
                this.K = false;
            }
            int i17 = this.Q;
            if (i17 == 0) {
                if (d0()) {
                    if (this.f165093J) {
                        P();
                    } else {
                        U();
                    }
                    this.Q = 1;
                    j0();
                }
            } else if (i17 == 2) {
                if (this.f165093J) {
                    P();
                } else {
                    U();
                }
                j0();
                this.Q = 1;
            } else if (i17 == 3) {
                if (this.f165093J) {
                    P();
                } else {
                    U();
                }
                j0();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.L();
        try {
            this.f165097x.m();
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.G;
            n3Var.removeCallbacks(this.H);
            n3Var.removeCallbacks(this.f165102y1);
            b0();
            ca4.e0.a("landing_page_video_comp_loading_time", java.lang.String.valueOf(this.H1), 1, 0, "");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        this.f165097x.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.M();
        this.f165097x.setNeedPause(true);
        e0(false);
        if (!this.L && !this.M) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        this.M = false;
        this.L = false;
        if (this.Q == 1) {
            this.Q = 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "online play error, %s", str3);
        this.P = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.A1 = true;
        this.G1 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "mediaId = " + str2 + ", start loading");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f2809s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        android.widget.ImageView imageView = this.f165103z;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(this.F, com.tencent.mm.R.raw.icon_volume_off));
        }
        this.f165097x.setMute(true);
        this.f165093J = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (T()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f2809s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        android.widget.ImageView imageView = this.f165103z;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(this.F, com.tencent.mm.R.raw.icon_volume_on));
        }
        this.f165097x.setMute(false);
        this.f165093J = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        e0(false);
        this.Q = 4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.Q = 3;
        j0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onSeek time " + i17);
        this.B1 = i17;
        if (this.f165093J) {
            P();
        } else {
            O();
            U();
        }
        this.G.removeCallbacks(this.f165102y1);
        android.view.View view = this.f165094l1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g0(i17, true);
        this.Q = 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void a0(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.G;
        try {
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.I = true;
        a0(this.H);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.G1 != 0) {
            this.H1 = (int) (this.H1 + (java.lang.System.currentTimeMillis() - this.G1));
            this.G1 = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.d1
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLoopCompletion");
        this.U++;
        u54.a aVar = this.f2811u;
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            aVar.f424814a = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final ab4.u0 c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        ab4.u0 u0Var = (ab4.u0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return u0Var;
    }

    @Override // m34.e
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final boolean d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean z17 = isWifi || c0().K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return z17;
    }

    public final void e0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.G.post(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l8(this, z17));
        if (this.R != 0) {
            this.S = (int) (this.S + (java.lang.System.currentTimeMillis() - this.R));
            this.R = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void g0(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.f165097x != null) {
            this.E.setVisibility(8);
            if (this.A.getVisibility() == 0) {
                this.B.setVisibility(0);
            }
            this.f165097x.a(i17, z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(2:3|(27:5|6|(1:8)(5:76|(1:93)(1:84)|85|(1:92)(1:90)|91)|9|(3:11|(1:13)(1:15)|14)|16|(1:20)|21|(5:23|24|25|(1:27)|28)(2:73|(1:75))|29|30|31|(3:33|(1:35)|36)|38|39|40|(1:42)|43|(1:47)|48|(3:50|(1:52)(1:54)|53)|55|56|57|58|59|60))(1:95)|94|6|(0)(0)|9|(0)|16|(2:18|20)|21|(0)(0)|29|30|31|(0)|38|39|40|(0)|43|(2:45|47)|48|(0)|55|56|57|58|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04a6, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0440, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0441, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b4, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x036d A[Catch: all -> 0x03b3, TryCatch #2 {all -> 0x03b3, blocks: (B:31:0x035c, B:33:0x036d, B:35:0x0380, B:36:0x0387), top: B:30:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d9 A[Catch: all -> 0x0440, TryCatch #0 {all -> 0x0440, blocks: (B:40:0x03c4, B:42:0x03d9, B:43:0x03e0, B:45:0x03ea, B:48:0x03f1, B:50:0x042b, B:53:0x0436, B:55:0x0439), top: B:39:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x042b A[Catch: all -> 0x0440, TryCatch #0 {all -> 0x0440, blocks: (B:40:0x03c4, B:42:0x03d9, B:43:0x03e0, B:45:0x03ea, B:48:0x03f1, B:50:0x042b, B:53:0x0436, B:55:0x0439), top: B:39:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f6  */
    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b9.h():void");
    }

    public final void h0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.lang.Runnable runnable = this.H;
        if (z17) {
            this.f165100y.setVisibility(0);
            android.widget.ImageView imageView = this.f165103z;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.view.View view = this.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView2 = this.f165101y0;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da daVar = this.X;
            if (daVar != null) {
                daVar.a(true);
            }
            a0(runnable);
        } else {
            this.I = false;
            this.f165100y.setVisibility(4);
            android.widget.ImageView imageView3 = this.f165103z;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView4 = this.f165101y0;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da daVar2 = this.X;
            if (daVar2 != null) {
                daVar2.a(false);
            }
            this.G.removeCallbacks(runnable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public void i0(int i17, boolean z17, boolean z18, int i18, int i19, int i27, int i28, int i29, long j17, boolean z19, int i37, java.lang.String str, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNonFullScreenVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f165097x.setNeedPause(false);
            this.Q = 6;
            this.F1 += j18;
            this.f165104z1 = z18;
            this.D1++;
            this.V += i18;
            this.C1 += i19;
            this.W += i27;
            this.U += i28;
            this.T += i29;
            this.S = (int) (this.S + j17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                l0(str);
            }
            if (z18) {
                this.R = java.lang.System.currentTimeMillis();
            }
            this.G.removeCallbacks(this.f165102y1);
            android.view.View view = this.f165094l1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setNonFullScreenVideoPlay", "(IZZIIIIIJZILjava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setNonFullScreenVideoPlay", "(IZZIIIIIJZILjava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("VideoFullScreenActivity", "currPosSec = " + i17 + ", isPlaying = " + z18 + ", bNoVoice = " + z17);
            if (z19) {
                if (i37 != this.f165097x.getVideoDurationSec() && i37 >= 0) {
                    this.f165100y.a(this.f165097x.getCacheTimeSec());
                    this.f165097x.a(r0.getCacheTimeSec(), true);
                    this.R = java.lang.System.currentTimeMillis();
                    m0(true);
                }
                this.f165100y.a(0);
                this.f165097x.a(0.0d, true);
                this.R = java.lang.System.currentTimeMillis();
                m0(true);
            } else {
                if (i17 != this.f165097x.getVideoDurationSec() && i17 >= 0) {
                    this.f165100y.a(i17);
                    this.f165097x.a(i17, z18);
                    m0(z18);
                }
                this.f165100y.a(0);
                this.f165097x.a(0.0d, z18);
                m0(z18);
            }
            if (z17) {
                P();
            } else {
                U();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNonFullScreenVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public boolean isPlaying() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean isPlaying = this.f165097x.isPlaying();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return isPlaying;
    }

    public final void j0() {
        android.content.Context context = this.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "starting play, downFailed=" + this.P);
        if (!this.P) {
            this.G.post(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k8(this));
            this.R = java.lang.System.currentTimeMillis();
            this.T++;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "last download fail ,try again");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = this.f165100y;
        if (videoPlayerSeekBar != null && videoPlayerSeekBar.getParent() != null) {
            ((android.view.ViewGroup) this.f165100y.getParent()).removeView(this.f165100y);
        }
        this.f165097x.setFullScreen(false);
        this.f165097x.h(false, c0().F, 0);
        try {
            int i17 = this.f165058p;
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar2 = this.f165100y;
            if (videoPlayerSeekBar2 != null && videoPlayerSeekBar2.getParent() != null) {
                ((android.view.ViewGroup) this.f165100y.getParent()).removeView(this.f165100y);
            }
            int b17 = i65.a.b(context, 75);
            if (S() && T()) {
                b17 = 0;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17 - b17, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = i65.a.b(context, 3);
            this.f165100y.setLayoutParams(layoutParams);
            ((android.view.ViewGroup) this.f165056n.findViewById(com.tencent.mm.R.id.chq)).addView(this.f165100y, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "startPlay exp=" + com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        g0(0, true);
        this.f165097x.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "the onVideoPlay is called!");
        u54.a aVar = this.f2811u;
        if (aVar != null) {
            aVar.a();
        }
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        try {
            this.G.removeCallbacks(this.f165102y1);
            android.view.View view = this.f165094l1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0(true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void l0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (this.E1 == null) {
                this.E1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a9();
            }
            this.E1.f165068a += jSONObject.optInt(dm.n.COL_EXPOSURECOUNT);
            this.E1.f165069b += jSONObject.optLong("stayTime");
            this.E1.f165070c += jSONObject.optInt("clickCount");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("btnInfo");
            this.E1.f165071d = optJSONObject.optString("cid");
            this.E1.f165072e += optJSONObject.optInt(dm.n.COL_EXPOSURECOUNT);
            this.E1.f165073f += optJSONObject.optLong("stayTime");
            this.E1.f165074g += optJSONObject.optInt("clickCount");
        } catch (java.lang.Throwable th6) {
            this.E1 = null;
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void m0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f165100y.setIsPlay(z17);
            this.f165100y.getPlayBtn().getLayoutParams().width = this.f165096p1;
            this.f165100y.getPlayBtn().getLayoutParams().height = this.f165096p1;
            android.content.Context context = this.F;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "startPlay");
                this.f165100y.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_on));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "pausePlay");
                this.f165100y.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_off));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.A1 = false;
        this.B1 = 0;
        b0();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "mediaId = " + str2 + ", end loading");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.P = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.f487002n55) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "click full screen btn");
            try {
                if (this.F instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                    this.D1++;
                    this.G.removeCallbacks(this.f165102y1);
                    android.view.View view2 = this.f165094l1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) this.F;
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z8.f165871a = c0();
                    com.tencent.mm.plugin.sns.model.a4.f164075a = u();
                    android.content.Intent intent = new android.content.Intent(snsAdNativeLandingPagesUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity.class);
                    intent.putExtra("KComponentVideoType", 1);
                    intent.putExtra("KComponentCid", z());
                    intent.putExtra("KComponentCurrentTime", this.f165097x.getCurrPosSec());
                    intent.putExtra("KComponentTotalTime", this.f165097x.getVideoDurationSec());
                    intent.putExtra("KComponentVoiceType", this.f165093J);
                    intent.putExtra("KComponentProgressType", isPlaying());
                    intent.putExtra("KComponentStreamVideoUrlPath", c0().F);
                    intent.putExtra("KComponentIsWaiting", this.A1);
                    intent.putExtra("KComponentSeekTimeDueWaiting", this.B1);
                    intent.putExtra("KComponentKComponentCacheTime", this.f165097x.getCacheTimeSec());
                    intent.putExtra("KComponentForceLandMode", c0().L);
                    this.f165097x.setNeedPause(true);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(2000);
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.k(snsAdNativeLandingPagesUI, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 2);
                } else {
                    android.widget.ImageView imageView = this.f165101y0;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
            } catch (java.lang.Throwable th6) {
                android.widget.ImageView imageView2 = this.f165101y0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "onDoubleTap");
            a0(this.H);
            if (!this.P) {
                this.C1++;
            }
            if (isPlaying()) {
                e0(true);
                this.Q = 4;
            } else {
                if (this.f165093J) {
                    P();
                } else {
                    O();
                    U();
                }
                j0();
                this.Q = 3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "onSingleTapConfirmed");
            if (this.I) {
                this.I = false;
                h0(false);
            } else {
                this.I = true;
                h0(true);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f165099x1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return onTouchEvent;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return com.tencent.mm.R.layout.cpt;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public long w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        long w17 = super.w() + this.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return w17;
    }
}
