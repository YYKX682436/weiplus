package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.b0 f139942d;

    public v(com.tencent.mm.plugin.game.luggage.page.b0 b0Var) {
        this.f139942d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.tencent.mm.plugin.game.luggage.page.b0.f139870y1) {
            if (this.f139942d.getSettings().c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage time out");
                this.f139942d.getSettings().q(false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(949L, 0L, 1L);
            }
        }
    }
}
