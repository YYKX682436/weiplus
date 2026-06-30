package m16;

/* loaded from: classes15.dex */
public final class e extends m16.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f322890a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f322891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name, java.lang.String desc) {
        super(null);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f322890a = name;
        this.f322891b = desc;
    }

    @Override // m16.f
    public java.lang.String a() {
        return this.f322890a + this.f322891b;
    }

    @Override // m16.f
    public java.lang.String b() {
        return this.f322891b;
    }

    @Override // m16.f
    public java.lang.String c() {
        return this.f322890a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16.e)) {
            return false;
        }
        m16.e eVar = (m16.e) obj;
        return kotlin.jvm.internal.o.b(this.f322890a, eVar.f322890a) && kotlin.jvm.internal.o.b(this.f322891b, eVar.f322891b);
    }

    public int hashCode() {
        return (this.f322890a.hashCode() * 31) + this.f322891b.hashCode();
    }
}
