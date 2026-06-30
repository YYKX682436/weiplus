package lf0;

/* loaded from: classes8.dex */
public final class a0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f318194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf0.d0 f318195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f318196e;

    public a0(java.lang.String str, java.lang.String str2, long j17, lf0.d0 d0Var, org.json.JSONObject jSONObject) {
        this.f318192a = str;
        this.f318193b = str2;
        this.f318194c = j17;
        this.f318195d = d0Var;
        this.f318196e = jSONObject;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("TopStoryLiteAppJsApiFeatureService", "createStore fail");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("TopStoryLiteAppJsApiFeatureService", "create k1k liteapp store appid:" + this.f318192a);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = lf0.d0.f318201e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = lf0.d0.f318202f;
        java.lang.String str = this.f318193b;
        ku5.u0 u0Var = ku5.t0.f312615d;
        lf0.z zVar = new lf0.z(this.f318195d, this.f318192a, this.f318196e);
        long j17 = this.f318194c;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z17 = t0Var.z(zVar, j17, false);
        kotlin.jvm.internal.o.f(z17, "uiDelay(...)");
        concurrentHashMap2.put(str, z17);
    }
}
