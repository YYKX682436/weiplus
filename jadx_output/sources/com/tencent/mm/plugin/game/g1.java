package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.l1 f139450d;

    public g1(com.tencent.mm.plugin.game.l1 l1Var) {
        this.f139450d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.l1 l1Var = this.f139450d;
        if (l1Var.f139471g) {
            return;
        }
        com.tencent.mm.plugin.game.l1.wi(l1Var);
    }
}
