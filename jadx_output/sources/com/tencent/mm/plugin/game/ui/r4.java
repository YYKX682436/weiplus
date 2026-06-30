package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.s4 f141737d;

    public r4(com.tencent.mm.plugin.game.ui.s4 s4Var) {
        this.f141737d = s4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.s4 s4Var = this.f141737d;
        super/*com.tencent.mm.plugin.game.ui.d*/.c(s4Var.f141756d);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameListAdapter", "set size: %d", java.lang.Integer.valueOf(s4Var.f141756d.size()));
    }
}
