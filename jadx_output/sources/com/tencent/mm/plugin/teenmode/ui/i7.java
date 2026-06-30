package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class i7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI f173035d;

    public i7(com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI) {
        this.f173035d = teenModeVerifyPwdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(editable.toString());
        com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI = this.f173035d;
        if (!K0) {
            teenModeVerifyPwdUI.f172914g.setEnabled(true);
        } else {
            teenModeVerifyPwdUI.f172914g.setEnabled(false);
            teenModeVerifyPwdUI.Z6("");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
