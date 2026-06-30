package rx4;

/* loaded from: classes8.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.k0 f401155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(rx4.k0 k0Var) {
        super(0);
        this.f401155d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx4.k0 k0Var = this.f401155d;
        k0Var.f401213h = null;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) k0Var.findViewById(com.tencent.mm.R.id.rrc);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
