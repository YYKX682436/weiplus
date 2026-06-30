package ps3;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.oi5 f358118a;

    /* renamed from: b, reason: collision with root package name */
    public final ps3.e f358119b;

    public p(r45.oi5 member, ps3.e state) {
        kotlin.jvm.internal.o.g(member, "member");
        kotlin.jvm.internal.o.g(state, "state");
        this.f358118a = member;
        this.f358119b = state;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps3.p)) {
            return false;
        }
        ps3.p pVar = (ps3.p) obj;
        return kotlin.jvm.internal.o.b(this.f358118a, pVar.f358118a) && this.f358119b == pVar.f358119b;
    }

    public int hashCode() {
        return (this.f358118a.hashCode() * 31) + this.f358119b.hashCode();
    }

    public java.lang.String toString() {
        return "LatestChangeStat(member=" + this.f358118a + ", state=" + this.f358119b + ')';
    }
}
