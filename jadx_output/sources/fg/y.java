package fg;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.g f261817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg.i f261818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f261819g;

    public y(fg.b0 b0Var, fg.g gVar, fg.i iVar, boolean z17) {
        this.f261816d = b0Var;
        this.f261817e = gVar;
        this.f261818f = iVar;
        this.f261819g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg.b0 b0Var = this.f261816d;
        if (b0Var.f261733j) {
            boolean z17 = this.f261818f.f261766b;
            fg.g gVar = this.f261817e;
            gVar.a(z17);
            if (this.f261819g) {
                int measuredHeight = gVar.getView().getMeasuredHeight();
                sf.c cVar = sf.c.f406939a;
                com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
                kotlin.jvm.internal.o.d(oaVar);
                com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
                com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
                kotlin.jvm.internal.o.d(oaVar2);
                cVar.a(a17, oaVar2.b(), new sf.b(measuredHeight, b0Var.d(measuredHeight), b0Var.f261735l, new fg.w(b0Var, measuredHeight)));
                return;
            }
            sf.c cVar2 = sf.c.f406939a;
            com.tencent.mm.plugin.appbrand.page.oa oaVar3 = b0Var.f261727d;
            kotlin.jvm.internal.o.d(oaVar3);
            com.tencent.mm.plugin.appbrand.jsapi.t a18 = oaVar3.a();
            com.tencent.mm.plugin.appbrand.page.oa oaVar4 = b0Var.f261727d;
            kotlin.jvm.internal.o.d(oaVar4);
            com.tencent.mm.plugin.appbrand.jsapi.l b17 = oaVar4.b();
            int i17 = b0Var.f261732i;
            cVar2.a(a18, b17, new sf.b(i17, b0Var.d(i17), b0Var.f261735l, new fg.x(b0Var)));
        }
    }
}
