package x14;

/* loaded from: classes15.dex */
public final class w implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView f451468a;

    public w(com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView) {
        this.f451468a = settingPermissionView;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        java.lang.String permission;
        i11.h e17;
        com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView = this.f451468a;
        settingPermissionView.f161666p = z17;
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(settingPermissionView.getPermission(), settingPermissionView.getBusiness(), z17);
        long j17 = z17 ? 104L : 103L;
        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f61522d = j17;
        userPrivacySettingClientReportStruct.f61527i = userPrivacySettingClientReportStruct.b("DeviceID", wo.w0.c(), true);
        userPrivacySettingClientReportStruct.f61528j = userPrivacySettingClientReportStruct.b("CurrentPrivacyFullStatus", ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ui(), true);
        userPrivacySettingClientReportStruct.k();
        if (c01.e2.a0()) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).nj(settingPermissionView.getPermission(), settingPermissionView.getBusiness()) && z17) {
                if (((u60.g) i95.n0.c(u60.g.class)) != null && (e17 = i11.h.e()) != null) {
                    e17.l(settingPermissionView.f161667q, true, false, false);
                }
                permission = settingPermissionView.getPermission();
                java.lang.String business = settingPermissionView.getBusiness();
                settingPermissionView.getClass();
                if (kotlin.jvm.internal.o.b(permission, d85.g0.LOCAION.f227192d) || !kotlin.jvm.internal.o.b(business, d85.f0.G.f227176d)) {
                }
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("0,0,");
                stringBuffer.append(z17 ? 1 : 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37693, stringBuffer);
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingPermissionView", "report37693 for wxShop location switch, rptValue:" + ((java.lang.Object) stringBuffer));
                return;
            }
        }
        android.widget.TextView textView = settingPermissionView.f161665o;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = settingPermissionView.f161665o;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        permission = settingPermissionView.getPermission();
        java.lang.String business2 = settingPermissionView.getBusiness();
        settingPermissionView.getClass();
        if (kotlin.jvm.internal.o.b(permission, d85.g0.LOCAION.f227192d)) {
        }
    }
}
