package nq;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq.f f338863d;

    public c(nq.f fVar) {
        this.f338863d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        nq.f fVar = this.f338863d;
        android.view.View view = fVar.f338871e;
        if (view == null || view.getVisibility() != 0 || fVar.f338873g) {
            return;
        }
        com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView = fVar.f338875i;
        if (gameGLSurfaceView != null) {
            gameGLSurfaceView.setVisibility(0);
        }
        fVar.f338873g = true;
        android.view.View view2 = fVar.f338871e;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo GradientColorBackgroundView do alpha animation", new java.lang.Object[0]);
        android.view.View view3 = fVar.f338871e;
        if (view3 == null || (animate = view3.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(nq.f.f338866n)) == null || (listener = duration.setListener(new nq.b(this))) == null) {
            return;
        }
        listener.start();
    }
}
