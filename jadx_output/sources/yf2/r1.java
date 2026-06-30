package yf2;

/* loaded from: classes3.dex */
public final class r1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.t1 f461779d;

    public r1(yf2.t1 t1Var) {
        this.f461779d = t1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.q12 q12Var = (r45.q12) obj;
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (!r4Var.T1(q12Var) && !r4Var.X1(q12Var)) {
            yf2.t1 t1Var = this.f461779d;
            yf2.t1.Z6(t1Var, (java.util.LinkedList) ((kotlinx.coroutines.flow.h3) ((mm2.s1) t1Var.business(mm2.s1.class)).f329389i).getValue(), (r45.fd2) ((kotlinx.coroutines.flow.h3) ((mm2.g1) t1Var.getStore().business(mm2.g1.class)).f329072m).getValue());
        }
        return jz5.f0.f302826a;
    }
}
