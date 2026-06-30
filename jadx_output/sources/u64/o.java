package u64;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425022d;

    public o(java.lang.String str) {
        this.f425022d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$tryPreloadResource$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate avatar:");
        java.lang.String str = this.f425022d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", sb6.toString());
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(str);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().b(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$tryPreloadResource$1");
    }
}
