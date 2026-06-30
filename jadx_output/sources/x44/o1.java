package x44;

/* loaded from: classes4.dex */
public final class o1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        long optLong = data.optLong(dm.i4.COL_ID, 0L);
        boolean z17 = false;
        int optInt = data.optInt("opType", 0);
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.OperateDownloadTask", "the download id is invalid");
            b(g("the download id is invalid"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            return;
        }
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.OperateDownloadTask", "activity is null !!");
            b(g("activity is null !!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0 i17 = com.tencent.mm.plugin.downloader.model.r0.i();
        if (optInt == 0) {
            kotlin.jvm.internal.o.d(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            if (com.tencent.mars.comm.NetStatusUtil.isConnected(a17)) {
                if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
                    if (adLandingPagesProxy != null && adLandingPagesProxy.isFreeSimCard()) {
                        z17 = true;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
                    if (!z17) {
                        ((ku5.t0) ku5.t0.f312615d).B(new x44.n1(a17, this, optLong, i17));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
                    }
                }
                p(optLong, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            } else {
                com.tencent.mars.xlog.Log.w("SnsAdJs.OperateDownloadTask", "there is no network now");
                b(w44.d.k(this, -1, "there is no network now", null, 4, null));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            }
        } else if (optInt == 1) {
            kotlin.jvm.internal.o.d(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            if (i17.o(optLong)) {
                b(l());
            } else {
                b(w44.d.k(this, -1, "pause error", null, 4, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        } else if (optInt != 2) {
            b(g("no op type!!!"));
        } else {
            kotlin.jvm.internal.o.d(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            i17.t(optLong);
            b(l());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
    }

    public final void p(long j17, vz.s1 s1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        x44.n nVar = x44.n.f451859d;
        w44.b d17 = d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        nVar.j(j17, new x44.e3(d17.f442895e));
        com.tencent.mm.plugin.downloader.model.r0 r0Var = (com.tencent.mm.plugin.downloader.model.r0) s1Var;
        boolean w17 = r0Var.w(j17);
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = r0Var.p(j17);
        yb0.a aVar = yb0.a.f460612a;
        java.lang.String str = p17 != null ? p17.f96962e : null;
        if (str == null) {
            str = "";
        }
        java.lang.String m17 = d().b().m();
        aVar.a(str, m17 != null ? m17 : "");
        if (w17) {
            b(l());
        } else {
            b(w44.d.k(this, -1, "resume error", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
    }
}
