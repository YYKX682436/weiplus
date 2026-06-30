package gl5;

/* loaded from: classes3.dex */
public final class h0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f273003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f273004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f273005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f273007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f273008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f273009h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f273010i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273011j;

    public h0(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, gl5.d1 d1Var) {
        this.f273002a = i17;
        this.f273003b = f17;
        this.f273004c = i18;
        this.f273005d = i19;
        this.f273006e = i27;
        this.f273007f = i28;
        this.f273008g = i29;
        this.f273009h = f18;
        this.f273010i = f19;
        this.f273011j = d1Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        float f17 = 0;
        float f18 = this.f273002a - 0;
        float f19 = this.f273003b;
        float f27 = width + ((this.f273005d - width) * f19);
        float f28 = height + ((this.f273006e - height) * f19);
        float f29 = this.f273007f + ((this.f273008g - r2) * f19);
        float f37 = this.f273010i;
        float f38 = this.f273009h;
        float f39 = f38 + ((f37 - f38) * f19);
        outline.setRoundRect((int) ((f18 * f19) + f17), (int) (f17 + ((this.f273004c - 0) * f19)), (int) f27, (int) f28, f29);
        java.lang.Object value = ((jz5.n) this.f273011j.f272933j).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view2 = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f39));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
