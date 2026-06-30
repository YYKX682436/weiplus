package kb5;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb5.f f306247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kb5.f fVar) {
        super(1);
        this.f306247d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        kb5.f fVar = this.f306247d;
        if (h0Var != null) {
            ((em.l2) ((jz5.n) fVar.f306250d).getValue()).b().setVisibility(0);
            android.view.View findViewById = ((em.l2) ((jz5.n) fVar.f306250d).getValue()).b().findViewById(com.tencent.mm.R.id.f486064k12);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.tencent.mm.R.drawable.ahm);
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null && (eVar = t0Var.f298067a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                ri5.j jVar = t0Var.f446341b;
                jVar.getClass();
                if (jVar.f396113h.d(jVar)) {
                    ((em.l2) ((jz5.n) fVar.f306250d).getValue()).b().c();
                    ((em.l2) ((jz5.n) fVar.f306250d).getValue()).b().clearFocus();
                    fVar.hideVKB();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
