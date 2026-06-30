package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes.dex */
public final class a implements com.tencent.mm.app.v6 {
    @Override // com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f22701a;
        ((jz5.n) bm5.m.f22703c).getValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "onActivityCreate[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r0)) {
            mVar.a("MMKVKey_CreatedActivity", activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "[onActivityCreated] getCreatedActivities:".concat(kz5.n0.g0(mVar.c(), ";", null, null, 0, null, bm5.g.f22580d, 30, null)));
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f22701a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "onActivityDestroy[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.h("MMKVKey_CreatedActivity", activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "[onActivityDestroyed] getCreatedActivities:".concat(kz5.n0.g0(mVar.c(), ";", null, null, 0, null, bm5.h.f22582d, 30, null)));
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f22701a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "onActivityPaused[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.h("MMKVKey_ResumedActivity", activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "[onActivityPaused] getResumedActivities:".concat(kz5.n0.g0(mVar.d(), ";", null, null, 0, null, bm5.i.f22690d, 30, null)));
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f22701a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "onActivityResumed[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.a("MMKVKey_ResumedActivity", activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "[onActivityResumed] getResumedActivities:".concat(kz5.n0.g0(mVar.d(), ";", null, null, 0, null, bm5.j.f22694d, 30, null)));
    }

    @Override // com.tencent.mm.app.v6
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(bundle, "bundle");
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f22701a;
        ((jz5.n) bm5.m.f22703c).getValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "onActivityStarted[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.a("MMKVKey_StartedActivity", activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "[onActivityStarted] getStartedActivities:".concat(kz5.n0.g0(mVar.e(), ";", null, null, 0, null, bm5.k.f22696d, 30, null)));
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f22701a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "onActivityStopped[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.h("MMKVKey_StartedActivity", activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStatusManager", "[onActivityStopped] getStartedActivities:".concat(kz5.n0.g0(mVar.e(), ";", null, null, 0, null, bm5.l.f22698d, 30, null)));
    }
}
