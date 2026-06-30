package gl5;

/* loaded from: classes3.dex */
public final class k0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f273025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f273026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f273027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f273029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f273030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f273031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f273032i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273033j;

    public k0(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, gl5.d1 d1Var) {
        this.f273024a = i17;
        this.f273025b = f17;
        this.f273026c = i18;
        this.f273027d = i19;
        this.f273028e = i27;
        this.f273029f = i28;
        this.f273030g = i29;
        this.f273031h = f18;
        this.f273032i = f19;
        this.f273033j = d1Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int i17 = this.f273024a;
        float f17 = this.f273025b;
        float f18 = i17 + ((0 - i17) * f17);
        float f19 = this.f273026c + ((0 - r0) * f17);
        float width = this.f273027d + ((view.getWidth() - r0) * f17);
        float height = this.f273028e + ((view.getHeight() - r0) * f17);
        float f27 = this.f273029f + ((this.f273030g - r14) * f17);
        float f28 = this.f273032i;
        float f29 = this.f273031h;
        float f37 = f29 + ((f28 - f29) * f17);
        outline.setRoundRect((int) f18, (int) f19, (int) width, (int) height, f27);
        java.lang.Object value = ((jz5.n) this.f273033j.f272933j).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view2 = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f37));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
