package el2;

/* loaded from: classes3.dex */
public final class a1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253742d;

    public a1(el2.i1 i1Var) {
        this.f253742d = i1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int hashCode = num.hashCode();
        el2.i1 i1Var = this.f253742d;
        boolean z17 = hashCode == ((android.view.View) ((jz5.n) i1Var.f253817i).getValue()).hashCode();
        com.tencent.mars.xlog.Log.i(i1Var.f253815g, "view = " + num + ", match = " + z17);
        if (z17) {
            i1Var.f253821p = false;
            i1Var.f253822q = false;
            i1Var.o(true);
        }
    }
}
