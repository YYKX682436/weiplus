package e04;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final wu5.c f246085a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f246086b;

    public s1(wu5.c task, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(runnable, "runnable");
        this.f246085a = task;
        this.f246086b = runnable;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04.s1)) {
            return false;
        }
        e04.s1 s1Var = (e04.s1) obj;
        return kotlin.jvm.internal.o.b(this.f246085a, s1Var.f246085a) && kotlin.jvm.internal.o.b(this.f246086b, s1Var.f246086b);
    }

    public int hashCode() {
        return (this.f246085a.hashCode() * 31) + this.f246086b.hashCode();
    }

    public java.lang.String toString() {
        return "ScanCameraFutureTask(task=" + this.f246085a + ", runnable=" + this.f246086b + ')';
    }
}
