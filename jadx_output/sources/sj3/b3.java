package sj3;

/* loaded from: classes14.dex */
public final class b3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408441d;

    public b3(sj3.g3 g3Var) {
        this.f408441d = g3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        uj3.b0 b0Var;
        uj3.a0 a0Var;
        java.lang.String str = (java.lang.String) obj;
        sj3.g3 g3Var = this.f408441d;
        wj3.a aVar = g3Var.f408539t;
        if (aVar != null && (b0Var = aVar.f446746e) != null && (a0Var = b0Var.f428220h) != null) {
            a0Var.e();
        }
        if (g3Var.f408537r.length() == 0) {
            ((android.widget.TextView) ((jz5.n) g3Var.f408535p).getValue()).setText(str);
        }
    }
}
