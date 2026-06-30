package l81;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f317075b;

    public s0(java.lang.String snapshotPath, int i17) {
        kotlin.jvm.internal.o.g(snapshotPath, "snapshotPath");
        this.f317074a = snapshotPath;
        this.f317075b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l81.s0)) {
            return false;
        }
        l81.s0 s0Var = (l81.s0) obj;
        return kotlin.jvm.internal.o.b(this.f317074a, s0Var.f317074a) && this.f317075b == s0Var.f317075b;
    }

    public int hashCode() {
        return (this.f317074a.hashCode() * 31) + java.lang.Integer.hashCode(this.f317075b);
    }

    public java.lang.String toString() {
        return "NodeOnlySnapshotInfo(snapshotPath='" + this.f317074a + "', mainContextSnapshotIndex=" + this.f317075b + ')';
    }
}
