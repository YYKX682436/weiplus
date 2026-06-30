package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class zh implements android.text.InputFilter {
    public zh(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        return charSequence.length() < 1 ? spanned.subSequence(i19, i27) : "";
    }
}
