package te2;

/* loaded from: classes10.dex */
public final class k9 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f418174d;

    public k9(te2.m9 m9Var) {
        this.f418174d = m9Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        bm2.x8 x8Var = this.f418174d.f418154i;
        if (x8Var != null) {
            x8Var.b(true);
        }
        return jz5.f0.f302826a;
    }
}
