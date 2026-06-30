package z;

/* loaded from: classes13.dex */
public final class n0 implements z.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f468747a;

    /* renamed from: b, reason: collision with root package name */
    public final z.o1 f468748b;

    public n0(float f17, float f18, float f19) {
        this.f468747a = f19;
        z.o1 o1Var = new z.o1(1.0f);
        if (f17 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Damping ratio must be non-negative");
        }
        o1Var.f468774g = f17;
        o1Var.f468770c = false;
        double d17 = o1Var.f468769b;
        if (((float) (d17 * d17)) <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        o1Var.f468769b = java.lang.Math.sqrt(f18);
        o1Var.f468770c = false;
        this.f468748b = o1Var;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        return new z.z3(this);
    }

    @Override // z.l0
    public float b(long j17, float f17, float f18, float f19) {
        z.o1 o1Var = this.f468748b;
        o1Var.f468768a = f18;
        return java.lang.Float.intBitsToFloat((int) (o1Var.a(f17, f19, j17 / 1000000) & io.flutter.embedding.android.KeyboardMap.kValueMask));
    }

    @Override // z.l0
    public long c(float f17, float f18, float f19) {
        double d17;
        double d18;
        z.k1 k1Var;
        z.l1 l1Var;
        double d19;
        int i17;
        long j17;
        double d27;
        double d28;
        double log;
        double d29;
        z.o1 o1Var = this.f468748b;
        double d37 = o1Var.f468769b;
        float f27 = o1Var.f468774g;
        float f28 = this.f468747a;
        double d38 = (float) (d37 * d37);
        double d39 = f27;
        double d47 = f19 / f28;
        double d48 = (f17 - f18) / f28;
        double d49 = 1.0f;
        double sqrt = d39 * 2.0d * java.lang.Math.sqrt(d38);
        double d57 = -sqrt;
        double d58 = (sqrt * sqrt) - (d38 * 4.0d);
        z.z a17 = z.a0.a(d58);
        a17.f468880a = (a17.f468880a + d57) / 2.0d;
        a17.f468881b /= 2.0d;
        z.z a18 = z.a0.a(d58);
        double d59 = -1;
        double d66 = a18.f468880a * d59;
        double d67 = a18.f468881b * d59;
        a18.f468880a = (d66 + d57) / 2.0d;
        a18.f468881b = d67 / 2.0d;
        if (d48 == 0.0d) {
            if (d47 == 0.0d) {
                j17 = 0;
                return j17 * 1000000;
            }
        }
        if (d48 < 0.0d) {
            d47 = -d47;
        }
        double abs = java.lang.Math.abs(d48);
        double d68 = Double.MAX_VALUE;
        if (d39 > 1.0d) {
            double d69 = a17.f468880a;
            double d76 = a18.f468880a;
            double d77 = d69 - d76;
            double d78 = ((d69 * abs) - d47) / d77;
            double d79 = abs - d78;
            d19 = java.lang.Math.log(java.lang.Math.abs(d49 / d79)) / d69;
            double log2 = java.lang.Math.log(java.lang.Math.abs(d49 / d78)) / d76;
            if (!((java.lang.Double.isInfinite(d19) || java.lang.Double.isNaN(d19)) ? false : true)) {
                d19 = log2;
            } else if (!(!((java.lang.Double.isInfinite(log2) || java.lang.Double.isNaN(log2)) ? false : true))) {
                d19 = java.lang.Math.max(d19, log2);
            }
            double d86 = d79 * d69;
            double log3 = java.lang.Math.log(d86 / ((-d78) * d76)) / (d76 - d69);
            if (java.lang.Double.isNaN(log3) || log3 <= 0.0d) {
                d27 = -d49;
            } else {
                if (log3 > 0.0d) {
                    if ((-((java.lang.Math.exp(log3 * d76) * d78) + (java.lang.Math.exp(d69 * log3) * d79))) < d49) {
                        if (d78 <= 0.0d || d79 >= 0.0d) {
                            log = d19;
                            d29 = d49;
                        } else {
                            d29 = d49;
                            log = 0.0d;
                        }
                        d28 = -d29;
                        d19 = log;
                        d27 = d28;
                    }
                }
                d28 = d49;
                log = java.lang.Math.log((-((d78 * d76) * d76)) / (d86 * d69)) / d77;
                d19 = log;
                d27 = d28;
            }
            z.m1 m1Var = new z.m1(d79, d69, d78, d76, d27);
            z.n1 n1Var = new z.n1(d79, d69, d78, d76);
            if (java.lang.Math.abs(((java.lang.Number) m1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue()) >= 1.0E-4d) {
                int i18 = 0;
                while (d68 > 0.001d && i18 < 100) {
                    i18++;
                    double doubleValue = d19 - (((java.lang.Number) m1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue() / ((java.lang.Number) n1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue());
                    d68 = java.lang.Math.abs(d19 - doubleValue);
                    d19 = doubleValue;
                }
            }
        } else if (d39 < 1.0d) {
            double d87 = a17.f468880a;
            double d88 = (d47 - (d87 * abs)) / a17.f468881b;
            d19 = java.lang.Math.log(d49 / java.lang.Math.sqrt((abs * abs) + (d88 * d88))) / d87;
        } else {
            double d89 = a17.f468880a;
            double d96 = d89 * abs;
            double d97 = d47 - d96;
            double log4 = java.lang.Math.log(java.lang.Math.abs(d49 / abs)) / d89;
            double log5 = java.lang.Math.log(java.lang.Math.abs(d49 / d97));
            double d98 = log5;
            for (int i19 = 0; i19 < 6; i19++) {
                d98 = log5 - java.lang.Math.log(java.lang.Math.abs(d98 / d89));
            }
            double d99 = d98 / d89;
            if (!((java.lang.Double.isInfinite(log4) || java.lang.Double.isNaN(log4)) ? false : true)) {
                log4 = d99;
            } else if (!(!((java.lang.Double.isInfinite(d99) || java.lang.Double.isNaN(d99)) ? false : true))) {
                log4 = java.lang.Math.max(log4, d99);
            }
            double d100 = (-(d96 + d97)) / (d89 * d97);
            if (!java.lang.Double.isNaN(d100) && d100 > 0.0d) {
                if (d100 > 0.0d) {
                    double d101 = d89 * d100;
                    if ((-((d100 * d97 * java.lang.Math.exp(d101)) + (java.lang.Math.exp(d101) * abs))) < d49) {
                        if (d97 < 0.0d && abs > 0.0d) {
                            log4 = 0.0d;
                        }
                    }
                }
                d18 = (-(2.0d / d89)) - (abs / d97);
                d17 = d49;
                k1Var = new z.k1(abs, d97, d89, d17);
                l1Var = new z.l1(d97, d89, abs);
                d19 = d18;
                i17 = 0;
                while (d68 > 0.001d && i17 < 100) {
                    i17++;
                    double doubleValue2 = d19 - (((java.lang.Number) k1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue() / ((java.lang.Number) l1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue());
                    d68 = java.lang.Math.abs(d19 - doubleValue2);
                    d19 = doubleValue2;
                }
            }
            d17 = -d49;
            d18 = log4;
            k1Var = new z.k1(abs, d97, d89, d17);
            l1Var = new z.l1(d97, d89, abs);
            d19 = d18;
            i17 = 0;
            while (d68 > 0.001d) {
                i17++;
                double doubleValue22 = d19 - (((java.lang.Number) k1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue() / ((java.lang.Number) l1Var.invoke(java.lang.Double.valueOf(d19))).doubleValue());
                d68 = java.lang.Math.abs(d19 - doubleValue22);
                d19 = doubleValue22;
            }
        }
        j17 = (long) (d19 * 1000.0d);
        return j17 * 1000000;
    }

    @Override // z.l0
    public float d(float f17, float f18, float f19) {
        return 0.0f;
    }

    @Override // z.l0
    public float e(long j17, float f17, float f18, float f19) {
        z.o1 o1Var = this.f468748b;
        o1Var.f468768a = f18;
        return java.lang.Float.intBitsToFloat((int) (o1Var.a(f17, f19, j17 / 1000000) >> 32));
    }
}
