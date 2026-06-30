package s61;

/* loaded from: classes8.dex */
public class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI f403383d;

    public p0(com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI) {
        this.f403383d = recommendFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.f73161p;
        com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI = this.f403383d;
        if (recommendFriendUI.f73168m != 0) {
            recommendFriendUI.finish();
            return true;
        }
        if (recommendFriendUI.f73169n || recommendFriendUI.f73170o) {
            recommendFriendUI.finish();
            return true;
        }
        recommendFriendUI.T6();
        return true;
    }
}
