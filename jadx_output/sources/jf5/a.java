package jf5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f299433a;

    /* renamed from: b, reason: collision with root package name */
    public final float f299434b;

    /* renamed from: c, reason: collision with root package name */
    public final float f299435c;

    public a(float f17, float f18, float f19, float f27) {
        this.f299433a = f17;
        this.f299434b = f18;
        this.f299435c = f19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.a)) {
            return false;
        }
        jf5.a aVar = (jf5.a) obj;
        return java.lang.Float.compare(this.f299433a, aVar.f299433a) == 0 && java.lang.Float.compare(this.f299434b, aVar.f299434b) == 0 && java.lang.Float.compare(this.f299435c, aVar.f299435c) == 0 && java.lang.Float.compare(1.6f, 1.6f) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f299433a) * 31) + java.lang.Float.hashCode(this.f299434b)) * 31) + java.lang.Float.hashCode(this.f299435c)) * 31) + java.lang.Float.hashCode(1.6f);
    }

    public java.lang.String toString() {
        return "AutoScrollConfig(edgeSizePx=" + this.f299433a + ", minStepPx=" + this.f299434b + ", maxStepPx=" + this.f299435c + ", rampExponent=1.6)";
    }
}
