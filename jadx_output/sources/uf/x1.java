package uf;

/* loaded from: classes7.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427125e;

    public x1(uf.c2 c2Var, android.content.Context context) {
        this.f427124d = c2Var;
        this.f427125e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://");
        sb6.append(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9));
        sb6.append("/mp/readtemplate?t=weapp/airplay_intro_tmpl&appid=");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f427124d.f426994d;
        sb6.append(appBrandRuntime != null ? appBrandRuntime.f74803n : null);
        java.lang.String url = sb6.toString();
        if (((gg1.f) nd.f.a(gg1.f.class)) != null) {
            android.content.Context context = this.f427125e;
            kotlin.jvm.internal.o.g(url, "url");
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var = (com.tencent.mm.plugin.appbrand.jsapi.r1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.r1.class);
            if (r1Var != null) {
                r1Var.N(context, url, "", null);
            }
        }
        yz5.a aVar = this.f427124d.f427009v;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
