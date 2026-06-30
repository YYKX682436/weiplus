package fo5;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f264975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f264978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264979e;

    public f(int i17, int i18, int i19, int i27, int i28) {
        this.f264975a = i17;
        this.f264976b = i18;
        this.f264977c = i19;
        this.f264978d = i27;
        this.f264979e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo5.f)) {
            return false;
        }
        fo5.f fVar = (fo5.f) obj;
        return this.f264975a == fVar.f264975a && this.f264976b == fVar.f264976b && this.f264977c == fVar.f264977c && this.f264978d == fVar.f264978d && this.f264979e == fVar.f264979e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f264975a) * 31) + java.lang.Integer.hashCode(this.f264976b)) * 31) + java.lang.Integer.hashCode(this.f264977c)) * 31) + java.lang.Integer.hashCode(this.f264978d)) * 31) + java.lang.Integer.hashCode(this.f264979e);
    }

    public java.lang.String toString() {
        return "RenderErrorReport(camera=" + this.f264975a + ", onscreen=" + this.f264976b + ", encode=" + this.f264977c + ", decode=" + this.f264978d + ", errorState=" + this.f264979e + ')';
    }
}
