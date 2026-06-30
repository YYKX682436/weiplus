package fa;

/* loaded from: classes15.dex */
public final class f {
    public float A;
    public int[] B;
    public boolean C;
    public final android.text.TextPaint D;
    public final android.text.TextPaint E;
    public android.animation.TimeInterpolator F;
    public android.animation.TimeInterpolator G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f260595J;
    public int K;
    public float L;
    public float M;
    public float N;
    public int O;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f260596a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f260597b;

    /* renamed from: c, reason: collision with root package name */
    public float f260598c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f260599d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f260600e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f260601f;

    /* renamed from: g, reason: collision with root package name */
    public int f260602g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f260603h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f260604i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f260605j = 15.0f;

    /* renamed from: k, reason: collision with root package name */
    public android.content.res.ColorStateList f260606k;

    /* renamed from: l, reason: collision with root package name */
    public android.content.res.ColorStateList f260607l;

    /* renamed from: m, reason: collision with root package name */
    public float f260608m;

    /* renamed from: n, reason: collision with root package name */
    public float f260609n;

    /* renamed from: o, reason: collision with root package name */
    public float f260610o;

    /* renamed from: p, reason: collision with root package name */
    public float f260611p;

    /* renamed from: q, reason: collision with root package name */
    public float f260612q;

    /* renamed from: r, reason: collision with root package name */
    public float f260613r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Typeface f260614s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Typeface f260615t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Typeface f260616u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f260617v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f260618w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f260619x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Bitmap f260620y;

    /* renamed from: z, reason: collision with root package name */
    public float f260621z;

    public f(android.view.View view) {
        this.f260596a = view;
        android.text.TextPaint textPaint = new android.text.TextPaint(129);
        this.D = textPaint;
        this.E = new android.text.TextPaint(textPaint);
        this.f260600e = new android.graphics.Rect();
        this.f260599d = new android.graphics.Rect();
        this.f260601f = new android.graphics.RectF();
    }

    public static int a(int i17, int i18, float f17) {
        float f18 = 1.0f - f17;
        return android.graphics.Color.argb((int) ((android.graphics.Color.alpha(i17) * f18) + (android.graphics.Color.alpha(i18) * f17)), (int) ((android.graphics.Color.red(i17) * f18) + (android.graphics.Color.red(i18) * f17)), (int) ((android.graphics.Color.green(i17) * f18) + (android.graphics.Color.green(i18) * f17)), (int) ((android.graphics.Color.blue(i17) * f18) + (android.graphics.Color.blue(i18) * f17)));
    }

    public static float f(float f17, float f18, float f19, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f19 = timeInterpolator.getInterpolation(f19);
        }
        android.animation.TimeInterpolator timeInterpolator2 = w9.a.f444034a;
        return f17 + (f19 * (f18 - f17));
    }

    public final boolean b(java.lang.CharSequence charSequence) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return ((l3.i) (n3.v0.d(this.f260596a) == 1 ? l3.k.f315305d : l3.k.f315304c)).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f17) {
        boolean z17;
        float f18;
        if (this.f260617v == null) {
            return;
        }
        float width = this.f260600e.width();
        float width2 = this.f260599d.width();
        if (java.lang.Math.abs(f17 - this.f260605j) < 0.001f) {
            f18 = this.f260605j;
            this.f260621z = 1.0f;
            android.graphics.Typeface typeface = this.f260616u;
            android.graphics.Typeface typeface2 = this.f260614s;
            if (typeface != typeface2) {
                this.f260616u = typeface2;
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            float f19 = this.f260604i;
            android.graphics.Typeface typeface3 = this.f260616u;
            android.graphics.Typeface typeface4 = this.f260615t;
            if (typeface3 != typeface4) {
                this.f260616u = typeface4;
                z17 = true;
            } else {
                z17 = false;
            }
            if (java.lang.Math.abs(f17 - f19) < 0.001f) {
                this.f260621z = 1.0f;
            } else {
                this.f260621z = f17 / this.f260604i;
            }
            float f27 = this.f260605j / this.f260604i;
            width = width2 * f27 > width ? java.lang.Math.min(width / f27, width2) : width2;
            f18 = f19;
        }
        if (width > 0.0f) {
            z17 = this.A != f18 || this.C || z17;
            this.A = f18;
            this.C = false;
        }
        if (this.f260618w == null || z17) {
            android.text.TextPaint textPaint = this.D;
            textPaint.setTextSize(this.A);
            textPaint.setTypeface(this.f260616u);
            textPaint.setLinearText(this.f260621z != 1.0f);
            java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(this.f260617v, textPaint, width, android.text.TextUtils.TruncateAt.END);
            if (android.text.TextUtils.equals(ellipsize, this.f260618w)) {
                return;
            }
            this.f260618w = ellipsize;
            this.f260619x = b(ellipsize);
        }
    }

    public void d(android.graphics.Canvas canvas) {
        int save = canvas.save();
        if (this.f260618w != null && this.f260597b) {
            float f17 = this.f260612q;
            float f18 = this.f260613r;
            android.text.TextPaint textPaint = this.D;
            textPaint.ascent();
            textPaint.descent();
            float f19 = this.f260621z;
            if (f19 != 1.0f) {
                canvas.scale(f19, f19, f17, f18);
            }
            java.lang.CharSequence charSequence = this.f260618w;
            canvas.drawText(charSequence, 0, charSequence.length(), f17, f18, textPaint);
        }
        canvas.restoreToCount(save);
    }

    public int e() {
        int[] iArr = this.B;
        return iArr != null ? this.f260607l.getColorForState(iArr, 0) : this.f260607l.getDefaultColor();
    }

    public void g() {
        boolean z17;
        android.graphics.Rect rect = this.f260600e;
        if (rect.width() > 0 && rect.height() > 0) {
            android.graphics.Rect rect2 = this.f260599d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z17 = true;
                this.f260597b = z17;
            }
        }
        z17 = false;
        this.f260597b = z17;
    }

    public final android.graphics.Typeface h(int i17) {
        android.content.res.TypedArray obtainStyledAttributes = this.f260596a.getContext().obtainStyledAttributes(i17, new int[]{android.R.attr.fontFamily});
        try {
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return android.graphics.Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void i() {
        android.view.View view = this.f260596a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            return;
        }
        float f17 = this.A;
        c(this.f260605j);
        java.lang.CharSequence charSequence = this.f260618w;
        android.text.TextPaint textPaint = this.D;
        float measureText = charSequence != null ? textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.f260603h, this.f260619x ? 1 : 0);
        int i17 = absoluteGravity & 112;
        android.graphics.Rect rect = this.f260600e;
        if (i17 == 48) {
            this.f260609n = rect.top - textPaint.ascent();
        } else if (i17 != 80) {
            this.f260609n = rect.centerY() + (((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent());
        } else {
            this.f260609n = rect.bottom;
        }
        int i18 = absoluteGravity & 8388615;
        if (i18 == 1) {
            this.f260611p = rect.centerX() - (measureText / 2.0f);
        } else if (i18 != 5) {
            this.f260611p = rect.left;
        } else {
            this.f260611p = rect.right - measureText;
        }
        c(this.f260604i);
        java.lang.CharSequence charSequence2 = this.f260618w;
        float measureText2 = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(this.f260602g, this.f260619x ? 1 : 0);
        int i19 = absoluteGravity2 & 112;
        android.graphics.Rect rect2 = this.f260599d;
        if (i19 == 48) {
            this.f260608m = rect2.top - textPaint.ascent();
        } else if (i19 != 80) {
            this.f260608m = rect2.centerY() + (((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent());
        } else {
            this.f260608m = rect2.bottom;
        }
        int i27 = absoluteGravity2 & 8388615;
        if (i27 == 1) {
            this.f260610o = rect2.centerX() - (measureText2 / 2.0f);
        } else if (i27 != 5) {
            this.f260610o = rect2.left;
        } else {
            this.f260610o = rect2.right - measureText2;
        }
        android.graphics.Bitmap bitmap = this.f260620y;
        if (bitmap != null) {
            bitmap.recycle();
            this.f260620y = null;
        }
        n(f17);
        float f18 = this.f260598c;
        android.graphics.RectF rectF = this.f260601f;
        rectF.left = f(rect2.left, rect.left, f18, this.F);
        rectF.top = f(this.f260608m, this.f260609n, f18, this.F);
        rectF.right = f(rect2.right, rect.right, f18, this.F);
        rectF.bottom = f(rect2.bottom, rect.bottom, f18, this.F);
        this.f260612q = f(this.f260610o, this.f260611p, f18, this.F);
        this.f260613r = f(this.f260608m, this.f260609n, f18, this.F);
        n(f(this.f260604i, this.f260605j, f18, this.G));
        android.content.res.ColorStateList colorStateList = this.f260607l;
        android.content.res.ColorStateList colorStateList2 = this.f260606k;
        if (colorStateList != colorStateList2) {
            int[] iArr = this.B;
            textPaint.setColor(a(iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor(), e(), f18));
        } else {
            textPaint.setColor(e());
        }
        textPaint.setShadowLayer(f(this.L, this.H, f18, null), f(this.M, this.I, f18, null), f(this.N, this.f260595J, f18, null), a(this.O, this.K, f18));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f260596a
            android.content.Context r0 = r0.getContext()
            int[] r1 = j.a.f296197y
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r7, r1)
            r2 = 3
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L29
            int r3 = r1.getResourceId(r2, r4)
            if (r3 == 0) goto L29
            java.lang.Object r5 = k.a.f302856a
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            if (r0 == 0) goto L29
            goto L2d
        L29:
            android.content.res.ColorStateList r0 = r1.getColorStateList(r2)
        L2d:
            r6.f260607l = r0
        L2f:
            boolean r0 = r1.hasValue(r4)
            if (r0 == 0) goto L3f
            float r0 = r6.f260605j
            int r0 = (int) r0
            int r0 = r1.getDimensionPixelSize(r4, r0)
            float r0 = (float) r0
            r6.f260605j = r0
        L3f:
            r0 = 6
            int r0 = r1.getInt(r0, r4)
            r6.K = r0
            r0 = 7
            r2 = 0
            float r0 = r1.getFloat(r0, r2)
            r6.I = r0
            r0 = 8
            float r0 = r1.getFloat(r0, r2)
            r6.f260595J = r0
            r0 = 9
            float r0 = r1.getFloat(r0, r2)
            r6.H = r0
            r1.recycle()
            android.graphics.Typeface r7 = r6.h(r7)
            r6.f260614s = r7
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.f.j(int):void");
    }

    public void k(android.content.res.ColorStateList colorStateList) {
        if (this.f260607l != colorStateList) {
            this.f260607l = colorStateList;
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f260596a
            android.content.Context r0 = r0.getContext()
            int[] r1 = j.a.f296197y
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r7, r1)
            r2 = 3
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L29
            int r3 = r1.getResourceId(r2, r4)
            if (r3 == 0) goto L29
            java.lang.Object r5 = k.a.f302856a
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            if (r0 == 0) goto L29
            goto L2d
        L29:
            android.content.res.ColorStateList r0 = r1.getColorStateList(r2)
        L2d:
            r6.f260606k = r0
        L2f:
            boolean r0 = r1.hasValue(r4)
            if (r0 == 0) goto L3f
            float r0 = r6.f260604i
            int r0 = (int) r0
            int r0 = r1.getDimensionPixelSize(r4, r0)
            float r0 = (float) r0
            r6.f260604i = r0
        L3f:
            r0 = 6
            int r0 = r1.getInt(r0, r4)
            r6.O = r0
            r0 = 7
            r2 = 0
            float r0 = r1.getFloat(r0, r2)
            r6.M = r0
            r0 = 8
            float r0 = r1.getFloat(r0, r2)
            r6.N = r0
            r0 = 9
            float r0 = r1.getFloat(r0, r2)
            r6.L = r0
            r1.recycle()
            android.graphics.Typeface r7 = r6.h(r7)
            r6.f260615t = r7
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.f.l(int):void");
    }

    public void m(float f17) {
        float a17 = h3.a.a(f17, 0.0f, 1.0f);
        if (a17 != this.f260598c) {
            this.f260598c = a17;
            android.graphics.RectF rectF = this.f260601f;
            float f18 = this.f260599d.left;
            android.graphics.Rect rect = this.f260600e;
            rectF.left = f(f18, rect.left, a17, this.F);
            rectF.top = f(this.f260608m, this.f260609n, a17, this.F);
            rectF.right = f(r1.right, rect.right, a17, this.F);
            rectF.bottom = f(r1.bottom, rect.bottom, a17, this.F);
            this.f260612q = f(this.f260610o, this.f260611p, a17, this.F);
            this.f260613r = f(this.f260608m, this.f260609n, a17, this.F);
            n(f(this.f260604i, this.f260605j, a17, this.G));
            android.content.res.ColorStateList colorStateList = this.f260607l;
            android.content.res.ColorStateList colorStateList2 = this.f260606k;
            android.text.TextPaint textPaint = this.D;
            if (colorStateList != colorStateList2) {
                int[] iArr = this.B;
                textPaint.setColor(a(iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor(), e(), a17));
            } else {
                textPaint.setColor(e());
            }
            textPaint.setShadowLayer(f(this.L, this.H, a17, null), f(this.M, this.I, a17, null), f(this.N, this.f260595J, a17, null), a(this.O, this.K, a17));
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this.f260596a);
        }
    }

    public final void n(float f17) {
        c(f17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this.f260596a);
    }

    public final boolean o(int[] iArr) {
        android.content.res.ColorStateList colorStateList;
        this.B = iArr;
        android.content.res.ColorStateList colorStateList2 = this.f260607l;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f260606k) != null && colorStateList.isStateful()))) {
            return false;
        }
        i();
        return true;
    }
}
