package vv0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f440390a;

    /* renamed from: b, reason: collision with root package name */
    public final float f440391b;

    /* renamed from: c, reason: collision with root package name */
    public final float f440392c;

    /* renamed from: d, reason: collision with root package name */
    public final float f440393d;

    /* renamed from: e, reason: collision with root package name */
    public final float f440394e;

    /* renamed from: f, reason: collision with root package name */
    public final float f440395f;

    public l(float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f440390a = f17;
        this.f440391b = f18;
        this.f440392c = f19;
        this.f440393d = f27;
        this.f440394e = f28;
        this.f440395f = f29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.l)) {
            return false;
        }
        vv0.l lVar = (vv0.l) obj;
        return java.lang.Float.compare(this.f440390a, lVar.f440390a) == 0 && java.lang.Float.compare(this.f440391b, lVar.f440391b) == 0 && java.lang.Float.compare(this.f440392c, lVar.f440392c) == 0 && java.lang.Float.compare(this.f440393d, lVar.f440393d) == 0 && java.lang.Float.compare(this.f440394e, lVar.f440394e) == 0 && java.lang.Float.compare(this.f440395f, lVar.f440395f) == 0;
    }

    public int hashCode() {
        return (((((((((java.lang.Float.hashCode(this.f440390a) * 31) + java.lang.Float.hashCode(this.f440391b)) * 31) + java.lang.Float.hashCode(this.f440392c)) * 31) + java.lang.Float.hashCode(this.f440393d)) * 31) + java.lang.Float.hashCode(this.f440394e)) * 31) + java.lang.Float.hashCode(this.f440395f);
    }

    public java.lang.String toString() {
        return "MJSegmentColorInfo(brightness=" + this.f440390a + ", contrast=" + this.f440391b + ", saturation=" + this.f440392c + ", temperature=" + this.f440393d + ", vignette=" + this.f440394e + ", sharpness=" + this.f440395f + ')';
    }
}
