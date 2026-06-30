package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes13.dex */
public class MMCheckBox extends android.widget.CheckBox {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f177096d;

    /* renamed from: e, reason: collision with root package name */
    public int f177097e;

    public MMCheckBox(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f177096d != null) {
            this.f177096d.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f177096d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.f177096d;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int gravity2 = getGravity() & 7;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i17 = 0;
            int height = gravity != 16 ? gravity != 80 ? 0 : getHeight() - intrinsicHeight : (getHeight() - intrinsicHeight) / 2;
            if (gravity2 == 1) {
                i17 = (getWidth() - intrinsicWidth) / 2;
            } else if (gravity2 == 5) {
                i17 = getWidth() - intrinsicWidth;
            }
            drawable.setBounds(i17, height, intrinsicWidth + i17, intrinsicHeight + height);
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i17) {
        if (i17 == 0 || i17 != this.f177097e) {
            this.f177097e = i17;
            setButtonDrawable(i17 != 0 ? getResources().getDrawable(this.f177097e) : null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f177096d;
    }

    public MMCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.f177096d = drawable;
    }
}
