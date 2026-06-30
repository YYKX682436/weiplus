package u3;

/* loaded from: classes13.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public double f424238a;

    /* renamed from: b, reason: collision with root package name */
    public double f424239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f424240c;

    /* renamed from: d, reason: collision with root package name */
    public double f424241d;

    /* renamed from: e, reason: collision with root package name */
    public double f424242e;

    /* renamed from: f, reason: collision with root package name */
    public double f424243f;

    /* renamed from: g, reason: collision with root package name */
    public double f424244g;

    /* renamed from: h, reason: collision with root package name */
    public double f424245h;

    /* renamed from: i, reason: collision with root package name */
    public double f424246i;

    /* renamed from: j, reason: collision with root package name */
    public final u3.o f424247j;

    public v() {
        this.f424238a = java.lang.Math.sqrt(1500.0d);
        this.f424239b = 0.5d;
        this.f424240c = false;
        this.f424246i = Double.MAX_VALUE;
        this.f424247j = new u3.o();
    }

    public u3.v a(float f17) {
        if (f17 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f424239b = f17;
        this.f424240c = false;
        return this;
    }

    public u3.v b(float f17) {
        if (f17 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f424238a = java.lang.Math.sqrt(f17);
        this.f424240c = false;
        return this;
    }

    public u3.o c(double d17, double d18, long j17) {
        double cos;
        double d19;
        if (!this.f424240c) {
            if (this.f424246i == Double.MAX_VALUE) {
                throw new java.lang.IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d27 = this.f424239b;
            if (d27 > 1.0d) {
                double d28 = this.f424238a;
                this.f424243f = ((-d27) * d28) + (d28 * java.lang.Math.sqrt((d27 * d27) - 1.0d));
                double d29 = this.f424239b;
                double d37 = this.f424238a;
                this.f424244g = ((-d29) * d37) - (d37 * java.lang.Math.sqrt((d29 * d29) - 1.0d));
            } else if (d27 >= 0.0d && d27 < 1.0d) {
                this.f424245h = this.f424238a * java.lang.Math.sqrt(1.0d - (d27 * d27));
            }
            this.f424240c = true;
        }
        double d38 = j17 / 1000.0d;
        double d39 = d17 - this.f424246i;
        double d47 = this.f424239b;
        if (d47 > 1.0d) {
            double d48 = this.f424244g;
            double d49 = this.f424243f;
            double d57 = d39 - (((d48 * d39) - d18) / (d48 - d49));
            double d58 = ((d39 * d48) - d18) / (d48 - d49);
            d19 = (java.lang.Math.pow(2.718281828459045d, d48 * d38) * d57) + (java.lang.Math.pow(2.718281828459045d, this.f424243f * d38) * d58);
            double d59 = this.f424244g;
            double pow = d57 * d59 * java.lang.Math.pow(2.718281828459045d, d59 * d38);
            double d66 = this.f424243f;
            cos = pow + (d58 * d66 * java.lang.Math.pow(2.718281828459045d, d66 * d38));
        } else if (d47 == 1.0d) {
            double d67 = this.f424238a;
            double d68 = d18 + (d67 * d39);
            double d69 = d39 + (d68 * d38);
            d19 = java.lang.Math.pow(2.718281828459045d, (-d67) * d38) * d69;
            double pow2 = d69 * java.lang.Math.pow(2.718281828459045d, (-this.f424238a) * d38);
            double d76 = this.f424238a;
            cos = (d68 * java.lang.Math.pow(2.718281828459045d, (-d76) * d38)) + (pow2 * (-d76));
        } else {
            double d77 = 1.0d / this.f424245h;
            double d78 = this.f424238a;
            double d79 = d77 * ((d47 * d78 * d39) + d18);
            double pow3 = java.lang.Math.pow(2.718281828459045d, (-d47) * d78 * d38) * ((java.lang.Math.cos(this.f424245h * d38) * d39) + (java.lang.Math.sin(this.f424245h * d38) * d79));
            double d86 = this.f424238a;
            double d87 = this.f424239b;
            double d88 = (-d86) * pow3 * d87;
            double pow4 = java.lang.Math.pow(2.718281828459045d, (-d87) * d86 * d38);
            double d89 = this.f424245h;
            double sin = (-d89) * d39 * java.lang.Math.sin(d89 * d38);
            double d96 = this.f424245h;
            cos = d88 + (pow4 * (sin + (d79 * d96 * java.lang.Math.cos(d96 * d38))));
            d19 = pow3;
        }
        float f17 = (float) (d19 + this.f424246i);
        u3.o oVar = this.f424247j;
        oVar.f424215a = f17;
        oVar.f424216b = (float) cos;
        return oVar;
    }

    public v(float f17) {
        this.f424238a = java.lang.Math.sqrt(1500.0d);
        this.f424239b = 0.5d;
        this.f424240c = false;
        this.f424247j = new u3.o();
        this.f424246i = f17;
    }
}
