package v11;

/* loaded from: classes11.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f432346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432348c;

    public c0(int i17, int i18, int i19) {
        this.f432346a = i17;
        this.f432347b = i18;
        this.f432348c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.c0)) {
            return false;
        }
        v11.c0 c0Var = (v11.c0) obj;
        return this.f432346a == c0Var.f432346a && this.f432347b == c0Var.f432347b && this.f432348c == c0Var.f432348c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f432346a) * 31) + java.lang.Integer.hashCode(this.f432347b)) * 31) + java.lang.Integer.hashCode(this.f432348c);
    }

    public java.lang.String toString() {
        return "NativeMarkdownListConfig(prefixColor=" + this.f432346a + ", prefixGapPx=" + this.f432347b + ", indentPerLevelPx=" + this.f432348c + ')';
    }
}
