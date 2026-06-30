package tb5;

@yn.c(exportInterface = tb5.m0.class)
/* loaded from: classes12.dex */
public final class y extends com.tencent.mm.ui.chatting.component.a implements tb5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f417104e;

    /* renamed from: f, reason: collision with root package name */
    public final tb5.v f417105f = new tb5.v();

    /* renamed from: g, reason: collision with root package name */
    public final tb5.w f417106g = new tb5.w(this);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (this.f417104e) {
            android.view.ViewGroup view = this.f198580d.p().f();
            kotlin.jvm.internal.o.g(view, "view");
            tb5.w listener = this.f417106g;
            kotlin.jvm.internal.o.g(listener, "listener");
            if (ih.d.c() && (view instanceof androidx.recyclerview.widget.RecyclerView)) {
                java.lang.Object tag = view.getTag(com.tencent.mm.R.id.mca);
                if ((tag instanceof tb5.l0 ? (tb5.l0) tag : null) == null) {
                    tb5.l0 l0Var = new tb5.l0("chatting", null, listener, 2, null);
                    ((androidx.recyclerview.widget.RecyclerView) view).i(l0Var);
                    view.setTag(com.tencent.mm.R.id.mca, l0Var);
                }
            }
            tb5.v vVar = this.f417105f;
            vVar.getClass();
            vVar.f417090g.f417041d = java.lang.System.currentTimeMillis() - vVar.f417087d;
            vVar.f417085b.f();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        m0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (this.f417104e) {
            tb5.v vVar = this.f417105f;
            vVar.getClass();
            vVar.f417091h.f417041d = java.lang.System.currentTimeMillis() - vVar.f417088e;
            vVar.f417086c.f();
            m0();
            this.f198580d.q().postDelayed(new tb5.x(this, this.f198580d.x()), 50L);
            com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager.f201933w = null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        if (this.f417104e) {
            tb5.v vVar = this.f417105f;
            vVar.getClass();
            vVar.f417088e = java.lang.System.currentTimeMillis();
            tb5.j0 j0Var = vVar.f417086c;
            j0Var.getClass();
            ((com.tencent.mm.feature.performance.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(j0Var);
            wu5.c cVar = vVar.f417089f;
            if (cVar != null) {
                cVar.cancel(false);
            }
            vVar.f417089f = null;
            vVar.f417084a = false;
        }
    }

    public final void m0() {
        android.view.ViewGroup view = this.f198580d.p().f();
        kotlin.jvm.internal.o.g(view, "view");
        if (ih.d.c() && (view instanceof androidx.recyclerview.widget.RecyclerView)) {
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.mca);
            tb5.l0 l0Var = tag instanceof tb5.l0 ? (tb5.l0) tag : null;
            if (l0Var != null) {
                l0Var.f417068e.f();
                ((androidx.recyclerview.widget.RecyclerView) view).V0(l0Var);
                view.setTag(com.tencent.mm.R.id.mca, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigScrollFpsDetector()) == 1;
        this.f417104e = z17;
        if (z17) {
            tb5.v vVar = this.f417105f;
            com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager.f201933w = vVar;
            vVar.getClass();
            vVar.f417087d = java.lang.System.currentTimeMillis();
            tb5.j0 j0Var = vVar.f417085b;
            j0Var.getClass();
            ((com.tencent.mm.feature.performance.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(j0Var);
        }
    }
}
