package i13;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f287270a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f287271b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f287272c;

    public a(java.lang.String id6, java.lang.String token, boolean z17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(token, "token");
        this.f287270a = id6;
        this.f287271b = token;
        this.f287272c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i13.a)) {
            return false;
        }
        i13.a aVar = (i13.a) obj;
        return kotlin.jvm.internal.o.b(this.f287270a, aVar.f287270a) && kotlin.jvm.internal.o.b(this.f287271b, aVar.f287271b) && this.f287272c == aVar.f287272c;
    }

    public int hashCode() {
        return (((this.f287270a.hashCode() * 31) + this.f287271b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f287272c);
    }

    public java.lang.String toString() {
        return "MsgState(id=" + this.f287270a + ", token=" + this.f287271b + ", isExposing=" + this.f287272c + ')';
    }
}
