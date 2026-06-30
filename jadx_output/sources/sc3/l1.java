package sc3;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406497a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f406498b;

    public l1(java.lang.String instanceName, boolean z17) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f406497a = instanceName;
        this.f406498b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc3.l1)) {
            return false;
        }
        sc3.l1 l1Var = (sc3.l1) obj;
        return kotlin.jvm.internal.o.b(this.f406497a, l1Var.f406497a) && this.f406498b == l1Var.f406498b;
    }

    public int hashCode() {
        return (this.f406497a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f406498b);
    }

    public java.lang.String toString() {
        return "InstanceWithState(instanceName=" + this.f406497a + ", isPause=" + this.f406498b + ')';
    }
}
