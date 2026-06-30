package ib4;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290230d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290231e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f290232f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010a A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:13:0x00ec, B:15:0x010a, B:16:0x010f, B:18:0x0115, B:20:0x0121), top: B:12:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115 A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:13:0x00ec, B:15:0x010a, B:16:0x010f, B:18:0x0115, B:20:0x0121), top: B:12:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ib4.i.<init>(java.lang.String, java.lang.String):void");
    }

    public static boolean H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReport2Kv", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_adchannel_to_kv, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReport2Kv", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "isReport2Kv, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReport2Kv", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
            return false;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        com.tencent.mars.xlog.Log.i("NetSceneAdLadingPageClick", "doScene, channel=" + this.f290232f);
        this.f290231e = u0Var;
        int dispatch = dispatch(sVar, this.f290230d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        int i17 = this.f290230d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        com.tencent.mars.xlog.Log.i("NetSceneAdLadingPageClick", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str + ", channel=" + this.f290232f);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 91);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f290231e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
    }
}
