package rh;

/* loaded from: classes12.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c3 f395304d;

    public a3(rh.c3 c3Var) {
        this.f395304d = c3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.c3 c3Var = this.f395304d;
        try {
            try {
                java.lang.Number number = (java.lang.Number) c3Var.f395342c.apply(c3Var);
                if (!number.equals(rh.c3.f395339o)) {
                    c3Var.f395350k = number.doubleValue();
                    int i17 = c3Var.f395346g + 1;
                    c3Var.f395346g = i17;
                    double d17 = c3Var.f395353n * (i17 - 1);
                    double d18 = c3Var.f395350k;
                    c3Var.f395353n = (d17 + d18) / i17;
                    if (c3Var.f395349j == Double.MIN_VALUE) {
                        c3Var.f395349j = d18;
                        c3Var.f395351l = d18;
                        c3Var.f395352m = d18;
                    } else {
                        if (d18 > c3Var.f395351l) {
                            c3Var.f395351l = d18;
                        }
                        if (d18 < c3Var.f395352m) {
                            c3Var.f395352m = d18;
                        }
                    }
                }
                if (c3Var.f395344e) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                oj.j.d("Matrix.battery.Sampler", e17, "onSamplingFailed: " + e17, new java.lang.Object[0]);
                if (c3Var.f395344e) {
                    return;
                }
            }
            c3Var.f395341b.postDelayed(this, c3Var.f395345f);
        } catch (java.lang.Throwable th6) {
            if (!c3Var.f395344e) {
                c3Var.f395341b.postDelayed(this, c3Var.f395345f);
            }
            throw th6;
        }
    }
}
