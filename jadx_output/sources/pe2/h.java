package pe2;

/* loaded from: classes3.dex */
public final class h extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f353630p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f353631q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        K0(8);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.btu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById;
        this.f353630p = mMPAGView;
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.X1));
        mMPAGView.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        ((mm2.l0) P0(mm2.l0.class)).f329216r = false;
        t1(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        mm2.l0 l0Var = (mm2.l0) P0(mm2.l0.class);
        l0Var.f329211m.observe(this, new pe2.c(this));
        ((mm2.w) P0(mm2.w.class)).f329503o.observe(this, new pe2.e(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "hideCheerAnimation: " + w0());
        com.tencent.mm.view.MMPAGView mMPAGView = this.f353630p;
        if (z17) {
            if (mMPAGView.getVisibility() == 0) {
                this.f365323d.animate().alpha(0.0f).setDuration(1000L).setListener(new pe2.b(this)).start();
            } else {
                mMPAGView.n();
            }
            mm2.l0 l0Var = (mm2.l0) P0(mm2.l0.class);
            com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", "notifyCheerBtnAnimationShow");
            l0Var.f329212n.postValue(l0Var.f329210i.getValue());
        } else {
            mMPAGView.setVisibility(8);
            mMPAGView.n();
        }
        kotlinx.coroutines.r2 r2Var = this.f353631q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.l0) P0(mm2.l0.class)).f329216r = true;
    }
}
