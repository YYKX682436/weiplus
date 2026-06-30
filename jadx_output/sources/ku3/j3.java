package ku3;

/* loaded from: classes3.dex */
public final class j3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f312284d;

    public j3(ku3.y3 y3Var) {
        this.f312284d = y3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((zt3.d) obj).f475593b != 0) {
            ku3.y3 y3Var = this.f312284d;
            if (y3Var.c().getVisibility() == 0) {
                y3Var.c().animate().alpha(0.0f).withEndAction(new ku3.i3(y3Var)).start();
            }
        }
    }
}
