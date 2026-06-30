package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.ae f160812a = new com.tencent.mm.plugin.setting.ui.setting.ae();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f160813b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f160814c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f160815d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f160816e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f160817f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f160818g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f160819h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f160820i = "";

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f160821j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f160822k = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f160823l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f160824m = "";

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f160825n = "";

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f160826o = "";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f160827p = "";

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f160828q = "";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f160829r = "";

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f160830s = "";

    public final r26.t a(java.lang.String str, int i17, boolean z17) {
        if (i17 == 1 || i17 == 3 || i17 == 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidResourceManager", "createHearingModelSelectorPattern: level is not 1, 3 or 5");
            return new r26.t("");
        }
        if (z17) {
            return new r26.t("HearingModelSelector_" + str + "_SNR_NA_AUD(\\d+)\\.wav");
        }
        return new r26.t("HearingModelSelector_" + str + "_SNR_L" + i17 + "_AUD(\\d+)\\.wav");
    }

    public final java.lang.Integer b(java.lang.String str, r26.t tVar) {
        r26.l lVar;
        r26.k e17;
        java.lang.String str2;
        r26.m b17 = tVar.b(str, 0);
        if (b17 == null || (lVar = ((r26.q) b17).f368911c) == null || (e17 = ((r26.p) lVar).e(1)) == null || (str2 = e17.f368900a) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2));
    }

    public final java.io.File[] c(java.lang.String str, int i17, boolean z17) {
        java.io.File file = new java.io.File(com.tencent.mm.vfs.q7.c("care_mode_hearing_aid"));
        java.io.File[] listFiles = file.listFiles(new com.tencent.mm.plugin.setting.ui.setting.yd(a(str, i17, z17)));
        if (listFiles == null) {
            listFiles = new java.io.File[0];
        }
        if (listFiles.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidResourceManager", "No matching files found in the directory: " + file.getPath());
            return new java.io.File[0];
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "getHearingAidModelSelectorFilesArray files count is : " + listFiles.length);
        return listFiles;
    }

    public final java.io.File[] d(int i17) {
        java.io.File file = new java.io.File(com.tencent.mm.vfs.q7.c("care_mode_hearing_aid"));
        java.io.File[] listFiles = file.listFiles(new com.tencent.mm.plugin.setting.ui.setting.zd(new r26.t("HearingLevelDetection_YS_SNR_L" + i17 + "_AUD(\\d+)\\.wav")));
        if (listFiles == null) {
            listFiles = new java.io.File[0];
        }
        if (listFiles.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidResourceManager", "No matching files found in the directory: " + file.getPath());
            return new java.io.File[0];
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "getTestDisableFilesArray files count is : " + listFiles.length);
        return listFiles;
    }
}
