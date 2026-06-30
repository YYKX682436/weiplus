package g52;

/* loaded from: classes15.dex */
public class g implements rk5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g52.h f268897d;

    public g(g52.h hVar) {
        this.f268897d = hVar;
    }

    @Override // rk5.a
    public void D5(java.lang.Object obj, android.content.Intent intent) {
    }

    @Override // rk5.a
    public void H(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        g52.h hVar = this.f268897d;
        ((g52.e) hVar.f268899b).a(activity);
        ((g52.e) hVar.f268899b).d(activity);
        if ((activity instanceof androidx.fragment.app.FragmentActivity) && b52.b.k(activity.getClass().getName())) {
            androidx.fragment.app.Fragment c17 = i52.l.c((androidx.fragment.app.FragmentActivity) activity);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellActivityStub", "onVASEnter add fragment pause event [%s]", c17);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            if (c17 == null) {
                aVar.getClass();
            } else if (aVar.oj()) {
                gz1.d.f277714d.q(c17, true);
            }
        }
    }

    @Override // rk5.a
    public void cc(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        g52.h hVar = this.f268897d;
        ((g52.e) hVar.f268899b).c(activity);
        ((g52.e) hVar.f268899b).b(activity);
        if ((activity instanceof androidx.fragment.app.FragmentActivity) && b52.b.k(activity.getClass().getName())) {
            androidx.fragment.app.Fragment c17 = i52.l.c((androidx.fragment.app.FragmentActivity) activity);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellActivityStub", "onVASExit add fragment resume event [%s]", c17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(c17);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
