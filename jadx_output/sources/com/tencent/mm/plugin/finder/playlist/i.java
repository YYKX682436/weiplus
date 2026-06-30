package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f122321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer) {
        super(0);
        this.f122321d = finderPlayListDrawer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.vx0 vx0Var;
        r45.xx0 xx0Var;
        com.tencent.mm.plugin.finder.playlist.k kVar = com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.G;
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f122321d;
        if (finderPlayListDrawer.x() && (vx0Var = finderPlayListDrawer.F.f122276a) != null && (xx0Var = (r45.xx0) vx0Var.getCustom(23)) != null) {
            long j17 = xx0Var.getLong(1);
            com.tencent.mm.plugin.finder.playlist.o0 o0Var = finderPlayListDrawer.C;
            if (o0Var != null) {
                o0Var.b(true);
            }
            com.tencent.mm.plugin.finder.playlist.s1 s1Var = finderPlayListDrawer.mPresenter;
            if (s1Var != null) {
                com.tencent.mm.plugin.finder.playlist.l lVar = new com.tencent.mm.plugin.finder.playlist.l(finderPlayListDrawer);
                if (s1Var.k()) {
                    s1Var.o(j17, lVar);
                } else {
                    s1Var.n(java.lang.Long.valueOf(j17), lVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
