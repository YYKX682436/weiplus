package n74;

/* loaded from: classes4.dex */
public class r1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335424b;

    public r1(java.lang.String str, java.lang.String str2) {
        this.f335423a = str;
        this.f335424b = str2;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        java.util.Set a17 = n74.v1.a();
        java.lang.String str = this.f335423a;
        a17.remove(str);
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", this.f335424b + " [landingPageImg] failed, url=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        java.util.Set a17 = n74.v1.a();
        java.lang.String str2 = this.f335423a;
        a17.remove(str2);
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", this.f335424b + " [landingPageImg] succ, url=" + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
    }
}
