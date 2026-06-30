package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class i5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameMessageUI f141423d;

    public i5(com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI) {
        this.f141423d = gameMessageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.game.ui.g5 g5Var = new com.tencent.mm.plugin.game.ui.g5(this);
        com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI = this.f141423d;
        gameMessageUI.f140940t = g5Var;
        gameMessageUI.f140941u = new com.tencent.mm.plugin.game.ui.h5(this);
        db5.e1.n(gameMessageUI.getContext(), com.tencent.mm.R.string.flf, 0, gameMessageUI.f140940t, gameMessageUI.f140941u);
        return false;
    }
}
