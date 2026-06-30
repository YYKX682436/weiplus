package n74;

/* loaded from: classes4.dex */
public class y1 extends n74.z1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f335449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.widget.ImageView imageView, int i17, java.lang.String str) {
        super(imageView);
        this.f335449b = i17;
        this.f335450c = str;
    }

    @Override // n74.z1, za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
        com.tencent.mars.xlog.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: download has something error");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
    }

    @Override // n74.z1, za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
        super.c(str);
        com.tencent.mars.xlog.Log.i("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: download is success, it is going to set image view");
        java.lang.ref.WeakReference weakReference = this.f335456a;
        if (weakReference != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView != null) {
                i64.m1.f289238c.c(imageView, str, this.f335449b);
            } else {
                com.tencent.mars.xlog.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn, imageViewRef released, url=" + this.f335450c);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
    }
}
