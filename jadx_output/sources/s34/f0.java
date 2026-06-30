package s34;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f402629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f402630b;

    @za4.k1(resType = 2)
    private final java.lang.String brandWallpaperImageUrl;

    @za4.k1(resType = 2)
    private final java.lang.String frontImageUrl;

    public f0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.frontImageUrl = str;
        this.brandWallpaperImageUrl = str2;
        this.f402629a = i17;
        this.f402630b = i18;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandWallpaperImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo");
        java.lang.String str = this.brandWallpaperImageUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandWallpaperImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo");
        java.lang.String str = this.frontImageUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo");
        return str;
    }
}
