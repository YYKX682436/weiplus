package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class x6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI f161729d;

    public x6(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI) {
        this.f161729d = settingsAliasUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI = this.f161729d;
        if (settingsAliasUI.f160317e.getText() != null) {
            java.lang.String charSequence = settingsAliasUI.f160317e.getText().toString();
            int indexOf = charSequence.indexOf(58);
            if (indexOf >= 0 && indexOf < charSequence.length()) {
                charSequence = charSequence.substring(indexOf + 1).trim();
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(settingsAliasUI.f160317e.getText());
            spannableString.setSpan(new android.text.style.BackgroundColorSpan(settingsAliasUI.getResources().getColor(com.tencent.mm.R.color.f479302vi)), indexOf + 1, settingsAliasUI.f160317e.getText().length(), 33);
            settingsAliasUI.f160317e.setText(spannableString);
            rl5.r rVar = new rl5.r(settingsAliasUI, settingsAliasUI.f160317e);
            rVar.f397351u = new com.tencent.mm.plugin.setting.ui.setting.u6(this);
            rVar.f397354x = new com.tencent.mm.plugin.setting.ui.setting.v6(this, charSequence);
            rVar.L = new com.tencent.mm.plugin.setting.ui.setting.w6(this);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
