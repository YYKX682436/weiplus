package df2;

/* loaded from: classes3.dex */
public final class gj implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f230223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230225c;

    public gj(df2.oj ojVar, java.lang.String str, java.lang.String str2) {
        this.f230223a = ojVar;
        this.f230224b = str;
        this.f230225c = str2;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f230223a.f230971m, "invokeLiteApp createStore fail!");
    }

    @Override // q80.f0
    public void success() {
        df2.oj ojVar = this.f230223a;
        com.tencent.mars.xlog.Log.i(ojVar.f230971m, "invokeLiteApp createStore success!");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.tencent.mm.feature.lite.i) g0Var).rj(ojVar.h7(), this.f230224b, this.f230225c);
    }
}
