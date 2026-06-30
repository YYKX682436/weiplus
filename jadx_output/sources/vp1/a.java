package vp1;

/* loaded from: classes13.dex */
public final class a implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivityCreated, " + activity.getClass().getSimpleName() + ' ' + currentTimeMillis);
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (str = intent.getStringExtra("key_extra_info")) == null) {
            str = "";
        }
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            up1.b bVar = (up1.b) it.next();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_extraInfo_key", str);
            bVar.b(activity, intent2, currentTimeMillis);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivityDestroyed, " + activity.getClass().getSimpleName() + ' ' + currentTimeMillis);
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).w(activity, null, currentTimeMillis);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivityPaused, " + activity.getClass().getSimpleName() + ' ' + currentTimeMillis);
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).r(activity, null, currentTimeMillis);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivityResumed, " + activity.getClass().getSimpleName() + "  " + currentTimeMillis);
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            up1.b bVar = (up1.b) it.next();
            android.content.Intent intent = new android.content.Intent();
            android.content.Intent intent2 = activity.getIntent();
            if (intent2 == null || (str = intent2.getStringExtra("key_extra_info")) == null) {
                str = "";
            }
            intent.putExtra("finder_extraInfo_key", str);
            bVar.n(activity, intent, currentTimeMillis);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivitySaveInstanceState, " + activity.getClass().getSimpleName() + ' ' + currentTimeMillis);
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).t(activity, null, currentTimeMillis);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivityStarted, " + activity.getClass().getSimpleName() + "  " + currentTimeMillis);
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).l(activity, null, currentTimeMillis);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleAdapter", "onActivityStopped, " + activity.getClass().getSimpleName() + ' ' + currentTimeMillis);
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).y(activity, null, currentTimeMillis);
        }
    }
}
