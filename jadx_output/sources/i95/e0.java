package i95;

/* loaded from: classes12.dex */
public class e0 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        i95.n0.f289827k = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        android.view.View decorView;
        if (com.tencent.mm.app.v5.a(i95.n0.f289817a) != com.tencent.mm.app.v5.f53851h) {
            return;
        }
        if (!k95.b.a(activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ServiceManager", "catch first screen '%s' but not the first business ui, skip notify this time.", activity);
            return;
        }
        if (!i95.n0.g()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ServiceManager", "not login, don't regard this ui '%s' as first screen, skip notify this time.", activity);
            return;
        }
        android.view.Window window = activity.getWindow();
        if (window == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceManager", "fail to get window of '%s', notify account init now.", activity);
            decorView = null;
        } else {
            decorView = window.getDecorView();
            if (decorView == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ServiceManager", "fail to get decor view of '%s', notify account init now.", activity);
            }
        }
        if (decorView == null) {
            i95.n0.f289829m.postAtFrontOfQueue(i95.n0.f289832p);
        } else if (decorView.getViewTreeObserver() != null) {
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new i95.d0(this, decorView));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceManager", "fail to get view tree observer of '%s', notify account init now.", activity);
            i95.n0.f289829m.postAtFrontOfQueue(i95.n0.f289832p);
        }
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
