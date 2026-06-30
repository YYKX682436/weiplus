package ia;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f289871a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.ColorStateList f289872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f289873c;

    /* renamed from: d, reason: collision with root package name */
    public final int f289874d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f289875e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.ColorStateList f289876f;

    /* renamed from: g, reason: collision with root package name */
    public final float f289877g;

    /* renamed from: h, reason: collision with root package name */
    public final float f289878h;

    /* renamed from: i, reason: collision with root package name */
    public final float f289879i;

    /* renamed from: j, reason: collision with root package name */
    public final int f289880j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f289881k = false;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Typeface f289882l;

    public c(android.content.Context context, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i17, v9.a.f434132v);
        this.f289871a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f289872b = ia.a.a(context, obtainStyledAttributes, 3);
        ia.a.a(context, obtainStyledAttributes, 4);
        ia.a.a(context, obtainStyledAttributes, 5);
        this.f289873c = obtainStyledAttributes.getInt(2, 0);
        this.f289874d = obtainStyledAttributes.getInt(1, 1);
        int i18 = obtainStyledAttributes.hasValue(11) ? 11 : 10;
        this.f289880j = obtainStyledAttributes.getResourceId(i18, 0);
        this.f289875e = obtainStyledAttributes.getString(i18);
        obtainStyledAttributes.getBoolean(12, false);
        this.f289876f = ia.a.a(context, obtainStyledAttributes, 6);
        this.f289877g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f289878h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f289879i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        android.graphics.Typeface typeface = this.f289882l;
        int i17 = this.f289873c;
        if (typeface == null) {
            this.f289882l = android.graphics.Typeface.create(this.f289875e, i17);
        }
        if (this.f289882l == null) {
            int i18 = this.f289874d;
            if (i18 == 1) {
                this.f289882l = android.graphics.Typeface.SANS_SERIF;
            } else if (i18 == 2) {
                this.f289882l = android.graphics.Typeface.SERIF;
            } else if (i18 != 3) {
                this.f289882l = android.graphics.Typeface.DEFAULT;
            } else {
                this.f289882l = android.graphics.Typeface.MONOSPACE;
            }
            android.graphics.Typeface typeface2 = this.f289882l;
            if (typeface2 != null) {
                this.f289882l = android.graphics.Typeface.create(typeface2, i17);
            }
        }
    }

    public void b(android.content.Context context, android.text.TextPaint textPaint, d3.p pVar) {
        c(context, textPaint, pVar);
        android.content.res.ColorStateList colorStateList = this.f289872b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        android.content.res.ColorStateList colorStateList2 = this.f289876f;
        textPaint.setShadowLayer(this.f289879i, this.f289877g, this.f289878h, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(android.content.Context context, android.text.TextPaint textPaint, d3.p pVar) {
        if (this.f289881k) {
            d(textPaint, this.f289882l);
        } else {
            a();
            if (context.isRestricted()) {
                this.f289881k = true;
                d(textPaint, this.f289882l);
            } else {
                try {
                    d3.q.a(context, this.f289880j, new ia.b(this, textPaint, pVar), null);
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException | java.lang.Exception unused) {
                }
            }
        }
        if (this.f289881k) {
            return;
        }
        d(textPaint, this.f289882l);
    }

    public void d(android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i17 = (~typeface.getStyle()) & this.f289873c;
        textPaint.setFakeBoldText((i17 & 1) != 0);
        textPaint.setTextSkewX((i17 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f289871a);
    }
}
