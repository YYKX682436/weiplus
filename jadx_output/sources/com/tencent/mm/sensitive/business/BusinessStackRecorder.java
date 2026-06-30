package com.tencent.mm.sensitive.business;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/sensitive/business/BusinessStackRecorder;", "Landroid/content/BroadcastReceiver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "e85/b", "e85/c", "sensitive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class BusinessStackRecorder extends android.content.BroadcastReceiver implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static final e85.b f193183f = new e85.b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f193184g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f193185h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.LinkedList f193186i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.LinkedList f193187m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f193188n = com.tencent.mm.sdk.platformtools.o4.M("BusinessStackRecorder");

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f193189o = jz5.h.b(e85.a.f250297d);

    /* renamed from: d, reason: collision with root package name */
    public final int f193190d = 1000;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f193191e;

    public BusinessStackRecorder() {
        try {
            d85.i1 i1Var = d85.i1.f227206a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(i1Var.a(context, "businessToActivityName.json"));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(next);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.util.HashMap hashMap = f193184g;
                    java.lang.String obj = jSONArray.get(i17).toString();
                    kotlin.jvm.internal.o.d(next);
                    hashMap.put(obj, next);
                }
            }
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(i1Var.a(context2, "keywordToBusinessMap.json"));
            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
            kotlin.jvm.internal.o.f(keys2, "keys(...)");
            while (keys2.hasNext()) {
                java.lang.String next2 = keys2.next();
                java.lang.String optString = jSONObject2.optString(next2);
                java.util.HashMap hashMap2 = f193185h;
                kotlin.jvm.internal.o.d(next2);
                kotlin.jvm.internal.o.d(optString);
                hashMap2.put(next2, optString);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "catch exception: " + e17.getMessage());
            j85.g.f298251a.b("initJson2Map", "[throwAbleStr] catch: " + e17.getCause());
        }
        this.f193191e = jz5.h.b(e85.f.f250307d);
    }

    public final void a(java.lang.String action, java.lang.String forceBusiness) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(forceBusiness, "forceBusiness");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(action);
        intent.putExtra("_application_context_process_", bm5.f1.a() + '@' + android.os.Process.myPid());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", forceBusiness);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", forceBusiness);
        intent.putExtra("MANUAL_BUSINESS", forceBusiness);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            c(intent);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public final void b(java.lang.String action, java.lang.String activityName, java.lang.String activityRef) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(activityName, "activityName");
        kotlin.jvm.internal.o.g(activityRef, "activityRef");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(action);
        intent.putExtra("_application_context_process_", bm5.f1.a() + '@' + android.os.Process.myPid());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", activityName);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", activityRef);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            c(intent);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public final void c(android.content.Intent intent) {
        e85.c cVar;
        if (intent != null) {
            java.lang.String action = intent.getAction();
            java.lang.String stringExtra = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME");
            java.lang.String stringExtra2 = intent.getStringExtra("_application_context_process_");
            java.lang.String stringExtra3 = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF");
            java.lang.String stringExtra4 = intent.getStringExtra("MANUAL_BUSINESS");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            if (action == null || stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
                cVar = null;
            } else {
                cVar = new e85.c(action, stringExtra, stringExtra3, stringExtra2, android.os.SystemClock.uptimeMillis());
                cVar.f250303f = stringExtra4;
            }
            if (cVar != null) {
                com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "receive " + cVar);
                jz5.g gVar = this.f193191e;
                ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).sendMessage(((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).obtainMessage(this.f193190d, cVar));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "onActivityDestroyed，activity = " + activity);
        b("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", activity.getClass().getName(), java.lang.String.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityPreCreated，activity = ");
        sb6.append(activity);
        sb6.append(", currentTopActivity = ");
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        java.lang.ref.WeakReference i17 = wVar.i();
        sb6.append(i17 != null ? (android.app.Activity) i17.get() : null);
        com.tencent.mars.xlog.Log.i("BusinessStackRecorder", sb6.toString());
        java.lang.ref.WeakReference i18 = wVar.i();
        if (kotlin.jvm.internal.o.b(activity, i18 != null ? (android.app.Activity) i18.get() : null) || !lk5.s.b(activity)) {
            b("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", activity.getClass().getName(), java.lang.String.valueOf(activity.hashCode()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResumed，activity = ");
        sb6.append(activity);
        sb6.append(", currentTopActivity = ");
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        java.lang.ref.WeakReference i17 = wVar.i();
        sb6.append(i17 != null ? (android.app.Activity) i17.get() : null);
        com.tencent.mars.xlog.Log.i("BusinessStackRecorder", sb6.toString());
        java.lang.ref.WeakReference i18 = wVar.i();
        if (kotlin.jvm.internal.o.b(activity, i18 != null ? (android.app.Activity) i18.get() : null) || !lk5.s.b(activity)) {
            b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", activity.getClass().getName(), java.lang.String.valueOf(activity.hashCode()));
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        c(intent);
    }
}
