package com.tencent.mm.ui.widget.progress;

/* loaded from: classes4.dex */
public class RoundProgressBtn extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f212393d;

    /* renamed from: e, reason: collision with root package name */
    public int f212394e;

    /* renamed from: f, reason: collision with root package name */
    public float f212395f;

    /* renamed from: g, reason: collision with root package name */
    public int f212396g;

    /* renamed from: h, reason: collision with root package name */
    public float f212397h;

    /* renamed from: i, reason: collision with root package name */
    public int f212398i;

    /* renamed from: m, reason: collision with root package name */
    public int f212399m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f212400n;

    /* renamed from: o, reason: collision with root package name */
    public int f212401o;

    /* renamed from: p, reason: collision with root package name */
    public int f212402p;

    /* renamed from: q, reason: collision with root package name */
    public int f212403q;

    public RoundProgressBtn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212402p = 0;
        this.f212403q = 0;
        com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479646bl);
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f212393d = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463113t, i17, 0);
            this.f212394e = obtainStyledAttributes.getColor(5, getContext().getResources().getColor(com.tencent.mm.R.color.a3d));
            this.f212395f = obtainStyledAttributes.getDimension(6, 0.0f);
            this.f212396g = obtainStyledAttributes.getColor(3, getContext().getResources().getColor(com.tencent.mm.R.color.aaq));
            this.f212397h = obtainStyledAttributes.getDimension(4, this.f212395f);
            this.f212398i = obtainStyledAttributes.getInt(1, 100);
            this.f212401o = obtainStyledAttributes.getInt(2, 0);
            this.f212399m = obtainStyledAttributes.getInt(7, -90);
            this.f212400n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.f212401o;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        if (this.f212395f == 0.0f) {
            this.f212395f = (int) ((getWidth() / 2) * 0.167d);
        }
        float f17 = this.f212395f;
        this.f212397h = f17;
        this.f212402p = (int) f17;
        float f18 = width;
        this.f212403q = (int) (0.667f * f18);
        int i17 = (int) (f18 - (f17 / 2.0f));
        this.f212393d.setStrokeWidth(f17);
        this.f212393d.setColor(this.f212394e);
        this.f212393d.setAntiAlias(true);
        this.f212393d.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f18, f18, i17, this.f212393d);
        this.f212393d.setStrokeWidth(this.f212397h);
        this.f212393d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f212393d.setColor(this.f212396g);
        float f19 = width - i17;
        float f27 = i17 + width;
        canvas.drawArc(new android.graphics.RectF(f19, f19, f27, f27), this.f212399m, (this.f212401o * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / this.f212398i, false, this.f212393d);
        this.f212393d.setStrokeWidth(0.0f);
        this.f212393d.setStyle(android.graphics.Paint.Style.FILL);
        if (this.f212400n) {
            float f28 = this.f212395f;
            int i18 = this.f212403q;
            canvas.drawRect(f18 - (f28 * 1.5f), width - (i18 / 2), f18 - (f28 * 0.5f), (i18 / 2) + width, this.f212393d);
            int i19 = this.f212402p;
            int i27 = this.f212403q;
            canvas.drawRect(f18 + (i19 * 0.5f), width - (i27 / 2), f18 + (i19 * 1.5f), width + (i27 / 2), this.f212393d);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(((this.f212401o * 100) / this.f212398i) + "%");
    }

    public void setHasPause(boolean z17) {
        this.f212400n = z17;
        invalidate();
    }

    public void setProgress(int i17) {
        this.f212401o = java.lang.Math.max(0, i17);
        this.f212401o = java.lang.Math.min(i17, this.f212398i);
        invalidate();
    }

    public void setProgressColor(int i17) {
        this.f212396g = i17;
    }

    public RoundProgressBtn(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212402p = 0;
        this.f212403q = 0;
        com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479646bl);
        a(context, attributeSet, i17);
    }
}
