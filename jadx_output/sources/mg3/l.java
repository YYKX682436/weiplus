package mg3;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f326243a;

    /* renamed from: b, reason: collision with root package name */
    public final float f326244b;

    /* renamed from: c, reason: collision with root package name */
    public final float f326245c;

    /* renamed from: d, reason: collision with root package name */
    public final float f326246d;

    public l(float f17, float f18, float f19, float f27, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 1) != 0 ? 1.0f : f17;
        f18 = (i17 & 2) != 0 ? 1.0f : f18;
        f19 = (i17 & 4) != 0 ? 5.0f : f19;
        f27 = (i17 & 8) != 0 ? 2.0f : f27;
        this.f326243a = f17;
        this.f326244b = f18;
        this.f326245c = f19;
        this.f326246d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3.l)) {
            return false;
        }
        mg3.l lVar = (mg3.l) obj;
        return java.lang.Float.compare(this.f326243a, lVar.f326243a) == 0 && java.lang.Float.compare(this.f326244b, lVar.f326244b) == 0 && java.lang.Float.compare(this.f326245c, lVar.f326245c) == 0 && java.lang.Float.compare(this.f326246d, lVar.f326246d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f326243a) * 31) + java.lang.Float.hashCode(this.f326244b)) * 31) + java.lang.Float.hashCode(this.f326245c)) * 31) + java.lang.Float.hashCode(this.f326246d);
    }

    public java.lang.String toString() {
        return "PreviewScaleConfig(extraScaleFactor=" + this.f326243a + ", minScaleRate=" + this.f326244b + ", maxScaleRate=" + this.f326245c + ", doubleTapScaleRate=" + this.f326246d + ')';
    }
}
