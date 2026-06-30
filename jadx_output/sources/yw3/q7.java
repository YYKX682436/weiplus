package yw3;

/* loaded from: classes8.dex */
public final class q7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466861d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.q7(this.f466861d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.q7 q7Var = (yw3.q7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            java.lang.String str = null;
            try {
                wq5.e eVar = new wq5.e(new wq5.h(new java.io.StringReader(new org.json.JSONObject(this.f466861d).toString())));
                java.lang.Character ch6 = wq5.i.f448711a;
                str = wq5.i.e(eVar, null, wq5.j.f448720e);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Json.XmlToJsonUtil", e17, "toXml", new java.lang.Object[0]);
            }
            if (str == null) {
                str = "";
            }
            java.lang.String format = java.lang.String.format("json_to_xml_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(format, bytes, true);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Repairer.RepairerXmlToJSONDemo", e18, "json_to_xml", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
