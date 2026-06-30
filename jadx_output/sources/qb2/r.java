package qb2;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361272a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361273b;

    /* renamed from: c, reason: collision with root package name */
    public final long f361274c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361275d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361276e;

    public r(java.lang.String source, java.lang.String sql, long j17, java.lang.String currentThread, long j18) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(sql, "sql");
        kotlin.jvm.internal.o.g(currentThread, "currentThread");
        this.f361272a = source;
        this.f361273b = sql;
        this.f361274c = j17;
        this.f361275d = currentThread;
        this.f361276e = j18;
    }

    public final void a() {
        if (this.f361274c >= 16 || r26.n0.B(this.f361272a, "reportSize", true) || r26.n0.B(this.f361272a, "enterFinderConversationPage", true)) {
            ((ku5.t0) ku5.t0.f312615d).a(new qb2.q(this));
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb2.r)) {
            return false;
        }
        qb2.r rVar = (qb2.r) obj;
        return kotlin.jvm.internal.o.b(this.f361272a, rVar.f361272a) && kotlin.jvm.internal.o.b(this.f361273b, rVar.f361273b) && this.f361274c == rVar.f361274c && kotlin.jvm.internal.o.b(this.f361275d, rVar.f361275d) && this.f361276e == rVar.f361276e;
    }

    public int hashCode() {
        return (((((((this.f361272a.hashCode() * 31) + this.f361273b.hashCode()) * 31) + java.lang.Long.hashCode(this.f361274c)) * 31) + this.f361275d.hashCode()) * 31) + java.lang.Long.hashCode(this.f361276e);
    }

    public java.lang.String toString() {
        return "source:" + this.f361272a + ", sql:" + this.f361273b + ", duration:" + this.f361274c + ", currentThread:" + this.f361275d + ", tableSize:" + this.f361276e;
    }
}
