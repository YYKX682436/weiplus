package ff1;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f261606a;

    /* renamed from: b, reason: collision with root package name */
    public oe1.m1 f261607b = oe1.m1.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    public int f261608c;

    /* renamed from: d, reason: collision with root package name */
    public int f261609d;

    /* renamed from: e, reason: collision with root package name */
    public int f261610e;

    /* renamed from: f, reason: collision with root package name */
    public int f261611f;

    /* renamed from: g, reason: collision with root package name */
    public int f261612g;

    /* renamed from: h, reason: collision with root package name */
    public int f261613h;

    public final void a(float f17, float f18) {
        if (!this.f261606a) {
            int i17 = this.f261608c;
            int i18 = this.f261609d;
            if (i17 < i18) {
                this.f261613h = (int) (i17 / f17);
                this.f261612g = i17;
                return;
            } else {
                this.f261612g = (int) (i18 * f17);
                this.f261613h = i18;
                return;
            }
        }
        if (java.lang.Math.abs(f17 - f18) > 0.05d) {
            int i19 = this.f261608c;
            int i27 = this.f261609d;
            if (i19 < i27) {
                this.f261613h = (int) (i19 / f17);
                this.f261612g = i19;
                return;
            } else {
                this.f261612g = (int) (i27 * f17);
                this.f261613h = i27;
                return;
            }
        }
        int i28 = this.f261608c;
        int i29 = this.f261609d;
        if (i28 > i29) {
            this.f261613h = (int) (i28 / f17);
            this.f261612g = i28;
        } else {
            this.f261612g = (int) (i29 * f17);
            this.f261613h = i29;
        }
    }
}
