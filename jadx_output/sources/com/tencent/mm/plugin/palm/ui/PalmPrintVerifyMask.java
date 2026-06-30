package com.tencent.mm.plugin.palm.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/palm/ui/PalmPrintVerifyMask;", "Landroid/view/View;", "", "d", "F", "getCircleRadius", "()F", "setCircleRadius", "(F)V", "circleRadius", "e", "getCirclePagWidth", "setCirclePagWidth", "circlePagWidth", "f", "getCircleX", "setCircleX", "circleX", "g", "getCircleY", "setCircleY", "circleY", "h", "getTipsLayoutY", "setTipsLayoutY", "tipsLayoutY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-face_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PalmPrintVerifyMask extends android.view.View {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f152882p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float circleRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float circlePagWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float circleX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float circleY;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float tipsLayoutY;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f152888i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f152889m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f152890n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f152891o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmPrintVerifyMask(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f152888i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f152889m = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f152890n = paint3;
        setAlpha(0.998f);
        paint.setColor(android.graphics.Color.parseColor("#80000000"));
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        paint2.setColor(i65.a.d(context, com.tencent.mm.R.color.a9e));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(23.0f);
    }

    public final void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintVerifyMask", "[showRing] isShow:" + z17 + ", isGreen:" + z18);
        this.f152891o = z17;
        if (this.f152891o) {
            this.f152890n.setColor(z18 ? i65.a.d(getContext(), com.tencent.mm.R.color.Brand_120) : i65.a.d(getContext(), com.tencent.mm.R.color.Orange_120));
        }
        invalidate();
    }

    public final float getCirclePagWidth() {
        return this.circlePagWidth;
    }

    public final float getCircleRadius() {
        return this.circleRadius;
    }

    public final float getCircleX() {
        return this.circleX;
    }

    public final float getCircleY() {
        return this.circleY;
    }

    public final float getTipsLayoutY() {
        return this.tipsLayoutY;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f152888i);
        this.circleRadius = getHeight() * 0.407f;
        this.circleX = getWidth() * 0.5f;
        float height = getHeight() * 0.54f;
        this.circleY = height;
        canvas.drawCircle(this.circleX, height, this.circleRadius, this.f152889m);
        canvas.restoreToCount(saveLayer);
        if (this.f152891o) {
            canvas.drawCircle(this.circleX, this.circleY, this.circleRadius, this.f152890n);
        }
        this.tipsLayoutY = getHeight() * 0.52f;
        this.circlePagWidth = getHeight() * 0.474f * 2;
    }

    public final void setCirclePagWidth(float f17) {
        this.circlePagWidth = f17;
    }

    public final void setCircleRadius(float f17) {
        this.circleRadius = f17;
    }

    public final void setCircleX(float f17) {
        this.circleX = f17;
    }

    public final void setCircleY(float f17) {
        this.circleY = f17;
    }

    public final void setTipsLayoutY(float f17) {
        this.tipsLayoutY = f17;
    }
}
