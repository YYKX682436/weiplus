package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class l4 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.m4 f173062a;

    public l4(com.tencent.mm.plugin.teenmode.ui.m4 m4Var) {
        this.f173062a = m4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.plugin.teenmode.ui.m4 m4Var = this.f173062a;
            android.content.Intent intent = new android.content.Intent(m4Var.f173072d.f173081d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
            intent.putExtra("intent_process", 5);
            com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = m4Var.f173072d.f173081d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(settingsTeenModeMain, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(settingsTeenModeMain, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
