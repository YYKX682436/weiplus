package wp;

/* loaded from: classes16.dex */
public abstract class f extends wp.a {
    public float D;
    public float E;
    public float[] F;
    public float G;

    public f(xp.d dVar) {
        super(dVar);
        this.D = 0.0f;
        this.E = -1.0f;
        this.F = null;
    }

    @Override // wp.a
    public void c() {
        w(new zp.h(xp.d.f().f455844a));
        if (n()) {
            this.G = ((int) (h() + this.f448338i)) / ((float) this.f448334e.f474913a);
        }
    }

    @Override // wp.a
    public float[] d(long j17) {
        if (!n()) {
            return null;
        }
        float y17 = y(j17);
        if (this.F == null) {
            this.F = new float[4];
        }
        this.F[0] = y17 - xp.d.f().f455849f;
        float[] fArr = this.F;
        float f17 = this.E;
        fArr[1] = f17;
        fArr[2] = y17 + this.f448338i + this.f448340k;
        fArr[3] = f17 + this.f448339j;
        return fArr;
    }

    @Override // wp.a
    public float[] g(long j17) {
        if (!n()) {
            return null;
        }
        float z17 = z(j17);
        if (this.F == null) {
            this.F = new float[4];
        }
        this.F[0] = z17 - xp.d.f().f455849f;
        float[] fArr = this.F;
        float f17 = this.E;
        fArr[1] = f17;
        fArr[2] = z17 + this.f448338i + this.f448340k;
        fArr[3] = f17 + this.f448339j;
        return fArr;
    }

    @Override // wp.a
    public float i() {
        return this.E;
    }

    @Override // wp.a
    public void s(float f17, float f18, long j17, long j18) {
        if (p(j17)) {
            x(false);
            return;
        }
        toString();
        this.D = y(j18);
        if (o()) {
            return;
        }
        this.E = f18;
        x(true);
    }

    public float y(long j17) {
        return h() - (((float) (j17 - this.f448333d)) * this.G);
    }

    public float z(long j17) {
        xp.i f17 = xp.d.f();
        return h() - (((float) (j17 - this.B)) * (((int) (h() + this.f448338i)) / (((float) this.f448334e.f474913a) * f17.f455860q)));
    }
}
