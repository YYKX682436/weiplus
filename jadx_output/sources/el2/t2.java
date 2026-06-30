package el2;

/* loaded from: classes3.dex */
public final class t2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.u2 f253916d;

    public t2(el2.u2 u2Var) {
        this.f253916d = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        el2.u2 u2Var = this.f253916d;
        com.tencent.mars.xlog.Log.i(u2Var.f253923f, "folder visible = " + bool);
        kotlin.jvm.internal.o.d(bool);
        u2Var.f253921d.setVisibility(bool.booleanValue() ? 0 : 8);
    }
}
