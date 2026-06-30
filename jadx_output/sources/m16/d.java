package m16;

/* loaded from: classes15.dex */
public final class d extends m16.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f322888a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f322889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String name, java.lang.String desc) {
        super(null);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f322888a = name;
        this.f322889b = desc;
    }

    @Override // m16.f
    public java.lang.String a() {
        return this.f322888a + ':' + this.f322889b;
    }

    @Override // m16.f
    public java.lang.String b() {
        return this.f322889b;
    }

    @Override // m16.f
    public java.lang.String c() {
        return this.f322888a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16.d)) {
            return false;
        }
        m16.d dVar = (m16.d) obj;
        return kotlin.jvm.internal.o.b(this.f322888a, dVar.f322888a) && kotlin.jvm.internal.o.b(this.f322889b, dVar.f322889b);
    }

    public int hashCode() {
        return (this.f322888a.hashCode() * 31) + this.f322889b.hashCode();
    }
}
