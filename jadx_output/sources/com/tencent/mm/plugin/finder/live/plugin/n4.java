package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f113587d;

    public n4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        this.f113587d = a5Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f113587d;
        if (itemId == a5Var.U) {
            com.tencent.mm.plugin.finder.live.plugin.a5.t1(a5Var);
        }
    }
}
