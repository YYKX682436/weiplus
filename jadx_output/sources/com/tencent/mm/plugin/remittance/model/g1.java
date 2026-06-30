package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class g1 extends com.tencent.mm.wallet_core.tenpay.model.o {
    public int A;
    public java.util.ArrayList B;
    public r45.tw4 C;
    public com.tencent.mm.plugin.remittance.model.w0 D;
    public java.util.ArrayList E;
    public com.tencent.mm.plugin.remittance.model.b1 F;
    public com.tencent.mm.plugin.remittance.model.v1 H;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156827d;

    /* renamed from: e, reason: collision with root package name */
    public int f156828e;

    /* renamed from: f, reason: collision with root package name */
    public double f156829f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156830g;

    /* renamed from: h, reason: collision with root package name */
    public int f156831h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156832i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f156833m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f156834n;

    /* renamed from: o, reason: collision with root package name */
    public int f156835o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f156836p;

    /* renamed from: q, reason: collision with root package name */
    public final int f156837q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f156838r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f156839s;

    /* renamed from: t, reason: collision with root package name */
    public int f156840t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f156841u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.s0 f156842v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.u0 f156843w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.e1 f156844x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo f156845y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f156846z;
    public java.lang.String G = "";
    public boolean I = false;

    public g1(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        this.f156827d = null;
        this.f156827d = str2;
        this.f156837q = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("transfer_id", str2);
        hashMap.put("trans_id", str);
        hashMap.put("invalid_time", i18 + "");
        hashMap.put("group_username", str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            hashMap.put("transfer_attach", java.net.URLEncoder.encode(str4));
        }
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "trans_id：%s, transaction_id：%s，transfer_attach：%s", str2, str, str4);
        setRequestData(hashMap);
    }

    public static com.tencent.mm.plugin.remittance.model.v0 H(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.remittance.model.v0 v0Var = new com.tencent.mm.plugin.remittance.model.v0();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        v0Var.f157036a = jSONObject.optInt("type");
        v0Var.f157037b = jSONObject.optString("url");
        v0Var.f157038c = jSONObject.optString(dm.i4.COL_USERNAME);
        v0Var.f157039d = jSONObject.optString("pagepath");
        v0Var.f157040e = jSONObject.optString("liteapp_id");
        v0Var.f157041f = jSONObject.optString("liteapp_path");
        return v0Var;
    }

    public static com.tencent.mm.plugin.remittance.model.z0 I(org.json.JSONObject jSONObject) {
        r45.cg0 cg0Var;
        com.tencent.mm.plugin.remittance.model.x0 x0Var;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.remittance.model.z0 z0Var = new com.tencent.mm.plugin.remittance.model.z0();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        z0Var.f157069a = jSONObject.optInt("recv_channel_type");
        z0Var.f157070b = jSONObject.optString("recv_channel_name");
        java.lang.String optString = jSONObject.optString("recv_channel_name_icon", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            try {
                byte[] decode = android.util.Base64.decode(optString, 0);
                if (decode.length > 0) {
                    r45.bz3 bz3Var = new r45.bz3();
                    z0Var.f157071c = bz3Var;
                    bz3Var.parseFrom(decode);
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parse recv_channel_name_icon error：%s", e17.getMessage());
            }
        }
        z0Var.f157072d = jSONObject.optString("recv_channel_logo");
        z0Var.f157073e = jSONObject.optString("recv_channel_logo_darkmode");
        z0Var.f157074f = jSONObject.optInt("recv_channel_avail_state");
        z0Var.f157075g = jSONObject.optInt("recv_channel_unavail_reason");
        z0Var.f157076h = jSONObject.optString("first_choose_wording");
        z0Var.f157077i = K(jSONObject.optJSONObject("jump_remind_info"));
        z0Var.f157084p = jSONObject.optInt("choose_guide_display_times", 3);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("dynamic_bg_color");
        com.tencent.mm.plugin.remittance.model.d1 d1Var = null;
        if (optJSONObject == null) {
            cg0Var = null;
        } else {
            cg0Var = new r45.cg0();
            cg0Var.f371538d = optJSONObject.optLong("normal_color");
            cg0Var.f371539e = optJSONObject.optLong("dark_mode_color");
        }
        z0Var.f157085q = cg0Var;
        try {
            byte[] decode2 = android.util.Base64.decode(jSONObject.optString("float_button", ""), 0);
            if (decode2.length != 0) {
                r45.gq gqVar = new r45.gq();
                z0Var.f157086r = gqVar;
                gqVar.parseFrom(decode2);
            }
        } catch (java.io.IOException unused) {
        }
        z0Var.f157078j = M(jSONObject.optJSONObject("unavail_tips"));
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("recv_channel_sub_title");
        if (optJSONObject2 == null) {
            x0Var = null;
        } else {
            x0Var = new com.tencent.mm.plugin.remittance.model.x0();
            try {
                byte[] decode3 = android.util.Base64.decode(optJSONObject2.optString("wording", ""), 0);
                if (decode3.length != 0) {
                    r45.rl6 rl6Var = new r45.rl6();
                    x0Var.f157060a = rl6Var;
                    rl6Var.parseFrom(decode3);
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", e18, "", new java.lang.Object[0]);
            }
            try {
                byte[] decode4 = android.util.Base64.decode(optJSONObject2.optString("info_icon", ""), 0);
                if (decode4.length != 0) {
                    r45.gq gqVar2 = new r45.gq();
                    x0Var.f157061b = gqVar2;
                    gqVar2.parseFrom(decode4);
                }
            } catch (java.io.IOException unused2) {
            }
            try {
                byte[] decode5 = android.util.Base64.decode(optJSONObject2.optString("used_wording", ""), 0);
                if (decode5.length != 0) {
                    r45.rl6 rl6Var2 = new r45.rl6();
                    x0Var.f157062c = rl6Var2;
                    rl6Var2.parseFrom(decode5);
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", e19, "", new java.lang.Object[0]);
            }
            try {
                byte[] decode6 = android.util.Base64.decode(optJSONObject2.optString("used_info_icon", ""), 0);
                if (decode6.length != 0) {
                    r45.gq gqVar3 = new r45.gq();
                    x0Var.f157063d = gqVar3;
                    gqVar3.parseFrom(decode6);
                }
            } catch (java.io.IOException unused3) {
            }
            x0Var.f157064e = optJSONObject2.optString("click_id");
        }
        z0Var.f157079k = x0Var;
        try {
            byte[] decode7 = android.util.Base64.decode(jSONObject.optString("recv_channel_name_note", ""), 0);
            if (decode7.length != 0) {
                r45.rl6 rl6Var3 = new r45.rl6();
                z0Var.f157080l = rl6Var3;
                rl6Var3.parseFrom(decode7);
            }
        } catch (java.io.IOException unused4) {
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("switch_availchannel_tips");
        if (optJSONArray == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    if (jSONObject2 != null) {
                        com.tencent.mm.plugin.remittance.model.y0 y0Var = new com.tencent.mm.plugin.remittance.model.y0();
                        y0Var.f157065a = jSONObject2.optInt("recv_channel_type", 0);
                        y0Var.f157067c = jSONObject2.optString("bind_serial");
                        y0Var.f157066b = M(jSONObject2.optJSONObject("switch_tips"));
                        arrayList.add(y0Var);
                    }
                } catch (org.json.JSONException e27) {
                    com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e27.getMessage());
                }
            }
        }
        z0Var.f157081m = arrayList;
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("once_usage_tips");
        if (optJSONObject3 != null) {
            z0Var.f157082n = M(optJSONObject3);
        }
        java.lang.String optString2 = jSONObject.optString("first_choose_guide", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            try {
                byte[] decode8 = android.util.Base64.decode(optString2, 0);
                if (decode8.length != 0) {
                    r45.yt5 yt5Var = new r45.yt5();
                    z0Var.f157083o = yt5Var;
                    yt5Var.parseFrom(decode8);
                }
            } catch (java.io.IOException e28) {
                com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parse first_choose_guide error：%s", e28.getMessage());
            }
        }
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("sub_recv_channel_info");
        if (optJSONObject4 != null) {
            d1Var = new com.tencent.mm.plugin.remittance.model.d1();
            d1Var.f156805a = optJSONObject4.optString("sub_recv_channel_title", "");
            d1Var.f156806b = optJSONObject4.optInt("default_sub_recv_channel_id", 0);
            d1Var.f156807c = optJSONObject4.optString("sub_recv_channel_list_title", "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            org.json.JSONArray optJSONArray2 = optJSONObject4.optJSONArray("sub_recv_channel_list");
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    org.json.JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i18);
                    if (optJSONObject5 != null) {
                        com.tencent.mm.plugin.remittance.model.c1 c1Var = new com.tencent.mm.plugin.remittance.model.c1();
                        c1Var.f156800a = optJSONObject5.optInt(dm.i4.COL_ID, 0);
                        c1Var.f156801b = optJSONObject5.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
                        arrayList2.add(c1Var);
                    }
                }
            }
            d1Var.f156808d = arrayList2;
        }
        z0Var.f157087s = d1Var;
        z0Var.f157088t = jSONObject.optString("bind_serial");
        return z0Var;
    }

    public static com.tencent.mm.plugin.remittance.model.a1 J(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = null;
        if (jSONObject == null) {
            return null;
        }
        com.tencent.mm.plugin.remittance.model.a1 a1Var = new com.tencent.mm.plugin.remittance.model.a1();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("recv_channel_type_list");
        if (optJSONArray == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    arrayList.add(java.lang.Integer.valueOf(optJSONArray.getInt(i17)));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e17.getMessage());
                }
            }
        }
        a1Var.f156786a = arrayList;
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("recv_channel_account_list");
        if (optJSONArray2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            try {
                int length = optJSONArray2.length();
                for (int i18 = 0; i18 < length; i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray2.optJSONObject(i18);
                    if (optJSONObject != null) {
                        com.tencent.mm.plugin.remittance.model.w1 w1Var = new com.tencent.mm.plugin.remittance.model.w1(0, null, 3, null);
                        w1Var.f157055a = optJSONObject.optInt("recv_channel_type");
                        java.lang.String optString = optJSONObject.optString("bind_serial");
                        kotlin.jvm.internal.o.f(optString, "optString(...)");
                        w1Var.f157056b = optString;
                        arrayList3.add(w1Var);
                    }
                }
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUtil", "parseRecvChannelAccountList error: %s", e18.getMessage());
            }
            arrayList2 = arrayList3;
        }
        a1Var.f156787b = arrayList2;
        return a1Var;
    }

    public static com.tencent.mm.plugin.remittance.model.e1 K(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.remittance.model.e1 e1Var = new com.tencent.mm.plugin.remittance.model.e1();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        e1Var.f156811a = jSONObject.optString("wording");
        e1Var.f156812b = H(jSONObject.optJSONObject("jump_info"));
        return e1Var;
    }

    public static java.util.ArrayList L(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new org.json.JSONArray();
        }
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseTextInfoList res：%s", jSONArray.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    arrayList.add(K(jSONObject));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseTextInfoList error：%s", e17.getMessage());
            }
        }
        return arrayList;
    }

    public static com.tencent.mm.plugin.remittance.model.f1 M(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.remittance.model.f1 f1Var = new com.tencent.mm.plugin.remittance.model.f1();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        f1Var.f156815a = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        f1Var.f156816b = jSONObject.optString("wording");
        f1Var.f156817c = jSONObject.optString("btn_text");
        return f1Var;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1628;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/transferquery";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.remittance.model.w0 w0Var;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.remittance.model.v1 v1Var;
        if (i17 != 0) {
            return;
        }
        this.f156828e = jSONObject.optInt("pay_time");
        this.f156829f = jSONObject.optDouble("fee") / 100.0d;
        this.f156830g = jSONObject.optString("fee_type");
        this.f156831h = jSONObject.optInt("trans_status");
        jSONObject.optString("trans_status_name");
        this.f156835o = jSONObject.optInt("modify_time");
        this.f156833m = jSONObject.optString("payer_name");
        this.f156832i = jSONObject.optString("receiver_name");
        this.f156834n = jSONObject.optBoolean("is_payer");
        this.f156836p = jSONObject.optString("refund_bank_type");
        this.f156838r = jSONObject.optString("status_desc");
        this.f156839s = jSONObject.optString("status_supplementary");
        this.f156840t = jSONObject.optInt("delay_confirm_flag");
        jSONObject.optString("banner_content");
        jSONObject.optString("banner_url");
        this.f156841u = jSONObject.optString("desc");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("addr_info");
        com.tencent.mm.plugin.remittance.model.s0 s0Var = new com.tencent.mm.plugin.remittance.model.s0();
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        s0Var.f157011a = optJSONObject.optString("address_name");
        s0Var.f157012b = optJSONObject.optString("phone_num");
        s0Var.f157013c = optJSONObject.optString("address");
        this.f156842v = s0Var;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("exposure_info");
        com.tencent.mm.plugin.remittance.model.u0 u0Var = new com.tencent.mm.plugin.remittance.model.u0();
        if (optJSONObject2 == null) {
            optJSONObject2 = new org.json.JSONObject();
        }
        u0Var.f157029a = optJSONObject2.optString("icon");
        u0Var.f157030b = optJSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        u0Var.f157031c = optJSONObject2.optString("wording");
        u0Var.f157032d = optJSONObject2.optInt("is_show_btn");
        u0Var.f157033e = optJSONObject2.optString("btn_wording");
        u0Var.f157034f = H(optJSONObject2.optJSONObject("jump_info"));
        this.f156843w = u0Var;
        this.f156844x = K(jSONObject.optJSONObject("text_info"));
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("resend_info");
        com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo resendMsgInfo = new com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo();
        if (optJSONObject3 == null) {
            optJSONObject3 = new org.json.JSONObject();
        }
        resendMsgInfo.f188590d = optJSONObject3.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        resendMsgInfo.f188591e = optJSONObject3.optString("pic");
        resendMsgInfo.f188592f = optJSONObject3.optString("description");
        resendMsgInfo.f188593g = optJSONObject3.optString("left_button_wording");
        resendMsgInfo.f188594h = optJSONObject3.optString("right_button_wording");
        this.f156845y = resendMsgInfo;
        K(jSONObject.optJSONObject("middle_info"));
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("desc_item_list");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        org.json.JSONArray jSONArray = optJSONArray;
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseDescItemList res：%s", jSONArray.toString());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
            try {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                if (jSONObject2 != null) {
                    com.tencent.mm.plugin.remittance.model.t0 t0Var = new com.tencent.mm.plugin.remittance.model.t0();
                    t0Var.f157020a = jSONObject2.optString("key");
                    t0Var.f157021b = jSONObject2.optString("value");
                    t0Var.f157022c = jSONObject2.optBoolean("is_separate_line");
                    try {
                        byte[] decode = android.util.Base64.decode(jSONObject2.optString("value_text", ""), 0);
                        if (decode.length != 0) {
                            r45.rl6 rl6Var = new r45.rl6();
                            t0Var.f157023d = rl6Var;
                            rl6Var.parseFrom(decode);
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", e17, "", new java.lang.Object[0]);
                    }
                    arrayList2.add(t0Var);
                }
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseDescItemList error：%s", e18.getMessage());
            }
        }
        this.f156846z = arrayList2;
        this.A = jSONObject.optInt("trade_mem_type", 0);
        this.E = L(jSONObject.optJSONArray("upright_corner_list"));
        this.C = com.tencent.mm.wallet_core.ui.r1.m0(jSONObject.optJSONObject("notice_item"));
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("recv_account_info");
        com.tencent.mm.plugin.remittance.model.b1 b1Var = null;
        if (optJSONObject4 == null) {
            w0Var = null;
        } else {
            w0Var = new com.tencent.mm.plugin.remittance.model.w0();
            w0Var.f157047a = M(optJSONObject4.optJSONObject("acct_usage_tips"));
            w0Var.f157048b = optJSONObject4.optString("no_availabel_account_wording");
            w0Var.f157049c = optJSONObject4.optString("list_title");
            org.json.JSONArray optJSONArray2 = optJSONObject4.optJSONArray("recv_channel");
            if (optJSONArray2 == null) {
                optJSONArray2 = new org.json.JSONArray();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                try {
                    org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i19);
                    if (jSONObject3 != null) {
                        arrayList3.add(I(jSONObject3));
                    }
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e19.getMessage());
                }
            }
            w0Var.f157050d = arrayList3;
            org.json.JSONArray optJSONArray3 = optJSONObject4.optJSONArray("recv_channel_group_list");
            if (optJSONArray3 == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (int i27 = 0; i27 < optJSONArray3.length(); i27++) {
                    try {
                        org.json.JSONObject jSONObject4 = optJSONArray3.getJSONObject(i27);
                        if (jSONObject4 != null) {
                            arrayList.add(J(jSONObject4));
                        }
                    } catch (org.json.JSONException e27) {
                        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e27.getMessage());
                    }
                }
            }
            w0Var.f157051e = arrayList;
            w0Var.f157052f = optJSONObject4.optInt("default_recv_channel_type");
            w0Var.f157053g = optJSONObject4.optString("default_bind_serial");
            w0Var.f157054h = optJSONObject4.optString("default_recv_channel_event_id");
        }
        this.D = w0Var;
        this.B = L(jSONObject.optJSONArray("customer_info_list"));
        org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("operation_info");
        if (optJSONObject5 != null) {
            b1Var = new com.tencent.mm.plugin.remittance.model.b1();
            b1Var.f156791a = optJSONObject5.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            b1Var.f156792b = optJSONObject5.optString("left_subtitle");
            b1Var.f156793c = optJSONObject5.optString("left_wording");
            b1Var.f156794d = optJSONObject5.optString("right_subtitle");
            b1Var.f156795e = optJSONObject5.optString("right_wording");
            b1Var.f156796f = H(optJSONObject5.optJSONObject("jump_info"));
        }
        this.F = b1Var;
        this.G = jSONObject.optString("tail_info");
        this.I = jSONObject.optBoolean("is_quota_exceeded");
        org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("limit_info");
        if (optJSONObject6 == null) {
            v1Var = new com.tencent.mm.plugin.remittance.model.v1(null, null, null, 7, null);
        } else {
            com.tencent.mm.plugin.remittance.model.v1 v1Var2 = new com.tencent.mm.plugin.remittance.model.v1(null, null, null, 7, null);
            v1Var2.f157042a = optJSONObject6.optString("icon_url");
            v1Var2.f157043b = optJSONObject6.optString("dark_icon_url");
            v1Var2.f157044c = optJSONObject6.optString("jump_info");
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUtil", "[parseLimitInfo] content: " + v1Var2);
            v1Var = v1Var2;
        }
        this.H = v1Var;
    }
}
