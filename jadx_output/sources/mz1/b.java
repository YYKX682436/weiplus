package mz1;

/* loaded from: classes16.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f333083d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static volatile mz1.b f333084e;

    public static mz1.b b() {
        if (f333084e == null) {
            synchronized (mz1.b.class) {
                if (f333084e == null) {
                    f333084e = new mz1.b();
                }
            }
        }
        return f333084e;
    }

    public void a(mz1.c cVar) {
        if (cVar == null) {
            return;
        }
        java.util.List list = f333083d;
        if (((java.util.concurrent.CopyOnWriteArrayList) list).contains(cVar)) {
            return;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(cVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityCreated(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityDestroyed(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPaused(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostCreated(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostDestroyed(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostPaused(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostResumed(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostSaveInstanceState(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostStarted(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPostStopped(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPreCreated(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPreDestroyed(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPrePaused(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPreResumed(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPreSaveInstanceState(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPreStarted(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityPreStopped(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityResumed(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivitySaveInstanceState(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityStarted(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f333083d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).onActivityStopped(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }
}
