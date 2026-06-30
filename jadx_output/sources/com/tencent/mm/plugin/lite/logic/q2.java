package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class q2 implements t80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f144047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f144048c;

    public q2(com.tencent.mm.plugin.lite.logic.r2 r2Var, java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, com.tencent.mm.plugin.lite.logic.k2 k2Var) {
        this.f144046a = str;
        this.f144047b = wxaLiteAppInfo;
        this.f144048c = k2Var;
    }

    @Override // t80.f
    public void a(int i17, int i18, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str2 = this.f144046a;
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate fail, appId: %s, errorType: %d, errorCode: %d, errorMsg: %s", str2, valueOf, valueOf2, str);
        if (com.tencent.mm.plugin.lite.logic.g1.s().f143949c != null) {
            ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).fail(str2, 2);
        }
    }

    @Override // t80.f
    public void b(r45.xr5 xr5Var) {
        boolean isEmpty = xr5Var.f390361d.isEmpty();
        java.util.LinkedList linkedList = xr5Var.f390361d;
        java.lang.String str = this.f144046a;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success but got no update, appId: %s, resourceList size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
            if (com.tencent.mm.plugin.lite.logic.g1.s().f143949c != null) {
                ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).success(this.f144047b, 1);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success, got no update, appId: %s, resourceList size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f144048c;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vy4 vy4Var = (r45.vy4) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success, got update, appId: %s, resourceName: %s, version: %d, size: %d, md5: %s, url: %s, createTime: %d", this.f144046a, vy4Var.f388664e, java.lang.Integer.valueOf(vy4Var.f388665f), java.lang.Integer.valueOf(vy4Var.f388666g), vy4Var.f388667h, vy4Var.f388668i, java.lang.Integer.valueOf(vy4Var.f388669m));
            oq1.q qVar = new oq1.q();
            qVar.f347346a = str;
            qVar.f347359n = vy4Var.f388664e;
            qVar.f347360o = vy4Var.f388665f;
            qVar.f347353h = vy4Var.f388666g;
            qVar.f347350e = vy4Var.f388667h;
            qVar.f347349d = vy4Var.f388668i;
            qVar.f347351f = "";
            qVar.f347352g = "";
            qVar.f347363r = 0;
            r45.kk0 kk0Var = vy4Var.f388670n;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_pay_lite_app_open_pkg_compress_android, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp pkg abtest is enable compress, appId: %s", str);
                java.util.LinkedList linkedList2 = vy4Var.f388672p;
                if (!nf.c.a(linkedList2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onPayCheckSuccess has version meta data");
                    r45.kk0 D = com.tencent.mm.plugin.lite.logic.g1.D(linkedList2, qVar, null);
                    if (D != null) {
                        kk0Var = D;
                    }
                }
            }
            if (kk0Var != null) {
                qVar.f347362q = new oq1.c(kk0Var.f378773d, android.util.Base64.decode(kk0Var.f378776g, 0), android.util.Base64.decode(kk0Var.f378775f, 0), android.util.Base64.decode(kk0Var.f378774e, 0), com.tencent.mm.plugin.lite.logic.g1.q(vy4Var).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", this.f144048c, null, com.tencent.mm.plugin.lite.logic.g1.s().f143949c);
        }
    }
}
