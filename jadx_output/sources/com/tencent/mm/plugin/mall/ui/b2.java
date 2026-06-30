package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f148342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148343e;

    public b2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, android.widget.LinearLayout linearLayout) {
        this.f148343e = mallIndexUIv2;
        this.f148342d = linearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.LinearLayout linearLayout = this.f148342d;
        int width = linearLayout.getWidth();
        int height = linearLayout.getHeight();
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148343e;
        mallIndexUIv2.L = height;
        int b17 = (width - (i65.a.b(mallIndexUIv2.getContext(), 8) * 3)) / 2;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) mallIndexUIv2.f148265r.findViewById(com.tencent.mm.R.id.jkk);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        int width2 = linearLayout2.getWidth();
        int height2 = linearLayout2.getHeight();
        if (width2 > b17) {
            layoutParams.width = b17;
            width2 = b17;
        }
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "headContentLayoutWidth:%s,itemLayoutMaxWidth ：%s,walletLayoutWidth:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(width2));
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) mallIndexUIv2.f148265r.findViewById(com.tencent.mm.R.id.jkg);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
        layoutParams2.width = width2;
        layoutParams2.height = height2;
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.WALLET_MALL_HEADER_ITEM_WIDTH_INT_SYNC, java.lang.Integer.valueOf(width2));
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.WALLET_MALL_HEADER_ITEM_HEIGHT_INT_SYNC, java.lang.Integer.valueOf(height2));
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
        int i17 = (width - (width2 * 2)) / 3;
        com.tencent.mm.wallet_core.model.m1 wi6 = ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.WALLET_MALL_HEADER_INTERVAL_INT_SYNC;
        int intValue = ((java.lang.Integer) wi6.i(u3Var, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "caculate interval:%s lastInterval:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue));
        if (intValue != i17) {
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var, java.lang.Integer.valueOf(i17));
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
            layoutParams2.leftMargin = i17;
            layoutParams.rightMargin = i17;
        }
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout2.setLayoutParams(layoutParams);
    }
}
