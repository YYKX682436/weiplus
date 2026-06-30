package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class d4 extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void O6(com.tencent.mm.plugin.luckymoney.ui.d4 d4Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        android.net.Uri.Builder buildUpon;
        android.net.Uri.Builder appendQueryParameter;
        android.net.Uri.Builder appendQueryParameter2;
        android.net.Uri.Builder buildUpon2;
        android.net.Uri.Builder appendQueryParameter3;
        android.net.Uri.Builder appendQueryParameter4;
        d4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doClickActionJumpText] action_type: " + i17);
        android.content.Intent intent = new android.content.Intent();
        gb3.m.f270026g = i17;
        if (i17 == 2) {
            intent.putExtra("Contact_User", str3);
            intent.putExtra("Contact_Scene", 238);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                java.lang.String valueOf = java.lang.String.valueOf((parse == null || (buildUpon = parse.buildUpon()) == null || (appendQueryParameter = buildUpon.appendQueryParameter("fromscene", "1")) == null || (appendQueryParameter2 = appendQueryParameter.appendQueryParameter("type", "1")) == null) ? null : appendQueryParameter2.build());
                intent.putExtra("biz_profile_enter_from_luck_money_spring_event_url", valueOf);
                gb3.m.f270028i = valueOf;
            }
            intent.putExtra("force_get_contact", true);
            j45.l.n(d4Var.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 2);
            gb3.m.a(86, luckyMoneyDetailUI != null ? luckyMoneyDetailUI.V2 : null);
            return;
        }
        if (i17 != 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "unknow type");
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(10, 2, 32, intent);
        intent.putExtra("finder_username", str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "same_receive_link is null");
        } else {
            android.net.Uri parse2 = android.net.Uri.parse(str2);
            java.lang.String valueOf2 = java.lang.String.valueOf((parse2 == null || (buildUpon2 = parse2.buildUpon()) == null || (appendQueryParameter3 = buildUpon2.appendQueryParameter("fromscene", "1")) == null || (appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("type", "2")) == null) ? null : appendQueryParameter4.build());
            intent.putExtra("key_same_receive_link", valueOf2);
            gb3.m.f270028i = valueOf2;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "same_receive_link is ".concat(valueOf2));
        }
        intent.putExtra("key_packet_id", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("redbag_scene", 1);
            jSONObject.put("coverid", str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "jump finder error, ", th6);
        }
        intent.putExtra("key_extra_info", jSONObject.toString());
        intent.putExtra("key_enter_profile_type", 52);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(d4Var.getContext(), intent);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("red_cover_id", str);
            jSONObject2.put("finderusername", str3);
            jSONObject2.put("red_cover_type", 1);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "jump finder error, ", th7);
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link", 1, jSONObject2, null);
        d4Var.getContext().overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        gb3.m.a(82, luckyMoneyDetailUI != null ? luckyMoneyDetailUI.V2 : null);
    }

    public final void P6(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        java.lang.String str5;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI2;
        int i18;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowTopLinkArea] actionType：" + i17 + " , actionJumpText：" + str + " , appUsername：" + str2 + ", sameReceiveLink: " + str3 + " , packetId：" + str4);
        gb3.m.f270030k = i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowTopLinkArea] actionJumpText is null ,return");
            android.view.View view = luckyMoneyDetailUI != null ? luckyMoneyDetailUI.f146111y2 : null;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = luckyMoneyDetailUI != null ? luckyMoneyDetailUI.f146111y2 : null;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            gb3.m.f270027h = 0;
            gb3.m.f270028i = "";
        } else {
            gb3.m.f270027h = 1;
        }
        if (luckyMoneyDetailUI != null && (textView4 = luckyMoneyDetailUI.B2) != null) {
            textView4.setText(com.tencent.mm.R.string.gki);
        }
        com.tencent.mm.wallet_core.ui.a0 a0Var = new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.luckymoney.ui.y3(this, str4, str3, i17, str2, luckyMoneyDetailUI), true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.wallet_core.ui.r1.w0(luckyMoneyDetailUI != null ? luckyMoneyDetailUI.f146114z2 : null, str, 0, str != null ? str.length() : 0, a0Var, getContext());
            luckyMoneyDetailUI2 = luckyMoneyDetailUI;
            str5 = "MicroMsg.LuckyMoneyDetailUIFunctionUIC";
            i18 = 0;
        } else {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.lucky_money_red_envelope_filled);
            if (drawable != null) {
                drawable.setColorFilter(getResources().getColor(com.tencent.mm.R.color.a2z), android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (com.tencent.mm.ui.bk.M(q17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a)) || com.tencent.mm.ui.bk.M(q17, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
                q17 = i65.a.t(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            int a17 = (int) (com.tencent.mm.ui.zk.a(getContext(), 16) * q17);
            if (drawable != null) {
                drawable.setBounds(0, 0, a17, a17);
            }
            com.tencent.mm.plugin.remittance.ui.k kVar = new com.tencent.mm.plugin.remittance.ui.k(drawable);
            java.lang.String str6 = str + "  " + getString(com.tencent.mm.R.string.m4_);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str6);
            str5 = "MicroMsg.LuckyMoneyDetailUIFunctionUIC";
            com.tencent.mm.wallet_core.ui.a0 a0Var2 = new com.tencent.mm.wallet_core.ui.a0(getResources().getColor(com.tencent.mm.R.color.a2z), getResources().getColor(com.tencent.mm.R.color.a9e), new com.tencent.mm.plugin.luckymoney.ui.z3(this, str4, str3, i17, str2, luckyMoneyDetailUI));
            if (str != null) {
                spannableStringBuilder.setSpan(a0Var, 0, str.length(), 17);
                spannableStringBuilder.setSpan(kVar, str.length() + 1, str.length() + 2, 17);
                spannableStringBuilder.setSpan(a0Var2, str.length() + 2, str6.length(), 18);
            }
            luckyMoneyDetailUI2 = luckyMoneyDetailUI;
            i18 = 0;
            if (luckyMoneyDetailUI2 != null && (textView3 = luckyMoneyDetailUI2.f146114z2) != null) {
                textView3.setClickable(true);
            }
            if (luckyMoneyDetailUI2 != null && (textView2 = luckyMoneyDetailUI2.f146114z2) != null) {
                textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
            }
            if (luckyMoneyDetailUI2 != null && (textView = luckyMoneyDetailUI2.f146114z2) != null) {
                textView.setText(spannableStringBuilder);
            }
        }
        if (i17 == 2) {
            if (((luckyMoneyDetailUI2 == null || !luckyMoneyDetailUI2.f146064h) ? i18 : 1) == 0) {
                gb3.m.a(85, luckyMoneyDetailUI2 != null ? luckyMoneyDetailUI2.V2 : null);
                if (luckyMoneyDetailUI2 == null) {
                    return;
                }
                luckyMoneyDetailUI2.f146064h = true;
                return;
            }
            return;
        }
        if (i17 != 4) {
            return;
        }
        if (((luckyMoneyDetailUI2 == null || !luckyMoneyDetailUI2.f146061g) ? i18 : 1) == 0) {
            gb3.m.a(81, luckyMoneyDetailUI2 != null ? luckyMoneyDetailUI2.V2 : null);
            if (luckyMoneyDetailUI2 != null) {
                luckyMoneyDetailUI2.f146061g = true;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("red_cover_id", str4);
            jSONObject.put("finderusername", str2);
            jSONObject.put("red_cover_type", 1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str5, "jump finder error, ", th6);
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link", i18, jSONObject, null);
    }
}
