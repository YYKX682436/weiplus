package nd1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.h f336302f;

    public g(com.tencent.mm.plugin.appbrand.y yVar, int i17, nd1.h hVar) {
        this.f336300d = yVar;
        this.f336301e = i17;
        this.f336302f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336300d;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = yVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) yVar : yVar instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) yVar).V0() : null;
        nd1.h hVar = this.f336302f;
        int i17 = this.f336301e;
        if (V0 == null) {
            yVar.a(i17, hVar.o("fail:page don't exist"));
        } else {
            V0.e2();
            yVar.a(i17, hVar.o("ok"));
        }
    }
}
