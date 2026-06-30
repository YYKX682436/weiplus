package zl2;

/* loaded from: classes3.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474037a;

    /* renamed from: b, reason: collision with root package name */
    public final zl2.x4 f474038b;

    /* renamed from: c, reason: collision with root package name */
    public final long f474039c;

    public y4(java.lang.String stage, zl2.x4 type, long j17) {
        kotlin.jvm.internal.o.g(stage, "stage");
        kotlin.jvm.internal.o.g(type, "type");
        this.f474037a = stage;
        this.f474038b = type;
        this.f474039c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.y4)) {
            return false;
        }
        zl2.y4 y4Var = (zl2.y4) obj;
        return kotlin.jvm.internal.o.b(this.f474037a, y4Var.f474037a) && this.f474038b == y4Var.f474038b && this.f474039c == y4Var.f474039c;
    }

    public int hashCode() {
        return (((this.f474037a.hashCode() * 31) + this.f474038b.hashCode()) * 31) + java.lang.Long.hashCode(this.f474039c);
    }

    public java.lang.String toString() {
        return "PerformanceEvent(stage=" + this.f474037a + ", type=" + this.f474038b + ", timestamp=" + this.f474039c + ')';
    }
}
