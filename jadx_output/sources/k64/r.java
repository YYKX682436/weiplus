package k64;

/* loaded from: classes4.dex */
public class r extends k64.a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public e74.j f304608f;

    public r(java.lang.String str, java.lang.String str2, r45.a3[] a3VarArr) {
        J(new r45.b3(), new r45.c3(), "/cgi-bin/mmoc-bin/adplayinfo/ad_dynamic_update", 5012, str, str2, a3VarArr);
    }

    @Override // k64.a
    public void H(r45.mr5 mr5Var, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        r45.b3 b3Var = (r45.b3) mr5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        try {
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.String str2 = (java.lang.String) objArr[1];
            r45.a3[] a3VarArr = (r45.a3[]) objArr[2];
            if (b3Var != null) {
                b3Var.f370488d = str;
                b3Var.f370489e = str2;
                if (a84.b0.g(a3VarArr)) {
                    java.util.Collections.addAll(b3Var.f370490f, a3VarArr);
                }
                b3Var.f370490f.size();
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdDynamicUpdate", "fillRequestParam::convert to param throw wrong!!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    public void K(e74.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSend", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        gm0.j1.d().a(5012, this);
        gm0.j1.d().g(this);
        this.f304608f = jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSend", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    public void L(int i17, java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResponseFinish", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        e74.j jVar = this.f304608f;
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f312615d).B(new k64.q(this, jVar, i17, str, list));
        } else if (jVar != null) {
            jVar.a(i17, str, list);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponseFinish", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.c3 c3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        gm0.j1.d().q(5012, this);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof k64.r) && (c3Var = (r45.c3) ((k64.r) m1Var).I()) != null) {
            L(0, c3Var.f371251d, c3Var.f371252e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        } else {
            L(-1, "", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        }
    }
}
