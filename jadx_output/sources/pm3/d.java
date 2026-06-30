package pm3;

/* loaded from: classes10.dex */
public final class d extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final pm3.c f356875b;

    /* renamed from: c, reason: collision with root package name */
    public final im3.j f356876c;

    public d(pm3.c source, im3.j item) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(item, "item");
        this.f356875b = source;
        this.f356876c = item;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm3.d)) {
            return false;
        }
        pm3.d dVar = (pm3.d) obj;
        return this.f356875b == dVar.f356875b && kotlin.jvm.internal.o.b(this.f356876c, dVar.f356876c);
    }

    public int hashCode() {
        return (this.f356875b.hashCode() * 31) + this.f356876c.hashCode();
    }

    public java.lang.String toString() {
        return "SelectAction(source=" + this.f356875b + ", item=" + this.f356876c + ')';
    }
}
