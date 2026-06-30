package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class a9 implements java.util.Comparator {
    public a9(com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.jd jdVar = (r45.jd) obj;
        r45.jd jdVar2 = (r45.jd) obj2;
        if (jdVar != null && jdVar2 != null) {
            if ("wx".equals(jdVar.f377710d) && "cft".equals(jdVar2.f377710d)) {
                return -1;
            }
            if ("cft".equals(jdVar.f377710d) && "wx".equals(jdVar2.f377710d)) {
                return 1;
            }
        }
        return 0;
    }
}
