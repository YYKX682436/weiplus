package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class TabIconView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f197097d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f197098e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f197099f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f197100g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f197101h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f197102i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f197103m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f197104n;

    /* renamed from: o, reason: collision with root package name */
    public int f197105o;

    /* renamed from: p, reason: collision with root package name */
    public float f197106p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f197107q;

    public TabIconView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197105o = 0;
        this.f197106p = 1.1666666f;
        this.f197107q = context;
    }

    public void a(int i17, int i18, int i19, boolean z17) {
        if (z17) {
            this.f197106p *= 1.2f;
        }
        this.f197097d = com.tencent.mm.sdk.platformtools.x.d0(i17, this.f197106p);
        this.f197098e = com.tencent.mm.sdk.platformtools.x.d0(i19, this.f197106p);
        this.f197099f = com.tencent.mm.sdk.platformtools.x.d0(i18, this.f197106p);
        if (this.f197097d != null) {
            this.f197100g = new android.graphics.Rect(0, 0, this.f197097d.getWidth(), this.f197097d.getHeight());
        }
        if (this.f197098e != null) {
            this.f197101h = new android.graphics.Rect(0, 0, this.f197098e.getWidth(), this.f197098e.getHeight());
        }
        if (this.f197099f != null) {
            this.f197102i = new android.graphics.Rect(0, 0, this.f197099f.getWidth(), this.f197099f.getHeight());
        }
        this.f197103m = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f197104n = paint;
        android.content.Context context = this.f197107q;
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.tencent.mm.R.color.FG_0), android.graphics.PorterDuff.Mode.SRC_ATOP));
        this.f197103m.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.tencent.mm.R.color.aaq), android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f197103m;
        if (paint == null) {
            return;
        }
        int i17 = this.f197105o;
        if (i17 < 128) {
            this.f197104n.setAlpha(255 - i17);
            canvas.drawBitmap(this.f197098e, (android.graphics.Rect) null, this.f197101h, this.f197104n);
            this.f197103m.setAlpha(this.f197105o);
            canvas.drawBitmap(this.f197099f, (android.graphics.Rect) null, this.f197102i, this.f197103m);
            return;
        }
        paint.setAlpha(255 - i17);
        canvas.drawBitmap(this.f197099f, (android.graphics.Rect) null, this.f197102i, this.f197103m);
        this.f197103m.setAlpha(this.f197105o);
        canvas.drawBitmap(this.f197097d, (android.graphics.Rect) null, this.f197100g, this.f197103m);
    }

    public void setFocusAlpha(int i17) {
        this.f197105o = i17;
        invalidate();
    }

    public TabIconView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197105o = 0;
        this.f197106p = 1.1666666f;
        this.f197107q = context;
    }
}
