package sg0;

/* loaded from: classes8.dex */
public final class e3 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f407703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg0.h3 f407704b;

    public e3(su4.h2 h2Var, sg0.h3 h3Var) {
        this.f407703a = h2Var;
        this.f407704b = h3Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearchLiteAppJsApiFeatureService", "createStore fail");
    }

    @Override // q80.f0
    public void success() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create w1w liteapp store appid:");
        su4.h2 h2Var = this.f407703a;
        sb6.append(h2Var);
        sb6.append(".liteAppId");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", sb6.toString());
        this.f407704b.wi(h2Var);
    }
}
