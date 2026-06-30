package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class l5 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI, int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f161271d = settingsAboutMicroMsgUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$13", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.f160258w;
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161271d;
        settingsAboutMicroMsgUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsAboutMicroMsgUI.getContext(), false, 1);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.m5(settingsAboutMicroMsgUI);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.n5(settingsAboutMicroMsgUI);
        k0Var.v();
        jx3.f.INSTANCE.idkeyStat(250L, 30L, 1L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$13", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
