package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class z1 implements e70.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f144093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f144094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.f f144095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppBaselibInfo f144096d;

    public z1(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.f fVar, com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        this.f144093a = k2Var;
        this.f144094b = liteAppReporter;
        this.f144095c = fVar;
        this.f144096d = wxaLiteAppBaselibInfo;
    }

    @Override // e70.s
    public void a(java.util.List list, java.util.Map map, java.util.Map map2, java.util.List list2, java.util.Map map3, e70.t tVar, int i17, long j17) {
    }

    @Override // e70.s
    public java.util.Map b() {
        return null;
    }

    @Override // e70.s
    public void c(java.lang.String str, java.util.List list, int i17, e70.t tVar, int i18, long j17, java.lang.String str2) {
    }

    @Override // e70.s
    public void d(java.util.List list, java.util.Map map, java.util.List list2, java.util.Map map2, e70.t tVar, int i17, long j17, int i18, int i19, com.tencent.mm.protobuf.g gVar) {
    }

    @Override // e70.s
    public void e(java.lang.String str, java.util.List list, int i17, e70.t tVar, int i18, long j17) {
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f144093a;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
        }
        e70.t tVar2 = e70.t.f249855d;
        com.tencent.mm.plugin.lite.api.f fVar = this.f144095c;
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = this.f144096d;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f144094b;
        if (tVar != tVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink error, url is null, errorType:%s, errorCode:%d, info: %s, callback: %s", tVar.toString(), java.lang.Integer.valueOf(i18), wxaLiteAppBaselibInfo, fVar);
            if (liteAppReporter != null) {
                if (tVar == e70.t.f249856e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink success, url is null, no need update");
                    liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_NO_NEED, "Ilink");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink error, url is null, errorType:%s, errorCode:%d", tVar.toString(), java.lang.Integer.valueOf(i18));
                    liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_FAILED, "Ilink", i18);
                }
            }
            if (fVar != null) {
                if (wxaLiteAppBaselibInfo != null) {
                    fVar.b(wxaLiteAppBaselibInfo, 1);
                    return;
                } else {
                    fVar.a(2);
                    return;
                }
            }
            return;
        }
        if (liteAppReporter != null) {
            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_SUCCESS, "Ilink");
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink success, resourceInfo list is null");
            if (fVar != null) {
                if (wxaLiteAppBaselibInfo != null) {
                    fVar.b(wxaLiteAppBaselibInfo, 1);
                    return;
                } else {
                    fVar.a(2);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink success, resourceInfo list size: %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f83.b bVar = (f83.b) ((e70.u) it.next());
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download ilink liteapp baselib resourceName:%s fileSize:%d url:%s", bVar.t0(), java.lang.Integer.valueOf(bVar.field_resourceSize), bVar.u0());
            oq1.q qVar = new oq1.q();
            qVar.f347346a = com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB;
            qVar.f347349d = bVar.u0();
            java.lang.String field_md5 = bVar.field_md5;
            kotlin.jvm.internal.o.f(field_md5, "field_md5");
            qVar.f347350e = field_md5;
            qVar.f347353h = bVar.field_resourceSize;
            qVar.f347359n = bVar.t0();
            qVar.f347360o = bVar.field_resourceVersion;
            qVar.f347351f = "";
            qVar.f347352g = "";
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.d(qVar, "release", this.f144093a, this.f144094b, this.f144095c);
        }
    }
}
