package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.l1 f139443d;

    public e1(com.tencent.mm.plugin.game.l1 l1Var) {
        this.f139443d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.l1 l1Var = this.f139443d;
        if (!l1Var.f139471g) {
            com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "cancal delay release store, after enter foreground");
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f139468d)) {
                return;
            }
            com.tencent.mm.plugin.game.l1.Ai(l1Var);
            com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "delay release store, after enter background.");
        }
    }
}
