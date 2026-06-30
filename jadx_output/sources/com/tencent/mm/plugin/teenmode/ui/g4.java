package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173011d;

    public g4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173011d = settingsTeenModeMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f173011d;
        settingsTeenModeMain.getClass();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).Ib()) {
            android.content.Intent intent = new android.content.Intent(settingsTeenModeMain, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon.class);
            com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain2 = this.f173011d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(settingsTeenModeMain2, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(settingsTeenModeMain, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther.class);
        intent2.putExtra("biz_type", 10);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain3 = this.f173011d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent2);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(settingsTeenModeMain3, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsTeenModeMain3.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(settingsTeenModeMain3, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
