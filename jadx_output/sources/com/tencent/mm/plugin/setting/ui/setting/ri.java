package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ri implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI f161511d;

    public ri(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI) {
        this.f161511d = settingsModifyPatSuffixUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI = this.f161511d;
        settingsModifyPatSuffixUI.f160551f.removeTextChangedListener(settingsModifyPatSuffixUI.f160558p);
        h12.m mVar = new h12.m(editable.toString(), (int) settingsModifyPatSuffixUI.f160551f.getPaint().getTextSize());
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        editable.toString();
        int i17 = settingsModifyPatSuffixUI.f160556n;
        if (a17 > i17) {
            java.lang.String b17 = mVar.b(i17, t4Var);
            settingsModifyPatSuffixUI.f160553h.setText(settingsModifyPatSuffixUI.getString(com.tencent.mm.R.string.ikd, java.lang.Integer.valueOf(settingsModifyPatSuffixUI.f160556n / 2)));
            settingsModifyPatSuffixUI.f160553h.setTextColor(settingsModifyPatSuffixUI.getResources().getColor(com.tencent.mm.R.color.f479482a31));
            settingsModifyPatSuffixUI.f160553h.performHapticFeedback(3, 2);
            if (settingsModifyPatSuffixUI.f160555m.e()) {
                settingsModifyPatSuffixUI.f160555m.c(5000L, 5000L);
            }
            settingsModifyPatSuffixUI.f160551f.setText(pg5.d.a(settingsModifyPatSuffixUI, b17));
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = settingsModifyPatSuffixUI.f160551f;
            mMClearEditText.setSelection(mMClearEditText.getText().length());
        } else if (a17 < i17) {
            settingsModifyPatSuffixUI.f160555m.d();
            settingsModifyPatSuffixUI.f160553h.setText(settingsModifyPatSuffixUI.getString(com.tencent.mm.R.string.ike));
            settingsModifyPatSuffixUI.f160553h.setTextColor(settingsModifyPatSuffixUI.getResources().getColor(com.tencent.mm.R.color.f478873jj));
        }
        settingsModifyPatSuffixUI.f160552g.setEnabled(true);
        settingsModifyPatSuffixUI.f160551f.addTextChangedListener(settingsModifyPatSuffixUI.f160558p);
        if (a17 > 0) {
            settingsModifyPatSuffixUI.f160550e.setSmileySendButtonEnable(true);
        } else {
            settingsModifyPatSuffixUI.f160550e.setSmileySendButtonEnable(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
