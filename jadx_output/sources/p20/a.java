package p20;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p20.j f351407a;

    /* renamed from: b, reason: collision with root package name */
    public final long f351408b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f351409c;

    public a(p20.j cacheRecord, long j17, java.lang.String groupName) {
        kotlin.jvm.internal.o.g(cacheRecord, "cacheRecord");
        kotlin.jvm.internal.o.g(groupName, "groupName");
        this.f351407a = cacheRecord;
        this.f351408b = j17;
        this.f351409c = groupName;
    }

    public final java.lang.String a() {
        return this.f351407a.b();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p20.a)) {
            return false;
        }
        p20.a aVar = (p20.a) obj;
        return kotlin.jvm.internal.o.b(this.f351407a, aVar.f351407a) && this.f351408b == aVar.f351408b && kotlin.jvm.internal.o.b(this.f351409c, aVar.f351409c);
    }

    public int hashCode() {
        return (((this.f351407a.hashCode() * 31) + java.lang.Long.hashCode(this.f351408b)) * 31) + this.f351409c.hashCode();
    }

    public java.lang.String toString() {
        return "PreloadTask(cacheRecord=" + this.f351407a + ", preloadSize=" + this.f351408b + ", groupName=" + this.f351409c + ')';
    }
}
