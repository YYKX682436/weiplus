package com.tencent.mm.ui.base;

/* loaded from: classes11.dex */
public class MaskLayout extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f197639d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f197640e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197641f;

    public MaskLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(db5.r8 r8Var) {
        removeView(this.f197639d);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int ordinal = r8Var.ordinal();
        if (ordinal == 0) {
            layoutParams.addRule(11);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                layoutParams.addRule(12);
                layoutParams.addRule(11);
            } else if (ordinal != 3) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(9);
            }
        }
        addView(this.f197639d, layoutParams);
    }

    public void b(android.graphics.Bitmap bitmap, db5.r8 r8Var) {
        a(r8Var);
        this.f197639d.setImageBitmap(bitmap);
    }

    public android.view.View getContentView() {
        return this.f197640e;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cgi);
        this.f197640e = findViewById;
        if (findViewById == null) {
            this.f197640e = new android.view.View(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f197640e.setLayoutParams(layoutParams);
            addView(this.f197640e);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f197639d = imageView;
        imageView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f197639d.setImageDrawable(this.f197641f);
        addView(this.f197639d);
    }

    public void setMaskBitmap(android.graphics.Bitmap bitmap) {
        a(db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_ALL);
        this.f197639d.setImageBitmap(bitmap);
    }

    public void setMaskDrawable(android.graphics.drawable.Drawable drawable) {
        a(db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_ALL);
        this.f197639d.setImageDrawable(drawable);
    }

    public MaskLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447204v, i17, 0);
        this.f197641f = obtainStyledAttributes.getDrawable(5);
        obtainStyledAttributes.recycle();
    }
}
