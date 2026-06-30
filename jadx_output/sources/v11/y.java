package v11;

/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f432488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432490c;

    public y(int i17, int i18, int i19) {
        this.f432488a = i17;
        this.f432489b = i18;
        this.f432490c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.y)) {
            return false;
        }
        v11.y yVar = (v11.y) obj;
        return this.f432488a == yVar.f432488a && this.f432489b == yVar.f432489b && this.f432490c == yVar.f432490c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f432488a) * 31) + java.lang.Integer.hashCode(this.f432489b)) * 31) + java.lang.Integer.hashCode(this.f432490c);
    }

    public java.lang.String toString() {
        return "NativeMarkdownDividerConfig(heightPx=" + this.f432488a + ", color=" + this.f432489b + ", paddingVerticalPx=" + this.f432490c + ')';
    }
}
