package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem f141314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI f141315e;

    public t1(com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem) {
        this.f141315e = mMGameWebTabUI;
        this.f141314d = tabItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI = this.f141315e;
        if (mMGameWebTabUI.isFinishing() || mMGameWebTabUI.isDestroyed()) {
            return;
        }
        com.tencent.mm.ipcinvoker.r rVar = com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.f141215r;
        mMGameWebTabUI.Y6(this.f141314d, true);
    }
}
