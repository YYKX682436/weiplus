package ky;

/* loaded from: classes14.dex */
public final class x extends ky.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f313444a;

    /* renamed from: b, reason: collision with root package name */
    public final float f313445b;

    public x(float f17, float f18) {
        super(null);
        this.f313444a = f17;
        this.f313445b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky.x)) {
            return false;
        }
        ky.x xVar = (ky.x) obj;
        return java.lang.Float.compare(this.f313444a, xVar.f313444a) == 0 && java.lang.Float.compare(this.f313445b, xVar.f313445b) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f313444a) * 31) + java.lang.Float.hashCode(this.f313445b);
    }

    public java.lang.String toString() {
        return "DragCancel(offsetX=" + this.f313444a + ", offsetY=" + this.f313445b + ')';
    }
}
