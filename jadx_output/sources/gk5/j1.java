package gk5;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f272677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(gk5.k1 k1Var) {
        super(1);
        this.f272677d = k1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        gk5.k1 k1Var = this.f272677d;
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            intent.putExtra("label_source", state.f446312e);
            intent.putExtra("Is_Chatroom", c0Var.f446283c == 1);
            intent.putExtra("scene_from", 13);
            k1Var.getActivity().setResult(-1, intent);
            k1Var.getActivity().finish();
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = k1Var.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new gk5.f1(state, k1Var, oVar, null), 1, null);
            }
            com.tencent.mm.sdk.coroutines.LifecycleScope O62 = k1Var.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new gk5.i1(k1Var, oVar, state, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
