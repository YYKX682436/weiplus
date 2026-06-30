package ey2;

/* loaded from: classes2.dex */
public final class c3 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257333e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257334f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257335g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f257336h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f257337i = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();

    public c3() {
        jz5.h.b(ey2.b3.f257327d);
    }

    public static void S6(ey2.c3 c3Var, int i17, int i18, int i19, java.util.ArrayList lastDataList, java.util.ArrayList lastSectionDataList, com.tencent.mm.protobuf.g gVar, boolean z17, int i27, r45.ha2 ha2Var, int i28, java.lang.Object obj) {
        if ((i28 & 16) != 0) {
            lastSectionDataList = new java.util.ArrayList();
        }
        if ((i28 & 32) != 0) {
            gVar = null;
        }
        if ((i28 & 64) != 0) {
            z17 = false;
        }
        if ((i28 & 128) != 0) {
            i27 = 0;
        }
        if ((i28 & 256) != 0) {
            ha2Var = null;
        }
        c3Var.getClass();
        kotlin.jvm.internal.o.g(lastDataList, "lastDataList");
        kotlin.jvm.internal.o.g(lastSectionDataList, "lastSectionDataList");
        c3Var.f257337i = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();
        java.util.Iterator it = lastDataList.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).T0();
            }
        }
        ey2.x2 O6 = c3Var.O6(i17);
        O6.f257570c = i18;
        O6.f257571d = i19;
        O6.f257569b = lastDataList;
        O6.f257573f = (lastDataList.isEmpty() && lastSectionDataList.isEmpty()) ? ey2.z2.f257599e : ey2.z2.f257598d;
        O6.f257574g = gVar;
        O6.f257575h = z17;
        O6.f257576i = i27;
        O6.f257577j = ha2Var;
        com.tencent.mars.xlog.Log.i("NearbyLivePreloadCacheVM", "[store] tabType=" + i17 + " lastExitPosition=" + i18 + " lastExitFromTopPx=" + i19 + " refreshState=" + O6.f257573f + " subTabId:" + i27 + "asyncLoadInfoConfig: " + ha2Var + " current=" + k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, O6.f257572e / 1000));
    }

    public final java.lang.String N6(r45.dd2 dd2Var, r45.dd2 dd2Var2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : "");
        sb6.append('_');
        sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.getInteger(0)) : "");
        return sb6.toString();
    }

    public final ey2.x2 O6(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f257333e;
        if (concurrentHashMap.get(valueOf) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new ey2.x2(i17));
        }
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.d(obj);
        return (ey2.x2) obj;
    }

    public final ey2.y2 P6(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f257334f;
        if (concurrentHashMap.get(java.lang.Integer.valueOf(i17)) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new ey2.y2(i17));
        }
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.d(obj);
        return (ey2.y2) obj;
    }

    public final boolean Q6(int i17) {
        ey2.x2 O6 = O6(i17);
        ey2.z2 z2Var = O6.f257573f;
        com.tencent.mars.xlog.Log.i("NearbyLivePreloadCacheVM", "isAutoRefresh " + z2Var + " tabType: " + i17);
        if (z2Var == ey2.z2.f257599e) {
            return true;
        }
        if (z2Var == ey2.z2.f257598d || z2Var == ey2.z2.f257601g) {
            if (java.lang.System.currentTimeMillis() - O6.f257572e > this.f257337i) {
                O6.f257573f = ey2.z2.f257600f;
                return true;
            }
        } else if (z2Var == ey2.z2.f257600f) {
            return true;
        }
        O6.f257573f = ey2.z2.f257601g;
        return false;
    }

    public final void R6(int i17) {
        ey2.x2 O6 = O6(i17);
        O6.f257573f = ey2.z2.f257598d;
        O6.f257572e = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("NearbyLivePreloadCacheVM", "[markUnFocusTabType] tabType=" + i17);
    }
}
