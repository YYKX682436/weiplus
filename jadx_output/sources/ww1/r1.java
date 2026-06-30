package ww1;

/* loaded from: classes15.dex */
public class r1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450274d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hw f450275e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450276f;

    public r1() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gw();
        lVar.f70665b = new r45.hw();
        lVar.f70667d = 5174;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fgetqrcodev2";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f450274d = a17;
    }

    public final org.json.JSONObject H(r45.uk4 uk4Var) {
        if (!((uk4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387432e)) ? false : true)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", uk4Var.f387431d);
            jSONObject.put("wording", uk4Var.f387432e);
            jSONObject.put("url", uk4Var.f387433f);
            jSONObject.put("waapp_username", uk4Var.f387434g);
            jSONObject.put("waapp_path", uk4Var.f387435h);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450276f = u0Var;
        return dispatch(sVar, this.f450274d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5174;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.wallet_core.model.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r3, int r4, int r5, java.lang.String r6, com.tencent.mm.network.v0 r7, byte[] r8, long r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ww1.r1.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[], long):void");
    }
}
