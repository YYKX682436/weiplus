package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class BusiRemittanceResp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.remittance.model.BusiRemittanceResp> CREATOR = new com.tencent.mm.plugin.remittance.model.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f156755d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156756e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156757f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156758g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f156759h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f156760i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f156761m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.wo f156762n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.e77 f156763o;

    /* renamed from: p, reason: collision with root package name */
    public final int f156764p;

    /* renamed from: q, reason: collision with root package name */
    public final int f156765q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f156766r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f156767s;

    /* renamed from: t, reason: collision with root package name */
    public final int f156768t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.mn0 f156769u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f156770v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f156771w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Boolean f156772x;

    public BusiRemittanceResp(org.json.JSONObject jSONObject) {
        this.f156755d = 0;
        this.f156756e = "";
        this.f156757f = "";
        this.f156761m = new java.util.LinkedList();
        this.f156764p = 0;
        this.f156765q = 0;
        this.f156768t = 400;
        this.f156755d = jSONObject.optInt("show_photo", 0);
        this.f156756e = jSONObject.optString("photo_url", "");
        this.f156757f = jSONObject.optString("favor_desc", "");
        this.f156758g = jSONObject.optInt("scan_scene", 0);
        this.f156759h = jSONObject.optString("favor_req_sign", "");
        this.f156760i = jSONObject.optString("favor_req_extend", "");
        this.f156766r = jSONObject.optString("paying_rcvr_info", "");
        this.f156767s = jSONObject.optString("succpage_rcvr_info", "");
        this.f156764p = jSONObject.optInt("get_favor_flag", 0);
        this.f156765q = jSONObject.optInt("photo_style", 0);
        this.f156768t = jSONObject.optInt("get_favor_interval", 400);
        this.f156761m = com.tencent.mm.plugin.remittance.model.b.b(jSONObject.optJSONArray("favor_list"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("favor_comm_resp");
        if (optJSONObject != null) {
            r45.wo woVar = new r45.wo();
            this.f156762n = woVar;
            woVar.f389328f = optJSONObject.optString("default_fav_compose_id");
            woVar.f389326d = com.tencent.mm.plugin.remittance.model.b.b(optJSONObject.optJSONArray("favor_info_list"));
            woVar.f389329g = optJSONObject.optString("favor_resp_sign");
            woVar.f389330h = optJSONObject.optString("no_compose_wording");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("favor_compose_result_list");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    try {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                        r45.uq0 uq0Var = new r45.uq0();
                        uq0Var.f387564d = jSONObject2.optString("favor_compose_id");
                        uq0Var.f387566f = jSONObject2.optLong("show_favor_amount");
                        uq0Var.f387567g = jSONObject2.optLong("show_pay_amount");
                        uq0Var.f387568h = jSONObject2.optString("total_favor_amount");
                        uq0Var.f387569i = jSONObject2.optString("favor_desc");
                        uq0Var.f387570m = jSONObject2.optLong("compose_sort_flag");
                        uq0Var.f387571n = jSONObject2.optString("extend_str");
                        uq0Var.f387565e = com.tencent.mm.plugin.remittance.model.b.b(jSONObject2.optJSONArray("favor_info_list"));
                        linkedList.add(uq0Var);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiFavorInfoParser", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            woVar.f389327e = linkedList;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("notice");
        if (optJSONObject2 != null) {
            r45.e77 e77Var = new r45.e77();
            this.f156763o = e77Var;
            e77Var.f373084d = optJSONObject2.optInt("is_show_notice");
            org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("text_info");
            r45.f77 f77Var = new r45.f77();
            optJSONObject3 = optJSONObject3 == null ? new org.json.JSONObject() : optJSONObject3;
            f77Var.f374081d = optJSONObject3.optString("wording");
            org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("jump_info");
            r45.d77 d77Var = new r45.d77();
            optJSONObject4 = optJSONObject4 == null ? new org.json.JSONObject() : optJSONObject4;
            d77Var.f372209d = optJSONObject4.optInt("type");
            d77Var.f372210e = optJSONObject4.optString("url");
            d77Var.f372211f = optJSONObject4.optString(dm.i4.COL_USERNAME);
            d77Var.f372212g = optJSONObject4.optString("pagepath");
            f77Var.f374082e = d77Var;
            e77Var.f373085e = f77Var;
            e77Var.f373086f = optJSONObject2.optString("text_color");
            e77Var.f373087g = optJSONObject2.optString("text_dark_color");
            e77Var.f373088h = optJSONObject2.optString("lefticon");
            e77Var.f373089i = optJSONObject2.optString("lefticon_dark");
            e77Var.f373090m = optJSONObject2.optString("righticon");
            e77Var.f373091n = optJSONObject2.optString("righticon_dark");
        }
        org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("extra_buy");
        if (optJSONObject5 != null) {
            r45.mn0 mn0Var = new r45.mn0();
            this.f156769u = mn0Var;
            mn0Var.f380688d = optJSONObject5.optString("select_wording");
            mn0Var.f380689e = optJSONObject5.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            org.json.JSONArray optJSONArray2 = optJSONObject5.optJSONArray("extra_buy_detail_infos");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    try {
                        org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i18);
                        r45.ln0 ln0Var = new r45.ln0();
                        ln0Var.f379649d = jSONObject3.optLong("extra_buy_id");
                        ln0Var.f379650e = jSONObject3.optString("extra_buy_name");
                        ln0Var.f379651f = jSONObject3.optLong("good_original_price");
                        ln0Var.f379652g = jSONObject3.optLong("good_add_price");
                        ln0Var.f379653h = jSONObject3.optString("extra_buy_good_name");
                        ln0Var.f379654i = jSONObject3.optString("extra_buy_good_pic");
                        ln0Var.f379655m = jSONObject3.optInt("unavailable");
                        ln0Var.f379656n = jSONObject3.optString("unavailable_reason");
                        ln0Var.f379657o = jSONObject3.optBoolean("selected");
                        linkedList2.add(ln0Var);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiExtraBuyInfoParser", e18, "", new java.lang.Object[0]);
                    }
                }
            }
            mn0Var.f380690f = linkedList2;
        }
        this.f156770v = jSONObject.optString("favor_title");
        this.f156771w = jSONObject.optString("extra_buy_title");
        this.f156772x = java.lang.Boolean.valueOf(jSONObject.optBoolean("enable_union_pay"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f156755d);
        parcel.writeString(this.f156756e);
        parcel.writeString(this.f156757f);
        parcel.writeInt(this.f156758g);
        parcel.writeString(this.f156759h);
        parcel.writeString(this.f156760i);
        parcel.writeInt(this.f156764p);
        parcel.writeInt(this.f156765q);
        parcel.writeString(this.f156766r);
        parcel.writeString(this.f156767s);
        parcel.writeInt(this.f156768t);
        java.util.List list = this.f156761m;
        parcel.writeInt(((java.util.LinkedList) list).size());
        if (((java.util.LinkedList) list).size() > 0) {
            for (int i18 = 0; i18 < ((java.util.LinkedList) list).size(); i18++) {
                byte[] bArr = new byte[0];
                try {
                    bArr = ((r45.vq0) ((java.util.LinkedList) list).get(i18)).toByteArray();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e17, "", new java.lang.Object[0]);
                }
                parcel.writeInt(bArr.length);
                if (bArr.length > 0) {
                    parcel.writeByteArray(bArr);
                }
            }
        }
        byte[] bArr2 = new byte[0];
        r45.wo woVar = this.f156762n;
        if (woVar != null) {
            try {
                bArr2 = woVar.toByteArray();
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e18, "", new java.lang.Object[0]);
            }
        }
        parcel.writeInt(bArr2.length);
        if (bArr2.length > 0) {
            parcel.writeByteArray(bArr2);
        }
        byte[] bArr3 = new byte[0];
        r45.e77 e77Var = this.f156763o;
        if (e77Var != null) {
            try {
                bArr3 = e77Var.toByteArray();
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e19, "", new java.lang.Object[0]);
            }
        }
        parcel.writeInt(bArr3.length);
        if (bArr3.length > 0) {
            parcel.writeByteArray(bArr3);
        }
        byte[] bArr4 = new byte[0];
        r45.mn0 mn0Var = this.f156769u;
        if (mn0Var != null) {
            try {
                bArr4 = mn0Var.toByteArray();
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e27, "", new java.lang.Object[0]);
            }
        }
        parcel.writeInt(bArr4.length);
        if (bArr4.length > 0) {
            parcel.writeByteArray(bArr4);
        }
        parcel.writeString(this.f156770v);
        parcel.writeString(this.f156771w);
        parcel.writeInt(this.f156772x.booleanValue() ? 1 : 0);
    }

    public BusiRemittanceResp(android.os.Parcel parcel) {
        this.f156755d = 0;
        this.f156756e = "";
        this.f156757f = "";
        this.f156761m = new java.util.LinkedList();
        this.f156764p = 0;
        this.f156765q = 0;
        this.f156768t = 400;
        this.f156755d = parcel.readInt();
        this.f156756e = parcel.readString();
        this.f156757f = parcel.readString();
        this.f156758g = parcel.readInt();
        this.f156759h = parcel.readString();
        this.f156760i = parcel.readString();
        this.f156764p = parcel.readInt();
        this.f156765q = parcel.readInt();
        this.f156766r = parcel.readString();
        this.f156767s = parcel.readString();
        this.f156768t = parcel.readInt();
        this.f156761m = new java.util.LinkedList();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            int readInt2 = parcel.readInt();
            if (readInt2 > 0) {
                byte[] bArr = new byte[readInt2];
                parcel.readByteArray(bArr);
                try {
                    r45.vq0 vq0Var = new r45.vq0();
                    vq0Var.parseFrom(bArr);
                    this.f156761m.add(vq0Var);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e17, "", new java.lang.Object[0]);
                }
            }
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            byte[] bArr2 = new byte[readInt3];
            parcel.readByteArray(bArr2);
            r45.wo woVar = new r45.wo();
            this.f156762n = woVar;
            try {
                woVar.parseFrom(bArr2);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e18, "", new java.lang.Object[0]);
            }
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            byte[] bArr3 = new byte[readInt4];
            parcel.readByteArray(bArr3);
            r45.e77 e77Var = new r45.e77();
            this.f156763o = e77Var;
            try {
                e77Var.parseFrom(bArr3);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e19, "", new java.lang.Object[0]);
            }
        }
        int readInt5 = parcel.readInt();
        if (readInt5 > 0) {
            byte[] bArr4 = new byte[readInt5];
            parcel.readByteArray(bArr4);
            r45.mn0 mn0Var = new r45.mn0();
            this.f156769u = mn0Var;
            try {
                mn0Var.parseFrom(bArr4);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e27, "", new java.lang.Object[0]);
            }
        }
        this.f156770v = parcel.readString();
        this.f156771w = parcel.readString();
        this.f156772x = java.lang.Boolean.valueOf(parcel.readInt() == 1);
    }
}
