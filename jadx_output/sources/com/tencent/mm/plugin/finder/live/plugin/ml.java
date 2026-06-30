package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ml implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113526d;

    public ml(int i17, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i18) {
        this.f113526d = hmVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113526d;
        if (itemId == 1) {
            com.tencent.mm.plugin.finder.live.plugin.hm.u1(hmVar, true);
        } else if (itemId == 2) {
            com.tencent.mm.plugin.finder.live.plugin.hm.u1(hmVar, false);
        }
    }
}
