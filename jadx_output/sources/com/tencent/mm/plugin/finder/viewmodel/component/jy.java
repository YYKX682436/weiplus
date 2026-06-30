package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jy extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.jy f134904d = new com.tencent.mm.plugin.finder.viewmodel.component.jy();

    public jy() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject appendExtraInfo = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(appendExtraInfo, "$this$appendExtraInfo");
        synchronized (com.tencent.mm.plugin.finder.report.p4.f125250a) {
            jSONObject = com.tencent.mm.plugin.finder.report.p4.f125253d;
            if (jSONObject == null) {
                java.util.LinkedList linkedList = com.tencent.mm.plugin.finder.report.p4.f125251b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) com.tencent.mm.plugin.finder.report.p4.f125252c.get((java.lang.String) it.next());
                    if (jSONObject2 != null) {
                        arrayList.add(jSONObject2);
                    }
                }
                jSONObject = com.tencent.mm.plugin.finder.report.q4.a(arrayList);
                com.tencent.mm.plugin.finder.report.p4.f125253d = jSONObject;
                jSONObject.toString();
            }
        }
        appendExtraInfo.put("client_page_udf_kv", jSONObject);
        return jz5.f0.f302826a;
    }
}
