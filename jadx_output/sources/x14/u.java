package x14;

/* loaded from: classes15.dex */
public final class u implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView f451466a;

    public u(com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView) {
        this.f451466a = settingPermissionView;
    }

    @Override // u60.e
    public final void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        java.util.List list = com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView.f161655s;
        addr.toString();
        com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView = this.f451466a;
        boolean z17 = settingPermissionView.f161666p;
        if (!settingPermissionView.f161666p) {
            android.widget.TextView textView = settingPermissionView.f161665o;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = settingPermissionView.f161665o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = settingPermissionView.f161665o;
        if (textView3 == null) {
            return;
        }
        textView3.setText(addr.f71212e + ' ' + addr.f71213f);
    }
}
