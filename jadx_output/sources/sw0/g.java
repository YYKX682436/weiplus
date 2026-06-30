package sw0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f413434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f413435b;

    public g(int i17, int i18) {
        this.f413434a = i17;
        this.f413435b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.g)) {
            return false;
        }
        sw0.g gVar = (sw0.g) obj;
        return this.f413434a == gVar.f413434a && this.f413435b == gVar.f413435b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f413434a) * 31) + java.lang.Integer.hashCode(this.f413435b);
    }

    public java.lang.String toString() {
        return "TextStyleSelectedPack(preIndex=" + this.f413434a + ", selectedIndex=" + this.f413435b + ')';
    }
}
