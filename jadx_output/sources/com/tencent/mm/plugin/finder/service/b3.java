package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class b3 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f126011a;

    public b3(com.tencent.mm.plugin.finder.service.l3 l3Var) {
        this.f126011a = l3Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        android.app.Activity activity;
        com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "APP EnterForeground");
        java.lang.ref.WeakReference weakReference = this.f126011a.f126135u;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "globalTopActivity is null!");
            return;
        }
        i95.m c17 = i95.n0.c(zy2.gb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        au2.q qVar = (au2.q) ((zy2.gb) c17);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "checkIfRemoveShortcut, account not ready, return!");
            return;
        }
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        dq.b bVar = ((cq.k) c18).f221226g;
        com.tencent.mm.sdk.platformtools.o4 o4Var = bVar.f242284a;
        boolean h17 = o4Var != null ? o4Var.h("kFinderIsShortcutsExistKey") : false;
        boolean Bi = qVar.Bi(activity);
        if (!h17 && Bi) {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = bVar.f242284a;
            if (o4Var2 != null) {
                o4Var2.G("kFinderIsShortcutsExistKey", true);
            }
        } else if (h17 && !Bi) {
            com.tencent.mm.sdk.platformtools.o4 o4Var3 = bVar.f242284a;
            if (o4Var3 != null) {
                o4Var3.G("kFinderIsShortcutsExistKey", false);
            }
            i95.m c19 = i95.n0.c(dy1.r.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ((cy1.a) ((dy1.r) c19)).yj("finder_quick_remove", null, null, 1, true);
        }
        if (!(activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI)) {
            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "currentActivity is not MMFinderUI!");
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMLiveFinderUI) {
            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "current Activity is MMLiveFinderUI, skip!");
            return;
        }
        i95.m c27 = i95.n0.c(com.tencent.mm.plugin.finder.service.l3.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        if (((com.tencent.mm.plugin.finder.service.l3) c27).Di(activity)) {
            pm0.v.X(new au2.o(qVar, activity, Bi));
        } else {
            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "currentActivity is not in finder stack!");
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "APP ExitForeground");
        i95.m c17 = i95.n0.c(zy2.gb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((au2.q) ((zy2.gb) c17)).f14090h = -1;
    }
}
