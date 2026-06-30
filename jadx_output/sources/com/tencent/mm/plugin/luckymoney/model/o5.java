package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public abstract class o5 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f145513d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f145514e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.p0 f145515f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.n5 f145516g;

    public abstract java.lang.String H();

    public int I() {
        return -1;
    }

    public void J(int i17, org.json.JSONObject jSONObject) {
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f145513d = u0Var;
        com.tencent.mm.plugin.luckymoney.model.n5 n5Var = this.f145516g;
        if (n5Var == null || !n5Var.a()) {
            return dispatch(sVar, this.f145514e, this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "do fack response: %s", H());
        return this.f145516g.b(this.f145514e, this);
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public int getCgicmdForKV() {
        return I();
    }

    public boolean isJumpRemind() {
        return this.f145515f != null;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String string;
        int i27;
        int i28;
        org.json.JSONObject jSONObject;
        int i29;
        int i37;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        r45.ex3 ex3Var = (r45.ex3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            int i38 = ex3Var.f373782e;
            java.lang.String f17 = x51.j1.f(ex3Var.f373781d);
            int i39 = 1000;
            if (i38 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                int i47 = ex3Var.f373785h;
                try {
                    jSONObject = new org.json.JSONObject(f17);
                    if (!jSONObject.has("retcode") || !jSONObject.has("retmsg")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", v0Var.getUri() + " no retcode,retmsg");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1698, 11);
                    }
                    i29 = jSONObject.getInt("retcode");
                    string = ex3Var.f373786i;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        string = jSONObject.optString("retmsg");
                    }
                    this.f145515f = com.tencent.mm.wallet_core.model.p0.c(jSONObject);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyBase", e17, "", new java.lang.Object[0]);
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
                    i28 = 2;
                }
                if (jSONObject.has("showmess") && i29 != 268502454) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "has alert item");
                    at4.a L = com.tencent.mm.plugin.luckymoney.model.h6.L(null, jSONObject);
                    com.tencent.mm.autogen.events.Show261AlertEvent show261AlertEvent = new com.tencent.mm.autogen.events.Show261AlertEvent();
                    show261AlertEvent.f54781g.f7660a = L;
                    show261AlertEvent.e();
                } else if (i29 == 0 && i47 == 0) {
                    onGYNetEnd(i29, string, jSONObject);
                } else {
                    J(i29, jSONObject);
                    i37 = i47 == 0 ? -1000 : i47;
                    i28 = i37;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", tenpayErrType : " + i47 + ", resp = " + f17);
                }
                i39 = i18;
                i37 = i19;
                string = str;
                i28 = i37;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", tenpayErrType : " + i47 + ", resp = " + f17);
            } else {
                string = ex3Var.f373783f;
                i28 = 2;
            }
            i27 = i39;
        } else {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null);
            if (d17 != null) {
                string = (java.lang.String) d17.get(".e.Content");
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
            }
            i27 = i18;
            i28 = i19;
        }
        if (i27 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", errType = " + i27 + ", errCode = " + i28 + ", errMsg = " + string);
        }
        this.f145513d.onSceneEnd(i27, i28, string, this);
    }

    public abstract void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    public void setRequestData(java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        java.lang.String r17 = c01.z1.r();
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r17, true);
        if (n17 != null) {
            map.put("province", n17.x3());
            map.put("city", n17.v3());
        }
        if (this.f145514e == null) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.dx3();
            lVar.f70665b = new r45.ex3();
            lVar.f70666c = H();
            lVar.f70667d = getType();
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            this.f145514e = a17;
            a17.setIsUserCmd(true);
        }
        r45.dx3 dx3Var = (r45.dx3) this.f145514e.f70710a.f70684a;
        dx3Var.f372823d = I();
        dx3Var.f372824e = 1;
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        for (java.lang.Object obj : array) {
            java.lang.String str = (java.lang.String) map.get(obj);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (z17) {
                    sb6.append("&");
                }
                sb6.append(obj);
                sb6.append("=");
                sb6.append(str);
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + dx3Var.f372823d + ", req = " + sb6.toString());
        byte[] bytes = sb6.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        dx3Var.f372825f = cu5Var;
    }
}
