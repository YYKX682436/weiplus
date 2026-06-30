package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h8 implements com.tencent.mm.plugin.wallet_core.ui.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.i8 f180320a;

    public h8(com.tencent.mm.plugin.wallet_core.ui.i8 i8Var) {
        this.f180320a = i8Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.k4
    public void a(com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m17;
        java.lang.String string;
        double d17;
        java.lang.String str3;
        com.tencent.mm.plugin.wallet_core.ui.i8 i8Var = this.f180320a;
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = i8Var.f180341f;
        n8Var.H = favorPayInfo;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = n8Var.X;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 15, favorPayInfo.f179667d);
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var2 = i8Var.f180341f;
        n8Var2.I = false;
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo2 = n8Var2.H;
        java.util.List h17 = com.tencent.mm.plugin.wallet_core.ui.g0.h(favorPayInfo2.f179668e, favorPayInfo2.f179669f);
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo3 = n8Var2.H;
        favorPayInfo3.f179671h = "";
        boolean j17 = com.tencent.mm.plugin.wallet_core.ui.g0.j(favorPayInfo3, n8Var2.K);
        android.content.Context context = i8Var.f180339d;
        if (j17) {
            n8Var2.I = true;
            if (((java.util.ArrayList) h17).size() == 0) {
                n8Var2.H.f179671h = context.getString(com.tencent.mm.R.string.klp);
            } else {
                n8Var2.H.f179671h = context.getString(com.tencent.mm.R.string.klq);
            }
            n8Var2.dismiss();
            com.tencent.mm.plugin.wallet_core.ui.m8 m8Var = n8Var2.f180536u;
            if (m8Var != null) {
                m8Var.a(n8Var2.f180535t.getText(), n8Var2.H, n8Var2.I);
                return;
            }
        }
        android.view.View view = n8Var2.f180538w;
        if (view != null) {
            view.setTag(n8Var2.H);
        }
        vr4.l0 f17 = n8Var2.G.f(n8Var2.H.f179667d);
        com.tencent.mm.plugin.wallet_core.model.Orders orders = i8Var.f180340e;
        vr4.j0 j0Var = orders.N;
        double d18 = j0Var.f439755f;
        java.lang.String str4 = null;
        if (f17 == null || f17.f439779m <= 0.0d) {
            double d19 = j0Var.f439753d;
            str = null;
            str2 = null;
            m17 = com.tencent.mm.wallet_core.ui.r1.m(d19);
            string = context.getString(com.tencent.mm.R.string.kwr);
            d17 = d19;
        } else {
            d17 = f17.f439775f;
            java.lang.String m18 = com.tencent.mm.wallet_core.ui.r1.m(f17.f439778i);
            java.lang.String m19 = com.tencent.mm.wallet_core.ui.r1.m(orders.N.f439753d);
            str2 = f17.f439781o;
            str = m19;
            m17 = m18;
            string = null;
        }
        if (f17 == null || f17.f439780n == 0) {
            str3 = null;
        } else {
            str3 = f17.f439782p;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str3 = "," + str3;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                str4 = "," + string;
            }
            string = str4;
        }
        n8Var2.t(m17, d17);
        n8Var2.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            n8Var2.f180528n.setVisibility(8);
        } else {
            n8Var2.f180528n.setVisibility(0);
            n8Var2.f180528n.setText(str);
        }
        n8Var2.s(str2, string);
        java.lang.String str5 = orders.f179681m;
        n8Var2.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            n8Var2.A.setVisibility(8);
        } else {
            n8Var2.A.setText(str3);
            n8Var2.A.setVisibility(0);
        }
    }
}
