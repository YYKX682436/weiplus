package wj4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f446751a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f446752b;

    public b(int i17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f446751a = i17;
        this.f446752b = source;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4.b)) {
            return false;
        }
        wj4.b bVar = (wj4.b) obj;
        return this.f446751a == bVar.f446751a && kotlin.jvm.internal.o.b(this.f446752b, bVar.f446752b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f446751a) * 31) + this.f446752b.hashCode();
    }

    public java.lang.String toString() {
        return "CardStrokeContentSnapshot(edgeColor=" + this.f446751a + ", source=" + this.f446752b + ')';
    }
}
