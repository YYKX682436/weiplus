package e06;

/* loaded from: classes13.dex */
public final class c extends e06.a implements e06.h {
    static {
        new e06.c((char) 1, (char) 0);
    }

    public c(char c17, char c18) {
        super(c17, c18, 1);
    }

    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        char charValue = ((java.lang.Character) comparable).charValue();
        return kotlin.jvm.internal.o.i(this.f246198d, charValue) <= 0 && kotlin.jvm.internal.o.i(charValue, this.f246199e) <= 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e06.c) {
            if (!isEmpty() || !((e06.c) obj).isEmpty()) {
                e06.c cVar = (e06.c) obj;
                if (this.f246198d == cVar.f246198d) {
                    if (this.f246199e == cVar.f246199e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Character.valueOf(this.f246199e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Character.valueOf(this.f246198d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f246198d * 31) + this.f246199e;
    }

    @Override // e06.h
    public boolean isEmpty() {
        return kotlin.jvm.internal.o.i(this.f246198d, this.f246199e) > 0;
    }

    public java.lang.String toString() {
        return this.f246198d + ".." + this.f246199e;
    }
}
