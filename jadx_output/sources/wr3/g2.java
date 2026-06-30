package wr3;

/* loaded from: classes3.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f448810a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f448811b;

    public g2(float f17, boolean z17, boolean z18) {
        this.f448810a = f17;
        this.f448811b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.g2)) {
            return false;
        }
        wr3.g2 g2Var = (wr3.g2) obj;
        return java.lang.Float.compare(this.f448810a, g2Var.f448810a) == 0 && this.f448811b == g2Var.f448811b;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f448810a) * 31) + java.lang.Boolean.hashCode(true)) * 31) + java.lang.Boolean.hashCode(this.f448811b);
    }

    public java.lang.String toString() {
        return "ImageRadiusInfo(radius=" + this.f448810a + ", topRound=true, bottomRound=" + this.f448811b + ')';
    }
}
