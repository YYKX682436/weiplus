package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.q4 f141711d;

    public p4(com.tencent.mm.plugin.game.ui.q4 q4Var) {
        this.f141711d = q4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.q4 q4Var = this.f141711d;
        super/*com.tencent.mm.plugin.game.ui.d*/.a(q4Var.f141728d);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameListAdapter", "add size: %d", java.lang.Integer.valueOf(q4Var.f141728d.size()));
    }
}
