package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI f152203d;

    public r(com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI) {
        this.f152203d = nearbyFriendsIntroUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI = this.f152203d;
        nearbyFriendsIntroUI.hideVKB();
        nearbyFriendsIntroUI.finish();
        return true;
    }
}
