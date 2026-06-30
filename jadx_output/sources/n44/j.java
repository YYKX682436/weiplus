package n44;

/* loaded from: classes4.dex */
public final class j implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.p f334954d;

    public j(n44.p pVar) {
        this.f334954d = pVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityCreated", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityCreated", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityDestroyed", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        n44.p.a(this.f334954d);
        com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "onActivityDestroyed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityDestroyed", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityPaused", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        n44.p.a(this.f334954d);
        com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "onActivityPaused");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityPaused", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResumed", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResumed", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivitySaveInstanceState", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivitySaveInstanceState", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityStarted", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityStarted", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityStopped", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityStopped", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$2");
    }
}
