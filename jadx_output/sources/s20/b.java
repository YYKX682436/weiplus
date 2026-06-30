package s20;

/* loaded from: classes15.dex */
public final class b extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f402263d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f402264e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f402265f;

    /* renamed from: g, reason: collision with root package name */
    public final int f402266g;

    /* renamed from: h, reason: collision with root package name */
    public final int f402267h;

    /* renamed from: i, reason: collision with root package name */
    public final float f402268i;

    /* renamed from: m, reason: collision with root package name */
    public android.text.StaticLayout f402269m;

    /* renamed from: n, reason: collision with root package name */
    public int f402270n;

    /* renamed from: o, reason: collision with root package name */
    public float f402271o;

    public b(java.util.List beforeItems, java.lang.CharSequence middleItem, java.util.List afterItems, int i17, int i18, float f17) {
        kotlin.jvm.internal.o.g(beforeItems, "beforeItems");
        kotlin.jvm.internal.o.g(middleItem, "middleItem");
        kotlin.jvm.internal.o.g(afterItems, "afterItems");
        this.f402263d = beforeItems;
        this.f402264e = middleItem;
        this.f402265f = afterItems;
        this.f402266g = i17;
        this.f402267h = i18;
        this.f402268i = f17;
        this.f402271o = -1.0f;
    }

    public final android.text.StaticLayout a(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i17, int i18, float f17) {
        if (f17 <= 0.0f) {
            f17 = 1.0f;
        }
        android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i17).setAlignment(android.text.Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, f17).setIncludePad(false).setMaxLines(i18).build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        return build;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        if (this.f402269m == null) {
            getSize(paint, charSequence, i17, i18, null);
            if (this.f402269m == null) {
                return;
            }
        }
        canvas.save();
        canvas.translate(f17, i19);
        android.text.StaticLayout staticLayout = this.f402269m;
        kotlin.jvm.internal.o.d(staticLayout);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x022a, code lost:
    
        r0 = (java.lang.CharSequence[]) ((java.util.ArrayList) kz5.n0.t0(kz5.n0.u0(r12, r8), r14)).toArray(new java.lang.CharSequence[0]);
        r0 = android.text.TextUtils.concat((java.lang.CharSequence[]) java.util.Arrays.copyOf(r0, r0.length));
        kotlin.jvm.internal.o.f(r0, "concat(...)");
     */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSize(android.graphics.Paint r25, java.lang.CharSequence r26, int r27, int r28, android.graphics.Paint.FontMetricsInt r29) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s20.b.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }
}
