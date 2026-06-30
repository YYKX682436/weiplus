package yv4;

/* loaded from: classes4.dex */
public final class k extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f466228d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.RectF f466229e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f466230f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f466231g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f466232h;

    /* renamed from: i, reason: collision with root package name */
    public float f466233i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(yv4.f.f466221d);
        this.f466228d = jz5.h.b(yv4.e.f466220d);
        this.f466230f = jz5.h.b(new yv4.d(this));
        this.f466231g = jz5.h.b(new yv4.b(this));
        this.f466232h = jz5.h.b(new yv4.j(this));
    }

    public final void T6(boolean z17) {
        android.graphics.RectF rectF = this.f466229e;
        if (rectF != null) {
            float imageWidth = U6().getImageWidth();
            float imageHeight = U6().getImageHeight();
            float width = U6().getWidth();
            float height = U6().getHeight();
            com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "onAdjust img:" + imageWidth + '|' + imageHeight + " ; iv:" + width + '|' + height);
            float f17 = width / imageWidth;
            kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
            e0Var.f310115d = ((height - this.f466233i) / ((float) 2)) - ((rectF.centerY() / imageHeight) * (imageHeight * f17));
            float f18 = rectF.left * f17;
            float f19 = rectF.top * f17;
            float f27 = e0Var.f310115d;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f18, f19 + f27, rectF.right * f17, (rectF.bottom * f17) + f27);
            float f28 = rectF2.top;
            if (f28 < 0.0f) {
                float f29 = -f28;
                rectF2.top = f28 + f29;
                rectF2.bottom += f29;
                e0Var.f310115d += f29;
            }
            float a17 = ym5.x.a(getContext(), 16.0f);
            rectF2.left = java.lang.Math.max(a17, rectF2.left);
            rectF2.top = java.lang.Math.max(a17, rectF2.top);
            rectF2.right = java.lang.Math.min(width - a17, rectF2.right);
            rectF2.bottom = java.lang.Math.min(height - a17, rectF2.bottom);
            jz5.g gVar = this.f466231g;
            if (((com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView) ((jz5.n) gVar).getValue()) == null) {
                return;
            }
            if (z17) {
                float f37 = U6().getImageViewMatrixScale().x;
                android.graphics.PointF imageViewMatrixTranslation = U6().getImageViewMatrixTranslation();
                float f38 = imageViewMatrixTranslation != null ? imageViewMatrixTranslation.y : 0.0f;
                android.graphics.RectF f181689g = ((com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView) ((jz5.n) gVar).getValue()).getF181689g();
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.addUpdateListener(new yv4.a(this, f181689g, rectF2, f37, f17, f38, e0Var));
                ofFloat.start();
                return;
            }
            com.tencent.mm.ui.base.WxImageView U6 = U6();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f17, f17);
            matrix.postTranslate(0.0f, e0Var.f310115d);
            U6.setImageViewMatrix(matrix);
            com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView circleToSearchCropperView = (com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView) ((jz5.n) gVar).getValue();
            circleToSearchCropperView.getClass();
            circleToSearchCropperView.f181689g = rectF2;
            circleToSearchCropperView.postInvalidate();
        }
    }

    public final com.tencent.mm.ui.base.WxImageView U6() {
        return (com.tencent.mm.ui.base.WxImageView) ((jz5.n) this.f466232h).getValue();
    }
}
