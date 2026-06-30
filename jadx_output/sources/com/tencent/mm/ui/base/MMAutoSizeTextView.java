package com.tencent.mm.ui.base;

/* loaded from: classes4.dex */
public class MMAutoSizeTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public float f197311d;

    /* renamed from: e, reason: collision with root package name */
    public float f197312e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f197313f;

    /* renamed from: g, reason: collision with root package name */
    public float f197314g;

    public MMAutoSizeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }

    public final void a(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoSizeTextView", "autoAdjustTextSize[text=%s, viewWidth=%d]", str, java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            return;
        }
        int paddingLeft = (i17 - getPaddingLeft()) - getPaddingRight();
        float textSize = getTextSize();
        this.f197314g = textSize;
        if (textSize <= this.f197311d) {
            this.f197314g = this.f197312e;
        }
        float f17 = this.f197314g;
        this.f197313f.setTextSize(f17);
        while (true) {
            if (f17 <= this.f197311d || this.f197313f.measureText(str) <= paddingLeft) {
                break;
            }
            f17 -= 1.0f;
            float f18 = this.f197311d;
            if (f17 <= f18) {
                f17 = f18;
                break;
            }
            this.f197313f.setTextSize(f17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoSizeTextView", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.f197314g), java.lang.Float.valueOf(this.f197313f.measureText(str)), java.lang.Integer.valueOf(paddingLeft));
        setTextSize(0, f17);
    }

    public final void b() {
        setSingleLine();
        setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f197311d = i65.a.b(getContext(), 8);
        this.f197312e = i65.a.b(getContext(), 22);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f197313f = paint;
        paint.set(getPaint());
        float textSize = getTextSize();
        this.f197314g = textSize;
        if (textSize <= this.f197311d) {
            this.f197314g = this.f197312e;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAutoSizeTextView", th6, "", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAutoSizeTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAutoSizeTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoSizeTextView", "on size changed");
        if (i17 != i19) {
            a(getText().toString(), i17);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoSizeTextView", "on text changed");
        super.onTextChanged(charSequence, i17, i18, i19);
        a(charSequence.toString(), getWidth());
    }

    public MMAutoSizeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
