package ss4;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412036d;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ECardInfo f412046q;

    /* renamed from: r, reason: collision with root package name */
    public final int f412047r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f412048s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f412049t;

    /* renamed from: u, reason: collision with root package name */
    public at4.s f412050u;

    /* renamed from: v, reason: collision with root package name */
    public at4.p0 f412051v;

    /* renamed from: w, reason: collision with root package name */
    public at4.r0 f412052w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f412053x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f412054y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f412055z;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412037e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f412038f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412039g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f412040h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f412041i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f412042m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f412043n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f412044o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f412045p = new java.util.LinkedList();
    public java.lang.String A = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public boolean D = false;

    public e0(java.lang.String str, int i17) {
        this.f412047r = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "NetSceneTenpayQueryBoundBankcard scene:%s", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f412048s = hashMap;
        this.f412047r = i17;
        hashMap.put("req_key", str);
        hashMap.put("bind_query_scene", "" + i17);
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null || !aVar.isRoot()) {
            hashMap.put("is_root", "0");
        } else {
            hashMap.put("is_root", "1");
        }
        if (aVar != null) {
            hashMap.put("is_device_open_touch", "1");
            java.util.Map C = aVar.C();
            if (C != null) {
                hashMap.putAll(C);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
        } else {
            hashMap.put("is_device_open_touch", "0");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
        }
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f412049t = hashMap2;
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(196612, null);
        gm0.j1.i();
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(196613, null);
        hashMap2.put("bind_serial", str2);
        hashMap2.put("last_bind_serial", str3);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return ss4.p0.f412124a.a(ss4.n0.f412110i, com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 72;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return ss4.p0.f412124a.b(ss4.n0.f412110i, "/cgi-bin/mmpay-bin/tenpay/bindquerynew");
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        org.json.JSONObject optJSONObject;
        if (i17 != 0) {
            return;
        }
        at4.p0 p0Var = null;
        at4.s sVar = null;
        if (jSONObject.has("real_name_info")) {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("real_name_info");
            com.tencent.mm.plugin.wallet_core.model.ECardInfo.b(optJSONObject2);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "get real_name_info %s", optJSONObject2.toString());
            this.f412036d = optJSONObject2.optString("guide_flag");
            optJSONObject2.optString("guide_wording");
            optJSONObject2.optString("left_button_wording");
            optJSONObject2.optString("right_button_wording");
            optJSONObject2.optString("upload_credit_url");
            this.f412037e = optJSONObject2.optString("done_button_wording");
            this.f412038f = optJSONObject2.optInt("is_show_protocol", 0);
            this.f412039g = optJSONObject2.optString("left_protocol_wording");
            this.f412040h = optJSONObject2.optString("new_upload_credit_url");
            this.f412041i = optJSONObject2.optString("protocol_url");
            this.f412042m = optJSONObject2.optString("right_protocol_wording");
            this.f412043n = optJSONObject2.optString("subtitle");
            this.f412044o = optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f412055z = optJSONObject2.optString("compliance_upload_image_half_page");
            org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray("upload_reasons");
            java.util.LinkedList linkedList = this.f412045p;
            linkedList.clear();
            if (optJSONArray3 != null) {
                for (int i18 = 0; i18 < optJSONArray3.length(); i18++) {
                    linkedList.add(optJSONArray3.optString(i18));
                }
            }
            if (optJSONObject2.has("ecard_info")) {
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("ecard_info");
                com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo = new com.tencent.mm.plugin.wallet_core.model.ECardInfo();
                this.f412046q = eCardInfo;
                eCardInfo.f179638p = this.f412044o;
                eCardInfo.f179639q = new java.util.ArrayList(linkedList);
                com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo2 = this.f412046q;
                eCardInfo2.f179641s = this.f412041i;
                eCardInfo2.f179642t = this.f412039g;
                eCardInfo2.f179643u = this.f412042m;
                eCardInfo2.f179640r = this.f412037e;
                eCardInfo2.f179629d = optJSONObject3.optInt("ecard_open_scene", 0);
                this.f412046q.f179630e = optJSONObject3.optString("ecard_type", "");
                this.f412046q.f179631f = optJSONObject3.optInt("show_check_box", 0);
                this.f412046q.f179632g = optJSONObject3.optInt("check_box_selected", 0);
                this.f412046q.f179633h = optJSONObject3.optString("check_box_left_wording", "");
                this.f412046q.f179634i = optJSONObject3.optString("check_box_right_wording", "");
                this.f412046q.f179635m = optJSONObject3.optString("check_box_url", "");
                this.f412046q.f179636n = optJSONObject3.optInt("is_upload_credid", 0);
                this.f412046q.f179637o = optJSONObject3.optString("upload_credit_url", "");
            }
        } else {
            com.tencent.mm.plugin.wallet_core.model.ECardInfo.b(null);
        }
        if (jSONObject.has("user_info") && (optJSONObject = jSONObject.optJSONObject("user_info")) != null) {
            this.C = optJSONObject.optString("true_name");
            this.A = optJSONObject.optString("cre_name");
            this.B = optJSONObject.optString("cre_type");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BINDQUERYNEW_TRUE_NAME_STRING, this.C);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BINDQUERYNEW_CRE_NAME_STRING, this.A);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BINDQUERYNEW_CRE_TYPE_STRING, this.B);
            }
        }
        boolean has = jSONObject.has("paymenu_array");
        int i19 = this.f412047r;
        if (has && i19 == 1 && (optJSONArray2 = jSONObject.optJSONArray("paymenu_array")) != null) {
            java.lang.String jSONArray = optJSONArray2.toString();
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_INDEX_MAIDAN_STRING_SYNC, jSONArray);
        }
        if (jSONObject.has("pay_manage_label") && (optJSONArray = jSONObject.optJSONArray("pay_manage_label")) != null) {
            this.f412053x = new java.util.ArrayList();
            for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                org.json.JSONObject optJSONObject4 = optJSONArray.optJSONObject(i27);
                if (optJSONObject4 != null) {
                    this.f412053x.add(at4.x0.a(optJSONObject4));
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_PAY_MANAGE_LABEL_LIST_STRING_SYNC, optJSONArray.toString());
        }
        if (jSONObject.has("home_half_page")) {
            this.f412054y = jSONObject.optString("home_half_page");
        }
        long optLong = jSONObject.optLong("time_stamp");
        if (optLong > 0) {
            com.tencent.mm.wallet_core.model.f1.b("" + optLong);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTenpayQueryBindBankcard", "no time_stamp in bindquerynew.");
        }
        at4.r1.k(jSONObject, i19, true, this.D);
        if (at4.r1.h(i19) || i19 == 1) {
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("bind_card_menu");
            if (optJSONObject5 != null) {
                optJSONObject5.toString();
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC, optJSONObject5.toString());
            } else {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC, "");
            }
        }
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is not null");
            aVar.af();
            int G = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G();
            if (G == 0) {
                if (aVar.Ic()) {
                    mz2.a aVar2 = (mz2.a) aVar;
                    aVar2.e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    aVar2.d(false);
                } else if (aVar.Rb()) {
                    mz2.a aVar3 = (mz2.a) aVar;
                    aVar3.d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    aVar3.e(false);
                }
            } else if (G == 1 && aVar.Ic()) {
                mz2.a aVar4 = (mz2.a) aVar;
                aVar4.e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                aVar4.d(false);
            } else if (G == 2 && aVar.Rb()) {
                mz2.a aVar5 = (mz2.a) aVar;
                aVar5.d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                aVar5.e(false);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is null");
        }
        if (i19 == 10) {
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("action_entry");
            if (optJSONObject6 != null) {
                sVar = new at4.s();
                optJSONObject6.optString(dm.i4.COL_ID);
                sVar.f13941a = optJSONObject6.optString("wording");
                optJSONObject6.optString("color");
                sVar.f13942b = optJSONObject6.optInt("type");
                sVar.f13943c = optJSONObject6.optString("native_url");
                sVar.f13944d = optJSONObject6.optString("web_url");
                sVar.f13945e = optJSONObject6.optString("tiny_app_username");
                sVar.f13946f = optJSONObject6.optString("tiny_app_path");
                optJSONObject6.optInt("entrance_type");
            }
            this.f412050u = sVar;
            return;
        }
        if (i19 == 8) {
            if (jSONObject.has("block_layer")) {
                org.json.JSONObject optJSONObject7 = jSONObject.optJSONObject("block_layer");
                if (optJSONObject7 != null) {
                    p0Var = new at4.p0();
                    p0Var.f13918a = optJSONObject7.optInt("view_id");
                    p0Var.f13919b = optJSONObject7.optInt("is_show_block_layer");
                    p0Var.f13920c = optJSONObject7.optInt("waiting_time");
                    p0Var.f13921d = optJSONObject7.optString("main_wording");
                    p0Var.f13922e = optJSONObject7.optString("reminder_content");
                    p0Var.f13924g = optJSONObject7.optString("repayment_tiny_app_path");
                    p0Var.f13923f = optJSONObject7.optString("repayment_tiny_app_username");
                }
                this.f412051v = p0Var;
            }
            org.json.JSONObject optJSONObject8 = jSONObject.optJSONObject("disable_block_layer");
            if (optJSONObject8 == null) {
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC, "");
            } else {
                this.f412052w = at4.r0.a(optJSONObject8);
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC, optJSONObject8.toString());
            }
        }
    }
}
