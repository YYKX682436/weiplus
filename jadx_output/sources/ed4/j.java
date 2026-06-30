package ed4;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f251310a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f251311b = "";

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        java.lang.String str = this.f251311b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        java.lang.String str = this.f251310a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        return str;
    }

    public final void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f251311b = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f251310a = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
    }
}
