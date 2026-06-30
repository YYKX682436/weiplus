package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120748d;

    public p0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120748d = t0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120748d;
        if (i17 == 0) {
            ((com.tencent.mm.plugin.finder.live.wish.widget.e) ((jz5.n) t0Var.f120776J).getValue()).y(t0Var.f120781r, t0Var.f120783t, t0Var.f120784u, t0Var.f120788y);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kn2.c cVar = t0Var.f120777n;
        com.tencent.mm.plugin.finder.live.wish.widget.n0 n0Var = new com.tencent.mm.plugin.finder.live.wish.widget.n0(t0Var);
        com.tencent.mm.plugin.finder.live.wish.widget.o0 o0Var = new com.tencent.mm.plugin.finder.live.wish.widget.o0(t0Var);
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = (com.tencent.mm.plugin.finder.live.plugin.wn0) cVar;
        wn0Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "deleteInteractionWish with callback: " + wn0Var.f114980w);
        if (wn0Var.C1()) {
            com.tencent.mm.plugin.finder.live.util.y.m(wn0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.sn0(wn0Var, 2, null, n0Var, o0Var, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "deleteInteractionWish ignore as interactiveWish disable.");
            o0Var.invoke(null, null, null);
        }
    }
}
