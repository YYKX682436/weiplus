package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowManager f208576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f208577b;

    public x(android.view.WindowManager windowManager) {
        kotlin.jvm.internal.o.g(windowManager, "windowManager");
        this.f208576a = windowManager;
        this.f208577b = new java.util.LinkedHashMap();
    }

    public final void a(int i17, android.view.View view, android.view.WindowManager.LayoutParams layoutParams) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        try {
            this.f208576a.addView(view, layoutParams);
            java.util.Map map = this.f208577b;
            map.put(java.lang.Integer.valueOf(i17), new java.lang.ref.WeakReference(view));
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "addView, viewMapSize: " + map.size());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "addView, failed: " + th6.getMessage());
        }
    }

    public final void b() {
        jz5.f0 f0Var;
        java.util.Map map = this.f208577b;
        java.util.List<jz5.l> v17 = kz5.e1.v(map);
        ((java.util.LinkedHashMap) map).clear();
        for (jz5.l lVar : v17) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) lVar.f302834e).get();
                if (view != null) {
                    this.f208576a.removeViewImmediate(view);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "clear, viewMapSize: " + map.size());
    }

    public final void c(int i17) {
        java.util.Map map = this.f208577b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "removeView, viewId not found in viewMap, skip");
            return;
        }
        map.remove(java.lang.Integer.valueOf(i17));
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "removeView, viewRef gets null, view might have been GC, skip");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f208576a.removeViewImmediate(view);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "removeView, viewMapSize: " + map.size());
    }
}
