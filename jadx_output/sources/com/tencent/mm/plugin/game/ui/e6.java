package com.tencent.mm.plugin.game.ui;

/* loaded from: classes15.dex */
public class e6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameSearchUI f141377d;

    public e6(com.tencent.mm.plugin.game.ui.GameSearchUI gameSearchUI) {
        this.f141377d = gameSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f141377d.onBackPressed();
        return true;
    }
}
