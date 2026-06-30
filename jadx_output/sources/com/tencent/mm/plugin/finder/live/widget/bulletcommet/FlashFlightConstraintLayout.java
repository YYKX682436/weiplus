package com.tencent.mm.plugin.finder.live.widget.bulletcommet;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FlashFlightConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/RectF;", org.chromium.base.BaseSwitches.V, "Landroid/graphics/RectF;", "getRectF", "()Landroid/graphics/RectF;", "setRectF", "(Landroid/graphics/RectF;)V", "rectF", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FlashFlightConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public android.graphics.RectF rectF;

    /* renamed from: w, reason: collision with root package name */
    public cn2.e1 f117920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashFlightConstraintLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        cn2.e1 e1Var = this.f117920w;
        if (e1Var != null) {
            android.graphics.RectF rectF = this.rectF;
            kotlin.jvm.internal.o.g(rectF, "rectF");
            if (e1Var.f43502e) {
                android.graphics.Bitmap bitmap = e1Var.f43503f;
                if (bitmap != null) {
                    canvas.save();
                    jz5.g gVar = e1Var.f43506i;
                    ((android.graphics.Path) ((jz5.n) gVar).getValue()).reset();
                    float f17 = e1Var.f43504g / 2.0f;
                    android.graphics.Path path = (android.graphics.Path) ((jz5.n) gVar).getValue();
                    float f18 = rectF.left - f17;
                    float f19 = rectF.top - f17;
                    float f27 = rectF.right + f17;
                    float f28 = rectF.bottom + f17;
                    float f29 = e1Var.f43508k;
                    path.addRoundRect(f18, f19, f27, f28, f29, f29, android.graphics.Path.Direction.CW);
                    canvas.clipPath((android.graphics.Path) ((jz5.n) gVar).getValue());
                    jz5.g gVar2 = e1Var.f43507j;
                    ((android.graphics.Matrix) ((jz5.n) gVar2).getValue()).reset();
                    float f37 = e1Var.f43505h;
                    android.view.View view = e1Var.f43498a;
                    float width = ((-bitmap.getWidth()) / 2.0f) + (f37 * view.getWidth());
                    float height = ((-bitmap.getHeight()) / 2.0f) + (e1Var.f43505h * view.getHeight());
                    ((android.graphics.Matrix) ((jz5.n) gVar2).getValue()).postRotate(36.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    ((android.graphics.Matrix) ((jz5.n) gVar2).getValue()).postTranslate(width, height);
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setAntiAlias(true);
                    paint.setDither(true);
                    canvas.drawBitmap(bitmap, (android.graphics.Matrix) ((jz5.n) gVar2).getValue(), paint);
                    canvas.restore();
                }
            } else if (zl2.q4.f473933a.E()) {
                com.tencent.mars.xlog.Log.i(e1Var.f43499b, "onDraw END!");
            }
        }
        super.dispatchDraw(canvas);
    }

    public final android.graphics.RectF getRectF() {
        return this.rectF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cn2.e1 e1Var = this.f117920w;
        if (e1Var != null) {
            e1Var.b(2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, i17, i18);
        com.tencent.mars.xlog.Log.i("FlashFlightConstraintLayout", "onSizeChanged new:" + i17 + ',' + i18 + ",old:" + i19 + ',' + i27);
    }

    public final void setRectF(android.graphics.RectF rectF) {
        kotlin.jvm.internal.o.g(rectF, "<set-?>");
        this.rectF = rectF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashFlightConstraintLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
    }
}
