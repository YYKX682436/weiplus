package gk3;

/* loaded from: classes8.dex */
public final class a implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f272482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f272483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f272484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f272485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f272486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek3.e f272487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f272489h;

    public a(float f17, int i17, int i18, float f18, android.graphics.Rect rect, ek3.e eVar, int i19, int i27) {
        this.f272482a = f17;
        this.f272483b = i17;
        this.f272484c = i18;
        this.f272485d = f18;
        this.f272486e = rect;
        this.f272487f = eVar;
        this.f272488g = i19;
        this.f272489h = i27;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18 = 1;
        float f19 = this.f272482a;
        float f27 = f19 + ((f18 - f19) * f17);
        float f28 = this.f272483b;
        int i17 = this.f272484c;
        float f29 = this.f272485d;
        float height = (((i17 * f29) - this.f272486e.height()) / 2) * f27 * (f18 / f29);
        float f37 = i17 - height;
        float f38 = this.f272488g;
        ek3.e eVar = this.f272487f;
        eVar.setPivotX(f38);
        eVar.setPivotY(this.f272489h);
        eVar.setMaskAlpha((int) (255 * f27));
        eVar.a(0.0f, height, f28, f37);
        int i18 = ek3.e.f253609u;
        float f39 = (ek3.e.f253609u * f27) / f29;
        this.f272487f.b(f39, f39, f39, f39, f39, f39, f39, f39);
        eVar.postInvalidate();
    }
}
