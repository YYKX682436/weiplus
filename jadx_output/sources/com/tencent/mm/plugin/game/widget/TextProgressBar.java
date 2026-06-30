package com.tencent.mm.plugin.game.widget;

/* loaded from: classes4.dex */
public class TextProgressBar extends android.widget.ProgressBar {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141962d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f141963e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f141964f;

    /* renamed from: g, reason: collision with root package name */
    public int f141965g;

    /* renamed from: h, reason: collision with root package name */
    public int f141966h;

    public TextProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141964f = context;
    }

    private void setText(int i17) {
        this.f141965g = i17;
        this.f141962d = java.lang.String.valueOf(i17) + "%";
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f141963e = paint;
        paint.setAntiAlias(true);
        this.f141963e.setColor(android.graphics.Color.rgb(69, 192, 26));
        this.f141963e.setTextSize(this.f141966h);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint2 = this.f141963e;
        java.lang.String str = this.f141962d;
        paint2.getTextBounds(str, 0, str.length(), rect);
        float width = (getWidth() / 2) - rect.centerX();
        float height = (getHeight() / 2) - rect.centerY();
        canvas.drawText(this.f141962d, width, height, this.f141963e);
        float width2 = (this.f141965g / 100.0f) * getWidth();
        if (width2 > width) {
            android.graphics.Paint paint3 = new android.graphics.Paint();
            paint3.setColor(-1);
            paint3.setAntiAlias(true);
            paint3.setTextSize(this.f141966h);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width2, getHeight());
            canvas.save();
            canvas.clipRect(rectF);
            canvas.drawText(this.f141962d, width, height, paint3);
            canvas.restore();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i17) {
        setText(i17);
        super.setProgress(i17);
    }

    public void setTextSize(int i17) {
        this.f141966h = i65.a.b(this.f141964f, i17);
    }
}
