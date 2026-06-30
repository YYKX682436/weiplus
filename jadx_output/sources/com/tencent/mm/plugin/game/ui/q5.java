package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class q5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameRegionSelectUI f141730d;

    public q5(com.tencent.mm.plugin.game.ui.GameRegionSelectUI gameRegionSelectUI) {
        this.f141730d = gameRegionSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.game.ui.GameRegionSelectUI gameRegionSelectUI = this.f141730d;
        gameRegionSelectUI.setResult(0);
        gameRegionSelectUI.hideVKB();
        gameRegionSelectUI.finish();
        return true;
    }
}
