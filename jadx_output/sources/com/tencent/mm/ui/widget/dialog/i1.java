package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k1 f211823d;

    public i1(com.tencent.mm.ui.widget.dialog.l1 l1Var, com.tencent.mm.ui.widget.dialog.k1 k1Var) {
        this.f211823d = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f211823d.f211905r, "alpha", 0.2f, 0.0f);
        ofFloat.addListener(new com.tencent.mm.ui.widget.dialog.h1(this));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }
}
