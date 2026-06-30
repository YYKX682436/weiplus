package lr2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final lr2.b f320718a = new lr2.b();

    public final void a(android.content.Context context, r45.mg0 order, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(order, "order");
        l81.b1 b1Var = new l81.b1();
        java.lang.String string = order.getString(1);
        if (!(string == null || string.length() == 0)) {
            java.lang.String string2 = order.getString(2);
            if (!(string2 == null || string2.length() == 0)) {
                b1Var.f317012a = order.getString(1);
                b1Var.f317022f = order.getString(2);
                b1Var.f317032k = i17;
                b1Var.f317016c = zl2.q4.f473933a.x();
                b1Var.f317028i = new lr2.a(order);
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
            }
        }
        b1Var.f317014b = "wxb1b30dcd0a6be5cb";
        b1Var.f317022f = "pages/detail/index.html";
        b1Var.f317032k = i17;
        b1Var.f317016c = zl2.q4.f473933a.x();
        b1Var.f317028i = new lr2.a(order);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }
}
