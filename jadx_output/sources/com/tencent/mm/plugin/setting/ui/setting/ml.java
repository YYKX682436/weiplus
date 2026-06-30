package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class ml implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161335d;

    public ml(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161335d = settingsSearchAuthUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161335d;
        android.text.Editable text = settingsSearchAuthUI.f160634d.getFtsEditText().getEditText().getText();
        settingsSearchAuthUI.f160634d.getFtsEditText().getEditText().clearFocus();
        settingsSearchAuthUI.hideVKB();
        if (!com.tencent.mm.sdk.platformtools.t8.J0(text)) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.T6(settingsSearchAuthUI, text.toString().trim());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
