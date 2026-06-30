package xt1;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456456d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456457e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f456458f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f456459g;

    public d0(java.lang.String str, float f17, float f18, java.lang.String str2) {
        this.f456458f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ou();
        lVar.f70665b = new r45.pu();
        lVar.f70666c = "/cgi-bin/micromsg-bin/cardshoplbs";
        lVar.f70667d = 1058;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456456d = a17;
        r45.ou ouVar = (r45.ou) a17.f70710a.f70684a;
        ouVar.f382515d = str;
        ouVar.f382516e = f17;
        ouVar.f382517f = f18;
        ouVar.f382518g = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f456456d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.ou) oVar.f70710a.f70684a).f382515d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
            return -1;
        }
        this.f456457e = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1058;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = ((r45.pu) this.f456456d.f70711b.f70700a).f383405d;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
            }
            java.util.ArrayList arrayList = null;
            if (!android.text.TextUtils.isEmpty(str2)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(str2).getJSONArray("used_store_list");
                    if (jSONArray != null && jSONArray.length() != 0) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                            r45.nu a17 = lu1.j0.a(jSONArray.getJSONObject(i27));
                            if (a17 != null) {
                                arrayList2.add(a17);
                            }
                        }
                        arrayList = arrayList2;
                    }
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShopInfoItemParser", e17, "", new java.lang.Object[0]);
                }
            }
            this.f456459g = arrayList;
            if (arrayList != null) {
                arrayList.size();
            }
        }
        this.f456457e.onSceneEnd(i18, i19, str, this);
    }
}
