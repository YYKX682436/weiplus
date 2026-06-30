package com.tencent.mm.plugin.welab.ui.widget;

/* loaded from: classes4.dex */
public class WelabRoundCornerImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public float f188110d;

    public WelabRoundCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public android.graphics.Bitmap getDisplayingBitmap() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null || !(drawable instanceof f3.j)) {
            return null;
        }
        return ((f3.j) drawable).f259246a;
    }

    public void setCornerRadiusPercent(float f17) {
        this.f188110d = f17;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() < 0 || bitmap.getHeight() < 0) {
            super.setImageBitmap(bitmap);
        } else {
            if (this.f188110d <= 0.0f) {
                super.setImageBitmap(bitmap);
                return;
            }
            f3.i iVar = new f3.i(getResources(), bitmap);
            iVar.c(java.lang.Math.min(bitmap.getWidth() * this.f188110d, bitmap.getHeight() * this.f188110d));
            super.setImageDrawable(iVar);
        }
    }

    public WelabRoundCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
