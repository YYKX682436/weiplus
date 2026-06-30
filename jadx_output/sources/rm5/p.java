package rm5;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f397532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397534c;

    /* renamed from: d, reason: collision with root package name */
    public final int f397535d;

    public p(int i17, int i18, int i19, int i27) {
        this.f397532a = i17;
        this.f397533b = i18;
        this.f397534c = i19;
        this.f397535d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5.p)) {
            return false;
        }
        rm5.p pVar = (rm5.p) obj;
        return this.f397532a == pVar.f397532a && this.f397533b == pVar.f397533b && this.f397534c == pVar.f397534c && this.f397535d == pVar.f397535d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f397532a) * 31) + java.lang.Integer.hashCode(this.f397533b)) * 31) + java.lang.Integer.hashCode(this.f397534c)) * 31) + java.lang.Integer.hashCode(this.f397535d);
    }

    public java.lang.String toString() {
        return "VideoClipInfo(width=" + this.f397532a + ", height=" + this.f397533b + ", rotate=" + this.f397534c + ", durationMs=" + this.f397535d + ')';
    }
}
