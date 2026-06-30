package ku3;

/* loaded from: classes3.dex */
public final class v4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f312438d;

    public v4(ku3.i5 i5Var) {
        this.f312438d = i5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((zt3.d) obj).f475593b != 0) {
            ku3.i5 i5Var = this.f312438d;
            if (i5Var.b().getVisibility() == 0) {
                i5Var.b().animate().alpha(0.0f).withEndAction(new ku3.u4(i5Var)).start();
            }
        }
    }
}
