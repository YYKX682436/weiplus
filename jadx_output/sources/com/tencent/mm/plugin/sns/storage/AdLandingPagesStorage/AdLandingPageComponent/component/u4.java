package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class u4 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 implements java.io.Serializable {
    public int A;
    public int B;
    public int C;
    public volatile boolean D;
    public boolean E;
    public com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar F;
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 G;
    public final android.os.HandlerThread H;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t4 I;

    /* renamed from: J */
    public final boolean f165531J;
    public boolean K;
    public final java.lang.String L;
    public final java.lang.String M;
    public final java.lang.String N;
    public final java.lang.String P;
    public volatile boolean Q;
    public final java.lang.String R;
    public final java.lang.String S;
    public final int T;
    public final java.lang.String U;
    public final java.lang.String V;
    public int W;
    public boolean X;
    public final boolean Y;
    public final android.view.View.OnClickListener Z;

    /* renamed from: p0 */
    public final android.view.View.OnClickListener f165532p0;

    /* renamed from: u */
    public android.view.View f165533u;

    /* renamed from: v */
    public android.widget.Button f165534v;

    /* renamed from: w */
    public android.view.View f165535w;

    /* renamed from: x */
    public android.widget.Button f165536x;

    /* renamed from: x0 */
    public final com.tencent.mm.plugin.sns.model.t f165537x0;

    /* renamed from: y */
    public com.tencent.mm.ui.widget.dialog.u3 f165538y;

    /* renamed from: z */
    public com.tencent.mm.plugin.sns.model.n f165539z;

    public u4(android.content.Context context, ab4.c cVar, android.view.ViewGroup viewGroup) {
        super(context, cVar, viewGroup);
        this.E = true;
        this.K = true;
        java.lang.String str = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.P = "";
        this.Q = false;
        this.R = "";
        this.S = "";
        this.U = "";
        this.V = "";
        this.W = 2;
        this.X = false;
        this.Y = false;
        this.Z = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c3(this);
        this.f165532p0 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d3(this);
        this.f165537x0 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f3(this);
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("apkStateMachine", 5);
        this.H = a17;
        a17.start();
        this.G = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4(this, "apkStateMachine", a17.getLooper());
        if (context instanceof android.app.Activity) {
            boolean booleanExtra = ((android.app.Activity) context).getIntent().getBooleanExtra("sns_landing_pages_auto_download_for_action_btn", false);
            this.f165531J = booleanExtra;
            this.K = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "autoDownloadFromActionBtn=" + booleanExtra + ", activity=" + context + ", idx=" + s0().V1 + ", appId=" + s0().B1 + ", wxAppid=" + s0().C1 + ", useGameDownloader=" + s0().F1 + ", pkg=" + s0().H1);
        }
        this.f165386t.a("platform", cVar.J1);
        this.f165386t.b("appid", cVar.B1);
        this.f165386t.b(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, cVar.D1);
        this.f165386t.b("pkg", cVar.H1);
        this.f165386t.b("appPageUrlAndroid", cVar.U1);
        try {
            java.lang.String str2 = s0().B1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.L = str2 == null ? "" : str2;
            java.lang.String o17 = u().o();
            this.M = o17 == null ? "" : o17;
            java.lang.String a18 = u().a();
            this.N = a18 == null ? "" : a18;
            this.P = u().k();
            java.lang.String c17 = u().c();
            this.R = c17 == null ? "" : c17;
            java.lang.String q17 = u().q();
            this.S = q17 == null ? "" : q17;
            this.T = u().l();
            java.lang.String m17 = u().m();
            this.U = m17 == null ? "" : m17;
            java.lang.String e17 = u().e();
            if (e17 != null) {
                str = e17;
            }
            this.V = str;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadApkBtnComp.DownloadToastReport", th6.toString());
        }
        if (s0().f2823m > 0.0f && s0().f2823m != 2.1474836E9f && s0().f2824n > 0.0f && s0().f2824n != 2.1474836E9f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            this.X = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        }
        this.Y = za4.k.l();
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 U(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = u4Var.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return s4Var;
    }

    public static /* synthetic */ ab4.c V(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        ab4.c s07 = u4Var.s0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return s07;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar W(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar snsTextProgressBar = u4Var.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return snsTextProgressBar;
    }

    public static /* synthetic */ android.widget.Button X(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        android.widget.Button button = u4Var.f165534v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return button;
    }

    public static /* synthetic */ boolean Y(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        boolean z17 = u4Var.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return z17;
    }

    public static /* synthetic */ int Z(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int i17 = u4Var.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i17;
    }

    public static /* synthetic */ int a0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        u4Var.W = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i17;
    }

    public static /* synthetic */ java.lang.String b0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.P;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String c0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String d0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String e0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String g0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ int h0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int i17 = u4Var.T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i17;
    }

    public static /* synthetic */ java.lang.String i0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String j0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String l0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static boolean m0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        u4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        boolean z17 = false;
        try {
            boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(u4Var.f165049d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            boolean isFreeSimCard = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isFreeSimCard();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "isNeedShowNetworkTip, isWifi=" + isWifi + ", isFreeSimCard=" + isFreeSimCard);
            if (isWifi) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 2);
            } else if (isFreeSimCard) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 3);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 4);
            }
            if (!isWifi && !isFreeSimCard) {
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadApkBtnComp", "isNeedShowNetworkTip exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 n0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = u4Var.f165538y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return u3Var;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.model.n o0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.tencent.mm.plugin.sns.model.n nVar = u4Var.f165539z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return nVar;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.model.n p0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var, com.tencent.mm.plugin.sns.model.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        u4Var.f165539z = nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return nVar;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        super.K();
        this.G.l(2);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().addReportInfo(s0().B1, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3(this.R, this.U, this.M, this.V, this.T, this.N, this.S, this.W, 4, 2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        super.L();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "view destroy");
        this.H.quit();
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t4 t4Var = this.I;
            if (t4Var != null) {
                this.f165049d.unregisterReceiver(t4Var);
                this.I = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "viewWillDestroy, unregisterReceiver");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadApkBtnComp", "unregister package receiver failed, exp is " + th6);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1958L, 33L, r());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        S(0);
        android.view.View view = this.f165056n;
        this.f165533u = view.findViewById(com.tencent.mm.R.id.d48);
        this.f165534v = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f484115d31);
        this.f165535w = view.findViewById(com.tencent.mm.R.id.d0v);
        this.f165536x = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b5i);
        android.widget.Button button = this.f165534v;
        android.view.View.OnClickListener onClickListener = this.Z;
        button.setOnClickListener(onClickListener);
        com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar snsTextProgressBar = (com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar) view.findViewById(com.tencent.mm.R.id.d3u);
        this.F = snsTextProgressBar;
        snsTextProgressBar.setProgress(0);
        this.F.setVisibility(8);
        this.F.setOnClickListener(onClickListener);
        this.f165536x.setOnClickListener(this.f165532p0);
        this.G.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        try {
            ab4.c s07 = s0();
            if (s07.Y1 > 0) {
                if (da4.a.f(s07.Z1)) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.o0(u(), 4, "0", "");
                } else {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.o0(u(), 4, "1", "");
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.o0(u(), 1, "1", "");
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageDownloadApkBtnComp", "report19790 has something wrong");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        q0();
        if (s0().f2830t > 0.0f) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f165533u.getLayoutParams();
            layoutParams.height = (int) s0().f2830t;
            this.f165533u.setLayoutParams(layoutParams);
        }
        this.f165534v.setText(s0().F);
        android.widget.Button button = this.f165536x;
        android.content.Context context = this.f165049d;
        button.setText(context.getString(com.tencent.mm.R.string.j6i));
        this.f165534v.setPadding(0, 0, 0, 0);
        this.f165536x.setPadding(0, 0, 0, 0);
        l44.f4.e(context, s0(), this.f165534v);
        this.G.l(11);
        this.f165056n.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e3(this));
        if (this.X) {
            android.widget.Button button2 = this.f165534v;
            if (button2 != null) {
                button2.setMaxLines(1);
                androidx.core.widget.a0.b(this.f165534v, 1, (int) s0().f2893J, 1, 0);
            }
            android.widget.Button button3 = this.f165536x;
            if (button3 != null) {
                button3.setMaxLines(1);
                androidx.core.widget.a0.b(this.f165536x, 1, (int) s0().f2893J, 1, 0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    public final void q0() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.util.HashMap hashMap = (java.util.HashMap) t0();
        int parseColor = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontNormalColor"));
        int parseColor2 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontDisableColor"));
        int parseColor3 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontPressedColor"));
        int parseColor4 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("NormalColor"));
        int parseColor5 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("PressedColor"));
        int parseColor6 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("DisableColor"));
        int i18 = (int) s0().K;
        int parseColor7 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderNormalColor"));
        int parseColor8 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderPressedColor"));
        int parseColor9 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderDisableColor"));
        int dimensionPixelSize = this.f165049d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479582y);
        if (s0().Y > 0.0f) {
            dimensionPixelSize = (int) s0().Y;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        float f17 = dimensionPixelSize;
        gradientDrawable.setCornerRadius(f17);
        gradientDrawable.setColor(parseColor6);
        gradientDrawable.setStroke(i18, parseColor9);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f17);
        gradientDrawable2.setColor(parseColor5);
        gradientDrawable2.setStroke(i18, parseColor8);
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f17);
        gradientDrawable3.setColor(parseColor4);
        gradientDrawable3.setStroke(i18, parseColor7);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable3);
        this.f165534v.setBackground(stateListDrawable);
        this.f165534v.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}}, new int[]{parseColor2, parseColor3, parseColor}));
        if (s0().f2893J > 0.0f) {
            i17 = 0;
            this.f165534v.setTextSize(0, s0().f2893J);
        } else {
            i17 = 0;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable4 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable4.setShape(i17);
        gradientDrawable4.setCornerRadius(f17);
        gradientDrawable4.setColor(parseColor5);
        gradientDrawable4.setStroke(i18, parseColor8);
        android.graphics.drawable.GradientDrawable gradientDrawable5 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable5.setShape(i17);
        gradientDrawable5.setCornerRadius(f17);
        gradientDrawable5.setColor(parseColor4);
        android.graphics.drawable.ClipDrawable clipDrawable = new android.graphics.drawable.ClipDrawable(gradientDrawable5, 3, 1);
        android.graphics.drawable.GradientDrawable gradientDrawable6 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable6.setShape(i17);
        gradientDrawable6.setCornerRadius(f17);
        gradientDrawable6.setColor(parseColor4);
        android.graphics.drawable.ClipDrawable clipDrawable2 = new android.graphics.drawable.ClipDrawable(gradientDrawable6, 3, 1);
        android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[3];
        drawableArr[i17] = gradientDrawable4;
        drawableArr[1] = clipDrawable;
        drawableArr[2] = clipDrawable2;
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(drawableArr);
        layerDrawable.setId(i17, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        this.F.setProgressDrawable(layerDrawable);
        this.F.setPaintColor(s0().T1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    public android.widget.Button r0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        android.widget.Button button = this.f165534v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return button;
    }

    public final ab4.c s0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        ab4.c cVar = (ab4.c) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return cVar;
    }

    public final java.util.Map t0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fontNormalColor", x0(s0().R1, "#FFFFFF"));
        hashMap.put("fontDisableColor", x0(s0().S1, "#4CFFFFFF"));
        hashMap.put("fontPressedColor", x0(s0().T1, "#99FFFFFF"));
        hashMap.put("NormalColor", x0(s0().L1, "#1AAD19"));
        hashMap.put("PressedColor", x0(s0().N1, "#179B16"));
        hashMap.put("DisableColor", x0(s0().M1, "#661AAD19"));
        hashMap.put("borderNormalColor", x0(s0().O1, "#179E16"));
        hashMap.put("borderPressedColor", x0(s0().Q1, "#158E14"));
        hashMap.put("borderDisableColor", x0(s0().P1, "#00179E16"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return hashMap;
    }

    public void u0(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        android.widget.RelativeLayout.LayoutParams layoutParams;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeDownloadContainerSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        this.D = z17;
        if (this.A <= 0 || this.B <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeDownloadContainerSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "resizeDownloadContainerSize, width is " + this.A + ", height is " + this.B + ", needShowCancelBtn is " + this.D);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f165533u.getLayoutParams();
        if (this.D) {
            layoutParams2.width = this.A / 2;
            layoutParams2.height = this.B;
            this.f165533u.setLayoutParams(layoutParams2);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f165536x.getLayoutParams();
            layoutParams3.width = this.A / 2;
            layoutParams3.height = this.B;
            this.f165536x.setLayoutParams(layoutParams3);
            this.f165536x.setVisibility(0);
            this.F.setTextSize(i65.a.c(this.f165049d, this.C));
        } else {
            this.f165536x.setVisibility(8);
            layoutParams2.width = this.A;
            layoutParams2.height = this.B;
            this.f165533u.setLayoutParams(layoutParams2);
            this.F.setTextSize(i65.a.c(this.f165049d, 18));
        }
        if (this.E) {
            boolean z18 = this.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            java.util.HashMap hashMap = (java.util.HashMap) t0();
            int parseColor = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontNormalColor"));
            int parseColor2 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontDisableColor"));
            int parseColor3 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontPressedColor"));
            int parseColor4 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("NormalColor"));
            int parseColor5 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("PressedColor"));
            int parseColor6 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("DisableColor"));
            int i18 = (int) s0().K;
            int parseColor7 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderNormalColor"));
            int parseColor8 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderPressedColor"));
            str = "resizeDownloadContainerSize";
            int parseColor9 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderDisableColor"));
            layoutParams = layoutParams2;
            int dimensionPixelSize = this.f165049d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479582y);
            if (s0().Y > 0.0f) {
                dimensionPixelSize = (int) s0().Y;
            }
            float f17 = dimensionPixelSize;
            float[] fArr = {f17, f17, 0.0f, 0.0f, 0.0f, 0.0f, f17, f17};
            if (z18) {
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(parseColor6);
                gradientDrawable.setCornerRadii(fArr);
                android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(parseColor5);
                gradientDrawable2.setCornerRadii(fArr);
                android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setColor(parseColor4);
                gradientDrawable3.setCornerRadii(fArr);
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
                stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable3);
                this.f165534v.setBackground(stateListDrawable);
                android.graphics.drawable.GradientDrawable gradientDrawable4 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setColor(parseColor6);
                gradientDrawable4.setCornerRadius(f17);
                gradientDrawable4.setStroke(i18, parseColor9);
                android.graphics.drawable.GradientDrawable gradientDrawable5 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable5.setShape(0);
                gradientDrawable5.setColor(parseColor5);
                gradientDrawable5.setCornerRadius(f17);
                gradientDrawable5.setStroke(i18, parseColor8);
                android.graphics.drawable.GradientDrawable gradientDrawable6 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable6.setShape(0);
                gradientDrawable6.setColor(parseColor4);
                gradientDrawable6.setCornerRadius(f17);
                gradientDrawable6.setStroke(i18, parseColor7);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable2.addState(new int[]{-16842910}, gradientDrawable4);
                stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable5);
                stateListDrawable2.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable6);
                this.f165056n.setBackground(stateListDrawable2);
                int[] iArr = {parseColor2, parseColor3, parseColor};
                int[][] iArr2 = {new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}};
                this.f165534v.setTextColor(new android.content.res.ColorStateList(iArr2, iArr));
                android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(iArr2, iArr);
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCancelBtnStyles", str2);
                float[] fArr2 = {0.0f, 0.0f, f17, f17, f17, f17, 0.0f, 0.0f};
                android.graphics.drawable.GradientDrawable gradientDrawable7 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable7.setShape(0);
                gradientDrawable7.setColor(parseColor6);
                gradientDrawable7.setCornerRadii(fArr2);
                android.graphics.drawable.GradientDrawable gradientDrawable8 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable8.setShape(0);
                gradientDrawable8.setColor(parseColor5);
                gradientDrawable8.setCornerRadii(fArr2);
                android.graphics.drawable.GradientDrawable gradientDrawable9 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable9.setShape(0);
                gradientDrawable9.setColor(parseColor4);
                gradientDrawable9.setCornerRadii(fArr2);
                android.graphics.drawable.StateListDrawable stateListDrawable3 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable3.addState(new int[]{-16842910}, gradientDrawable7);
                stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable8);
                stateListDrawable3.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable9);
                this.f165536x.setBackground(stateListDrawable3);
                this.f165536x.setTextColor(colorStateList);
                if (s0().f2893J > 0.0f) {
                    this.f165536x.setTextSize(0, s0().f2893J);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCancelBtnStyles", str2);
                android.graphics.drawable.GradientDrawable gradientDrawable10 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable10.setColor(parseColor);
                this.f165535w.setBackground(gradientDrawable10);
                android.view.View view = this.f165535w;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (s0().f2893J > 0.0f) {
                    i17 = 0;
                    this.f165534v.setTextSize(0, s0().f2893J);
                } else {
                    i17 = 0;
                }
                android.graphics.drawable.GradientDrawable gradientDrawable11 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable11.setShape(i17);
                gradientDrawable11.setCornerRadii(fArr);
                gradientDrawable11.setColor(parseColor5);
                android.graphics.drawable.GradientDrawable gradientDrawable12 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable12.setShape(i17);
                gradientDrawable12.setCornerRadii(fArr);
                gradientDrawable12.setColor(parseColor4);
                android.graphics.drawable.ClipDrawable clipDrawable = new android.graphics.drawable.ClipDrawable(gradientDrawable12, 3, 1);
                android.graphics.drawable.GradientDrawable gradientDrawable13 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable13.setShape(i17);
                gradientDrawable13.setCornerRadii(fArr);
                gradientDrawable13.setColor(parseColor4);
                android.graphics.drawable.ClipDrawable clipDrawable2 = new android.graphics.drawable.ClipDrawable(gradientDrawable13, 3, 1);
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[3];
                drawableArr[i17] = gradientDrawable11;
                drawableArr[1] = clipDrawable;
                drawableArr[2] = clipDrawable2;
                android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(drawableArr);
                layerDrawable.setId(i17, android.R.id.background);
                layerDrawable.setId(1, android.R.id.secondaryProgress);
                layerDrawable.setId(2, android.R.id.progress);
                this.F.setProgressDrawable(layerDrawable);
                this.F.setPaintColor(s0().T1);
            } else {
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
                this.f165056n.setBackgroundColor(0);
                android.view.View view2 = this.f165535w;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q0();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configDownloadBtnStyles", str2);
        } else {
            str = "resizeDownloadContainerSize";
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
            layoutParams = layoutParams2;
        }
        android.content.Context context = this.f165049d;
        ab4.c s07 = s0();
        android.widget.Button button = this.f165534v;
        int i19 = layoutParams.width;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (l44.f4.b(context, s07, button)) {
            if (i19 > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                java.lang.String l17 = za4.t0.l("adId", s07.Z);
                if (com.tencent.mm.sdk.platformtools.t8.K0(l17) || !com.tencent.mm.vfs.w6.j(l17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                    java.lang.String str3 = s07.Z;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                    } else {
                        button.hashCode();
                        button.setTag(com.tencent.mm.R.id.n1z, str3);
                        za4.t0.b("adId", str3, false, 41, 0, new l44.c4(button, str3, context, s07, i19));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                } else {
                    com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "icon exists, url = " + s07.Z);
                    l44.f4.d(context, s07, button, l17, i19);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        if (this.X) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return com.tencent.mm.R.layout.cor;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return com.tencent.mm.R.layout.coq;
    }

    public void w0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showApkDownloadBottomSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 90);
        ca4.c0.f(this.P, this.L, 0, 11, this.M, this.N, 1, 1);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i3(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showApkDownloadBottomSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    public final java.lang.String x0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return str2;
        }
        if (!str.matches("#[0-9A-Fa-f]{6}([0-9A-Fa-f]{2})?")) {
            str = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }
}
