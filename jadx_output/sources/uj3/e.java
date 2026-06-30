package uj3;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.g f428258d;

    public e(uj3.g gVar) {
        this.f428258d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        uj3.g gVar = this.f428258d;
        android.widget.TextView textView = gVar.f428273f;
        if (textView != null) {
            textView.setVisibility(4);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = gVar.f428269b;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = gVar.f428269b;
        if (weImageView2 != null) {
            weImageView2.clearAnimation();
        }
        int i17 = -com.tencent.mm.ui.zk.a(gVar.f428268a, 4);
        android.view.View view = gVar.f428277j;
        int width = (view != null ? view.getWidth() : 0) - com.tencent.mm.ui.zk.a(gVar.f428268a, 32);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = gVar.f428269b;
        int left = width - (weImageView3 != null ? weImageView3.getLeft() : 0);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = gVar.f428269b;
        if (weImageView4 != null && (animate = weImageView4.animate()) != null && (translationX = animate.translationX(left)) != null && (translationY = translationX.translationY(i17)) != null && (duration = translationY.setDuration(300L)) != null) {
            duration.start();
        }
        int[] iArr = new int[2];
        android.view.View view2 = gVar.f428277j;
        iArr[0] = view2 != null ? view2.getWidth() : 0;
        iArr[1] = com.tencent.mm.ui.zk.a(gVar.f428268a, 28);
        android.animation.PropertyValuesHolder ofInt = android.animation.PropertyValuesHolder.ofInt("sizeW", iArr);
        int[] iArr2 = new int[2];
        android.view.View view3 = gVar.f428277j;
        iArr2[0] = view3 != null ? view3.getHeight() : 0;
        iArr2[1] = com.tencent.mm.ui.zk.a(gVar.f428268a, 28);
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofPropertyValuesHolder(ofInt, android.animation.PropertyValuesHolder.ofInt("sizeH", iArr2), android.animation.PropertyValuesHolder.ofInt("marginBottom", 0, com.tencent.mm.ui.zk.a(gVar.f428268a, 8)), android.animation.PropertyValuesHolder.ofInt("marginEnd", 0, com.tencent.mm.ui.zk.a(gVar.f428268a, 8))).setDuration(300L);
        duration2.addUpdateListener(new uj3.d(gVar));
        duration2.start();
    }
}
