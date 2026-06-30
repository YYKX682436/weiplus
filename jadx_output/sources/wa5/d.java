package wa5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final wa5.d f444315a = new wa5.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f444316b = new java.util.WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final android.app.SharedElementCallback f444317c = new wa5.c();

    public final wa5.b a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        java.util.WeakHashMap weakHashMap = f444316b;
        wa5.b bVar = (wa5.b) weakHashMap.get(activity);
        if (bVar != null) {
            return bVar;
        }
        wa5.b bVar2 = new wa5.b(false, false, null, null, null, false, 63, null);
        weakHashMap.put(activity, bVar2);
        return bVar2;
    }

    public final void b(android.app.Activity activity, boolean z17, wa5.a aVar) {
        java.lang.String str;
        if (aVar == null) {
            aVar = new wa5.a();
        }
        if (z17) {
            str = "MM.Transition.callback." + activity.getClass().getSimpleName() + ", enter";
        } else {
            str = "MM.Transition.callback." + activity.getClass().getSimpleName() + ", exit";
        }
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f444308a = str;
        if (z17) {
            activity.setEnterSharedElementCallback(aVar);
        } else {
            activity.setExitSharedElementCallback(aVar);
        }
    }

    public final void c(final android.app.Activity activity) {
        androidx.lifecycle.o mo133getLifecycle;
        final wa5.b a17 = a(activity);
        if (a17.f444309a) {
            return;
        }
        a17.f444309a = true;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
        if (appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.ui.anim.transition.MMTransitionHelper$tryRegisterObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                android.app.Activity activity2 = activity;
                activity2.getClass();
                wa5.d dVar = wa5.d.f444315a;
                android.app.SharedElementCallback sharedElementCallback = wa5.d.f444317c;
                activity2.setEnterSharedElementCallback(sharedElementCallback);
                activity2.setExitSharedElementCallback(sharedElementCallback);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = dVar.a(activity2).f444311c.iterator();
                while (it.hasNext()) {
                    android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((java.lang.ref.WeakReference) it.next()).get();
                    if (resultReceiver != null) {
                        resultReceiver.send(106, null);
                        sb6.append("c:" + resultReceiver + ' ');
                    }
                }
                if (!(sb6.length() > 0)) {
                    com.tencent.mars.xlog.Log.i("MM.Transition", "onDestroy() act:" + activity2 + " coordinator is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MM.Transition", "onDestroy() act:" + activity2 + " coordinator is not null " + ((java.lang.Object) sb6));
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
            public final void onStop() {
                if (!wa5.b.this.f444310b || android.os.Build.VERSION.SDK_INT < 29) {
                    return;
                }
                android.app.Activity activity2 = activity;
                if (((androidx.appcompat.app.AppCompatActivity) activity2).isFinishing()) {
                    return;
                }
                new android.app.Instrumentation().callActivityOnSaveInstanceState(activity2, new android.os.Bundle());
            }
        });
    }
}
