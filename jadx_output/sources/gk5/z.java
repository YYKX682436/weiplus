package gk5;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.a0 f272729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gk5.a0 a0Var) {
        super(0);
        this.f272729d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk5.a0 a0Var = this.f272729d;
        if (!a0Var.getActivity().isFinishing() && !a0Var.getActivity().isDestroyed()) {
            a0Var.getActivity().setResult(0);
            a0Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
