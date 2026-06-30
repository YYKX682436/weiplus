package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class y implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f206015d;

    /* renamed from: e, reason: collision with root package name */
    public final qs5.n f206016e;

    /* renamed from: f, reason: collision with root package name */
    public final qs5.n f206017f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206018g;

    public y(com.tencent.mm.storage.f9 f9Var) {
        this.f206015d = f9Var;
        qs5.n nVar = qs5.n.f366447g;
        this.f206016e = nVar;
        this.f206017f = nVar;
        ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
        if (v17 != null) {
            r45.g92 g92Var = ((zy2.c) v17.y(zy2.c.class)).f477359b;
            qs5.n Wj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Wj(g92Var, false);
            this.f206016e = Wj;
            qs5.n Wj2 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Wj(g92Var, true);
            this.f206017f = Wj2;
            com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", "localLiveState:" + Wj + ", cacheLiveState:" + Wj2);
        }
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.y yVar = (com.tencent.mm.ui.chatting.viewitems.y) obj;
        if (this.f206015d != null) {
            if ((yVar != null ? yVar.f206015d : null) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needInvalidate:");
                sb6.append(this.f206018g);
                sb6.append(", old.localLiveState:");
                qs5.n nVar = this.f206016e;
                sb6.append(nVar);
                sb6.append(", new.localLiveState:");
                sb6.append(yVar.f206016e);
                sb6.append(", new.cacheLiveState:");
                qs5.n nVar2 = yVar.f206017f;
                sb6.append(nVar2);
                com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", sb6.toString());
                if (!this.f206018g && (nVar2 != yVar.f206016e || nVar2 != nVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
