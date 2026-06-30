package com.tencent.mm.plugin.setting.ui.setting.permission;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingNFCPermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingNFCPermissionUI extends com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f161438f = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f161439e;

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int T6() {
        return com.tencent.mm.R.layout.eng;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int U6() {
        return com.tencent.mm.R.string.p8h;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int V6() {
        return com.tencent.mm.R.string.p_j;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f161439e = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.btf);
        boolean z17 = false;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((java.lang.Integer) m18).intValue();
        if (intValue == 1 || (intValue != 2 && intValue2 == 1)) {
            z17 = true;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f161439e;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(z17);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f161439e;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(s14.e.f402146a);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = this.f161439e;
        if (mMSwitchBtn3 != null) {
            mMSwitchBtn3.setSwitchListener(new s14.f(this));
        }
    }
}
