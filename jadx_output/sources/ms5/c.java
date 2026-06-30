package ms5;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331144d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f331146f;

    /* renamed from: g, reason: collision with root package name */
    public int f331147g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f331148h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.plugin.finder.detector.api.detect.BaseEventDetector f331149i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ns5.a f331150m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.Map map, com.tencent.plugin.finder.detector.api.detect.BaseEventDetector baseEventDetector, ns5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331148h = map;
        this.f331149i = baseEventDetector;
        this.f331150m = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ms5.c(this.f331148h, this.f331149i, this.f331150m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ms5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ns5.a aVar;
        com.tencent.plugin.finder.detector.api.detect.BaseEventDetector baseEventDetector;
        java.util.Iterator it;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f331147g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : this.f331148h.entrySet()) {
                java.lang.String str = ((ls5.f) entry.getValue()).f321132b;
                if (!(str == null || str.length() == 0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector baseEventDetector2 = this.f331149i;
            aVar = this.f331150m;
            baseEventDetector = baseEventDetector2;
            it = it6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f331146f;
            aVar = (ns5.a) this.f331145e;
            baseEventDetector = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector) this.f331144d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct();
            finderLiveErrorReportStruct.f57145e = baseEventDetector.j();
            finderLiveErrorReportStruct.p(baseEventDetector.k((ls5.f) entry2.getValue(), aVar));
            baseEventDetector.a(finderLiveErrorReportStruct, (ls5.f) entry2.getValue(), aVar);
            finderLiveErrorReportStruct.f57144d = finderLiveErrorReportStruct.b("playerLeaksTrace", ((ls5.f) entry2.getValue()).f321132b, true);
            finderLiveErrorReportStruct.f57147g = baseEventDetector.h();
            com.tencent.mars.xlog.Log.i(baseEventDetector.f215227e, "ilog report " + finderLiveErrorReportStruct.f57146f + " version: " + finderLiveErrorReportStruct.f57147g);
            finderLiveErrorReportStruct.k();
            this.f331144d = baseEventDetector;
            this.f331145e = aVar;
            this.f331146f = it;
            this.f331147g = 1;
            if (baseEventDetector.q(aVar, entry2, finderLiveErrorReportStruct, this) == aVar2) {
                return aVar2;
            }
        }
        this.f331149i.o(this.f331148h);
        return jz5.f0.f302826a;
    }
}
