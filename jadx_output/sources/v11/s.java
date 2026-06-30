package v11;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f432458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f432461d;

    public s(int i17, int i18, int i19, int i27) {
        this.f432458a = i17;
        this.f432459b = i18;
        this.f432460c = i19;
        this.f432461d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.s)) {
            return false;
        }
        v11.s sVar = (v11.s) obj;
        return this.f432458a == sVar.f432458a && this.f432459b == sVar.f432459b && this.f432460c == sVar.f432460c && this.f432461d == sVar.f432461d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f432458a) * 31) + java.lang.Integer.hashCode(this.f432459b)) * 31) + java.lang.Integer.hashCode(this.f432460c)) * 31) + java.lang.Integer.hashCode(this.f432461d);
    }

    public java.lang.String toString() {
        return "MarkdownSourceRange(contentStart=" + this.f432458a + ", contentEnd=" + this.f432459b + ", fullStart=" + this.f432460c + ", fullEnd=" + this.f432461d + ')';
    }
}
