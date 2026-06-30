package nd1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f336290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.f f336293g;

    public e(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, nd1.f fVar) {
        this.f336290d = v5Var;
        this.f336291e = yVar;
        this.f336292f = i17;
        this.f336293g = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f336290d;
        if (v5Var.r1() == null) {
            v5Var.P2();
        } else {
            v5Var.d2();
        }
        com.tencent.mm.plugin.appbrand.y yVar = this.f336291e;
        kotlin.jvm.internal.o.d(yVar);
        yVar.a(this.f336292f, this.f336293g.o("ok"));
    }
}
