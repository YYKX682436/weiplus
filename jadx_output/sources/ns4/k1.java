package ns4;

/* loaded from: classes8.dex */
public final class k1 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.na7 f339573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339574b;

    public k1(r45.na7 na7Var, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339573a = na7Var;
        this.f339574b = weCoinEncashView;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        java.lang.String str = this.f339573a.f381214f;
        if (str != null) {
            com.tencent.mm.wallet_core.ui.r1.V(this.f339574b, str, false);
        }
    }
}
