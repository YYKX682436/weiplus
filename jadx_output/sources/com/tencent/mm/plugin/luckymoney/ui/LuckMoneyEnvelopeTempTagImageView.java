package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes4.dex */
public class LuckMoneyEnvelopeTempTagImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f145944d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f145945e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145946f;

    public LuckMoneyEnvelopeTempTagImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f145944d = paint;
        this.f145945e = new android.graphics.Path();
        this.f145946f = "";
        paint.setAntiAlias(true);
        a(context, attributeSet, -1);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188579b, i17, 0);
        this.f145946f = obtainStyledAttributes.getString(0);
        int color = obtainStyledAttributes.getColor(1, 0);
        android.graphics.Paint paint = this.f145944d;
        paint.setColor(color);
        paint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Path path = this.f145945e;
        path.moveTo(0.0f, 0.0f);
        float b17 = i65.a.b(getContext(), 98);
        path.lineTo(b17, b17);
        float b18 = i65.a.b(getContext(), 139);
        canvas.drawTextOnPath(this.f145946f, path, (int) ((b18 - r5.measureText(this.f145946f)) / 2.0f), -30.0f, this.f145944d);
    }

    public LuckMoneyEnvelopeTempTagImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f145944d = paint;
        this.f145945e = new android.graphics.Path();
        this.f145946f = "";
        paint.setAntiAlias(true);
        a(context, attributeSet, i17);
    }
}
