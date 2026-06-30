package g2;

/* loaded from: classes14.dex */
public final class b0 implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f267685a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267686b;

    public b0(int i17, int i18) {
        this.f267685a = i17;
        this.f267686b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        int f17 = e06.p.f(this.f267685a, 0, buffer.c());
        int f18 = e06.p.f(this.f267686b, 0, buffer.c());
        if (f17 < f18) {
            buffer.f(f17, f18);
        } else {
            buffer.f(f18, f17);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.b0)) {
            return false;
        }
        g2.b0 b0Var = (g2.b0) obj;
        return this.f267685a == b0Var.f267685a && this.f267686b == b0Var.f267686b;
    }

    public int hashCode() {
        return (this.f267685a * 31) + this.f267686b;
    }

    public java.lang.String toString() {
        return "SetSelectionCommand(start=" + this.f267685a + ", end=" + this.f267686b + ')';
    }
}
