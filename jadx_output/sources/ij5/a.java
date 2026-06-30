package ij5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.c f291748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ij5.c cVar) {
        super(1);
        this.f291748d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        ij5.c cVar = this.f291748d;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactBaseMvvmListUIC", "InitAction");
            cVar.U6().b().setVisibility(0);
            cVar.U6().b().setDefaultHint(cVar.getString(com.tencent.mm.R.string.f490845b05));
            android.view.View findViewById = cVar.U6().b().findViewById(com.tencent.mm.R.id.m7g);
            if (findViewById != null) {
                findViewById.setBackground(null);
            }
            android.view.View findViewById2 = cVar.U6().b().findViewById(com.tencent.mm.R.id.f486064k12);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.ahm);
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null && (eVar = t0Var.f298067a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                ri5.j jVar = t0Var.f446341b;
                jVar.getClass();
                if (jVar.f396113h.d(jVar)) {
                    cVar.U6().b().c();
                    cVar.U6().b().clearFocus();
                    cVar.hideVKB();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
