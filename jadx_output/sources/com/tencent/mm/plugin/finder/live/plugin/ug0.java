package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ug0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wg0 f114562d;

    public ug0(com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var) {
        this.f114562d = wg0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorClosePlugin", "co-live invitee confirm quit");
            com.tencent.mm.plugin.finder.live.plugin.wg0.t1(this.f114562d);
        }
    }
}
