package u1;

/* loaded from: classes14.dex */
public abstract class p1 {
    public static void a(u1.r1 r1Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) r1Var;
        yz5.a aVar = z17 ? androidComposeView.L1 : null;
        u1.d1 d1Var = androidComposeView.f10456J;
        if (d1Var.e(aVar)) {
            androidComposeView.requestLayout();
        }
        d1Var.b(false);
    }
}
