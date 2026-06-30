package id;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f290442a;

    /* renamed from: b, reason: collision with root package name */
    public final h45.m f290443b;

    public b(int i17, h45.m callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f290442a = i17;
        this.f290443b = callback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id.b)) {
            return false;
        }
        id.b bVar = (id.b) obj;
        return this.f290442a == bVar.f290442a && kotlin.jvm.internal.o.b(this.f290443b, bVar.f290443b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f290442a) * 31) + this.f290443b.hashCode();
    }

    public java.lang.String toString() {
        return "CallbackItem(id=" + this.f290442a + ", callback=" + this.f290443b + ')';
    }
}
