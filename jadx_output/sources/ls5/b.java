package ls5;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f321116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ls5.d f321118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, java.lang.String str, ls5.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321116d = i17;
        this.f321117e = str;
        this.f321118f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ls5.b(this.f321116d, this.f321117e, this.f321118f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ls5.b bVar = (ls5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct();
        finderLiveErrorReportStruct.f57145e = this.f321116d;
        org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.v(this.f321117e, ";", ",", false, 4, null));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ls5.d dVar = this.f321118f;
        jSONObject.put("leak_time", (currentTimeMillis - dVar.f321124d) / 1000);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        finderLiveErrorReportStruct.p(t17);
        com.tencent.mars.xlog.Log.i(dVar.f321121a, "checkLeakDetailReport leakJson: ".concat(t17));
        finderLiveErrorReportStruct.k();
        dVar.f321123c = "";
        dVar.f321124d = 0L;
        return jz5.f0.f302826a;
    }
}
