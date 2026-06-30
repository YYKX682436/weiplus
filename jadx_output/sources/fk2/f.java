package fk2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fk2.f f263370d = new fk2.f();

    public f() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.CharSequence content = (java.lang.CharSequence) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(content, "content");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, content));
        fk2.h hVar = fk2.k.f263413m;
        android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f273498f, hVar.b(), 0.0f, 0.0f, 6, null);
        java.lang.String b17 = hVar.b();
        float f17 = gm2.w.f273511k;
        f0Var.c(new gm2.v(a17, new gm2.w(b17, f17, f17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0), gm2.w.f273510j, 0.0f, 128, null)), 0, hVar.b().length() + 0, 33);
        java.lang.String f0Var2 = f0Var.toString();
        kotlin.jvm.internal.o.f(f0Var2, "toString(...)");
        int K = r26.n0.K(f0Var2, '\n', 0, false, 6, null);
        if (K != -1 && (i17 = K + 1) < f0Var.length()) {
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#80ffffff")), i17, f0Var.toString().length(), 33);
        }
        if (intValue > 1) {
            f0Var.c(new android.text.style.LeadingMarginSpan.Standard(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 11)), 0, f0Var.length(), 33);
        }
        return f0Var;
    }
}
