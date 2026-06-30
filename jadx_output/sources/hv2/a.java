package hv2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f285281a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f285282b;

    /* renamed from: c, reason: collision with root package name */
    public long f285283c;

    /* renamed from: d, reason: collision with root package name */
    public final long f285284d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f285285e;

    public a(java.lang.String username, java.lang.String nickname, long j17, long j18) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f285281a = username;
        this.f285282b = nickname;
        this.f285283c = j17;
        this.f285284d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv2.a)) {
            return false;
        }
        hv2.a aVar = (hv2.a) obj;
        return kotlin.jvm.internal.o.b(this.f285281a, aVar.f285281a) && kotlin.jvm.internal.o.b(this.f285282b, aVar.f285282b) && this.f285283c == aVar.f285283c && this.f285284d == aVar.f285284d;
    }

    public int hashCode() {
        return (((((this.f285281a.hashCode() * 31) + this.f285282b.hashCode()) * 31) + java.lang.Long.hashCode(this.f285283c)) * 31) + java.lang.Long.hashCode(this.f285284d);
    }

    public java.lang.String toString() {
        return "MentionContact(username='" + this.f285281a + "', nickname='" + this.f285282b + "', start=" + this.f285283c + ", length=" + this.f285284d + ')';
    }
}
