package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ch implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f160915a;

    public ch(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI, android.widget.Button button) {
        this.f160915a = button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
        modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
        modifyAliasLogStruct.f59239e = 5L;
        modifyAliasLogStruct.k();
        this.f160915a.setEnabled(z17);
    }
}
