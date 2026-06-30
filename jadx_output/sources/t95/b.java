package t95;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416585a;

    /* renamed from: b, reason: collision with root package name */
    public final t95.g f416586b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f416587c;

    /* renamed from: d, reason: collision with root package name */
    public t95.g f416588d;

    public b(java.lang.String path, t95.g range, boolean z17) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(range, "range");
        this.f416585a = path;
        this.f416586b = range;
        this.f416587c = z17;
        this.f416588d = new t95.g(0L, 0L);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95.b)) {
            return false;
        }
        t95.b bVar = (t95.b) obj;
        return kotlin.jvm.internal.o.b(this.f416585a, bVar.f416585a) && kotlin.jvm.internal.o.b(this.f416586b, bVar.f416586b) && this.f416587c == bVar.f416587c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f416585a.hashCode() * 31) + this.f416586b.hashCode()) * 31;
        boolean z17 = this.f416587c;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    public java.lang.String toString() {
        return "ItemRan(path=" + this.f416585a + ", range=" + this.f416586b + ", isDeflateCompressed=" + this.f416587c + ')';
    }
}
