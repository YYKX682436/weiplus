package uj3;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f428340d;

    public r(uj3.z zVar) {
        this.f428340d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        uj3.z zVar = this.f428340d;
        android.widget.ImageView imageView = zVar.f428397d;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        }
        android.widget.ImageView imageView2 = zVar.f428397d;
        android.view.ViewPropertyAnimator alpha = (imageView2 == null || (animate = imageView2.animate()) == null) ? null : animate.alpha(1.0f);
        if (alpha == null) {
            return;
        }
        alpha.setDuration(300L);
    }
}
