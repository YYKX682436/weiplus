package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class ei implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI f161000d;

    public ei(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        this.f161000d = settingsModifyEmailAddrUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r61.r1 r1Var = new r61.r1((java.lang.String) gm0.j1.u().c().l(2, null));
        gm0.j1.d().g(r1Var);
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = this.f161000d;
        settingsModifyEmailAddrUI.f160536d = db5.e1.Q(settingsModifyEmailAddrUI.getContext(), settingsModifyEmailAddrUI.getString(com.tencent.mm.R.string.f490573yv), settingsModifyEmailAddrUI.getString(com.tencent.mm.R.string.iqd), true, true, new com.tencent.mm.plugin.setting.ui.setting.di(this, r1Var));
        settingsModifyEmailAddrUI.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
