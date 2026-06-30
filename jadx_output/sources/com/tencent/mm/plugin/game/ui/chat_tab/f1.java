package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem f141268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI f141269e;

    public f1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem) {
        this.f141269e = gameWebTabUI;
        this.f141268d = tabItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI = this.f141269e;
        if (gameWebTabUI.isFinishing() || gameWebTabUI.isDestroyed()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebTabUI", "isFinishing or isDestroyed");
        } else {
            com.tencent.mm.ipcinvoker.r rVar = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.f141196v;
            gameWebTabUI.b7(this.f141268d, true);
        }
    }
}
