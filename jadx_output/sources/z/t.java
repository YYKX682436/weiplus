package z;

/* loaded from: classes13.dex */
public final class t extends z.w {

    /* renamed from: a, reason: collision with root package name */
    public float f468831a;

    public t(float f17) {
        super(null);
        this.f468831a = f17;
    }

    @Override // z.w
    public float a(int i17) {
        if (i17 == 0) {
            return this.f468831a;
        }
        return 0.0f;
    }

    @Override // z.w
    public int b() {
        return 1;
    }

    @Override // z.w
    public z.w c() {
        return new z.t(0.0f);
    }

    @Override // z.w
    public void d() {
        this.f468831a = 0.0f;
    }

    @Override // z.w
    public void e(int i17, float f17) {
        if (i17 == 0) {
            this.f468831a = f17;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z.t) {
            return (((z.t) obj).f468831a > this.f468831a ? 1 : (((z.t) obj).f468831a == this.f468831a ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f468831a);
    }

    public java.lang.String toString() {
        return "AnimationVector1D: value = " + this.f468831a;
    }
}
