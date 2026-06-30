package com.tencent.mm.plugin.finder.service;

@j95.b
/* loaded from: classes10.dex */
public final class l3 extends i95.w implements zy2.c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f126121d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f126122e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126123f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f126124g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126126i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f126127m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f126128n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f126129o;

    /* renamed from: p, reason: collision with root package name */
    public long f126130p;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f126135u;

    /* renamed from: x, reason: collision with root package name */
    public long f126138x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f126139y;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f126125h = jz5.h.b(com.tencent.mm.plugin.finder.service.k3.f126107d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f126131q = jz5.h.b(com.tencent.mm.plugin.finder.service.i3.f126080d);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f126132r = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f126133s = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f126134t = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f126136v = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f126137w = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    public l3() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.finder.service.a3(this));
        }
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.plugin.finder.service.b3(this));
    }

    public boolean Ai(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: acc not ready");
            return false;
        }
        if (!com.tencent.mm.plugin.finder.storage.t70.f127590a.U0()) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: finder multi task is close");
            return false;
        }
        if (!this.f126122e) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: failed needReenterFinder = " + this.f126122e);
            return false;
        }
        this.f126121d = false;
        this.f126122e = false;
        if (!Vi()) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: failed is finder task forground");
            return false;
        }
        this.f126126i = true;
        activity.getIntent().putExtra("KEY_REENTER_FINDER", true);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_NEED_ANIM", true);
        i0Var.Yj(activity, intent);
        activity.overridePendingTransition(com.tencent.mm.R.anim.f477888ec, com.tencent.mm.R.anim.f477884e8);
        com.tencent.mm.plugin.finder.report.b2.f124965a.a(com.tencent.mm.plugin.finder.report.y1.f125457q);
        return true;
    }

    public void Bi(android.content.Context context, int i17) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(context, "context");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "checkShowMultiTaskDialog: acc not ready");
            return;
        }
        if (this.f126127m) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (t70Var.U0()) {
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null && (intent = activity.getIntent()) != null && intent.getBooleanExtra("KEY_REENTER_FINDER", false)) {
                    intent.removeExtra("KEY_REENTER_FINDER");
                    return;
                }
                this.f126127m = false;
                if (this.f126128n == null) {
                    this.f126128n = java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITH_NAVI_BOOLEAN_SYNC, false));
                }
                if (this.f126129o == null) {
                    this.f126129o = java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITHOUT_NAVI_BOOLEAN_SYNC, false));
                }
                java.lang.Boolean bool = this.f126128n;
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                if (kotlin.jvm.internal.o.b(bool, bool2) && kotlin.jvm.internal.o.b(this.f126129o, bool2)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "checkShowMultiTaskDialog: withNaviAnimShown = " + this.f126128n + ", withNaviAnimShown = " + this.f126128n);
                int g17 = com.tencent.mm.ui.bl.g(context);
                boolean z17 = g17 > 0 && com.tencent.mm.ui.bk.j(context) <= g17;
                if ((z17 && kotlin.jvm.internal.o.b(this.f126128n, bool2)) || (!z17 && kotlin.jvm.internal.o.b(this.f126129o, bool2))) {
                    return;
                }
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, true);
                z2Var.x(1);
                z2Var.y(context.getString(com.tencent.mm.R.string.f490454vi));
                z2Var.F = new com.tencent.mm.plugin.finder.service.g3(z2Var, this);
                z2Var.i(com.tencent.mm.R.layout.f489042b43);
                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.f485201gw0);
                if (mMPAGView != null) {
                    mMPAGView.o(((java.lang.Boolean) t70Var.Z0().r()).booleanValue());
                    if (mMPAGView.getUseRfx()) {
                        mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(context.getAssets(), z17 ? "finder_multi_task_guide_with_navigation_bar.pag" : "finder_multi_task_guide_without_navigation_bar.pag"));
                    } else {
                        mMPAGView.setComposition(org.libpag.PAGFile.Load(context.getAssets(), z17 ? "finder_multi_task_guide_with_navigation_bar.pag" : "finder_multi_task_guide_without_navigation_bar.pag"));
                    }
                    mMPAGView.setRepeatCount(0);
                    mMPAGView.g();
                }
                z2Var.l(new com.tencent.mm.plugin.finder.service.h3(z2Var, this, i17));
                z2Var.C();
                bj(true, i17, 0);
                this.f126138x = c01.id.c();
                this.f126139y = false;
                if (z17) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITH_NAVI_BOOLEAN_SYNC, bool2);
                    this.f126128n = bool2;
                } else {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITHOUT_NAVI_BOOLEAN_SYNC, bool2);
                    this.f126129o = bool2;
                }
            }
        }
    }

    public boolean Di(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return wi(activity.getTaskId());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:0: B:4:0x000d->B:64:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(boolean r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.service.l3.Ni(boolean):void");
    }

    public final int Ri() {
        return ((java.lang.Number) ((jz5.n) this.f126131q).getValue()).intValue();
    }

    public android.app.Activity Ui() {
        java.util.Set set = this.f126132r;
        kotlin.jvm.internal.o.d(set);
        return (android.app.Activity) kz5.n0.j0(set);
    }

    public final boolean Vi() {
        if (this.f126132r.size() != 0) {
            return false;
        }
        java.util.Set enterFinderActivity = this.f126133s;
        if (enterFinderActivity.size() <= 0) {
            return false;
        }
        kotlin.jvm.internal.o.f(enterFinderActivity, "enterFinderActivity");
        java.util.Iterator it = enterFinderActivity.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((androidx.appcompat.app.AppCompatActivity) it.next()).getClass(), com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class)) {
                return true;
            }
        }
        return false;
    }

    public boolean Zi(android.content.Context context) {
        boolean z17;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        java.lang.String className;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo2;
        android.content.ComponentName componentName;
        java.lang.String className2;
        java.lang.String className3;
        kotlin.jvm.internal.o.g(context, "context");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "isFinderTaskForeground: acc not ready");
            return false;
        }
        if (this.f126132r.size() == 0) {
            return false;
        }
        java.util.Set enterFinderActivity = this.f126133s;
        kotlin.jvm.internal.o.f(enterFinderActivity, "enterFinderActivity");
        boolean z18 = true;
        if (!enterFinderActivity.isEmpty()) {
            java.util.Iterator it = enterFinderActivity.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(((androidx.appcompat.app.AppCompatActivity) it.next()).getClass(), com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
        try {
            java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || (runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) kz5.n0.Z(runningTasks)) == null) {
                return false;
            }
            android.content.ComponentName componentName2 = runningTaskInfo.baseActivity;
            if (componentName2 == null || (className3 = componentName2.getClassName()) == null || !className3.equals(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.class).d())) {
                z18 = false;
            }
            if (!z18) {
                android.content.ComponentName componentName3 = runningTaskInfo.baseActivity;
                if (componentName3 == null || (className = componentName3.getClassName()) == null) {
                    return false;
                }
                return className.equals(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class).d());
            }
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks2 = activityManager.getRunningTasks(2);
            if (runningTasks2 == null || (runningTaskInfo2 = (android.app.ActivityManager.RunningTaskInfo) kz5.n0.k0(runningTasks2)) == null || (componentName = runningTaskInfo2.baseActivity) == null || (className2 = componentName.getClassName()) == null) {
                return false;
            }
            return className2.equals(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class).d());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "isFinderTaskForeground: ams is dead", th6);
            return false;
        }
    }

    public void aj() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "onLauncherUIStart: acc not ready");
            return;
        }
        java.util.Set set = this.f126132r;
        kotlin.jvm.internal.o.d(set);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) kz5.n0.j0(set);
        jz5.f0 f0Var = null;
        if (appCompatActivity != null) {
            if (!(!appCompatActivity.isFinishing())) {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onLauncherUIStart: finder activity is still foreground");
                this.f126122e = true;
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onLauncherUIStart: isHomeFromFinder = " + this.f126121d);
            this.f126122e = this.f126121d;
        }
    }

    public final void bj(boolean z17, int i17, int i18) {
        if (z17) {
            this.f126138x = c01.id.c();
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderMultiTaskGuideShowStruct finderMultiTaskGuideShowStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderMultiTaskGuideShowStruct();
        finderMultiTaskGuideShowStruct.f57444d = i17;
        if (!z17) {
            if (this.f126138x == 0) {
                return;
            }
            finderMultiTaskGuideShowStruct.f57446f = c01.id.c() - this.f126138x;
            finderMultiTaskGuideShowStruct.f57445e = i18;
            this.f126138x = 0L;
        }
        finderMultiTaskGuideShowStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderMultiTaskGuideShowStruct);
    }

    public void cj() {
        java.util.Set set = this.f126132r;
        kotlin.jvm.internal.o.d(set);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) kz5.n0.j0(set);
        if (appCompatActivity != null) {
            kd2.o0 o0Var = kd2.p1.N;
            if (!((java.util.Set) ((jz5.n) kd2.p1.P).getValue()).contains(appCompatActivity.getClass())) {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = appCompatActivity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "wechat_push_card", 0, null, false, null, 56, null);
            }
        }
    }

    public final boolean wi(int i17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "isFinderTaskForeground: acc not ready");
            return false;
        }
        java.util.Set enterFinderActivity = this.f126133s;
        kotlin.jvm.internal.o.f(enterFinderActivity, "enterFinderActivity");
        java.util.Iterator it = enterFinderActivity.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((androidx.appcompat.app.AppCompatActivity) obj2).getClass(), com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class)) {
                break;
            }
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) obj2;
        kotlin.jvm.internal.o.f(enterFinderActivity, "enterFinderActivity");
        java.util.Iterator it6 = enterFinderActivity.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b(((androidx.appcompat.app.AppCompatActivity) next).getClass(), com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI.class)) {
                obj = next;
                break;
            }
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity2 = (androidx.appcompat.app.AppCompatActivity) obj;
        return (appCompatActivity != null && appCompatActivity.getTaskId() == i17) || (appCompatActivity2 != null && appCompatActivity2.getTaskId() == i17);
    }
}
