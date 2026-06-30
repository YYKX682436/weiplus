package yt2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f465328a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f465329b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f465330c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f465331d;

    public v(android.view.View priceView, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(priceView, "priceView");
        this.f465328a = priceView;
        this.f465329b = bitmap;
    }

    public final void a() {
        if (this.f465331d) {
            return;
        }
        android.view.View view = this.f465328a;
        view.animate().cancel();
        android.view.View view2 = this.f465328a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/SubsidyPriceCrossFadeAnim$Holder", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/subsidy/SubsidyPriceCrossFadeAnim$Holder", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationY(0.0f);
        b();
    }

    public final void b() {
        android.view.ViewPropertyAnimator animate;
        android.widget.ImageView imageView = this.f465330c;
        this.f465330c = null;
        if (imageView != null && (animate = imageView.animate()) != null) {
            animate.cancel();
        }
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        if (imageView != null) {
            android.view.ViewParent parent = imageView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(imageView);
            }
        }
        c();
    }

    public final void c() {
        if (this.f465331d) {
            return;
        }
        this.f465331d = true;
        android.graphics.Bitmap bitmap = this.f465329b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f465328a.post(new yt2.s(bitmap));
    }
}
