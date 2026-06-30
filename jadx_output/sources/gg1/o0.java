package gg1;

/* loaded from: classes7.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gg1.c1 c1Var) {
        super(0);
        this.f271615d = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gg1.g gVar = this.f271615d.f271541g;
        if (gVar != null) {
            ((com.tencent.mm.plugin.appbrand.report.j1) gVar).Ai(7);
        }
        java.lang.String url = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/readtemplate?t=weapp/airplay_intro_tmpl&appid=" + gg1.h.a(this.f271615d.f271535a).f74803n;
        if (((gg1.f) nd.f.a(gg1.f.class)) != null) {
            android.content.Context context = this.f271615d.f271535a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.g(url, "url");
            com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var = (com.tencent.mm.plugin.appbrand.jsapi.r1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.r1.class);
            if (r1Var != null) {
                r1Var.N(context, url, "", null);
            }
        }
        return jz5.f0.f302826a;
    }
}
