package te2;

/* loaded from: classes10.dex */
public final class d3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f417946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i3 f417947e;

    public d3(te2.i3 i3Var, te2.i3 viewCallback) {
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        this.f417947e = i3Var;
        this.f417946d = new java.lang.ref.WeakReference(viewCallback);
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        te2.i3 i3Var = (te2.i3) this.f417946d.get();
        boolean z17 = i3Var == null;
        com.tencent.mars.xlog.Log.i(this.f417947e.f418107h, "onAnimationEnd emptyViewCallback:" + z17);
        if (i3Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar = i3Var.f418103d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(wwVar, kotlinx.coroutines.internal.b0.f310484a, null, new te2.c3(i3Var, this, null), 2, null);
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
