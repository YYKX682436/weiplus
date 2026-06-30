package ey2;

/* loaded from: classes2.dex */
public final class p2 extends pf5.o0 {

    /* renamed from: g, reason: collision with root package name */
    public static final ey2.o2 f257467g = new ey2.o2(null);

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f257468e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257469f = new java.util.concurrent.ConcurrentHashMap();

    public final ey2.n2 N6(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f257469f;
        ey2.n2 n2Var = (ey2.n2) concurrentHashMap.get(key);
        if (n2Var == null) {
            n2Var = new ey2.n2(key);
            concurrentHashMap.put(key, new ey2.n2(key));
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedCacheVM", "[get] key:" + key + " size:" + n2Var.f257438b.size());
        }
        return n2Var;
    }

    public final void O6(java.lang.String key, java.util.List lastDataList, r45.r03 r03Var) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(lastDataList, "lastDataList");
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedCacheVM", "[store] key:" + key + " size:" + lastDataList.size());
        ey2.n2 N6 = N6(key, true);
        N6.f257438b = lastDataList;
        N6.f257439c = r03Var;
        this.f257469f.put(key, N6);
    }
}
