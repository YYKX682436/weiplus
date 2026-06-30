package cp0;

/* loaded from: classes15.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.l f220750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ip0.a f220751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hp0.e f220752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f220753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cp0.l lVar, ip0.a aVar, hp0.e eVar, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        super(0);
        this.f220750d = lVar;
        this.f220751e = aVar;
        this.f220752f = eVar;
        this.f220753g = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ip0.a aVar;
        cp0.l lVar = this.f220750d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = lVar.f220758a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = this.f220751e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (kotlin.jvm.internal.o.b(((jz5.l) entry.getValue()).f302833d, aVar)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            com.tencent.mars.xlog.Log.i(cp0.l.f220757d, "onDataItemLoadEnd can not found " + aVar);
        }
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object obj = this.f220752f.f282910b;
            if (obj != null) {
                com.tencent.mars.xlog.Log.i(cp0.l.f220757d, "dispatch " + ((jz5.l) entry2.getValue()).f302834e + " resource " + obj + " url " + aVar + "  try get:" + ((cp0.f) ((jz5.l) entry2.getValue()).f302834e).f220745a.a() + " makeSureUIThread: " + this.f220753g);
                cp0.f fVar = (cp0.f) ((jz5.l) entry2.getValue()).f302834e;
                cp0.i iVar = new cp0.i(lVar, entry2, aVar);
                try {
                    fVar.a(obj, iVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i(cp0.l.f220757d, "exception " + e17.getMessage());
                    iVar.a(true);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
