package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class f2 implements e70.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f143937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f143938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f143939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143941e;

    public f2(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, java.lang.String str) {
        this.f143941e = g1Var;
        this.f143937a = k2Var;
        this.f143938b = liteAppReporter;
        this.f143939c = wxaLiteAppInfo;
        this.f143940d = str;
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
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f143937a;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
        }
        e70.t tVar2 = e70.t.f249855d;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f143939c;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f143938b;
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f143941e;
        java.lang.String str2 = this.f143940d;
        if (tVar != tVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink, url is null, appId:%s errorType:%s errorCode:%d, info: %s, callback: %s", str2, tVar.toString(), java.lang.Integer.valueOf(i18), wxaLiteAppInfo, g1Var.f143949c);
            if (liteAppReporter != null) {
                if (tVar == e70.t.f249856e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink success, url is null, no need update");
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_NO_NEED, "Ilink");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink error, url is null, errorType:%s, errorCode:%d", tVar.toString(), java.lang.Integer.valueOf(i18));
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_FAILED, "Ilink", i18);
                }
            }
            com.tencent.mm.plugin.lite.api.h hVar = g1Var.f143949c;
            if (hVar != null) {
                if (wxaLiteAppInfo != null) {
                    ((com.tencent.mm.plugin.lite.logic.d2) hVar).success(wxaLiteAppInfo, 1);
                    return;
                } else {
                    ((com.tencent.mm.plugin.lite.logic.d2) hVar).fail(str2, 2);
                    return;
                }
            }
            return;
        }
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_SUCCESS, "Ilink");
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp: %s ilink success, resourceInfo list is null", str);
            com.tencent.mm.plugin.lite.api.h hVar2 = g1Var.f143949c;
            if (hVar2 != null) {
                if (wxaLiteAppInfo != null) {
                    ((com.tencent.mm.plugin.lite.logic.d2) hVar2).success(wxaLiteAppInfo, 1);
                    return;
                } else {
                    ((com.tencent.mm.plugin.lite.logic.d2) hVar2).fail(str2, 2);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink success, resourceInfo list size: %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f83.b bVar = (f83.b) ((e70.u) it.next());
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download ilink liteapp:%s resourceName:%s fileSize:%d url:%s", str2, bVar.t0(), java.lang.Integer.valueOf(bVar.field_resourceSize), bVar.u0());
            oq1.q qVar = new oq1.q();
            qVar.f347346a = str2;
            qVar.f347349d = bVar.u0();
            java.lang.String field_md5 = bVar.field_md5;
            kotlin.jvm.internal.o.f(field_md5, "field_md5");
            qVar.f347350e = field_md5;
            qVar.f347353h = bVar.field_resourceSize;
            qVar.f347359n = bVar.t0();
            qVar.f347360o = bVar.field_resourceVersion;
            qVar.f347351f = "";
            qVar.f347352g = "";
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", this.f143937a, this.f143938b, g1Var.f143949c);
        }
    }
}
