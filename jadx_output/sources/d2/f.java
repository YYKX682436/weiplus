package d2;

/* loaded from: classes7.dex */
public final class f implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f225753d;

    /* renamed from: e, reason: collision with root package name */
    public final int f225754e;

    /* renamed from: f, reason: collision with root package name */
    public final int f225755f;

    /* renamed from: g, reason: collision with root package name */
    public int f225756g;

    /* renamed from: h, reason: collision with root package name */
    public int f225757h;

    /* renamed from: i, reason: collision with root package name */
    public int f225758i;

    /* renamed from: m, reason: collision with root package name */
    public int f225759m;

    /* renamed from: n, reason: collision with root package name */
    public int f225760n;

    /* renamed from: o, reason: collision with root package name */
    public int f225761o;

    public f(float f17, int i17, int i18, boolean z17, boolean z18, int i19) {
        this.f225753d = f17;
        this.f225754e = i18;
        this.f225755f = i19;
        boolean z19 = true;
        if (!(i19 >= 0 && i19 < 101) && i19 != -1) {
            z19 = false;
        }
        if (!z19) {
            throw new java.lang.IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z17 = i17 == 0;
        boolean z18 = i18 == this.f225754e;
        if (z17 && z18) {
            return;
        }
        if (z17) {
            int ceil = (int) java.lang.Math.ceil(this.f225753d);
            int i28 = ceil - (fontMetricsInt.descent - fontMetricsInt.ascent);
            int i29 = this.f225755f;
            if (i29 == -1) {
                i29 = (int) ((java.lang.Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent)) * 100.0f);
            }
            double ceil2 = i28 <= 0 ? java.lang.Math.ceil((i28 * i29) / 100.0f) : java.lang.Math.ceil((i28 * (100 - i29)) / 100.0f);
            int i37 = fontMetricsInt.descent;
            int i38 = ((int) ceil2) + i37;
            this.f225758i = i38;
            this.f225757h = i38 - ceil;
            int i39 = fontMetricsInt.ascent;
            this.f225756g = i39;
            this.f225759m = i37;
            this.f225760n = i39 - i39;
            this.f225761o = i37 - i37;
        }
        fontMetricsInt.ascent = z17 ? this.f225756g : this.f225757h;
        fontMetricsInt.descent = z18 ? this.f225759m : this.f225758i;
    }
}
