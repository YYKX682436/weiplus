package n74;

/* loaded from: classes4.dex */
public class s1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335431c;

    public s1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f335429a = str;
        this.f335430b = str2;
        this.f335431c = str3;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f335429a);
        sb6.append(" [cdn] failed, snsId=");
        sb6.append(this.f335430b);
        sb6.append(", url=");
        java.lang.String str = this.f335431c;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        n74.v1.f335443b.remove(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f335429a);
        sb6.append(" [cdn] succ, snsId=");
        sb6.append(this.f335430b);
        sb6.append(", url=");
        java.lang.String str2 = this.f335431c;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        n74.v1.f335443b.remove(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
    }
}
