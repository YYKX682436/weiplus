package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f159954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f159955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f159956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.n f159957g;

    public m(com.tencent.mm.plugin.scanner.view.n nVar, android.view.View view, android.widget.TextView textView, android.view.View view2) {
        this.f159957g = nVar;
        this.f159954d = view;
        this.f159955e = textView;
        this.f159956f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f159954d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(333L);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        ofFloat2.addListener(new com.tencent.mm.plugin.scanner.view.l(this));
        animatorSet.start();
    }
}
