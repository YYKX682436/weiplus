package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f116241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.e2 f116242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(gk2.e eVar, com.tencent.mm.plugin.finder.live.view.e2 e2Var) {
        super(0);
        this.f116241d = eVar;
        this.f116242e = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yi2.i0 i0Var;
        int i17 = com.tencent.mm.plugin.finder.live.view.e2.f116264p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimerUpdateData linkMicVisitorUserList:");
        gk2.e eVar = this.f116241d;
        sb6.append(eVar != null ? ((mm2.o4) eVar.a(mm2.o4.class)).f329318o : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveApplyLinkAnchorView", sb6.toString());
        if (eVar != null && (i0Var = this.f116242e.f116266i) != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "onUpdateData() called");
            i0Var.l();
            int size = i0Var.f462522h.size();
            wi2.c cVar = i0Var.F;
            if (size > 0) {
                cVar.c(false);
            } else {
                cVar.c(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
