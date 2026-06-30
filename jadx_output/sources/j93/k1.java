package j93;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.l1 f298426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(j93.l1 l1Var) {
        super(1);
        this.f298426d = l1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", kz5.n0.g0(c0Var.f446282b, ",", null, null, 0, null, null, 62, null));
            j93.l1 l1Var = this.f298426d;
            l1Var.getActivity().setResult(-1, intent);
            l1Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
