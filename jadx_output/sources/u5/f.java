package u5;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final u5.k f424703a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f424704b;

    /* renamed from: c, reason: collision with root package name */
    public final long f424705c;

    public f(u5.k kVar, c6.j jVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f424703a = kVar;
        this.f424704b = jVar;
        this.f424705c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.f)) {
            return false;
        }
        u5.f fVar = (u5.f) obj;
        return kotlin.jvm.internal.o.b(this.f424703a, fVar.f424703a) && kotlin.jvm.internal.o.b(this.f424704b, fVar.f424704b) && d1.k.a(this.f424705c, fVar.f424705c);
    }

    public int hashCode() {
        int hashCode = ((this.f424703a.hashCode() * 31) + this.f424704b.hashCode()) * 31;
        int i17 = d1.k.f225643d;
        return hashCode + java.lang.Long.hashCode(this.f424705c);
    }

    public java.lang.String toString() {
        return "Snapshot(state=" + this.f424703a + ", request=" + this.f424704b + ", size=" + ((java.lang.Object) d1.k.f(this.f424705c)) + ')';
    }
}
