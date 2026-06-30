package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f114232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f114233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f114234f;

    public s90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, java.lang.Object obj, long j17) {
        this.f114232d = ea0Var;
        this.f114233e = obj;
        this.f114234f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f114232d;
        if (!ea0Var.a1()) {
            java.lang.Object obj = this.f114233e;
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            ea0Var.B1(bool != null ? bool.booleanValue() : false, false);
        } else {
            com.tencent.mars.xlog.Log.i(ea0Var.f112390t, "onShoppingBubbleClickImpl delayMs:" + this.f114234f + ",isFinished!");
        }
    }
}
