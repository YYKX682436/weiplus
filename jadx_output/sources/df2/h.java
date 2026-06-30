package df2;

/* loaded from: classes3.dex */
public final class h implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.k f230265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230268d;

    public h(df2.k kVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f230265a = kVar;
        this.f230266b = str;
        this.f230267c = str2;
        this.f230268d = str3;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f230265a.f230522m, "invokeLiteApp createStore fail!");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f230265a.f230522m, "invokeLiteApp createStore success!");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.tencent.mm.feature.lite.i) g0Var).rj(this.f230266b, this.f230267c, this.f230268d);
    }
}
