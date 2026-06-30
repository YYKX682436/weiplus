package om2;

/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f346269a;

    /* renamed from: b, reason: collision with root package name */
    public final long f346270b;

    public a0(long j17, long j18) {
        this.f346269a = j17;
        this.f346270b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.a0)) {
            return false;
        }
        om2.a0 a0Var = (om2.a0) obj;
        return this.f346269a == a0Var.f346269a && this.f346270b == a0Var.f346270b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f346269a) * 31) + java.lang.Long.hashCode(this.f346270b);
    }

    public java.lang.String toString() {
        return "SeekState(startTime=" + this.f346269a + ", endTime=" + this.f346270b + ')';
    }
}
