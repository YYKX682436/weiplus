package oi1;

/* loaded from: classes7.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi1.e f345597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f345598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fl1.b f345599f;

    public d(oi1.e eVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, fl1.b bVar) {
        this.f345597d = eVar;
        this.f345598e = appBrandRuntime;
        this.f345599f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "keep staying current page");
        oi1.a aVar = (oi1.a) this.f345597d;
        aVar.getClass();
        ze.n runtime = (ze.n) this.f345598e;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        aVar.c(runtime, 3);
        this.f345599f.dismiss();
    }
}
