package im2;

/* loaded from: classes3.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292338d;

    public g1(im2.z3 z3Var) {
        this.f292338d = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.z3 z3Var = this.f292338d;
        z3Var.k7().smoothScrollTo(0, ((android.view.View) ((jz5.n) z3Var.f292653n).getValue()).getTop());
    }
}
