package nd1;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336332h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd1.m0 f336333i;

    public l0(nd1.m0 m0Var, com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, int i17) {
        this.f336333i = m0Var;
        this.f336328d = yVar;
        this.f336329e = str;
        this.f336330f = jSONObject;
        this.f336331g = str2;
        this.f336332h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336328d;
        com.tencent.mm.plugin.appbrand.page.i3 x07 = yVar.getRuntime().x0();
        x07.getClass();
        x07.c0(new com.tencent.mm.plugin.appbrand.page.m4(x07, this.f336329e, this.f336330f, this.f336331g));
        yVar.a(this.f336332h, this.f336333i.o("ok"));
    }
}
