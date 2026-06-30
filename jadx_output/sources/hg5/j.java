package hg5;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f281421a;

    /* renamed from: b, reason: collision with root package name */
    public float f281422b;

    /* renamed from: c, reason: collision with root package name */
    public float f281423c;

    /* renamed from: d, reason: collision with root package name */
    public float f281424d;

    /* renamed from: e, reason: collision with root package name */
    public float f281425e;

    /* renamed from: f, reason: collision with root package name */
    public float f281426f;

    /* renamed from: g, reason: collision with root package name */
    public float f281427g;

    public j(java.lang.ref.WeakReference halfScreenWebView) {
        kotlin.jvm.internal.o.g(halfScreenWebView, "halfScreenWebView");
        this.f281421a = halfScreenWebView;
    }

    public static void a(hg5.j jVar, android.view.View view, android.view.View view2, int i17, float f17, boolean z17, android.view.View view3, int i18, java.lang.Object obj) {
        float f18 = (i18 & 8) != 0 ? 1.0f : f17;
        boolean z18 = (i18 & 16) != 0 ? true : z17;
        android.view.View view4 = (i18 & 32) != 0 ? null : view3;
        jVar.getClass();
        if (view == null || view2 == null) {
            return;
        }
        view.setOnTouchListener(new hg5.i(view4, jVar, new kotlin.jvm.internal.g0(), f18, view, z18, view2, i17));
    }

    public final void b(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        float f17 = this.f281426f;
        float f18 = i17;
        java.lang.ref.WeakReference weakReference = this.f281421a;
        if (f17 > f18) {
            androidx.appcompat.app.i0 i0Var = (androidx.appcompat.app.i0) weakReference.get();
            if (i0Var != null) {
                i0Var.cancel();
            }
        } else {
            if (!(f17 == 0.0f)) {
                if (f17 == 0.0f) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.HalfScreenDialogDragHelper", "animateDialogVerticalTranslation start equals end and ignore");
                } else {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
                    ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
                    ofFloat.setDuration(350L);
                    ofFloat.addUpdateListener(new hg5.e(view));
                    ofFloat.addListener(new hg5.f(this, 0.0f));
                    ofFloat.start();
                }
            }
        }
        float f19 = this.f281427g;
        if (f19 > f18) {
            androidx.appcompat.app.i0 i0Var2 = (androidx.appcompat.app.i0) weakReference.get();
            if (i0Var2 != null) {
                i0Var2.cancel();
                return;
            }
            return;
        }
        if (f19 == 0.0f) {
            return;
        }
        if (f19 == 0.0f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HalfScreenDialogDragHelper", "animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(f19, 0.0f);
        ofFloat2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat2.setDuration(350L);
        ofFloat2.addUpdateListener(new hg5.g(view));
        ofFloat2.addListener(new hg5.h(this, 0.0f));
        ofFloat2.start();
    }
}
