package e06;

/* loaded from: classes5.dex */
public final class d implements e06.f {

    /* renamed from: d, reason: collision with root package name */
    public final double f246205d;

    /* renamed from: e, reason: collision with root package name */
    public final double f246206e;

    public d(double d17, double d18) {
        this.f246205d = d17;
        this.f246206e = d18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.f
    public boolean d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).doubleValue() <= ((java.lang.Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        double doubleValue = ((java.lang.Number) comparable).doubleValue();
        return doubleValue >= this.f246205d && doubleValue <= this.f246206e;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof e06.d)) {
            return false;
        }
        if (!isEmpty() || !((e06.d) obj).isEmpty()) {
            e06.d dVar = (e06.d) obj;
            if (!(this.f246205d == dVar.f246205d)) {
                return false;
            }
            if (!(this.f246206e == dVar.f246206e)) {
                return false;
            }
        }
        return true;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Double.valueOf(this.f246206e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Double.valueOf(this.f246205d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (java.lang.Double.hashCode(this.f246205d) * 31) + java.lang.Double.hashCode(this.f246206e);
    }

    @Override // e06.h
    public boolean isEmpty() {
        return this.f246205d > this.f246206e;
    }

    public java.lang.String toString() {
        return this.f246205d + ".." + this.f246206e;
    }
}
