package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class v2 implements com.tencent.mm.plugin.wallet_core.utils.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallWalletUI f148505a;

    public v2(com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI) {
        this.f148505a = mallWalletUI;
    }

    public void a(android.os.Bundle bundle) {
        int i17 = bundle.getInt("callbackEventType");
        com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI = this.f148505a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "refresh wallet data from pay settings");
            int i18 = com.tencent.mm.plugin.mall.ui.MallWalletUI.f148314q;
            mallWalletUI.U6(false, true);
        } else {
            if (i17 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "refresh wallet data from realname end");
            int i19 = com.tencent.mm.plugin.mall.ui.MallWalletUI.f148314q;
            mallWalletUI.U6(false, true);
        }
    }
}
