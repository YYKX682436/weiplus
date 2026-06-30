package gt4;

/* loaded from: classes9.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView f275467d;

    public l2(com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView) {
        this.f275467d = wcPayMoneyLoadingView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayMoneyLoadingView", "show loading pb");
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f275467d;
        wcPayMoneyLoadingView.f180753e.setVisibility(0);
        wcPayMoneyLoadingView.f180756h = true;
    }
}
