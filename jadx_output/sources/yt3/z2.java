package yt3;

/* loaded from: classes10.dex */
public final class z2 extends yt3.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f465737d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465738e;

    /* renamed from: f, reason: collision with root package name */
    public final zt3.a f465739f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton f465740g;

    /* renamed from: h, reason: collision with root package name */
    public int f465741h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f465742i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f465743m;

    /* renamed from: n, reason: collision with root package name */
    public final int f465744n;

    /* renamed from: o, reason: collision with root package name */
    public long f465745o;

    public z2(android.widget.RelativeLayout layout, ju3.d0 status, zt3.a kitContext) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        this.f465737d = layout;
        this.f465738e = status;
        this.f465739f = kitContext;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.lok);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f465740g = (com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton) findViewById;
        this.f465741h = 10000;
        this.f465743m = true;
        this.f465744n = 1000;
        this.f465745o = -1L;
        kitContext.R6(new yt3.t2(this));
    }

    @Override // yt3.b
    public void a() {
    }

    @Override // yt3.b
    public void b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f465741h = config.f155685w + 500;
        java.lang.Boolean enablePicture = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture, "enablePicture");
        this.f465742i = enablePicture.booleanValue();
        java.lang.Boolean enableVideo = config.f155682t;
        kotlin.jvm.internal.o.f(enableVideo, "enableVideo");
        boolean booleanValue = enableVideo.booleanValue();
        int i17 = this.f465741h;
        yt3.u2 u2Var = new yt3.u2(this);
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f465740g;
        improveMMSightRecordButton.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setInitData >> 100, " + i17);
        improveMMSightRecordButton.D = 100;
        improveMMSightRecordButton.E = i17;
        improveMMSightRecordButton.F = u2Var;
        improveMMSightRecordButton.I = booleanValue;
        java.lang.Boolean enablePicture2 = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture2, "enablePicture");
        if (enablePicture2.booleanValue()) {
            improveMMSightRecordButton.setSimpleTapCallback(new yt3.v2(this));
        }
        java.lang.Boolean enableVideo2 = config.f155682t;
        kotlin.jvm.internal.o.f(enableVideo2, "enableVideo");
        if (enableVideo2.booleanValue()) {
            improveMMSightRecordButton.setLongPressCallback(new yt3.w2(this));
            improveMMSightRecordButton.setLongPressScrollCallback(new yt3.x2(this));
        }
        improveMMSightRecordButton.setDelayCountDownCallback(new yt3.y2(this));
        java.lang.Boolean enablePicture3 = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture3, "enablePicture");
        boolean booleanValue2 = enablePicture3.booleanValue();
        android.widget.RelativeLayout relativeLayout = this.f465737d;
        zt3.a aVar = this.f465739f;
        if (booleanValue2) {
            java.lang.Boolean enableVideo3 = config.f155682t;
            kotlin.jvm.internal.o.f(enableVideo3, "enableVideo");
            if (enableVideo3.booleanValue()) {
                aVar.X6(new ku3.n0(1, 2, i65.a.r(relativeLayout.getContext(), com.tencent.mm.R.string.f492543gw4)));
                return;
            }
        }
        java.lang.Boolean enablePicture4 = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture4, "enablePicture");
        if (enablePicture4.booleanValue()) {
            aVar.X6(new ku3.n0(1, 2, i65.a.r(relativeLayout.getContext(), com.tencent.mm.R.string.f492544gw5)));
            return;
        }
        java.lang.Boolean enableVideo4 = config.f155682t;
        kotlin.jvm.internal.o.f(enableVideo4, "enableVideo");
        if (enableVideo4.booleanValue()) {
            aVar.X6(new ku3.n0(1, 2, i65.a.r(relativeLayout.getContext(), com.tencent.mm.R.string.gw6)));
        }
    }

    @Override // yt3.b
    public boolean c() {
        return this.f465740g.f149162u;
    }

    @Override // yt3.b
    public void d() {
        if (this.f465742i) {
            ju3.d0.k(this.f465738e, ju3.c0.f301901s, null, 2, null);
        } else {
            this.f465739f.X6(new ku3.n0(1, 3, i65.a.r(this.f465737d.getContext(), com.tencent.mm.R.string.ht8)));
        }
    }

    @Override // yt3.b
    public void e(int i17) {
        this.f465740g.setProgressBarVisible(i17);
    }

    @Override // yt3.b
    public void f(boolean z17) {
        this.f465740g.setEnableCallback(z17);
    }

    @Override // yt3.b
    public void g(boolean z17) {
        this.f465743m = z17;
    }

    @Override // yt3.b
    public void h(int i17, int i18) {
        this.f465740g.g(i17, i18);
    }

    @Override // yt3.b
    public void i(boolean z17) {
        this.f465740g.setTouchEnable(z17);
    }

    @Override // yt3.b
    public void j(android.view.View.OnClickListener clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
    }

    @Override // yt3.b
    public void k() {
    }

    public final void m(boolean z17) {
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f465740g;
        improveMMSightRecordButton.setTouchEnable(false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z17);
        this.f465738e.w(ju3.c0.f301887m, bundle);
        improveMMSightRecordButton.announceForAccessibility(i65.a.r(improveMMSightRecordButton.getContext(), com.tencent.mm.R.string.f489973h2));
    }

    public final void n(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "startRecord is Auto >> " + z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z17);
        this.f465738e.w(ju3.c0.f301881i, bundle);
    }

    @Override // yt3.r2
    public void onAttach() {
        this.f465737d.setVisibility(0);
    }

    @Override // yt3.r2
    public void onDetach() {
        this.f465737d.setVisibility(4);
    }

    @Override // yt3.r2
    public void reset() {
        this.f465740g.setTouchEnable(true);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465740g.setVisibility(i17);
        if (this.f465743m) {
            this.f465737d.bringToFront();
        }
    }
}
