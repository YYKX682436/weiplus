package s34;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public s34.e0 f402643a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f402644b = 0L;

    /* renamed from: c, reason: collision with root package name */
    public int f402645c;

    @za4.k1
    private s34.f0 wallpaperInfo;

    public static final s34.g0 c(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        s34.f0 f0Var = null;
        r5 = null;
        r5 = null;
        s34.g0 g0Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else if (map.containsKey(str)) {
            s34.g0 g0Var2 = new s34.g0();
            java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(str.concat(".previewJoinliveAdControlFlag")), 0L));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreviewJoinliveAdControlFlag", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            g0Var2.f402644b = valueOf;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreviewJoinliveAdControlFlag", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str.concat(".displayType")), 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDisplayType", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            g0Var2.f402645c = D1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDisplayType", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            java.lang.String concat = str.concat(".wallpaperInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo$Companion");
            if (concat == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo$Companion");
            } else {
                java.lang.String str2 = (java.lang.String) map.get(concat.concat(".frontImageUrl"));
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = (java.lang.String) map.get(concat.concat(".brandWallpaperImageUrl"));
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = (java.lang.String) map.get(concat.concat(".horizontalGravity"));
                int intValue = (str4 == null || (h18 = r26.h0.h(str4)) == null) ? 0 : h18.intValue();
                java.lang.String str5 = (java.lang.String) map.get(concat.concat(".verticalGravity"));
                f0Var = new s34.f0(str2, str3, intValue, (str5 == null || (h17 = r26.h0.h(str5)) == null) ? 0 : h17.intValue());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo$Companion");
            }
            g0Var2.d(f0Var);
            java.lang.String concat2 = str.concat(".finderLiveInfo");
            if (map.containsKey(concat2)) {
                s34.e0 e0Var = new s34.e0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                g0Var2.f402643a = e0Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                s34.e0 a17 = g0Var2.a();
                if (a17 != null) {
                    java.lang.String str6 = (java.lang.String) map.get(concat2 + ".finderLiveFeedExportId");
                    if (str6 == null) {
                        str6 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a17.f402622a = str6;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                s34.e0 a18 = g0Var2.a();
                if (a18 != null) {
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(concat2 + ".finderLiveId"), 0L));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a18.f402623b = valueOf2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                s34.e0 a19 = g0Var2.a();
                if (a19 != null) {
                    java.lang.String str7 = (java.lang.String) map.get(concat2 + ".finderLiveFeedNonceId");
                    if (str7 == null) {
                        str7 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a19.f402624c = str7;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                s34.e0 a27 = g0Var2.a();
                if (a27 != null) {
                    java.lang.String str8 = (java.lang.String) map.get(concat2 + ".finderUsername");
                    java.lang.String str9 = str8 != null ? str8 : "";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a27.f402625d = str9;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
            }
            if (map.containsKey(str.concat(".playerInfo"))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayerInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayerInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
            g0Var = g0Var2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return g0Var;
    }

    public final s34.e0 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        s34.e0 e0Var = this.f402643a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return e0Var;
    }

    public final s34.f0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        s34.f0 f0Var = this.wallpaperInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return f0Var;
    }

    public final void d(s34.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        this.wallpaperInfo = f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
    }
}
