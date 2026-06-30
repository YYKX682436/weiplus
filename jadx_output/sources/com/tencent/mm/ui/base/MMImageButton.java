package com.tencent.mm.ui.base;

/* loaded from: classes.dex */
public class MMImageButton extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f197449d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f197450e;

    public MMImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f197449d.setEnabled(z17);
        this.f197450e.setEnabled(z17);
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.f197450e.setImageDrawable(drawable);
        this.f197450e.setVisibility(0);
        this.f197449d.setVisibility(8);
    }

    public void setImageRsource(int i17) {
        setImageDrawable(i65.a.i(getContext(), i17));
    }

    public void setText(java.lang.String str) {
        this.f197449d.setText(str);
        this.f197449d.setVisibility(0);
        this.f197450e.setVisibility(8);
    }

    public MMImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f197450e = imageView;
        imageView.setLayoutParams(layoutParams);
        addView(this.f197450e);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f197449d = textView;
        textView.setLayoutParams(layoutParams2);
        this.f197449d.setClickable(false);
        this.f197449d.setFocusable(false);
        this.f197449d.setFocusableInTouchMode(false);
        this.f197449d.setTextColor(i65.a.e(context, com.tencent.mm.R.color.f479424yv));
        addView(this.f197449d);
    }

    public void setText(int i17) {
        this.f197449d.setText(i17);
        this.f197449d.setVisibility(0);
        this.f197450e.setVisibility(8);
    }
}
