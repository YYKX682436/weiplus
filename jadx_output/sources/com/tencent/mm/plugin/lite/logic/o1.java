package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class o1 implements t80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f144034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f144035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f144037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144038e;

    public o1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.util.Map map, java.util.List list, java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        this.f144038e = g1Var;
        this.f144034a = map;
        this.f144035b = list;
        this.f144036c = str;
        this.f144037d = liteAppReporter;
    }

    @Override // t80.e
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp batch check fail, errorType: %d, errorCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f144037d;
        if (liteAppReporter != null) {
            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE_FAILED, this.f144036c, i18);
        }
        com.tencent.mm.plugin.lite.logic.g1.b(this.f144038e, this.f144035b, new java.util.ArrayList(), new java.util.ArrayList(), this.f144035b, this.f144036c, this.f144037d);
        java.util.Iterator it = this.f144035b.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.logic.g1.d(this.f144038e, (java.lang.String) it.next(), i17, i18, str, null);
        }
    }

    @Override // t80.e
    public void b(r45.mg mgVar, r45.mg mgVar2) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Map map = this.f144034a;
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f144038e;
        if (mgVar != null && (linkedList3 = mgVar.f380466d) != null) {
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                r45.wy4 wy4Var = (r45.wy4) it.next();
                if (wy4Var.f389586e != 0) {
                    arrayList3.add(wy4Var.f389585d);
                    com.tencent.mm.plugin.lite.logic.g1.d(this.f144038e, wy4Var.f389585d, 0, wy4Var.f389586e, "pay batch check single fail", null);
                } else {
                    r45.xr5 xr5Var = wy4Var.f389587f;
                    if (xr5Var == null || (linkedList4 = xr5Var.f390361d) == null || linkedList4.isEmpty()) {
                        arrayList2.add(wy4Var.f389585d);
                    } else {
                        arrayList.add(wy4Var.f389585d);
                    }
                    com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).get(wy4Var.f389585d);
                    if (k2Var == null) {
                        com.tencent.mm.plugin.lite.logic.k2 k2Var2 = new com.tencent.mm.plugin.lite.logic.k2(g1Var);
                        k2Var2.f143999d = 6;
                        k2Var2.f143997b = java.lang.System.currentTimeMillis();
                        ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).put(wy4Var.f389585d, k2Var2);
                    } else {
                        k2Var.f143999d = 6;
                    }
                    java.lang.String str = wy4Var.f389585d;
                    com.tencent.mm.plugin.lite.logic.g1.c(g1Var, str, (com.tencent.liteapp.storage.WxaLiteAppInfo) map.get(str), wy4Var.f389587f, null);
                }
            }
        }
        if (mgVar2 != null && (linkedList = mgVar2.f380466d) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.wy4 wy4Var2 = (r45.wy4) it6.next();
                if (wy4Var2.f389586e != 0) {
                    arrayList3.add(wy4Var2.f389585d);
                    com.tencent.mm.plugin.lite.logic.g1.d(this.f144038e, wy4Var2.f389585d, 0, wy4Var2.f389586e, "pay batch check single fail", null);
                } else {
                    r45.xr5 xr5Var2 = wy4Var2.f389587f;
                    if (xr5Var2 == null || (linkedList2 = xr5Var2.f390361d) == null || linkedList2.isEmpty()) {
                        arrayList2.add(wy4Var2.f389585d);
                    } else {
                        arrayList.add(wy4Var2.f389585d);
                    }
                    com.tencent.mm.plugin.lite.logic.k2 k2Var3 = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).get(wy4Var2.f389585d);
                    if (k2Var3 == null) {
                        com.tencent.mm.plugin.lite.logic.k2 k2Var4 = new com.tencent.mm.plugin.lite.logic.k2(g1Var);
                        k2Var4.f143999d = 5;
                        k2Var4.f143997b = java.lang.System.currentTimeMillis();
                        ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).put(wy4Var2.f389585d, k2Var4);
                    } else {
                        k2Var3.f143999d = 5;
                    }
                    java.lang.String str2 = wy4Var2.f389585d;
                    com.tencent.mm.plugin.lite.logic.g1.c(g1Var, str2, (com.tencent.liteapp.storage.WxaLiteAppInfo) map.get(str2), wy4Var2.f389587f, null);
                }
            }
        }
        com.tencent.mm.plugin.lite.logic.g1.b(this.f144038e, this.f144035b, arrayList, arrayList2, arrayList3, this.f144036c, this.f144037d);
    }
}
