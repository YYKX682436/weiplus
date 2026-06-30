package fg;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.g f261722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261723e;

    public a0(fg.g gVar, fg.b0 b0Var) {
        this.f261722d = gVar;
        this.f261723e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredHeight = this.f261722d.getView().getMeasuredHeight();
        sf.c cVar = sf.c.f406939a;
        fg.b0 b0Var = this.f261723e;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar);
        com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
        com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(measuredHeight, b0Var.d(measuredHeight), b0Var.f261735l, new fg.z(b0Var, measuredHeight)));
    }
}
