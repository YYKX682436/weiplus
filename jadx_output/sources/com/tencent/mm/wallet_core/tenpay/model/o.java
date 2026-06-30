package com.tencent.mm.wallet_core.tenpay.model;

/* loaded from: classes9.dex */
public abstract class o extends com.tencent.mm.wallet_core.model.z0 {
    public static final boolean IS_SPLIT_CGI = true;
    public static final java.lang.String TAG = "MicroMsg.NetSenceTenPayBase";
    public static java.util.Vector<java.lang.String> cgiFunNameVector = new java.util.Vector<>();
    protected boolean isFake = false;

    static {
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = h45.w.f278967b;
            if (i17 >= strArr.length) {
                return;
            }
            cgiFunNameVector.add(strArr[i17]);
            i17++;
        }
    }

    public boolean canRetry() {
        return true;
    }

    public void certSignConfig() {
        if (cgiFunNameVector.contains(this.f214040rr.f70712c)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "cert try get errormsg %s", java.lang.Integer.valueOf(com.tencent.mm.wallet_core.model.j.b().c()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.wallet_core.model.j.b().e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        r45.fl6 fl6Var = (r45.fl6) this.f214040rr.f70710a.f70684a;
        r45.cu5 cu5Var = fl6Var.f374429f;
        java.lang.String str = cu5Var != null ? new java.lang.String(cu5Var.f371841f.f192156a) : "";
        r45.cu5 cu5Var2 = fl6Var.f374430g;
        java.lang.String str2 = new java.lang.String((str + "&&" + (cu5Var2 != null ? new java.lang.String(cu5Var2.f371841f.f192156a) : "")).getBytes());
        com.tencent.mm.wallet_core.model.p1.c().getClass();
        java.lang.String b17 = com.tencent.mm.wallet_core.model.p1.b();
        if (com.tencent.mm.wallet_core.model.j.b().f(b17)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(414L, 20L, 1L, true);
            com.tencent.mm.wallet_core.model.j b18 = com.tencent.mm.wallet_core.model.j.b();
            b18.getClass();
            java.lang.String a17 = b18.a(b17, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                g0Var.d(20743, "user_identification", "pay_cert_sign", "", "", "", "", java.lang.Integer.valueOf(com.tencent.mm.wallet_core.model.j.b().c()));
            }
            g0Var.idkeyStat(414L, 21L, java.lang.System.currentTimeMillis() - currentTimeMillis, true);
            fl6Var.f374431h = a17;
            fl6Var.f374432i = b17;
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "cert not exist cn %s %s", b17, java.lang.Integer.valueOf(com.tencent.mm.wallet_core.model.j.b().c()));
        }
        com.tencent.mars.xlog.Log.i(TAG, "sign cost time %s cn %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), b17);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void configRequest(boolean z17, boolean z18) {
        com.tencent.mm.modelbase.o commReqResp = getCommReqResp();
        if (commReqResp == null) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.fl6();
            lVar.f70665b = new r45.gl6();
            java.lang.String uri = getUri();
            int funcId = getFuncId();
            lVar.f70666c = uri;
            lVar.f70667d = funcId;
            lVar.f70668e = 185;
            lVar.f70669f = 1000000185;
            commReqResp = lVar.a();
            commReqResp.setIsUserCmd(!canRetry());
        }
        r45.fl6 fl6Var = (r45.fl6) commReqResp.f70710a.f70684a;
        if (z17) {
            fl6Var.f374427d = getTenpayCgicmd();
        }
        if (z18) {
            fl6Var.f374428e = 1;
        }
        setCommReqResp(commReqResp);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int doSceneSimulately;
        this.callback = u0Var;
        certSignConfig();
        if (this.isFake && (doSceneSimulately = doSceneSimulately(this.f214040rr, sVar, u0Var)) != -1) {
            return doSceneSimulately;
        }
        if (!c01.z1.I()) {
            return dispatch(sVar, this.f214040rr, this);
        }
        com.tencent.mars.xlog.Log.e(TAG, "hy: serious error: is payupay");
        u0Var.onSceneEnd(1000, -100868, "Pay Method Err", this);
        return 1;
    }

    public int doSceneSimulately(com.tencent.mm.modelbase.o oVar, com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        r45.fl6 fl6Var = (r45.fl6) oVar.f70710a.f70684a;
        r45.cu5 cu5Var = fl6Var.f374429f;
        if (cu5Var != null) {
            new java.lang.String(cu5Var.f371841f.f192156a);
        }
        r45.cu5 cu5Var2 = fl6Var.f374430g;
        if (cu5Var2 != null) {
            new java.lang.String(cu5Var2.f371841f.f192156a);
        }
        getPayCgicmd();
        if (!this.isFake) {
            return -1;
        }
        r45.gl6 gl6Var = (r45.gl6) oVar.f70711b.f70700a;
        if (gl6Var == null) {
            gl6Var = new r45.gl6();
        }
        byte[] bytes = "".getBytes();
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(bytes);
        gl6Var.f375342d = cu5Var3;
        gl6Var.f375345g = getPayCgicmd();
        gl6Var.f375343e = 0;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) null);
            gl6Var.f375346h = jSONObject.optInt("TenpayErrType");
            gl6Var.f375347i = jSONObject.optString("TenpayErrMsg");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        onGYNetEnd(1, 0, 0, "", oVar, null);
        return 1;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String getEncryptUrl(java.lang.String str) {
        return com.tenpay.android.wechat.TenpayUtil.signWith3Des(str);
    }

    public int getFuncId() {
        return 385;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public int getPayCgicmd() {
        return getTenpayCgicmd();
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public com.tencent.mm.wallet_core.model.e1 getRetModel(com.tencent.mm.modelbase.o oVar) {
        r45.gl6 gl6Var = (r45.gl6) oVar.f70711b.f70700a;
        com.tencent.mm.wallet_core.model.e1 e1Var = new com.tencent.mm.wallet_core.model.e1();
        int i17 = gl6Var.f375345g;
        e1Var.f213890c = gl6Var.f375344f;
        e1Var.f213889b = gl6Var.f375343e;
        e1Var.f213888a = gl6Var.f375342d;
        e1Var.f213892e = gl6Var.f375347i;
        e1Var.f213891d = gl6Var.f375346h;
        return e1Var;
    }

    public abstract int getTenpayCgicmd();

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 385;
    }

    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/tenpay";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f70710a.f70684a).f374429f = cu5Var;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToWXReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f70710a.f70684a).f374430g = cu5Var;
    }

    public void setFake() {
        this.isFake = true;
    }
}
