package fg1;

/* loaded from: classes7.dex */
public class r0 implements dg.g {

    /* renamed from: a, reason: collision with root package name */
    public int f261881a;

    /* renamed from: b, reason: collision with root package name */
    public int f261882b;

    /* renamed from: c, reason: collision with root package name */
    public int f261883c;

    /* renamed from: d, reason: collision with root package name */
    public int f261884d;

    /* renamed from: e, reason: collision with root package name */
    public int f261885e;

    /* renamed from: f, reason: collision with root package name */
    public int f261886f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261887g;

    /* renamed from: h, reason: collision with root package name */
    public float f261888h;

    /* renamed from: i, reason: collision with root package name */
    public float f261889i;

    public boolean a(java.lang.String str, int i17, int i18, int i19, int i27) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, scale type is null");
            return false;
        }
        if (i17 == 0 || i18 == 0 || i19 == 0 || i27 == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, width or height is 0");
            return false;
        }
        if (str.equalsIgnoreCase(this.f261887g) && this.f261881a == i17 && this.f261882b == i18 && this.f261883c == i19 && this.f261884d == i27) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, same as last calculated");
            return true;
        }
        this.f261887g = str;
        this.f261881a = i17;
        this.f261882b = i18;
        this.f261883c = i19;
        this.f261884d = i27;
        float f17 = (i19 * 1.0f) / i27;
        float f18 = (i17 * 1.0f) / i18;
        if (str.equalsIgnoreCase("contain")) {
            int i28 = this.f261881a;
            int i29 = this.f261882b;
            if (i28 < i29) {
                int i37 = (int) (i28 / f17);
                this.f261886f = i37;
                this.f261885e = i28;
                if (i37 > i29) {
                    this.f261885e = (int) (i29 * f17);
                    this.f261886f = i29;
                }
            } else {
                int i38 = (int) (i29 * f17);
                this.f261885e = i38;
                this.f261886f = i29;
                if (i38 > i28) {
                    this.f261886f = (int) (i28 / f17);
                    this.f261885e = i28;
                }
            }
        } else if (this.f261887g.equalsIgnoreCase("fill")) {
            this.f261886f = this.f261882b;
            this.f261885e = this.f261881a;
        } else if (this.f261887g.equalsIgnoreCase("cover")) {
            int i39 = this.f261881a;
            int i47 = this.f261882b;
            if (i39 > i47) {
                int i48 = (int) (i39 / f17);
                this.f261886f = i48;
                this.f261885e = i39;
                if (i48 < i47) {
                    this.f261885e = (int) (i47 * f17);
                    this.f261886f = i47;
                }
            } else {
                int i49 = (int) (i47 * f17);
                this.f261885e = i49;
                this.f261886f = i47;
                if (i49 < i39) {
                    this.f261886f = (int) (i39 / f17);
                    this.f261885e = i39;
                }
            }
        } else if (java.lang.Math.abs(f17 - f18) > 0.05d) {
            int i57 = this.f261881a;
            int i58 = this.f261882b;
            if (i57 < i58) {
                this.f261886f = (int) (i57 / f17);
                this.f261885e = i57;
            } else {
                this.f261885e = (int) (i58 * f17);
                this.f261886f = i58;
            }
        } else {
            int i59 = this.f261881a;
            int i66 = this.f261882b;
            if (i59 > i66) {
                this.f261886f = (int) (i59 / f17);
                this.f261885e = i59;
            } else {
                this.f261885e = (int) (i66 * f17);
                this.f261886f = i66;
            }
        }
        this.f261888h = (this.f261885e * 1.0f) / this.f261881a;
        this.f261889i = (this.f261886f * 1.0f) / this.f261882b;
        return true;
    }
}
