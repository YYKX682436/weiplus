package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public abstract class z1 {
    public static int a(long j17) {
        return android.graphics.Color.argb((int) ((j17 >> 24) & 255), (int) ((j17 >> 16) & 255), (int) ((j17 >> 8) & 255), (int) (j17 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:10:0x0014, B:12:0x0027, B:14:0x002c, B:16:0x0034, B:17:0x003a, B:19:0x0044, B:24:0x0055, B:26:0x005f, B:29:0x0097, B:31:0x009c, B:33:0x00b0, B:35:0x00b5, B:37:0x0066, B:39:0x0070, B:42:0x007b, B:44:0x0080, B:45:0x0087, B:46:0x008e), top: B:9:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:10:0x0014, B:12:0x0027, B:14:0x002c, B:16:0x0034, B:17:0x003a, B:19:0x0044, B:24:0x0055, B:26:0x005f, B:29:0x0097, B:31:0x009c, B:33:0x00b0, B:35:0x00b5, B:37:0x0066, B:39:0x0070, B:42:0x007b, B:44:0x0080, B:45:0x0087, B:46:0x008e), top: B:9:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r9, boolean r10) {
        /*
            r45.cg0 r0 = new r45.cg0
            r0.<init>()
            if (r9 != 0) goto L9
            r9 = 0
            return r9
        L9:
            boolean r1 = com.tencent.mm.ui.bk.C()
            if (r1 != 0) goto L14
            int r9 = android.graphics.Color.parseColor(r9)
            return r9
        L14:
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)     // Catch: java.lang.Exception -> Lbe
            e42.e0 r1 = (e42.e0) r1     // Catch: java.lang.Exception -> Lbe
            e42.d0 r2 = e42.d0.clicfg_android_no_kinda_dark_mode_sw     // Catch: java.lang.Exception -> Lbe
            h62.d r1 = (h62.d) r1     // Catch: java.lang.Exception -> Lbe
            r3 = 1
            int r1 = r1.Ni(r2, r3)     // Catch: java.lang.Exception -> Lbe
            if (r1 != 0) goto L2c
            int r9 = android.graphics.Color.parseColor(r9)     // Catch: java.lang.Exception -> Lbe
            return r9
        L2c:
            java.lang.String r1 = "#"
            boolean r1 = r9.startsWith(r1)     // Catch: java.lang.Exception -> Lbe
            if (r1 == 0) goto L39
            java.lang.String r1 = r9.substring(r3)     // Catch: java.lang.Exception -> Lbe
            goto L3a
        L39:
            r1 = r9
        L3a:
            r2 = 16
            long r3 = java.lang.Long.parseLong(r1, r2)     // Catch: java.lang.Exception -> Lbe
            r5 = -1
            if (r10 == 0) goto L8e
            java.lang.String r10 = "ff000000"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L87
            r7 = 0
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L55
            goto L87
        L55:
            java.lang.String r10 = "78000000"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L66
            java.lang.String r10 = "80FFFFFF"
            long r1 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            goto L93
        L66:
            java.lang.String r10 = "909090"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L80
            java.lang.String r10 = "ff909090"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L7b
            goto L80
        L7b:
            r0.f371538d = r3     // Catch: java.lang.Exception -> Lbe
            r0.f371539e = r5     // Catch: java.lang.Exception -> Lbe
            goto L92
        L80:
            java.lang.String r10 = "4DFFFFFF"
            long r1 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            goto L93
        L87:
            java.lang.String r10 = "CCFFFFFF"
            long r1 = java.lang.Long.parseLong(r10, r2)     // Catch: java.lang.Exception -> Lbe
            goto L93
        L8e:
            r0.f371538d = r3     // Catch: java.lang.Exception -> Lbe
            r0.f371539e = r5     // Catch: java.lang.Exception -> Lbe
        L92:
            r1 = r5
        L93:
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L9c
            int r9 = a(r1)     // Catch: java.lang.Exception -> Lbe
            return r9
        L9c:
            java.lang.Class<h45.q> r10 = h45.q.class
            i95.m r10 = i95.n0.c(r10)     // Catch: java.lang.Exception -> Lbe
            h45.q r10 = (h45.q) r10     // Catch: java.lang.Exception -> Lbe
            long r1 = r0.f371538d     // Catch: java.lang.Exception -> Lbe
            long r3 = r0.f371539e     // Catch: java.lang.Exception -> Lbe
            long r0 = r10.getColorByMode(r1, r3)     // Catch: java.lang.Exception -> Lbe
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 == 0) goto Lb5
            int r9 = a(r0)     // Catch: java.lang.Exception -> Lbe
            return r9
        Lb5:
            int r10 = android.graphics.Color.parseColor(r9)     // Catch: java.lang.Exception -> Lbe
            int r9 = com.tencent.mm.ui.bk.d(r10)     // Catch: java.lang.Exception -> Lbe
            return r9
        Lbe:
            int r9 = android.graphics.Color.parseColor(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.utils.z1.b(java.lang.String, boolean):int");
    }

    public static void c(android.content.Context context, r45.yt5 yt5Var, android.os.Bundle bundle) {
        d(context, yt5Var, bundle, null, null, null);
    }

    public static void d(android.content.Context context, r45.yt5 yt5Var, android.os.Bundle bundle, l81.e1 e1Var, com.tencent.mm.plugin.wallet_core.utils.y1 y1Var, q80.f0 f0Var) {
        if (yt5Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayViewEngineRender", "route info type: %s, uri: %s", java.lang.Integer.valueOf(yt5Var.f391354d), yt5Var.f391355e);
        int i17 = yt5Var.f391354d;
        if (i17 == 1) {
            com.tencent.mm.wallet_core.ui.r1.X(context, yt5Var.f391355e, true);
            return;
        }
        if (i17 == 2) {
            if (yt5Var.f391356f == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WcPayViewEngineRender", "tiny app uri is null");
                return;
            }
            int i18 = bundle != null ? bundle.getInt("key_tiny_app_scene", 1000) : 1000;
            if (e1Var != null) {
                r45.nm6 nm6Var = yt5Var.f391356f;
                com.tencent.mm.wallet_core.ui.r1.c0(nm6Var.f381518d, nm6Var.f381519e, nm6Var.f381520f, i18, e1Var);
                return;
            } else {
                r45.nm6 nm6Var2 = yt5Var.f391356f;
                com.tencent.mm.wallet_core.ui.r1.b0(nm6Var2.f381518d, nm6Var2.f381519e, nm6Var2.f381520f, i18);
                return;
            }
        }
        if (i17 == 3) {
            return;
        }
        if (i17 != 4) {
            if (i17 == 5) {
                if (yt5Var.f391355e.equals("wxpay://lqp/balanceQuotaState")) {
                    j45.l.j(context, "wallet_ecard", ".ui.WalletECardLogoutUI", new android.content.Intent(), null);
                    return;
                }
                return;
            }
            if (i17 == 13) {
                return;
            }
            if (i17 != 15) {
                if (i17 == 17) {
                    com.tencent.mm.wallet_core.ui.r1.Y(context, yt5Var.f391368u, f0Var);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WcPayViewEngineRender", "can't handle type: %s, uri: %s", java.lang.Integer.valueOf(i17), yt5Var.f391355e);
                    return;
                }
            }
            r45.o13 o13Var = yt5Var.f391366s;
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            if (o13Var == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "finder_uri type：%s，username：%s , feedid：%s , nonceid：%s", java.lang.Integer.valueOf(o13Var.f381815d), o13Var.f381816e, o13Var.f381817f, o13Var.f381818g);
            int i19 = o13Var.f381815d;
            if (i19 == 0) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).xj(context, o13Var.f381816e, 16, com.tencent.mm.plugin.wallet_core.utils.b1.a(1));
                return;
            } else if (i19 != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "unknown type");
                return;
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(context, o13Var.f381817f, o13Var.f381818g, false, 16, com.tencent.mm.plugin.wallet_core.utils.b1.a(1));
                return;
            }
        }
        if (yt5Var.f391355e.equals("balance") || yt5Var.f391355e.equals("balanceEntryUseCase")) {
            if (((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceEntryUseCase(context)) {
                return;
            }
            j45.l.m(context, "wallet", ".balance.ui.WalletBalanceManagerUI", 65281);
            return;
        }
        if (yt5Var.f391355e.equals("open_wcpay_biz_view")) {
            h45.a0.e(context, bundle);
            return;
        }
        if (yt5Var.f391355e.equals("offline")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_from_scene", 1);
            j45.l.j(context, "offline", ".ui.WalletOfflineEntranceUI", intent, null);
            return;
        }
        if (yt5Var.f391355e.equals("facingReceiveMoney")) {
            h45.a0.k(context, 2);
            return;
        }
        if (yt5Var.f391355e.equals("rewardCode")) {
            j45.l.h(context, "collect", ".reward.ui.QrRewardMainUI");
            return;
        }
        if (yt5Var.f391355e.equals("groupAA")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("enter_scene", 2);
            j45.l.j(context, "aa", ".ui.AAEntranceUI", intent2, null);
            return;
        }
        if (yt5Var.f391355e.equals("f2fLuckyMoney")) {
            j45.l.h(context, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
            return;
        }
        if (yt5Var.f391355e.equals("transferMix")) {
            j45.l.h(context, "remittance", ".mobile.ui.BankMobileRemittanceChooseUI");
            return;
        }
        if (yt5Var.f391355e.equals("FetchBalancePageUseCase")) {
            ((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceFetchPageUseCase(context, new android.os.Bundle());
            return;
        }
        if (yt5Var.f391355e.equals("balanceRechargeUseCase")) {
            ((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceRechargeUIUseCase(context);
            return;
        }
        if (yt5Var.f391355e.equals("addPayCard")) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("key_bind_scene", 15);
            com.tencent.mm.wallet_core.model.n1.d(6, 0);
            com.tencent.mm.wallet_core.model.i1.b(0);
            ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(context, bundle2);
            return;
        }
        if (yt5Var.f391355e.equals("walletUseCase")) {
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("walletUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_core.utils.s1());
            return;
        }
        if (yt5Var.f391355e.equals("bankCard")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayViewEngineRender", "isKindaBankCardManagerEnable");
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("bankCard", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_core.utils.t1());
            return;
        }
        if (yt5Var.f391355e.equals("qmfCard") || yt5Var.f391355e.equals("HoneyPayPayerUseCase")) {
            if (u73.h.g()) {
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("HoneyPayPayerUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_core.utils.u1());
                return;
            } else {
                j45.l.n(context, "honey_pay", ".ui.HoneyPayMainUI", new android.content.Intent(), 65283);
                return;
            }
        }
        if (yt5Var.f391355e.equals("paySecurity")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("wallet_lock_jsapi_scene", 1);
            if (com.tencent.mm.wallet_core.b.a().e()) {
                ((h45.q) i95.n0.c(h45.q.class)).startPaySecurityUseCase(1, null);
                return;
            } else {
                j45.l.n(context, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent3, 65282);
                return;
            }
        }
        if (yt5Var.f391355e.equals("lqt")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("key_account_type", 1);
            if (((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(context)) {
                return;
            }
            j45.l.n(context, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent4, 65286);
            return;
        }
        if (yt5Var.f391355e.equals("realname")) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("real_name_verify_mode", 0);
            bundle3.putInt("entry_scene", 0);
            if (bundle != null) {
                bundle3.putAll(bundle);
            }
            iz5.a.g("context must be activity", context instanceof android.app.Activity);
            com.tencent.mm.wallet_core.a.j((android.app.Activity) context, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle3, new com.tencent.mm.plugin.wallet_core.utils.v1(y1Var));
            return;
        }
        if (yt5Var.f391355e.equals("paySettingsUseCase")) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putString("modifyPwd.sessionId", gm0.j1.b().j() + "_" + com.tencent.mm.wallet_core.ui.r1.B());
            create.putBool("resetPwd.bResetPwdFromPayManage", true);
            create.putInt("resetPwd.realnameScene", 0);
            create.putInt("resetPwd.payScene", 0);
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("paySettingsUseCase", create, new com.tencent.mm.plugin.wallet_core.utils.w1(y1Var));
        }
    }

    public static java.lang.CharSequence e(android.content.Context context, r45.rl6 rl6Var, com.tencent.mm.plugin.wallet_core.utils.x1 x1Var) {
        return f(context, rl6Var, x1Var, java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence f(android.content.Context r19, r45.rl6 r20, com.tencent.mm.plugin.wallet_core.utils.x1 r21, java.lang.Boolean r22) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.utils.z1.f(android.content.Context, r45.rl6, com.tencent.mm.plugin.wallet_core.utils.x1, java.lang.Boolean):java.lang.CharSequence");
    }

    public static void g(com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView, r45.bz3 bz3Var, int i17, int i18, int i19, boolean z17, float f17) {
        cdnImageView.setUseSdcardCache(z17);
        int b17 = (int) (i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) bz3Var.f371174f) * f17);
        int b18 = (int) (f17 * i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) bz3Var.f371175g));
        if (i18 <= 0) {
            i18 = b17;
        }
        if (i19 <= 0) {
            i19 = b18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = cdnImageView.getLayoutParams();
        if (layoutParams != null && i18 > 0 && i19 > 0) {
            layoutParams.width = i18;
            layoutParams.height = i19;
        }
        if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(bz3Var.f371177i)) {
            cdnImageView.b(bz3Var.f371172d, i18, i19, i17);
        } else {
            cdnImageView.b(bz3Var.f371177i, i18, i19, i17);
        }
    }

    public static void h(android.view.View view, r45.t35 t35Var) {
        if (t35Var == null) {
            return;
        }
        view.setPadding(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) t35Var.f386096f), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) t35Var.f386094d), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) t35Var.f386097g), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) t35Var.f386095e));
    }

    public static void i(android.widget.TextView textView, r45.xt5 xt5Var) {
        if (xt5Var == null || textView == null) {
            return;
        }
        j(textView, xt5Var.f390401e);
        h(textView, xt5Var.f390402f);
        long j17 = xt5Var.f390404h;
        int i17 = (int) j17;
        if ((j17 & (-16777216)) == 0) {
            i17 = (int) (j17 | (-16777216));
        }
        if (xt5Var.f390405i != null) {
            i17 = (int) (com.tencent.mm.ui.bk.C() ? xt5Var.f390405i.f371539e : xt5Var.f390405i.f371538d);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        if (xt5Var.f390403g > 0.0f) {
            gradientDrawable.setCornerRadius(i65.a.b(textView.getContext(), (int) xt5Var.f390403g));
        }
        gradientDrawable.setColor(i17);
        textView.setBackground(gradientDrawable);
    }

    public static void j(android.widget.TextView textView, r45.rl6 rl6Var) {
        k(textView, rl6Var, null, java.lang.Boolean.FALSE);
    }

    public static void k(android.widget.TextView textView, r45.rl6 rl6Var, com.tencent.mm.plugin.wallet_core.utils.x1 x1Var, java.lang.Boolean bool) {
        if (m(rl6Var)) {
            textView.setClickable(true);
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(textView.getContext()));
        }
        textView.setText(f(textView.getContext(), rl6Var, x1Var, bool));
    }

    public static void l(android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, r45.d07 d07Var) {
        if (d07Var == null) {
            return;
        }
        r45.mi4 mi4Var = d07Var.f371985e;
        if (mi4Var != null) {
            marginLayoutParams.topMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) mi4Var.f380544d);
            marginLayoutParams.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) mi4Var.f380545e);
            marginLayoutParams.leftMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) mi4Var.f380546f);
            marginLayoutParams.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) mi4Var.f380547g);
        }
        h(view, d07Var.f371984d);
    }

    public static boolean m(r45.rl6 rl6Var) {
        java.util.LinkedList linkedList = rl6Var.f384987d;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = rl6Var.f384987d.iterator();
            while (it.hasNext()) {
                if (((r45.hl6) it.next()).f376275h != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
