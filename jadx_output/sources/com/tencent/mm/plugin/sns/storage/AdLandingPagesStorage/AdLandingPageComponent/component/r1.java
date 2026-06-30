package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class r1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f165446a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f165447b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f165448c = new java.util.concurrent.ConcurrentHashMap();

    public r1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p1 p1Var) {
    }

    public final synchronized void a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1 t1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.util.Iterator it = this.f165446a.iterator();
        while (it.hasNext()) {
            if (((java.lang.ref.WeakReference) it.next()).get() == t1Var) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return;
            }
        }
        ((java.util.LinkedList) this.f165446a).add(new java.lang.ref.WeakReference(t1Var));
        ((java.util.concurrent.ConcurrentHashMap) this.f165447b).put(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.h0(t1Var), t1Var.u());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    public void b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1 t1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        if (t1Var == null || android.text.TextUtils.isEmpty(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.h0(t1Var))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "the btn comp is null or target apk pkg is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        } else {
            try {
                c();
                a(t1Var);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "add market btn has some error");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }
    }

    public final synchronized void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanNullRef", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.util.Iterator it = this.f165446a.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanNullRef", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    public final java.lang.String d(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        try {
            java.lang.String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            return schemeSpecificPart;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "getAppPackage, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            return "";
        }
    }

    public final void e(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.lang.String d17 = d(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "onPackageAdd, pkg=" + d17);
        if (android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            return;
        }
        g(d17, true, context.getString(com.tencent.mm.R.string.f493174j72));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        try {
            ab4.n0 n0Var = (ab4.n0) ((java.util.concurrent.ConcurrentHashMap) this.f165447b).get(d17);
            if (n0Var != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.o0(n0Var, 3, "0", "");
                ca4.d dVar = new ca4.d(n0Var.o(), n0Var.e(), n0Var.l(), n0Var.a(), n0Var.c(), n0Var.m(), n0Var.q());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s1 s1Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s1) ((java.util.concurrent.ConcurrentHashMap) this.f165448c).get(d17);
                    if (s1Var != null) {
                        dVar.a((int) (java.lang.System.currentTimeMillis() - s1Var.f165474a));
                    }
                    l44.z.e(dVar, 3);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "report error, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    public final void f(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.lang.String d17 = d(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "onPackageRemove, pkg=" + d17);
        if (android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        } else {
            g(d17, false, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }
    }

    public final synchronized void g(java.lang.String str, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppMarketBtnCmpText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        for (java.lang.ref.WeakReference weakReference : this.f165446a) {
            if (weakReference != null && weakReference.get() != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1 t1Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1) weakReference.get();
                if (str.equals(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.h0(t1Var))) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    t1Var.D = z17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    if (!z17) {
                        java.lang.String str3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.i0(t1Var).F;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        t1Var.p0(str3);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.i0(t1Var).f2815a2)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        t1Var.p0(str2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    } else {
                        java.lang.String str4 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.i0(t1Var).f2815a2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        t1Var.p0(str4);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppMarketBtnCmpText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        if (intent != null) {
            try {
                java.lang.String action = intent.getAction();
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    e(context, intent);
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    f(context, intent);
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "there is a exception in receiver");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }
}
