package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public abstract class y extends com.tencent.mm.plugin.sns.ui.widget.l {
    public android.widget.FrameLayout A;
    public android.widget.FrameLayout B;
    public com.tencent.mm.plugin.sns.storage.SnsInfo C;
    public com.tencent.mm.plugin.sns.ad.widget.adpag.a D;
    public float E;
    public android.content.Context F;
    public final com.tencent.mm.plugin.sns.ad.widget.adpag.p G;
    public final com.tencent.mm.plugin.sns.ad.widget.adpag.r H;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f163366o;

    /* renamed from: p, reason: collision with root package name */
    public final int f163367p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f163368q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f163369r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f163370s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f163371t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f163372u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f163373v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163374w;

    /* renamed from: x, reason: collision with root package name */
    public final android.os.Handler f163375x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f163376y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f163377z;

    public y(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar) {
        super(str, yVar, view);
        this.f163366o = view;
        this.f163367p = i17;
        this.f163368q = z17;
        this.f163369r = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.adpag.t(this));
        this.f163370s = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.adpag.s(this));
        this.f163371t = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.adpag.o(this));
        this.f163372u = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.adpag.u(this));
        this.f163373v = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.adpag.v(this));
        this.f163375x = new android.os.Handler(android.os.Looper.getMainLooper());
        this.G = new com.tencent.mm.plugin.sns.ad.widget.adpag.p(this);
        this.H = new com.tencent.mm.plugin.sns.ad.widget.adpag.r(this);
    }

    public static final /* synthetic */ android.widget.ImageView A(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        android.widget.ImageView C = yVar.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        return C;
    }

    public static final /* synthetic */ android.widget.FrameLayout B(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdGeneralPAGContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        android.widget.FrameLayout frameLayout = yVar.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdGeneralPAGContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        return frameLayout;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.a y(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdBarPAGContainerInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ad.widget.adpag.a aVar = yVar.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdBarPAGContainerInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        return aVar;
    }

    public static final android.widget.LinearLayout z(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        yVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) yVar.f163371t).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        return linearLayout;
    }

    public final android.widget.ImageView C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f163370s).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        return imageView;
    }

    public final com.tencent.mm.plugin.sns.ui.AdFrameLayout D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = (com.tencent.mm.plugin.sns.ui.AdFrameLayout) ((jz5.n) this.f163369r).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        return adFrameLayout;
    }

    public final void E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAndRemovePAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        java.lang.String j17 = j();
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f163374w;
            if (mMPAGView != null) {
                a84.y0.i(mMPAGView);
                com.tencent.mm.view.MMPAGView mMPAGView2 = this.f163374w;
                this.f163374w = null;
                if (mMPAGView2 != null) {
                    mMPAGView2.i(this.H);
                    mMPAGView2.j(this.G);
                    mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.x(this, mMPAGView2));
                }
                com.tencent.mars.xlog.Log.i(j(), "resetAndRemovePAGView success");
            } else {
                com.tencent.mars.xlog.Log.w(j(), "resetAndRemovePAGView, pagView is not created");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAndRemovePAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ad.widget.adpag.d0 d0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        kotlin.jvm.internal.o.g(model, "model");
        android.view.View view = this.f163366o;
        if (view == null || (context = view.getContext()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        } else {
            this.F = context;
            if (!this.f163377z) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdGeneralPAGContainerStub", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f163372u).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdGeneralPAGContainerStub", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                android.view.View h17 = a84.y0.h(viewStub);
                this.A = h17 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h17 : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdGeneralPAGSpaceStub", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                android.view.ViewStub viewStub2 = (android.view.ViewStub) ((jz5.n) this.f163373v).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdGeneralPAGSpaceStub", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                android.view.View h18 = a84.y0.h(viewStub2);
                this.B = h18 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h18 : null;
                this.f163377z = true;
            }
            com.tencent.mars.xlog.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.field_snsId) + ", isSame is " + z17);
            this.C = model;
            com.tencent.mm.plugin.sns.ad.widget.adpag.a aVar = model.getAdXml().adBarPAGContainerInfo;
            if (aVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            } else {
                this.D = aVar;
                this.E = ca4.m0.y(j(), this.F, this.f163367p, this.f163368q);
                com.tencent.mm.plugin.sns.ui.AdFrameLayout D = D();
                if (D != null) {
                    D.setVisibility(0);
                }
                android.widget.FrameLayout frameLayout = this.A;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                android.widget.FrameLayout frameLayout2 = this.B;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                android.widget.ImageView C = C();
                if (C != null) {
                    C.setVisibility(0);
                }
                android.widget.FrameLayout frameLayout3 = this.A;
                if (frameLayout3 != null) {
                    frameLayout3.setAlpha(1.0f);
                }
                com.tencent.mm.plugin.sns.ad.widget.adpag.a aVar2 = this.D;
                a84.m.a((aVar2 == null || (d0Var = aVar2.f163327d) == null) ? null : d0Var.b(), C());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                c(new com.tencent.mm.plugin.sns.ad.widget.adpag.i(this, view));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                kotlinx.coroutines.y0 h19 = h();
                if (h19 != null) {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.l.d(h19, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.sns.ad.widget.adpag.n(model, this, null), 2, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        android.widget.FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout2 = this.B;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        this.f163375x.removeCallbacksAndMessages(null);
        this.f163376y = false;
        E();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
    }
}
