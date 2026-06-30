package nd1;

/* loaded from: classes7.dex */
public class e1 extends zl1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f336295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f336296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nd1.h1 f336297c;

    public e1(nd1.h1 h1Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f336297c = h1Var;
        this.f336295a = d0Var;
        this.f336296b = i17;
    }

    @Override // zl1.w
    public void a(java.lang.String str, zl1.y yVar) {
        super.a(str, yVar);
        this.f336295a.a(this.f336296b, this.f336297c.o("fail iconPath not found"));
    }
}
