package uj3;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f428353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f428354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f428356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428357h;

    public v(uj3.z zVar, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.String str) {
        this.f428353d = zVar;
        this.f428354e = bitmap;
        this.f428355f = i17;
        this.f428356g = i18;
        this.f428357h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator withStartAction;
        uj3.z zVar = this.f428353d;
        android.widget.ImageView imageView = zVar.f428397d;
        if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300L)) != null && (listener = duration.setListener(new uj3.t(zVar, this.f428357h))) != null && (withStartAction = listener.withStartAction(new uj3.u(zVar))) != null) {
            withStartAction.start();
        }
        zVar.e(this.f428354e, this.f428355f, this.f428356g, 1);
    }
}
