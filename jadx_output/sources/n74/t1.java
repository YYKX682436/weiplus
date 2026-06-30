package n74;

/* loaded from: classes4.dex */
public class t1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335436c;

    public t1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f335434a = str;
        this.f335435b = str2;
        this.f335436c = str3;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f335434a);
        sb6.append(" [http] failed, snsId=");
        sb6.append(this.f335435b);
        sb6.append(", url=");
        java.lang.String str = this.f335436c;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", sb6.toString());
        n74.v1.a().remove(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f335434a);
        sb6.append(" [http] succ, snsId=");
        sb6.append(this.f335435b);
        sb6.append(", url=");
        java.lang.String str2 = this.f335436c;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", sb6.toString());
        n74.v1.a().remove(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
    }
}
