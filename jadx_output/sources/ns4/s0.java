package ns4;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339650d;

    public s0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339650d = weCoinEncashView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f339650d.showNormalStWcKb();
    }
}
