package e33;

/* loaded from: classes10.dex */
public class l2 implements t23.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247317a;

    public l2(e33.v2 v2Var, e33.u2 u2Var) {
        this.f247317a = new java.lang.ref.WeakReference(u2Var.f247487e);
    }

    @Override // t23.q2
    public void a(t23.r2 r2Var) {
        android.view.View view = (android.view.View) this.f247317a.get();
        if (view == null || !r2Var.equals(view.getTag())) {
            return;
        }
        view.setTag(null);
    }
}
