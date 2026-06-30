package fp3;

/* loaded from: classes9.dex */
public class e implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI f265304a;

    public e(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f265304a = mallOrderDetailInfoUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f265304a;
        java.lang.String str = mallOrderDetailInfoUI.f152831h.f152823e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("pay_channel", 1);
        com.tencent.mm.wallet_core.ui.r1.T(mallOrderDetailInfoUI, intent);
    }
}
