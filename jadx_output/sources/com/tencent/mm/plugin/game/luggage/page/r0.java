package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class r0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f139934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139935b;

    public r0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, long j17) {
        this.f139935b = x0Var;
        this.f139934a = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "execute game_performance.js costtime:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f139934a));
        this.f139935b.M.post(new com.tencent.mm.plugin.game.luggage.page.q0(this));
    }
}
