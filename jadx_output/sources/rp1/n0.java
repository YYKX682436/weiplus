package rp1;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f398485a;

    /* renamed from: b, reason: collision with root package name */
    public final wu5.c f398486b;

    public n0(long j17, wu5.c futureTask) {
        kotlin.jvm.internal.o.g(futureTask, "futureTask");
        this.f398485a = j17;
        this.f398486b = futureTask;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp1.n0)) {
            return false;
        }
        rp1.n0 n0Var = (rp1.n0) obj;
        return this.f398485a == n0Var.f398485a && kotlin.jvm.internal.o.b(this.f398486b, n0Var.f398486b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f398485a) * 31) + this.f398486b.hashCode();
    }

    public java.lang.String toString() {
        return "CheckIdleStateTask(taskId=" + this.f398485a + ", futureTask=" + this.f398486b + ')';
    }
}
