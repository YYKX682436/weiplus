package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f114657d;

    public v4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        this.f114657d = a5Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f114657d;
        if (itemId == a5Var.U) {
            com.tencent.mm.plugin.finder.live.plugin.a5.t1(a5Var);
        }
    }
}
