package q71;

/* loaded from: classes15.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360350d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360351e;

    public m() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fq3();
        lVar.f70665b = new r45.gq3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360351e = a17;
        r45.fq3 fq3Var = (r45.fq3) a17.f70710a.f70684a;
        fq3Var.f374548g = 2;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("invoice_info.title");
        linkedList.add("invoice_info.tax_number");
        linkedList.add("invoice_info.bank_number");
        linkedList.add("invoice_info.bank_name");
        linkedList.add("invoice_info.type");
        linkedList.add("invoice_info.email");
        linkedList.add("invoice_info.company_address");
        linkedList.add("invoice_info.company_address_detail");
        linkedList.add("invoice_info.company_address_postcode");
        linkedList.add("invoice_info.phone");
        fq3Var.f374547f = linkedList;
        fq3Var.f374546e = false;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360350d = u0Var;
        return dispatch(sVar, this.f360351e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        char c17;
        if (i18 == 0 && i19 == 0) {
            p71.a Ai = o71.l.Ai();
            Ai.getClass();
            Ai.f352473a = new i83.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we resetList and parse the json ..");
            r45.gq3 gq3Var = (r45.gq3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserAutoFillInfo", "resp json is.." + gq3Var.f375479d);
            if (gq3Var.f375479d != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(gq3Var.f375479d).getJSONArray("user_data_list").getJSONObject(0).getJSONArray("group_info_list");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                            try {
                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                                i83.b bVar = new i83.b();
                                bVar.f289634d = jSONObject.getInt(ya.b.GROUP_ID);
                                bVar.f289646s = jSONObject.getString("invoice_url");
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserAutoFillInfo", "get groupid:" + jSONObject.getInt(ya.b.GROUP_ID) + "get invoiceUrl:" + jSONObject.getString("invoice_url"));
                                org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("field_list");
                                if (jSONArray2 != null && jSONArray2.length() > 0) {
                                    for (int i28 = 0; i28 < jSONArray2.length(); i28++) {
                                        org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i28);
                                        java.lang.String string = jSONObject2.getString("key");
                                        switch (string.hashCode()) {
                                            case -1787383122:
                                                if (string.equals("bank_name")) {
                                                    c17 = 2;
                                                    break;
                                                }
                                                break;
                                            case -192204195:
                                                if (string.equals("tax_number")) {
                                                    c17 = 1;
                                                    break;
                                                }
                                                break;
                                            case 3575610:
                                                if (string.equals("type")) {
                                                    c17 = 4;
                                                    break;
                                                }
                                                break;
                                            case 96619420:
                                                if (string.equals(com.google.android.gms.common.Scopes.EMAIL)) {
                                                    c17 = 5;
                                                    break;
                                                }
                                                break;
                                            case 106642798:
                                                if (string.equals("phone")) {
                                                    c17 = 6;
                                                    break;
                                                }
                                                break;
                                            case 110371416:
                                                if (string.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                                    c17 = 0;
                                                    break;
                                                }
                                                break;
                                            case 330208940:
                                                if (string.equals("bank_number")) {
                                                    c17 = 3;
                                                    break;
                                                }
                                                break;
                                            case 944498430:
                                                if (string.equals("company_address_detail")) {
                                                    c17 = 7;
                                                    break;
                                                }
                                                break;
                                        }
                                        c17 = 65535;
                                        switch (c17) {
                                            case 0:
                                                bVar.f289636f = jSONObject2.getString("value");
                                                break;
                                            case 1:
                                                bVar.f289638h = jSONObject2.getString("value");
                                                break;
                                            case 2:
                                                bVar.f289640m = jSONObject2.getString("value");
                                                break;
                                            case 3:
                                                bVar.f289639i = jSONObject2.getString("value");
                                                break;
                                            case 4:
                                                bVar.f289635e = jSONObject2.getString("value");
                                                break;
                                            case 5:
                                                bVar.f289644q = jSONObject2.getString("value");
                                                break;
                                            case 6:
                                                bVar.f289642o = jSONObject2.getString("value");
                                                bVar.f289643p = jSONObject2.getString("value");
                                                break;
                                            case 7:
                                                bVar.f289645r = jSONObject2.getString("value");
                                                break;
                                        }
                                    }
                                }
                                o71.l.Ai().a(bVar);
                            } catch (org.json.JSONException unused) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUserAutoFillInfo", "parse error for no." + i27);
                            }
                        }
                    }
                } catch (org.json.JSONException unused2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
                }
            }
        }
        this.f360350d.onSceneEnd(i18, i19, str, this);
    }
}
