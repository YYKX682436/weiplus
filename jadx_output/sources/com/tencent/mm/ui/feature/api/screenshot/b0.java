package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class b0 extends ug5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208460d;

    public b0(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208460d = j1Var;
    }

    @Override // ug5.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.app.Activity activity2;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208460d;
        java.lang.ref.WeakReference weakReference = j1Var.f208502h;
        if (weakReference == null || (activity2 = (android.app.Activity) weakReference.get()) == null || !kotlin.jvm.internal.o.b(activity, activity2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onActivityDestroyed");
        activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
        j1Var.Di(activity2);
        j1Var.f208503i = null;
        j1Var.f208502h = null;
        com.tencent.mm.ui.feature.api.screenshot.x xVar = j1Var.f208501g;
        if (xVar != null) {
            xVar.b();
        }
        j1Var.f208501g = null;
        j1Var.f208504m = null;
    }
}
