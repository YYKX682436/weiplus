package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q7 extends com.tencent.mm.plugin.finder.viewmodel.component.p7 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f135670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.s7 f135671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.finder.viewmodel.component.s7 s7Var, in5.s0 s0Var) {
        super(baseFinderFeed);
        this.f135668e = baseFinderFeed;
        this.f135669f = z17;
        this.f135670g = weakReference;
        this.f135671h = s7Var;
        this.f135672i = s0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.jl2 jl2Var = (r45.jl2) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135668e;
        boolean z17 = this.f135669f;
        if (z17) {
            in5.s0 s0Var = (in5.s0) this.f135670g.get();
            if (s0Var == null) {
                return;
            }
            so2.j5 j5Var = (so2.j5) s0Var.f293125i;
            if (j5Var != null && j5Var.getItemId() != baseFinderFeed.getItemId()) {
                com.tencent.mars.xlog.Log.w("FinderControversialAlertUIC", "error feed: " + j5Var.getItemId() + " != " + baseFinderFeed.getItemId());
                return;
            }
        }
        this.f135671h.O6(this.f135672i, jl2Var, baseFinderFeed, z17);
    }
}
