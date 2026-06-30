package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsTextProgressBar extends android.widget.ProgressBar {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f170916d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f170917e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f170918f;

    /* renamed from: g, reason: collision with root package name */
    public int f170919g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f170920h;

    public SnsTextProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170918f = context;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n34.w2.f334766c, 0, 0);
        try {
            setTextSize(obtainStyledAttributes.getInteger(0, 18));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void setText(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f170916d = java.lang.String.valueOf(i17) + "%";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        int color;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        super.onDraw(canvas);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f170917e = paint;
        paint.setAntiAlias(true);
        java.lang.String str = this.f170920h;
        if (str != null && str.length() > 0) {
            color = android.graphics.Color.parseColor(this.f170920h);
            this.f170917e.setColor(color);
            this.f170917e.setTextSize(this.f170919g);
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Paint paint2 = this.f170917e;
            java.lang.String str2 = this.f170916d;
            paint2.getTextBounds(str2, 0, str2.length(), rect);
            canvas.drawText(this.f170916d, (getWidth() / 2) - rect.centerX(), (getHeight() / 2) - rect.centerY(), this.f170917e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        }
        color = this.f170918f.getResources().getColor(com.tencent.mm.R.color.f479551ab2);
        this.f170917e.setColor(color);
        this.f170917e.setTextSize(this.f170919g);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.graphics.Paint paint22 = this.f170917e;
        java.lang.String str22 = this.f170916d;
        paint22.getTextBounds(str22, 0, str22.length(), rect2);
        canvas.drawText(this.f170916d, (getWidth() / 2) - rect2.centerX(), (getHeight() / 2) - rect2.centerY(), this.f170917e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    public void setPaintColor(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f170920h = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        setText(i17);
        super.setProgress(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    public void setTextSize(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f170919g = i65.a.b(this.f170918f, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }
}
