package g2;

/* loaded from: classes14.dex */
public final class z implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f267762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267763b;

    public z(int i17, int i18) {
        this.f267762a = i17;
        this.f267763b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (buffer.f267699d != -1) {
            buffer.f267699d = -1;
            buffer.f267700e = -1;
        }
        int f17 = e06.p.f(this.f267762a, 0, buffer.c());
        int f18 = e06.p.f(this.f267763b, 0, buffer.c());
        if (f17 != f18) {
            if (f17 < f18) {
                buffer.e(f17, f18);
            } else {
                buffer.e(f18, f17);
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.z)) {
            return false;
        }
        g2.z zVar = (g2.z) obj;
        return this.f267762a == zVar.f267762a && this.f267763b == zVar.f267763b;
    }

    public int hashCode() {
        return (this.f267762a * 31) + this.f267763b;
    }

    public java.lang.String toString() {
        return "SetComposingRegionCommand(start=" + this.f267762a + ", end=" + this.f267763b + ')';
    }
}
