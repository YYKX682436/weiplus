package qp5;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp5.k f365842d;

    public i(qp5.k kVar) {
        this.f365842d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String a17 = j62.e.g().a("clicfg_wcpay_host_change_to_cn_android", "", false, false);
        boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(a17) || com.tencent.mm.sdk.platformtools.t8.P(a17, 0) == 0) ? false : true;
        qp5.k kVar = this.f365842d;
        if (z17) {
            com.tencent.mm.wallet_core.ui.r1.V(kVar.f365843d, "https://tenpay.wechatpay.cn/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
        } else {
            com.tencent.mm.wallet_core.ui.r1.V(kVar.f365843d, "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
        }
        new com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent().e();
    }
}
