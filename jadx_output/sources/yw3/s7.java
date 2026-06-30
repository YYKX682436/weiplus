package yw3;

/* loaded from: classes.dex */
public final class s7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466885d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.s7(this.f466885d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.s7 s7Var = (yw3.s7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f466885d, "msg", null);
            kotlin.jvm.internal.o.d(d17);
            java.util.ArrayList arrayList = new java.util.ArrayList(d17.size());
            for (java.util.Map.Entry entry : d17.entrySet()) {
                arrayList.add(((java.lang.String) entry.getKey()) + '[' + ((java.lang.String) entry.getValue()) + ']');
            }
            java.lang.String g07 = kz5.n0.g0(arrayList, "\n", null, null, 0, null, null, 62, null);
            java.lang.String format = java.lang.String.format("MMXmlParser_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            byte[] bytes = g07.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(format, bytes, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Repairer.RepairerXmlToJSONDemo", e17, "mm_xml_parser", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
