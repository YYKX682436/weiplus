package yl2;

/* loaded from: classes3.dex */
public final class l extends yl2.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f463040a;

    public l(int i17) {
        super(null);
        this.f463040a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl2.l) && this.f463040a == ((yl2.l) obj).f463040a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f463040a);
    }

    public java.lang.String toString() {
        return "Blocked(errCode=" + this.f463040a + ')';
    }

    public /* synthetic */ l(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
