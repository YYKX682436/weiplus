package ss4;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.wallet_core.tenpay.model.o {
    public g() {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).hj().f243237d.A("WalletBulletin", "delete from WalletBulletin");
        setRequestData(new java.util.HashMap());
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1679;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1679;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getbannerinfo";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        r45.tw4 tw4Var;
        org.json.JSONArray jSONArray;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBannerInfo", "NetSceneGetBannerInfo errCode = " + i17 + " " + jSONObject);
        if (i17 == 0) {
            l75.e0 e0Var = at4.c1.D;
            dt4.e hj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).hj();
            if (jSONObject == null || hj6 == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("json==null?");
                sb6.append(jSONObject == null);
                sb6.append("  stg==null?");
                sb6.append(hj6 == null);
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletBulletin", sb6.toString());
            } else {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("banner_map");
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("banner_content_array");
                org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("notice_item_array");
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i19 = 0;
                    while (i19 < length) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                        if (optJSONObject != null) {
                            java.lang.String optString = optJSONObject.optString("banner_type");
                            java.lang.String optString2 = optJSONObject.optString("banner_template_id");
                            jSONArray = optJSONArray;
                            i18 = length;
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBulletin", "sceneid=" + optString + "; contentid=" + optString2);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                hashMap.put(optString, optString2);
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBulletin", "sceneid:" + optString + " map contentid:" + optString2);
                            }
                        } else {
                            jSONArray = optJSONArray;
                            i18 = length;
                        }
                        i19++;
                        optJSONArray = jSONArray;
                        length = i18;
                    }
                }
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i27 = 0; i27 < length2; i27++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i27);
                        if (optJSONObject2 != null) {
                            hashMap2.put(optJSONObject2.optString("banner_template_id"), java.lang.Integer.valueOf(i27));
                        }
                    }
                }
                if (optJSONArray3 != null) {
                    for (int i28 = 0; i28 < optJSONArray3.length(); i28++) {
                        r45.tw4 m07 = com.tencent.mm.wallet_core.ui.r1.m0(optJSONArray3.optJSONObject(i28));
                        if (m07 != null) {
                            hashMap3.put(m07.f386835h, m07);
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    for (java.lang.String str2 : hashMap.keySet()) {
                        java.lang.String str3 = (java.lang.String) hashMap.get(str2);
                        at4.c1 c1Var = new at4.c1();
                        c1Var.field_bulletin_scene = str2;
                        if (hashMap3.containsKey(str3) && (tw4Var = (r45.tw4) hashMap3.get(str3)) != null) {
                            c1Var.field_is_show_notice = tw4Var.f386831d;
                            c1Var.field_wording = tw4Var.f386832e;
                            c1Var.field_jump_url = tw4Var.f386834g;
                            c1Var.field_left_icon = tw4Var.f386833f;
                            c1Var.field_notice_id = tw4Var.f386835h;
                            c1Var.field_type = 2;
                        }
                        if (hashMap2.containsKey(str3)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBulletin", "find contentid:" + str3 + "in contentMap");
                            org.json.JSONObject optJSONObject3 = optJSONArray2.optJSONObject(((java.lang.Integer) hashMap2.get(str3)).intValue());
                            c1Var.field_bulletin_content = optJSONObject3.optString("content");
                            c1Var.field_bulletin_url = optJSONObject3.optString("url");
                            hj6.insert(c1Var);
                        }
                    }
                }
            }
            long optLong = jSONObject.optLong("banner_update_interval", 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBannerInfo", "update_interval=" + optLong);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BULLETIN_UPDATE_INTERVAL_LONG, java.lang.Long.valueOf(optLong));
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("lbs_info");
            if (optJSONObject4 != null) {
                org.json.JSONArray optJSONArray4 = optJSONObject4.optJSONArray("config_array");
                if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                    if (at4.g0.f13857a == null) {
                        at4.g0.f13857a = new at4.g0();
                    }
                    at4.g0.f13857a.getClass();
                    optJSONArray4.toString();
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LBS_REPORT_CONFIG_STRING_SYNC, optJSONArray4.toString());
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LBS_REPORT_DIALOG_TITLE_STRING_SYNC, optJSONObject4.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LBS_REPORT_DIALOG_CONTENT_STRING_SYNC, optJSONObject4.optString("content"));
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("realname_info");
            if (optJSONObject5 != null) {
                java.lang.String optString3 = optJSONObject5.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                java.lang.String optString4 = optJSONObject5.optString("balance_title");
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, optString3);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, optString4);
            }
        }
    }
}
