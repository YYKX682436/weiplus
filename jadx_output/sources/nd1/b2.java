package nd1;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.c2 f336272f;

    public b2(nd1.c2 c2Var, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        this.f336272f = c2Var;
        this.f336270d = yVar;
        this.f336271e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336270d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        nd1.c2 c2Var = this.f336272f;
        int i17 = this.f336271e;
        if (a17 == null) {
            yVar.a(i17, c2Var.o("fail:page don't exist"));
        } else {
            a17.d3(true);
            yVar.a(i17, c2Var.o("ok"));
        }
    }
}
