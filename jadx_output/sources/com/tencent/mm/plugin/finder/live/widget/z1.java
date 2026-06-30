package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x1 f120491d;

    public z1(com.tencent.mm.plugin.finder.live.widget.x1 x1Var) {
        this.f120491d = x1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.CoLiveSettlementModeSelect", "menu selected: " + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.widget.x1 x1Var = this.f120491d;
        if (itemId == 0) {
            ((com.tencent.mm.plugin.finder.live.widget.xb) x1Var).a(com.tencent.mm.plugin.finder.live.widget.d80.f118087e);
        } else {
            if (itemId != 1) {
                return;
            }
            ((com.tencent.mm.plugin.finder.live.widget.xb) x1Var).a(com.tencent.mm.plugin.finder.live.widget.d80.f118088f);
        }
    }
}
