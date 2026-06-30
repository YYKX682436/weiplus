package oi1;

/* loaded from: classes7.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi1.e f345593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f345595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.b f345596g;

    public c(oi1.e eVar, java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, fl1.b bVar) {
        this.f345593d = eVar;
        this.f345594e = runnable;
        this.f345595f = appBrandRuntime;
        this.f345596g = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f345594e;
        if (runnable != null) {
            runnable.run();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "dialog confirm to navigate back");
        oi1.a aVar = (oi1.a) this.f345593d;
        aVar.getClass();
        ze.n runtime = (ze.n) this.f345595f;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        aVar.c(runtime, 2);
        this.f345596g.dismiss();
    }
}
