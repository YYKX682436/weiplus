package rh4;

/* loaded from: classes.dex */
public final class m0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f395767d;

    public m0(android.widget.RelativeLayout relativeLayout) {
        this.f395767d = relativeLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.appbrand.service.k6 k6Var = (com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class);
        if (k6Var == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (!((com.tencent.mm.plugin.appbrand.app.t2) k6Var).Bi()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        android.content.Context inputContext = this.f395767d.getContext();
        if (((com.tencent.mm.plugin.appbrand.debugger.j0) i95.n0.c(com.tencent.mm.plugin.appbrand.debugger.j0.class)) != null) {
            kotlin.jvm.internal.o.g(inputContext, "inputContext");
            try {
                android.content.Context a17 = q75.a.a(inputContext);
                android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.class);
                if (a17 == null) {
                    a17 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    intent.addFlags(268435456);
                }
                if (a17 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/debug/AppBrandDebugFeatureService", "startAppBrandDebugUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    a17.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(a17, "com/tencent/mm/plugin/appbrand/debug/AppBrandDebugFeatureService", "startAppBrandDebugUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("AppBrandDebugFeatureService", e17, "", new java.lang.Object[0]);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
