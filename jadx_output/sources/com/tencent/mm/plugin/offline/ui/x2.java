package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class x2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f152760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152761e;

    public x2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, java.util.List list) {
        this.f152761e = walletOfflineCoinPurseUI;
        this.f152760d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v26, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence] */
    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str;
        java.lang.String str2;
        ?? spannableStringBuilder;
        java.lang.String str3;
        java.lang.String str4;
        at4.k kVar;
        com.tencent.mm.plugin.offline.ui.x2 x2Var = this;
        g4Var.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "mmBottomSheet list show");
        int i17 = 0;
        while (true) {
            java.util.List list = x2Var.f152760d;
            if (i17 >= list.size()) {
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            java.lang.String str5 = bankcard.field_bankcardType;
            if (android.text.TextUtils.isEmpty(yo3.m.f464158e)) {
                str = to3.c0.Ai().Ni(196615);
                yo3.m.f464158e = str;
            } else {
                str = yo3.m.f464158e;
            }
            java.util.LinkedList p17 = yo3.m.p(str);
            java.lang.String str6 = "";
            if (p17 != null) {
                for (int i18 = 0; i18 < p17.size(); i18++) {
                    yo3.l lVar = (yo3.l) p17.get(i18);
                    if (lVar != null && str5.equals(lVar.f464152a)) {
                        str2 = lVar.f464153b;
                        break;
                    }
                }
            }
            str2 = "";
            if (bankcard.D0() && (kVar = bankcard.f179562a3) != null) {
                str2 = kVar.f13878a;
            }
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str2);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.offline.ui.u2(x2Var, str2, g4Var));
            java.lang.String str7 = !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord) ? bankcard.field_forbidWord : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7) && !bankcard.field_support_micropay) {
                str7 = com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_no_micro_word) ? "" : bankcard.field_no_micro_word;
            }
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbid_title);
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = x2Var.f152761e;
            if (K0) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str7);
            } else {
                java.lang.String str8 = str7 + " ";
                spannableStringBuilder = new android.text.SpannableStringBuilder(str8 + bankcard.field_forbid_title);
                com.tencent.mm.plugin.offline.ui.v2 v2Var = new com.tencent.mm.plugin.offline.ui.v2(x2Var, walletOfflineCoinPurseUI, bankcard);
                int length = str8.length();
                int length2 = str8.length() + bankcard.field_forbid_title.length();
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(walletOfflineCoinPurseUI.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length, length2, 33);
                spannableStringBuilder.setSpan(v2Var, length, length2, 33);
                str7 = str8;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder) || com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_prompt_text)) {
                str3 = spannableStringBuilder;
            } else {
                ?? spannableStringBuilder2 = new android.text.SpannableStringBuilder(bankcard.field_prompt_info_prompt_text);
                str3 = spannableStringBuilder2;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_text)) {
                    str3 = spannableStringBuilder2;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_url)) {
                        spannableStringBuilder2.append(bankcard.field_prompt_info_jump_text);
                        spannableStringBuilder2.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.offline.ui.w2(x2Var, bankcard)), bankcard.field_prompt_info_prompt_text.length(), spannableStringBuilder2.length(), 33);
                        str3 = spannableStringBuilder2;
                    }
                }
            }
            if (!bankcard.v0() && !bankcard.D0()) {
                str4 = bankcard.field_desc;
            } else if (bankcard.O2 < 0.0d) {
                str4 = bankcard.field_desc;
            } else {
                str4 = bankcard.field_desc + walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.key, com.tencent.mm.wallet_core.ui.r1.m(bankcard.O2));
            }
            android.graphics.drawable.Drawable e17 = bankcard.A0() ? m95.a.e(walletOfflineCoinPurseUI.getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f) : d17 != null ? new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(d17, walletOfflineCoinPurseUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), walletOfflineCoinPurseUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)) : null;
            if (e17 == null) {
                walletOfflineCoinPurseUI.f152539v2.put(str2, java.lang.Integer.valueOf(i17));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "can choose list：i %d fee %s %s，status:%s", java.lang.Integer.valueOf(i17), str4, str3, java.lang.Integer.valueOf(bankcard.field_defaultCardState));
            if (bankcard.z0()) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = walletOfflineCoinPurseUI.getContext();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str4);
                java.lang.String str9 = str3;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.f179576o3)) {
                        str9 = bankcard.f179576o3;
                    }
                    g4Var.r(i17, i19, str6, e17, 0, !com.tencent.mm.sdk.platformtools.t8.K0(str7));
                }
                str6 = str9;
                g4Var.r(i17, i19, str6, e17, 0, !com.tencent.mm.sdk.platformtools.t8.K0(str7));
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context2 = walletOfflineCoinPurseUI.getContext();
                ((ke0.e) xVar2).getClass();
                g4Var.r(i17, com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str4), str3, e17, 0, !com.tencent.mm.sdk.platformtools.t8.K0(str7));
            }
            i17++;
            x2Var = this;
        }
    }
}
