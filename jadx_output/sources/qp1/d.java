package qp1;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f365714a;

    /* renamed from: b, reason: collision with root package name */
    public final wu5.c f365715b;

    public d(long j17, wu5.c futureTask) {
        kotlin.jvm.internal.o.g(futureTask, "futureTask");
        this.f365714a = j17;
        this.f365715b = futureTask;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp1.d)) {
            return false;
        }
        qp1.d dVar = (qp1.d) obj;
        return this.f365714a == dVar.f365714a && kotlin.jvm.internal.o.b(this.f365715b, dVar.f365715b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f365714a) * 31) + this.f365715b.hashCode();
    }

    public java.lang.String toString() {
        return "DelayAutoCollapseTask(taskId=" + this.f365714a + ", futureTask=" + this.f365715b + ')';
    }
}
