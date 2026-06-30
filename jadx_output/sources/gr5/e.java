package gr5;

/* loaded from: classes11.dex */
public final class e implements gr5.b {

    /* renamed from: b, reason: collision with root package name */
    public final float f274915b;

    /* renamed from: c, reason: collision with root package name */
    public final float f274916c;

    public e(float f17, float f18) {
        this.f274915b = f17;
        this.f274916c = f18;
    }

    public long a(long j17, long j18, boolean z17) {
        float f17 = (((int) (j18 >> 32)) - ((int) (j17 >> 32))) / 2.0f;
        float b17 = (zq5.g.b(j18) - zq5.g.b(j17)) / 2.0f;
        float f18 = this.f274915b;
        if (!z17) {
            f18 *= -1;
        }
        float f19 = 1;
        return zq5.d.a(a06.d.b(f17 * (f18 + f19)), a06.d.b(b17 * (f19 + this.f274916c)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.e)) {
            return false;
        }
        gr5.e eVar = (gr5.e) obj;
        return java.lang.Float.compare(this.f274915b, eVar.f274915b) == 0 && java.lang.Float.compare(this.f274916c, eVar.f274916c) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f274915b) * 31) + java.lang.Float.hashCode(this.f274916c);
    }

    public java.lang.String toString() {
        return "BiasAlignmentCompat(horizontalBias=" + this.f274915b + ", verticalBias=" + this.f274916c + ')';
    }
}
