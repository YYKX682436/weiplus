package gh2;

/* loaded from: classes10.dex */
public final class f extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f271870f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f271871g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f271870f = new java.util.concurrent.ConcurrentHashMap();
        this.f271871g = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void N6(java.lang.String userId, long j17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        if ((userId.length() == 0) || j17 <= 0) {
            return;
        }
        gh2.e eVar = (gh2.e) this.f271871g.get(userId);
        if (eVar == null) {
            eVar = new gh2.e(this, userId);
            this.f271871g.put(userId, eVar);
        }
        synchronized (eVar.f271869a) {
            eVar.f271869a.add(java.lang.Long.valueOf(j17));
            eVar.a();
        }
    }

    public final void O6(java.lang.String uniqueId, gh2.b resultType, yz5.l lVar) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(resultType, "resultType");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report: ");
        sb6.append(uniqueId);
        sb6.append(" resultType: ");
        sb6.append(resultType);
        sb6.append(" data: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f271870f;
        sb6.append(concurrentHashMap.get(uniqueId));
        com.tencent.mars.xlog.Log.i("LiveKTVReportSlice", sb6.toString());
        gh2.d dVar = (gh2.d) concurrentHashMap.get(uniqueId);
        if (dVar != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct finderLiveKTVReportStruct = dVar.f271867a;
            if (lVar != null) {
                lVar.invoke(finderLiveKTVReportStruct);
            }
            finderLiveKTVReportStruct.f57160j = resultType.f271865d;
            finderLiveKTVReportStruct.f57163m = (int) (java.lang.System.currentTimeMillis() - dVar.f271868b);
            finderLiveKTVReportStruct.k();
            com.tencent.mars.xlog.Log.i("LiveKTVReportSlice", "realReport: " + finderLiveKTVReportStruct.n());
        }
        concurrentHashMap.remove(uniqueId);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
    }
}
