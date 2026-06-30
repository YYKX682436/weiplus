package jc2;

/* loaded from: classes8.dex */
public final class f implements jc2.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f298950a;

    public f() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("TLFollow");
        hashSet.add("TLRecommendTab");
        hashSet.add("finder_tl_hot_tab");
        hashSet.add("finder_tl_city_tab");
        this.f298950a = hashSet;
    }

    @Override // jc2.d
    public com.tencent.mm.plugin.finder.extension.reddot.jb a(jc2.c chain) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(chain, "chain");
        jc2.g gVar = (jc2.g) chain;
        boolean qj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).qj();
        r45.vs2 vs2Var = gVar.f298951a;
        if (qj6) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            java.util.LinkedList<r45.f03> linkedList = vs2Var.f388489g;
            if (linkedList != null) {
                for (r45.f03 f03Var : linkedList) {
                    java.util.HashSet hashSet = this.f298950a;
                    if (f03Var == null || (str = f03Var.f373892i) == null) {
                        str = "";
                    }
                    if (hashSet.contains(str)) {
                        java.lang.String str2 = f03Var.f373892i;
                        arrayMap.put(str2 != null ? str2 : "", vs2Var);
                    }
                }
            }
            int intValue = com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "视频号内部收到timeline tab红点丢弃策略", e42.d0.clicfg_finder_tab_red_dot_drop_inner, 0, false, com.tencent.mm.plugin.finder.storage.hi0.f126898d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.N).getValue()).r()).intValue();
            com.tencent.mars.xlog.Log.i("Finder.InnerDropTabRedDotInterceptor", "interceptTabRedDot dropValue:" + intValue);
            int i17 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).f257507m;
            java.util.Iterator it = arrayMap.keySet().iterator();
            if (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                kotlin.jvm.internal.o.d(str3);
                com.tencent.mars.xlog.Log.i("Finder.InnerDropTabRedDotInterceptor", "filter path:" + str3 + " redDotTabType:" + com.tencent.mm.plugin.finder.extension.reddot.ba.b(str3) + " currentTabType:" + i17);
                com.tencent.mm.plugin.finder.extension.reddot.ta.f105879a.a(i17, false, intValue, new jc2.e(this, (r45.vs2) arrayMap.get(str3)));
            }
        }
        if (vs2Var.f388489g.isEmpty()) {
            return null;
        }
        return gVar.a(vs2Var);
    }
}
