package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ci f115344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f115345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f115346f;

    public zh(com.tencent.mm.plugin.finder.live.plugin.ci ciVar, java.lang.Object obj, long j17) {
        this.f115344d = ciVar;
        this.f115345e = obj;
        this.f115346f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ci ciVar = this.f115344d;
        boolean a17 = ciVar.a1();
        long j17 = this.f115346f;
        if (a17) {
            com.tencent.mars.xlog.Log.i("FinderLiveEmptyPlugin", "openHalfScreenMiniprogramImpl delayMs:" + j17 + ",isFinished!");
            return;
        }
        java.lang.Object obj = this.f115345e;
        l81.b1 b1Var = obj instanceof l81.b1 ? (l81.b1) obj : null;
        if (b1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveEmptyPlugin", "openHalfScreenMiniprogramImpl delayMs:" + j17);
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context = ciVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            q4Var.n(context, ciVar.S0(), b1Var, ciVar.R0());
        }
    }
}
