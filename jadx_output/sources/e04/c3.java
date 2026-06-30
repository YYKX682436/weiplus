package e04;

/* loaded from: classes15.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f245878a;

    /* renamed from: b, reason: collision with root package name */
    public long f245879b;

    /* renamed from: c, reason: collision with root package name */
    public e04.z2 f245880c;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f245881d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245882e;

    public final void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        this.f245882e = true;
        wu5.c cVar = this.f245881d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        android.view.View view = this.f245878a;
        if (view == null || (animate = view.animate()) == null || (listener = animate.setListener(null)) == null || (updateListener = listener.setUpdateListener(null)) == null) {
            return;
        }
        updateListener.cancel();
    }

    public final void b(boolean z17) {
        e04.z2 z2Var = this.f245880c;
        if (z2Var != null) {
            z2Var.c(z17);
        }
        if (z17) {
            c(true);
            return;
        }
        android.view.View view = this.f245878a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f245882e = true;
        wu5.c cVar = this.f245881d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        e04.b3 b3Var = new e04.b3(this);
        long j17 = this.f245879b;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f245881d = t0Var.z(b3Var, j17, false);
        this.f245882e = false;
    }

    public final void c(boolean z17) {
        android.view.View view = this.f245878a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startShowAnimation", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startShowAnimation", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        e04.z2 z2Var = this.f245880c;
        if (z2Var != null) {
            z2Var.b(z17);
        }
        e04.i3.a(this.f245878a, z17 ? 0.0f : 1.0f, z17 ? 1.0f : 0.0f, 200L, new e04.a3(z17, this));
    }
}
