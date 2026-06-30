package r84;

/* loaded from: classes4.dex */
public final class f extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView f393327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView adBulletScreenView, android.os.Looper looper) {
        super(looper);
        this.f393327a = adBulletScreenView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$mAnimHandler$1");
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView.f163544t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBulletScreenInfo$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView adBulletScreenView = this.f393327a;
        s34.c cVar = adBulletScreenView.f163545d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBulletScreenInfo$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        if (cVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$mAnimHandler$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        adBulletScreenView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView = adBulletScreenView.f163546e;
        if (adBulletScreenRecyclerView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        } else {
            s34.c cVar2 = adBulletScreenView.f163545d;
            if (cVar2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            } else {
                int currentScrollY = adBulletScreenRecyclerView.getCurrentScrollY();
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(currentScrollY, adBulletScreenView.f163549h + currentScrollY + adBulletScreenView.f163551m);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBulletShootingDuration", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
                long j17 = cVar2.f402592g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBulletShootingDuration", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
                ofInt.setDuration(j17);
                ofInt.addUpdateListener(new r84.e(adBulletScreenRecyclerView));
                ofInt.start();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsStopAnim$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        boolean z17 = adBulletScreenView.f163547f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsStopAnim$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        if (!z17) {
            removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBulletShootingTime", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            long j18 = cVar.f402593h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBulletShootingTime", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            sendEmptyMessageDelayed(1, j18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$mAnimHandler$1");
    }
}
