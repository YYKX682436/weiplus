package z;

/* loaded from: classes14.dex */
public final class u extends z.w {

    /* renamed from: a, reason: collision with root package name */
    public float f468842a;

    /* renamed from: b, reason: collision with root package name */
    public float f468843b;

    public u(float f17, float f18) {
        super(null);
        this.f468842a = f17;
        this.f468843b = f18;
    }

    @Override // z.w
    public float a(int i17) {
        if (i17 == 0) {
            return this.f468842a;
        }
        if (i17 != 1) {
            return 0.0f;
        }
        return this.f468843b;
    }

    @Override // z.w
    public int b() {
        return 2;
    }

    @Override // z.w
    public z.w c() {
        return new z.u(0.0f, 0.0f);
    }

    @Override // z.w
    public void d() {
        this.f468842a = 0.0f;
        this.f468843b = 0.0f;
    }

    @Override // z.w
    public void e(int i17, float f17) {
        if (i17 == 0) {
            this.f468842a = f17;
        } else {
            if (i17 != 1) {
                return;
            }
            this.f468843b = f17;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof z.u)) {
            return false;
        }
        z.u uVar = (z.u) obj;
        if (uVar.f468842a == this.f468842a) {
            return (uVar.f468843b > this.f468843b ? 1 : (uVar.f468843b == this.f468843b ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f468842a) * 31) + java.lang.Float.hashCode(this.f468843b);
    }

    public java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.f468842a + ", v2 = " + this.f468843b;
    }
}
