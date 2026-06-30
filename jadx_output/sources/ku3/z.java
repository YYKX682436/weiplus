package ku3;

/* loaded from: classes10.dex */
public final class z implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312491d;

    public z(ku3.i0 i0Var) {
        this.f312491d = i0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = ((zt3.d) obj).f475593b;
        ku3.i0 i0Var = this.f312491d;
        if (i17 != 0) {
            i0Var.a().animate().alpha(0.0f).withEndAction(new ku3.t(i0Var)).start();
        } else {
            i0Var.a().setVisibility(0);
            i0Var.a().animate().alpha(1.0f).start();
        }
    }
}
