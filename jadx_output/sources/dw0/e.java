package dw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f244093a;

    /* renamed from: b, reason: collision with root package name */
    public final int f244094b;

    public e(int i17, int i18) {
        this.f244093a = i17;
        this.f244094b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0.e)) {
            return false;
        }
        dw0.e eVar = (dw0.e) obj;
        return this.f244093a == eVar.f244093a && this.f244094b == eVar.f244094b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f244093a) * 31) + java.lang.Integer.hashCode(this.f244094b);
    }

    public java.lang.String toString() {
        return "TimbreSelectedPack(preIndex=" + this.f244093a + ", selectedIndex=" + this.f244094b + ')';
    }
}
