package ll3;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319234a;

    /* renamed from: b, reason: collision with root package name */
    public final long f319235b;

    /* renamed from: c, reason: collision with root package name */
    public final long f319236c;

    public s1(java.lang.String content, long j17, long j18) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f319234a = content;
        this.f319235b = j17;
        this.f319236c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll3.s1)) {
            return false;
        }
        ll3.s1 s1Var = (ll3.s1) obj;
        return kotlin.jvm.internal.o.b(this.f319234a, s1Var.f319234a) && this.f319235b == s1Var.f319235b && this.f319236c == s1Var.f319236c;
    }

    public int hashCode() {
        return (((this.f319234a.hashCode() * 31) + java.lang.Long.hashCode(this.f319235b)) * 31) + java.lang.Long.hashCode(this.f319236c);
    }

    public java.lang.String toString() {
        return "MusicLrcLine(content=" + this.f319234a + ", startTime=" + this.f319235b + ", endTime=" + this.f319236c + ')';
    }
}
