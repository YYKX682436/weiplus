package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram f173063d;

    public l5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram) {
        this.f173063d = settingsTeenModeMainMiniProgram;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram = this.f173063d;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram.T6(settingsTeenModeMainMiniProgram, 1);
        settingsTeenModeMainMiniProgram.f172892h = 1;
        settingsTeenModeMainMiniProgram.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
