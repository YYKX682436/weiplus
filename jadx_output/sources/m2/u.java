package m2;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter) {
        super(0);
        this.f322943d = composeViewAdapter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        android.view.View childAt = this.f322943d.getChildAt(0);
        if (childAt == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        android.view.KeyEvent.Callback childAt2 = ((androidx.compose.ui.platform.ComposeView) childAt).getChildAt(0);
        androidx.compose.ui.platform.t4 t4Var = childAt2 instanceof androidx.compose.ui.platform.t4 ? (androidx.compose.ui.platform.t4) childAt2 : null;
        if (t4Var != null) {
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) t4Var;
            androidComposeView.e(androidComposeView.getRoot());
        }
        synchronized (x0.z.f450963b) {
            if (((x0.d) x0.z.f450969h.get()).f450877h != null) {
                if (!r2.isEmpty()) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            x0.z.a();
        }
        return jz5.f0.f302826a;
    }
}
