package fd4;

/* loaded from: classes4.dex */
public class p implements a94.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.r f261323a;

    public p(fd4.r rVar) {
        this.f261323a = rVar;
    }

    @Override // a94.x
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
        fd4.r rVar = this.f261323a;
        if (rVar.f261292i == null) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onShake, mSnsInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("ad_no_click_anim", true);
        rVar.r(bundle);
        rVar.l();
        rVar.k(36);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
    }
}
