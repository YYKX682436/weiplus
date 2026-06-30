package rx4;

/* loaded from: classes8.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.u0 f401234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(rx4.u0 u0Var) {
        super(0);
        this.f401234d = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx4.u0 u0Var = this.f401234d;
        u0Var.f401284h = null;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) u0Var.findViewById(com.tencent.mm.R.id.f486554s23);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
