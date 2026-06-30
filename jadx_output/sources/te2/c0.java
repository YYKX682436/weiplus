package te2;

/* loaded from: classes10.dex */
public final class c0 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f417910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f417911e;

    public c0(te2.i0 i0Var, te2.i0 viewCallback) {
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        this.f417911e = i0Var;
        this.f417910d = new java.lang.ref.WeakReference(viewCallback);
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        te2.i0 i0Var = (te2.i0) this.f417910d.get();
        boolean z17 = i0Var == null;
        com.tencent.mars.xlog.Log.i(this.f417911e.f418093m, "onAnimationEnd emptyViewCallback:" + z17);
        if (i0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar = i0Var.f418090g;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(wwVar, kotlinx.coroutines.internal.b0.f310484a, null, new te2.b0(i0Var, this, null), 2, null);
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
