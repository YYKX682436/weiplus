package l3;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f315295a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.TextDirectionHeuristic f315296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f315297c;

    /* renamed from: d, reason: collision with root package name */
    public final int f315298d;

    public d(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i17, int i18) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            new android.text.PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i17).setHyphenationFrequency(i18).setTextDirection(textDirectionHeuristic).build();
        }
        this.f315295a = textPaint;
        this.f315296b = textDirectionHeuristic;
        this.f315297c = i17;
        this.f315298d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        boolean z17;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3.d)) {
            return false;
        }
        l3.d dVar = (l3.d) obj;
        if (this.f315297c == dVar.f315297c && this.f315298d == dVar.f315298d) {
            android.text.TextPaint textPaint = this.f315295a;
            float textSize = textPaint.getTextSize();
            android.text.TextPaint textPaint2 = dVar.f315295a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && android.text.TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                z17 = true;
                return !z17 && this.f315296b == dVar.f315296b;
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
    }

    public int hashCode() {
        android.text.TextPaint textPaint = this.f315295a;
        return m3.c.b(java.lang.Float.valueOf(textPaint.getTextSize()), java.lang.Float.valueOf(textPaint.getTextScaleX()), java.lang.Float.valueOf(textPaint.getTextSkewX()), java.lang.Float.valueOf(textPaint.getLetterSpacing()), java.lang.Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), java.lang.Boolean.valueOf(textPaint.isElegantTextHeight()), this.f315296b, java.lang.Integer.valueOf(this.f315297c), java.lang.Integer.valueOf(this.f315298d));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("textSize=");
        android.text.TextPaint textPaint = this.f315295a;
        sb7.append(textPaint.getTextSize());
        sb6.append(sb7.toString());
        sb6.append(", textScaleX=" + textPaint.getTextScaleX());
        sb6.append(", textSkewX=" + textPaint.getTextSkewX());
        int i17 = android.os.Build.VERSION.SDK_INT;
        sb6.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb6.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb6.append(", textLocale=" + textPaint.getTextLocales());
        sb6.append(", typeface=" + textPaint.getTypeface());
        if (i17 >= 26) {
            sb6.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb6.append(", textDir=" + this.f315296b);
        sb6.append(", breakStrategy=" + this.f315297c);
        sb6.append(", hyphenationFrequency=" + this.f315298d);
        sb6.append("}");
        return sb6.toString();
    }

    public d(android.text.PrecomputedText.Params params) {
        this.f315295a = params.getTextPaint();
        this.f315296b = params.getTextDirection();
        this.f315297c = params.getBreakStrategy();
        this.f315298d = params.getHyphenationFrequency();
    }
}
