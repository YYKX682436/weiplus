package l2;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final l2.n f315128c = new l2.n(p2.u.b(0), p2.u.b(0), null);

    /* renamed from: a, reason: collision with root package name */
    public final long f315129a;

    /* renamed from: b, reason: collision with root package name */
    public final long f315130b;

    public n(long j17, long j18, kotlin.jvm.internal.i iVar) {
        this.f315129a = j17;
        this.f315130b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2.n)) {
            return false;
        }
        l2.n nVar = (l2.n) obj;
        return p2.t.a(this.f315129a, nVar.f315129a) && p2.t.a(this.f315130b, nVar.f315130b);
    }

    public int hashCode() {
        p2.v[] vVarArr = p2.t.f351400b;
        return (java.lang.Long.hashCode(this.f315129a) * 31) + java.lang.Long.hashCode(this.f315130b);
    }

    public java.lang.String toString() {
        return "TextIndent(firstLine=" + ((java.lang.Object) p2.t.d(this.f315129a)) + ", restLine=" + ((java.lang.Object) p2.t.d(this.f315130b)) + ')';
    }
}
