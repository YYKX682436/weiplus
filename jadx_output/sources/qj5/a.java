package qj5;

/* loaded from: classes15.dex */
public final class a implements gr5.n {

    /* renamed from: b, reason: collision with root package name */
    public final float f363966b;

    public a(float f17) {
        this.f363966b = f17;
    }

    @Override // gr5.n
    public long a(long j17, long j18) {
        float b17 = zq5.t.b(j17);
        float min = java.lang.Math.min(zq5.t.b(j18) / b17, zq5.t.a(j18) / java.lang.Math.min(zq5.t.a(j17), b17 / this.f363966b));
        return zq5.s.a(min, min);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj5.a) && java.lang.Float.compare(this.f363966b, ((qj5.a) obj).f363966b) == 0;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f363966b);
    }

    public java.lang.String toString() {
        return "ImageBottomSheetContentScaleCompat(minRatio=" + this.f363966b + ')';
    }
}
