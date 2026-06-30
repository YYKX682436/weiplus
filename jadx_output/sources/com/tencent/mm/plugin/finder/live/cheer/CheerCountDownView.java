package com.tencent.mm.plugin.finder.live.cheer;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/cheer/CheerCountDownView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "a", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CheerCountDownView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f111520d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f111521e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f111522f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f111523g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111524h;

    /* renamed from: i, reason: collision with root package name */
    public final float f111525i;

    /* renamed from: m, reason: collision with root package name */
    public float f111526m;

    /* renamed from: n, reason: collision with root package name */
    public float f111527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheerCountDownView(android.content.Context context, android.util.AttributeSet a17) {
        super(context, a17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(a17, "a");
        this.f111522f = new int[]{android.graphics.Color.parseColor("#1391BC"), android.graphics.Color.parseColor("#B4CB47")};
        this.f111523g = kotlinx.coroutines.z0.b();
        this.f111525i = -90.0f;
        this.f111526m = 360.0f;
        this.f111527n = i65.a.b(getContext(), 4);
        a();
    }

    public final void a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f111527n);
        paint.setAntiAlias(true);
        this.f111521e = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f111527n);
        paint2.setAntiAlias(true);
        paint2.setColor(android.graphics.Color.parseColor("#80FFFFFF"));
        this.f111520d = paint2;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f17 = 2;
        float f18 = width - (this.f111527n / f17);
        android.graphics.Paint paint = this.f111520d;
        if (paint == null) {
            kotlin.jvm.internal.o.o("srcPaint");
            throw null;
        }
        canvas.drawCircle(width, height, f18, paint);
        float f19 = this.f111527n;
        android.graphics.RectF rectF = new android.graphics.RectF(f19 / f17, f19 / f17, getWidth() - (this.f111527n / f17), getHeight() - (this.f111527n / f17));
        float f27 = this.f111525i;
        float f28 = this.f111526m;
        android.graphics.Paint paint2 = this.f111521e;
        if (paint2 != null) {
            canvas.drawArc(rectF, f27, f28, false, paint2);
        } else {
            kotlin.jvm.internal.o.o("shaderPaint");
            throw null;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f111521e;
        if (paint == null) {
            kotlin.jvm.internal.o.o("shaderPaint");
            throw null;
        }
        android.graphics.SweepGradient sweepGradient = new android.graphics.SweepGradient(width, height, this.f111522f, (float[]) null);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(-90.0f, width, height);
        sweepGradient.setLocalMatrix(matrix);
        paint.setShader(sweepGradient);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheerCountDownView(android.content.Context context, android.util.AttributeSet a17, int i17) {
        super(context, a17, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(a17, "a");
        this.f111522f = new int[]{android.graphics.Color.parseColor("#1391BC"), android.graphics.Color.parseColor("#B4CB47")};
        this.f111523g = kotlinx.coroutines.z0.b();
        this.f111525i = -90.0f;
        this.f111526m = 360.0f;
        this.f111527n = i65.a.b(getContext(), 4);
        a();
    }
}
