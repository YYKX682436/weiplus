package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ag extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f133773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f133774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f133775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView, long j17) {
        super(0);
        this.f133773d = finderLinearLayoutManager;
        this.f133774e = recyclerView;
        this.f133775f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vo2.d player;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        in5.c cVar;
        androidx.recyclerview.widget.k3 p07 = this.f133774e.p0(this.f133773d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        long itemId = (s0Var == null || (cVar = (in5.c) s0Var.f293125i) == null) ? 0L : cVar.getItemId();
        boolean z17 = false;
        boolean z18 = s0Var != null && s0Var.getItemViewType() == 4;
        long j17 = this.f133775f;
        if (z18) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "[checkSeek] video feedId=" + pm0.v.u(itemId) + " seekTime=" + j17);
            ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).N6(itemId);
            java.lang.Object obj = s0Var.f293125i;
            so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
            if (u1Var != null) {
                u1Var.f410632f = true;
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
            if (finderVideoLayout != null) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, this.f133775f, 3, 0.0f, false, null, 28, null);
            }
        } else {
            if (s0Var != null && s0Var.getItemViewType() == 2) {
                z17 = true;
            }
            if (z17 && j17 > 0) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "[checkSeek] photo feedId=" + pm0.v.u(itemId) + " seekTime=" + j17);
                com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = (com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) s0Var.p(com.tencent.mm.R.id.agy);
                if (finderImgFeedMusicTag != null && (player = finderImgFeedMusicTag.getPlayer()) != null && (finderThumbPlayerProxy = ((vo2.c) player).f438559b) != null) {
                    finderThumbPlayerProxy.f0(j17, true, 3);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
