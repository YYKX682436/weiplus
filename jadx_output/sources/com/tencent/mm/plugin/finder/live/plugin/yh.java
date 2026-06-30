package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ci f115196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f115197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f115198f;

    public yh(com.tencent.mm.plugin.finder.live.plugin.ci ciVar, java.lang.Object obj, long j17) {
        this.f115196d = ciVar;
        this.f115197e = obj;
        this.f115198f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ci ciVar = this.f115196d;
        boolean a17 = ciVar.a1();
        long j17 = this.f115198f;
        if (a17) {
            com.tencent.mars.xlog.Log.i("FinderLiveEmptyPlugin", "openFullScreenMiniprogramImpl delayMs:" + j17 + ",isFinished!");
            return;
        }
        java.lang.Object obj = this.f115197e;
        l81.b1 b1Var = obj instanceof l81.b1 ? (l81.b1) obj : null;
        if (b1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveEmptyPlugin", "openFullScreenMiniprogramImpl delayMs:" + j17);
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context = ciVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            q4Var.l(context, ciVar.S0(), b1Var, true, null);
        }
    }
}
