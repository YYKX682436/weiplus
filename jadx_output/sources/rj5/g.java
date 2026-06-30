package rj5;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f396382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396383b;

    public g(int i17, int i18) {
        this.f396382a = i17;
        this.f396383b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj5.g)) {
            return false;
        }
        rj5.g gVar = (rj5.g) obj;
        return this.f396382a == gVar.f396382a && this.f396383b == gVar.f396383b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f396382a) * 31) + java.lang.Integer.hashCode(this.f396383b);
    }

    public java.lang.String toString() {
        return "ScrollTarget(position=" + this.f396382a + ", offset=" + this.f396383b + ')';
    }
}
