package wq3;

/* loaded from: classes15.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448576d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448577e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f448578f;

    /* renamed from: g, reason: collision with root package name */
    public wq3.t f448579g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f448580h;

    public o(wq3.t tVar, java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nl3();
        lVar.f70665b = new r45.ol3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getproductdetail";
        lVar.f70667d = 553;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448577e = a17;
        r45.nl3 nl3Var = (r45.nl3) a17.f70710a.f70684a;
        this.f448578f = str;
        nl3Var.f381482d = str;
        nl3Var.f381483e = i17;
        this.f448579g = tVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448576d = u0Var;
        return dispatch(sVar, this.f448577e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 553;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        r45.ol3 ol3Var = (r45.ol3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ol3Var.f382340d)) {
            this.f448579g = wq3.t.b(this.f448579g, ol3Var.f382340d);
        }
        if (i19 == 0 && (i27 = ol3Var.f382341e) != 0) {
            str = ol3Var.f382342f;
            i19 = i27;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ol3Var.f382343g)) {
            java.lang.String str2 = ol3Var.f382343g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject(str2).getJSONArray("group_list");
                int length = jSONArray.length();
                for (int i28 = 0; i28 < length; i28++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i28);
                    wq3.v vVar = new wq3.v();
                    vVar.f448611a = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    org.json.JSONArray jSONArray2 = jSONObject.getJSONArray(ya.b.ITEM_LIST);
                    int length2 = jSONArray2.length();
                    for (int i29 = 0; i29 < length2; i29++) {
                        org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i29);
                        wq3.u uVar = new wq3.u();
                        uVar.f448606a = jSONObject2.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        uVar.f448608c = jSONObject2.getInt("jump_type");
                        uVar.f448610e = jSONObject2.getString("native_url_args");
                        uVar.f448607b = jSONObject2.getString("icon_url");
                        uVar.f448609d = jSONObject2.getString("h5_url");
                        ((java.util.ArrayList) vVar.f448612b).add(uVar);
                    }
                    arrayList.add(vVar);
                }
            } catch (java.lang.Exception unused) {
                arrayList = null;
            }
            this.f448580h = arrayList;
        }
        this.f448576d.onSceneEnd(i18, i19, str, this);
    }
}
