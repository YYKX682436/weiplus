package n74;

/* loaded from: classes4.dex */
public class b1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f335305d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f335306e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.ADInfo f335307f;

    public b1(int i17, java.lang.String str, n74.y0 y0Var) {
        this.f335305d = i17;
        this.f335306e = str;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo a(n74.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = b1Var.f335307f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        return aDInfo;
    }

    public static void b(n74.b1 b1Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        b1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        long F0 = ca4.z0.F0(str);
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(F0);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", "adInfo can not get from DB due to adsnsinfo is null, longSnsId = " + F0 + ", snsId = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        } else {
            b1Var.f335307f = y07.getAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }

    public static void c(n74.b1 b1Var, ca4.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        b1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        bVar.f39820b = null;
        bVar.f39823e = null;
        bVar.f39824f = null;
        bVar.f39822d.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }

    public static void d(n74.b1 b1Var, ca4.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        b1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        if (b1Var.f335307f == null || bVar == null) {
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", "adInfo or adChainData is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new n74.z0(b1Var, bVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        if (m1Var instanceof i64.o0) {
            try {
                r45.go3 go3Var = (r45.go3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType = ");
                sb6.append(i17);
                sb6.append(", errCode = ");
                sb6.append(i18);
                sb6.append(", snsId = ");
                sb6.append(this.f335306e);
                sb6.append(", rsp.sns_ad_id = ");
                sb6.append(go3Var == null ? "" : go3Var.f375394e);
                com.tencent.mars.xlog.Log.i("DynamicDataReqHelper", sb6.toString());
                if (i17 == 0 && i18 == 0 && go3Var != null) {
                    int i19 = go3Var.f375393d;
                    java.lang.String str2 = go3Var.f375394e;
                    java.lang.String str3 = go3Var.f375395f;
                    int i27 = this.f335305d;
                    if (i27 == 1 && i27 == i19 && !com.tencent.mm.sdk.platformtools.t8.N0(this.f335306e, str3) && this.f335306e.equals(str2)) {
                        java.lang.String str4 = this.f335306e;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
                        ((ku5.t0) ku5.t0.f312615d).g(new n74.a1(this, str4, str3));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
                    }
                }
                gm0.j1.d().q(m1Var.getType(), this);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", "NetSceneDynamicAdDataUpdate onSceneEnd exp=" + th6.toString() + ", snsId = " + this.f335306e);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }
}
