package oh2;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f345407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345408b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f345409c;

    public p(int i17, int i18, boolean z17) {
        this.f345407a = i17;
        this.f345408b = i18;
        this.f345409c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh2.p)) {
            return false;
        }
        oh2.p pVar = (oh2.p) obj;
        return this.f345407a == pVar.f345407a && this.f345408b == pVar.f345408b && this.f345409c == pVar.f345409c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f345407a) * 31) + java.lang.Integer.hashCode(this.f345408b)) * 31) + java.lang.Boolean.hashCode(this.f345409c);
    }

    public java.lang.String toString() {
        return "time: " + this.f345407a + ", pitch: " + this.f345408b + ", hit: " + this.f345409c;
    }
}
