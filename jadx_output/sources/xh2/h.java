package xh2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f454549a;

    /* renamed from: b, reason: collision with root package name */
    public final float f454550b;

    /* renamed from: c, reason: collision with root package name */
    public final float f454551c;

    /* renamed from: d, reason: collision with root package name */
    public final float f454552d;

    public h(float f17, float f18, float f19, float f27) {
        this.f454549a = f17;
        this.f454550b = f18;
        this.f454551c = f19;
        this.f454552d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.h)) {
            return false;
        }
        xh2.h hVar = (xh2.h) obj;
        return java.lang.Float.compare(this.f454549a, hVar.f454549a) == 0 && java.lang.Float.compare(this.f454550b, hVar.f454550b) == 0 && java.lang.Float.compare(this.f454551c, hVar.f454551c) == 0 && java.lang.Float.compare(this.f454552d, hVar.f454552d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f454549a) * 31) + java.lang.Float.hashCode(this.f454550b)) * 31) + java.lang.Float.hashCode(this.f454551c)) * 31) + java.lang.Float.hashCode(this.f454552d);
    }

    public java.lang.String toString() {
        return "MicHoleInfo(xRatio=" + this.f454549a + ", yRatio=" + this.f454550b + ", wRatio=" + this.f454551c + ", hRatio=" + this.f454552d + ')';
    }
}
