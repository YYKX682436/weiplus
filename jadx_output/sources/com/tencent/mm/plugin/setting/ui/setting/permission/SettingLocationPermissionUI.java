package com.tencent.mm.plugin.setting.ui.setting.permission;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingLocationPermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingLocationPermissionUI extends com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI {
    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int T6() {
        return com.tencent.mm.R.layout.cks;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int U6() {
        return com.tencent.mm.R.string.ilf;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int V6() {
        return com.tencent.mm.R.string.irz;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mol);
        int i17 = c01.e2.a0() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/permission/SettingLocationPermissionUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/permission/SettingLocationPermissionUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
