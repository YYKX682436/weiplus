package hj5;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj5.e f281665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj5.e eVar) {
        super(1);
        this.f281665d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        hj5.e eVar2 = this.f281665d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            androidx.appcompat.app.AppCompatActivity activity = eVar2.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            if (state.e()) {
                mMActivity.addTextOptionMenu(1, (java.lang.String) ((jz5.n) eVar2.f281669e).getValue(), new hj5.a(eVar2, state), null, com.tencent.mm.ui.fb.GREEN);
                eVar2.T6(state);
            }
        }
        if (state.e()) {
            j75.d dVar2 = state.f298066d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f298067a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                    eVar2.T6(state);
                }
            }
            j75.d dVar3 = state.f298066d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                eVar2.T6(state);
            }
            j75.d dVar4 = state.f298066d;
            if (dVar4 != null && (dVar4 instanceof wi5.k0)) {
                eVar2.T6(state);
            }
            j75.d dVar5 = state.f298066d;
            if (dVar5 != null && (dVar5 instanceof wi5.j0)) {
                eVar2.T6(state);
            }
            j75.d dVar6 = state.f298066d;
            if (dVar6 != null && (dVar6 instanceof wi5.r)) {
                eVar2.T6(state);
            }
        }
        return jz5.f0.f302826a;
    }
}
