package fh1;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f262620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fh1.z zVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        super(0);
        this.f262617d = zVar;
        this.f262618e = str;
        this.f262619f = str2;
        this.f262620g = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.z zVar = this.f262617d;
        fh1.x0 a17 = zVar.a();
        com.tencent.mars.xlog.Log.i(zVar.f262631e, "onWXConfigReady appId:" + this.f262618e + ", envVersion:" + this.f262619f + ", bizIsDestroyed:" + a17.G.get());
        kotlinx.coroutines.y0 y0Var = zVar.f262633g;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new fh1.w(zVar, a17, this.f262618e, this.f262619f, this.f262620g, null), 2, null);
        return jz5.f0.f302826a;
    }
}
