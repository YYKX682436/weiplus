package s7;

/* loaded from: classes16.dex */
public class t0 implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final float f403834d;

    /* renamed from: e, reason: collision with root package name */
    public final s7.q2 f403835e;

    public t0(float f17, s7.q2 q2Var) {
        this.f403834d = f17;
        this.f403835e = q2Var;
    }

    public float a(float f17) {
        float f18;
        float f19;
        int ordinal = this.f403835e.ordinal();
        float f27 = this.f403834d;
        if (ordinal == 0) {
            return f27;
        }
        if (ordinal == 3) {
            return f27 * f17;
        }
        if (ordinal == 4) {
            f18 = f27 * f17;
            f19 = 2.54f;
        } else if (ordinal == 5) {
            f18 = f27 * f17;
            f19 = 25.4f;
        } else if (ordinal == 6) {
            f18 = f27 * f17;
            f19 = 72.0f;
        } else {
            if (ordinal != 7) {
                return f27;
            }
            f18 = f27 * f17;
            f19 = 6.0f;
        }
        return f18 / f19;
    }

    public float b(s7.f3 f3Var) {
        if (this.f403835e != s7.q2.percent) {
            return d(f3Var);
        }
        s7.b3 b3Var = f3Var.f403657d;
        s7.f0 f0Var = b3Var.f403600g;
        if (f0Var == null) {
            f0Var = b3Var.f403599f;
        }
        float f17 = this.f403834d;
        if (f0Var == null) {
            return f17;
        }
        float f18 = f0Var.f403645c;
        return (f18 == f0Var.f403646d ? f17 * f18 : f17 * ((float) (java.lang.Math.sqrt((f18 * f18) + (r0 * r0)) / 1.414213562373095d))) / 100.0f;
    }

    public float c(s7.f3 f3Var, float f17) {
        return this.f403835e == s7.q2.percent ? (this.f403834d * f17) / 100.0f : d(f3Var);
    }

    public float d(s7.f3 f3Var) {
        int ordinal = this.f403835e.ordinal();
        float f17 = this.f403834d;
        switch (ordinal) {
            case 0:
                return f17;
            case 1:
                return f17 * f3Var.f403657d.f403597d.getTextSize();
            case 2:
                return f17 * (f3Var.f403657d.f403597d.getTextSize() / 2.0f);
            case 3:
                return f17 * f3Var.f403655b;
            case 4:
                return (f17 * f3Var.f403655b) / 2.54f;
            case 5:
                return (f17 * f3Var.f403655b) / 25.4f;
            case 6:
                return (f17 * f3Var.f403655b) / 72.0f;
            case 7:
                return (f17 * f3Var.f403655b) / 6.0f;
            case 8:
                s7.b3 b3Var = f3Var.f403657d;
                s7.f0 f0Var = b3Var.f403600g;
                if (f0Var == null) {
                    f0Var = b3Var.f403599f;
                }
                return f0Var == null ? f17 : (f17 * f0Var.f403645c) / 100.0f;
            default:
                return f17;
        }
    }

    public float e(s7.f3 f3Var) {
        if (this.f403835e != s7.q2.percent) {
            return d(f3Var);
        }
        s7.b3 b3Var = f3Var.f403657d;
        s7.f0 f0Var = b3Var.f403600g;
        if (f0Var == null) {
            f0Var = b3Var.f403599f;
        }
        float f17 = this.f403834d;
        return f0Var == null ? f17 : (f17 * f0Var.f403646d) / 100.0f;
    }

    public boolean f() {
        return this.f403834d < 0.0f;
    }

    public boolean g() {
        return this.f403834d == 0.0f;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.f403834d) + this.f403835e;
    }

    public t0(float f17) {
        this.f403834d = f17;
        this.f403835e = s7.q2.px;
    }
}
