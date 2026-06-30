package et2;

/* loaded from: classes10.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et2.e f256578d;

    public b(et2.e eVar) {
        this.f256578d = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) activity;
            et2.e eVar = this.f256578d;
            eVar.getClass();
            int hashCode = mMFragmentActivity.hashCode();
            java.lang.Integer num = (java.lang.Integer) eVar.f256585b.get(java.lang.Integer.valueOf(hashCode));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() <= 0) {
                et2.d dVar = new et2.d(mMFragmentActivity, eVar, hashCode, null);
                kotlinx.coroutines.l.c(eVar.f256584a, oz5.m.f350329d, kotlinx.coroutines.a1.DEFAULT, dVar);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        int hashCode = activity.hashCode();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f256578d.f256585b;
        concurrentHashMap.remove(java.lang.Integer.valueOf(hashCode));
        com.tencent.mars.xlog.Log.i("FinderJumpDataManager", "[clearTaskId] activityId=" + hashCode + ", taskIdMap.size=" + concurrentHashMap.size());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        kotlin.jvm.internal.o.g(activity, "activity");
        et2.e eVar = this.f256578d;
        eVar.getClass();
        int hashCode = activity.hashCode();
        java.lang.Integer num = (java.lang.Integer) eVar.f256585b.get(java.lang.Integer.valueOf(hashCode));
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f256586c;
        et2.a aVar = (et2.a) concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
        if (aVar == null || aVar.f256577b != hashCode) {
            return;
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(intValue));
        java.util.HashMap hashMap = eVar.f256587d;
        if (((et2.f) hashMap.get(java.lang.Integer.valueOf(hashCode))) != null) {
            if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
                nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                nyVar.B = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[onClear] jumpInfo");
        }
        hashMap.remove(java.lang.Integer.valueOf(hashCode));
        com.tencent.mars.xlog.Log.i("FinderJumpDataManager", "[clearIds] activityId=" + hashCode + ", sourceId=" + aVar.f256576a + " jumpDataMap.size=" + concurrentHashMap.size());
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
}
