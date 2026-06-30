package s34;

/* loaded from: classes4.dex */
public class z {
    public s34.z a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo$LiveCheerIconInfo");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.t8.C1((java.lang.String) map.get(str + ".sampleRate"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo$LiveCheerIconInfo");
        return this;
    }
}
