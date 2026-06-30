package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes7.dex */
public class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram f173097d;

    public o5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram) {
        this.f173097d = settingsTeenModeMainMiniProgram;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.service.k6 k6Var = (com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class);
        android.content.Context context = this.f173097d.getContext();
        ((com.tencent.mm.plugin.appbrand.app.t2) k6Var).getClass();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_get_usage_reason", 3);
        intent.putExtra("extra_enter_scene", 5);
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.f89355f.a(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
