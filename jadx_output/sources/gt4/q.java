package gt4;

/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f275497a = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_bule_bg.9_v2.png";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f275498b = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_bule_bg.9_v2.png";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f275499c = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_red_bg.9_v2.png";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f275500d = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_red_bg.9_v2.png";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f275501e = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_yellow_bg.9_v2.png";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f275502f = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_yellow_bg.9_v2.png";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f275503g = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_hbule_bg.9_v2.png";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f275504h = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_hbule_bg.9_v2.png";

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f275505i = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_green_bg.9_v2.png";

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f275506j = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_green_bg.9_v2.png";

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f275507k = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_purple_bg.9_v2.png";

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f275508l = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_purple_bg.9_v2.png";

    public static android.view.View a(android.content.Context context, android.view.View view, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, int i17, com.tencent.mm.plugin.wallet_core.utils.m mVar, boolean z17, int i18) {
        android.view.View view2;
        gt4.p pVar;
        android.widget.TextView textView;
        if (view == null || view.getTag() == null) {
            android.view.View inflate = android.view.View.inflate(context, i17, null);
            gt4.p pVar2 = new gt4.p();
            pVar2.f275489i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ad_);
            pVar2.f275485e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.adf);
            pVar2.f275486f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aex);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aee);
            pVar2.f275484d = textView2;
            textView2.setTextSize(1, 32.0f);
            pVar2.f275490m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aed);
            pVar2.f275487g = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.pap);
            pVar2.f275488h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.aen);
            pVar2.f275491n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ae9);
            pVar2.f275492o = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.aea);
            pVar2.f275493p = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.adw);
            pVar2.f275494q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aet);
            inflate.setTag(pVar2);
            view2 = inflate;
            pVar = pVar2;
        } else {
            view2 = view;
            pVar = (gt4.p) view.getTag();
        }
        if (bankcard.field_bankcardState == 1) {
            pVar.f275490m.setVisibility(0);
        } else {
            pVar.f275490m.setVisibility(8);
        }
        if (z17) {
            pVar.f275494q.setText(context.getString(com.tencent.mm.R.string.kgg));
            pVar.f275494q.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_card_state_name)) {
            pVar.f275494q.setVisibility(8);
        } else {
            pVar.f275494q.setText(bankcard.field_card_state_name);
            pVar.f275494q.setVisibility(0);
        }
        pVar.f275485e.setVisibility(0);
        pVar.f275485e.setText(bankcard.field_bankName);
        if (c01.z1.I()) {
            pVar.f275486f.setVisibility(8);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_bankcardTypeName)) {
            pVar.f275486f.setText(bankcard.field_bankcardTypeName);
        } else if (bankcard.F0()) {
            pVar.f275486f.setText(com.tencent.mm.R.string.l27);
        } else if (bankcard.w0()) {
            pVar.f275486f.setText(com.tencent.mm.R.string.kki);
        } else {
            pVar.f275486f.setText(com.tencent.mm.R.string.kl8);
        }
        android.widget.TextView textView3 = pVar.f275484d;
        if (textView3 != null) {
            textView3.setText(bankcard.field_bankcardTail);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_card_bottom_wording) || (textView = pVar.f275493p) == null) {
            pVar.f275492o.setVisibility(8);
        } else {
            textView.setText(bankcard.field_card_bottom_wording);
            pVar.f275492o.setVisibility(0);
        }
        mVar.d(context, bankcard, pVar.f275489i, pVar.f275487g, pVar.f275488h, pVar.f275494q);
        if (pVar.f275491n != null) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
            pVar.f275491n.setVisibility(8);
        }
        return view2;
    }
}
