package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class SnackContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f212459d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AnimationSet f212460e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f212461f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.AnimationSet f212462g;

    public SnackContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212459d = new java.util.LinkedList();
        this.f212461f = new com.tencent.mm.ui.widget.snackbar.k(this);
        a();
    }

    public final void a() {
        this.f212462g = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.f212462g.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        this.f212462g.addAnimation(translateAnimation);
        this.f212462g.addAnimation(alphaAnimation);
        this.f212460e = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 0.0f, 1, 1.0f);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.f212460e.addAnimation(translateAnimation2);
        this.f212460e.addAnimation(alphaAnimation2);
        this.f212460e.setDuration(300L);
        this.f212460e.setAnimationListener(new com.tencent.mm.ui.widget.snackbar.l(this));
    }

    public final void b(com.tencent.mm.ui.widget.snackbar.n nVar, boolean z17) {
        setVisibility(0);
        com.tencent.mm.ui.widget.snackbar.h hVar = nVar.f212487e;
        if (hVar != null) {
            com.tencent.mm.ui.widget.snackbar.j.f212477a = true;
            hVar.onShow();
        }
        com.tencent.mm.ui.widget.snackbar.Snack snack = nVar.f212486d;
        int i17 = snack.f212457m;
        android.view.View view = nVar.f212483a;
        if (i17 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = snack.f212457m;
            }
        }
        android.view.View view2 = snack.f212458n;
        if (view2 != null) {
            addView(view2);
        } else {
            addView(view);
        }
        java.lang.String str = snack.f212451d;
        android.widget.TextView textView = nVar.f212484b;
        textView.setText(str);
        java.lang.String str2 = snack.f212452e;
        android.widget.TextView textView2 = nVar.f212485c;
        if (str2 != null) {
            textView2.setVisibility(0);
            textView2.setText(snack.f212452e);
        } else {
            textView2.setVisibility(8);
        }
        if (z17) {
            this.f212462g.setDuration(0L);
        } else {
            this.f212462g.setDuration(500L);
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc);
        loadAnimation.setDuration(500L);
        startAnimation(this.f212462g);
        loadAnimation.setStartOffset(200L);
        textView2.startAnimation(loadAnimation);
        textView.startAnimation(loadAnimation);
        int i18 = snack.f212455h;
        if (i18 > 0) {
            postDelayed(this.f212461f, i18);
        }
        view.setOnTouchListener(new com.tencent.mm.ui.widget.snackbar.m(this, nVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f212462g.cancel();
        this.f212460e.cancel();
        removeCallbacks(this.f212461f);
        this.f212459d.clear();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        com.tencent.mm.ui.widget.snackbar.h hVar;
        super.onVisibilityChanged(view, i17);
        if (8 == i17) {
            removeAllViews();
            java.util.Queue queue = this.f212459d;
            if (!queue.isEmpty() && (hVar = ((com.tencent.mm.ui.widget.snackbar.n) ((java.util.LinkedList) queue).poll()).f212487e) != null) {
                com.tencent.mm.ui.widget.snackbar.j.f212477a = false;
                hVar.onHide();
            }
            if (queue.isEmpty()) {
                setVisibility(8);
            } else {
                b((com.tencent.mm.ui.widget.snackbar.n) ((java.util.LinkedList) queue).peek(), false);
            }
            com.tencent.mm.ui.widget.snackbar.j.f212477a = false;
        }
    }

    public SnackContainer(android.view.ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.f212459d = new java.util.LinkedList();
        this.f212461f = new com.tencent.mm.ui.widget.snackbar.k(this);
        viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        setVisibility(8);
        setId(com.tencent.mm.R.id.n19);
        a();
    }
}
