package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class z2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI f141894d;

    public z2(com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI) {
        this.f141894d = gameDownloadGuidanceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI = this.f141894d;
        com.tencent.mm.game.report.l.c(gameDownloadGuidanceUI.getContext(), 10, 1008, 1, r53.f.v(gameDownloadGuidanceUI.getContext(), gameDownloadGuidanceUI.f140759x, null, null), gameDownloadGuidanceUI.f140700i, null);
        return true;
    }
}
