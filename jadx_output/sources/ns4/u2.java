package ns4;

/* loaded from: classes8.dex */
public final class u2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339662d;

    public u2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339662d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        androidx.appcompat.app.AppCompatActivity context = this.f339662d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        os4.h.e(context, (ms4.a) obj, null);
    }
}
