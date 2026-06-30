package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.l1 f139447d;

    public f1(com.tencent.mm.plugin.game.l1 l1Var) {
        this.f139447d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread.sleep(5000L);
        com.tencent.mm.plugin.game.l1 l1Var = this.f139447d;
        if (l1Var.f139471g) {
            return;
        }
        com.tencent.mm.plugin.game.l1.wi(l1Var);
    }
}
