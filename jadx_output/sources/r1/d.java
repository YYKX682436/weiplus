package r1;

/* loaded from: classes5.dex */
public final class d implements m1.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f368571a;

    /* renamed from: b, reason: collision with root package name */
    public final float f368572b;

    /* renamed from: c, reason: collision with root package name */
    public final long f368573c;

    public d(float f17, float f18, long j17) {
        this.f368571a = f17;
        this.f368572b = f18;
        this.f368573c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof r1.d)) {
            return false;
        }
        r1.d dVar = (r1.d) obj;
        if (dVar.f368571a == this.f368571a) {
            return ((dVar.f368572b > this.f368572b ? 1 : (dVar.f368572b == this.f368572b ? 0 : -1)) == 0) && dVar.f368573c == this.f368573c;
        }
        return false;
    }

    public int hashCode() {
        return ((((0 + java.lang.Float.hashCode(this.f368571a)) * 31) + java.lang.Float.hashCode(this.f368572b)) * 31) + java.lang.Long.hashCode(this.f368573c);
    }

    public java.lang.String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f368571a + ",horizontalScrollPixels=" + this.f368572b + ",uptimeMillis=" + this.f368573c + ')';
    }
}
