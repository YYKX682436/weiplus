package nd1;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.j f336314f;

    public i(nd1.j jVar, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        this.f336314f = jVar;
        this.f336312d = yVar;
        this.f336313e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336312d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        nd1.j jVar = this.f336314f;
        int i17 = this.f336313e;
        if (a17 == null) {
            yVar.a(i17, jVar.o("fail:page don't exist"));
        } else {
            a17.d3(false);
            yVar.a(i17, jVar.o("ok"));
        }
    }
}
