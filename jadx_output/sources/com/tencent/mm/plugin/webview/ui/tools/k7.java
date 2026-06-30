package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class k7 implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f185610a;

    public k7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f185610a = c6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public void onShow() {
        db5.g4 g4Var;
        androidx.recyclerview.widget.g3 g3Var;
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f185610a;
        if (!c6Var.D) {
            ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ni(c6Var.E);
        }
        com.tencent.mm.plugin.webview.ui.tools.p7 p7Var = (com.tencent.mm.plugin.webview.ui.tools.p7) c6Var.f184051h.get(45);
        if (p7Var == null) {
            return;
        }
        c6Var.f184051h.remove(45);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = c6Var.f184044J;
        if (k0Var != null && k0Var.i() && (g4Var = c6Var.L) != null) {
            int y17 = g4Var.y(7);
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = c6Var.f184044J;
            androidx.recyclerview.widget.RecyclerView recyclerView = k0Var2.G1;
            if (recyclerView != null && recyclerView.getLayoutManager() != null && (g3Var = k0Var2.f211859f2) != null) {
                g3Var.f12049a = y17;
                k0Var2.G1.getLayoutManager().startSmoothScroll(k0Var2.f211859f2);
            }
        }
        c6Var.getClass();
        android.os.Bundle bundle = p7Var.f186752b;
        if (bundle != null && p7Var.f186751a == 45) {
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) bundle.getParcelable("show_browser_resolve_info");
            boolean z17 = bundle.getBoolean("show_browser_with_animation", false);
            if (resolveInfo != null) {
                hx4.x xVar = c6Var.f184049f;
                xVar.f285702c = null;
                xVar.f285701b = resolveInfo;
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c6Var.c();
                android.content.pm.ResolveInfo resolveInfo2 = xVar.f285701b;
                db5.g4 g4Var2 = c6Var.L;
                java.lang.String c18 = hx4.r.c(c17, resolveInfo2);
                java.lang.String format = java.lang.String.format(c17.getString(com.tencent.mm.R.string.l5g), c18);
                android.graphics.drawable.Drawable drawable = xVar.f285702c;
                if (drawable != null) {
                    c6Var.i(g4Var2, format, drawable, null, false, z17);
                } else {
                    new hx4.w(c17, c18, new com.tencent.mm.plugin.webview.ui.tools.l6(c6Var, g4Var2, format, false, z17)).execute(resolveInfo2);
                }
            }
        }
    }
}
