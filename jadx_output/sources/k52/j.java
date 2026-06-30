package k52;

/* loaded from: classes15.dex */
public final class j implements k52.f {
    public void a(android.view.View view, r45.a07 a07Var) {
        if (a07Var == null) {
            return;
        }
        if (view != null) {
            k52.l.f304310a.put(a07Var.f369601d + '|' + a07Var.f369607m + '|' + a07Var.f369609o, new java.lang.ref.WeakReference(view));
        }
        a07Var.f369610p = java.lang.System.currentTimeMillis() - a07Var.f369609o;
        d52.d.a().d(800, a07Var);
    }
}
