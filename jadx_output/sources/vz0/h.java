package vz0;

/* loaded from: classes14.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f441605d;

    public h(vz0.d0 d0Var) {
        this.f441605d = d0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ((java.lang.Boolean) obj).booleanValue();
        vz0.d0 d0Var = this.f441605d;
        e0.n d17 = d0Var.d();
        int i17 = d17 != null ? ((e0.q0) d17).f245679b : 0;
        if (i17 != d0Var.e()) {
            ((n0.q4) d0Var.f441595b).setValue(java.lang.Integer.valueOf(i17));
        }
        ((n0.q4) d0Var.f441598e).setValue(null);
        return jz5.f0.f302826a;
    }
}
