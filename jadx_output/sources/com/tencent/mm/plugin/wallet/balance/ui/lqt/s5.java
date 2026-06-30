package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class s5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f178367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178368e;

    public s5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, hs4.d dVar) {
        this.f178368e = walletLqtSaveFetchUI;
        this.f178367d = dVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        android.graphics.Bitmap S;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178368e;
        int size = ((java.util.LinkedList) walletLqtSaveFetchUI.f178073x0).size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) ((java.util.LinkedList) walletLqtSaveFetchUI.f178073x0).get(i17);
            at4.k c17 = dt4.b.c(walletLqtSaveFetchUI, bankcard.field_bankcardType, bankcard.F0());
            java.lang.String str = c17 != null ? c17.f13878a : "";
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet.balance.ui.lqt.p5(this, str, g4Var));
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord) ? "" : bankcard.field_forbidWord;
            if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbid_title)) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2);
            } else {
                str2 = str2 + " ";
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2 + bankcard.field_forbid_title);
                com.tencent.mm.plugin.wallet.balance.ui.lqt.q5 q5Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.q5(this, walletLqtSaveFetchUI, bankcard);
                int length = str2.length();
                int length2 = str2.length() + bankcard.field_forbid_title.length();
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(walletLqtSaveFetchUI.getResources().getColor(com.tencent.mm.R.color.f479308vo)), length, length2, 33);
                spannableStringBuilder.setSpan(q5Var, length, length2, 33);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder) || com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_prompt_text)) {
                spannableStringBuilder2 = spannableStringBuilder;
            } else {
                spannableStringBuilder2 = new android.text.SpannableStringBuilder(bankcard.field_prompt_info_prompt_text);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_text) && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_url)) {
                    spannableStringBuilder2.append((java.lang.CharSequence) bankcard.field_prompt_info_jump_text);
                    spannableStringBuilder2.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.wallet.balance.ui.lqt.r5(this, bankcard)), bankcard.field_prompt_info_prompt_text.length(), spannableStringBuilder2.length(), 33);
                }
            }
            java.lang.String str3 = bankcard.field_desc;
            if (bankcard.v0()) {
                if (bankcard.O2 >= 0.0d) {
                    str3 = str3 + walletLqtSaveFetchUI.getString(com.tencent.mm.R.string.key, com.tencent.mm.wallet_core.ui.r1.m(bankcard.O2));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str3, spannableStringBuilder2);
                g4Var.r(i17, str3, spannableStringBuilder2, walletLqtSaveFetchUI.getResources().getDrawable(com.tencent.mm.R.drawable.ch9), 0, !com.tencent.mm.sdk.platformtools.t8.K0(str2));
                S = null;
            } else {
                S = d17 != null ? com.tencent.mm.sdk.platformtools.x.S(d17, walletLqtSaveFetchUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), walletLqtSaveFetchUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false) : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str3, spannableStringBuilder2);
                g4Var.r(i17, str3, spannableStringBuilder2, S == null ? null : new android.graphics.drawable.BitmapDrawable(S), 0, !com.tencent.mm.sdk.platformtools.t8.K0(str2));
            }
            if (S == null) {
                walletLqtSaveFetchUI.K1.put(str, java.lang.Integer.valueOf(i17));
            }
        }
    }
}
