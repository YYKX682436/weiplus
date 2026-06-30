package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.o0 f141466d;

    public m0(com.tencent.mm.plugin.game.ui.o0 o0Var) {
        this.f141466d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.o0 o0Var = this.f141466d;
        if (o0Var.f141689d.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.game.ui.GameCenterUI5 gameCenterUI5 = o0Var.f141689d;
        gameCenterUI5.f140727z = r53.f.e(gameCenterUI5);
        o0Var.f141689d.f140727z.show();
    }
}
