package dm;

/* loaded from: classes9.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public p75.m f238599a;

    public final p75.i a() {
        p75.n0 n0Var = dm.o0.f238842p;
        n0Var.getClass();
        p75.m condition = this.f238599a;
        kotlin.jvm.internal.o.g(condition, "condition");
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        return new p75.i(n0Var.b(), condition.b(), condition.e());
    }

    public final dm.n0 b(long j17) {
        p75.m mVar = this.f238599a;
        if (mVar != null) {
            this.f238599a = mVar.c(dm.o0.f238843q.i(java.lang.Long.valueOf(j17)));
        } else {
            this.f238599a = dm.o0.f238843q.i(java.lang.Long.valueOf(j17));
        }
        return this;
    }
}
