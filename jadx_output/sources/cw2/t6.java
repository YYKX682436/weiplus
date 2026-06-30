package cw2;

/* loaded from: classes2.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f224023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f224024b;

    public t6(long j17, boolean z17) {
        this.f224023a = j17;
        this.f224024b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.t6)) {
            return false;
        }
        cw2.t6 t6Var = (cw2.t6) obj;
        return this.f224023a == t6Var.f224023a && this.f224024b == t6Var.f224024b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f224023a) * 31) + java.lang.Boolean.hashCode(this.f224024b);
    }

    public java.lang.String toString() {
        return "StartPlayParam(startPosMs=" + this.f224023a + ", enableAccurateSeek=" + this.f224024b + ')';
    }
}
