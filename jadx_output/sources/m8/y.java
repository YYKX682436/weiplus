package m8;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final m8.y f324678d = new m8.y(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f324679a;

    /* renamed from: b, reason: collision with root package name */
    public final float f324680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f324681c;

    public y(float f17, float f18) {
        this.f324679a = f17;
        this.f324680b = f18;
        this.f324681c = java.lang.Math.round(f17 * 1000.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m8.y.class != obj.getClass()) {
            return false;
        }
        m8.y yVar = (m8.y) obj;
        return this.f324679a == yVar.f324679a && this.f324680b == yVar.f324680b;
    }

    public int hashCode() {
        return ((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + java.lang.Float.floatToRawIntBits(this.f324679a)) * 31) + java.lang.Float.floatToRawIntBits(this.f324680b);
    }
}
