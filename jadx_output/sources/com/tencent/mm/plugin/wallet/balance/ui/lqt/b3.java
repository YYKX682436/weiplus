package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class b3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178104e;

    public b3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, java.util.List list) {
        this.f178104e = walletLqtPlanAddUI;
        this.f178103d = list;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.text.SpannableString spannableString;
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.b3 b3Var = this;
        java.util.List list = b3Var.f178103d;
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            java.lang.String str = bankcard.field_bankcardType;
            boolean F0 = bankcard.F0();
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = b3Var.f178104e;
            at4.k c17 = dt4.b.c(walletLqtPlanAddUI, str, F0);
            java.lang.String str2 = c17 != null ? c17.f13878a : "";
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str2);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z2(b3Var, str2, g4Var));
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord) ? "" : bankcard.field_forbidWord;
            if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbid_title)) {
                spannableString = new android.text.SpannableString(str3);
            } else {
                str3 = str3 + " ";
                spannableString = new android.text.SpannableString(str3 + bankcard.field_forbid_title);
                com.tencent.mm.plugin.wallet.balance.ui.lqt.a3 a3Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.a3(b3Var, walletLqtPlanAddUI);
                int length = str3.length();
                int length2 = str3.length() + bankcard.field_forbid_title.length();
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(walletLqtPlanAddUI.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length, length2, 33);
                spannableString.setSpan(a3Var, length, length2, 33);
            }
            android.text.SpannableString spannableString2 = spannableString;
            java.lang.String str4 = bankcard.field_desc;
            if (bankcard.v0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str4, spannableString2);
                g4Var.s(i17, str4, spannableString2, walletLqtPlanAddUI.getResources().getDrawable(com.tencent.mm.R.drawable.ch9), true ^ com.tencent.mm.sdk.platformtools.t8.K0(str3));
                bitmap = null;
            } else {
                android.graphics.Bitmap S = d17 != null ? com.tencent.mm.sdk.platformtools.x.S(d17, walletLqtPlanAddUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), walletLqtPlanAddUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false) : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str4, spannableString2);
                g4Var.r(i17, str4, spannableString2, S == null ? null : new android.graphics.drawable.BitmapDrawable(S), 0, !com.tencent.mm.sdk.platformtools.t8.K0(str3));
                bitmap = S;
            }
            if (bitmap == null) {
                walletLqtPlanAddUI.f177991p0.put(str2, java.lang.Integer.valueOf(i17));
            }
            i17++;
            b3Var = this;
        }
    }
}
