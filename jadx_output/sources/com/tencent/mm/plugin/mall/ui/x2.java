package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class x2 implements com.tencent.mm.plugin.wallet_core.utils.x1 {
    public x2(com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI) {
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.x1
    public void a(r45.yt5 yt5Var, java.lang.Object... objArr) {
        java.lang.String str;
        r45.nm6 nm6Var;
        int i17 = yt5Var.f391354d;
        int i18 = 1;
        if (i17 == 1) {
            str = yt5Var.f391355e;
        } else if (i17 == 2 && (nm6Var = yt5Var.f391356f) != null) {
            str = nm6Var.f381518d;
            i18 = 2;
        } else if (i17 == 4 || i17 == 5) {
            str = yt5Var.f391355e;
            i18 = 3;
        } else {
            str = "";
            i18 = 0;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16502, 2, str, java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.x1
    public boolean b(r45.yt5 yt5Var, java.lang.Object... objArr) {
        return false;
    }
}
