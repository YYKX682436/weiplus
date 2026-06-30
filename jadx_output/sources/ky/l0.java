package ky;

/* loaded from: classes14.dex */
public abstract class l0 {
    public static final void a(ky.h0 h0Var, n0.o oVar, int i17, int i18) {
        int i19;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(2091727627);
        int i27 = i18 & 1;
        if (i27 != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(h0Var) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i19 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                h0Var = ky.h0.f313366d;
            }
            java.lang.Object obj = n0.e1.f333492a;
            android.content.res.Configuration configuration = (android.content.res.Configuration) y0Var.i(androidx.compose.ui.platform.a1.f10502a);
            android.content.Context context = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
            android.view.View view = (android.view.View) y0Var.i(androidx.compose.ui.platform.a1.f10507f);
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            boolean z17 = (configuration.uiMode & 48) == 32;
            n0.d2.c(java.lang.Boolean.valueOf(z17), new ky.j0(window, view, h0Var, z17), y0Var, 0);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new ky.k0(h0Var, i17, i18);
        }
    }
}
