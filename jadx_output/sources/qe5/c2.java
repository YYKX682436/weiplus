package qe5;

/* loaded from: classes12.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.f2 f362082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(qe5.f2 f2Var) {
        super(1);
        this.f362082d = f2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.pluginsdk.model.o2 o2Var;
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.j jVar = (kd5.j) state.a(kd5.j.class);
        qe5.f2 f2Var = this.f362082d;
        if (jVar != null) {
            f2Var.X6(jVar.f306898b);
        }
        if (((kd5.k) state.a(kd5.k.class)) != null && f2Var.f362107g) {
            f2Var.V6();
        }
        kd5.l lVar = (kd5.l) state.a(kd5.l.class);
        if (lVar != null) {
            if (!f2Var.f362107g || (o2Var = f2Var.f362105e) == null) {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Di(f2Var.getActivity(), lVar.f306899b, lVar.f306902e, lVar.f306900c, lVar.f306901d);
            } else {
                ((com.tencent.mm.pluginsdk.ui.otherway.u0) o2Var).n(f2Var.getContext());
            }
            f2Var.W6(false);
        }
        return jz5.f0.f302826a;
    }
}
