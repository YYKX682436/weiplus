package dk2;

/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f233242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233243b;

    public b8(long j17, int i17) {
        this.f233242a = j17;
        this.f233243b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.b8)) {
            return false;
        }
        dk2.b8 b8Var = (dk2.b8) obj;
        return this.f233242a == b8Var.f233242a && this.f233243b == b8Var.f233243b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f233242a) * 31) + java.lang.Integer.hashCode(this.f233243b);
    }

    public java.lang.String toString() {
        return "FinderLiveInviteData(timeOut=" + this.f233242a + ", invitePos=" + this.f233243b + ')';
    }
}
