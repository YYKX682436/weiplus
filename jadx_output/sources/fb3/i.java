package fb3;

/* loaded from: classes9.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb3.j f260866d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fb3.j jVar) {
        super(1);
        this.f260866d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f446282b, 0)) != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            fb3.j jVar = this.f260866d;
            g0Var.d(29977, 2, jVar.f260869f, str, jVar.f260868e);
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.app.Activity context = jVar.getContext();
            java.lang.String string = jVar.getActivity().getString(com.tencent.mm.R.string.f490537xw);
            java.lang.String string2 = jVar.getActivity().getString(com.tencent.mm.R.string.f490551ya);
            fb3.h hVar = new fb3.h(jVar, str);
            r35.k1 k1Var = (r35.k1) q1Var;
            k1Var.getClass();
            r35.i1 i1Var = new r35.i1(context);
            i1Var.l(str);
            i1Var.i(string);
            i1Var.g(java.lang.Boolean.FALSE);
            i1Var.f369137d = string2;
            i1Var.a(new r35.n1(k1Var, hVar));
            i1Var.k();
        }
        return jz5.f0.f302826a;
    }
}
