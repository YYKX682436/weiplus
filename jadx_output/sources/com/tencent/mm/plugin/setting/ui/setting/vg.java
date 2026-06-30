package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class vg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI f161646d;

    public vg(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI settingsModifyAliasCheckUI) {
        this.f161646d = settingsModifyAliasCheckUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = {com.tencent.mm.sdk.platformtools.m2.d()};
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI settingsModifyAliasCheckUI = this.f161646d;
        c71.b.c(settingsModifyAliasCheckUI, settingsModifyAliasCheckUI.getString(com.tencent.mm.R.string.iit, objArr), -1, true);
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
        modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
        modifyAliasLogStruct.f59239e = 8L;
        modifyAliasLogStruct.k();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
