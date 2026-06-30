package s61;

/* loaded from: classes8.dex */
public class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI f403381d;

    public o0(com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI) {
        this.f403381d = recommendFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI = this.f403381d;
        int length = recommendFriendUI.f73163e.a().length;
        db5.e1.u(recommendFriendUI.getContext(), recommendFriendUI.getContext().getResources().getQuantityString(com.tencent.mm.R.plurals.f489682s, length, java.lang.Integer.valueOf(length)), recommendFriendUI.getString(com.tencent.mm.R.string.f490573yv), new s61.m0(this), new s61.n0(this));
        return true;
    }
}
