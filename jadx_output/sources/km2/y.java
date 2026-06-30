package km2;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final km2.y f309226a = new km2.y();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f309227b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static km2.x f309228c;

    public final void a(km2.m mVar, boolean z17) {
        km2.m mVar2;
        com.tencent.mm.live.api.LiveConfig liveConfig;
        com.tencent.mm.live.api.LiveConfig liveConfig2;
        com.tencent.mm.live.api.LiveConfig liveConfig3;
        com.tencent.mm.live.api.LiveConfig liveConfig4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#reportCurrentLive liveId:");
        sb6.append((mVar == null || (liveConfig4 = mVar.f309129d) == null) ? null : java.lang.Long.valueOf(liveConfig4.f68537e));
        sb6.append(" name:");
        sb6.append((mVar == null || (liveConfig3 = mVar.f309129d) == null) ? null : liveConfig3.M);
        sb6.append(" isHistoryLive:");
        sb6.append(z17);
        sb6.append('}');
        com.tencent.mars.xlog.Log.i("LiveHistoryManager", sb6.toString());
        java.lang.Long valueOf = (mVar == null || (liveConfig2 = mVar.f309129d) == null) ? null : java.lang.Long.valueOf(liveConfig2.f68537e);
        km2.x xVar = f309228c;
        if (kotlin.jvm.internal.o.b(valueOf, (xVar == null || (mVar2 = xVar.f309225b) == null || (liveConfig = mVar2.f309129d) == null) ? null : java.lang.Long.valueOf(liveConfig.f68537e))) {
            com.tencent.mars.xlog.Log.i("LiveHistoryManager", "reportCurrentLive is equal. return");
        }
        km2.x xVar2 = f309228c;
        java.util.LinkedHashMap linkedHashMap = f309227b;
        if (xVar2 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - xVar2.f309224a;
            boolean z18 = currentTimeMillis > ((long) (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3891u3).getValue()).r()).intValue() * 1000));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#reportCurrentLive pre live liveId:");
            km2.m mVar3 = xVar2.f309225b;
            sb7.append(mVar3.f309129d.f68537e);
            sb7.append(" name:");
            sb7.append(mVar3.f309129d.M);
            sb7.append(" stayTime:");
            sb7.append(currentTimeMillis);
            sb7.append(" toHistory=");
            sb7.append(z18);
            com.tencent.mars.xlog.Log.i("LiveHistoryManager", sb7.toString());
            if (z18) {
                linkedHashMap.remove(java.lang.Long.valueOf(mVar3.f309129d.f68537e));
                linkedHashMap.put(java.lang.Long.valueOf(mVar3.f309129d.f68537e), mVar3);
                java.util.Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    int size = linkedHashMap.size();
                    int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3900v3).getValue()).r()).intValue();
                    if (size <= intValue) {
                        break;
                    }
                    com.tencent.mars.xlog.Log.i("LiveHistoryManager", "#reportCurrentLive historiesList.size=" + size + ", max=" + intValue + ". remove " + ((km2.m) entry.getValue()).f309129d.M);
                    it.remove();
                }
            }
        }
        f309228c = null;
        com.tencent.mars.xlog.Log.i("LiveHistoryManager", "#reportCurrentLive finally histories size: " + linkedHashMap.size());
        if (mVar == null) {
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        km2.m mVar4 = new km2.m(mVar.f309129d);
        mVar4.f309135m = true;
        f309228c = new km2.x(currentTimeMillis2, mVar4);
    }
}
