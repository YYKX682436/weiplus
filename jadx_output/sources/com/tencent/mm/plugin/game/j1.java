package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.l1 f139462d;

    public j1(com.tencent.mm.plugin.game.l1 l1Var) {
        this.f139462d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.l1.Ai(this.f139462d);
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "onAccountReleased, releaseStore");
    }
}
