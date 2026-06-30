package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class NoMeasuredTextView extends com.tencent.mm.view.x2c.X2CView {
    public static final android.text.BoringLayout.Metrics Q;
    public int A;
    public android.graphics.Paint.FontMetricsInt B;
    public boolean C;
    public boolean D;
    public db5.u8 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f197665J;
    public int K;
    public java.lang.String L;
    public int M;
    public int N;
    public db5.v8 P;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f197666d;

    /* renamed from: e, reason: collision with root package name */
    public int f197667e;

    /* renamed from: f, reason: collision with root package name */
    public android.text.Editable.Factory f197668f;

    /* renamed from: g, reason: collision with root package name */
    public android.text.Spannable.Factory f197669g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f197670h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f197671i;

    /* renamed from: m, reason: collision with root package name */
    public db5.t8 f197672m;
    private java.lang.CharSequence mText;

    /* renamed from: n, reason: collision with root package name */
    public final android.text.TextPaint f197673n;

    /* renamed from: o, reason: collision with root package name */
    public android.text.Layout f197674o;

    /* renamed from: p, reason: collision with root package name */
    public int f197675p;

    /* renamed from: q, reason: collision with root package name */
    public final float f197676q;

    /* renamed from: r, reason: collision with root package name */
    public int f197677r;

    /* renamed from: s, reason: collision with root package name */
    public int f197678s;

    /* renamed from: t, reason: collision with root package name */
    public int f197679t;

    /* renamed from: u, reason: collision with root package name */
    public int f197680u;

    /* renamed from: v, reason: collision with root package name */
    public int f197681v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f197682w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f197683x;

    /* renamed from: y, reason: collision with root package name */
    public android.text.BoringLayout f197684y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f197685z;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.measureText("H");
        Q = new android.text.BoringLayout.Metrics();
    }

    public NoMeasuredTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197668f = android.text.Editable.Factory.getInstance();
        this.f197669g = android.text.Spannable.Factory.getInstance();
        this.f197670h = null;
        this.f197672m = db5.t8.NORMAL;
        this.f197675p = 51;
        this.f197676q = 1.0f;
        this.f197677r = Integer.MAX_VALUE;
        this.f197678s = 1;
        this.f197679t = 0;
        this.f197680u = 1;
        this.f197681v = Integer.MAX_VALUE;
        this.f197682w = false;
        this.f197683x = true;
        this.f197685z = false;
        this.C = false;
        this.D = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f197665J = -1;
        this.K = -1;
        this.mText = "";
        this.f197671i = "";
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f197673n = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        setDrawingCacheEnabled(false);
        this.B = textPaint.getFontMetricsInt();
        e();
        setSingleLine(true);
        setEllipsize(null);
    }

    private int getDesiredHeight() {
        android.text.Layout layout = this.f197674o;
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom();
        int lineTop = layout.getLineTop(lineCount) + compoundPaddingTop;
        if (this.f197678s == 1) {
            int i17 = this.f197677r;
            if (lineCount > i17) {
                lineTop = layout.getLineTop(i17) + layout.getBottomPadding() + compoundPaddingTop;
                lineCount = this.f197677r;
            }
        } else {
            lineTop = java.lang.Math.min(lineTop, this.f197677r);
        }
        if (this.f197680u != 1) {
            lineTop = java.lang.Math.max(lineTop, this.f197679t);
        } else if (lineCount < this.f197679t) {
            lineTop += getLineHeight() * (this.f197679t - lineCount);
        }
        return java.lang.Math.max(lineTop, getSuggestedMinimumHeight());
    }

    private void setRawTextSize(float f17) {
        android.text.TextPaint textPaint = this.f197673n;
        if (f17 != textPaint.getTextSize()) {
            textPaint.setTextSize(f17);
            this.B = textPaint.getFontMetricsInt();
            this.A = (int) (java.lang.Math.ceil(r5.descent - r5.ascent) + 2.0d);
            if (this.f197674o != null) {
                d();
                requestLayout();
                invalidate();
            }
        }
    }

    public final void a() {
        int right;
        int compoundPaddingRight;
        if (this.f197682w) {
            right = this.f197681v - getCompoundPaddingLeft();
            compoundPaddingRight = getCompoundPaddingRight();
        } else {
            right = (getRight() - getLeft()) - getCompoundPaddingLeft();
            compoundPaddingRight = getCompoundPaddingRight();
        }
        int i17 = right - compoundPaddingRight;
        if (i17 < 1) {
            i17 = 0;
        }
        int i18 = i17;
        android.text.BoringLayout.Metrics metrics = Q;
        c(i18, metrics, metrics, i18, false);
    }

    public final int b(boolean z17) {
        int measuredHeight;
        int height;
        int i17 = this.f197675p & 112;
        android.text.Layout layout = this.f197674o;
        if (i17 == 48 || (height = layout.getHeight()) >= (measuredHeight = (getMeasuredHeight() - getExtendedPaddingTop()) - getExtendedPaddingBottom())) {
            return 0;
        }
        return i17 == 80 ? measuredHeight - height : (measuredHeight - height) >> 1;
    }

    public void c(int i17, android.text.BoringLayout.Metrics metrics, android.text.BoringLayout.Metrics metrics2, int i18, boolean z17) {
        int i19 = i17 < 0 ? 0 : i17;
        int i27 = this.f197675p & 7;
        android.text.Layout.Alignment alignment = i27 != 1 ? i27 != 5 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_CENTER;
        boolean z18 = this.f197670h != null;
        android.text.TextPaint textPaint = this.f197673n;
        if (!z18) {
            this.f197674o = new android.text.StaticLayout(this.f197671i, textPaint, i19, alignment, this.f197676q, 0.0f, this.f197683x);
        } else {
            java.lang.CharSequence charSequence = this.f197671i;
            this.f197674o = new android.text.StaticLayout(charSequence, 0, charSequence.length(), textPaint, i19, alignment, this.f197676q, 0.0f, this.f197683x, this.f197670h, i18);
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        android.text.Layout layout = this.f197674o;
        return layout != null ? layout.getWidth() : super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return (getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        android.text.Layout layout = this.f197674o;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    public final void d() {
        android.text.Layout layout = this.f197674o;
        if ((layout instanceof android.text.BoringLayout) && this.f197684y == null) {
            this.f197684y = (android.text.BoringLayout) layout;
        }
        this.f197674o = null;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.content.res.ColorStateList colorStateList = this.f197666d;
        if (colorStateList != null && colorStateList.isStateful()) {
            j();
        }
        db5.u8 u8Var = this.E;
        if (u8Var != null) {
            int[] drawableState = getDrawableState();
            android.graphics.drawable.Drawable drawable = u8Var.f228530b;
            if (drawable != null && drawable.isStateful()) {
                u8Var.f228530b.setState(drawableState);
            }
            android.graphics.drawable.Drawable drawable2 = u8Var.f228531c;
            if (drawable2 != null && drawable2.isStateful()) {
                u8Var.f228531c.setState(drawableState);
            }
            android.graphics.drawable.Drawable drawable3 = u8Var.f228532d;
            if (drawable3 != null && drawable3.isStateful()) {
                u8Var.f228532d.setState(drawableState);
            }
            android.graphics.drawable.Drawable drawable4 = u8Var.f228533e;
            if (drawable4 == null || !drawable4.isStateful()) {
                return;
            }
            u8Var.f228533e.setState(drawableState);
        }
    }

    public void e() {
        if (this.A == 0) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = this.B;
            this.A = (int) (java.lang.Math.ceil(fontMetricsInt.descent - fontMetricsInt.ascent) + 2.0d);
        }
    }

    public void f(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        db5.u8 u8Var = this.E;
        if ((drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) ? false : true) {
            if (u8Var == null) {
                u8Var = new db5.u8(this);
                this.E = u8Var;
            }
            android.graphics.drawable.Drawable drawable5 = u8Var.f228532d;
            if (drawable5 != drawable && drawable5 != null) {
                drawable5.setCallback(null);
            }
            u8Var.f228532d = drawable;
            android.graphics.drawable.Drawable drawable6 = u8Var.f228530b;
            if (drawable6 != drawable2 && drawable6 != null) {
                drawable6.setCallback(null);
            }
            u8Var.f228530b = drawable2;
            android.graphics.drawable.Drawable drawable7 = u8Var.f228533e;
            if (drawable7 != drawable3 && drawable7 != null) {
                drawable7.setCallback(null);
            }
            u8Var.f228533e = drawable3;
            android.graphics.drawable.Drawable drawable8 = u8Var.f228531c;
            if (drawable8 != drawable4 && drawable8 != null) {
                drawable8.setCallback(null);
            }
            u8Var.f228531c = drawable4;
            int[] drawableState = getDrawableState();
            android.graphics.Rect rect = u8Var.f228529a;
            if (drawable != null) {
                drawable.setState(drawableState);
                drawable.copyBounds(rect);
                drawable.setCallback(this);
                u8Var.f228536h = rect.width();
                u8Var.f228540l = rect.height();
            } else {
                u8Var.f228540l = 0;
                u8Var.f228536h = 0;
            }
            if (drawable3 != null) {
                drawable3.setState(drawableState);
                drawable3.copyBounds(rect);
                drawable3.setCallback(this);
                u8Var.f228537i = rect.width();
                u8Var.f228541m = rect.height();
            } else {
                u8Var.f228541m = 0;
                u8Var.f228537i = 0;
            }
            if (drawable2 != null) {
                drawable2.setState(drawableState);
                drawable2.copyBounds(rect);
                drawable2.setCallback(this);
                u8Var.f228534f = rect.height();
                u8Var.f228538j = rect.width();
            } else {
                u8Var.f228538j = 0;
                u8Var.f228534f = 0;
            }
            if (drawable4 != null) {
                drawable4.setState(drawableState);
                drawable4.copyBounds(rect);
                drawable4.setCallback(this);
                u8Var.f228535g = rect.height();
                u8Var.f228539k = rect.width();
            } else {
                u8Var.f228539k = 0;
                u8Var.f228535g = 0;
            }
        } else if (u8Var != null) {
            if (u8Var.f228542n == 0) {
                this.E = null;
            } else {
                android.graphics.drawable.Drawable drawable9 = u8Var.f228532d;
                if (drawable9 != null) {
                    drawable9.setCallback(null);
                }
                u8Var.f228532d = null;
                android.graphics.drawable.Drawable drawable10 = u8Var.f228530b;
                if (drawable10 != null) {
                    drawable10.setCallback(null);
                }
                u8Var.f228530b = null;
                android.graphics.drawable.Drawable drawable11 = u8Var.f228533e;
                if (drawable11 != null) {
                    drawable11.setCallback(null);
                }
                u8Var.f228533e = null;
                android.graphics.drawable.Drawable drawable12 = u8Var.f228531c;
                if (drawable12 != null) {
                    drawable12.setCallback(null);
                }
                u8Var.f228531c = null;
                u8Var.f228540l = 0;
                u8Var.f228536h = 0;
                u8Var.f228541m = 0;
                u8Var.f228537i = 0;
                u8Var.f228538j = 0;
                u8Var.f228534f = 0;
                u8Var.f228539k = 0;
                u8Var.f228535g = 0;
            }
        }
        invalidate();
    }

    public void g(java.lang.String str, int i17, int i18) {
        this.L = str;
        this.M = i17;
        this.N = i18;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f197674o == null) {
            return super.getBaseline();
        }
        return getExtendedPaddingTop() + ((this.f197675p & 112) != 48 ? b(true) : 0) + this.f197674o.getLineBaseline(0);
    }

    public int getCompoundDrawablePadding() {
        db5.u8 u8Var = this.E;
        if (u8Var != null) {
            return u8Var.f228542n;
        }
        return 0;
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawables() {
        db5.u8 u8Var = this.E;
        return u8Var != null ? new android.graphics.drawable.Drawable[]{u8Var.f228532d, u8Var.f228530b, u8Var.f228533e, u8Var.f228531c} : new android.graphics.drawable.Drawable[]{null, null, null, null};
    }

    public int getCompoundPaddingBottom() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f228531c == null || !this.I) ? getPaddingBottom() : getPaddingBottom() + u8Var.f228542n + u8Var.f228535g;
    }

    public int getCompoundPaddingLeft() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f228532d == null || !this.F) ? getPaddingLeft() : getPaddingLeft() + u8Var.f228542n + u8Var.f228536h;
    }

    public int getCompoundPaddingRight() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f228533e == null || !this.G) ? getPaddingRight() : getPaddingRight() + u8Var.f228542n + u8Var.f228537i;
    }

    public int getCompoundPaddingTop() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f228530b == null || !this.H) ? getPaddingTop() : getPaddingTop() + u8Var.f228542n + u8Var.f228534f;
    }

    public final int getCurrentTextColor() {
        return this.f197667e;
    }

    public boolean getDefaultEditable() {
        return false;
    }

    public android.text.method.MovementMethod getDefaultMovementMethod() {
        return null;
    }

    public android.text.Editable getEditableText() {
        java.lang.CharSequence charSequence = this.mText;
        if (charSequence instanceof android.text.Editable) {
            return (android.text.Editable) charSequence;
        }
        return null;
    }

    @android.view.ViewDebug.ExportedProperty
    public android.text.TextUtils.TruncateAt getEllipsize() {
        return this.f197670h;
    }

    public int getExtendedPaddingBottom() {
        android.text.Layout layout = this.f197674o;
        if (layout == null || this.f197678s != 1) {
            return getCompoundPaddingBottom();
        }
        if (layout.getLineCount() <= this.f197677r) {
            return getCompoundPaddingBottom();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int compoundPaddingBottom = getCompoundPaddingBottom();
        int height = (getHeight() - compoundPaddingTop) - compoundPaddingBottom;
        int lineTop = this.f197674o.getLineTop(this.f197677r);
        if (lineTop >= height) {
            return compoundPaddingBottom;
        }
        int i17 = this.f197675p & 112;
        return i17 == 48 ? (compoundPaddingBottom + height) - lineTop : i17 == 80 ? compoundPaddingBottom : compoundPaddingBottom + ((height - lineTop) / 2);
    }

    public int getExtendedPaddingTop() {
        int i17;
        android.text.Layout layout = this.f197674o;
        if (layout == null || this.f197678s != 1) {
            return getCompoundPaddingTop();
        }
        if (layout.getLineCount() <= this.f197677r) {
            return getCompoundPaddingTop();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int height = (getHeight() - compoundPaddingTop) - getCompoundPaddingBottom();
        int lineTop = this.f197674o.getLineTop(this.f197677r);
        return (lineTop < height && (i17 = this.f197675p & 112) != 48) ? i17 == 80 ? (compoundPaddingTop + height) - lineTop : compoundPaddingTop + ((height - lineTop) / 2) : compoundPaddingTop;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.f197674o == null) {
            super.getFocusedRect(rect);
            return;
        }
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            super.getFocusedRect(rect);
            return;
        }
        int lineForOffset = this.f197674o.getLineForOffset(selectionEnd);
        rect.top = this.f197674o.getLineTop(lineForOffset);
        rect.bottom = this.f197674o.getLineBottom(lineForOffset);
        int primaryHorizontal = (int) this.f197674o.getPrimaryHorizontal(selectionEnd);
        rect.left = primaryHorizontal;
        rect.right = primaryHorizontal + 1;
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int extendedPaddingTop = getExtendedPaddingTop();
        if ((this.f197675p & 112) != 48) {
            extendedPaddingTop += b(false);
        }
        rect.offset(compoundPaddingLeft, extendedPaddingTop);
    }

    public int getGravity() {
        return this.f197675p;
    }

    public final android.text.Layout getLayout() {
        return this.f197674o;
    }

    public int getLineCount() {
        android.text.Layout layout = this.f197674o;
        if (layout != null) {
            return layout.getLineCount();
        }
        return 0;
    }

    public int getLineHeight() {
        return java.lang.Math.round((this.f197673n.getFontMetricsInt(null) * this.f197676q) + 0.0f);
    }

    public android.text.TextPaint getPaint() {
        return this.f197673n;
    }

    public int getPaintFlags() {
        return this.f197673n.getFlags();
    }

    @android.view.ViewDebug.ExportedProperty
    public int getSelectionEnd() {
        return android.text.Selection.getSelectionEnd(getText());
    }

    @android.view.ViewDebug.ExportedProperty
    public int getSelectionStart() {
        return android.text.Selection.getSelectionStart(getText());
    }

    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getText() {
        return this.mText;
    }

    public final android.content.res.ColorStateList getTextColors() {
        return this.f197666d;
    }

    public float getTextScaleX() {
        return this.f197673n.getTextScaleX();
    }

    public float getTextSize() {
        return this.f197673n.getTextSize();
    }

    public int getTotalPaddingBottom() {
        int i17;
        int measuredHeight;
        int height;
        int extendedPaddingBottom = getExtendedPaddingBottom();
        int i18 = this.f197675p & 112;
        android.text.Layout layout = this.f197674o;
        if (i18 == 80 || (height = layout.getHeight()) >= (measuredHeight = (getMeasuredHeight() - getExtendedPaddingTop()) - getExtendedPaddingBottom())) {
            i17 = 0;
        } else {
            i17 = measuredHeight - height;
            if (i18 != 48) {
                i17 >>= 1;
            }
        }
        return extendedPaddingBottom + i17;
    }

    public int getTotalPaddingLeft() {
        return getCompoundPaddingLeft();
    }

    public int getTotalPaddingRight() {
        return getCompoundPaddingRight();
    }

    public int getTotalPaddingTop() {
        return getExtendedPaddingTop() + b(true);
    }

    public android.graphics.Typeface getTypeface() {
        return this.f197673n.getTypeface();
    }

    public void h(java.lang.CharSequence charSequence, db5.t8 t8Var) {
        if (charSequence == null) {
            charSequence = "";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        try {
            if (charSequence2.equals(this.mText)) {
                return;
            }
            if (getMeasuredWidth() > 0 && this.P != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
                charSequence2 = this.P.a(this, charSequence2, this.L, this.M, this.N);
                this.L = null;
            }
            if (charSequence2 instanceof android.text.Spanned) {
                this.f197685z = false;
            } else {
                this.f197685z = true;
            }
            if (t8Var == db5.t8.EDITABLE) {
                charSequence2 = this.f197668f.newEditable(charSequence2);
            } else if (t8Var == db5.t8.SPANNABLE) {
                charSequence2 = this.f197669g.newSpannable(charSequence2);
            }
            int compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft();
            if (this.D) {
                boolean z17 = this.f197682w;
                android.text.TextPaint textPaint = this.f197673n;
                if (z17) {
                    int i17 = this.f197681v;
                    if (getMeasuredWidth() > 0) {
                        i17 = java.lang.Math.min(this.f197681v, getMeasuredWidth());
                    }
                    charSequence2 = android.text.TextUtils.ellipsize(charSequence2, textPaint, i17 - compoundPaddingRight, android.text.TextUtils.TruncateAt.END);
                } else if (this.C || getMeasuredWidth() <= 0) {
                    this.C = true;
                } else {
                    charSequence2 = android.text.TextUtils.ellipsize(charSequence2, textPaint, getMeasuredWidth() - compoundPaddingRight, android.text.TextUtils.TruncateAt.END);
                }
            }
            this.f197672m = t8Var;
            this.mText = charSequence2;
            this.f197671i = charSequence2;
            if (this.f197685z) {
                e();
                invalidate();
                return;
            }
            if (getWidth() == 0) {
                requestLayout();
                invalidate();
                return;
            }
            android.text.Layout layout = this.f197674o;
            if (layout == null) {
                a();
                if (this.f197674o.getHeight() != getHeight()) {
                    requestLayout();
                }
                invalidate();
                return;
            }
            int height = layout.getHeight();
            int width = this.f197674o.getWidth();
            android.text.BoringLayout.Metrics metrics = Q;
            c(width, metrics, metrics, width - compoundPaddingRight, false);
            if (this.f197670h != android.text.TextUtils.TruncateAt.MARQUEE) {
                if (getLayoutParams().height != -2 && getLayoutParams().height != -1) {
                    invalidate();
                    return;
                }
                int height2 = this.f197674o.getHeight();
                if (height2 == height && height2 == getHeight()) {
                    invalidate();
                    return;
                }
            }
            requestLayout();
            invalidate();
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = com.tencent.mm.sdk.platformtools.t8.G1(charSequence2.toString());
            java.lang.CharSequence charSequence3 = this.mText;
            objArr[1] = charSequence3 != null ? com.tencent.mm.sdk.platformtools.t8.G1(charSequence3.toString()) : null;
            objArr[2] = getContext().getClass().getSimpleName();
            com.tencent.mars.xlog.Log.printErrStackTrace("TextView", th6, "equal err text:%s mText:%s context:%s", objArr);
            jx3.f.INSTANCE.d(25996, 0, 33, ((java.lang.Object) charSequence2) + "_" + getContext().getClass().getSimpleName(), 0, this.mText);
        }
    }

    public void i(int i17, float f17) {
        android.content.Context context = getContext();
        setRawTextSize(android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        int bottom;
        int compoundPaddingTop;
        int i17;
        if (verifyDrawable(drawable)) {
            android.graphics.Rect bounds = drawable.getBounds();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            db5.u8 u8Var = this.E;
            if (u8Var != null) {
                if (drawable == u8Var.f228532d) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int bottom2 = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - compoundPaddingTop;
                    scrollX += getPaddingLeft();
                    i17 = (bottom2 - u8Var.f228540l) / 2;
                } else if (drawable == u8Var.f228533e) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int bottom3 = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - compoundPaddingTop;
                    scrollX += ((getRight() - getLeft()) - getPaddingRight()) - u8Var.f228537i;
                    i17 = (bottom3 - u8Var.f228541m) / 2;
                } else {
                    if (drawable == u8Var.f228530b) {
                        int compoundPaddingLeft = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft) - u8Var.f228538j) / 2);
                        bottom = getPaddingTop();
                    } else if (drawable == u8Var.f228531c) {
                        int compoundPaddingLeft2 = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft2 + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft2) - u8Var.f228539k) / 2);
                        bottom = ((getBottom() - getTop()) - getPaddingBottom()) - u8Var.f228535g;
                    }
                    scrollY += bottom;
                }
                bottom = compoundPaddingTop + i17;
                scrollY += bottom;
            }
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
        }
    }

    public final void j() {
        boolean z17 = false;
        int colorForState = this.f197666d.getColorForState(getDrawableState(), 0);
        if (colorForState != this.f197667e) {
            this.f197667e = colorForState;
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        float f17;
        int i19;
        int i27;
        int i28;
        float ceil;
        super.onDraw(canvas);
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int compoundPaddingTop = getCompoundPaddingTop();
        int compoundPaddingRight = getCompoundPaddingRight();
        int compoundPaddingBottom = getCompoundPaddingBottom();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int right = getRight();
        int left = getLeft();
        int bottom = getBottom();
        int top = getTop();
        int width = getWidth();
        int height = getHeight();
        db5.u8 u8Var = this.E;
        android.text.TextPaint textPaint = this.f197673n;
        if (u8Var != null) {
            int i29 = ((bottom - top) - compoundPaddingBottom) - compoundPaddingTop;
            int i37 = ((right - left) - compoundPaddingRight) - compoundPaddingLeft;
            if (!this.F || u8Var.f228532d == null) {
                i18 = height;
            } else {
                canvas.save();
                i18 = height;
                canvas.translate(getPaddingLeft() + scrollX, scrollY + compoundPaddingTop + ((i29 - u8Var.f228540l) / 2));
                u8Var.f228532d.draw(canvas);
                canvas.restore();
            }
            if (!this.G || u8Var.f228533e == null) {
                i17 = compoundPaddingRight;
                f17 = -1.0f;
            } else {
                canvas.save();
                if (this.f197685z) {
                    java.lang.CharSequence charSequence = this.mText;
                    i17 = compoundPaddingRight;
                    ceil = textPaint.measureText(charSequence, 0, charSequence.length());
                    f17 = ceil;
                } else {
                    i17 = compoundPaddingRight;
                    ceil = (float) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(this.f197671i, textPaint));
                    f17 = -1.0f;
                }
                canvas.translate(((scrollX + ceil) - getPaddingRight()) + u8Var.f228543o, compoundPaddingTop + scrollY + ((i29 - u8Var.f228541m) / 2) + u8Var.f228544p);
                u8Var.f228533e.draw(canvas);
                canvas.restore();
            }
            if (this.H && u8Var.f228530b != null) {
                canvas.save();
                canvas.translate(scrollX + compoundPaddingLeft + ((i37 - u8Var.f228538j) / 2), getPaddingTop() + scrollY);
                u8Var.f228530b.draw(canvas);
                canvas.restore();
            }
            if (this.I && u8Var.f228531c != null) {
                canvas.save();
                canvas.translate(scrollX + compoundPaddingLeft + ((i37 - u8Var.f228539k) / 2), (((scrollY + bottom) - top) - getPaddingBottom()) - u8Var.f228535g);
                u8Var.f228531c.draw(canvas);
                canvas.restore();
            }
        } else {
            i17 = compoundPaddingRight;
            i18 = height;
            f17 = -1.0f;
        }
        textPaint.setColor(this.f197667e);
        textPaint.drawableState = getDrawableState();
        canvas.save();
        int extendedPaddingTop = getExtendedPaddingTop();
        canvas.clipRect(compoundPaddingLeft + scrollX, extendedPaddingTop + scrollY, ((right - left) - i17) + scrollX, ((bottom - top) - getExtendedPaddingBottom()) + scrollY);
        if ((this.f197675p & 112) != 48) {
            i27 = b(false);
            i19 = b(true);
        } else {
            i19 = 0;
            i27 = 0;
        }
        canvas.translate(compoundPaddingLeft, extendedPaddingTop + i27);
        if (this.f197685z) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = this.B;
            int i38 = fontMetricsInt.bottom;
            int i39 = fontMetricsInt.top;
            float f18 = ((i18 - (i38 - i39)) / 2) - i39;
            int i47 = this.f197675p;
            if ((i47 & 7) != 3) {
                int i48 = i47 & 7;
                if (i48 == 1) {
                    if (f17 == -1.0f) {
                        java.lang.CharSequence charSequence2 = this.mText;
                        f17 = textPaint.measureText(charSequence2, 0, charSequence2.length());
                    }
                    i28 = ((int) ((width - getPaddingRight()) - f17)) / 2;
                } else if (i48 == 5) {
                    if (f17 == -1.0f) {
                        java.lang.CharSequence charSequence3 = this.mText;
                        f17 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                    }
                    i28 = (int) ((width - getPaddingRight()) - f17);
                }
                java.lang.CharSequence charSequence4 = this.mText;
                canvas.drawText(charSequence4, 0, charSequence4.length(), i28, f18, textPaint);
            }
            i28 = 0;
            java.lang.CharSequence charSequence42 = this.mText;
            canvas.drawText(charSequence42, 0, charSequence42.length(), i28, f18, textPaint);
        } else {
            if (this.f197674o == null) {
                a();
            }
            try {
                this.f197674o.draw(canvas, null, null, i19 - i27);
            } catch (java.lang.IndexOutOfBoundsException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("TextView", e17, "", new java.lang.Object[0]);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        java.lang.CharSequence contentDescription = getContentDescription();
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = getText();
        }
        accessibilityNodeInfo.setText(contentDescription);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        db5.v8 v8Var;
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.C || getMeasuredWidth() <= 0) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.L) || (v8Var = this.P) == null) {
            setText(android.text.TextUtils.ellipsize(this.mText, getPaint(), (getMeasuredWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft(), android.text.TextUtils.TruncateAt.END));
        } else {
            java.lang.CharSequence a17 = v8Var.a(this, this.mText, this.L, this.M, this.N);
            this.L = null;
            setText(a17);
        }
        this.C = false;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View.MeasureSpec.getMode(i17);
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (size == 0) {
            setMeasuredDimension(size, this.A);
            return;
        }
        if (this.f197685z) {
            if (this.A == 0) {
                e();
            }
            setMeasuredDimension(size, this.A);
            return;
        }
        android.text.BoringLayout.Metrics metrics = Q;
        int compoundPaddingLeft = getCompoundPaddingLeft() + getCompoundPaddingRight();
        int i19 = this.f197682w ? this.f197681v - compoundPaddingLeft : size - compoundPaddingLeft;
        android.text.Layout layout = this.f197674o;
        if (layout == null) {
            c(i19, metrics, metrics, i19, false);
        } else {
            if (layout.getWidth() != i19) {
                c(i19, metrics, metrics, i19, false);
            }
        }
        if (mode != 1073741824) {
            int desiredHeight = getDesiredHeight();
            size2 = mode == Integer.MIN_VALUE ? java.lang.Math.min(desiredHeight, size2) : desiredHeight;
        }
        scrollTo(0, 0);
        setMeasuredDimension(size, size2);
    }

    public void setCompoundDrawablePadding(int i17) {
        db5.u8 u8Var = this.E;
        if (i17 != 0) {
            if (u8Var == null) {
                u8Var = new db5.u8(this);
                this.E = u8Var;
            }
            u8Var.f228542n = i17;
        } else if (u8Var != null) {
            u8Var.f228542n = i17;
        }
        invalidate();
        requestLayout();
    }

    public void setCompoundLeftDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        db5.u8 u8Var = this.E;
        if (u8Var == null || u8Var.f228532d != drawable) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            f(drawable, null, null, null);
        }
    }

    public void setCompoundRightDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        db5.u8 u8Var = this.E;
        if (u8Var == null || u8Var.f228533e != drawable) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            f(null, null, drawable, null);
        }
    }

    public void setDrawDownDrawable(boolean z17) {
        if (this.I != z17) {
            invalidate();
        }
        this.I = z17;
    }

    public void setDrawLeftDrawable(boolean z17) {
        if (this.F != z17) {
            invalidate();
        }
        this.F = z17;
    }

    public void setDrawRightDrawable(boolean z17) {
        if (this.G != z17) {
            invalidate();
        }
        this.G = z17;
    }

    public void setDrawTopDrawable(boolean z17) {
        if (this.H != z17) {
            invalidate();
        }
        this.H = z17;
    }

    public void setDrawableLeftPadding(int i17) {
        db5.u8 u8Var = this.E;
        if (u8Var == null || i17 == 0) {
            return;
        }
        u8Var.f228543o = i17;
    }

    public void setDrawableTopPadding(int i17) {
        db5.u8 u8Var = this.E;
        if (u8Var == null || i17 == 0) {
            return;
        }
        u8Var.f228544p = i17;
    }

    public final void setEditableFactory(android.text.Editable.Factory factory) {
        this.f197668f = factory;
        setText(this.mText);
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.f197670h = truncateAt;
        if (this.f197674o != null) {
            d();
            requestLayout();
            invalidate();
        }
    }

    public void setEllipsizeLater(boolean z17) {
        this.C = z17;
    }

    public void setGravity(int i17) {
        if ((i17 & 7) == 0) {
            i17 |= 3;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        int i18 = i17 & 7;
        int i19 = this.f197675p;
        boolean z17 = i18 != (i19 & 7);
        if (i17 != i19) {
            invalidate();
        }
        this.f197675p = i17;
        android.text.Layout layout = this.f197674o;
        if (layout == null || !z17) {
            return;
        }
        int width = layout.getWidth();
        android.text.BoringLayout.Metrics metrics = Q;
        c(width, metrics, metrics, (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight(), true);
    }

    public void setHeight(int i17) {
        this.f197679t = i17;
        this.f197677r = i17;
        this.f197680u = 2;
        this.f197678s = 2;
        requestLayout();
        invalidate();
    }

    public void setIncludeFontPadding(boolean z17) {
        this.f197683x = z17;
        if (this.f197674o != null) {
            d();
            requestLayout();
            invalidate();
        }
    }

    public void setLayoutCallback(db5.v8 v8Var) {
        this.P = v8Var;
    }

    public void setLines(int i17) {
        this.f197679t = i17;
        this.f197677r = i17;
        this.f197680u = 1;
        this.f197678s = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxHeight(int i17) {
        this.f197677r = i17;
        this.f197678s = 2;
        requestLayout();
        invalidate();
    }

    public void setMaxLines(int i17) {
        this.f197677r = i17;
        this.f197678s = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i17) {
        this.f197681v = i17;
        this.f197682w = true;
        requestLayout();
        invalidate();
    }

    public void setMinHeight(int i17) {
        this.f197679t = i17;
        this.f197680u = 2;
        requestLayout();
        invalidate();
    }

    public void setMinLines(int i17) {
        this.f197679t = i17;
        this.f197680u = 1;
        requestLayout();
        invalidate();
    }

    public void setMinWidth(int i17) {
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingLeft() || i19 != getPaddingRight() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            d();
        }
        super.setPadding(i17, i18, i19, i27);
        invalidate();
    }

    public void setPaintFlags(int i17) {
        android.text.TextPaint textPaint = this.f197673n;
        if (textPaint.getFlags() != i17) {
            textPaint.setFlags(i17);
            if (this.f197674o != null) {
                d();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setShouldEllipsize(boolean z17) {
        this.D = z17;
    }

    public void setSingleLine(boolean z17) {
        if (z17) {
            setLines(1);
        } else {
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    public final void setSpannableFactory(android.text.Spannable.Factory factory) {
        this.f197669g = factory;
        setText(this.mText);
    }

    public final void setText(java.lang.CharSequence charSequence) {
        h(charSequence, this.f197672m);
    }

    public void setTextColor(int i17) {
        this.f197666d = android.content.res.ColorStateList.valueOf(i17);
        j();
    }

    public final void setTextKeepState(java.lang.CharSequence charSequence) {
        db5.t8 t8Var = this.f197672m;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int length = charSequence.length();
        h(charSequence, t8Var);
        if (selectionStart >= 0 || selectionEnd >= 0) {
            java.lang.CharSequence charSequence2 = this.mText;
            if (charSequence2 instanceof android.text.Spannable) {
                android.text.Selection.setSelection((android.text.Spannable) charSequence2, java.lang.Math.max(0, java.lang.Math.min(selectionStart, length)), java.lang.Math.max(0, java.lang.Math.min(selectionEnd, length)));
            }
        }
    }

    public void setTextSize(float f17) {
        i(2, f17);
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.f197673n;
        if (textPaint.getTypeface() != typeface) {
            textPaint.setTypeface(typeface);
            if (this.f197674o != null) {
                d();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setWidth(int i17) {
        this.f197681v = i17;
        this.f197682w = true;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        db5.u8 u8Var;
        boolean verifyDrawable = super.verifyDrawable(drawable);
        return (verifyDrawable || (u8Var = this.E) == null) ? verifyDrawable : drawable == u8Var.f228532d || drawable == u8Var.f228530b || drawable == u8Var.f228533e || drawable == u8Var.f228531c;
    }

    public final void setText(int i17) {
        setText(getContext().getResources().getText(i17));
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        colorStateList.getClass();
        if (this.f197666d == colorStateList) {
            return;
        }
        this.f197666d = colorStateList;
        j();
    }

    public void setCompoundLeftDrawablesWithIntrinsicBounds(int i17) {
        if (i17 != this.f197665J) {
            this.f197665J = i17;
            setCompoundLeftDrawablesWithIntrinsicBounds(getResources().getDrawable(i17));
        }
    }

    public void setCompoundRightDrawablesWithIntrinsicBounds(int i17) {
        if (i17 != this.K) {
            this.K = i17;
            setCompoundRightDrawablesWithIntrinsicBounds(getResources().getDrawable(i17));
        }
    }
}
