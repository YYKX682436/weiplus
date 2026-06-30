package ir2;

/* loaded from: classes2.dex */
public final class d0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294122d;

    public d0(ir2.a1 a1Var) {
        this.f294122d = a1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ir2.v1 v1Var = (ir2.v1) obj;
        boolean z17 = v1Var instanceof ir2.t1;
        ir2.a1 a1Var = this.f294122d;
        if (z17) {
            ir2.t1 t1Var = (ir2.t1) v1Var;
            if (t1Var.f294223a instanceof ir2.a) {
                ((ir2.c1) ((jz5.n) a1Var.f294099o).getValue()).f294121b.f108490a = ((ir2.a) t1Var.f294223a).f294083e;
            }
        } else if (v1Var instanceof ir2.u1) {
            ir2.u1 u1Var = (ir2.u1) v1Var;
            if (u1Var.f294227a instanceof ir2.a) {
                ((ir2.c1) ((jz5.n) a1Var.f294099o).getValue()).f294121b.f108490a = ((ir2.a) u1Var.f294227a).f294083e;
            }
        }
        return jz5.f0.f302826a;
    }
}
