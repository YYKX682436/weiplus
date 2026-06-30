package xn2;

/* loaded from: classes2.dex */
public final class w extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f455584b;

    public w(xn2.p0 p0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f455583a = p0Var;
        this.f455584b = recyclerView;
    }

    public static final int f(xn2.p0 p0Var) {
        java.util.Iterator it = p0Var.j().getDataListJustForAdapter().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((so2.j5) it.next()) instanceof zn2.a) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return ((java.lang.Number) ((jz5.n) this.f455583a.G).getValue()).floatValue();
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        int i17;
        int i18;
        r45.vx0 vx0Var;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        xn2.p0 p0Var = this.f455583a;
        if (p0Var.f455553k) {
            p0Var.d();
            p0Var.k().c();
            java.util.HashSet hashSet = new java.util.HashSet();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f455584b;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper");
            int w17 = ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper) layoutManager).w();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper");
            int y17 = ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper) layoutManager2).y();
            p0Var.f455565w = java.lang.Math.max(p0Var.f455565w, y17);
            int f17 = f(p0Var);
            p0Var.k().f("ViewIdMainFeed", y17 - f17);
            java.util.HashSet hashSet2 = p0Var.D;
            int i19 = 1;
            boolean z17 = !hashSet2.isEmpty();
            java.util.HashMap hashMap = p0Var.E;
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    jz5.o oVar = (jz5.o) it.next();
                    int intValue = ((java.lang.Number) oVar.f302842e).intValue();
                    java.lang.Object obj = oVar.f302842e;
                    if (intValue < w17 || ((java.lang.Number) obj).intValue() > y17) {
                        if (f17 < 0) {
                            f17 = f(p0Var);
                        }
                        int intValue2 = (((java.lang.Number) obj).intValue() - f17) + i19;
                        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                        zn2.a aVar = (zn2.a) oVar.f302843f;
                        boolean rj6 = ((c61.p2) ybVar).rj(aVar.getFeedObject().getUserName());
                        java.lang.Object obj2 = oVar.f302841d;
                        java.lang.Long l17 = (java.lang.Long) hashMap.get(obj2);
                        if (l17 == null) {
                            l17 = java.lang.Long.valueOf(currentTimeMillis);
                        }
                        kotlin.jvm.internal.o.d(l17);
                        long longValue = currentTimeMillis - l17.longValue();
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[11];
                        i17 = y17;
                        i18 = w17;
                        int i27 = f17;
                        lVarArr[0] = new jz5.l("view_id", "long_video_card");
                        lVarArr[1] = new jz5.l("finder_context_id", p0Var.f455544b);
                        lVarArr[2] = new jz5.l("comment_scene", 281);
                        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(((java.lang.Number) obj2).longValue()));
                        lVarArr[4] = new jz5.l("card_idex", java.lang.Integer.valueOf(intValue2));
                        lVarArr[5] = new jz5.l("refresh_num", java.lang.Integer.valueOf(p0Var.f455552j));
                        r45.ru2 flow_card_recommand_reason = aVar.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
                        lVarArr[6] = new jz5.l("recommend_reason", flow_card_recommand_reason != null ? flow_card_recommand_reason.getString(0) : null);
                        r45.dm2 object_extend = aVar.getFeedObject().getFeedObject().getObject_extend();
                        lVarArr[7] = new jz5.l("collection_id", pm0.v.u((object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? 0L : vx0Var.getLong(0)));
                        lVarArr[8] = new jz5.l("follow_type", java.lang.Integer.valueOf(rj6 ? 1 : 0));
                        lVarArr[9] = new jz5.l("session_buffer", aVar.getFeedObject().getFeedObject().getSessionBuffer());
                        lVarArr[10] = new jz5.l("expose_time_ms", java.lang.Long.valueOf(longValue));
                        ((cy1.a) rVar).yj("view_unexp", null, kz5.c1.k(lVarArr), 1, true);
                        hashSet.add(oVar);
                        f17 = i27;
                    } else {
                        i17 = y17;
                        i18 = w17;
                    }
                    y17 = i17;
                    w17 = i18;
                    i19 = 1;
                }
            }
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                hashMap.remove(((jz5.o) it6.next()).f302841d);
            }
            hashSet2.removeAll(hashSet);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.util.Iterator it7 = exposedHolders.iterator();
            while (it7.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it7.next();
                if (k3Var instanceof in5.s0) {
                    java.lang.Object obj3 = ((in5.s0) k3Var).f293125i;
                    if (obj3 instanceof zn2.a) {
                        zn2.a aVar2 = (zn2.a) obj3;
                        if (!hashMap.containsKey(java.lang.Long.valueOf(aVar2.getItemId()))) {
                            int f18 = f17 < 0 ? f(p0Var) : f17;
                            java.util.Iterator it8 = p0Var.j().getDataListJustForAdapter().iterator();
                            int i28 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i28 = -1;
                                    break;
                                } else {
                                    if (((so2.j5) it8.next()).getItemId() == aVar2.getItemId()) {
                                        break;
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                            int i29 = i28;
                            p0Var.f(aVar2, i29, f18, currentTimeMillis2);
                            if (!p0Var.j().f120893p && p0Var.e() - i29 <= p0Var.j().f120892o) {
                                xn2.a.a(p0Var, false, 1, null);
                            }
                            f17 = f18;
                        }
                    }
                }
            }
        }
    }
}
