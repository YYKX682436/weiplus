package fi2;

/* loaded from: classes10.dex */
public final class x implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.e0 f262924d;

    public x(fi2.e0 e0Var) {
        this.f262924d = e0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mh2.u1 u1Var;
        om2.d0 d0Var = (om2.d0) obj;
        fi2.e0 e0Var = this.f262924d;
        com.tencent.mars.xlog.Log.i(e0Var.f262821f, "collect sing_state: " + d0Var);
        if (d0Var != null && (u1Var = e0Var.f262825j) != null) {
            u1Var.c(d0Var);
        }
        return jz5.f0.f302826a;
    }
}
