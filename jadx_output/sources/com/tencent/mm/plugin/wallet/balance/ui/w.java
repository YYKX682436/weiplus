package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class w implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f178522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178523f;

    public w(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, java.util.List list, android.content.Context context) {
        this.f178523f = walletBalanceFetchUI;
        this.f178521d = list;
        this.f178522e = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.text.SpannableString spannableString;
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> list = this.f178521d;
        if (list != null) {
            int i17 = 0;
            for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard : list) {
                java.lang.String str = bankcard.field_bankcardType;
                boolean F0 = bankcard.F0();
                android.content.Context context = this.f178522e;
                at4.k c17 = dt4.b.c(context, str, F0);
                java.lang.String str2 = c17 != null ? c17.f13878a : "";
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                gt4.c1 c1Var = new gt4.c1(str2);
                ((x60.e) fVar).getClass();
                android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet.balance.ui.u(this, str2, g4Var));
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord) ? "" : bankcard.field_forbidWord;
                if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbid_title)) {
                    spannableString = new android.text.SpannableString(str3);
                } else {
                    str3 = str3 + " ";
                    spannableString = new android.text.SpannableString(str3 + bankcard.field_forbid_title);
                    com.tencent.mm.plugin.wallet.balance.ui.v vVar = new com.tencent.mm.plugin.wallet.balance.ui.v(this, context, bankcard);
                    int length = str3.length();
                    int length2 = str3.length() + bankcard.field_forbid_title.length();
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length, length2, 33);
                    spannableString.setSpan(vVar, length, length2, 33);
                }
                android.text.SpannableString spannableString2 = com.tencent.mm.sdk.platformtools.t8.J0(spannableString) ? new android.text.SpannableString(bankcard.field_fetchArriveTimeWording) : spannableString;
                java.lang.String str4 = bankcard.field_desc;
                android.graphics.Bitmap S = d17 != null ? com.tencent.mm.sdk.platformtools.x.S(d17, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false) : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str4, spannableString2);
                int i18 = i17 + 1;
                g4Var.r(i17, str4, spannableString2, S != null ? new android.graphics.drawable.BitmapDrawable(S) : null, 0, true ^ com.tencent.mm.sdk.platformtools.t8.K0(str3));
                if (S == null) {
                    this.f178523f.U.put(str2, java.lang.Integer.valueOf(i18));
                }
                i17 = i18;
            }
        }
    }
}
