package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCenterUI5 f141434d;

    public j0(com.tencent.mm.plugin.game.ui.GameCenterUI5 gameCenterUI5) {
        this.f141434d = gameCenterUI5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f141434d.finish();
        return true;
    }
}
