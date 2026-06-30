package wq3;

/* loaded from: classes4.dex */
public class p extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448581d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448582e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f448583f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f448584g;

    public p(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pl3();
        lVar.f70665b = new r45.ql3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getproductdiscount";
        lVar.f70667d = nd1.j2.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448582e = a17;
        r45.pl3 pl3Var = (r45.pl3) a17.f70710a.f70684a;
        pl3Var.f383154d = str;
        this.f448584g = str2;
        pl3Var.f383155e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448581d = u0Var;
        return dispatch(sVar, this.f448582e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return nd1.j2.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        r45.ql3 ql3Var = (r45.ql3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0 && ql3Var.f384085e == 0) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(ql3Var.f384084d).optJSONArray("discount_list");
                if (optJSONArray != null) {
                    this.f448583f = new java.util.LinkedList();
                    int length = optJSONArray.length();
                    for (int i28 = 0; i28 < length; i28++) {
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i28);
                        r45.we0 we0Var = new r45.we0();
                        we0Var.f389082d = jSONObject.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        we0Var.f389083e = jSONObject.getInt("fee");
                        this.f448583f.add(we0Var);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (i19 == 0 && (i27 = ql3Var.f384085e) != 0) {
            str = ql3Var.f384086f;
            i19 = i27;
        }
        this.f448581d.onSceneEnd(i18, i19, str, this);
    }
}
