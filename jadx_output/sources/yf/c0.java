package yf;

/* loaded from: classes14.dex */
public final class c0 implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f461319a;

    /* renamed from: b, reason: collision with root package name */
    public final yf.y f461320b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.a0 f461321c;

    /* renamed from: d, reason: collision with root package name */
    public final int f461322d;

    /* renamed from: e, reason: collision with root package name */
    public final yf.b0 f461323e;

    public c0(float f17, yf.y color, yf.a0 type, int i17, yf.b0 mouthShape) {
        kotlin.jvm.internal.o.g(color, "color");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(mouthShape, "mouthShape");
        this.f461319a = f17;
        this.f461320b = color;
        this.f461321c = type;
        this.f461322d = i17;
        this.f461323e = mouthShape;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "LipStickInfoV2()";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.c0)) {
            return false;
        }
        yf.c0 c0Var = (yf.c0) obj;
        return java.lang.Float.compare(this.f461319a, c0Var.f461319a) == 0 && kotlin.jvm.internal.o.b(this.f461320b, c0Var.f461320b) && this.f461321c == c0Var.f461321c && this.f461322d == c0Var.f461322d && this.f461323e == c0Var.f461323e;
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f461319a) * 31) + this.f461320b.hashCode()) * 31) + this.f461321c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f461322d)) * 31) + this.f461323e.hashCode();
    }

    public java.lang.String toString() {
        return "LipStickInfoV2(alpha=" + this.f461319a + ", color=" + this.f461320b + ", type=" + this.f461321c + ", faceModel=" + this.f461322d + ", mouthShape=" + this.f461323e + ')';
    }
}
