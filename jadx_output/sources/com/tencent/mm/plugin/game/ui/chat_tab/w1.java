package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.e1 f141325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI f141326e;

    public w1(com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI, com.tencent.mm.plugin.game.model.e1 e1Var) {
        this.f141326e = mMGameWebTabUI;
        this.f141325d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI = this.f141326e;
        mMGameWebTabUI.f141216h.getGameTabWidget().e(mMGameWebTabUI.f141217i, this.f141325d.M2.f140524b);
    }
}
