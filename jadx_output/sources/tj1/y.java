package tj1;

/* loaded from: classes7.dex */
public final class y extends nh1.a {
    public y() {
        super(38);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 pageView, db5.g4 menu, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.plugin.appbrand.jsapi.g0 p07 = pageView.getRuntime().p0(tj1.a.class, true);
        kotlin.jvm.internal.o.d(p07);
        if (tj1.x.f419722a[((tj1.a) p07).f419689d.ordinal()] == 1) {
            menu.g(38, context.getString(com.tencent.mm.R.string.m4l), com.tencent.mm.R.raw.app_brand_change_language);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 pageView, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        tj1.b bVar = tj1.f.f419694b;
        if (bVar != null) {
            ((tj1.g) bVar).a(context, 1);
        }
    }
}
