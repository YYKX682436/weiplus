package sp4;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp4.b f411310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f411312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f411313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f411314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f411315i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f411316m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f411317n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f411318o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f411319p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sp4.b bVar, android.view.View view, float f17, kotlin.jvm.internal.e0 e0Var, float f18, float f19, int i17, float f27, float f28, float f29) {
        super(1);
        this.f411310d = bVar;
        this.f411311e = view;
        this.f411312f = f17;
        this.f411313g = e0Var;
        this.f411314h = f18;
        this.f411315i = f19;
        this.f411316m = i17;
        this.f411317n = f27;
        this.f411318o = f28;
        this.f411319p = f29;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f411310d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewTransformCalculateHandler", "onDrawerTranslation closePercent:" + floatValue);
        float f17 = (!java.lang.Float.isNaN(floatValue) && floatValue <= 1.0f) ? floatValue < 0.0f ? 0.0f : floatValue : 1.0f;
        float f18 = this.f411313g.f310115d;
        float f19 = this.f411316m;
        float f27 = this.f411314h;
        float f28 = f27 > 1.0f ? ((f27 - 1.0f) * f17) + 1.0f : f27 < 1.0f ? 1.0f - ((1.0f - f27) * f17) : 1.0f;
        float f29 = this.f411315i;
        float f37 = f29 > 1.0f ? ((f29 - 1.0f) * f17) + 1.0f : f29 < 1.0f ? 1.0f - ((1.0f - f29) * f17) : 1.0f;
        float f38 = this.f411318o + (f19 * f17);
        float f39 = this.f411319p + (f17 * this.f411317n);
        android.view.View view = this.f411311e;
        view.setPivotX(this.f411312f);
        view.setPivotY(f18);
        view.setScaleX(f28);
        view.setScaleY(f37);
        view.setTranslationX(f38);
        view.setTranslationY(f39);
        if (floatValue == 0.0f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreviewTransformCalculateHandler", "onDrawerTranslation end");
        } else {
            if (floatValue == 1.0f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PreviewTransformCalculateHandler", "onDrawerTranslation start");
            }
        }
        return jz5.f0.f302826a;
    }
}
