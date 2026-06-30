package g2;

/* loaded from: classes14.dex */
public final class c implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f267687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267688b;

    public c(int i17, int i18) {
        this.f267687a = i17;
        this.f267688b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        int i17 = 0;
        for (int i18 = 0; i18 < this.f267687a; i18++) {
            i17++;
            int i19 = buffer.f267697b;
            if (i19 > i17) {
                if (java.lang.Character.isHighSurrogate(buffer.b((i19 - i17) + (-1))) && java.lang.Character.isLowSurrogate(buffer.b(buffer.f267697b - i17))) {
                    i17++;
                }
            }
            if (i17 == buffer.f267697b) {
                break;
            }
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f267688b; i28++) {
            i27++;
            if (buffer.f267698c + i27 < buffer.c()) {
                if (java.lang.Character.isHighSurrogate(buffer.b((buffer.f267698c + i27) + (-1))) && java.lang.Character.isLowSurrogate(buffer.b(buffer.f267698c + i27))) {
                    i27++;
                }
            }
            if (buffer.f267698c + i27 == buffer.c()) {
                break;
            }
        }
        int i29 = buffer.f267698c;
        buffer.a(i29, i27 + i29);
        int i37 = buffer.f267697b;
        buffer.a(i37 - i17, i37);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.c)) {
            return false;
        }
        g2.c cVar = (g2.c) obj;
        return this.f267687a == cVar.f267687a && this.f267688b == cVar.f267688b;
    }

    public int hashCode() {
        return (this.f267687a * 31) + this.f267688b;
    }

    public java.lang.String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f267687a + ", lengthAfterCursor=" + this.f267688b + ')';
    }
}
