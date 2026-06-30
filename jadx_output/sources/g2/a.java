package g2;

/* loaded from: classes14.dex */
public final class a implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f267679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267680b;

    public a(java.lang.String text, int i17) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f267679a = new a2.d(text, null, null, 6, null);
        this.f267680b = i17;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        int i17 = buffer.f267699d;
        boolean z17 = i17 != -1;
        a2.d dVar = this.f267679a;
        if (z17) {
            buffer.d(i17, buffer.f267700e, dVar.f681d);
        } else {
            buffer.d(buffer.f267697b, buffer.f267698c, dVar.f681d);
        }
        int i18 = buffer.f267697b;
        int i19 = buffer.f267698c;
        if (i18 != i19) {
            i19 = -1;
        }
        int i27 = this.f267680b;
        int i28 = i19 + i27;
        int f17 = e06.p.f(i27 > 0 ? i28 - 1 : i28 - dVar.f681d.length(), 0, buffer.c());
        buffer.f(f17, f17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.a)) {
            return false;
        }
        g2.a aVar = (g2.a) obj;
        return kotlin.jvm.internal.o.b(this.f267679a.f681d, aVar.f267679a.f681d) && this.f267680b == aVar.f267680b;
    }

    public int hashCode() {
        return (this.f267679a.f681d.hashCode() * 31) + this.f267680b;
    }

    public java.lang.String toString() {
        return "CommitTextCommand(text='" + this.f267679a.f681d + "', newCursorPosition=" + this.f267680b + ')';
    }
}
