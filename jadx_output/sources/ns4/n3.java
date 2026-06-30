package ns4;

/* loaded from: classes8.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView, java.lang.String str) {
        super(0);
        this.f339599d = weCoinRechargeView;
        this.f339600e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean Jj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalite4868fef42257e6693a564693bd119376");
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339599d;
        if (Jj) {
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj("wxalite4868fef42257e6693a564693bd119376") == null) {
                if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).vj() == null) {
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.tencent.mm.plugin.lite.logic.g1.s().h(null);
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite4868fef42257e6693a564693bd119376", null);
                Jj = false;
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", "wxalite4868fef42257e6693a564693bd119376");
                com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "open liteapp:wxalite4868fef42257e6693a564693bd119376,page:");
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(weCoinRechargeView.getContext(), bundle, true, false, null);
            }
        }
        if (!Jj) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f339600e);
            intent.putExtra("showShare", false);
            intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            com.tencent.mm.wallet_core.ui.r1.T(weCoinRechargeView.getContext(), intent);
        }
        return jz5.f0.f302826a;
    }
}
