package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.LiteAppGameTabUI f141731d;

    public q6(com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI) {
        this.f141731d = liteAppGameTabUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI = this.f141731d;
        liteAppGameTabUI.X6(liteAppGameTabUI.getIntent());
    }
}
