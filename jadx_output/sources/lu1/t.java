package lu1;

/* loaded from: classes15.dex */
public abstract class t {
    public static java.lang.String a(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || "null".equals(str)) ? "" : str;
    }

    public static r45.gn b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parseBluetoothInfo json is null");
            return null;
        }
        r45.gn gnVar = new r45.gn();
        gnVar.f375367d = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        gnVar.f375368e = jSONObject.optInt("report_time_interval", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInfoParser", "blueToothInfo.name:%s", gnVar.f375367d);
        return gnVar;
    }

    public static java.util.ArrayList c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("card_array");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    com.tencent.mm.plugin.card.model.CardInfo cardInfo = new com.tencent.mm.plugin.card.model.CardInfo();
                    j(cardInfo, optJSONObject);
                    arrayList.add(cardInfo);
                }
                return arrayList;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
            return null;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.LinkedList d(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            r45.lv lvVar = new r45.lv();
            lvVar.f379843d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            lvVar.f379844e = jSONObject.optString("sub_title");
            lvVar.f379845f = jSONObject.optString("tips");
            lvVar.f379846g = jSONObject.optString("url");
            lvVar.f379847h = jSONObject.optLong("show_flag");
            lvVar.f379848i = jSONObject.optString("primary_color");
            lvVar.f379849m = jSONObject.optString("secondary_color");
            lvVar.f379850n = jSONObject.optString("icon_url");
            lvVar.f379851o = jSONObject.optString("app_brand_user_name");
            lvVar.f379852p = jSONObject.optString("app_brand_pass");
            lvVar.f379853q = jSONObject.optString("finder_username");
            lvVar.f379854r = jSONObject.optString("feed_id");
            lvVar.f379855s = jSONObject.optString("nonce_id");
            linkedList.add(lvVar);
        }
        return linkedList;
    }

    public static java.util.LinkedList e(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            r45.w50 l17 = l(jSONArray.getJSONObject(i17));
            if (l17 != null) {
                linkedList.add(l17);
            }
        }
        return linkedList;
    }

    public static java.util.LinkedList f(org.json.JSONArray jSONArray) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                try {
                    r45.s1 s1Var = new r45.s1();
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    s1Var.f385374d = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                    s1Var.f385375e = jSONObject.optString("url");
                    s1Var.f385377g = jSONObject.optString("tinyapp_path");
                    s1Var.f385376f = jSONObject.optString("tinyapp_username");
                    linkedList.add(s1Var);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
                }
            }
        }
        return linkedList;
    }

    public static r45.ju g(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserannoucement json is null");
            return null;
        }
        r45.ju juVar = new r45.ju();
        juVar.f378103d = jSONObject.optInt("type");
        juVar.f378104e = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        juVar.f378105f = jSONObject.optString("url");
        juVar.f378106g = jSONObject.optInt("endtime");
        juVar.f378107h = jSONObject.optInt("create_time");
        juVar.f378108i = jSONObject.optString("thumb_url");
        return juVar;
    }

    public static r45.rt h(org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList = null;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
            return null;
        }
        r45.rt rtVar = new r45.rt();
        try {
            rtVar.f385181d = jSONObject.optInt("status");
            rtVar.f385182e = jSONObject.optInt("init_balance");
            rtVar.f385183f = jSONObject.optInt("init_bonus");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("cell_list0");
            if (optJSONArray != null) {
                rtVar.f385184g = d(optJSONArray);
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("cell_list1");
            if (optJSONArray2 != null) {
                rtVar.f385185h = d(optJSONArray2);
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("cell_list2");
            if (optJSONArray3 != null) {
                rtVar.f385186i = d(optJSONArray3);
            }
            org.json.JSONArray optJSONArray4 = jSONObject.optJSONArray("acceptors");
            if (optJSONArray4 != null) {
                if (optJSONArray4.length() != 0) {
                    linkedList = new java.util.LinkedList();
                    for (int i17 = 0; i17 < optJSONArray4.length(); i17++) {
                        linkedList.add((java.lang.String) optJSONArray4.get(i17));
                    }
                }
                rtVar.f385187m = linkedList;
            }
            rtVar.f385188n = jSONObject.optInt("avail_num");
            rtVar.f385190p = jSONObject.optInt("code_type");
            rtVar.f385189o = jSONObject.optString("code");
            org.json.JSONArray optJSONArray5 = jSONObject.optJSONArray("secondary_fields");
            if (optJSONArray5 != null) {
                rtVar.f385191q = e(optJSONArray5);
            }
            rtVar.f385192r = jSONObject.optLong("stock_num");
            rtVar.f385193s = jSONObject.optInt("limit_num");
            rtVar.f385194t = jSONObject.optString("user_report_url");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("third_field");
            if (optJSONObject != null) {
                rtVar.f385195u = l(optJSONObject);
            }
            rtVar.f385196v = f(jSONObject.optJSONArray("action_sheets"));
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("card_list_field");
            if (optJSONObject2 != null) {
                rtVar.f385197w = l(optJSONObject2);
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("operate_field");
            if (optJSONObject3 != null) {
                rtVar.f385198x = l(optJSONObject3);
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("limit_field");
            if (optJSONObject4 != null) {
                rtVar.f385199y = l(optJSONObject4);
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("detail_table");
            if (optJSONObject5 != null) {
                rtVar.f385200z = n(optJSONObject5);
            }
            rtVar.A = jSONObject.optString("background_pic_url");
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("gifting_info_cell");
            if (optJSONObject6 != null) {
                rtVar.B = l(optJSONObject6);
            }
            rtVar.C = jSONObject.optString("sign_number");
            org.json.JSONObject optJSONObject7 = jSONObject.optJSONObject("unavailable_qrcode_field");
            if (optJSONObject7 != null) {
                rtVar.D = l(optJSONObject7);
            }
            rtVar.E = jSONObject.optBoolean("is_commom_card");
            rtVar.F = jSONObject.optBoolean("is_location_authorized");
            rtVar.G = l(jSONObject.optJSONObject("finder_field"));
            rtVar.H = l(jSONObject.optJSONObject("feed_field"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
        }
        return rtVar;
    }

    public static void i(com.tencent.mm.plugin.card.model.CardInfo cardInfo, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
            return;
        }
        try {
            j(cardInfo, new org.json.JSONObject(str));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
        }
    }

    public static void j(com.tencent.mm.plugin.card.model.CardInfo cardInfo, org.json.JSONObject jSONObject) {
        r45.j46 j46Var;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
            return;
        }
        cardInfo.field_card_id = a(jSONObject.optString("card_id"));
        cardInfo.field_card_tp_id = a(jSONObject.optString("card_tp_id"));
        cardInfo.field_delete_state_flag = jSONObject.optInt("state_flag");
        cardInfo.field_updateTime = jSONObject.optInt("update_time");
        cardInfo.field_updateSeq = jSONObject.optLong("sequence");
        cardInfo.field_from_username = jSONObject.optString("from_username");
        cardInfo.field_begin_time = jSONObject.optLong("begin_time", 0L);
        cardInfo.field_end_time = jSONObject.optLong("end_time", 0L);
        cardInfo.A1 = jSONObject.optString("encrypt_code");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("card_data_info");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("card_tp_info");
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("share_info");
        cardInfo.f94676x1 = h(optJSONObject);
        cardInfo.f94675p1 = k(optJSONObject2);
        if (optJSONObject3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
            j46Var = null;
        } else {
            r45.j46 j46Var2 = new r45.j46();
            j46Var2.f377580d = optJSONObject3.optString("gift_msg_title");
            j46Var = j46Var2;
        }
        cardInfo.f94677y1 = j46Var;
        r45.vu vuVar = cardInfo.f94675p1;
        if (vuVar != null) {
            cardInfo.f94675p1 = vuVar;
            try {
                cardInfo.field_cardTpInfoData = vuVar.toByteArray();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", e17.getMessage());
            }
            cardInfo.field_block_mask = java.lang.Integer.toString(cardInfo.f94675p1.B);
            cardInfo.field_card_type = cardInfo.f94675p1.f388550i;
            if (android.text.TextUtils.isEmpty(cardInfo.field_card_tp_id)) {
                cardInfo.field_card_tp_id = cardInfo.f94675p1.f388545d;
            }
            if (cardInfo.field_begin_time == 0 && optJSONObject2 != null) {
                cardInfo.field_begin_time = optJSONObject2.optLong("begin_time");
            }
            if (cardInfo.field_end_time == 0 && optJSONObject2 != null) {
                cardInfo.field_end_time = optJSONObject2.optLong("end_time");
            }
            r45.eg0 eg0Var = cardInfo.f94675p1.f388556p0;
            if (eg0Var != null) {
                cardInfo.field_is_dynamic = eg0Var.f373426d;
            }
        }
        r45.rt rtVar = cardInfo.f94676x1;
        if (rtVar != null) {
            cardInfo.G(rtVar);
            cardInfo.field_status = cardInfo.f94676x1.f385181d;
        }
        r45.j46 j46Var3 = cardInfo.f94677y1;
        if (j46Var3 != null) {
            cardInfo.f94677y1 = j46Var3;
            try {
                cardInfo.field_shareInfoData = j46Var3.toByteArray();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", e18.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e18, "", new java.lang.Object[0]);
            }
        }
        cardInfo.field_local_updateTime = (int) (java.lang.System.currentTimeMillis() / 1000);
    }

    public static r45.vu k(org.json.JSONObject jSONObject) {
        r45.s1 s1Var = null;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
            return null;
        }
        r45.vu vuVar = new r45.vu();
        try {
            vuVar.f388545d = jSONObject.optString("card_tp_id");
            vuVar.f388546e = jSONObject.optString("logo_url");
            vuVar.f388547f = jSONObject.optString("appid");
            vuVar.f388548g = jSONObject.optString("app_username");
            vuVar.f388549h = jSONObject.optInt("card_category");
            vuVar.f388550i = jSONObject.optInt("card_type");
            vuVar.f388552m = jSONObject.optString("brand_name");
            vuVar.f388553n = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            vuVar.f388554o = jSONObject.optString("sub_title");
            vuVar.f388555p = jSONObject.optString("color");
            vuVar.f388558q = jSONObject.optString("notice");
            vuVar.f388559r = jSONObject.optString("service_phone");
            vuVar.f388562u = jSONObject.optString("image_text_url");
            vuVar.f388563v = jSONObject.optString("source_icon");
            vuVar.f388564w = jSONObject.optString(ya.b.SOURCE);
            vuVar.A1 = jSONObject.optString("brand_icon_url");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("primary_fields");
            if (optJSONArray != null) {
                vuVar.f388560s = e(optJSONArray);
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("introduce_fields");
            if (optJSONArray2 != null) {
                vuVar.f388561t = e(optJSONArray2);
            }
            vuVar.f388565x = jSONObject.optInt("shop_count");
            vuVar.f388571z = jSONObject.optString("limit_wording");
            vuVar.f388568y = jSONObject.optString("card_type_name");
            vuVar.A = jSONObject.optString("h5_show_url");
            vuVar.B = jSONObject.optInt("block_mask");
            vuVar.C = jSONObject.optString("middle_icon");
            vuVar.D = jSONObject.optString("accept_wording");
            vuVar.E = jSONObject.optLong("control_flag");
            vuVar.F = jSONObject.optString("advertise_wording");
            vuVar.G = jSONObject.optString("advertise_url");
            vuVar.H = jSONObject.optString("public_service_name");
            vuVar.I = g(jSONObject.optJSONObject("announcement"));
            vuVar.f388544J = jSONObject.optString("public_service_tip");
            vuVar.K = jSONObject.optString("primary_sub_title");
            vuVar.L = jSONObject.optInt("gen_type");
            vuVar.M = m(jSONObject.optJSONObject("detail_struct"));
            vuVar.N = s(jSONObject.optJSONObject("use_condition"));
            vuVar.P = p(jSONObject.optJSONObject("follow_box"));
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("guidance");
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
            } else {
                s1Var = new r45.s1();
                s1Var.f385374d = optJSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                s1Var.f385375e = optJSONObject.optString("url");
            }
            vuVar.Q = s1Var;
            vuVar.R = jSONObject.optInt("need_direct_jump", 0);
            vuVar.S = jSONObject.optInt("is_acceptable", 0);
            vuVar.T = jSONObject.optString("unacceptable_wording");
            vuVar.U = jSONObject.optInt("has_hongbao", 0);
            vuVar.V = jSONObject.optString("accept_ui_title");
            vuVar.W = jSONObject.optInt("show_accept_view", 0);
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("brand_field");
            if (optJSONObject2 != null) {
                vuVar.X = l(optJSONObject2);
            }
            vuVar.Y = jSONObject.optString("shop_name");
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("pay_and_qrcode_field");
            if (optJSONObject3 != null) {
                vuVar.Z = l(optJSONObject3);
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("dynamic_qr_code_info");
            if (optJSONObject4 != null) {
                vuVar.f388556p0 = o(optJSONObject4);
            }
            vuVar.f388566x0 = jSONObject.optBoolean("is_card_code_exposed");
            vuVar.f388569y0 = jSONObject.optInt("qrcode_correct_level");
            vuVar.f388551l1 = jSONObject.optBoolean("dismiss_qrcode_icon_on_card");
            vuVar.f388557p1 = jSONObject.optBoolean("need_location");
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("bluetooth_info");
            if (optJSONObject5 != null) {
                vuVar.f388567x1 = b(optJSONObject5);
            }
            vuVar.f388570y1 = jSONObject.optString("biz_nickname");
            vuVar.f388572z1 = jSONObject.optString("gift_title");
            vuVar.A1 = jSONObject.optString("brand_icon_url");
            vuVar.C1 = jSONObject.optString("advertise_tinyapp_path");
            vuVar.B1 = jSONObject.optString("advertise_tinyapp_username");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
        }
        return vuVar;
    }

    public static r45.w50 l(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
            return null;
        }
        r45.w50 w50Var = new r45.w50();
        w50Var.f388878d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        w50Var.f388880f = jSONObject.optString("aux_title");
        w50Var.f388879e = jSONObject.optString("sub_title");
        w50Var.f388881g = jSONObject.optString("url");
        w50Var.f388882h = jSONObject.optLong("show_flag");
        w50Var.f388883i = jSONObject.optString("primary_color");
        w50Var.f388884m = jSONObject.optString("secondary_color");
        w50Var.f388885n = jSONObject.optString("icon_url");
        w50Var.f388889r = jSONObject.optString("cell_icon_url");
        w50Var.f388890s = jSONObject.optString("cell_link_icon_url");
        w50Var.f388891t = jSONObject.optString("finder_username");
        w50Var.f388892u = jSONObject.optString("cell_cover_url");
        w50Var.f388893v = jSONObject.optString("cell_center_icon_url");
        w50Var.f388894w = jSONObject.optString("feed_id");
        w50Var.f388895x = jSONObject.optString("nonce_id");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("gifting_info");
        if (optJSONObject != null) {
            r45.qt3 qt3Var = new r45.qt3();
            qt3Var.f384254d = kk.v.b(optJSONObject.optString("biz_uin"));
            qt3Var.f384255e = optJSONObject.optString("order_id");
            w50Var.f388886o = qt3Var;
        }
        w50Var.f388887p = jSONObject.optString("app_brand_user_name");
        w50Var.f388888q = jSONObject.optString("app_brand_pass");
        return w50Var;
    }

    public static r45.de0 m(org.json.JSONObject jSONObject) {
        java.lang.String str;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
            return null;
        }
        r45.de0 de0Var = new r45.de0();
        de0Var.f372340d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        de0Var.f372341e = jSONObject.optString("url");
        de0Var.f372342f = jSONObject.optString("abstract");
        de0Var.f372344h = jSONObject.optString("detail");
        de0Var.f372345i = jSONObject.optString("ad_title");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("icon_url_list");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    str = optJSONArray.getString(i17);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "getMessage:" + e17.getMessage());
                    str = "";
                }
                linkedList.add(str);
            }
            de0Var.f372343g = linkedList;
        }
        return de0Var;
    }

    public static r45.ee0 n(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
            return null;
        }
        r45.ee0 ee0Var = new r45.ee0();
        ee0Var.f373353d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        ee0Var.f373354e = jSONObject.optString("sub_title");
        ee0Var.f373355f = jSONObject.optInt("show_num", 0);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("rows");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
        } else {
            try {
                ee0Var.f373356g = e(optJSONArray);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", e17.getMessage());
            }
        }
        return ee0Var;
    }

    public static r45.eg0 o(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
            return null;
        }
        r45.eg0 eg0Var = new r45.eg0();
        eg0Var.f373426d = jSONObject.optBoolean("is_dynamic");
        eg0Var.f373427e = jSONObject.optBoolean("can_refresh");
        eg0Var.f373428f = jSONObject.optString("refresh_wording");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInfoParser", "is_dynamic:" + eg0Var.f373426d + "\u3000can_refresh:" + eg0Var.f373427e + "\u3000refresh_wording:" + eg0Var.f373428f);
        return eg0Var;
    }

    public static r45.g43 p(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
            return null;
        }
        r45.g43 g43Var = new r45.g43();
        g43Var.f374867d = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        g43Var.f374868e = jSONObject.optInt("follow");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInfoParser", "follow:" + g43Var.f374868e + "\u3000text:" + g43Var.f374867d);
        return g43Var;
    }

    public static void q(com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo, java.lang.String str) {
        r45.j46 j46Var;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
            return;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("share_card");
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
                return;
            }
            shareCardInfo.field_card_id = a(optJSONObject.optString("card_id"));
            shareCardInfo.field_card_tp_id = a(optJSONObject.optString("card_tp_id"));
            shareCardInfo.field_app_id = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            shareCardInfo.field_consumer = optJSONObject.optString("consumer");
            shareCardInfo.field_share_time = optJSONObject.optInt("share_time");
            shareCardInfo.field_updateTime = optJSONObject.optInt("update_time");
            shareCardInfo.field_status = optJSONObject.optInt("state_flag");
            shareCardInfo.field_updateSeq = optJSONObject.optLong("sequence");
            shareCardInfo.field_from_username = optJSONObject.optString("from_user_name");
            shareCardInfo.field_begin_time = optJSONObject.optLong("begin_time");
            shareCardInfo.field_end_time = optJSONObject.optInt("end_time");
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("card_data_info");
            org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("card_tp_info");
            org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("share_info");
            shareCardInfo.Z = h(optJSONObject2);
            shareCardInfo.Y = k(optJSONObject3);
            if (optJSONObject4 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
                j46Var = null;
            } else {
                r45.j46 j46Var2 = new r45.j46();
                j46Var2.f377580d = optJSONObject4.optString("gift_msg_title");
                j46Var = j46Var2;
            }
            shareCardInfo.f94680p0 = j46Var;
            r45.rt rtVar = shareCardInfo.Z;
            if (rtVar != null) {
                shareCardInfo.G(rtVar);
            }
            r45.vu vuVar = shareCardInfo.Y;
            if (vuVar != null) {
                shareCardInfo.Y = vuVar;
                try {
                    shareCardInfo.field_cardTpInfoData = vuVar.toByteArray();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", e17.getMessage());
                }
                shareCardInfo.field_end_time = optJSONObject3.optInt("end_time");
                shareCardInfo.field_begin_time = optJSONObject3.optInt("begin_time");
            }
            r45.j46 j46Var3 = shareCardInfo.f94680p0;
            if (j46Var3 != null) {
                shareCardInfo.f94680p0 = j46Var3;
                try {
                    shareCardInfo.field_shareInfoData = j46Var3.toByteArray();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", e18.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareCardInfo", e18, "", new java.lang.Object[0]);
                }
            }
            shareCardInfo.field_local_updateTime = (int) (java.lang.System.currentTimeMillis() / 1000);
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfoParser", e19, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", e19.getMessage());
        }
    }

    public static r45.bk6 r(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
            return null;
        }
        r45.bk6 bk6Var = new r45.bk6();
        bk6Var.f370827d = jSONObject.optString("tag");
        bk6Var.f370828e = jSONObject.optString("color");
        return bk6Var;
    }

    public static r45.jv6 s(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
            return null;
        }
        r45.jv6 jv6Var = new r45.jv6();
        jv6Var.f378138d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("outer_tag_list");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
        } else {
            jv6Var.f378139e = new java.util.LinkedList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                r45.bk6 r17 = r(optJSONArray.optJSONObject(i17));
                if (r17 != null) {
                    jv6Var.f378139e.add(r17);
                }
            }
        }
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("inner_tag_list");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
        } else {
            jv6Var.f378140f = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                r45.bk6 r18 = r(optJSONArray2.optJSONObject(i18));
                if (r18 != null) {
                    jv6Var.f378140f.add(r18);
                }
            }
        }
        org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("detail_field");
        if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
        } else {
            jv6Var.f378141g = e(optJSONArray3);
        }
        return jv6Var;
    }
}
