package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class i1 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f143979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.f f143980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f143981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f143982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143983e;

    public i1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.util.Map map, com.tencent.mm.plugin.lite.api.f fVar, java.util.List list, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        this.f143983e = g1Var;
        this.f143979a = map;
        this.f143980b = fVar;
        this.f143981c = list;
        this.f143982d = liteAppReporter;
    }

    @Override // oq1.p
    public void a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oq1.q qVar = (oq1.q) it.next();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(qVar.f347349d);
            com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f143983e;
            if (K0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", qVar.f347346a, java.lang.Integer.valueOf(qVar.f347354i), qVar.f347347b);
                if (qVar.f347346a.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
                    com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = g1Var.u(null);
                    com.tencent.mm.plugin.lite.api.f fVar = this.f143980b;
                    if (u17 != null) {
                        arrayList2.add(qVar.f347346a);
                        if (fVar != null) {
                            fVar.b(u17, 1);
                        }
                    } else {
                        arrayList3.add(qVar.f347346a);
                        if (fVar != null) {
                            fVar.a(2);
                        }
                    }
                } else {
                    com.tencent.liteapp.storage.WxaLiteAppInfo y17 = g1Var.y(qVar.f347346a, null);
                    if (y17 != null) {
                        arrayList2.add(qVar.f347346a);
                        com.tencent.mm.plugin.lite.api.h hVar = g1Var.f143949c;
                        if (hVar != null) {
                            ((com.tencent.mm.plugin.lite.logic.d2) hVar).success(y17, 1);
                        }
                    } else {
                        arrayList3.add(qVar.f347346a);
                        com.tencent.mm.plugin.lite.api.h hVar2 = g1Var.f143949c;
                        if (hVar2 != null) {
                            ((com.tencent.mm.plugin.lite.logic.d2) hVar2).fail(qVar.f347346a, 2);
                        }
                    }
                }
            } else {
                arrayList.add(qVar.f347346a);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", qVar.f347346a, java.lang.Integer.valueOf(qVar.f347353h), qVar.f347349d);
                boolean equals = qVar.f347346a.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
                java.util.Map map = this.f143979a;
                if (equals) {
                    com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) map.get(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
                    if (k2Var != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        k2Var.f144001f = currentTimeMillis;
                        k2Var.f144000e = currentTimeMillis;
                    }
                    com.tencent.mm.plugin.lite.logic.c1.INSTANCE.d(qVar, "release", k2Var, null, this.f143980b);
                } else {
                    com.tencent.mm.plugin.lite.logic.k2 k2Var2 = (com.tencent.mm.plugin.lite.logic.k2) map.get(qVar.f347346a);
                    if (k2Var2 != null) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        k2Var2.f144001f = currentTimeMillis2;
                        k2Var2.f144000e = currentTimeMillis2;
                    }
                    com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", k2Var2, null, g1Var.f143949c);
                }
            }
        }
        com.tencent.mm.plugin.lite.logic.g1.b(this.f143983e, this.f143981c, arrayList, arrayList2, arrayList3, "Tinker", this.f143982d);
    }
}
