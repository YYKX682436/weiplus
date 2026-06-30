package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon f172936d;

    public b5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon settingsTeenModeMainEmoticon) {
        this.f172936d = settingsTeenModeMainEmoticon;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainEmoticon$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon settingsTeenModeMainEmoticon = this.f172936d;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon.T6(settingsTeenModeMainEmoticon, 0);
        settingsTeenModeMainEmoticon.f172883g = 0;
        settingsTeenModeMainEmoticon.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainEmoticon$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
