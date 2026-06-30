package ku3;

/* loaded from: classes3.dex */
public final class j4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f312285d;

    public j4(ku3.m4 m4Var) {
        this.f312285d = m4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((zt3.d) obj).f475593b != 0) {
            ku3.m4 m4Var = this.f312285d;
            if (m4Var.a().getVisibility() == 0) {
                m4Var.a().animate().alpha(0.0f).withEndAction(new ku3.i4(m4Var)).start();
            }
        }
    }
}
