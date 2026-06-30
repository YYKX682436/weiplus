package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class x6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.LiteAppGameTabUI f141867e;

    public x6(com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI, java.lang.String str) {
        this.f141867e = liteAppGameTabUI;
        this.f141866d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI = this.f141867e;
        p53.u uVar = liteAppGameTabUI.f140985d;
        if (uVar != null) {
            uVar.getGameTabWidget().e(liteAppGameTabUI.f140997s, this.f141866d);
        }
    }
}
