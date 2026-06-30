package t34;

/* loaded from: classes4.dex */
public class c extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI f415418e;

    public c(com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI snsAdAnimProxyUI) {
        this.f415418e = snsAdAnimProxyUI;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$2");
        com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "onAnimationEnd");
        com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.T6(9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        this.f415418e.U6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$2");
    }
}
