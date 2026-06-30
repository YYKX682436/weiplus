package com.tencent.mm.plugin.sns.cover.preview;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverNoFadeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Bitmap;", "bm", "Ljz5/f0;", "setImageBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sns-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SnsCoverNoFadeImageView extends androidx.appcompat.widget.AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCoverNoFadeImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        if ((bitmapDrawable != null ? bitmapDrawable.getBitmap() : null) == null) {
            return;
        }
        if ((r0.getHeight() * 1.0f) / r0.getWidth() > (i18 * 1.0f) / i17) {
            setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        float height = (getWidth() <= 0 || getHeight() <= 0) ? 1.7777778f : (getHeight() * 1.0f) / getWidth();
        if (bitmap != null) {
            if ((bitmap.getHeight() * 1.0f) / bitmap.getWidth() >= height) {
                setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            } else {
                if (bitmap.getHeight() < bitmap.getWidth()) {
                    super.setImageBitmap(null);
                    return;
                }
                setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            }
        }
        super.setImageBitmap(bitmap);
    }
}
