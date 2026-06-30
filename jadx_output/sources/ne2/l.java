package ne2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final ne2.l f336545a = new ne2.l();

    public static r45.q84 b(ne2.l lVar, long j17, r45.td2 td2Var, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 1;
        }
        rl2.d dVar = (rl2.d) lVar.c();
        if (!dVar.f397190f) {
            dVar.z0();
        }
        rl2.c cVar = (rl2.c) dVar.f397191g.get(java.lang.Long.valueOf(j17));
        int i19 = cVar != null ? cVar.f397186c : -1;
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "selectReplayChargeInfo liveId:" + j17 + ",time:" + i19 + ",cache size:" + dVar.f397191g.size());
        ne2.c cVar2 = ne2.c.f336527a;
        int j18 = ((java.lang.Boolean) ((jz5.n) ne2.c.f336528b).getValue()).booleanValue() ? 180 : cm2.a.f43328a.j(td2Var, i17);
        r45.q84 q84Var = new r45.q84();
        q84Var.set(0, java.lang.Integer.valueOf(i17));
        int i27 = j18 - i19;
        if (i27 < 0) {
            i27 = 0;
        }
        q84Var.set(1, java.lang.Integer.valueOf(i27));
        q84Var.set(2, java.lang.Integer.valueOf(j18));
        q84Var.set(3, 0);
        ne2.l lVar2 = f336545a;
        q84Var.set(4, java.lang.Boolean.valueOf(lVar2.c().y0(j17)));
        q84Var.set(5, java.lang.Boolean.valueOf(lVar2.c().D0(j17)));
        return q84Var;
    }

    public final r45.q84 a(long j17, r45.td2 td2Var) {
        ne2.l lVar = f336545a;
        if (td2Var == null) {
            r45.q84 q84Var = new r45.q84();
            q84Var.set(0, 1);
            q84Var.set(1, 0);
            q84Var.set(2, 0);
            q84Var.set(3, 0);
            q84Var.set(4, java.lang.Boolean.valueOf(lVar.c().y0(j17)));
            q84Var.set(5, java.lang.Boolean.valueOf(lVar.c().D0(j17)));
            return q84Var;
        }
        cm2.a aVar = cm2.a.f43328a;
        int i17 = td2Var.getInteger(3) > 0 ? 2 : 1;
        int j18 = aVar.j(td2Var, i17);
        if (i17 != 1) {
            r45.q84 q84Var2 = new r45.q84();
            q84Var2.set(0, java.lang.Integer.valueOf(i17));
            q84Var2.set(1, java.lang.Integer.valueOf(j18));
            q84Var2.set(2, java.lang.Integer.valueOf(j18));
            q84Var2.set(3, java.lang.Integer.valueOf(td2Var.getInteger(3)));
            q84Var2.set(4, java.lang.Boolean.valueOf(lVar.c().y0(j17)));
            q84Var2.set(5, java.lang.Boolean.valueOf(lVar.c().D0(j17)));
            return q84Var2;
        }
        rl2.d dVar = (rl2.d) lVar.c();
        if (!dVar.f397190f) {
            dVar.z0();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "selectLiveChargeInfo " + dVar.f397191g.get(java.lang.Long.valueOf(j17)));
        rl2.c cVar = (rl2.c) dVar.f397191g.get(java.lang.Long.valueOf(j17));
        int i18 = cVar != null ? cVar.f397185b : 0;
        r45.q84 q84Var3 = new r45.q84();
        q84Var3.set(0, java.lang.Integer.valueOf(i17));
        int i19 = j18 - i18;
        q84Var3.set(1, java.lang.Integer.valueOf(i19 >= 0 ? i19 : 0));
        q84Var3.set(2, java.lang.Integer.valueOf(j18));
        q84Var3.set(3, 0);
        q84Var3.set(4, java.lang.Boolean.valueOf(lVar.c().y0(j17)));
        q84Var3.set(5, java.lang.Boolean.valueOf(lVar.c().D0(j17)));
        return q84Var3;
    }

    public final be2.c c() {
        return ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj();
    }
}
