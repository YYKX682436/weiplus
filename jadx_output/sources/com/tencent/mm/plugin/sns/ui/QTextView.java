package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes13.dex */
public class QTextView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f166583d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f166584e;

    /* renamed from: f, reason: collision with root package name */
    public int f166585f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166586g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166587h;

    /* renamed from: i, reason: collision with root package name */
    public int f166588i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f166589m;

    /* renamed from: n, reason: collision with root package name */
    public int f166590n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166591o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166592p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.b8 f166593q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.b8 f166594r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f166595s;

    /* renamed from: t, reason: collision with root package name */
    public int f166596t;

    /* renamed from: u, reason: collision with root package name */
    public int f166597u;

    static {
        new java.util.HashMap();
    }

    public QTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166584e = "";
        this.f166596t = -1;
        this.f166597u = 0;
        this.f166595s = context;
        b();
    }

    public final int a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("breakWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        if (this.f166592p) {
            com.tencent.mm.plugin.sns.ui.b8 b8Var = this.f166593q;
            int i18 = com.tencent.mm.plugin.sns.ui.b8.f167896h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            java.lang.String str = b8Var.f167903g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.ui.b8 b8Var2 = this.f166593q;
                java.lang.String str2 = this.f166584e;
                int paddingLeft = (i17 - getPaddingLeft()) - getPaddingRight();
                android.text.TextPaint textPaint = this.f166583d;
                b8Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("breakText", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                int a17 = b8Var2.a(str2, null, null, -1, paddingLeft, textPaint);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("breakText", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                this.f166597u = a17;
            }
        } else {
            com.tencent.mm.plugin.sns.ui.b8 b8Var3 = this.f166594r;
            int i19 = com.tencent.mm.plugin.sns.ui.b8.f167896h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            java.lang.String str3 = b8Var3.f167903g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                this.f166597u = this.f166594r.a(this.f166584e, this.f166586g, this.f166587h, this.f166588i, (i17 - getPaddingLeft()) - getPaddingRight(), this.f166583d);
            }
        }
        int paddingLeft2 = this.f166597u + getPaddingLeft() + getPaddingRight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("breakWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        return paddingLeft2;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166592p = false;
        this.f166589m = true;
        this.f166591o = false;
        this.f166588i = -1;
        this.f166586g = "...";
        this.f166587h = "";
        this.f166590n = -16776961;
        this.f166593q = new com.tencent.mm.plugin.sns.ui.b8();
        this.f166594r = new com.tencent.mm.plugin.sns.ui.b8();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f166583d = textPaint;
        textPaint.setAntiAlias(true);
        if (this.f166596t == -1) {
            int d17 = com.tencent.mm.sdk.platformtools.j.d(this.f166595s, 12.0f);
            this.f166596t = d17;
            this.f166583d.setTextSize(d17);
        } else {
            this.f166583d.setTextSize(13.0f);
        }
        this.f166583d.setColor(-16777216);
        this.f166583d.setTextAlign(android.graphics.Paint.Align.LEFT);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public boolean getIsExpanded() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIsExpanded", "com.tencent.mm.plugin.sns.ui.QTextView");
        boolean z17 = this.f166592p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIsExpanded", "com.tencent.mm.plugin.sns.ui.QTextView");
        return z17;
    }

    public java.lang.String getText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getText", "com.tencent.mm.plugin.sns.ui.QTextView");
        java.lang.String str = this.f166584e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getText", "com.tencent.mm.plugin.sns.ui.QTextView");
        return str;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.b8 b8Var;
        java.util.List b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.QTextView");
        super.onDraw(canvas);
        if (this.f166592p) {
            b8Var = this.f166593q;
            b17 = b8Var.b();
        } else {
            b8Var = this.f166594r;
            b17 = b8Var.b();
        }
        com.tencent.mm.plugin.sns.ui.b8 b8Var2 = b8Var;
        java.util.List list = b17;
        float paddingLeft = getPaddingLeft();
        char c17 = 0;
        float paddingTop = getPaddingTop() + (-this.f166585f);
        int i17 = 0;
        while (i17 < list.size()) {
            int[] iArr = (int[]) list.get(i17);
            int i18 = i17;
            canvas.drawText(this.f166584e, iArr[c17], iArr[1] + 1, paddingLeft, paddingTop, (android.graphics.Paint) this.f166583d);
            if (i18 == list.size() - 1) {
                b8Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequiredEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                boolean z17 = b8Var2.f167897a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequiredEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                if (z17) {
                    java.lang.String str = this.f166586g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLengthLastEllipsizedLine", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                    float f17 = b8Var2.f167899c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLengthLastEllipsizedLine", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                    canvas.drawText(str, f17 + paddingLeft, paddingTop, this.f166583d);
                    if (this.f166589m) {
                        int color = this.f166583d.getColor();
                        this.f166583d.setColor(this.f166590n);
                        if (this.f166591o) {
                            java.lang.String str2 = this.f166587h;
                            float width = canvas.getWidth();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLengthEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            float f18 = b8Var2.f167901e;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLengthEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            canvas.drawText(str2, width - ((f18 + getPaddingRight()) + getPaddingLeft()), paddingTop, this.f166583d);
                        } else {
                            java.lang.String str3 = this.f166587h;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLengthLastEllipsizedLinePlusEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            float f19 = b8Var2.f167899c + b8Var2.f167900d;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLengthLastEllipsizedLinePlusEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            canvas.drawText(str3, f19 + paddingLeft, paddingTop, this.f166583d);
                        }
                        this.f166583d.setColor(color);
                    }
                }
            }
            paddingTop += (-this.f166585f) + this.f166583d.descent();
            if (paddingTop > canvas.getHeight()) {
                break;
            }
            i17 = i18 + 1;
            c17 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.QTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == 1073741824) {
            a(size);
        } else if (mode == Integer.MIN_VALUE) {
            size = java.lang.Math.min(a(size), size);
        } else {
            a(size);
            size = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureHeight", "com.tencent.mm.plugin.sns.ui.QTextView");
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        this.f166585f = (int) this.f166583d.ascent();
        if (mode2 != 1073741824) {
            int size3 = ((this.f166592p ? ((java.util.ArrayList) this.f166593q.b()).size() : ((java.util.ArrayList) this.f166594r.b()).size()) * ((int) ((-this.f166585f) + this.f166583d.descent()))) + getPaddingTop() + getPaddingBottom();
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(size3, size2) : size3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureHeight", "com.tencent.mm.plugin.sns.ui.QTextView");
        setMeasuredDimension(size, size2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setColorEllpsizeMore(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setColorEllpsizeMore", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166590n = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setColorEllpsizeMore", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setDrawEllipsizeMoreString(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDrawEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166589m = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDrawEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setEllipsis(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166586g = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setEllipsisMore(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166587h = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setMaxLines(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxLines", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166588i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxLines", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setRightAlignEllipsizeMoreString(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRightAlignEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166591o = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRightAlignEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setText(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.QTextView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166584e)) {
            this.f166584e = "";
        }
        this.f166584e = str;
        com.tencent.mm.plugin.sns.ui.b8 b8Var = this.f166593q;
        int i17 = com.tencent.mm.plugin.sns.ui.b8.f167896h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        b8Var.f167903g = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        com.tencent.mm.plugin.sns.ui.b8 b8Var2 = this.f166594r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        b8Var2.f167903g = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        requestLayout();
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setTextColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166583d.setColor(i17);
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setTextSize(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f166583d.setTextSize(i17);
        requestLayout();
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public QTextView(android.content.Context context) {
        super(context);
        this.f166584e = "";
        this.f166596t = -1;
        this.f166597u = 0;
        this.f166595s = context;
        b();
    }
}
