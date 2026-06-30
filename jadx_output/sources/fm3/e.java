package fm3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h51 f264043a;

    /* renamed from: b, reason: collision with root package name */
    public final long f264044b;

    public e(r45.h51 response, long j17) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f264043a = response;
        this.f264044b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.e)) {
            return false;
        }
        fm3.e eVar = (fm3.e) obj;
        return kotlin.jvm.internal.o.b(this.f264043a, eVar.f264043a) && this.f264044b == eVar.f264044b;
    }

    public int hashCode() {
        return (this.f264043a.hashCode() * 31) + java.lang.Long.hashCode(this.f264044b);
    }

    public java.lang.String toString() {
        return "FinderFeedDetailCache(response=" + this.f264043a + ", timestamp=" + this.f264044b + ')';
    }
}
