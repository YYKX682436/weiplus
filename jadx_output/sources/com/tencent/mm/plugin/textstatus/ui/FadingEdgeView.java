package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes2.dex */
public class FadingEdgeView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f173425d;

    /* renamed from: e, reason: collision with root package name */
    public int f173426e;

    /* renamed from: f, reason: collision with root package name */
    public float f173427f;

    /* renamed from: g, reason: collision with root package name */
    public final int f173428g;

    /* renamed from: h, reason: collision with root package name */
    public final int f173429h;

    /* renamed from: i, reason: collision with root package name */
    public final int f173430i;

    /* renamed from: m, reason: collision with root package name */
    public final int f173431m;

    /* renamed from: n, reason: collision with root package name */
    public int f173432n;

    /* renamed from: o, reason: collision with root package name */
    public int f173433o;

    public FadingEdgeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j17);
        int i17 = this.f173426e;
        if (i17 == 0 || (i17 & this.f173428g) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.f173432n, this.f173427f, this.f173425d);
        }
        int i18 = this.f173426e;
        if (i18 == 0 || (i18 & this.f173429h) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.f173432n / 2, this.f173433o / 2);
            canvas.drawRect(0.0f, 0.0f, this.f173432n, this.f173427f, this.f173425d);
            canvas.restoreToCount(save);
        }
        int i19 = (this.f173433o - this.f173432n) / 2;
        int i27 = this.f173426e;
        if (i27 == 0 || (i27 & this.f173430i) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.f173432n / 2, this.f173433o / 2);
            canvas.translate(0.0f, i19);
            canvas.drawRect(0 - i19, 0.0f, this.f173432n + i19, this.f173427f, this.f173425d);
            canvas.restoreToCount(save2);
        }
        int i28 = this.f173426e;
        if (i28 == 0 || (i28 & this.f173431m) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.f173432n / 2, this.f173433o / 2);
            canvas.translate(0.0f, i19);
            canvas.drawRect(0 - i19, 0.0f, this.f173432n + i19, this.f173427f, this.f173425d);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f173432n = getWidth();
        this.f173433o = getHeight();
    }

    public void setPosition(int i17) {
        this.f173426e = i17;
        invalidate();
    }

    public FadingEdgeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173428g = 1;
        this.f173429h = 2;
        this.f173430i = 4;
        this.f173431m = 8;
        int i18 = 0;
        int[] iArr = {-16777216, 0};
        float[] fArr = {0.0f, 1.0f};
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f173425d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f173425d.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zh4.o.f472984a);
        this.f173426e = obtainStyledAttributes.getInt(0, 0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479704cz);
        if (valueOf != null) {
            i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf.intValue());
        }
        this.f173427f = obtainStyledAttributes.getDimension(1, i18);
        obtainStyledAttributes.recycle();
        this.f173425d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f173427f, iArr, fArr, android.graphics.Shader.TileMode.CLAMP));
    }
}
