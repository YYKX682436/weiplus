package j93;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j93.j1 j1Var) {
        super(1);
        this.f298358d = j1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        j93.j1 j1Var = this.f298358d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            androidx.appcompat.app.AppCompatActivity activity = j1Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            mMActivity.setActionbarColor(j1Var.getResources().getColor(com.tencent.mm.R.color.f478491c));
            mMActivity.setNavigationbarColor(j1Var.getResources().getColor(com.tencent.mm.R.color.f478491c));
            int e17 = com.tencent.mm.ui.zk.e(j1Var.getActivity(), com.tencent.mm.R.dimen.f479704cz);
            int e18 = com.tencent.mm.ui.zk.e(j1Var.getActivity(), com.tencent.mm.R.dimen.f479693cs);
            int e19 = com.tencent.mm.ui.zk.e(j1Var.getActivity(), com.tencent.mm.R.dimen.f479671c8);
            if (fp.h.c(23)) {
                mMActivity.getController().Q0(com.tencent.mm.ui.uk.d(j1Var.getActivity(), com.tencent.mm.R.raw.icons_outlined_arrow_down, j1Var.getResources().getColor(com.tencent.mm.R.color.FG_0), e18, e19, j1Var.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3), e17, 0.5f * e17));
            }
            if (state.e()) {
                mMActivity.addTextOptionMenu(1, (java.lang.String) ((jz5.n) j1Var.f298417h).getValue(), new j93.z0(j1Var), null, com.tencent.mm.ui.fb.a(((java.lang.Number) ((jz5.n) j1Var.f298416g).getValue()).intValue()));
                j1Var.V6(state);
            }
        }
        if (state.e()) {
            j75.d dVar2 = state.f298066d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f298067a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                    j1Var.V6(state);
                }
            }
            j75.d dVar3 = state.f298066d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                j1Var.V6(state);
            }
            j75.d dVar4 = state.f298066d;
            if (dVar4 != null && (dVar4 instanceof wi5.k0)) {
                j1Var.V6(state);
            }
            j75.d dVar5 = state.f298066d;
            if (dVar5 != null && (dVar5 instanceof wi5.j0)) {
                j1Var.V6(state);
            }
            j75.d dVar6 = state.f298066d;
            if (dVar6 != null && (dVar6 instanceof wi5.r)) {
                j1Var.V6(state);
            }
        }
        return jz5.f0.f302826a;
    }
}
