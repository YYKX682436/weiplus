package if0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final wu5.c f291033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f291034b;

    public l(wu5.c task, int i17) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f291033a = task;
        this.f291034b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0.l)) {
            return false;
        }
        if0.l lVar = (if0.l) obj;
        return kotlin.jvm.internal.o.b(this.f291033a, lVar.f291033a) && this.f291034b == lVar.f291034b;
    }

    public int hashCode() {
        return (this.f291033a.hashCode() * 31) + java.lang.Integer.hashCode(this.f291034b);
    }

    public java.lang.String toString() {
        return super.toString() + ", priority:" + this.f291034b + ", state:" + this.f291033a.getState();
    }
}
