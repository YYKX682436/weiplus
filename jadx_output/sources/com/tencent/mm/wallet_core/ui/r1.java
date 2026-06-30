package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f214222a = java.util.regex.Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-\\_]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnrwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eouw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");

    /* renamed from: b, reason: collision with root package name */
    public static java.text.SimpleDateFormat f214223b;

    static {
        new java.util.LinkedHashMap(0, 0.75f, true);
        f214223b = null;
    }

    public static java.lang.String A(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            return "";
        }
        java.lang.String w07 = n17.w0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            return w07;
        }
        if (com.tencent.mm.storage.z3.R4(str)) {
            java.lang.String P0 = n17.P0();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(P0)) {
                return P0;
            }
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            java.util.List m17 = c01.v1.m(str);
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            java.lang.String i17 = c01.v1.i(m17, 5, str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                return i17;
            }
        } else {
            if (com.tencent.mm.storage.z3.R4(str2)) {
                java.lang.String z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str2).z0(str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
                    return z07;
                }
            }
            java.lang.String f27 = n17.f2();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f27)) {
                return f27;
            }
        }
        return "";
    }

    public static com.tencent.mm.ui.widget.dialog.z2 A0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.wallet_core.ui.o1 o1Var) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 3);
        z2Var.y(str3);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489607d52, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.p_v);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.b(context, 40);
            marginLayoutParams.rightMargin = i65.a.b(context, 24);
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(str);
        z2Var.t(inflate);
        android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f489606d51, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.p_u);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = i65.a.b(context, 16);
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        textView2.setText(str2);
        z2Var.j(inflate2);
        z2Var.F = new com.tencent.mm.wallet_core.ui.c1(o1Var, z2Var);
        z2Var.C();
        return z2Var;
    }

    public static java.lang.String B() {
        return java.lang.Long.toString((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_use_safe_time, 0) == 0 ? c01.id.c() : c01.id.a()) / 1000);
    }

    public static void B0(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("bank_card_owner", str);
        j45.l.j(mMActivity, "scanner", ".ui.ScanCardUI", intent, null);
    }

    public static java.lang.String C(long j17) {
        if (j17 > 0) {
            return "+" + o(j17 / 100.0d);
        }
        return "" + o(j17 / 100.0d);
    }

    public static java.lang.String C0(java.lang.String str, int i17) {
        int i18;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= str.length()) {
                i18 = 0;
                break;
            }
            i27 = str.charAt(i19) <= 127 ? i27 + 1 : i27 + 2;
            if (i27 >= i17) {
                i18 = i19 + 1;
                break;
            }
            i19++;
        }
        if (i18 > str.length()) {
            i18 = str.length();
        }
        try {
            int offsetByCodePoints = str.offsetByCodePoints(0, str.codePointCount(0, i18));
            if (offsetByCodePoints >= str.length() || offsetByCodePoints <= 0) {
                return str;
            }
            return str.substring(0, offsetByCodePoints) + "...";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static java.lang.String D() {
        gm0.j1.b().c();
        return c01.z1.r();
    }

    public static long D0(double d17) {
        return java.lang.Math.round(d17 * 100.0d);
    }

    public static java.lang.String E(int i17) {
        switch (i17) {
            case 0:
            default:
                return "fonts/WeChatSansSS-Medium.ttf";
            case 1:
                return "fonts/WeChatSansSS-Bold.ttf";
            case 2:
                return "fonts/WeChatSansSS-Light.ttf";
            case 3:
                return "fonts/WeChatSansSS-Regular.ttf";
            case 4:
                return "fonts/WeChatSansStd-Medium.ttf";
            case 5:
                return "fonts/WeChatSansStd-Bold.ttf";
            case 6:
                return "fonts/WeChatSansStd-Light.ttf";
            case 7:
                return "fonts/WeChatSansStd-Regular.ttf";
        }
    }

    public static android.graphics.Typeface F(android.content.Context context, int i17) {
        if (i17 == 8) {
            return android.graphics.Typeface.DEFAULT;
        }
        try {
            return android.graphics.Typeface.createFromAsset(context.getAssets(), E(i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBaseUtil ", "getWalletTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return android.graphics.Typeface.DEFAULT;
        }
    }

    public static com.tencent.mm.sdk.platformtools.o4 G() {
        return com.tencent.mm.sdk.platformtools.o4.M("wc_pay_device_config");
    }

    public static java.lang.String H(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() <= 14) {
            return str;
        }
        return str.substring(0, 14) + "...";
    }

    public static java.lang.String I(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() <= i17) {
            return str;
        }
        return str.substring(0, i17) + "...";
    }

    public static int J(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() < 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBaseUtil ", "illegal reqkey: %s", str);
            return 0;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletBaseUtil ", "invalid abtest value");
        return 0;
    }

    public static void K(android.content.Context context, java.lang.String str) {
        com.tencent.mm.wallet_core.ui.y0 y0Var = new com.tencent.mm.wallet_core.ui.y0(context);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.t(context, str, "", y0Var);
    }

    public static void L(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l0g);
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 1).show();
    }

    public static void M(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.t(context, str, "", new com.tencent.mm.wallet_core.ui.l1());
    }

    public static void N(android.view.View view, com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_mykeyboard_ontouch, false);
        if (!fj6) {
            myKeyboardWindow.setSecureOnTouchCallback();
        }
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_password_edittext_event_v2, false);
        if (!fj7) {
            myKeyboardWindow.setUseEditTextEventMode(view);
        }
        myKeyboardWindow.setUseKeyboardWindowDelegateMode(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "[initSecureConfig] ignoreSetOnTouch : %s , ignoreEditTextEvent : %s，isOpenKeyboardWindowDelegate: %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(fj7), java.lang.Boolean.TRUE);
    }

    public static boolean O() {
        return ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8;
    }

    public static boolean P() {
        com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
        if (sVar != null && com.tencent.mm.sdk.platformtools.t8.j1(sVar.c(".com.tencent.mm.debug.kinda_secure_page_flag"), 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "secure switch true, because debugger");
            return true;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kinda_secure_page_flag, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "secure switch enableValue: %s", java.lang.Integer.valueOf(Ni));
        return Ni == 1;
    }

    public static boolean Q(java.lang.String str) {
        return f214222a.matcher(str).matches();
    }

    public static void R(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList.add(context.getString(com.tencent.mm.R.string.f493499kh2));
        linkedList2.add(0);
        if (str != null && z18) {
            linkedList.add(context.getString(com.tencent.mm.R.string.f493498kh1));
            linkedList2.add(1);
        }
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            linkedList.add(context.getString(com.tencent.mm.R.string.f493500kh3, str2));
            linkedList2.add(2);
            linkedList.add(context.getString(com.tencent.mm.R.string.f493501kh4, str2));
            linkedList2.add(3);
        }
        db5.e1.b(context, "", linkedList, linkedList2, "", new com.tencent.mm.wallet_core.ui.e1(context, str));
    }

    public static void S(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    public static void T(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, null);
    }

    public static void U(android.content.Context context, android.content.Intent intent, int i17) {
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("allow_mix_content_mode", false);
        j45.l.n(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, i17);
    }

    public static void V(android.content.Context context, java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z17);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public static void W(android.content.Context context, java.lang.String str, boolean z17, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z17);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.n(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, i17);
    }

    public static void X(android.content.Context context, java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z17);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public static void Y(android.content.Context context, r45.q74 q74Var, q80.f0 f0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q74Var.f383734d)) {
            bundle.putString("appId", q74Var.f383734d);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q74Var.f383735e)) {
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, q74Var.f383735e);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q74Var.f383736f)) {
            bundle.putString("query", q74Var.f383736f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q74Var.f383737g)) {
            bundle.putString("minVersion", q74Var.f383737g);
        }
        bundle.putBoolean("isHalfScreen", q74Var.f383738h);
        bundle.putDouble("heightPercent", q74Var.f383739i);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, q74Var.f383740m);
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477886ea);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477889ed);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, f0Var);
    }

    public static void Z(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("pay_channel", 1);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < str.length()) {
            int i18 = i17 + 1;
            sb6.append(str.substring(i17, i18));
            if (i17 != str.length() - 1) {
                sb6.append(str2);
            }
            i17 = i18;
        }
        return sb6.toString();
    }

    public static void a0(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public static void b(com.tencent.mm.wallet_core.ui.formview.WalletFormView[] walletFormViewArr, int i17) {
        if (walletFormViewArr == null || walletFormViewArr.length == 0) {
            return;
        }
        int i18 = 0;
        for (com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView : walletFormViewArr) {
            i18 = java.lang.Math.max(i18, (int) walletFormView.getTitleMeasuredWidth());
        }
        if (i18 > 0) {
            int i19 = i18 + i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "adjust max width: %s", java.lang.Integer.valueOf(i19));
            for (com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 : walletFormViewArr) {
                walletFormView2.setTitleWidth(i19);
            }
        }
    }

    public static void b0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7474i = i17;
        nxVar.f7469d = i18;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
    }

    public static void c(com.tencent.mm.wallet_core.ui.q1... q1VarArr) {
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.f1(q1VarArr), null));
    }

    public static void c0(java.lang.String str, java.lang.String str2, int i17, int i18, l81.e1 e1Var) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        b1Var.f317022f = str2;
        b1Var.f317018d = i17;
        b1Var.f317032k = i18;
        b1Var.f317016c = 0;
        b1Var.L = e1Var;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
    }

    public static void d(android.widget.TextView textView) {
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    public static void d0(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (c01.e2.J(str)) {
            S(context, str);
        } else {
            a0(context, str);
        }
    }

    public static int e(java.lang.String str) {
        if ("1".equals(str)) {
            return 0;
        }
        if ("2".equals(str)) {
            return 4;
        }
        if ("3".equals(str)) {
            return 12;
        }
        if ("4".equals(str)) {
            return 2;
        }
        if ("5".equals(str)) {
            return 8;
        }
        if ("6".equals(str)) {
            return 14;
        }
        if ("7".equals(str)) {
            return 16;
        }
        return "8".equals(str) ? 10 : -1;
    }

    public static java.lang.String e0(java.lang.String str) {
        if (str == null || str.length() <= 8) {
            return str;
        }
        int length = str.length();
        return str.substring(0, length - 8) + "****" + str.substring(length - 4);
    }

    public static long f(int i17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i17 / 10000, ((i17 % 10000) / 100) - 1, i17 % 100);
        return calendar.getTimeInMillis();
    }

    public static java.lang.String f0(java.lang.String str) {
        if (str == null || str.length() < 1) {
            return "";
        }
        java.lang.String substring = str.substring(1, str.length());
        str.substring(0, 1);
        return "*" + substring;
    }

    public static void g(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + str));
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "dial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "dial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static java.lang.String g0(java.lang.String str) {
        if (str == null || str.length() < 2) {
            return f0(str);
        }
        return "**" + str.substring(str.length() - 1, str.length());
    }

    public static java.lang.String h(java.lang.String str, int i17) {
        return I(x(str), i17);
    }

    public static java.math.BigDecimal h0(java.lang.String str, java.lang.String str2, int i17, java.math.RoundingMode roundingMode) {
        try {
            double F = com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d);
            double F2 = com.tencent.mm.sdk.platformtools.t8.F(str2, 0.0d);
            java.lang.String str3 = "0";
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(F == 0.0d ? "0" : str.trim());
            if (F2 != 0.0d) {
                str3 = str2.trim();
            }
            return bigDecimal.multiply(new java.math.BigDecimal(str3)).setScale(i17, roundingMode);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e17, "", new java.lang.Object[0]);
            return new java.math.BigDecimal(0);
        }
    }

    public static java.math.BigDecimal i(java.lang.String str, java.lang.String str2, int i17, java.math.RoundingMode roundingMode) {
        try {
            return new java.math.BigDecimal(com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d) == 0.0d ? "0" : str.trim()).divide(new java.math.BigDecimal(str2.trim()), i17, roundingMode);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e17, "", new java.lang.Object[0]);
            return new java.math.BigDecimal(0);
        }
    }

    public static int i0(java.lang.String str, java.lang.String str2) {
        return h0(str, str2, 0, java.math.RoundingMode.HALF_UP).intValue();
    }

    public static double j(java.lang.String str, java.lang.String str2, int i17, java.math.RoundingMode roundingMode) {
        return i(str, str2, i17, roundingMode).doubleValue();
    }

    public static long j0(java.lang.String str, java.lang.String str2) {
        return h0(str, str2, 0, java.math.RoundingMode.HALF_UP).longValue();
    }

    public static void k(android.view.View view, int i17) {
        android.view.View view2 = (android.view.View) view.getParent();
        view2.post(new com.tencent.mm.wallet_core.ui.k1(view, i17, view2));
    }

    public static boolean k0(org.json.JSONObject jSONObject, java.lang.String str) {
        return "1".equals(jSONObject.optString(str, "0"));
    }

    public static java.lang.String l(java.lang.String str) {
        return ("CNY".equals(str) || "1".equals(str) || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? "¥" : str;
    }

    public static int l0(java.lang.String str) {
        long parseLong = java.lang.Long.parseLong(str.substring(2), 16);
        return android.graphics.Color.argb((int) ((parseLong >> 24) & 255), (int) ((parseLong >> 16) & 255), (int) ((parseLong >> 8) & 255), (int) (parseLong & 255));
    }

    public static java.lang.String m(double d17) {
        return n(d17, "");
    }

    public static r45.tw4 m0(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.tw4 tw4Var = new r45.tw4();
        tw4Var.f386831d = jSONObject.optInt("is_show_notice", 0);
        tw4Var.f386833f = jSONObject.optString("left_icon", "");
        tw4Var.f386834g = jSONObject.optString("jump_url", "");
        tw4Var.f386832e = jSONObject.optString("wording", "");
        tw4Var.f386835h = jSONObject.optString("notice_id", "");
        return tw4Var;
    }

    public static java.lang.String n(double d17, java.lang.String str) {
        if ("CNY".equals(str)) {
            return java.lang.String.format("¥%.2f", java.lang.Double.valueOf(d17));
        }
        if ("ZAR".equals(str)) {
            return java.lang.String.format("R%.2f", java.lang.Double.valueOf(d17));
        }
        if ("1".equals(str) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return java.lang.String.format(com.tencent.mm.wallet_core.model.c2.b().concat("%.2f"), java.lang.Double.valueOf(d17));
        }
        return java.lang.String.format(str + "%.2f", java.lang.Double.valueOf(d17));
    }

    public static void n0(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static java.lang.String o(double d17) {
        return java.lang.String.format("%.2f", java.lang.Double.valueOf(d17));
    }

    public static void o0(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (int size = arrayList.size() - 1; size > 0; size--) {
            n0((android.graphics.Bitmap) arrayList.remove(size));
        }
    }

    public static java.lang.String p(int i17) {
        if (f214223b == null) {
            f214223b = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
        }
        return f214223b.format(new java.util.Date(i17 * 1000));
    }

    public static void p0(android.view.View view, com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow) {
        if (myKeyboardWindow != null) {
            myKeyboardWindow.releaseKeyBoardDelegateView();
        }
    }

    public static java.lang.String q(int i17, java.text.SimpleDateFormat simpleDateFormat, java.text.SimpleDateFormat simpleDateFormat2) {
        long j17 = i17 * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j17);
        return gregorianCalendar.get(1) == gregorianCalendar2.get(1) ? simpleDateFormat.format(new java.util.Date(j17)) : simpleDateFormat2.format(new java.util.Date(j17));
    }

    public static void q0(int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12719, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static java.lang.String r(java.lang.String str, long j17) {
        return android.text.format.DateFormat.format(str, j17).toString();
    }

    public static void r0(int i17, int i18, long j17, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13375, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19));
    }

    public static java.lang.String s(java.lang.String str, int i17) {
        try {
            return new java.text.SimpleDateFormat(str).format(new java.text.SimpleDateFormat("yyyyMMdd").parse("" + i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public static void s0(android.view.View view, android.widget.TextView textView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.view.View view2 = view;
        if (textView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBaseUtil ", "hy: text view is null.");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBaseUtil ", "hy: msg is null. set text view to gone");
            if (view2 == null) {
                textView.setVisibility(8);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setVisibility(0);
        }
        textView.setVisibility(0);
        textView.setText(str2);
        o45.eg.a(e(str), 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            textView.setMaxLines(Integer.MAX_VALUE);
            if (view2 == null || (imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a4f)) == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (view2 != null && (imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a4f)) != null) {
            imageView2.setVisibility(0);
        }
        if (view2 == null) {
            view2 = textView;
        }
        view2.setOnClickListener(new com.tencent.mm.wallet_core.ui.j1(str3, textView, str));
    }

    public static int t(long j17) {
        return u(j17, "yyyyMMdd");
    }

    public static void t0(android.widget.TextView textView, java.lang.String str, int i17) {
        java.lang.String h17 = h(str, i17);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, h17, textSize));
    }

    public static int u(long j17, java.lang.String str) {
        java.util.Date date;
        if (j17 <= 0) {
            date = new java.util.Date();
        } else {
            if (j17 < 10000000000L) {
                j17 *= 1000;
            }
            date = new java.util.Date(j17);
        }
        try {
            return java.lang.Integer.parseInt(new java.text.SimpleDateFormat(str).format(date));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    public static void u0(com.tencent.mm.ui.MMActivity mMActivity) {
        mMActivity.getWindow().getDecorView().setSystemUiVisibility(1792);
        mMActivity.getWindow().addFlags(Integer.MIN_VALUE);
        mMActivity.getWindow().setStatusBarColor(0);
        mMActivity.getWindow().setNavigationBarColor(0);
        if (mMActivity.getSupportActionBar() != null) {
            mMActivity.getSupportActionBar().o();
        }
    }

    public static long v(r45.cg0 cg0Var) {
        if (cg0Var != null) {
            return com.tencent.mm.ui.bk.C() ? cg0Var.f371539e : cg0Var.f371538d;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return 0L;
    }

    public static void v0(android.widget.EditText editText) {
        try {
            java.lang.reflect.Method method = android.widget.EditText.class.getMethod("setShowSoftInputOnFocus", java.lang.Boolean.TYPE);
            method.setAccessible(false);
            method.invoke(editText, java.lang.Boolean.FALSE);
        } catch (java.lang.NoSuchMethodException unused) {
            com.tencent.mars.xlog.Log.e("erik", "setShowSoftInputOnFocus exception!");
            try {
                java.lang.reflect.Method method2 = android.widget.EditText.class.getMethod("setSoftInputShownOnFocus", java.lang.Boolean.TYPE);
                method2.setAccessible(false);
                method2.invoke(editText, java.lang.Boolean.FALSE);
            } catch (java.lang.Exception e17) {
                editText.setInputType(0);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e17, "", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e18, "", new java.lang.Object[0]);
        }
    }

    public static java.lang.String w(java.lang.String str) {
        return "CNY".equals(str) ? "¥" : "ZAR".equals(str) ? "R" : ("1".equals(str) || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? com.tencent.mm.wallet_core.model.c2.b() : str;
    }

    public static void w0(android.widget.TextView textView, java.lang.String str, int i17, int i18, com.tencent.mm.wallet_core.ui.a0 a0Var, android.content.Context context) {
        x0(textView, str, i17, i18, a0Var, context, true);
    }

    public static java.lang.String x(java.lang.String str) {
        gm0.j1.i();
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
        java.lang.String g27 = f07 != null ? f07.g2() : null;
        return com.tencent.mm.sdk.platformtools.t8.K0(g27) ? str : g27;
    }

    public static void x0(android.widget.TextView textView, java.lang.String str, int i17, int i18, com.tencent.mm.wallet_core.ui.a0 a0Var, android.content.Context context, boolean z17) {
        textView.setClickable(true);
        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(context));
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        spannableStringBuilder.setSpan(a0Var, i17, i18, 18);
        textView.setText(spannableStringBuilder);
        if (z17) {
            d(textView);
        }
    }

    public static java.lang.String y(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        java.lang.String str2 = "";
        for (int i17 = 0; i17 < str.length() - 1; i17++) {
            str2 = str2 + "*";
        }
        return str2 + str.substring(str.length() - 1, str.length());
    }

    public static void y0(android.content.Context context, java.lang.String str, com.tencent.mm.wallet_core.ui.o1 o1Var) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = context.getString(com.tencent.mm.R.string.l0g);
        }
        u1Var.g(str);
        u1Var.l(new com.tencent.mm.wallet_core.ui.d1(o1Var));
        u1Var.n(context.getString(com.tencent.mm.R.string.ke6));
        u1Var.q(false);
    }

    public static com.tencent.mm.wallet_core.ui.m1 z(ot0.q qVar) {
        java.lang.String r17 = c01.z1.r();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(qVar.D1)) {
            java.util.Iterator it = ((java.util.ArrayList) qVar.D1).iterator();
            while (it.hasNext()) {
                java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                if (split.length == 4 && split[0].equals(r17)) {
                    com.tencent.mm.wallet_core.ui.m1 m1Var = new com.tencent.mm.wallet_core.ui.m1(1, com.tencent.mm.sdk.platformtools.t8.P(split[1], -1), com.tencent.mm.sdk.platformtools.t8.P(split[2], -1), com.tencent.mm.sdk.platformtools.t8.P(split[3], -1));
                    m1Var.f214207c = r17;
                    return m1Var;
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(qVar.E1)) {
            java.util.Iterator it6 = ((java.util.ArrayList) qVar.E1).iterator();
            while (it6.hasNext()) {
                java.lang.String[] split2 = ((java.lang.String) it6.next()).split(",");
                if (split2.length == 3 && split2[0].equals(r17)) {
                    com.tencent.mm.wallet_core.ui.m1 m1Var2 = new com.tencent.mm.wallet_core.ui.m1(2, com.tencent.mm.sdk.platformtools.t8.P(split2[2], -1), com.tencent.mm.sdk.platformtools.t8.V(split2[1], -1L));
                    m1Var2.f214207c = r17;
                    return m1Var2;
                }
            }
        }
        return new com.tencent.mm.wallet_core.ui.m1(3);
    }

    public static com.tencent.mm.ui.widget.dialog.z2 z0(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.wallet_core.model.q qVar) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(activity, 1, 3);
        z2Var.m(activity.getString(com.tencent.mm.R.string.f490373t6), activity.getString(com.tencent.mm.R.string.f490007i9));
        com.tencent.mm.wallet_core.ui.z0 z0Var = new com.tencent.mm.wallet_core.ui.z0(z2Var, qVar);
        com.tencent.mm.wallet_core.ui.a1 a1Var = new com.tencent.mm.wallet_core.ui.a1(z2Var, qVar);
        z2Var.D = z0Var;
        z2Var.E = a1Var;
        android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.f489607d52, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.p_v);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(str);
        z2Var.s(inflate);
        android.view.View inflate2 = android.view.View.inflate(activity, com.tencent.mm.R.layout.f489606d51, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.p_u);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        w0(textView2, str2, 0, str2.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.wallet_core.ui.b1(activity, str3), true), activity);
        z2Var.j(inflate2);
        z2Var.C();
        return z2Var;
    }
}
