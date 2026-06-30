package e94;

/* loaded from: classes4.dex */
public class a implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250367a;

    public a(java.lang.String str) {
        this.f250367a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
        com.tencent.mars.xlog.Log.e("CardImgCacheUtil", "onDownloadError, url=" + this.f250367a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
        com.tencent.mars.xlog.Log.i("CardImgCacheUtil", "onDownloaded, url=" + this.f250367a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
    }
}
