package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 f141310d;

    public s0(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2) {
        this.f141310d = gameTabWidget2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = this.f141310d.f141187e;
        if (d1Var != null) {
            d1Var.notifyDataSetInvalidated();
        }
    }
}
