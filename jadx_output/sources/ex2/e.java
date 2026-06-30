package ex2;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ex2.e f257204a = new ex2.e();

    public final java.lang.String a(ex2.a aVar, android.content.Context context) {
        java.lang.String str = aVar.f257194a;
        if (!(str == null || str.length() == 0)) {
            return aVar.f257194a;
        }
        if (aVar.f257196c) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490347sg);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f490507x1);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public final int b(android.content.Context context, int i17) {
        return i17 != 1 ? i17 != 6 ? context.getResources().getColor(com.tencent.mm.R.color.f478763gj) : context.getResources().getColor(com.tencent.mm.R.color.f478753g9) : context.getResources().getColor(com.tencent.mm.R.color.aax);
    }

    public final com.tencent.mm.ui.widget.dialog.z2 c(android.content.Context context, android.view.View contentView, ex2.a leftBtnConfig, ex2.a rightBtnConfig, android.view.View view) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        kotlin.jvm.internal.o.g(leftBtnConfig, "leftBtnConfig");
        kotlin.jvm.internal.o.g(rightBtnConfig, "rightBtnConfig");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0);
        z2Var.m(a(leftBtnConfig, context), a(rightBtnConfig, context));
        int i17 = leftBtnConfig.f257195b;
        z2Var.v(b(context, i17));
        int i18 = rightBtnConfig.f257195b;
        int b17 = b(context, i18);
        android.widget.Button button = z2Var.f212069u;
        if (button != null) {
            button.setTextColor(b17);
        }
        z2Var.n(i17);
        z2Var.o(i18);
        ex2.b bVar = new ex2.b(leftBtnConfig, z2Var);
        ex2.c cVar = new ex2.c(rightBtnConfig, z2Var);
        z2Var.D = bVar;
        z2Var.E = cVar;
        z2Var.j(contentView);
        if (view != null) {
            z2Var.p(view);
        }
        z2Var.C();
        return z2Var;
    }

    public final com.tencent.mm.ui.widget.dialog.z2 d(android.content.Context context, android.view.View contentView, ex2.a btnConfig, android.view.View view) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        kotlin.jvm.internal.o.g(btnConfig, "btnConfig");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0);
        java.lang.String str = btnConfig.f257194a;
        if (str == null || str.length() == 0) {
            str = context.getResources().getString(com.tencent.mm.R.string.f490454vi);
        }
        kotlin.jvm.internal.o.d(str);
        z2Var.y(str);
        z2Var.x(btnConfig.f257195b);
        z2Var.F = new ex2.d(btnConfig, z2Var);
        z2Var.j(contentView);
        if (view != null) {
            z2Var.p(view);
        }
        z2Var.C();
        return z2Var;
    }
}
