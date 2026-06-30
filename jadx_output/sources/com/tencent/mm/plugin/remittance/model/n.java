package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156901d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yo f156902e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156903f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.e f156904g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.remittance.model.f f156905h;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f156907m;

    /* renamed from: o, reason: collision with root package name */
    public final int f156909o;

    /* renamed from: i, reason: collision with root package name */
    public boolean f156906i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f156908n = false;

    public n(com.tencent.mm.plugin.remittance.model.m mVar, com.tencent.mm.plugin.remittance.model.e eVar, com.tencent.mm.plugin.remittance.model.f fVar) {
        this.f156907m = "";
        this.f156909o = 0;
        this.f156907m = java.lang.System.currentTimeMillis() + "" + mVar.f156883b;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        this.f156909o = mVar.f156883b;
        lVar.f70664a = new r45.xo();
        lVar.f70665b = new r45.yo();
        lVar.f70667d = 2677;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fgetfavor";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156901d = a17;
        r45.xo xoVar = (r45.xo) a17.f70710a.f70684a;
        xoVar.f390276d = mVar.f156883b;
        xoVar.f390277e = mVar.f156884c;
        xoVar.f390278f = mVar.f156885d;
        xoVar.f390279g = mVar.f156886e;
        xoVar.f390280h = mVar.f156887f;
        xoVar.f390281i = mVar.f156888g;
        xoVar.f390282m = mVar.f156889h;
        xoVar.f390283n = mVar.f156890i;
        xoVar.f390284o = mVar.f156891j;
        xoVar.f390285p = mVar.f156892k;
        xoVar.f390286q = mVar.f156882a;
        xoVar.f390287r = mVar.f156893l;
        this.f156904g = eVar;
        this.f156905h = fVar;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(java.lang.String.format("request.amount %s", java.lang.Integer.valueOf(xoVar.f390276d)));
        stringBuffer.append(java.lang.String.format("request.channel %s", java.lang.Integer.valueOf(xoVar.f390277e)));
        stringBuffer.append(java.lang.String.format("request.scan_scene %s", java.lang.Integer.valueOf(xoVar.f390278f)));
        stringBuffer.append(java.lang.String.format("request.receiver_desc %s", xoVar.f390279g));
        stringBuffer.append(java.lang.String.format("request.mch_name %s", xoVar.f390280h));
        stringBuffer.append(java.lang.String.format("request.favor_req_sign %s", xoVar.f390281i));
        stringBuffer.append(java.lang.String.format("request.receiver_openid %s", xoVar.f390282m));
        stringBuffer.append(java.lang.String.format("request.receiver_username %s", xoVar.f390283n));
        stringBuffer.append(java.lang.String.format("request.favor_req_extend %s", xoVar.f390284o));
        stringBuffer.append(java.lang.String.format("request.fail_click_cell %s", java.lang.Integer.valueOf(xoVar.f390285p)));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fGetFavor", "NetSceneBusiF2fGetFavor req %s", stringBuffer.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156903f = u0Var;
        return dispatch(sVar, this.f156901d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2677;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fGetFavor", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.yo yoVar = (r45.yo) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156902e = yoVar;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(yoVar.f391247d);
        r45.yo yoVar2 = this.f156902e;
        objArr[1] = yoVar2.f391248e;
        r45.wo woVar = yoVar2.f391249f;
        if (woVar == null) {
            jSONObject = new org.json.JSONObject();
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("favor_info_list", com.tencent.mm.plugin.remittance.model.a.a(woVar.f389326d, new r45.vq0()));
                java.util.LinkedList linkedList = woVar.f389327e;
                new r45.uq0();
                if (linkedList == null) {
                    jSONArray = new org.json.JSONArray();
                } else {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    try {
                        java.util.Iterator it = linkedList.iterator();
                        int i27 = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(i27, com.tencent.mm.plugin.remittance.model.a.c((r45.uq0) it.next()));
                            i27++;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
                    }
                    jSONArray = jSONArray2;
                }
                jSONObject2.put("favor_compose_result_list", jSONArray);
                jSONObject2.put("default_fav_compose_id", woVar.f389328f);
                jSONObject2.put("favor_resp_sign", woVar.f389329g);
                jSONObject2.put("no_compose_wording", woVar.f389330h);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e18, "", new java.lang.Object[0]);
            }
            jSONObject = jSONObject2;
        }
        objArr[2] = jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fGetFavor", "ret_code: %s, ret_msg: %s favor_comm_resp : %s", objArr);
        com.tencent.mm.modelbase.u0 u0Var = this.f156903f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
