package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes15.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f181219d = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin user cancel");
        com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI = (com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI) this.f181219d.get();
        if (wecoinIapUI != null) {
            nt4.f a17 = nt4.f.a(1);
            int i17 = com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI.f181123p;
            wecoinIapUI.U6(a17, -1);
        }
        return jz5.f0.f302826a;
    }
}
