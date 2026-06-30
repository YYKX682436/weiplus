package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.u3 f125383a = new com.tencent.mm.plugin.finder.report.u3();

    public final java.util.Map a(r45.qt2 qt2Var) {
        return qt2Var == null ? kz5.q0.f314001d : kz5.c1.k(new jz5.l("ref_commentscene", java.lang.Integer.valueOf(qt2Var.getInteger(7))), new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("finder_context_id", qt2Var.getString(1)));
    }

    public final r45.qt2 b(androidx.appcompat.app.AppCompatActivity activity) {
        try {
            kotlin.jvm.internal.o.g(activity, "activity");
            return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("Finder.SelfReporter", "getContextObj failed: " + e17.getMessage());
            return null;
        }
    }
}
