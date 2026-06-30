package m92;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f324967a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f324968b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f324969c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324970d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hz0 f324971e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hz0 f324972f;

    /* renamed from: g, reason: collision with root package name */
    public int f324973g;

    /* renamed from: h, reason: collision with root package name */
    public int f324974h;

    /* renamed from: i, reason: collision with root package name */
    public int f324975i;

    /* renamed from: j, reason: collision with root package name */
    public int f324976j;

    /* renamed from: k, reason: collision with root package name */
    public r45.fa0 f324977k;

    public a(java.lang.String clientId) {
        kotlin.jvm.internal.o.g(clientId, "clientId");
        this.f324967a = clientId;
        this.f324968b = "";
        this.f324969c = "";
        this.f324970d = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m92.a) && kotlin.jvm.internal.o.b(this.f324967a, ((m92.a) obj).f324967a);
    }

    public int hashCode() {
        return this.f324967a.hashCode();
    }

    public java.lang.String toString() {
        return "CreateFinderAccountArgs(clientId=" + this.f324967a + ')';
    }
}
