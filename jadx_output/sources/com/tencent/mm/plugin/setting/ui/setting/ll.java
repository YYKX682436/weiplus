package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class ll implements tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161300d;

    public ll(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161300d = settingsSearchAuthUI;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "onEditTextChange search totalText %s", str);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.f160633z;
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161300d;
        settingsSearchAuthUI.W6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.V6(settingsSearchAuthUI);
            return;
        }
        android.view.View view = settingsSearchAuthUI.f160635e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchBgView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchBgView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingsSearchAuthUI.f160637g.setVisibility(0);
        settingsSearchAuthUI.f160639i.setVisibility(8);
        settingsSearchAuthUI.f160638h.setVisibility(8);
        settingsSearchAuthUI.f160642o.setVisibility(8);
        ((java.util.ArrayList) settingsSearchAuthUI.f160640m).clear();
        settingsSearchAuthUI.removeAllOptionMenu();
        java.lang.String string = settingsSearchAuthUI.getString(com.tencent.mm.R.string.f490549y8);
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(string + " " + str.trim());
        f0Var.c(new android.text.style.ForegroundColorSpan(settingsSearchAuthUI.getResources().getColor(com.tencent.mm.R.color.f478734fp)), string.length(), f0Var.length(), 33);
        settingsSearchAuthUI.f160637g.setText(f0Var);
    }

    @Override // tj5.n
    public boolean G0() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161300d;
        android.text.Editable text = settingsSearchAuthUI.f160634d.getFtsEditText().getEditText().getText();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "search key down text: %s", text.toString());
        settingsSearchAuthUI.f160637g.setVisibility(8);
        settingsSearchAuthUI.f160634d.getFtsEditText().getEditText().clearFocus();
        settingsSearchAuthUI.hideVKB();
        settingsSearchAuthUI.removeAllOptionMenu();
        if (com.tencent.mm.sdk.platformtools.t8.J0(text)) {
            return true;
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.T6(settingsSearchAuthUI, text.toString().trim());
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "searchView hasFocus %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161300d;
        if (z17) {
            settingsSearchAuthUI.showVKB();
        } else {
            settingsSearchAuthUI.hideVKB();
        }
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "clear search text");
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.f160633z;
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161300d;
        settingsSearchAuthUI.W6();
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.V6(settingsSearchAuthUI);
    }
}
