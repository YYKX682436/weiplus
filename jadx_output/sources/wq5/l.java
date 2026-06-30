package wq5;

/* loaded from: classes8.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final org.json.JSONObject a(java.lang.String xml) {
        kotlin.jvm.internal.o.g(xml, "xml");
        try {
            java.lang.Character ch6 = wq5.i.f448711a;
            wq5.j jVar = wq5.j.f448720e;
            java.io.StringReader stringReader = new java.io.StringReader(xml);
            wq5.e eVar = new wq5.e();
            wq5.k kVar = new wq5.k(stringReader);
            while (kVar.b()) {
                kVar.i("<");
                if (kVar.b()) {
                    wq5.i.b(kVar, eVar, null, jVar);
                }
            }
            return new org.json.JSONObject(eVar.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Json.XmlToJsonUtil", e17, "toJsonString", new java.lang.Object[0]);
            return null;
        }
    }
}
