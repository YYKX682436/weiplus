package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class p2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xj6 f148463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f148464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.y1 f148465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView f148466g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView mallWalletSectionCellView, r45.xj6 xj6Var, l81.e1 e1Var, com.tencent.mm.plugin.wallet_core.utils.y1 y1Var) {
        super(false);
        this.f148466g = mallWalletSectionCellView;
        this.f148463d = xj6Var;
        this.f148464e = e1Var;
        this.f148465f = y1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.String str;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tiny_app_scene", com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT);
        bundle.putString("realname_verify_process_jump_plugin", "mall");
        bundle.putString("realname_verify_process_jump_activity", ".ui.MallWalletUI");
        com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView mallWalletSectionCellView = this.f148466g;
        android.content.Context context = mallWalletSectionCellView.getContext();
        r45.xj6 xj6Var = this.f148463d;
        com.tencent.mm.plugin.wallet_core.utils.z1.d(context, xj6Var.f390173n, bundle, this.f148464e, this.f148465f, null);
        com.tencent.mm.autogen.events.TableCellClickEvent tableCellClickEvent = new com.tencent.mm.autogen.events.TableCellClickEvent();
        tableCellClickEvent.f54881g.f7377a = xj6Var.f390171i;
        tableCellClickEvent.e();
        int i17 = com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView.f148298v;
        mallWalletSectionCellView.b();
        r45.bm5 bm5Var = xj6Var.f390170h;
        int i18 = 3;
        str = "";
        if (bm5Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(bm5Var.f370873e)) {
            com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView.a(mallWalletSectionCellView, xj6Var.f390170h.f370873e);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, xj6Var.f390170h.f370873e, 3, "");
            if ("Lqt".equals(xj6Var.f390170h.f370873e)) {
                java.lang.String str2 = xj6Var.f390170h.f370873e;
                mallWalletSectionCellView.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletSectionCellView", "lqtOnClickRedDotReq, redDotID: %s", str2);
                new com.tencent.mm.plugin.wallet.balance.model.lqt.b0(str2).l().q(new com.tencent.mm.plugin.mall.ui.q2(mallWalletSectionCellView));
            }
        }
        r45.yt5 yt5Var = xj6Var.f390173n;
        int i19 = yt5Var.f391354d;
        if (i19 == 1) {
            str = yt5Var.f391355e;
            i18 = 1;
        } else if (i19 == 2) {
            r45.nm6 nm6Var = yt5Var.f391356f;
            str = nm6Var != null ? nm6Var.f381518d : "";
            i18 = 2;
        } else if (i19 == 4) {
            str = yt5Var.f391355e;
        } else {
            i18 = 0;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16502, 2, str, java.lang.Integer.valueOf(i18));
    }
}
