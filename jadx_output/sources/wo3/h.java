package wo3;

/* loaded from: classes9.dex */
public abstract class h extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448164d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f448165e;

    public void H(int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448164d = u0Var;
        return dispatch(sVar, this.f448165e, this);
    }

    public abstract int getFuncId();

    public abstract int getTenpayCgicmd();

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 385;
    }

    public abstract java.lang.String getUri();

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String str2;
        int i27;
        int i28;
        int i29 = i18;
        int i37 = i19;
        java.lang.String str3 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + getTenpayCgicmd() + ", errType = " + i29 + ", errCode = " + i37 + ", errMsg = " + str3);
        r45.gl6 gl6Var = (r45.gl6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i29 == 0 && i37 == 0) {
            if (gl6Var.f375343e == 0) {
                java.lang.String f17 = x51.j1.f(gl6Var.f375342d);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(f17);
                    int i38 = jSONObject.getInt("retcode");
                    java.lang.String str4 = gl6Var.f375347i;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        str4 = jSONObject.optString("retmsg");
                    }
                    int i39 = gl6Var.f375346h;
                    if (i38 == 0 && i39 == 0) {
                        onGYNetEnd(i38, str4, jSONObject);
                        i38 = i37;
                        str4 = str3;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : " + i39);
                        if (i39 != 0) {
                            i38 = i39;
                        }
                        if (i38 == 0) {
                            i38 = -1000;
                        }
                        i29 = 1000;
                    }
                    H(gl6Var.f375346h, gl6Var.f375347i, f17);
                    i28 = i29;
                    str2 = str4;
                    i27 = i38;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayOfflineBase", e17, "", new java.lang.Object[0]);
                    str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
                }
                str3 = str2;
                i37 = i27;
                i29 = i28;
            } else {
                str2 = gl6Var.f375344f;
            }
            i27 = 2;
            i28 = 1000;
            str3 = str2;
            i37 = i27;
            i29 = i28;
        } else {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str3, "e", null);
            if (d17 != null) {
                str3 = (java.lang.String) d17.get(".e.Content");
            }
        }
        if (i29 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + getTenpayCgicmd() + ", errType = " + i29 + ", errCode = " + i37 + ", errMsg = " + str3);
        }
        this.f448164d.onSceneEnd(i29, i37, str3, this);
        getTenpayCgicmd();
    }

    public abstract void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    public void setRequestData(java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        if (!h45.y.c()) {
            map.put("jsapi_reqkey", h45.y.f278968a);
        }
        if (this.f448165e == null) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.fl6();
            lVar.f70665b = new r45.gl6();
            java.lang.String uri = getUri();
            int funcId = getFuncId();
            lVar.f70666c = uri;
            lVar.f70667d = funcId;
            lVar.f70668e = 185;
            lVar.f70669f = 1000000185;
            this.f448165e = lVar.a();
        }
        r45.fl6 fl6Var = (r45.fl6) this.f448165e.f70710a.f70684a;
        fl6Var.f374427d = getTenpayCgicmd();
        fl6Var.f374428e = 1;
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        boolean z17 = false;
        while (true) {
            if (i17 >= array.length) {
                break;
            }
            java.lang.Object obj = array[i17];
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
            i17++;
        }
        java.lang.String signWith3Des = com.tenpay.android.wechat.TenpayUtil.signWith3Des(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        boolean z18 = false;
        for (java.lang.Object obj2 : array) {
            java.lang.String str2 = (java.lang.String) map.get(obj2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (z18) {
                    sb7.append("&");
                }
                sb7.append(obj2);
                sb7.append("=");
                sb7.append(fp.s0.a(str2));
                z18 = true;
            }
        }
        sb7.append(z18 ? "&" : "");
        sb7.append("WCPaySign=");
        sb7.append(signWith3Des);
        byte[] bytes = sb7.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        fl6Var.f374429f = cu5Var;
    }
}
