package qb2;

/* loaded from: classes8.dex */
public final class y0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f361313d;

    public y0(qb2.r1 r1Var) {
        this.f361313d = r1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            this.f361313d.f361281b++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI;
        qb2.r1 r1Var = this.f361313d;
        if (z17) {
            r1Var.f361281b--;
        }
        r1Var.c(500L, qb2.c1.f361183f);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f361313d.f361283d = ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).Di(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean Di = ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).Di(activity);
        qb2.r1 r1Var = this.f361313d;
        r1Var.f361283d = Di;
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            pm0.v.K(null, new qb2.x0(r1Var));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}
