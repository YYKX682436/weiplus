package k64;

/* loaded from: classes4.dex */
public abstract class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f304581d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f304582e;

    public abstract void H(r45.mr5 mr5Var, java.lang.Object... objArr);

    public r45.js5 I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        com.tencent.mm.network.v0 reqResp = getReqResp();
        if (reqResp instanceof com.tencent.mm.modelbase.o) {
            try {
                r45.js5 js5Var = (r45.js5) ((com.tencent.mm.modelbase.o) reqResp).f70711b.f70700a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
                return js5Var;
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("SnsAd.AbsNetScene", "the response result is not the required!!!!");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return null;
    }

    public final com.tencent.mm.modelbase.m1 J(r45.mr5 mr5Var, r45.js5 js5Var, java.lang.String str, int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        if (mr5Var == null || js5Var == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return null;
        }
        try {
            H(mr5Var, objArr);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = mr5Var;
            lVar.f70665b = js5Var;
            lVar.f70666c = str;
            lVar.f70667d = i17;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            this.f304581d = a17;
            if (mr5Var == a17.f70710a.f70684a) {
                com.tencent.mars.xlog.Log.i("SnsAd.AbsNetScene", "the request is same as mRequestAndResponse.getRequestProtoBuf()");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return this;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        try {
            this.f304582e = u0Var;
            int dispatch = dispatch(sVar, this.f304581d, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return dispatch;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return 99999999;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        com.tencent.mm.modelbase.o oVar = this.f304581d;
        if (oVar != null) {
            int i17 = oVar.f70713d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return i17;
        }
        com.tencent.mars.xlog.Log.w("SnsAd.AbsNetScene", "the scene is not initialized, please call initialize method");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return 0;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            com.tencent.mm.modelbase.u0 u0Var = this.f304582e;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
    }
}
