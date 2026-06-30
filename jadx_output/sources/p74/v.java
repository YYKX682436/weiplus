package p74;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p74.w f352601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f352602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f352603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f352604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s34.x0 f352605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f352606i;

    public v(p74.w wVar, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.x0 x0Var, boolean z17) {
        this.f352601d = wVar;
        this.f352602e = frameLayout;
        this.f352603f = cardLayoutManager;
        this.f352604g = snsInfo;
        this.f352605h = x0Var;
        this.f352606i = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$doPlayVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsDelayVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        this.f352601d.f352612f = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsDelayVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        android.content.Context context = this.f352602e.getContext();
        if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardVideoPlayHelper", "doPlayVideo, but activity is finishing");
        } else {
            p74.w wVar = this.f352601d;
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f352603f;
            android.widget.FrameLayout frameLayout = this.f352602e;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f352604g;
            r45.jj4 jj4Var = this.f352605h.f402828e;
            boolean z17 = this.f352606i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.j(cardLayoutManager, frameLayout, snsInfo, jj4Var, z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$doPlayVideo$1");
    }
}
