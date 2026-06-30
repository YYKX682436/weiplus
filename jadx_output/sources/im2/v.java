package im2;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292577d;

    public v(im2.z3 z3Var) {
        this.f292577d = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.z3 z3Var = this.f292577d;
        android.widget.ScrollView k76 = z3Var.k7();
        if (k76 != null) {
            k76.smoothScrollTo(0, (int) (z3Var.c7().getTop() - z3Var.U1));
        }
    }
}
