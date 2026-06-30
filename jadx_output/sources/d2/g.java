package d2;

/* loaded from: classes5.dex */
public final class g extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f225762d;

    /* renamed from: e, reason: collision with root package name */
    public final int f225763e;

    /* renamed from: f, reason: collision with root package name */
    public final float f225764f;

    /* renamed from: g, reason: collision with root package name */
    public final int f225765g;

    /* renamed from: h, reason: collision with root package name */
    public final float f225766h;

    /* renamed from: i, reason: collision with root package name */
    public final int f225767i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint.FontMetricsInt f225768m;

    /* renamed from: n, reason: collision with root package name */
    public int f225769n;

    /* renamed from: o, reason: collision with root package name */
    public int f225770o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f225771p;

    public g(float f17, int i17, float f18, int i18, float f19, int i19) {
        this.f225762d = f17;
        this.f225763e = i17;
        this.f225764f = f18;
        this.f225765g = i18;
        this.f225766h = f19;
        this.f225767i = i19;
    }

    public final android.graphics.Paint.FontMetricsInt a() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f225768m;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        kotlin.jvm.internal.o.o("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f225771p) {
            return this.f225770o;
        }
        throw new java.lang.IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.f225771p) {
            return this.f225769n;
        }
        throw new java.lang.IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        float f17;
        double ceil;
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f225771p = true;
        float textSize = paint.getTextSize();
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        kotlin.jvm.internal.o.f(fontMetricsInt2, "paint.fontMetricsInt");
        this.f225768m = fontMetricsInt2;
        if (!(a().descent > a().ascent)) {
            throw new java.lang.IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        float f18 = this.f225766h;
        float f19 = this.f225762d;
        int i19 = this.f225763e;
        if (i19 == 0) {
            f17 = f19 * f18;
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported unit.");
            }
            f17 = f19 * textSize;
        }
        this.f225769n = (int) java.lang.Math.ceil(f17);
        float f27 = this.f225764f;
        int i27 = this.f225765g;
        if (i27 == 0) {
            ceil = java.lang.Math.ceil(f27 * f18);
        } else {
            if (i27 != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported unit.");
            }
            ceil = java.lang.Math.ceil(f27 * textSize);
        }
        this.f225770o = (int) ceil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f225767i) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b17 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b17;
                        fontMetricsInt.descent = b17 + b();
                        break;
                    }
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = java.lang.Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = java.lang.Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }
}
