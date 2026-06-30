package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class d1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f152600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f152601b;

    public d1(com.tencent.mm.ui.widget.dialog.z2 z2Var, android.app.Activity activity) {
        this.f152600a = z2Var;
        this.f152601b = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f152600a.B();
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q = null;
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152486r = null;
        boolean z17 = true;
        yo3.b.b("offlinePayShortcutFallbackGoSetting", 1);
        try {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            l34.i iVar = l34.i.f315436b;
            boolean b17 = iVar.b();
            android.app.Activity activity = this.f152601b;
            if (b17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutService", "jumpToShortcutPermissionSettingPage: vendor page");
                iVar.c(activity);
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "jumpToPermissionSettings: fallback to ACTION_APPLICATION_DETAILS_SETTINGS");
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + activity.getPackageName()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion", "jumpToPermissionSettings", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion", "jumpToPermissionSettings", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflinePayShortcutGuideUI", "jumpToPermissionSettings failed: %s", e17.getMessage());
        }
    }
}
