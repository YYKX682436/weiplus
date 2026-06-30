package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.y5 f143820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f143821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.tencent.mm.plugin.lite.jsapi.comms.y5 y5Var, java.util.List list) {
        super(2);
        this.f143820d = y5Var;
        this.f143821e = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.lang.Object obj3;
        java.util.Map batchDownloadStatus = (java.util.Map) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(batchDownloadStatus, "batchDownloadStatus");
        com.tencent.mm.plugin.lite.jsapi.comms.y5 y5Var = this.f143820d;
        if (booleanValue) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : batchDownloadStatus.entrySet()) {
                if (((e40.b0) entry.getValue()).f247612a == e40.a0.f247607m) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                e40.b0 b0Var = (e40.b0) entry2.getValue();
                java.util.Iterator it = this.f143821e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.lite.jsapi.comms.v5) obj3).f143808a, str)) {
                        break;
                    }
                }
                com.tencent.mm.plugin.lite.jsapi.comms.v5 v5Var = (com.tencent.mm.plugin.lite.jsapi.comms.v5) obj3;
                if (v5Var != null) {
                    com.tencent.mm.vfs.r6 r6Var = com.tencent.mm.plugin.lite.jsapi.comms.y5.f143835g;
                    y5Var.B(v5Var.f143813f, v5Var.f143812e, v5Var.f143810c);
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
            java.lang.String str2 = (java.lang.String) entry3.getKey();
            e40.b0 b0Var2 = (e40.b0) entry3.getValue();
            e40.a0 a0Var3 = b0Var2.f247612a;
            java.lang.Float f17 = b0Var2.f247613b;
            arrayList.add(new com.tencent.mm.plugin.lite.jsapi.comms.r5(a0Var3, str2, f17 != null ? java.lang.Integer.valueOf((int) f17.floatValue()) : null, null, 8, null));
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            jSONArray.put(((com.tencent.mm.plugin.lite.jsapi.comms.r5) it7.next()).a());
        }
        jSONObject.put("fileList", jSONArray);
        jSONObject.put("complete", z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiSaveFile", "callbackResponse = " + jSONObject);
        y5Var.f143442e.f(jSONObject, booleanValue ^ true);
        return jz5.f0.f302826a;
    }
}
