package fk3;

/* loaded from: classes8.dex */
public final class a implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f263532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f263533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f263534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f263536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f263537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f263538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ek3.e f263539h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f263540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f263541j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f263542k;

    public a(float f17, boolean z17, int i17, int i18, float f18, android.graphics.Rect rect, float f19, ek3.e eVar, int i19, int i27, int i28) {
        this.f263532a = f17;
        this.f263533b = z17;
        this.f263534c = i17;
        this.f263535d = i18;
        this.f263536e = f18;
        this.f263537f = rect;
        this.f263538g = f19;
        this.f263539h = eVar;
        this.f263540i = i19;
        this.f263541j = i27;
        this.f263542k = i28;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18;
        float f19;
        float f27;
        float f28 = 1;
        float f29 = this.f263532a;
        float f37 = f29 + ((f28 - f29) * f17);
        boolean z17 = this.f263533b;
        android.graphics.Rect rect = this.f263537f;
        float f38 = 0.0f;
        int i17 = this.f263534c;
        int i18 = this.f263535d;
        float f39 = this.f263536e;
        if (z17) {
            float f47 = i18;
            float height = (((i17 * f39) - rect.height()) / 2) * f37 * (f28 / this.f263538g);
            float f48 = i17 - height;
            f18 = 0.0f;
            f38 = height;
            f19 = f48;
            f27 = f47;
        } else {
            f19 = i17;
            f18 = (((i18 * f39) - rect.height()) / 2) * f37 * (f28 / f39);
            f27 = i18 - f18;
        }
        float f49 = this.f263540i;
        ek3.e eVar = this.f263539h;
        eVar.setPivotX(f49);
        eVar.setPivotY(this.f263541j);
        eVar.setMaskAlpha((int) (255 * f37));
        eVar.a(f38, f18, f19, f27);
        int i19 = ek3.e.f253609u;
        float f57 = (ek3.e.f253609u * f37) / f39;
        this.f263539h.b(f57, f57, f57, f57, f57, f57, f57, f57);
        eVar.setRotate(this.f263542k * f17);
        eVar.postInvalidate();
    }
}
