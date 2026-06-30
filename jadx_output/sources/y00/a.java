package y00;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f458490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f458491b;

    /* renamed from: c, reason: collision with root package name */
    public final long f458492c;

    public a(long j17, java.lang.String xml, long j18) {
        kotlin.jvm.internal.o.g(xml, "xml");
        this.f458490a = j17;
        this.f458491b = xml;
        this.f458492c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00.a)) {
            return false;
        }
        y00.a aVar = (y00.a) obj;
        return this.f458490a == aVar.f458490a && kotlin.jvm.internal.o.b(this.f458491b, aVar.f458491b) && this.f458492c == aVar.f458492c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f458490a) * 31) + this.f458491b.hashCode()) * 31) + java.lang.Long.hashCode(this.f458492c);
    }

    public java.lang.String toString() {
        return "EcsKfProductCardData(msgSvrId=" + this.f458490a + ", xml=" + this.f458491b + ", updateTimeMs=" + this.f458492c + ')';
    }
}
