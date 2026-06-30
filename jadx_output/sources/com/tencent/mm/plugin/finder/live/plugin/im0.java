package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class im0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg2.z1 f112990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.km0 f112991e;

    public im0(fg2.z1 z1Var, com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        this.f112990d = z1Var;
        this.f112991e = km0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg2.z1 z1Var = this.f112990d;
        int width = z1Var.f262423e.getWidth();
        com.tencent.mm.plugin.finder.live.plugin.km0 km0Var = this.f112991e;
        boolean z17 = width > ((java.lang.Number) ((jz5.n) km0Var.f113288y).getValue()).intValue();
        android.widget.HorizontalScrollView horizontalScrollView = z1Var.f262424f;
        android.view.ViewGroup.LayoutParams layoutParams = horizontalScrollView.getLayoutParams();
        jz5.g gVar = km0Var.f113288y;
        layoutParams.width = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        horizontalScrollView.setLayoutParams(layoutParams);
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
            layoutParams2.width = -2;
            horizontalScrollView.setLayoutParams(layoutParams2);
            return;
        }
        km0Var.f113286w.removeMessages(1);
        android.animation.ObjectAnimator objectAnimator = km0Var.f113287x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int[] iArr = new int[2];
        iArr[0] = 0;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = z1Var.f262423e;
        int width2 = finderFixedTextView.getWidth() - ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        iArr[1] = width2 >= 0 ? width2 : 0;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(finderFixedTextView, "scrollX", iArr);
        km0Var.f113287x = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(1000L);
        }
        android.animation.ObjectAnimator objectAnimator2 = km0Var.f113287x;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new com.tencent.mm.plugin.finder.live.plugin.hm0(km0Var));
        }
        android.animation.ObjectAnimator objectAnimator3 = km0Var.f113287x;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }
}
