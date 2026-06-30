package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon f172951d;

    public c5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon settingsTeenModeMainEmoticon) {
        this.f172951d = settingsTeenModeMainEmoticon;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainEmoticon$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon settingsTeenModeMainEmoticon = this.f172951d;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon.T6(settingsTeenModeMainEmoticon, 2);
        settingsTeenModeMainEmoticon.f172883g = 2;
        settingsTeenModeMainEmoticon.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainEmoticon$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
