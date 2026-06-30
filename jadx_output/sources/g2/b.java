package g2;

/* loaded from: classes14.dex */
public final class b implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f267683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267684b;

    public b(int i17, int i18) {
        this.f267683a = i17;
        this.f267684b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        int i17 = buffer.f267698c;
        buffer.a(i17, java.lang.Math.min(this.f267684b + i17, buffer.c()));
        buffer.a(java.lang.Math.max(0, buffer.f267697b - this.f267683a), buffer.f267697b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.b)) {
            return false;
        }
        g2.b bVar = (g2.b) obj;
        return this.f267683a == bVar.f267683a && this.f267684b == bVar.f267684b;
    }

    public int hashCode() {
        return (this.f267683a * 31) + this.f267684b;
    }

    public java.lang.String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f267683a + ", lengthAfterCursor=" + this.f267684b + ')';
    }
}
