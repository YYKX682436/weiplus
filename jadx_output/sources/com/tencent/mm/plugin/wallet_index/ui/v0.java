package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes13.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI f181215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f181215d = wecoinIapUI;
        this.f181216e = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a aVar = (pr4.a) obj;
        kotlin.jvm.internal.o.g(aVar, "<name for destructuring parameter 0>");
        pr4.j jVar = aVar.f357985a;
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, onError, type:" + jVar);
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, insufficient, type:" + jVar);
        } else if (ordinal == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, intercept, type:" + jVar);
        }
        int i17 = this.f181215d.f181129i;
        com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI = (com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI) this.f181216e.get();
        if (wecoinIapUI != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_err_code", jVar.ordinal());
            intent.putExtra("key_err_msg", jVar.name());
            wecoinIapUI.setResult(-1, intent);
            wecoinIapUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
