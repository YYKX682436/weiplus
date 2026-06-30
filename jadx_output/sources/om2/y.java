package om2;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346390b;

    /* renamed from: c, reason: collision with root package name */
    public final my5.a f346391c;

    public y(java.lang.String version, int i17, my5.a qrc) {
        kotlin.jvm.internal.o.g(version, "version");
        kotlin.jvm.internal.o.g(qrc, "qrc");
        this.f346389a = version;
        this.f346390b = i17;
        this.f346391c = qrc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.y)) {
            return false;
        }
        om2.y yVar = (om2.y) obj;
        return kotlin.jvm.internal.o.b(this.f346389a, yVar.f346389a) && this.f346390b == yVar.f346390b && kotlin.jvm.internal.o.b(this.f346391c, yVar.f346391c);
    }

    public int hashCode() {
        return (((this.f346389a.hashCode() * 31) + java.lang.Integer.hashCode(this.f346390b)) * 31) + this.f346391c.hashCode();
    }

    public java.lang.String toString() {
        return "version " + this.f346389a + " compressType: " + this.f346390b + " qrcSize: " + this.f346391c.b();
    }
}
