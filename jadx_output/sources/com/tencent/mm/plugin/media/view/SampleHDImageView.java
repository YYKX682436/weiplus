package com.tencent.mm.plugin.media.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/media/view/SampleHDImageView;", "Lcom/tencent/mm/ui/base/WxImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SampleHDImageView extends com.tencent.mm.ui.base.WxImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SampleHDImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void A(float f17, float f18) {
        float translationX = getTranslationX();
        float translationY = getTranslationY();
        if (!(translationX == 0.0f)) {
            setTranslationX(getTranslationX() + f17);
            if (!(java.lang.Math.signum(getTranslationX()) == java.lang.Math.signum(translationX))) {
                if (!(getTranslationX() == 0.0f)) {
                    setTranslationX(0.0f);
                    f17 += translationX;
                }
            }
            f17 = 0.0f;
        }
        if (!(translationY == 0.0f)) {
            setTranslationY(getTranslationY() + f18);
            if (!(java.lang.Math.signum(getTranslationY()) == java.lang.Math.signum(translationY))) {
                if (!(getTranslationY() == 0.0f)) {
                    setTranslationY(0.0f);
                    f18 += translationY;
                }
            }
            f18 = 0.0f;
        }
        jz5.l B = B(f17, f18);
        setTranslationX(getTranslationX() + ((java.lang.Number) B.f302833d).floatValue());
        setTranslationY(getTranslationY() + ((java.lang.Number) B.f302834e).floatValue());
    }

    public final jz5.l B(float f17, float f18) {
        android.graphics.PointF imageViewMatrixScale;
        android.graphics.PointF imageViewMatrixTranslation = getImageViewMatrixTranslation();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (imageViewMatrixTranslation != null && (imageViewMatrixScale = getImageViewMatrixScale()) != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            matrix.setScale(imageViewMatrixScale.x, imageViewMatrixScale.y);
            matrix.postTranslate(imageViewMatrixTranslation.x, imageViewMatrixTranslation.y);
            matrix.postTranslate(f17, f18);
            matrix.getValues(new float[9]);
            setImageViewMatrix(matrix);
            android.graphics.PointF imageViewMatrixTranslation2 = getImageViewMatrixTranslation();
            float f19 = imageViewMatrixTranslation2.x;
            float f27 = imageViewMatrixTranslation2.y;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
            if (subsamplingScaleImageView != null) {
                subsamplingScaleImageView.fitToBounds(true);
            }
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView2 = this.f68217f;
            if (subsamplingScaleImageView2 != null) {
                subsamplingScaleImageView2.refreshRequiredTiles(false);
                this.f68217f.invalidate();
            }
            android.graphics.PointF imageViewMatrixTranslation3 = getImageViewMatrixTranslation();
            return new jz5.l(java.lang.Float.valueOf(f19 - imageViewMatrixTranslation3.x), java.lang.Float.valueOf(f27 - imageViewMatrixTranslation3.y));
        }
        return new jz5.l(valueOf, valueOf);
    }

    @Override // com.tencent.mm.ui.base.WxImageView, db5.f0
    public void i() {
        super.i();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public final void z(float f17, float f18, float f19) {
        android.graphics.PointF imageViewMatrixTranslation;
        android.graphics.PointF imageViewMatrixScale;
        if (getVisibility() != 0 || (imageViewMatrixTranslation = getImageViewMatrixTranslation()) == null || (imageViewMatrixScale = getImageViewMatrixScale()) == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.setScale(imageViewMatrixScale.x, imageViewMatrixScale.y);
        matrix.postTranslate(imageViewMatrixTranslation.x, imageViewMatrixTranslation.y);
        matrix.postScale(f17, f17, f18, f19);
        matrix.getValues(new float[9]);
        setImageViewMatrix(matrix);
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.refreshRequiredTiles(false);
            this.f68217f.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleHDImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigMediaGalleryDebug()) == 1) {
            this.f68217f.setDebug(true);
        }
    }
}
