package ku3;

/* loaded from: classes10.dex */
public final class y implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312461d;

    public y(ku3.i0 i0Var) {
        this.f312461d = i0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = ((zt3.d) obj).f475593b;
        ku3.i0 i0Var = this.f312461d;
        if (i17 != 0) {
            i0Var.a().animate().alpha(0.0f).withEndAction(new ku3.t(i0Var)).start();
            i0Var.b();
        } else {
            i0Var.a().setVisibility(0);
            i0Var.a().animate().alpha(1.0f).start();
            i0Var.b();
        }
    }
}
