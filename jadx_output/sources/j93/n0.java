package j93;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j93.r0 r0Var) {
        super(1);
        this.f298459d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            j93.r0 r0Var = this.f298459d;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = r0Var.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new j93.j0(r0Var, oVar, null), 1, null);
            }
            com.tencent.mm.sdk.coroutines.LifecycleScope O62 = r0Var.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new j93.m0(r0Var, oVar, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
