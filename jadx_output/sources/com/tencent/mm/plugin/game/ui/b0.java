package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCategoryUI f141038d;

    public b0(com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI) {
        this.f141038d = gameCategoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f141038d.finish();
        return true;
    }
}
