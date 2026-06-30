package un;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p0 f429318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(un.p0 p0Var) {
        super(1);
        this.f429318d = p0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        un.p0 p0Var = this.f429318d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = p0Var.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new un.n0(p0Var, oVar, state, null), 1, null);
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            p0Var.getActivity().setResult(-1, intent);
            p0Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
