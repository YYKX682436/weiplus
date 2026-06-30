package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class m2 implements e70.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f144017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f144018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144019c;

    public m2(com.tencent.mm.plugin.lite.logic.o2 o2Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, java.lang.String str) {
        this.f144017a = k2Var;
        this.f144018b = wxaLiteAppInfo;
        this.f144019c = str;
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
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f144017a;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
        }
        e70.t tVar2 = e70.t.f249855d;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f144018b;
        java.lang.String str2 = this.f144019c;
        if (tVar != tVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink, url is null, appId:%s errorType:%s errorCode:%d, info: %s, callback: %s", str2, tVar.toString(), java.lang.Integer.valueOf(i18), wxaLiteAppInfo, com.tencent.mm.plugin.lite.logic.g1.s().f143949c);
            if (com.tencent.mm.plugin.lite.logic.g1.s().f143949c != null) {
                if (wxaLiteAppInfo != null) {
                    ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).success(wxaLiteAppInfo, 1);
                    return;
                } else {
                    ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).fail(str2, 2);
                    return;
                }
            }
            return;
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink success, resourceInfo list is null");
            if (com.tencent.mm.plugin.lite.logic.g1.s().f143949c != null) {
                if (wxaLiteAppInfo != null) {
                    ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).success(wxaLiteAppInfo, 1);
                    return;
                } else {
                    ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).fail(str2, 2);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp %s ilink success, resourceInfo list size: %d", str, java.lang.Integer.valueOf(list.size()));
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
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", this.f144017a, null, com.tencent.mm.plugin.lite.logic.g1.s().f143949c);
        }
    }
}
