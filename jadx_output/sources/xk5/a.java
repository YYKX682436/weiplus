package xk5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f455065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455066b;

    public a(int i17, int i18) {
        this.f455065a = i17;
        this.f455066b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk5.a)) {
            return false;
        }
        xk5.a aVar = (xk5.a) obj;
        return this.f455065a == aVar.f455065a && this.f455066b == aVar.f455066b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f455065a) * 31) + java.lang.Integer.hashCode(this.f455066b);
    }

    public java.lang.String toString() {
        return "ViewRootImplWindowInfo(privateFlags=" + this.f455065a + ", insetsFlagAppearance=" + this.f455066b + ')';
    }
}
