package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.b0 f139946d;

    public w(com.tencent.mm.plugin.game.luggage.page.b0 b0Var) {
        this.f139946d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = this.f139946d;
        b0Var.getSettings().q(true);
        b0Var.setWebViewClientProxy(new com.tencent.mm.plugin.game.luggage.page.a0(b0Var));
        b0Var.setWebChromeClientProxy(new com.tencent.mm.plugin.game.luggage.page.z(b0Var));
    }
}
