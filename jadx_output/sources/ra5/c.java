package ra5;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f393557d;

    public c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f393557d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f393557d;
        view.setSelected(false);
        android.graphics.drawable.Drawable drawable = view.getContext().getDrawable(com.tencent.mm.R.color.f479313vt);
        kotlin.jvm.internal.o.d(drawable);
        view.setBackground(drawable);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(240);
        ofInt.addUpdateListener(new ra5.a(drawable));
        ofInt.setDuration(100L);
        ofInt.addListener(new ra5.b(drawable, this));
        ofInt.start();
    }
}
