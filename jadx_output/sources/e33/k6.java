package e33;

/* loaded from: classes10.dex */
public final class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247312d;

    public k6(android.widget.ImageView imageView) {
        this.f247312d = new java.lang.ref.WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f247312d.get();
        android.graphics.drawable.Drawable drawable = imageView == null ? null : imageView.getDrawable();
        if (!(drawable instanceof e33.m6)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ThumbDrawable", "[tomys] ownerView is null or not a ThumbDrawable, ignore this task.");
            return;
        }
        e33.m6 m6Var = (e33.m6) drawable;
        java.lang.String str = m6Var.f247367d;
        m6Var.f247365b = t23.p0.h().g(m6Var.f247367d, m6Var.f247368e, m6Var.f247369f, m6Var.f247372i, m6Var.f247373j);
        android.graphics.Bitmap bitmap = m6Var.f247365b;
        if (bitmap == null || bitmap.isRecycled()) {
            t23.p0.h().a(new e33.l6(m6Var.f247364a, j33.d0.d(m6Var.f247367d, m6Var.f247372i, m6Var.f247371h)));
            t23.p0.h().f(m6Var.f247367d, m6Var.f247370g, m6Var.f247368e, m6Var.f247369f, m6Var.f247372i, m6Var.f247371h, m6Var.f247373j);
        }
        m6Var.invalidateSelf();
    }
}
