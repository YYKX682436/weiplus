package com.tencent.mm.plugin.setting.ui.setting_new;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/SearchSettingsUI;", "Lcom/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SearchSettingsUI extends com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eig;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        findViewById(com.tencent.mm.R.id.b5i).setOnClickListener(new z14.a(this));
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.n.class);
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.r.class);
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.s.class);
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.y.class);
    }
}
