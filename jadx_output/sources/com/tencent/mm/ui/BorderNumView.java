package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class BorderNumView extends android.view.View {

    /* renamed from: g, reason: collision with root package name */
    public static int f196607g = 22;

    /* renamed from: h, reason: collision with root package name */
    public static int f196608h = 100;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f196609d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f196610e;

    /* renamed from: f, reason: collision with root package name */
    public int f196611f;

    public BorderNumView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196609d = null;
        this.f196611f = 100;
        this.f196609d = context;
        this.f196610e = new android.graphics.Paint();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i17 = this.f196611f;
        if (i17 < 100) {
            f196607g += 15;
        }
        if (i17 >= 1000) {
            f196608h -= 20;
        }
        float f17 = f196607g;
        android.content.Context context = this.f196609d;
        float d17 = com.tencent.mm.sdk.platformtools.j.d(context, f17);
        float d18 = com.tencent.mm.sdk.platformtools.j.d(context, 105);
        java.lang.String str = this.f196611f + "";
        this.f196610e.setAntiAlias(true);
        this.f196610e.setTextSize(f196608h);
        this.f196610e.setColor(-11491572);
        this.f196610e.setStyle(android.graphics.Paint.Style.STROKE);
        this.f196610e.setStrokeWidth(8.0f);
        canvas.drawText(str, d17, d18, this.f196610e);
        this.f196610e.setTextSize(f196608h);
        this.f196610e.setColor(-1770573);
        this.f196610e.setStyle(android.graphics.Paint.Style.FILL);
        this.f196610e.setStrokeWidth(8.0f);
        canvas.drawText(str, d17, d18, this.f196610e);
    }

    public void setPaintNum(int i17) {
        this.f196611f = i17;
    }

    public BorderNumView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196609d = null;
        this.f196611f = 100;
        this.f196609d = context;
        this.f196610e = new android.graphics.Paint();
    }
}
