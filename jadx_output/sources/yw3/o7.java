package yw3;

/* loaded from: classes.dex */
public final class o7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466842d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.o7(this.f466842d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.o7 o7Var = (yw3.o7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            org.json.JSONObject a17 = wq5.m.f448726a.a(this.f466842d);
            if (a17 == null || (str = a17.toString()) == null) {
                str = "";
            }
            java.lang.String format = java.lang.String.format("xml_to_json_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(format, bytes, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Repairer.RepairerXmlToJSONDemo", e17, "xml_to_json", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
