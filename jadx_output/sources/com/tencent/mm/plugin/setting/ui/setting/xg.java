package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class xg implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI f161757d;

    public xg(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI) {
        this.f161757d = settingsModifyAliasUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17 = (editable == null || com.tencent.mm.sdk.platformtools.t8.K0(editable.toString()) || editable.toString().length() < 6) ? false : true;
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI = this.f161757d;
        settingsModifyAliasUI.f160522g.setEnabled(z17);
        if (z17) {
            return;
        }
        if (settingsModifyAliasUI.f160524i.getVisibility() == 0) {
            settingsModifyAliasUI.a7("");
        }
        settingsModifyAliasUI.f160525m.setTextColor(b3.l.getColor(settingsModifyAliasUI.getContext(), com.tencent.mm.R.color.f478520a84));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
