package i22;

/* loaded from: classes15.dex */
public final class z0 extends i22.w {

    /* renamed from: f, reason: collision with root package name */
    public final float f288070f;

    /* renamed from: g, reason: collision with root package name */
    public final float f288071g;

    /* renamed from: h, reason: collision with root package name */
    public final float f288072h;

    /* renamed from: i, reason: collision with root package name */
    public final int f288073i;

    public z0() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        this.f288070f = resources.getDimension(com.tencent.mm.R.dimen.f480386wh);
        this.f288071g = resources.getDimension(com.tencent.mm.R.dimen.f479704cz);
        this.f288072h = resources.getDimension(com.tencent.mm.R.dimen.f479738dv);
        this.f288060b = 4;
        this.f288073i = 4;
        d();
    }

    @Override // i22.w
    public float a() {
        return this.f288071g;
    }

    @Override // i22.w
    public float b() {
        return this.f288070f;
    }

    @Override // i22.w
    public float c() {
        return this.f288072h;
    }

    @Override // i22.w
    public void d() {
        int i17 = this.f288059a;
        float f17 = 2;
        float f18 = i17 - (this.f288071g * f17);
        float f19 = this.f288070f;
        if (f18 < f19 * f17) {
            this.f288060b = 1;
            return;
        }
        float f27 = this.f288072h;
        int i18 = (int) ((f18 + f27) / (f27 + f19));
        int i19 = this.f288073i;
        if (i18 > i19) {
            i18 = i19;
        }
        this.f288060b = i18;
        this.f288061c = (int) ((f18 - (i18 * f19)) / (i18 - 1));
        this.f288062d = (int) (((i17 - (f19 * i18)) - (r1 * i18)) / f17);
    }
}
