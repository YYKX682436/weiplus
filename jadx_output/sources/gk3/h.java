package gk3;

/* loaded from: classes8.dex */
public final class h implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f272505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f272506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f272507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272510g;

    public h(int i17, int i18, float f17, android.graphics.Rect rect, gk3.m mVar, int i19, int i27) {
        this.f272504a = i17;
        this.f272505b = i18;
        this.f272506c = f17;
        this.f272507d = rect;
        this.f272508e = mVar;
        this.f272509f = i19;
        this.f272510g = i27;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18 = this.f272504a;
        int i17 = this.f272505b;
        float f19 = this.f272506c;
        float height = (((i17 * f19) - this.f272507d.height()) / 2) * f17 * (1 / f19);
        float f27 = i17 - height;
        gk3.m mVar = this.f272508e;
        ek3.e eVar = mVar.f272528d;
        if (eVar != null) {
            eVar.setMaskAlpha((int) (255 * f17));
        }
        ek3.e eVar2 = mVar.f272528d;
        if (eVar2 != null) {
            eVar2.a(0.0f, height, f18, f27);
        }
        int i18 = ek3.e.f253609u;
        float f28 = (ek3.e.f253609u * f17) / f19;
        ek3.e eVar3 = mVar.f272528d;
        if (eVar3 != null) {
            eVar3.b(f28, f28, f28, f28, f28, f28, f28, f28);
        }
        ek3.e eVar4 = mVar.f272528d;
        if (eVar4 != null) {
            eVar4.setPivotX(this.f272509f);
        }
        ek3.e eVar5 = mVar.f272528d;
        if (eVar5 != null) {
            eVar5.setPivotY(this.f272510g);
        }
        ek3.e eVar6 = mVar.f272528d;
        if (eVar6 != null) {
            eVar6.postInvalidate();
        }
    }
}
