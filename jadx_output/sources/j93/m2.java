package j93;

/* loaded from: classes.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f298440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(j93.p2 p2Var) {
        super(1);
        this.f298440d = p2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.lifecycle.g0 g0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j93.p2 p2Var = this.f298440d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = p2Var.W6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null && (g0Var = a17.f152071u) != null) {
            g0Var.observe(p2Var.getActivity(), new j93.l2(p2Var, state));
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.b)) {
            j93.p2.V6(p2Var, !state.e());
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.e)) {
            j93.p2.V6(p2Var, !state.e());
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.n)) {
            j93.p2.U6(p2Var);
        }
        return jz5.f0.f302826a;
    }
}
