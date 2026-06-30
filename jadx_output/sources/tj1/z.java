package tj1;

/* loaded from: classes7.dex */
public final class z extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public final nh1.c f419723b;

    public z(nh1.c cVar) {
        super(37);
        this.f419723b = cVar;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 menu, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.plugin.appbrand.jsapi.g0 p07 = pageView.getRuntime().p0(tj1.a.class, true);
        kotlin.jvm.internal.o.d(p07);
        tj1.k kVar = ((tj1.a) p07).f419689d;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_action_note", com.tencent.mm.sdk.platformtools.m2.c(context));
        int ordinal = kVar.ordinal();
        nh1.c cVar = this.f419723b;
        if (ordinal == 0) {
            menu.g(37, context.getString(com.tencent.mm.R.string.m4p), com.tencent.mm.R.raw.app_brand_translate);
            if (cVar != null) {
                ((com.tencent.mm.plugin.appbrand.menu.a) cVar).a(context, pageView, menu, str, bundle);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        menu.g(37, context.getString(com.tencent.mm.R.string.lyb), com.tencent.mm.R.raw.app_brand_cancel_translate);
        if (cVar != null) {
            ((com.tencent.mm.plugin.appbrand.menu.a) cVar).a(context, pageView, menu, str, bundle);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_action_note", com.tencent.mm.sdk.platformtools.m2.c(context));
        com.tencent.mm.plugin.appbrand.jsapi.g0 p07 = pageView.getRuntime().p0(tj1.a.class, true);
        kotlin.jvm.internal.o.d(p07);
        tj1.k kVar = ((tj1.a) p07).f419689d;
        if (kVar == tj1.k.f419699g) {
            tj1.o oVar = new tj1.o();
            com.tencent.luggage.sdk.jsapi.component.service.y v37 = pageView.v3();
            kotlin.jvm.internal.o.f(v37, "getService(...)");
            oVar.x(v37, 1);
            bundle.putInt("key_override_action", 70);
        } else if (kVar == tj1.k.f419698f) {
            tj1.f fVar = tj1.f.f419693a;
            ze.n runtime = pageView.getRuntime();
            kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
            fVar.a(runtime);
        }
        if (this.f419723b != null) {
            int i17 = bundle.getInt("key_override_action", 0);
            java.lang.String appId = pageView.getAppId();
            java.lang.String X1 = pageView.X1();
            if (i17 <= 0) {
                i17 = 69;
            }
            int i18 = i17;
            java.lang.String string = bundle.getString("key_action_note", "");
            com.tencent.mm.plugin.appbrand.report.v0.e(appId, X1, i18, string == null ? "" : string, com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        }
    }
}
