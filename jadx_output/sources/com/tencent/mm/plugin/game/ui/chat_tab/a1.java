package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f141234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.d1 f141235e;

    public a1(com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var, boolean z17) {
        this.f141235e = d1Var;
        this.f141234d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = this.f141235e;
        d1Var.h(d1Var.f141259i, this.f141234d);
    }
}
