package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class eh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f160999d;

    public eh(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f160999d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
        modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
        modifyAliasLogStruct.f59239e = 7L;
        modifyAliasLogStruct.f59241g = 3L;
        modifyAliasLogStruct.k();
        this.f160999d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
