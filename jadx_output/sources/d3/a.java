package d3;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f226073a;

    /* renamed from: b, reason: collision with root package name */
    public final float f226074b;

    /* renamed from: c, reason: collision with root package name */
    public final float f226075c;

    /* renamed from: d, reason: collision with root package name */
    public final float f226076d;

    /* renamed from: e, reason: collision with root package name */
    public final float f226077e;

    /* renamed from: f, reason: collision with root package name */
    public final float f226078f;

    public a(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39) {
        this.f226073a = f17;
        this.f226074b = f18;
        this.f226075c = f19;
        this.f226076d = f37;
        this.f226077e = f38;
        this.f226078f = f39;
    }

    public static d3.a a(int i17) {
        d3.s sVar = d3.s.f226111k;
        float b17 = d3.b.b(android.graphics.Color.red(i17));
        float b18 = d3.b.b(android.graphics.Color.green(i17));
        float b19 = d3.b.b(android.graphics.Color.blue(i17));
        float[][] fArr = d3.b.f226082d;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * b17) + (fArr2[1] * b18) + (fArr2[2] * b19);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * b17) + (fArr3[1] * b18) + (fArr3[2] * b19);
        float[] fArr4 = fArr[2];
        float f19 = (b17 * fArr4[0]) + (b18 * fArr4[1]) + (b19 * fArr4[2]);
        float[] fArr5 = {f17, f18, f19};
        float[][] fArr6 = d3.b.f226079a;
        float[] fArr7 = fArr6[0];
        float f27 = (fArr7[0] * f17) + (fArr7[1] * f18) + (fArr7[2] * f19);
        float[] fArr8 = fArr6[1];
        float f28 = (fArr8[0] * f17) + (fArr8[1] * f18) + (fArr8[2] * f19);
        float[] fArr9 = fArr6[2];
        float f29 = (f17 * fArr9[0]) + (f18 * fArr9[1]) + (f19 * fArr9[2]);
        float[] fArr10 = sVar.f226118g;
        float f37 = fArr10[0] * f27;
        float f38 = fArr10[1] * f28;
        float f39 = fArr10[2] * f29;
        float abs = java.lang.Math.abs(f37);
        float f47 = sVar.f226119h;
        float pow = (float) java.lang.Math.pow((abs * f47) / 100.0d, 0.42d);
        float pow2 = (float) java.lang.Math.pow((java.lang.Math.abs(f38) * f47) / 100.0d, 0.42d);
        float pow3 = (float) java.lang.Math.pow((f47 * java.lang.Math.abs(f39)) / 100.0d, 0.42d);
        float signum = ((java.lang.Math.signum(f37) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((java.lang.Math.signum(f38) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((java.lang.Math.signum(f39) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d17 = signum3;
        float f48 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d17)) / 11.0f;
        float f49 = ((float) ((signum + signum2) - (d17 * 2.0d))) / 9.0f;
        float f57 = signum2 * 20.0f;
        float f58 = (((signum * 20.0f) + f57) + (21.0f * signum3)) / 20.0f;
        float f59 = (((signum * 40.0f) + f57) + signum3) / 20.0f;
        float atan2 = (((float) java.lang.Math.atan2(f49, f48)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f66 = (3.1415927f * atan2) / 180.0f;
        float f67 = f59 * sVar.f226113b;
        float f68 = sVar.f226112a;
        double d18 = f67 / f68;
        float f69 = sVar.f226121j;
        float f76 = sVar.f226115d;
        float pow4 = ((float) java.lang.Math.pow(d18, f69 * f76)) * 100.0f;
        float sqrt = (4.0f / f76) * ((float) java.lang.Math.sqrt(pow4 / 100.0f)) * (f68 + 4.0f);
        float f77 = sVar.f226120i;
        float f78 = sqrt * f77;
        float sqrt2 = ((float) java.lang.Math.sqrt(pow4 / 100.0d)) * ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, sVar.f226117f), 0.73d)) * ((float) java.lang.Math.pow((((((((float) (java.lang.Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * sVar.f226116e) * sVar.f226114c) * ((float) java.lang.Math.sqrt((f48 * f48) + (f49 * f49)))) / (f58 + 0.305f), 0.9d));
        float f79 = f77 * sqrt2;
        float sqrt3 = ((float) java.lang.Math.sqrt((r1 * f76) / r8)) * 50.0f;
        float f86 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) java.lang.Math.log((0.0228f * f79) + 1.0f)) * 43.85965f;
        double d19 = f66;
        float cos = ((float) java.lang.Math.cos(d19)) * log;
        float sin = log * ((float) java.lang.Math.sin(d19));
        fArr5[0] = atan2;
        fArr5[1] = sqrt2;
        return new d3.a(fArr5[0], fArr5[1], pow4, f78, f79, sqrt3, f86, cos, sin);
    }

    public static d3.a b(float f17, float f18, float f19) {
        d3.s sVar = d3.s.f226111k;
        float sqrt = (4.0f / sVar.f226115d) * ((float) java.lang.Math.sqrt(f17 / 100.0d));
        float f27 = sVar.f226112a + 4.0f;
        float f28 = sVar.f226120i;
        float f29 = sqrt * f27 * f28;
        float f37 = f28 * f18;
        float sqrt2 = ((float) java.lang.Math.sqrt(((f18 / ((float) java.lang.Math.sqrt(r4))) * sVar.f226115d) / f27)) * 50.0f;
        float f38 = (1.7f * f17) / ((0.007f * f17) + 1.0f);
        float log = ((float) java.lang.Math.log((f37 * 0.0228d) + 1.0d)) * 43.85965f;
        double d17 = (3.1415927f * f19) / 180.0f;
        return new d3.a(f19, f18, f17, f29, f37, sqrt2, f38, log * ((float) java.lang.Math.cos(d17)), log * ((float) java.lang.Math.sin(d17)));
    }

    public int c(d3.s sVar) {
        double d17 = this.f226074b;
        float f17 = this.f226075c;
        float pow = (float) java.lang.Math.pow(((d17 == 0.0d || ((double) f17) == 0.0d) ? 0.0f : r2 / ((float) java.lang.Math.sqrt(f17 / 100.0d))) / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, sVar.f226117f), 0.73d), 1.1111111111111112d);
        double d18 = (this.f226073a * 3.1415927f) / 180.0f;
        float cos = ((float) (java.lang.Math.cos(2.0d + d18) + 3.8d)) * 0.25f;
        float pow2 = sVar.f226112a * ((float) java.lang.Math.pow(f17 / 100.0d, (1.0d / sVar.f226115d) / sVar.f226121j));
        float f18 = cos * 3846.1538f * sVar.f226116e * sVar.f226114c;
        float f19 = pow2 / sVar.f226113b;
        float sin = (float) java.lang.Math.sin(d18);
        float cos2 = (float) java.lang.Math.cos(d18);
        float f27 = (((0.305f + f19) * 23.0f) * pow) / (((f18 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f28 = cos2 * f27;
        float f29 = f27 * sin;
        float f37 = f19 * 460.0f;
        float f38 = (((451.0f * f28) + f37) + (288.0f * f29)) / 1403.0f;
        float f39 = ((f37 - (891.0f * f28)) - (261.0f * f29)) / 1403.0f;
        float f47 = ((f37 - (f28 * 220.0f)) - (f29 * 6300.0f)) / 1403.0f;
        float max = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f38) * 27.13d) / (400.0d - java.lang.Math.abs(f38)));
        float signum = java.lang.Math.signum(f38);
        float f48 = sVar.f226119h;
        float pow3 = signum * (100.0f / f48) * ((float) java.lang.Math.pow(max, 2.380952380952381d));
        float signum2 = java.lang.Math.signum(f39) * (100.0f / f48) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f39) * 27.13d) / (400.0d - java.lang.Math.abs(f39))), 2.380952380952381d));
        float signum3 = java.lang.Math.signum(f47) * (100.0f / f48) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f47) * 27.13d) / (400.0d - java.lang.Math.abs(f47))), 2.380952380952381d));
        float[] fArr = sVar.f226118g;
        float f49 = pow3 / fArr[0];
        float f57 = signum2 / fArr[1];
        float f58 = signum3 / fArr[2];
        float[][] fArr2 = d3.b.f226080b;
        float[] fArr3 = fArr2[0];
        float f59 = (fArr3[0] * f49) + (fArr3[1] * f57) + (fArr3[2] * f58);
        float[] fArr4 = fArr2[1];
        float f66 = (fArr4[0] * f49) + (fArr4[1] * f57) + (fArr4[2] * f58);
        float[] fArr5 = fArr2[2];
        return e3.b.b(f59, f66, (f49 * fArr5[0]) + (f57 * fArr5[1]) + (f58 * fArr5[2]));
    }
}
