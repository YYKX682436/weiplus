package hy2;

/* loaded from: classes10.dex */
public final class h implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM f286059d;

    public h(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM) {
        this.f286059d = finderTeenModeLimitVM;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI;
        com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = this.f286059d;
        if (z17 || finderTeenModeLimitVM.f136733g.contains(activity.getClass())) {
            if (finderTeenModeLimitVM.Q6()) {
                jz2.x0.f302754a.b(activity);
                return;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC;
            if (!c17.o(u3Var, false) || finderTeenModeLimitVM.R6()) {
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            jz2.x0.f302754a.b(activity);
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = this.f286059d;
            if (finderTeenModeLimitVM.f136738o <= 0) {
                com.tencent.mm.app.w.INSTANCE.p(finderTeenModeLimitVM);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.N6(this.f286059d, activity)) {
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = this.f286059d;
            if (!finderTeenModeLimitVM.Q6()) {
                finderTeenModeLimitVM.V6();
                return;
            }
            finderTeenModeLimitVM.f136738o++;
            com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "handleFinderUIStart enjoyFinderMs:" + finderTeenModeLimitVM.f136735i + ", enterRefCount:" + finderTeenModeLimitVM.f136738o);
            if (finderTeenModeLimitVM.f136738o == 1) {
                finderTeenModeLimitVM.f136736m = c01.id.c();
                finderTeenModeLimitVM.f136735i = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, 0L);
                com.tencent.mm.app.w.INSTANCE.a(finderTeenModeLimitVM);
                com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "startCheckTeenModeTimer enjoyFinderMs:" + finderTeenModeLimitVM.f136735i);
                hy2.o oVar = finderTeenModeLimitVM.f136731e;
                oVar.f286070b = new hy2.j(finderTeenModeLimitVM);
                if (oVar.f286069a == null) {
                    oVar.f286069a = ((ku5.t0) ku5.t0.f312615d).d(new hy2.n(oVar), 500L, 60000L);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = this.f286059d;
        if (com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.N6(finderTeenModeLimitVM, activity)) {
            if (!finderTeenModeLimitVM.Q6()) {
                finderTeenModeLimitVM.V6();
                return;
            }
            finderTeenModeLimitVM.f136738o--;
            com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "handleFinderUIStop enjoyFinderMs:" + finderTeenModeLimitVM.f136735i + ", enterRefCount:" + finderTeenModeLimitVM.f136738o);
            if (finderTeenModeLimitVM.f136738o <= 0) {
                finderTeenModeLimitVM.T6();
                finderTeenModeLimitVM.V6();
            }
        }
    }
}
