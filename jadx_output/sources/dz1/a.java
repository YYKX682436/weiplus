package dz1;

/* loaded from: classes13.dex */
public abstract class a implements mz1.c, nz1.b, e42.j0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f245092d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245093e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f245094f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f245095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f245096h;

    @Override // e42.j0
    public void A(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityResume] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void C(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewTouch] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void D(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void F(androidx.fragment.app.Fragment fragment, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentSetUserVisibleHint] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void G(int i17) {
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onHellFragmentPause] hashcode : " + i17);
    }

    @Override // e42.j0
    public void H(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityMoveActivityTaskToBack] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void I(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellFragmentEnter] fragmentObj : ");
        sb6.append(obj != null ? obj.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void J(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityFinishActivity] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void K(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewDoubleClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    public void L(androidx.fragment.app.Fragment fragment) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentDestroy] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void M(java.lang.String str, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onHellBackToFront] activityName : " + str);
    }

    @Override // nz1.b
    public void N(androidx.fragment.app.Fragment fragment) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentResume] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    public void O(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onStartedActivityExec] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void a(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityPaused] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void b(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewItemLongClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void c(androidx.fragment.app.Fragment fragment) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentPause] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void d(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityDestroy] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void e(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewLongSelected] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void f(int i17) {
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onHellActivityPopStackUnRegular] hashCode : " + i17);
    }

    @Override // e42.j0
    public void g(android.content.Intent intent, android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityNewIntent] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void h(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewItemClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void i(androidx.fragment.app.Fragment fragment, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentHiddenChanged] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void j(androidx.fragment.app.Fragment fragment) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentCreate] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void k(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewLongClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void l(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewKey] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void m(androidx.fragment.app.Fragment fragment) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentDestroyView] fragment : ");
        sb6.append(fragment != null ? fragment.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void n(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityPushStack] activity : ");
        sb6.append(str != null ? str.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void o(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityPause] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // mz1.c
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityCreated] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityDestroyed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPaused] activity : ".concat(activity.getClass().getSimpleName()));
        if (this.f245092d || !this.f245093e) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onEnterRecntApps]");
        this.f245095g = true;
    }

    @Override // mz1.c
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostCreated] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPostDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostDestroyed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPostPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostPaused] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPostResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostResumed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostSaveInstanceState] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPostStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostStarted] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPostStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostStopped] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreCreated] activity : ".concat(activity.getClass().getSimpleName()));
        if (u46.l.c(this.f245096h, activity.getClass().getCanonicalName())) {
            O(activity);
            this.f245096h = null;
        }
    }

    @Override // mz1.c
    public void onActivityPreDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreDestroyed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPrePaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPrePaused] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPreResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreResumed] activity : ".concat(activity.getClass().getSimpleName()));
        this.f245092d = false;
        this.f245093e = false;
    }

    @Override // mz1.c
    public void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreSaveInstanceState] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPreStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreStarted] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityPreStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreStopped] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityResumed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivitySaveInstanceState] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityStarted] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityStopped] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // e42.j0
    public void p(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityResumed] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void q(android.app.Activity activity, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellFragmentResume] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void r(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityStop] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void s(android.content.Intent intent, android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityCreate] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void t(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityUserLeaveHint] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
        this.f245092d = true;
    }

    @Override // e42.j0
    public void u(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellChatFragmentFinish] fragmentObj : ");
        sb6.append(obj != null ? obj.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void v(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onHellActivityStartActivity] activityName : " + str);
        this.f245096h = str;
    }

    @Override // e42.j0
    public void w(int i17) {
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onHellFragmentExit] hashcode : " + i17);
    }

    @Override // e42.j0
    public void x(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewSingleClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void y(java.lang.String str, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onHellFrontToBack] activityName : " + str);
    }

    @Override // e42.j0
    public void z(android.app.Activity activity, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityWindowFocusChanged] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        sb6.append(", hasFocus : ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
        ty1.a a17 = ty1.a.a();
        kotlin.jvm.internal.o.d(activity);
        java.lang.String simpleName = activity.getClass().getSimpleName();
        boolean z18 = false;
        if (u46.l.e(simpleName)) {
            a17.getClass();
        } else {
            if (a17.f423045b == null) {
                a17.b();
            }
            java.lang.String concat = "s".concat(simpleName);
            java.lang.String concat2 = "c".concat(simpleName);
            java.util.Iterator it = ((java.util.ArrayList) a17.f423045b).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (u46.l.c(str, concat) || u46.l.c(str, concat2)) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            return;
        }
        this.f245093e = !z17;
    }
}
