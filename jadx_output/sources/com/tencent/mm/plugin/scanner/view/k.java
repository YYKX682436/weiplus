package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f159947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f159948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f159949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.n f159950g;

    public k(com.tencent.mm.plugin.scanner.view.n nVar, android.view.View view, android.widget.TextView textView, android.view.View view2) {
        this.f159950g = nVar;
        this.f159947d = view;
        this.f159948e = textView;
        this.f159949f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.view.n nVar = this.f159950g;
        if (nVar.f159961c.intValue() == 1) {
            return;
        }
        nVar.f159961c = 1;
        android.view.View view = this.f159947d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(333L);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        ofFloat2.addListener(new com.tencent.mm.plugin.scanner.view.j(this));
        animatorSet.start();
    }
}
