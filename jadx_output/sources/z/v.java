package z;

/* loaded from: classes14.dex */
public final class v extends z.w {

    /* renamed from: a, reason: collision with root package name */
    public float f468849a;

    /* renamed from: b, reason: collision with root package name */
    public float f468850b;

    /* renamed from: c, reason: collision with root package name */
    public float f468851c;

    /* renamed from: d, reason: collision with root package name */
    public float f468852d;

    public v(float f17, float f18, float f19, float f27) {
        super(null);
        this.f468849a = f17;
        this.f468850b = f18;
        this.f468851c = f19;
        this.f468852d = f27;
    }

    @Override // z.w
    public float a(int i17) {
        if (i17 == 0) {
            return this.f468849a;
        }
        if (i17 == 1) {
            return this.f468850b;
        }
        if (i17 == 2) {
            return this.f468851c;
        }
        if (i17 != 3) {
            return 0.0f;
        }
        return this.f468852d;
    }

    @Override // z.w
    public int b() {
        return 4;
    }

    @Override // z.w
    public z.w c() {
        return new z.v(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // z.w
    public void d() {
        this.f468849a = 0.0f;
        this.f468850b = 0.0f;
        this.f468851c = 0.0f;
        this.f468852d = 0.0f;
    }

    @Override // z.w
    public void e(int i17, float f17) {
        if (i17 == 0) {
            this.f468849a = f17;
            return;
        }
        if (i17 == 1) {
            this.f468850b = f17;
        } else if (i17 == 2) {
            this.f468851c = f17;
        } else {
            if (i17 != 3) {
                return;
            }
            this.f468852d = f17;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof z.v)) {
            return false;
        }
        z.v vVar = (z.v) obj;
        if (!(vVar.f468849a == this.f468849a)) {
            return false;
        }
        if (!(vVar.f468850b == this.f468850b)) {
            return false;
        }
        if (vVar.f468851c == this.f468851c) {
            return (vVar.f468852d > this.f468852d ? 1 : (vVar.f468852d == this.f468852d ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f468849a) * 31) + java.lang.Float.hashCode(this.f468850b)) * 31) + java.lang.Float.hashCode(this.f468851c)) * 31) + java.lang.Float.hashCode(this.f468852d);
    }

    public java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.f468849a + ", v2 = " + this.f468850b + ", v3 = " + this.f468851c + ", v4 = " + this.f468852d;
    }
}
