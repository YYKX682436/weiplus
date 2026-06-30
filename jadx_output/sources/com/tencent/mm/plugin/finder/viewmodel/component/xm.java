package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f136475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f136476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f136477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView, long j17) {
        super(0);
        this.f136475d = finderLinearLayoutManager;
        this.f136476e = recyclerView;
        this.f136477f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        in5.c cVar;
        androidx.recyclerview.widget.k3 p07 = this.f136476e.p0(this.f136475d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        long itemId = (s0Var == null || (cVar = (in5.c) s0Var.f293125i) == null) ? 0L : cVar.getItemId();
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "[checkSeek] video feedId=" + pm0.v.u(itemId) + " seekTime=" + this.f136477f);
        ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).N6(itemId);
        java.lang.Object obj = s0Var != null ? (in5.c) s0Var.f293125i : null;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var != null) {
            u1Var.f410632f = true;
        }
        if (s0Var != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, this.f136477f, 3, 0.0f, false, null, 28, null);
        }
        return jz5.f0.f302826a;
    }
}
