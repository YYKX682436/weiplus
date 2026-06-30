package ih4;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f291598a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f291599b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f291600c = 0;

    public int a(int i17) {
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 4;
        }
        if (i17 == 3) {
            return 6;
        }
        if (i17 == 4) {
            return 5;
        }
        if (i17 == 6) {
            return 10;
        }
        if (i17 == 25) {
            return 8;
        }
        if (i17 != 21) {
            return i17 != 22 ? 0 : 8;
        }
        return 9;
    }

    public void b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58) {
        int i59;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo appBrandLocationInfo;
        com.tencent.mars.xlog.Log.i("TaskBarReporter", "reportTaskBarAppear actionType:%d, weappCount:%d, commUsedWeAppCount:%d, myWeAppCount:%d，enterSource:%d， isRefreshData:%d, taskBarVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), java.lang.Integer.valueOf(this.f291600c));
        com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_AppearStruct appBrandTaskBar_AppearStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_AppearStruct();
        appBrandTaskBar_AppearStruct.f55171d = appBrandTaskBar_AppearStruct.b("session_id", this.f291599b, true);
        appBrandTaskBar_AppearStruct.f55172e = i17;
        appBrandTaskBar_AppearStruct.f55173f = i18;
        appBrandTaskBar_AppearStruct.f55174g = i19;
        appBrandTaskBar_AppearStruct.f55175h = i27;
        appBrandTaskBar_AppearStruct.f55176i = i28;
        appBrandTaskBar_AppearStruct.f55177j = i29;
        appBrandTaskBar_AppearStruct.f55178k = i37;
        appBrandTaskBar_AppearStruct.f55179l = i38;
        appBrandTaskBar_AppearStruct.f55180m = i39;
        appBrandTaskBar_AppearStruct.f55181n = i47;
        appBrandTaskBar_AppearStruct.f55186s = i48;
        appBrandTaskBar_AppearStruct.f55182o = i49;
        appBrandTaskBar_AppearStruct.f55183p = 0L;
        appBrandTaskBar_AppearStruct.f55184q = 0L;
        appBrandTaskBar_AppearStruct.f55185r = i57;
        appBrandTaskBar_AppearStruct.f55187t = i58;
        if (i48 > 0) {
            ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).Ai();
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData appBrandCommonUsedTransferData = com.tencent.mm.plugin.appbrand.appusage.j0.f76479m;
            java.lang.String str = appBrandCommonUsedTransferData.f76343f;
            if (str == null) {
                str = "";
            }
            appBrandTaskBar_AppearStruct.f55193z = appBrandTaskBar_AppearStruct.b("commuse_extra_data", str, true);
            if (appBrandCommonUsedTransferData.f76341d) {
                appBrandTaskBar_AppearStruct.f55192y = appBrandTaskBar_AppearStruct.b("ssid_hash", appBrandCommonUsedTransferData.f76345h, true);
                appBrandTaskBar_AppearStruct.f55191x = appBrandTaskBar_AppearStruct.b("bssid_hash", appBrandCommonUsedTransferData.f76344g, true);
            }
            if (appBrandCommonUsedTransferData.f76342e && (appBrandLocationInfo = appBrandCommonUsedTransferData.f76346i) != null && appBrandLocationInfo.a()) {
                appBrandTaskBar_AppearStruct.f55189v = appBrandTaskBar_AppearStruct.b("latitude", "" + appBrandCommonUsedTransferData.f76346i.f76347d, true);
                appBrandTaskBar_AppearStruct.f55188u = appBrandTaskBar_AppearStruct.b("longitude", "" + appBrandCommonUsedTransferData.f76346i.f76348e, true);
                appBrandTaskBar_AppearStruct.f55190w = appBrandTaskBar_AppearStruct.b("accuracy", "" + appBrandCommonUsedTransferData.f76346i.f76351h, true);
            }
        }
        if (i49 == 1 && (i59 = this.f291600c) > 0) {
            appBrandTaskBar_AppearStruct.A = i59;
        }
        appBrandTaskBar_AppearStruct.k();
    }

    public void c(int i17, int i18, int i19, java.lang.String str, int i27, int i28, int i29, int i37, java.lang.String str2, int i38) {
        com.tencent.mars.xlog.Log.i("TaskBarReporter", "reportTaskBarFeedAddDelete actionType:%d, actionChannel:%d, contentType:%d, contentId:%s, username:%s, appType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, java.lang.Integer.valueOf(i38));
        com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AddDeleteStruct appBrandTaskBar_Feed_AddDeleteStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AddDeleteStruct();
        appBrandTaskBar_Feed_AddDeleteStruct.f55212d = appBrandTaskBar_Feed_AddDeleteStruct.b("session_id", this.f291599b, true);
        appBrandTaskBar_Feed_AddDeleteStruct.f55213e = appBrandTaskBar_Feed_AddDeleteStruct.b("action_type", java.lang.String.valueOf(i17), true);
        appBrandTaskBar_Feed_AddDeleteStruct.f55214f = i18;
        appBrandTaskBar_Feed_AddDeleteStruct.f55215g = i19;
        appBrandTaskBar_Feed_AddDeleteStruct.f55216h = appBrandTaskBar_Feed_AddDeleteStruct.b("content_id", str, true);
        appBrandTaskBar_Feed_AddDeleteStruct.f55217i = i27;
        appBrandTaskBar_Feed_AddDeleteStruct.f55218j = i28;
        appBrandTaskBar_Feed_AddDeleteStruct.f55219k = i29;
        appBrandTaskBar_Feed_AddDeleteStruct.f55220l = i37;
        appBrandTaskBar_Feed_AddDeleteStruct.f55222n = appBrandTaskBar_Feed_AddDeleteStruct.b("app_username", str2, true);
        appBrandTaskBar_Feed_AddDeleteStruct.f55223o = i38;
        appBrandTaskBar_Feed_AddDeleteStruct.k();
    }

    public void d(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, java.lang.String str3, int i27, int i28, java.lang.String str4, int i29) {
        com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AppearStruct appBrandTaskBar_Feed_AppearStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AppearStruct();
        appBrandTaskBar_Feed_AppearStruct.f55224d = appBrandTaskBar_Feed_AppearStruct.b("session_id", this.f291599b, true);
        appBrandTaskBar_Feed_AppearStruct.f55225e = i17;
        appBrandTaskBar_Feed_AppearStruct.f55226f = i18;
        appBrandTaskBar_Feed_AppearStruct.f55227g = appBrandTaskBar_Feed_AppearStruct.b("conent_list", str, true);
        appBrandTaskBar_Feed_AppearStruct.f55228h = i19;
        appBrandTaskBar_Feed_AppearStruct.f55233m = appBrandTaskBar_Feed_AppearStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, str3, true);
        appBrandTaskBar_Feed_AppearStruct.f55231k = i27;
        appBrandTaskBar_Feed_AppearStruct.f55236p = appBrandTaskBar_Feed_AppearStruct.b(dm.i4.COL_USERNAME, str4, true);
        appBrandTaskBar_Feed_AppearStruct.f55234n = this.f291598a;
        if (i18 == 14) {
            appBrandTaskBar_Feed_AppearStruct.f55235o = i28;
        }
        appBrandTaskBar_Feed_AppearStruct.f55232l = i29;
        if (str2 != null) {
            appBrandTaskBar_Feed_AppearStruct.f55229i = appBrandTaskBar_Feed_AppearStruct.b("icon_appid", str2, true);
        }
        appBrandTaskBar_Feed_AppearStruct.k();
    }

    public void e(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, java.lang.String str3, int i27, java.lang.String str4, int i28) {
        com.tencent.mars.xlog.Log.i("TaskBarReporter", "reportTaskBarFeedClick pageType:%d, pageFeedIndex:%d, contentId:%s, extraData:%s, isRefreshData:%d, username:%s, appType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str3, java.lang.Integer.valueOf(i27), str4, java.lang.Integer.valueOf(i28));
        com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_ClickStruct appBrandTaskBar_ClickStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_ClickStruct();
        appBrandTaskBar_ClickStruct.f55194d = appBrandTaskBar_ClickStruct.b("session_id", this.f291599b, true);
        appBrandTaskBar_ClickStruct.f55195e = i17;
        appBrandTaskBar_ClickStruct.f55196f = i18;
        appBrandTaskBar_ClickStruct.f55197g = appBrandTaskBar_ClickStruct.b("content_id", str, true);
        appBrandTaskBar_ClickStruct.f55198h = i19;
        appBrandTaskBar_ClickStruct.f55202l = appBrandTaskBar_ClickStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, str3, true);
        appBrandTaskBar_ClickStruct.f55203m = java.lang.System.currentTimeMillis();
        if (i17 == 14) {
            appBrandTaskBar_ClickStruct.f55204n = i27;
        }
        appBrandTaskBar_ClickStruct.f55205o = appBrandTaskBar_ClickStruct.b(dm.i4.COL_USERNAME, str4, true);
        if (str2 != null) {
            appBrandTaskBar_ClickStruct.f55199i = appBrandTaskBar_ClickStruct.b("icon_appid", str2, true);
        }
        appBrandTaskBar_ClickStruct.f55201k = i28;
        appBrandTaskBar_ClickStruct.k();
    }
}
