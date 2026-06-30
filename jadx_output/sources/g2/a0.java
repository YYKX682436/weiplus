package g2;

/* loaded from: classes14.dex */
public final class a0 implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f267681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267682b;

    public a0(java.lang.String text, int i17) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f267681a = new a2.d(text, null, null, 6, null);
        this.f267682b = i17;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        int i17 = buffer.f267699d;
        boolean z17 = i17 != -1;
        a2.d dVar = this.f267681a;
        if (z17) {
            buffer.d(i17, buffer.f267700e, dVar.f681d);
            java.lang.String str = dVar.f681d;
            if (str.length() > 0) {
                buffer.e(i17, str.length() + i17);
            }
        } else {
            int i18 = buffer.f267697b;
            buffer.d(i18, buffer.f267698c, dVar.f681d);
            java.lang.String str2 = dVar.f681d;
            if (str2.length() > 0) {
                buffer.e(i18, str2.length() + i18);
            }
        }
        int i19 = buffer.f267697b;
        int i27 = buffer.f267698c;
        int i28 = i19 == i27 ? i27 : -1;
        int i29 = this.f267682b;
        int i37 = i28 + i29;
        int f17 = e06.p.f(i29 > 0 ? i37 - 1 : i37 - dVar.f681d.length(), 0, buffer.c());
        buffer.f(f17, f17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.a0)) {
            return false;
        }
        g2.a0 a0Var = (g2.a0) obj;
        return kotlin.jvm.internal.o.b(this.f267681a.f681d, a0Var.f267681a.f681d) && this.f267682b == a0Var.f267682b;
    }

    public int hashCode() {
        return (this.f267681a.f681d.hashCode() * 31) + this.f267682b;
    }

    public java.lang.String toString() {
        return "SetComposingTextCommand(text='" + this.f267681a.f681d + "', newCursorPosition=" + this.f267682b + ')';
    }
}
