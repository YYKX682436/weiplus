package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/t4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/r4", "com/tencent/mm/plugin/lite/jsapi/comms/s4", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class t4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.util.List list = com.tencent.mm.plugin.lite.jsapi.comms.r4.f143762b.a(data).f143763a;
            e40.c0 c0Var = (e40.c0) i95.n0.c(e40.c0.class);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.lite.jsapi.comms.s4) it.next()).f143771a);
            }
            ((d40.t) c0Var).aj(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiOperateSaveFile", e17.getMessage() + ": " + jz5.a.b(e17));
            jd.c cVar = this.f143442e;
            if (cVar != null) {
                cVar.a();
            }
        }
    }
}
