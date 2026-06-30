package om2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346272b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f346273c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f346274d;

    public b(java.lang.String id6, int i17, java.lang.String url, java.lang.String name) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(name, "name");
        this.f346271a = id6;
        this.f346272b = i17;
        this.f346273c = url;
        this.f346274d = name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.b)) {
            return false;
        }
        om2.b bVar = (om2.b) obj;
        return kotlin.jvm.internal.o.b(this.f346271a, bVar.f346271a) && this.f346272b == bVar.f346272b && kotlin.jvm.internal.o.b(this.f346273c, bVar.f346273c) && kotlin.jvm.internal.o.b(this.f346274d, bVar.f346274d);
    }

    public int hashCode() {
        return (((((this.f346271a.hashCode() * 31) + java.lang.Integer.hashCode(this.f346272b)) * 31) + this.f346273c.hashCode()) * 31) + this.f346274d.hashCode();
    }

    public java.lang.String toString() {
        return "KTVReverbData(id=" + this.f346271a + ", reverbType=" + this.f346272b + ", url=" + this.f346273c + ", name=" + this.f346274d + ')';
    }
}
