package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class x7 extends ab4.b implements android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.View.OnClickListener {
    public final android.content.Context A;
    public final android.view.View.OnClickListener A1;
    public final com.tencent.mm.sdk.platformtools.n3 B;
    public final m34.e B1;
    public boolean C;
    public int C1;
    public long D;
    public int D1;
    public int E;
    public int E1;
    public int F;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v7 F1;
    public int G;
    public long G1;
    public int H;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t7 H1;
    public int I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public int f165810J;
    public android.view.View J1;
    public int K;
    public android.view.View K1;
    public android.widget.ImageView L;
    public int M;
    public int N;
    public boolean P;
    public volatile int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public java.lang.String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar Z;

    /* renamed from: l1, reason: collision with root package name */
    public volatile boolean f165811l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f165812p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.view.GestureDetector f165813p1;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OfflineVideoView f165814x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f165815x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.lang.Runnable f165816x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f165817y;

    /* renamed from: y0, reason: collision with root package name */
    public int f165818y0;

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.Runnable f165819y1;

    /* renamed from: z, reason: collision with root package name */
    public int f165820z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da f165821z1;

    public x7(android.content.Context context, ab4.z zVar, android.view.ViewGroup viewGroup) {
        super(context, zVar, viewGroup);
        this.D = 0L;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f165810J = 0;
        this.K = 0;
        this.M = 0;
        this.N = 0;
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.S = true;
        this.T = true;
        this.U = true;
        this.X = false;
        this.f165811l1 = false;
        this.f165821z1 = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a7 a7Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a7(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.A1 = a7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b7 b7Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b7(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.B1 = b7Var;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.G1 = 0L;
        this.I1 = false;
        this.A = context;
        this.B = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        try {
            this.f165813p1 = new android.view.GestureDetector(this);
            this.f165816x1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g7(this);
            this.f165819y1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h7(this);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i7 i7Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i7(this, context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            this.f165821z1 = i7Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 4);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        l44.c0.a(zVar, false);
    }

    public static /* synthetic */ android.view.View Y(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        android.view.View view = x7Var.f165815x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return view;
    }

    public static /* synthetic */ boolean Z(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        boolean z17 = x7Var.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar a0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = x7Var.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return videoPlayerSeekBar;
    }

    public static /* synthetic */ android.content.Context b0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        android.content.Context context = x7Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return context;
    }

    public static /* synthetic */ void c0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        x7Var.t0(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView d0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = x7Var.f165814x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return offlineVideoView;
    }

    public static /* synthetic */ android.view.View e0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        android.view.View view = x7Var.J1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return view;
    }

    public static void g0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        x7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onAudioFocusChanged is called" + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public static /* synthetic */ void h0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        x7Var.l0(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public static /* synthetic */ ab4.z i0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        ab4.z m07 = x7Var.m0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return m07;
    }

    public static /* synthetic */ boolean j0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        x7Var.X = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.B();
        java.lang.String l17 = za4.t0.l("adId", m0().sightThumbUrl);
        n0(false);
        if (com.tencent.mm.vfs.w6.j(l17)) {
            this.f165814x.e(l17);
            this.f165814x.o(false, 0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return false;
        }
        try {
            jSONObject.put("sightDuration", this.f165820z * 1000);
            jSONObject.put("playTimeInterval", this.E);
            jSONObject.put("playCount", this.F);
            jSONObject.put("playCompletedCount", this.G);
            jSONObject.put("clickPlayControlCount", this.C1);
            jSONObject.put("doubleClickCount", this.D1);
            jSONObject.put("clickFullscreenBtnCount", this.E1);
            jSONObject.put("clickVoiceControlCount", this.M);
            jSONObject.put("isAutoPlay", "0");
            if (m0().f2827q == 61) {
                jSONObject.put("clickSightCount", this.N);
            }
            if (!this.U) {
                java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(m0().F);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("urlMd5", a17);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("sightUrlInfo", jSONObject2);
            }
            if (!this.T) {
                java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(m0().sightThumbUrl);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("urlMd5", a18);
                jSONObject3.put("needDownload", 1);
                jSONObject.put("thumbUrlInfo", jSONObject3);
            }
            jSONObject.put("streamVideoEnterCount", this.H);
            jSONObject.put("streamVideoPlayCount", this.I);
            jSONObject.put("streamVideoPlayCompleteCount", this.f165810J);
            jSONObject.put("streamVideoTotalPlayTimeInMs", this.K);
            if (this.F1 != null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("cid", this.F1.f165575d);
                jSONObject4.put(dm.n.COL_EXPOSURECOUNT, this.F1.f165576e);
                jSONObject4.put("stayTime", this.F1.f165577f);
                jSONObject4.put("clickCount", this.F1.f165578g);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put(dm.n.COL_EXPOSURECOUNT, this.F1.f165572a);
                jSONObject5.put("stayTime", this.F1.f165573b);
                jSONObject5.put("clickCount", this.F1.f165574c);
                jSONObject5.put("btnInfo", jSONObject4);
                jSONObject.put("fullVideoFloatBarInfo", jSONObject5);
            }
            l44.r3.a(61, u(), w(), this.E, "MicroMsg.Sns.AdLandingPageSightVideoComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageSightVideoComponent", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return false;
        }
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.J();
        int t17 = t();
        int height = x().getHeight();
        if (t17 == 0 || height == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        if (t17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        if (t17 < height * 0.5f) {
            this.S = false;
            this.R = false;
            n0(false);
            if (this.Q == 1) {
                this.Q = 2;
            }
        } else {
            if (this.R && !this.S) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                return;
            }
            this.S = false;
            this.R = true;
            if (this.Q == 6) {
                if (this.f165811l1) {
                    this.Q = 1;
                } else {
                    this.Q = 4;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                return;
            }
            if (this.Q == 0) {
                if (this.P) {
                    P();
                } else {
                    U();
                }
                this.Q = 1;
                q0();
            } else if (this.Q == 2) {
                if (this.P) {
                    P();
                } else {
                    U();
                }
                q0();
                this.Q = 1;
            } else if (this.Q == 3) {
                if (this.P) {
                    P();
                } else {
                    U();
                }
                q0();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.L();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.B;
        try {
            n3Var.removeCallbacks(this.f165816x1);
            n3Var.removeCallbacks(this.f165819y1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        X();
        this.f165814x.i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.M();
        X();
        n0(false);
        if (!this.R && !this.S) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        this.S = false;
        this.R = false;
        if (this.Q == 1) {
            this.Q = 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f2809s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        android.widget.ImageView imageView = this.L;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(this.A, com.tencent.mm.R.raw.icon_volume_off));
        }
        this.f165814x.setMute(true);
        this.P = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (T()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f2809s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        android.widget.ImageView imageView = this.L;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(this.A, com.tencent.mm.R.raw.icon_volume_on));
        }
        this.f165814x.setMute(false);
        this.P = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b
    public void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        n0(false);
        this.Q = 4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b
    public void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.Q = 3;
        q0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final void X() {
        android.media.AudioManager audioManager;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            if (this.H1 != null && (audioManager = (android.media.AudioManager) this.A.getSystemService("audio")) != null) {
                audioManager.abandonAudioFocus(this.H1);
                this.H1 = null;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "abandonAudioFocus has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (!com.tencent.mm.vfs.w6.j(za4.t0.l("adId", m0().sightThumbUrl))) {
            this.T = false;
        }
        if (!com.tencent.mm.vfs.w6.j(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi() + "adId_stream_" + com.tencent.mm.sdk.platformtools.w2.a(m0().F))) {
            this.U = false;
        }
        android.view.View findViewById = this.f165056n.findViewById(com.tencent.mm.R.id.n4y);
        this.J1 = findViewById;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.n4r);
        android.content.Context context = this.A;
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = new com.tencent.mm.plugin.sns.ui.OfflineVideoView(context, null);
        this.f165814x = offlineVideoView;
        boolean z17 = true;
        offlineVideoView.setSource(1);
        this.K1 = viewGroup;
        viewGroup.addView(this.f165814x, new android.widget.LinearLayout.LayoutParams(-1, -1));
        int i19 = m0().K;
        int i27 = this.f165059q;
        int i28 = this.f165058p;
        if (i19 == 0) {
            if (((int) m0().f2829s) > 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i28, (int) ((i28 * m0().f2830t) / m0().f2829s));
                viewGroup.setLayoutParams(layoutParams);
                findViewById.setLayoutParams(layoutParams);
            } else {
                viewGroup.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i28, i27));
                findViewById.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i28, i27));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            if (m0().Q) {
                android.view.View innerVideoView = this.f165814x.getInnerVideoView();
                if (innerVideoView instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                    innerVideoView.addOnLayoutChangeListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e7(this));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onLayoutChange, innerVideoView=" + innerVideoView + ", displayType=" + m0().K);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "fixVideoBlackline, enable=false");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixProgressBarLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            android.view.View innerVideoView2 = this.f165814x.getInnerVideoView();
            if (innerVideoView2 instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                innerVideoView2.addOnLayoutChangeListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f7(this, innerVideoView2));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixProgressBarLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        } else if (m0().K == 1) {
            float f17 = i28;
            float f18 = i27;
            if (m0().f2829s / f17 > m0().f2830t / f18) {
                i18 = ((int) ((f17 * m0().f2830t) / m0().f2829s)) + 1;
                i17 = i28;
            } else {
                i17 = ((int) ((f18 * m0().f2829s) / m0().f2830t)) + 1;
                i18 = i27;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i17, i18);
            int i29 = (i28 - i17) / 2;
            layoutParams2.leftMargin = i29;
            layoutParams2.rightMargin = i29;
            int i37 = (i27 - i18) / 2;
            layoutParams2.topMargin = i37;
            layoutParams2.bottomMargin = i37;
            viewGroup.setLayoutParams(layoutParams2);
            findViewById.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i28, i27));
        } else if (m0().K == 2) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams((int) m0().f2829s, (int) m0().f2830t);
            viewGroup.setLayoutParams(layoutParams3);
            findViewById.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(layoutParams3));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "createView, displayType=" + m0().K);
        java.lang.String l17 = za4.t0.l("adId", m0().sightThumbUrl);
        if (com.tencent.mm.vfs.w6.j(l17)) {
            this.f165814x.e(l17);
        } else {
            za4.t0.b("adId", m0().sightThumbUrl, false, 1000000001, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j7(this));
        }
        ((android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.dhd)).setText(context.getString(com.tencent.mm.R.string.brf));
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.f487001n54);
        this.f165817y = findViewById2;
        if (findViewById2 != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            android.view.ViewParent parent = this.f165817y.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f165817y);
            }
            ((android.view.ViewGroup) findViewById).addView(this.f165817y, layoutParams4);
        }
        if (T()) {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f487003n56);
            if (imageView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(imageView, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f487003n56);
            this.L = imageView2;
            imageView2.setVisibility(0);
            this.L.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k7(this));
            try {
                android.view.ViewParent parent2 = this.L.getParent();
                if (parent2 instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent2).removeView(this.L);
                }
                android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) this.L.getLayoutParams();
                layoutParams5.bottomMargin = i65.a.b(context, 8);
                layoutParams5.rightMargin = i65.a.b(context, 10);
                ((android.view.ViewGroup) findViewById).addView(this.L, layoutParams5);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "init voiceTypeBtn and visible");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
            }
        }
        this.f165814x.setVideoCallback(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p7(this));
        this.f165814x.setOnSeekCompleteCallback(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w7(this));
        android.widget.ImageView imageView3 = this.L;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        this.f165814x.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q7(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWithStreamVideoOption", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        ab4.z m07 = m0();
        boolean z18 = m07.f2826p == 1 && m07.H.length() > 0 && m07.G.length() > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWithStreamVideoOption", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (z18) {
            android.view.View findViewById3 = this.f165056n.findViewById(com.tencent.mm.R.id.n4s);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.Button button = (android.widget.Button) findViewById3.findViewById(com.tencent.mm.R.id.n4t);
            button.setTextColor(m0().I);
            button.setText(m0().H);
            button.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r7(this));
            findViewById3.findViewById(com.tencent.mm.R.id.n4u).setBackgroundColor(m0().f2913J);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFullScreenBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.f165818y0 = i65.a.b(context, 32);
            this.f165814x.setOnTouchListener(this);
            if (S()) {
                android.view.View findViewById4 = findViewById.findViewById(com.tencent.mm.R.id.f487002n55);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initFullScreenBtn", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initFullScreenBtn", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f487002n55);
                this.f165812p0 = imageView4;
                android.view.ViewParent parent3 = imageView4.getParent();
                if (parent3 instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent3).removeView(this.f165812p0);
                }
                android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) this.f165812p0.getLayoutParams();
                layoutParams6.bottomMargin = i65.a.b(context, 8);
                layoutParams6.rightMargin = i65.a.b(context, 10);
                ((android.view.ViewGroup) findViewById).addView(this.f165812p0, layoutParams6);
                this.f165812p0.setOnClickListener(this);
                this.f165812p0.setVisibility(8);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "init fullScreenBtn and visible");
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFullScreenBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = new com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar(context);
            this.Z = videoPlayerSeekBar;
            android.view.ViewParent parent4 = videoPlayerSeekBar.getParent();
            if (parent4 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent4).removeView(this.Z);
            }
            int b17 = i65.a.b(context, 75);
            if (S() && T()) {
                b17 = 0;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(this.K1.getLayoutParams().width - b17, -2);
            layoutParams7.addRule(12);
            layoutParams7.bottomMargin = i65.a.b(context, 3);
            this.Z.setLayoutParams(layoutParams7);
            ((android.view.ViewGroup) this.f165056n.findViewById(com.tencent.mm.R.id.chq)).addView(this.Z, layoutParams7);
            s0(0);
            this.Z.setOnPlayButtonClickListener(this.A1);
            this.Z.setIplaySeekCallback(this.B1);
            this.Z.setVisibility(4);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da daVar = this.f165821z1;
            if (daVar != null) {
                if (this.Z.getVisibility() != 0) {
                    z17 = false;
                }
                daVar.a(z17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "init progressBar and visible");
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th8.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPauseVideoUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            android.view.View findViewById5 = findViewById.findViewById(com.tencent.mm.R.id.kqc);
            this.f165815x0 = findViewById5;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initPauseVideoUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initPauseVideoUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Throwable th9) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th9.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPauseVideoUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "createView, downloadByCdn=" + m0().R + ", forbidCdn=" + m0().S);
        if (m0().R) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 20);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 21);
        }
        if (m0().S) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 22);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // ab4.b
    public boolean isPlaying() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        boolean h17 = this.f165814x.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return h17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7.class.getName().concat("not support update now"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final void l0(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.B;
        try {
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final ab4.z m0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        ab4.z zVar = (ab4.z) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return zVar;
    }

    public final void n0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.B.post(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d7(this, z17));
        if (this.D != 0) {
            this.E = (int) (this.E + (java.lang.System.currentTimeMillis() - this.D));
            this.D = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final void o0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            if (this.H1 == null) {
                this.H1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t7(this);
                android.media.AudioManager audioManager = (android.media.AudioManager) this.A.getSystemService("audio");
                if (audioManager != null) {
                    int requestAudioFocus = audioManager.requestAudioFocus(this.H1, 3, 2);
                    if (requestAudioFocus == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "requestAudioFocus successfully!");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "requestAudioFocus is not granted. value = " + requestAudioFocus);
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "requestAudioFocus has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.content.Context context = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.f487002n55) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "click full screen btn");
            try {
                if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                    this.E1++;
                    this.B.removeCallbacks(this.f165819y1);
                    android.view.View view2 = this.f165815x0;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context;
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u7.f165548a = m0();
                    com.tencent.mm.plugin.sns.model.a4.f164075a = u();
                    android.content.Intent intent = new android.content.Intent(snsAdNativeLandingPagesUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity.class);
                    intent.putExtra("KComponentVideoType", 0);
                    intent.putExtra("KComponentCid", z());
                    intent.putExtra("KComponentCurrentTime", this.f165814x.getCurrentPositionMs());
                    intent.putExtra("KComponentTotalTime", this.f165814x.getDurationMs());
                    intent.putExtra("KComponentVoiceType", this.P);
                    intent.putExtra("KComponentProgressType", isPlaying());
                    intent.putExtra("KComponentVideoSightThumbUrl", m0().sightThumbUrl);
                    intent.putExtra("KComponentStreamVideoUrlPath", m0().F);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(2000);
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.k(snsAdNativeLandingPagesUI, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 1);
                } else {
                    android.widget.ImageView imageView = this.f165812p0;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
            } catch (java.lang.Throwable th6) {
                android.widget.ImageView imageView2 = this.f165812p0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "onDoubleTap");
            l0(this.f165816x1);
            if (this.C) {
                this.D1++;
            }
            if (isPlaying()) {
                n0(true);
                this.Q = 4;
            } else {
                if (this.P) {
                    P();
                } else {
                    O();
                    U();
                }
                q0();
                this.Q = 3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "onSingleTapConfirmed");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        if (m0().T) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return false;
        }
        if (this.C) {
            boolean z17 = true;
            boolean z18 = this.Z.getVisibility() == 0;
            java.lang.Runnable runnable = this.f165816x1;
            if (z18) {
                this.Z.setVisibility(4);
                android.widget.ImageView imageView = this.f165812p0;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                this.B.removeCallbacks(runnable);
            } else {
                this.Z.setVisibility(0);
                android.widget.ImageView imageView2 = this.f165812p0;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                l0(runnable);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da daVar = this.f165821z1;
            if (daVar != null) {
                if (z18) {
                    z17 = false;
                }
                daVar.a(z17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f165813p1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return onTouchEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010e A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0015, B:5:0x004d, B:6:0x0053, B:8:0x0059, B:9:0x005e, B:13:0x00f4, B:14:0x0109, B:16:0x010e, B:17:0x0115, B:22:0x0112, B:23:0x00ff), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0112 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0015, B:5:0x004d, B:6:0x0053, B:8:0x0059, B:9:0x005e, B:13:0x00f4, B:14:0x0109, B:16:0x010e, B:17:0x0115, B:22:0x0112, B:23:0x00ff), top: B:2:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0(int r18, boolean r19, boolean r20, int r21, int r22, int r23, int r24, int r25, long r26, java.lang.String r28, long r29) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7.p0(int, boolean, boolean, int, int, int, int, int, long, java.lang.String, long):void");
    }

    public final void q0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (this.X) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "last download fail ,try again");
            this.f165814x.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        if (!this.W && !android.text.TextUtils.isEmpty(this.V)) {
            this.f165814x.j(this.V);
            this.W = true;
        }
        this.B.post(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c7(this));
        this.D = java.lang.System.currentTimeMillis();
        this.F++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final void r0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (this.F1 == null) {
                this.F1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v7();
            }
            this.F1.f165572a += jSONObject.optInt(dm.n.COL_EXPOSURECOUNT);
            this.F1.f165573b += jSONObject.optLong("stayTime");
            this.F1.f165574c += jSONObject.optInt("clickCount");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("btnInfo");
            this.F1.f165575d = optJSONObject.optString("cid");
            this.F1.f165576e += optJSONObject.optInt(dm.n.COL_EXPOSURECOUNT);
            this.F1.f165577f += optJSONObject.optLong("stayTime");
            this.F1.f165578g += optJSONObject.optInt("clickCount");
        } catch (java.lang.Throwable th6) {
            this.F1 = null;
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final void s0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.B.post(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s7(this, i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public final void t0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.Z.setIsPlay(z17);
            this.Z.getPlayBtn().getLayoutParams().width = this.f165818y0;
            this.Z.getPlayBtn().getLayoutParams().height = this.f165818y0;
            android.content.Context context = this.A;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "startPlay");
                this.Z.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_on));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "pausePlay");
                this.Z.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_off));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return com.tencent.mm.R.layout.cpx;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public long w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        long w17 = super.w() + this.G1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return w17;
    }
}
