package df2;

/* loaded from: classes3.dex */
public final class yo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f231884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f231885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f231886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.zo f231887g;

    public yo(android.widget.ImageView imageView, float f17, float f18, df2.zo zoVar) {
        this.f231884d = imageView;
        this.f231885e = f17;
        this.f231886f = f18;
        this.f231887g = zoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f231884d;
        imageView.animate().translationXBy(this.f231885e).translationYBy(this.f231886f).scaleX(1.8f).scaleY(1.8f).rotationBy(((float) ((((float) java.lang.Math.atan2(r3, r2)) * 180) / 3.141592653589793d)) + 90).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(new df2.xo(this.f231887g, imageView)).setDuration(500L).start();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(100L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
    }
}
