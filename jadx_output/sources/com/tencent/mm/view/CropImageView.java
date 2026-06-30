package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/view/CropImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/RectF;", "cropRect", "Ljz5/f0;", "setCropRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CropImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.RectF f213299f;

    public CropImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.RectF rectF = this.f213299f;
        if (rectF == null) {
            super.onDraw(canvas);
            return;
        }
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        float f17 = intrinsicWidth;
        float f18 = rectF.left * f17;
        float f19 = f17 * rectF.right;
        float f27 = intrinsicHeight;
        float f28 = f19 - f18;
        float f29 = (f27 * rectF.bottom) - (rectF.top * f27);
        int width = getWidth();
        int height = getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f37 = height;
        float f38 = width;
        float f39 = f28 * f37 > f38 * f29 ? f37 / f29 : f38 / f28;
        float f47 = 2;
        matrix.setScale(f39, f39);
        matrix.postTranslate(java.lang.Math.round((width / 2) - ((f18 + (f28 / f47)) * f39)), java.lang.Math.round((height / 2) - ((r4 + (f29 / f47)) * f39)));
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() == 0 || getDrawable().getIntrinsicHeight() == 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(matrix);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    public final void setCropRect(android.graphics.RectF rectF) {
        java.util.Objects.toString(rectF);
        this.f213299f = rectF;
        invalidate();
    }

    public CropImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
