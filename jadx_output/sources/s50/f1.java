package s50;

/* loaded from: classes12.dex */
public final class f1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f403048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f403051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f403052h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f403053i;

    public f1(com.tencent.mm.ui.MMActivity mMActivity, s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var, int i17, android.app.Application application) {
        this.f403048d = mMActivity;
        this.f403049e = l1Var;
        this.f403050f = weakReference;
        this.f403051g = v0Var;
        this.f403052h = i17;
        this.f403053i = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity act, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(act, "act");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity act) {
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        kotlin.jvm.internal.o.g(act, "act");
        if (act != this.f403048d || (activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) this.f403049e.f403083g.remove(java.lang.Integer.valueOf(this.f403052h))) == null) {
            return;
        }
        this.f403053i.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity act) {
        kotlin.jvm.internal.o.g(act, "act");
        if (act != this.f403048d || ((com.tencent.mm.ui.MMActivity) act).isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: activity moved to background from showNativeVoiceForWebView");
        this.f403049e.Vi(this.f403050f);
        this.f403051g.y();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity act) {
        kotlin.jvm.internal.o.g(act, "act");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity act, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(act, "act");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity act) {
        kotlin.jvm.internal.o.g(act, "act");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity act) {
        kotlin.jvm.internal.o.g(act, "act");
    }
}
