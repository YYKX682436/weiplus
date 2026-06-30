package e06;

/* loaded from: classes5.dex */
public final class e implements e06.f {

    /* renamed from: d, reason: collision with root package name */
    public final float f246207d;

    /* renamed from: e, reason: collision with root package name */
    public final float f246208e;

    public e(float f17, float f18) {
        this.f246207d = f17;
        this.f246208e = f18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.f
    public boolean d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).floatValue() <= ((java.lang.Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        float floatValue = ((java.lang.Number) comparable).floatValue();
        return floatValue >= this.f246207d && floatValue <= this.f246208e;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof e06.e)) {
            return false;
        }
        if (!isEmpty() || !((e06.e) obj).isEmpty()) {
            e06.e eVar = (e06.e) obj;
            if (!(this.f246207d == eVar.f246207d)) {
                return false;
            }
            if (!(this.f246208e == eVar.f246208e)) {
                return false;
            }
        }
        return true;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Float.valueOf(this.f246208e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Float.valueOf(this.f246207d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (java.lang.Float.hashCode(this.f246207d) * 31) + java.lang.Float.hashCode(this.f246208e);
    }

    @Override // e06.h
    public boolean isEmpty() {
        return this.f246207d > this.f246208e;
    }

    public java.lang.String toString() {
        return this.f246207d + ".." + this.f246208e;
    }
}
