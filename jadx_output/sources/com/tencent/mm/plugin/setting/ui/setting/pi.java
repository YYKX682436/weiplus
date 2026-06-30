package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class pi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI f161445d;

    public pi(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI) {
        this.f161445d = settingsModifyPatSuffixUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyPatSuffixUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI = this.f161445d;
        settingsModifyPatSuffixUI.hideVKB();
        android.text.Editable text = settingsModifyPatSuffixUI.f160551f.getText();
        settingsModifyPatSuffixUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyPatSuffixUI", "doModifyPatSuffixScene %s", text);
        r45.mo4 mo4Var = new r45.mo4();
        mo4Var.f380712d = com.tencent.mm.sdk.platformtools.t8.o(text.toString()).trim();
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, mo4Var));
        settingsModifyPatSuffixUI.f160554i = db5.e1.Q(settingsModifyPatSuffixUI.getContext(), "", settingsModifyPatSuffixUI.getString(com.tencent.mm.R.string.gy7), false, false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyPatSuffixUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
