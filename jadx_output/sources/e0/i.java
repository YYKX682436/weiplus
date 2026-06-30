package e0;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f245595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f245596b;

    public i(int i17, int i18) {
        this.f245595a = i17;
        this.f245596b = i18;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i18 >= i17)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0.i)) {
            return false;
        }
        e0.i iVar = (e0.i) obj;
        return this.f245595a == iVar.f245595a && this.f245596b == iVar.f245596b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f245595a) * 31) + java.lang.Integer.hashCode(this.f245596b);
    }

    public java.lang.String toString() {
        return "Interval(start=" + this.f245595a + ", end=" + this.f245596b + ')';
    }
}
