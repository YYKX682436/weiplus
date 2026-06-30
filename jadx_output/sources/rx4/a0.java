package rx4;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(rx4.e0 e0Var) {
        super(0);
        this.f401091d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx4.e0 e0Var = this.f401091d;
        e0Var.f401141h = null;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) e0Var.findViewById(com.tencent.mm.R.id.rr7);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
