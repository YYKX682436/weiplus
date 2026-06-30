package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class e1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178151a;

    public e1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178151a = walletLqtDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178151a;
        if (zg5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
            walletLqtDetailUI.f177952f = zg5Var;
            if (!walletLqtDetailUI.f177971x0 && !com.tencent.mm.sdk.platformtools.t8.K0(zg5Var.V)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(walletLqtDetailUI.f177952f.V);
                    java.lang.String optString = jSONObject.optString("done_button_wording");
                    int optInt = jSONObject.optInt("is_show_protocol", 0);
                    java.lang.String optString2 = jSONObject.optString("left_protocol_wording");
                    java.lang.String optString3 = jSONObject.optString("new_upload_credit_url");
                    java.lang.String optString4 = jSONObject.optString("protocol_url");
                    java.lang.String optString5 = jSONObject.optString("right_protocol_wording");
                    java.lang.String optString6 = jSONObject.optString("subtitle");
                    java.lang.String optString7 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("upload_reasons");
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    if (optJSONArray != null) {
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            linkedList.add(optJSONArray.optString(i17));
                        }
                    }
                    com.tencent.mm.plugin.wallet_core.ui.x4.c(walletLqtDetailUI.getContext(), optString7, optString6, linkedList, optString, optInt, optString2, optString5, optString4, optString3);
                    walletLqtDetailUI.f177971x0 = true;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e17, "", new java.lang.Object[0]);
                }
            }
            walletLqtDetailUI.e7(false);
            if (zg5Var.f392031x1) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.W6(walletLqtDetailUI);
            }
            r45.na5 na5Var = zg5Var.B1;
            if (na5Var != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(na5Var.f381199d)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog title is nil, ignore show");
                } else if (walletLqtDetailUI.M1 != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog has been shown");
                } else {
                    java.lang.String className = walletLqtDetailUI.getComponentName().getClassName();
                    if (className.contains(".")) {
                        className = className.substring(className.lastIndexOf(".") + 1);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.n0(walletLqtDetailUI).equalsIgnoreCase(className)) {
                        r45.bq bqVar = na5Var.f381203h;
                        if (bqVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bqVar.f370960g)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog first_button is null");
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 3);
                            r45.bq bqVar2 = na5Var.f381204i;
                            if ((bqVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(bqVar2.f370960g)) ? false : true) {
                                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(walletLqtDetailUI, 1, 0);
                                walletLqtDetailUI.M1 = z2Var;
                                z2Var.m(na5Var.f381203h.f370960g, na5Var.f381204i.f370960g);
                                com.tencent.mm.ui.widget.dialog.z2 z2Var2 = walletLqtDetailUI.M1;
                                com.tencent.mm.plugin.wallet.balance.ui.lqt.d1 d1Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d1(walletLqtDetailUI, na5Var);
                                com.tencent.mm.plugin.wallet.balance.ui.lqt.f1 f1Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.f1(walletLqtDetailUI, na5Var);
                                z2Var2.D = d1Var;
                                z2Var2.E = f1Var;
                                com.tencent.mm.ui.bk.s0(z2Var2.f212068t.getPaint());
                                com.tencent.mm.ui.bk.s0(walletLqtDetailUI.M1.f212069u.getPaint());
                            } else {
                                com.tencent.mm.ui.widget.dialog.z2 z2Var3 = new com.tencent.mm.ui.widget.dialog.z2(walletLqtDetailUI, 2, 0);
                                walletLqtDetailUI.M1 = z2Var3;
                                z2Var3.y(na5Var.f381203h.f370960g);
                                com.tencent.mm.ui.widget.dialog.z2 z2Var4 = walletLqtDetailUI.M1;
                                z2Var4.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.g1(walletLqtDetailUI, na5Var);
                                com.tencent.mm.ui.bk.s0(z2Var4.f212072x.getPaint());
                            }
                            walletLqtDetailUI.M1.l(new com.tencent.mm.plugin.wallet.balance.ui.lqt.h1(walletLqtDetailUI));
                            android.view.View inflate = android.view.LayoutInflater.from(walletLqtDetailUI.getContext()).inflate(com.tencent.mm.R.layout.btv, (android.view.ViewGroup) null);
                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ltu);
                            com.tencent.mm.wallet_core.ui.r1.d(textView);
                            textView.setText(na5Var.f381199d);
                            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o3l)).setText(walletLqtDetailUI.getString(com.tencent.mm.R.string.kor));
                            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ltt);
                            if (com.tencent.mm.ui.bk.C()) {
                                imageView.setBackgroundResource(com.tencent.mm.R.drawable.c8v);
                            } else {
                                imageView.setBackgroundResource(com.tencent.mm.R.drawable.c8u);
                            }
                            walletLqtDetailUI.M1.j(inflate);
                            walletLqtDetailUI.M1.C();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtDetailUI", "showFirstPurchaseDialog when is not top activity, ignore show");
                    }
                }
            }
            r45.na5 na5Var2 = zg5Var.E1;
            if (na5Var2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show upgrade to fixed deposit dialog");
                if (com.tencent.mm.sdk.platformtools.t8.K0(na5Var2.f381199d) || com.tencent.mm.sdk.platformtools.t8.K0(na5Var2.f381200e) || com.tencent.mm.sdk.platformtools.t8.K0(na5Var2.f381209q)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "key info is null");
                } else if (walletLqtDetailUI.N1 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "has shown upgrade dialog before!");
                } else {
                    java.lang.String className2 = walletLqtDetailUI.getComponentName().getClassName();
                    if (className2.contains(".")) {
                        className2 = className2.substring(className2.lastIndexOf(".") + 1);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.n0(walletLqtDetailUI).equalsIgnoreCase(className2)) {
                        walletLqtDetailUI.N1 = new com.tencent.mm.ui.widget.dialog.z2(walletLqtDetailUI, 2, 3, false);
                        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(walletLqtDetailUI.getContext());
                        android.widget.TextView textView2 = new android.widget.TextView(walletLqtDetailUI.getContext());
                        textView2.setText(na5Var2.f381199d);
                        textView2.setTextColor(walletLqtDetailUI.getResources().getColor(com.tencent.mm.R.color.FG_0));
                        textView2.setTextSize(1, (i65.a.b(walletLqtDetailUI.getContext(), 17) * i65.a.q(walletLqtDetailUI.getContext())) / i65.a.g(walletLqtDetailUI.getContext()));
                        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins(i65.a.b(walletLqtDetailUI.getContext(), 24), i65.a.b(walletLqtDetailUI.getContext(), 40), 0, 0);
                        textView2.setLayoutParams(layoutParams);
                        linearLayout.addView(textView2);
                        walletLqtDetailUI.N1.t(linearLayout);
                        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(walletLqtDetailUI.getContext());
                        linearLayout2.setOrientation(1);
                        android.widget.TextView textView3 = new android.widget.TextView(walletLqtDetailUI.getContext());
                        textView3.setText(na5Var2.f381200e);
                        textView3.setTextColor(walletLqtDetailUI.getResources().getColor(com.tencent.mm.R.color.FG_0));
                        textView3.setTextSize(1, (i65.a.b(walletLqtDetailUI.getContext(), 14) * i65.a.q(walletLqtDetailUI.getContext())) / i65.a.g(walletLqtDetailUI.getContext()));
                        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.setMargins(0, i65.a.b(walletLqtDetailUI.getContext(), 16), 0, 0);
                        textView3.setLayoutParams(layoutParams2);
                        linearLayout2.addView(textView3);
                        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = new com.tencent.mm.pluginsdk.ui.applet.CdnImageView(walletLqtDetailUI.getContext(), null);
                        float b17 = com.tencent.mm.ui.bl.b(walletLqtDetailUI.getContext()).x - (i65.a.b(walletLqtDetailUI.getContext(), 24) * 2);
                        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.width = (int) b17;
                        layoutParams3.height = (int) (b17 * 0.6023392f);
                        layoutParams3.setMargins(0, i65.a.b(walletLqtDetailUI.getContext(), 8), 0, 0);
                        cdnImageView.setLayoutParams(layoutParams3);
                        cdnImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                        cdnImageView.setUrl(na5Var2.f381209q);
                        linearLayout2.addView(cdnImageView);
                        zl5.b.f474086a.a(cdnImageView, i65.a.b(walletLqtDetailUI.getContext(), 8));
                        com.tencent.mm.ui.bk.s0(walletLqtDetailUI.N1.f212072x.getPaint());
                        walletLqtDetailUI.N1.x(1);
                        com.tencent.mm.ui.widget.dialog.z2 z2Var5 = walletLqtDetailUI.N1;
                        z2Var5.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.i1(walletLqtDetailUI);
                        z2Var5.y(na5Var2.f381203h.f370960g);
                        walletLqtDetailUI.N1.j(linearLayout2);
                        walletLqtDetailUI.N1.C();
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtDetailUI", "show upgrade dialog when is not top activity, ignore show");
                    }
                }
            }
            if (walletLqtDetailUI.c7()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "9", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            r45.zg5 zg5Var2 = walletLqtDetailUI.f177952f;
            if (zg5Var2 != null) {
                try {
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_LQT_DETAIL_STRING_SYNC, new java.lang.String(zg5Var2.toByteArray(), s46.a.f403001a));
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e18, "", new java.lang.Object[0]);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail failed");
        }
        android.app.Dialog dialog = walletLqtDetailUI.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
        return null;
    }
}
