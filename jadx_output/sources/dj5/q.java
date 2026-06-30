package dj5;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.r f233090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(dj5.r rVar) {
        super(1);
        this.f233090d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.f Q6;
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        dj5.r rVar = this.f233090d;
        if (dVar != null && (dVar instanceof wi5.f0) && (eVar = ((wi5.f0) dVar).f298067a) != null && (eVar instanceof wi5.g0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KSelectUserList", ((wi5.g0) eVar).f446290a.toByteArray());
            rVar.getActivity().setResult(-1, intent);
            rVar.getActivity().finish();
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (Q6 = rVar.Q6()) != null) {
            Q6.B3(new wi5.f0(c0Var.f446282b));
        }
        return jz5.f0.f302826a;
    }
}
