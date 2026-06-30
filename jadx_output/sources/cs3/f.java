package cs3;

/* loaded from: classes10.dex */
public final class f implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final vr3.e0 f222106d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222107e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f222108f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer f222109g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f222110h;

    public f(vr3.e0 presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f222106d = presenter;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        ((vr3.z) this.f222106d).d();
        h().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        cs3.f fVar;
        vr3.e0 e0Var = this.f222106d;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            ((vr3.z) e0Var).d();
            return;
        }
        vr3.z zVar = (vr3.z) e0Var;
        zVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "onAttach");
        zVar.f439668n = this;
        h().l(true);
        g().getRecyclerView().setLayoutFrozen(false);
        if (!zVar.f439670p && (fVar = zVar.f439668n) != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(fVar.g(), null, 1, null);
        }
        zVar.f439672r = true;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout g() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f222108f;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer h() {
        com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer bizProfileServiceInfoDrawer = this.f222109g;
        if (bizProfileServiceInfoDrawer != null) {
            return bizProfileServiceInfoDrawer;
        }
        kotlin.jvm.internal.o.o("serviceInfoDrawer");
        throw null;
    }
}
