package xp3;

/* loaded from: classes12.dex */
public class c implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455919d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f455920e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f455921f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.elf.AbstractProcessChecker f455922g;

    public c(com.tencent.mm.plugin.performance.elf.AbstractProcessChecker abstractProcessChecker, xp3.b bVar) {
        this.f455922g = abstractProcessChecker;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity.getClass().getSimpleName().endsWith("WeChatSplashActivity")) {
            this.f455920e = true;
            com.tencent.mars.xlog.Log.i(this.f455922g.e(), "WeChatSplashActivity was created!");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f455919d)) {
            this.f455919d = activity.getClass().getName();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.f455919d = activity.getClass().getName();
        this.f455921f = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f455919d)) {
            this.f455919d = activity.getClass().getName();
        }
        this.f455921f = false;
    }
}
