package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.j1 f141281e;

    public i1(com.tencent.mm.plugin.game.ui.chat_tab.j1 j1Var, java.lang.String str) {
        this.f141281e = j1Var;
        this.f141280d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.j1 j1Var = this.f141281e;
        p53.u uVar = j1Var.f141284e.f141197m;
        if (uVar != null) {
            uVar.getGameTabWidget().e(j1Var.f141284e.f141198n, this.f141280d);
        }
    }
}
