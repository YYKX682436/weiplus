package com.tencent.mm.plugin.setting.ui.setting_new;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/MainSettingsUI;", "Lcom/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingPrefUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes.dex */
public final class MainSettingsUI extends com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI {
    @Override // com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI
    public java.lang.String U6() {
        java.lang.String string = getString(com.tencent.mm.R.string.izw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.u.class);
    }
}
