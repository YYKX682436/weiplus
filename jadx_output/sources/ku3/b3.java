package ku3;

/* loaded from: classes3.dex */
public final class b3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f312172d;

    public b3(ku3.e3 e3Var) {
        this.f312172d = e3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((zt3.d) obj).f475593b != 0) {
            ku3.e3 e3Var = this.f312172d;
            if (e3Var.c().getVisibility() == 0) {
                e3Var.c().animate().alpha(0.0f).withEndAction(new ku3.a3(e3Var)).start();
            }
        }
    }
}
