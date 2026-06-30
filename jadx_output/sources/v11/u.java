package v11;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f432469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f432472d;

    public u(int i17, int i18, int i19, int i27) {
        this.f432469a = i17;
        this.f432470b = i18;
        this.f432471c = i19;
        this.f432472d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.u)) {
            return false;
        }
        v11.u uVar = (v11.u) obj;
        return this.f432469a == uVar.f432469a && this.f432470b == uVar.f432470b && this.f432471c == uVar.f432471c && this.f432472d == uVar.f432472d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f432469a) * 31) + java.lang.Integer.hashCode(this.f432470b)) * 31) + java.lang.Integer.hashCode(this.f432471c)) * 31) + java.lang.Integer.hashCode(this.f432472d);
    }

    public java.lang.String toString() {
        return "NativeMarkdownBlockquoteConfig(barWidthPx=" + this.f432469a + ", barColor=" + this.f432470b + ", barMarginEndPx=" + this.f432471c + ", maxNestLevel=" + this.f432472d + ')';
    }
}
