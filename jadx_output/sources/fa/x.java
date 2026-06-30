package fa;

/* loaded from: classes14.dex */
public class x implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.internal.ScrimInsetsFrameLayout f260650a;

    public x(com.google.android.material.internal.ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        this.f260650a = scrimInsetsFrameLayout;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        com.google.android.material.internal.ScrimInsetsFrameLayout scrimInsetsFrameLayout = this.f260650a;
        if (scrimInsetsFrameLayout.f44521e == null) {
            scrimInsetsFrameLayout.f44521e = new android.graphics.Rect();
        }
        scrimInsetsFrameLayout.f44521e.set(g3Var.c(), g3Var.e(), g3Var.d(), g3Var.b());
        scrimInsetsFrameLayout.a(g3Var);
        n3.d3 d3Var = g3Var.f334338a;
        boolean z17 = true;
        if ((!d3Var.l().equals(e3.d.f247043e)) && scrimInsetsFrameLayout.f44520d != null) {
            z17 = false;
        }
        scrimInsetsFrameLayout.setWillNotDraw(z17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(scrimInsetsFrameLayout);
        return d3Var.c();
    }
}
