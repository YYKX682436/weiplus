package q74;

/* loaded from: classes4.dex */
public class v0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f360553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q74.x0 f360555c;

    public v0(q74.x0 x0Var, android.widget.ImageView imageView, java.lang.String str) {
        this.f360555c = x0Var;
        this.f360553a = imageView;
        this.f360554b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
        android.widget.ImageView imageView = this.f360553a;
        imageView.setTag(com.tencent.mm.R.id.n1z, "");
        com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloadError, hash = " + imageView.hashCode() + ", url = " + this.f360554b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView = this.f360553a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
        try {
            java.lang.String str2 = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z);
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "" : za4.t0.l("adId", str2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(l17)) {
                q74.x0 x0Var = this.f360555c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                x0Var.J(imageView, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                imageView.hashCode();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
    }
}
