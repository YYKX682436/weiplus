package nd1;

/* loaded from: classes7.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.j1 f336318g;

    public i1(nd1.j1 j1Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        this.f336318g = j1Var;
        this.f336315d = yVar;
        this.f336316e = i17;
        this.f336317f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336315d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        nd1.j1 j1Var = this.f336318g;
        int i17 = this.f336316e;
        if (a17 == null) {
            yVar.a(i17, j1Var.o("fail"));
        } else {
            a17.e3(this.f336317f);
            yVar.a(i17, j1Var.o("ok"));
        }
    }
}
