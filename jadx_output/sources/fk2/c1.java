package fk2;

/* loaded from: classes3.dex */
public final class c1 {
    public c1(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493720os0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final com.tencent.mm.pluginsdk.ui.span.f0 b(java.lang.CharSequence charSequence, int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence));
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f273498f, a(), 0.0f, 0.0f, 6, null);
        java.lang.String a18 = a();
        float f17 = gm2.w.f273511k;
        f0Var.c(new gm2.v(a17, new gm2.w(a18, f17, f17, context2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3), gm2.w.f273509i, context2.getResources().getColor(com.tencent.mm.R.color.f479549ab0), gm2.w.f273510j, 0.0f, 128, null)), 0, a().length() + 0, 33);
        java.lang.String f0Var2 = f0Var.toString();
        kotlin.jvm.internal.o.f(f0Var2, "toString(...)");
        int K = r26.n0.K(f0Var2, '\n', 0, false, 6, null);
        if (K >= 0 && K < f0Var.length() - 1) {
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#80ffffff")), K + 1, f0Var.length(), 33);
        }
        if (i17 > 1) {
            f0Var.c(new android.text.style.LeadingMarginSpan.Standard(0, com.tencent.mm.ui.zk.a(context, 11)), 0, f0Var.length(), 33);
        }
        return f0Var;
    }
}
