package rk5;

/* loaded from: classes14.dex */
public final class b implements rk5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final rk5.b f397141d = new rk5.b();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f397142e = new java.util.ArrayList();

    @Override // rk5.a
    public void D5(java.lang.Object caller, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(caller, "caller");
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                boolean z17 = activityLifecycleCallbacks instanceof rk5.a;
                if (z17) {
                    rk5.a aVar = z17 ? (rk5.a) activityLifecycleCallbacks : null;
                    if (aVar != null) {
                        aVar.D5(caller, intent);
                    }
                }
            }
        }
    }

    @Override // rk5.a
    public void H(android.app.Activity caller) {
        kotlin.jvm.internal.o.g(caller, "caller");
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                boolean z17 = activityLifecycleCallbacks instanceof rk5.a;
                if (z17) {
                    rk5.a aVar = z17 ? (rk5.a) activityLifecycleCallbacks : null;
                    if (aVar != null) {
                        aVar.H(caller);
                    }
                }
            }
        }
    }

    public final android.app.Application.ActivityLifecycleCallbacks[] a() {
        java.lang.Object[] array;
        java.util.ArrayList arrayList = f397142e;
        synchronized (arrayList) {
            array = arrayList.size() > 0 ? arrayList.toArray(new android.app.Application.ActivityLifecycleCallbacks[0]) : null;
        }
        return (android.app.Application.ActivityLifecycleCallbacks[]) array;
    }

    public final boolean b() {
        return android.os.Build.VERSION.SDK_INT < 29;
    }

    public final void c(android.app.Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = f397142e;
        synchronized (arrayList) {
            arrayList.add(callback);
        }
    }

    @Override // rk5.a
    public void cc(android.app.Activity caller) {
        kotlin.jvm.internal.o.g(caller, "caller");
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                boolean z17 = activityLifecycleCallbacks instanceof rk5.a;
                if (z17) {
                    rk5.a aVar = z17 ? (rk5.a) activityLifecycleCallbacks : null;
                    if (aVar != null) {
                        aVar.cc(caller);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        java.util.Objects.toString(bundle);
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityDestroyed(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPaused(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        java.util.Objects.toString(bundle);
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(android.app.Activity activity) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(activity);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPostDestroyed", "(Landroid/app/Activity;)V", this, array);
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b()) {
            yj0.a.h(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPostDestroyed", "(Landroid/app/Activity;)V");
            return;
        }
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostDestroyed(activity);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPostDestroyed", "(Landroid/app/Activity;)V");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPostPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPostResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPostStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPostStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(activity);
        arrayList.add(bundle);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", this, array);
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        java.util.Objects.toString(bundle);
        if (b()) {
            yj0.a.h(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V");
            return;
        }
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPreDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPrePaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPreResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPreStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        android.app.Application.ActivityLifecycleCallbacks[] a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        if (b() || (a17 = a()) == null) {
            return;
        }
        for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
            if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                activityLifecycleCallbacks = null;
            }
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPreStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityResumed(activity);
                }
            }
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
        activity.toString();
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityStarted(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.toString();
        android.app.Application.ActivityLifecycleCallbacks[] a17 = a();
        if (a17 != null) {
            for (android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a17) {
                if (!(activityLifecycleCallbacks instanceof android.app.Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityStopped(activity);
                }
            }
        }
    }
}
