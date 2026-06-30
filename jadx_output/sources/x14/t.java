package x14;

/* loaded from: classes15.dex */
public final class t implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView f451465d;

    public t(com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView) {
        this.f451465d = settingPermissionView;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            java.util.List list = com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView.f161655s;
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingPermissionView", "getLocation fail");
            return false;
        }
        java.util.List list2 = com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView.f161655s;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingPermissionView", "getLocation suc");
        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
        if (gVar != null) {
            if (i11.h.e() != null) {
                i11.h.e().m(this);
            }
            com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView = this.f451465d;
            ((i11.g) ((t60.e) gVar).wi()).b(new u60.h(f18, f17, 11, java.lang.Integer.valueOf(settingPermissionView.hashCode()), true), settingPermissionView.getOnAddr());
        }
        return false;
    }
}
