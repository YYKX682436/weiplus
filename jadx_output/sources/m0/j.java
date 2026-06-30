package m0;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f322475a;

    /* renamed from: b, reason: collision with root package name */
    public final float f322476b;

    /* renamed from: c, reason: collision with root package name */
    public final float f322477c;

    /* renamed from: d, reason: collision with root package name */
    public final float f322478d;

    public j(float f17, float f18, float f19, float f27) {
        this.f322475a = f17;
        this.f322476b = f18;
        this.f322477c = f19;
        this.f322478d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0.j)) {
            return false;
        }
        m0.j jVar = (m0.j) obj;
        if (!(this.f322475a == jVar.f322475a)) {
            return false;
        }
        if (!(this.f322476b == jVar.f322476b)) {
            return false;
        }
        if (this.f322477c == jVar.f322477c) {
            return (this.f322478d > jVar.f322478d ? 1 : (this.f322478d == jVar.f322478d ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f322475a) * 31) + java.lang.Float.hashCode(this.f322476b)) * 31) + java.lang.Float.hashCode(this.f322477c)) * 31) + java.lang.Float.hashCode(this.f322478d);
    }

    public java.lang.String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f322475a + ", focusedAlpha=" + this.f322476b + ", hoveredAlpha=" + this.f322477c + ", pressedAlpha=" + this.f322478d + ')';
    }
}
