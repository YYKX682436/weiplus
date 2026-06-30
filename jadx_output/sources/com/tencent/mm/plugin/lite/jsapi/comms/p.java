package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q f143710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f143711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.lite.jsapi.comms.q qVar, java.util.List list) {
        super(2);
        this.f143710d = qVar;
        this.f143711e = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.lang.Object obj3;
        java.util.Map batchDownloadStatus = (java.util.Map) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(batchDownloadStatus, "batchDownloadStatus");
        if (booleanValue) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : batchDownloadStatus.entrySet()) {
                if (((e40.b0) entry.getValue()).f247612a == e40.a0.f247607m) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            com.tencent.mm.plugin.lite.jsapi.comms.q qVar = this.f143710d;
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                e40.b0 b0Var = (e40.b0) entry2.getValue();
                java.util.Iterator it = this.f143711e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.lite.jsapi.comms.o) obj3).f143694a, str)) {
                        break;
                    }
                }
                com.tencent.mm.plugin.lite.jsapi.comms.o oVar = (com.tencent.mm.plugin.lite.jsapi.comms.o) obj3;
                if (oVar != null) {
                    java.lang.String str2 = oVar.f143698e;
                    java.lang.String str3 = oVar.f143694a;
                    java.lang.String str4 = oVar.f143696c;
                    java.lang.String n17 = com.tencent.mm.vfs.w6.n(str4);
                    com.tencent.mm.vfs.r6 r6Var = com.tencent.mm.plugin.lite.jsapi.comms.q.f143720g;
                    qVar.A(str2, str3, str4, null, n17);
                }
                e40.a0 a0Var = e40.a0.f247608n;
                b0Var.getClass();
                b0Var.f247612a = a0Var;
            }
        }
        java.util.Collection values = batchDownloadStatus.values();
        if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
            java.util.Iterator it6 = values.iterator();
            while (it6.hasNext()) {
                e40.a0 a0Var2 = ((e40.b0) it6.next()).f247612a;
                if (!(a0Var2 == e40.a0.f247605h || a0Var2 == e40.a0.f247606i)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        boolean z18 = z17 ? false : booleanValue;
        java.util.ArrayList arrayList = new java.util.ArrayList(batchDownloadStatus.size());
        for (java.util.Map.Entry entry3 : batchDownloadStatus.entrySet()) {
            java.lang.String str5 = (java.lang.String) entry3.getKey();
            e40.b0 b0Var2 = (e40.b0) entry3.getValue();
            e40.a0 a0Var3 = b0Var2.f247612a;
            java.lang.Float f17 = b0Var2.f247613b;
            arrayList.add(new com.tencent.mm.plugin.lite.jsapi.comms.m(a0Var3, str5, f17 != null ? java.lang.Integer.valueOf((int) f17.floatValue()) : null, null, 8, null));
        }
        org.json.JSONObject a17 = new com.tencent.mm.plugin.lite.jsapi.comms.l(arrayList, z18).a();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiAddFileToFavorites", "callbackResponse = " + a17);
        this.f143710d.f143442e.f(a17, booleanValue ^ true);
        return jz5.f0.f302826a;
    }
}
