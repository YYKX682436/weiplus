package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class f5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameMessageUI f141387d;

    public f5(com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI) {
        this.f141387d = gameMessageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.game.ui.GameMessageUI.f140930w;
        com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI = this.f141387d;
        gameMessageUI.getClass();
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().T1();
        gameMessageUI.finish();
        return true;
    }
}
