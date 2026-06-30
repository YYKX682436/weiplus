package s7;

/* loaded from: classes16.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f403882a;

    /* renamed from: b, reason: collision with root package name */
    public final float f403883b;

    /* renamed from: c, reason: collision with root package name */
    public float f403884c;

    /* renamed from: d, reason: collision with root package name */
    public float f403885d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f403886e = false;

    public w2(s7.f3 f3Var, float f17, float f18, float f19, float f27) {
        this.f403884c = 0.0f;
        this.f403885d = 0.0f;
        this.f403882a = f17;
        this.f403883b = f18;
        double sqrt = java.lang.Math.sqrt((f19 * f19) + (f27 * f27));
        if (sqrt != 0.0d) {
            this.f403884c = (float) (f19 / sqrt);
            this.f403885d = (float) (f27 / sqrt);
        }
    }

    public void a(float f17, float f18) {
        float f19 = f17 - this.f403882a;
        float f27 = f18 - this.f403883b;
        double sqrt = java.lang.Math.sqrt((f19 * f19) + (f27 * f27));
        if (sqrt != 0.0d) {
            f19 = (float) (f19 / sqrt);
            f27 = (float) (f27 / sqrt);
        }
        float f28 = this.f403884c;
        if (f19 != (-f28) || f27 != (-this.f403885d)) {
            this.f403884c = f28 + f19;
            this.f403885d += f27;
        } else {
            this.f403886e = true;
            this.f403884c = -f27;
            this.f403885d = f19;
        }
    }

    public void b(s7.w2 w2Var) {
        float f17 = w2Var.f403884c;
        float f18 = this.f403884c;
        if (f17 == (-f18)) {
            float f19 = w2Var.f403885d;
            if (f19 == (-this.f403885d)) {
                this.f403886e = true;
                this.f403884c = -f19;
                this.f403885d = w2Var.f403884c;
                return;
            }
        }
        this.f403884c = f18 + f17;
        this.f403885d += w2Var.f403885d;
    }

    public java.lang.String toString() {
        return "(" + this.f403882a + "," + this.f403883b + " " + this.f403884c + "," + this.f403885d + ")";
    }
}
