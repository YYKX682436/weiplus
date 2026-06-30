package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f180163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f180165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f180166g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f180167h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f180168i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180169m;

    public c1(java.util.List list, android.content.Context context, java.util.HashMap hashMap, com.tencent.mm.ui.widget.dialog.k0 k0Var, boolean z17, boolean z18, java.lang.String str) {
        this.f180163d = list;
        this.f180164e = context;
        this.f180165f = hashMap;
        this.f180166g = k0Var;
        this.f180167h = z17;
        this.f180168i = z18;
        this.f180169m = str;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        at4.k c17;
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        int i17;
        int i18 = 0;
        for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard : this.f180163d) {
            if (bankcard.D0()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14004m;
                c17 = bankcard2 != null ? bankcard2.f179562a3 : null;
            } else {
                c17 = dt4.b.c(this.f180164e, bankcard.field_bankcardType, bankcard.F0());
            }
            java.lang.String str = c17 != null ? c17.f13878a : "";
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet_core.ui.z0(this, str, g4Var));
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord) ? "" : bankcard.field_forbidWord;
            if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbid_title)) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2);
            } else {
                str2 = str2 + " ";
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2 + bankcard.field_forbid_title);
                com.tencent.mm.plugin.wallet_core.ui.a1 a1Var = new com.tencent.mm.plugin.wallet_core.ui.a1(this, this.f180164e, bankcard);
                int length = str2.length();
                int length2 = str2.length() + bankcard.field_forbid_title.length();
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f180164e.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length, length2, 33);
                spannableStringBuilder.setSpan(a1Var, length, length2, 33);
            }
            if (this.f180167h && com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder) && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_fetchArriveTimeWording)) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(bankcard.field_fetchArriveTimeWording);
            }
            if (com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder) || com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_prompt_text)) {
                spannableStringBuilder2 = spannableStringBuilder;
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder(bankcard.field_prompt_info_prompt_text);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_text) && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_url)) {
                    spannableStringBuilder3.append((java.lang.CharSequence) bankcard.field_prompt_info_jump_text);
                    spannableStringBuilder3.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.wallet_core.ui.b1(this, bankcard)), bankcard.field_prompt_info_prompt_text.length(), spannableStringBuilder3.length(), 33);
                }
                spannableStringBuilder2 = spannableStringBuilder3;
            }
            java.lang.String str3 = bankcard.field_desc;
            android.graphics.Bitmap S = d17 != null ? com.tencent.mm.sdk.platformtools.x.S(d17, this.f180164e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), this.f180164e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false) : null;
            if (S == null) {
                this.f180165f.put(str, java.lang.Integer.valueOf(i18));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardBottomSheetHelper", "i %d fee %s %s", java.lang.Integer.valueOf(i18), str3, spannableStringBuilder2);
            if (bankcard.v0()) {
                i17 = i18 + 1;
                g4Var.r(i18, str3, spannableStringBuilder2, this.f180164e.getResources().getDrawable(com.tencent.mm.R.drawable.ch9), 0, !com.tencent.mm.sdk.platformtools.t8.K0(str2));
            } else {
                i17 = i18 + 1;
                g4Var.r(i18, str3, spannableStringBuilder2, S == null ? null : new android.graphics.drawable.BitmapDrawable(S), 0, !com.tencent.mm.sdk.platformtools.t8.K0(str2));
            }
            i18 = i17;
        }
        if (!this.f180168i || com.tencent.mm.sdk.platformtools.t8.K0(this.f180169m)) {
            return;
        }
        g4Var.s(i18, this.f180169m, "", com.tencent.mm.sdk.platformtools.x2.f193075e.getDrawable(com.tencent.mm.R.drawable.ch6), false);
    }
}
