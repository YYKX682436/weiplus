package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class u2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI f141785d;

    public u2(com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI) {
        this.f141785d = gameDownloadGuidanceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f141785d.finish();
        return true;
    }
}
