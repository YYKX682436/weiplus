package com.tencent.mm.plugin.setting.ui.setting.permission;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingVoiceAssistantPermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingVoiceAssistantPermissionUI extends com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f161440f = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f161441e;

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int T6() {
        return com.tencent.mm.R.layout.enh;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int U6() {
        return com.tencent.mm.R.string.phi;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI
    public int V6() {
        return com.tencent.mm.R.string.phw;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcq);
        if (scrollView != null) {
            scrollView.post(new s14.g(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.moj);
        if (textView != null) {
            textView.setGravity(17);
            textView.setText(getString(com.tencent.mm.R.string.phi));
        }
        this.f161441e = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.btf);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        boolean z17 = intValue == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceAssistantPermission", "onCreate: read switch value from ConfigStorage = " + intValue + " (0=NOT_SET, 1=ON, 2=OFF), isChecked = " + z17);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f161441e;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(z17);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f161441e;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(s14.h.f402149a);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = this.f161441e;
        if (mMSwitchBtn3 != null) {
            mMSwitchBtn3.setSwitchListener(new s14.i(this));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487608vo4);
        if (textView2 != null) {
            java.lang.String string = getString(com.tencent.mm.R.string.phj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format("<a href='%s'>%s</a>", java.util.Arrays.copyOf(new java.lang.Object[]{"https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/HBS2pZuIGJqUG0cC", string}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView2.setText(format);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView2, 1);
        }
    }
}
