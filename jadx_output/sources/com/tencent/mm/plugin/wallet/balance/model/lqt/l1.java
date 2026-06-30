package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet.balance.model.lqt.l1 f177688a = new com.tencent.mm.plugin.wallet.balance.model.lqt.l1();

    public final int a(android.app.Activity activity, java.lang.String url, android.os.Bundle bundle) {
        int i17;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        com.tencent.mm.plugin.wallet.balance.model.lqt.f1 f1Var = com.tencent.mm.plugin.wallet.balance.model.lqt.g1.f177637d;
        com.tencent.mm.plugin.wallet.balance.model.lqt.f1 f1Var2 = com.tencent.mm.plugin.wallet.balance.model.lqt.g1.f177637d;
        int i18 = bundle.getInt("fromScene", 0);
        f1Var.getClass();
        for (com.tencent.mm.plugin.wallet.balance.model.lqt.g1 g1Var : com.tencent.mm.plugin.wallet.balance.model.lqt.g1.values()) {
            if (g1Var.ordinal() == i18) {
                java.lang.String string = bundle.getString("bindSerial");
                java.lang.String string2 = bundle.getString("amountString");
                if (r26.i0.y(url, "weixin://wcpay/lqt/detail", false)) {
                    boolean l17 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                    com.tencent.mars.xlog.Log.i("LqtNativeUrlJumpHandler", "[jumpToLqtDetailTest] enable: " + l17);
                    if (l17) {
                        com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(url);
                        if (((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(activity)) {
                            return 32769;
                        }
                        com.tencent.mars.xlog.Log.i("LqtNativeUrlJumpHandler", "jumpToLqtDetailForKinda not available, start failed");
                        return 32769;
                    }
                    com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(url);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_account_type", 1);
                    j45.l.n(activity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, 32769);
                    return 32769;
                }
                if (!r26.i0.y(url, "weixin://wcpay/lqt/save", false)) {
                    return -1;
                }
                boolean l18 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                com.tencent.mars.xlog.Log.i("LqtNativeUrlJumpHandler", "[jumpToLqtSaveTest] enable: " + l18);
                if (l18) {
                    com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(url);
                    java.lang.String a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.a(url);
                    int ordinal = g1Var.ordinal();
                    if (ordinal == 0) {
                        i17 = 3;
                    } else {
                        if (ordinal != 1) {
                            throw new jz5.j();
                        }
                        i17 = 8;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("entrance_type", i17);
                    intent2.putExtra("operate_id", a17);
                    if (string2 != null) {
                        if (!(string2.length() > 0)) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            intent2.putExtra("fill_money", string2);
                        }
                    }
                    if (string != null) {
                        if (!(string.length() > 0)) {
                            string = null;
                        }
                        if (string != null) {
                            intent2.putExtra("card_serial", string);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("LqtNativeUrlJumpHandler", "start lqt save use case (kinda only), entranceType: " + i17);
                    if (!((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(activity, intent2, com.tencent.mm.plugin.wallet.balance.model.lqt.k1.f177666a)) {
                        com.tencent.mars.xlog.Log.i("LqtNativeUrlJumpHandler", "startLqtSaveUseCase not available, start failed");
                    }
                } else {
                    com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(url);
                    java.lang.String a18 = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.a(url);
                    android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(activity, false, false, null);
                    com.tencent.mm.plugin.wallet.balance.model.lqt.e1 e1Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.e1(activity);
                    e1Var.a(new com.tencent.mm.plugin.wallet.balance.model.lqt.i1(e17, activity, g1Var, e1Var, a18, string2, string), new com.tencent.mm.plugin.wallet.balance.model.lqt.j1(activity, e17));
                }
                return 32770;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }
}
