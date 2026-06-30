package um0;

/* loaded from: classes8.dex */
public class a implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.WeakHashMap f428700d = new java.util.WeakHashMap();

    public static java.lang.String a() {
        java.lang.String sb6;
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(weakHashMap.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                arrayList.addAll(weakHashMap.keySet());
            } catch (java.util.ConcurrentModificationException unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ActivityRefDump", "ConcurrentModificationException occur.");
                sb7.append("concurrent modification exception");
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.app.Activity activity = (android.app.Activity) it.next();
                if (activity != null) {
                    sb7.append("|");
                    sb7.append(activity.getClass().getSimpleName());
                    sb7.append("@");
                    sb7.append(activity.hashCode());
                    sb7.append(":");
                    sb7.append(f428700d.get(activity));
                }
            }
            sb6 = sb7.toString();
        }
        return sb6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 5);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityRefDump", "Activity dump [%s]", a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 1);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.util.WeakHashMap weakHashMap = f428700d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 4);
        }
    }
}
