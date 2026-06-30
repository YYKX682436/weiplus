package lj2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.o0 f318878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(lj2.o0 o0Var) {
        super(1);
        this.f318878d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        lj2.o0 o0Var = this.f318878d;
        if (o0Var.f318907g == 1) {
            db5.t7.makeText(o0Var.f318901a.getContext(), com.tencent.mm.R.string.mkg, 0).show();
        } else {
            pi2.w0 w0Var = o0Var.f318902b.f362549n;
            if (w0Var != null) {
                w0Var.e0(true, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
