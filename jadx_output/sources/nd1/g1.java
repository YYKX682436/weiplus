package nd1;

/* loaded from: classes7.dex */
public class g1 extends zl1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f336303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f336304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f336305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd1.h1 f336306d;

    public g1(nd1.h1 h1Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f336306d = h1Var;
        this.f336303a = v5Var;
        this.f336304b = d0Var;
        this.f336305c = i17;
    }

    @Override // zl1.z
    public void a(android.graphics.Bitmap bitmap, zl1.y yVar) {
        super.a(bitmap, yVar);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f336303a;
        if (v5Var.isRunning()) {
            al1.b r17 = v5Var.r1();
            nd1.f1 f1Var = new nd1.f1(this);
            r17.getClass();
            r17.post(new al1.d(r17, bitmap, f1Var));
        }
        this.f336304b.a(this.f336305c, this.f336306d.o("ok"));
    }
}
