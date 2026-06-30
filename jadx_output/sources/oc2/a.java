package oc2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f344147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344148b;

    public a(int i17, int i18) {
        this.f344147a = i17;
        this.f344148b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.a)) {
            return false;
        }
        oc2.a aVar = (oc2.a) obj;
        return this.f344147a == aVar.f344147a && this.f344148b == aVar.f344148b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f344147a) * 31) + java.lang.Integer.hashCode(this.f344148b);
    }

    public java.lang.String toString() {
        return "CapsuleMarginInfo(leftMargin=" + this.f344147a + ", rightMargin=" + this.f344148b + ')';
    }
}
