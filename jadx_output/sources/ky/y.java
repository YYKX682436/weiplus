package ky;

/* loaded from: classes14.dex */
public final class y extends ky.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f313446a;

    /* renamed from: b, reason: collision with root package name */
    public final float f313447b;

    public y(float f17, float f18) {
        super(null);
        this.f313446a = f17;
        this.f313447b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky.y)) {
            return false;
        }
        ky.y yVar = (ky.y) obj;
        return java.lang.Float.compare(this.f313446a, yVar.f313446a) == 0 && java.lang.Float.compare(this.f313447b, yVar.f313447b) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f313446a) * 31) + java.lang.Float.hashCode(this.f313447b);
    }

    public java.lang.String toString() {
        return "Dragging(offsetX=" + this.f313446a + ", offsetY=" + this.f313447b + ')';
    }
}
