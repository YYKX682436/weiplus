package sg0;

/* loaded from: classes8.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f407715e;

    public f3(int i17, su4.h2 h2Var) {
        this.f407714d = i17;
        this.f407715e = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseSearchPage scene ");
        sb6.append(this.f407714d);
        sb6.append(" appid: ");
        su4.h2 h2Var = this.f407715e;
        sb6.append(h2Var.f412906a);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", sb6.toString());
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).Yj(h2Var.f412906a, h2Var.f412907b);
        }
    }
}
