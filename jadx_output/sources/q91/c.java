package q91;

/* loaded from: classes7.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360887d;

    public c(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        this.f360887d = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Context context = this.f360887d;
        if (40 == menuItem.getItemId()) {
            com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().q(com.tencent.luggage.sdk.processes.c.f47630d);
            return;
        }
        if (30 == menuItem.getItemId()) {
            try {
                android.content.Context context2 = this.f360887d;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/debug/AppBrandDebugFeatureService$showChooseSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/debug/AppBrandDebugFeatureService$showChooseSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.lang.ClassNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("AppBrandLauncherUIForceEntryConfig", e17, "", new java.lang.Object[0]);
                dp.a.makeText(context, "RELEASE包不支持调试入口", 0).show();
                return;
            }
        }
        if (20 == menuItem.getItemId()) {
            com.tencent.mm.plugin.appbrand.u1 u1Var = com.tencent.mm.plugin.appbrand.u1.f89261a;
            l81.b1 b1Var = new l81.b1();
            com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("AppBrandLauncherUIForceEntryConfig");
            kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
            java.lang.String string = R.getString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", null);
            if (string == null) {
                string = "wxb6d22f922f37b35a";
            }
            b1Var.f317014b = string;
            b1Var.f317032k = 1112;
            b1Var.f317028i = new ek1.e(1, null);
            u1Var.a(b1Var, new q91.b());
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 R2 = com.tencent.mm.sdk.platformtools.o4.R("AppBrandLauncherUIForceEntryConfig");
        kotlin.jvm.internal.o.f(R2, "getSingleMMKV(...)");
        R2.d();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            R2.putBoolean("KEY_FORCE_NATIVE_LAUNCHER", true);
            return;
        }
        if (itemId == 1 || itemId == 2 || itemId == 3) {
            R2.putBoolean("KEY_FORCE_WE_USE_FAKE_NATIVE", true);
            R2.putString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", itemId == 2 ? "wx6bd2fb149a93a9c5" : null);
            R2.putBoolean("KEY_FORCE_FAKE_NATIVE_DEBUG", itemId == 3);
        }
    }
}
