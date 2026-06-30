package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class f3 implements vl5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f178999a;

    public f3(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f178999a = walletUniversalPayOrderUI;
    }

    @Override // vl5.o
    public void a(int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        int i19 = com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.f178957s;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f178999a;
        walletUniversalPayOrderUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do update unipay order");
        walletUniversalPayOrderUI.f178968q = db5.e1.Q(walletUniversalPayOrderUI, walletUniversalPayOrderUI.getString(com.tencent.mm.R.string.f490386tj), walletUniversalPayOrderUI.getString(com.tencent.mm.R.string.kvq), false, false, new com.tencent.mm.plugin.wallet.pwd.ui.n3(walletUniversalPayOrderUI));
        walletUniversalPayOrderUI.f178959e.a(i17, i18);
        walletUniversalPayOrderUI.f178959e.notifyDataSetChanged();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List list = walletUniversalPayOrderUI.f178959e.f179046e;
        if (list != null) {
            linkedList.addAll(list);
        }
        new gs4.d(linkedList).l().h(new com.tencent.mm.plugin.wallet.pwd.ui.y2(walletUniversalPayOrderUI, i18, i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 10);
    }
}
