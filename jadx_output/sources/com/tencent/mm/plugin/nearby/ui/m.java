package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI f152177d;

    public m(com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI) {
        this.f152177d = nearbyFriendShowSayHiUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI = this.f152177d;
        nearbyFriendShowSayHiUI.hideVKB();
        nearbyFriendShowSayHiUI.finish();
        return true;
    }
}
