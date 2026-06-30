package dz0;

/* loaded from: classes5.dex */
public interface g {
    static java.lang.Object a(dz0.g gVar, java.lang.String templateId, yz5.p pVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestRecommendMusicList");
        }
        int i18 = i17 & 2;
        java.lang.Integer num = null;
        if (i18 != 0) {
            pVar = null;
        }
        dz0.e0 e0Var = (dz0.e0) gVar;
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = e0Var.f244828k;
        dz0.e0 e0Var2 = maasSdkUIC.D;
        if (e0Var2.f244823f && ((java.lang.Boolean) ((jz5.n) e0Var2.f244824g).getValue()).booleanValue()) {
            jz5.l lVar = e0Var.f244826i;
            if (lVar != null) {
                java.lang.String str = (java.lang.String) lVar.f302833d;
                if (!kotlin.jvm.internal.o.b(str, templateId)) {
                    java.lang.Integer num2 = (java.lang.Integer) lVar.f302834e;
                    com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "cancelRecommendMusicList:" + str + ", " + num2);
                    az0.n7 n7Var = maasSdkUIC.f69783d;
                    if (n7Var != null && num2 != null) {
                        n7Var.f15742a.cancelMusicRecommend(num2.intValue());
                    }
                }
            }
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) e0Var.f244825h).get(templateId);
            if (list != null && (list.isEmpty() ^ true)) {
                com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "requestRecommendMusicList: templateId:" + templateId + " has cache");
            } else {
                dz0.c0 c0Var = new dz0.c0(pVar, templateId, maasSdkUIC, e0Var);
                az0.n7 n7Var2 = maasSdkUIC.f69783d;
                if (n7Var2 != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    gm0.m b17 = gm0.j1.b();
                    java.lang.String a17 = kk.v.a(b17 != null ? b17.h() : 0);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long hashCode = (currentTimeMillis + '_' + a17 + '_' + c06.f.a(android.os.SystemClock.elapsedRealtime()).c()).hashCode();
                    kotlin.jvm.internal.o.g(templateId, "templateId");
                    num = new java.lang.Integer(n7Var2.f15742a.requestMusicRecommend(templateId, hashCode, new az0.u6(c0Var, hashCode, java.lang.System.currentTimeMillis())));
                }
                e0Var.f244826i = new jz5.l(templateId, num);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "requestRecommendMusicList: failed, not enable");
        }
        return num;
    }
}
