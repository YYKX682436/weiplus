package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class y5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f173196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI f173197e;

    public y5(android.widget.Button button, com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
        this.f173196d = button;
        this.f173197e = teenModeGuardianInfoUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI.f172897g;
        com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f173197e;
        this.f173196d.setEnabled(((com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) teenModeGuardianInfoUI.f172898e).getValue()).length() > 0 && ((com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) teenModeGuardianInfoUI.f172899f).getValue()).length() > 0);
        com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI.Z6(teenModeGuardianInfoUI, "");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
