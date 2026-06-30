package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class CustomFitTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f210031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f210032e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f210033f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f210034g;

    /* renamed from: h, reason: collision with root package name */
    public int f210035h;

    /* renamed from: i, reason: collision with root package name */
    public int f210036i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f210037m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210038n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f210039o;

    /* renamed from: p, reason: collision with root package name */
    public int f210040p;

    public CustomFitTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210033f = new android.graphics.Rect();
        this.f210034g = new java.util.LinkedList();
        this.f210039o = true;
        this.f210040p = 0;
    }

    public final int a() {
        android.graphics.Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        java.util.LinkedList linkedList = this.f210034g;
        return ((int) ((linkedList.size() * ((fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading)) + getPaddingTop() + getPaddingBottom())) + (java.lang.Math.max(0, linkedList.size() - 1) * this.f210040p);
    }

    public final int b(java.lang.String str, int i17, int i18, int i19, int i27) {
        if (i18 <= i17) {
            return i17 + 1;
        }
        float f17 = i19;
        float f18 = i27;
        if (getPaint().measureText(str, i17, i18) + f17 < f18) {
            return i18;
        }
        int length = str.length();
        while (getPaint().measureText(str, i17, i18) + f17 > f18) {
            i18 = (i18 + i17) >> 1;
        }
        while (i18 <= length && getPaint().measureText(str, i17, i18) + f17 < f18) {
            i18++;
        }
        int min = java.lang.Math.min(length, i18) - 1;
        int i28 = min;
        while (i28 >= 0 && com.tencent.mm.sdk.platformtools.t8.y0(str.charAt(i28))) {
            i28--;
        }
        return (i28 < 0 || i28 == min) ? i18 - 1 : i28 + 1;
    }

    public final boolean c(java.lang.String str, int i17) {
        if (!this.f210039o || i17 <= 0 || str == null || "".equals(str)) {
            return false;
        }
        java.util.LinkedList linkedList = this.f210034g;
        linkedList.clear();
        int length = str.length();
        int paddingLeft = (i17 - getPaddingLeft()) - getPaddingRight();
        int intrinsicWidth = this.f210038n ? this.f210037m.getIntrinsicWidth() : 0;
        float measureText = getPaint().measureText(str, 0, length) + intrinsicWidth;
        int i18 = this.f210035h;
        if (java.lang.Float.compare(measureText, i18 * paddingLeft) < 0) {
            i18 = (int) java.lang.Math.ceil(measureText / paddingLeft);
        }
        int i19 = i18;
        int i27 = 0;
        for (int i28 = 0; i28 < i19; i28++) {
            if (i28 == i19 - 1) {
                java.lang.String trim = str.substring(i27, b(str, i27, length, intrinsicWidth, paddingLeft)).trim();
                if (linkedList != null && trim != null && !"".equals(trim)) {
                    linkedList.add(trim);
                }
            } else {
                int b17 = b(str, i27, length, 0, paddingLeft);
                java.lang.String trim2 = str.substring(i27, b17).trim();
                if (linkedList != null && trim2 != null && !"".equals(trim2)) {
                    linkedList.add(trim2);
                }
                if (b17 >= length) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CustomFitTextView", "not match last line, but match text length end");
                    return true;
                }
                i27 = b17;
            }
        }
        return true;
    }

    public void d(java.lang.String str, int i17, boolean z17, int i18, int i19) {
        this.f210035h = i17;
        this.f210032e = str;
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CustomFitTextView", "ori text is null");
            this.f210032e = "";
        }
        if (this.f210035h <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CustomFitTextView", "maxLines is invalid");
            this.f210035h = 2;
        }
        this.f210040p = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
        this.f210038n = z17;
        this.f210036i = i18;
        if (z17) {
            this.f210037m = getResources().getDrawable(this.f210036i);
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f210031d = paint;
        paint.set(getPaint());
        this.f210031d.setAntiAlias(true);
        this.f210031d.setColor(i19);
        c(this.f210032e, getWidth());
        setHeight(java.lang.Math.max(a(), i65.a.b(getContext(), 32)));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        if (!this.f210039o || (str = this.f210032e) == null || "".equals(str)) {
            return;
        }
        java.util.LinkedList linkedList = this.f210034g;
        if (linkedList.size() == 0) {
            return;
        }
        android.graphics.Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f17 = fontMetrics.descent - fontMetrics.ascent;
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            paddingTop += fontMetrics.leading + f17;
            canvas.drawText(str2, paddingLeft, paddingTop, this.f210031d);
        }
        if (this.f210038n) {
            android.text.TextPaint paint = getPaint();
            java.lang.String str3 = (java.lang.String) linkedList.getLast();
            int length = ((java.lang.String) linkedList.getLast()).length();
            android.graphics.Rect rect = this.f210033f;
            paint.getTextBounds(str3, 0, length, rect);
            int paddingLeft2 = getPaddingLeft() + rect.right;
            int intrinsicWidth = this.f210037m.getIntrinsicWidth() + paddingLeft2;
            int i17 = (int) ((paddingTop - f17) - fontMetrics.leading);
            this.f210037m.setBounds(paddingLeft2, i17, intrinsicWidth, this.f210037m.getIntrinsicHeight() + i17);
            this.f210037m.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int b17 = i65.a.b(getContext(), 32);
        if (c(this.f210032e, size)) {
            b17 = java.lang.Math.max(a(), b17);
        }
        setMeasuredDimension(size, b17);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        boolean z17 = (i17 == i19 && i18 == i27) ? false : true;
        this.f210039o = z17;
        if (z17) {
            c(this.f210032e, i17);
        }
    }

    public CustomFitTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f210033f = new android.graphics.Rect();
        this.f210034g = new java.util.LinkedList();
        this.f210039o = true;
        this.f210040p = 0;
    }
}
