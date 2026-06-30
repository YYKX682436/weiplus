package eq2;

/* loaded from: classes2.dex */
public final class b extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f255883e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f255884f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f255885g = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();

    public final eq2.a N6(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f255883e;
        if (concurrentHashMap.get(sb7) == null) {
            concurrentHashMap.put(sb7, new eq2.a(i17, i18));
        }
        java.lang.Object obj = concurrentHashMap.get(sb7);
        kotlin.jvm.internal.o.d(obj);
        return (eq2.a) obj;
    }

    public final void O6(int i17, int i18, int i19, int i27, int i28, java.util.ArrayList lastDataList, com.tencent.mm.protobuf.g gVar, r45.dk2 dk2Var) {
        kotlin.jvm.internal.o.g(lastDataList, "lastDataList");
        this.f255885g = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();
        this.f255884f.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
        eq2.a N6 = N6(i17, i18);
        N6.f255879c = i27;
        N6.f255880d = i28;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(lastDataList);
        N6.f255877a = arrayList;
        java.util.List list = N6.f255878b;
        kotlin.jvm.internal.o.g(list, "<set-?>");
        N6.f255878b = list;
        N6.f255881e = java.lang.System.currentTimeMillis();
        N6.f255882f = dk2Var;
        com.tencent.mars.xlog.Log.i("LiveThemePreloadCacheVM", "[store] tabId=" + i17 + " lastExitPosition=" + i27 + " lastExitFromTopPx=" + i28 + " subTabId=" + i18 + " subTabIndex=" + i19 + " current=" + k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, N6.f255881e / 1000));
    }
}
