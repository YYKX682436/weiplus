package com.tencent.mm.plugin.webview.ui.tools.game.menu;

/* loaded from: classes5.dex */
public class GameMenuImageButton extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f184765d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f184766e;

    public GameMenuImageButton(android.content.Context context) {
        super(context);
        b(context);
    }

    public void a(android.widget.FrameLayout frameLayout, tx4.c cVar) {
        if (getParent() == null && frameLayout != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
            frameLayout.addView(this, layoutParams);
        }
        android.widget.ImageView imageView = this.f184765d;
        if (imageView != null) {
            imageView.setOnClickListener(new tx4.b(this, cVar));
        }
        this.f184766e = true;
    }

    public final void b(android.content.Context context) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f184765d = imageView;
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.f(context, com.tencent.mm.R.dimen.f480528a21), i65.a.f(context, com.tencent.mm.R.dimen.f480528a21)));
        this.f184765d.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f184765d.setImageResource(com.tencent.mm.R.drawable.c6h);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, i65.a.f(context, com.tencent.mm.R.dimen.f480527a20), i65.a.f(context, com.tencent.mm.R.dimen.f480527a20), 0);
        addView(this.f184765d, layoutParams);
    }

    public GameMenuImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public GameMenuImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }
}
