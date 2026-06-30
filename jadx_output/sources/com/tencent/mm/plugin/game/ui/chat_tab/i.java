package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.s1 f141277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.o f141278e;

    public i(com.tencent.mm.plugin.game.ui.chat_tab.o oVar, com.tencent.mm.plugin.game.ui.chat_tab.s1 s1Var) {
        this.f141278e = oVar;
        this.f141277d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.s1 s1Var = this.f141277d;
        if (s1Var != null) {
            s1Var.a(this.f141278e.f141296b.getHeight());
        }
    }
}
