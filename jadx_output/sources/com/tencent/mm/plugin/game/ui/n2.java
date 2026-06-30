package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI f141672d;

    public n2(com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI gameDetailRankLikedUI) {
        this.f141672d = gameDetailRankLikedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f141672d.finish();
        return true;
    }
}
