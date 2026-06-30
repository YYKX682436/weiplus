package km2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309076a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309077b;

    /* renamed from: c, reason: collision with root package name */
    public final long f309078c;

    public c(java.lang.String sessionId, java.lang.String vrRoomId, long j17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(vrRoomId, "vrRoomId");
        this.f309076a = sessionId;
        this.f309077b = vrRoomId;
        this.f309078c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.c)) {
            return false;
        }
        km2.c cVar = (km2.c) obj;
        return kotlin.jvm.internal.o.b(this.f309076a, cVar.f309076a) && kotlin.jvm.internal.o.b(this.f309077b, cVar.f309077b) && this.f309078c == cVar.f309078c;
    }

    public int hashCode() {
        return (((this.f309076a.hashCode() * 31) + this.f309077b.hashCode()) * 31) + java.lang.Long.hashCode(this.f309078c);
    }

    public java.lang.String toString() {
        return "AnchorMicPkData(sessionId=" + this.f309076a + ", vrRoomId=" + this.f309077b + ", vrRoomIdVersion=" + this.f309078c + ')';
    }
}
