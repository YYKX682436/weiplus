package q74;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.y0 f360598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f360599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f360600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s34.x0 f360601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f360602h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q74.b1 f360603i;

    public z0(q74.b1 b1Var, q74.y0 y0Var, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.x0 x0Var, boolean z17) {
        this.f360603i = b1Var;
        this.f360598d = y0Var;
        this.f360599e = cardLayoutManager;
        this.f360600f = snsInfo;
        this.f360601g = x0Var;
        this.f360602h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        this.f360603i.f360427j = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        q74.y0 y0Var = this.f360598d;
        if (y0Var != null && (frameLayout = y0Var.f360575h) != null) {
            android.content.Context context = frameLayout.getContext();
            if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
                com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardVideoPlayHelper", "doPlayVideo, but activity is finishing");
            } else {
                q74.b1 b1Var = this.f360603i;
                com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f360599e;
                android.widget.FrameLayout frameLayout2 = y0Var.f360575h;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360600f;
                r45.jj4 jj4Var = this.f360601g.f402828e;
                boolean z17 = this.f360602h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.i(cardLayoutManager, frameLayout2, snsInfo, jj4Var, z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$1");
    }
}
