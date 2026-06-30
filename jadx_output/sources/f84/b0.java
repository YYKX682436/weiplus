package f84;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f260172a;

    /* renamed from: b, reason: collision with root package name */
    public int f260173b;

    @za4.k1(resType = 2)
    private java.lang.String bottomImageUrl;

    @za4.k1(resType = 2)
    private java.lang.String bottomImageUrlDark;

    /* renamed from: c, reason: collision with root package name */
    public int f260174c;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    /* renamed from: d, reason: collision with root package name */
    public int f260175d;

    @za4.k1(resType = 2)
    private java.lang.String topicUrl;

    @za4.k1(resType = 2)
    private java.lang.String topicUrlDark;

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImageUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        java.lang.String str = this.bottomImageUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImageUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        java.lang.String str = this.bottomImageUrlDark;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        return str;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        return adClickActionInfo;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        java.lang.String str = this.topicUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        return str;
    }

    public final java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        java.lang.String str = this.topicUrlDark;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        return str;
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBottomImageUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        this.bottomImageUrl = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomImageUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
    }

    public final void g(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBottomImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        this.bottomImageUrlDark = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
    }

    public final void h(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        this.clickActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
    }

    public final void i(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopicUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        this.topicUrl = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopicUrl", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
    }

    public final void j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopicUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
        this.topicUrlDark = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopicUrlDark", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
    }
}
