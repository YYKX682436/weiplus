package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes8.dex */
public abstract class d {
    public static boolean a(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        java.lang.String[] split;
        if (bankcard == null) {
            return false;
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(196659, null);
        if (!android.text.TextUtils.isEmpty(str) && (split = str.split("&")) != null && split.length != 0) {
            for (java.lang.String str2 : split) {
                if (str2 != null && str2.equals(bankcard.field_bankcardType)) {
                    return false;
                }
            }
        }
        return true;
    }
}
