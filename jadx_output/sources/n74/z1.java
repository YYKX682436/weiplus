package n74;

/* loaded from: classes4.dex */
public class z1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f335456a;

    public z1(android.widget.ImageView imageView) {
        if (imageView != null) {
            this.f335456a = new java.lang.ref.WeakReference(imageView);
        }
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
        com.tencent.mars.xlog.Log.i("AdUserAvatarHelper", "the downloaded path is " + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
    }
}
