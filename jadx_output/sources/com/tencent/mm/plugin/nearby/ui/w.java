package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes14.dex */
public class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152222d;

    public w(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152222d = nearbyFriendsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f152222d, 1, false);
        k0Var.f211881s = new com.tencent.mm.plugin.nearby.ui.u(this);
        k0Var.f211872n = new com.tencent.mm.plugin.nearby.ui.v(this);
        k0Var.v();
        return true;
    }
}
