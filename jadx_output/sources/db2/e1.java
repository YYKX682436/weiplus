package db2;

/* loaded from: classes2.dex */
public final class e1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.d1 f227952t;

    /* renamed from: u, reason: collision with root package name */
    public final int f227953u;

    /* renamed from: v, reason: collision with root package name */
    public final db2.v3 f227954v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.protobuf.g gVar, db2.d1 callback, int i17, db2.v3 v3Var, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f227952t = callback;
        this.f227953u = i17;
        this.f227954v = v3Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 375;
        r45.y81 y81Var = new r45.y81();
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        y81Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        y81Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        y81Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f228171a;
        y81Var.set(1, t4Var.a(375));
        y81Var.set(5, t4Var.n());
        lVar.f70664a = y81Var;
        lVar.f70665b = new r45.z81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetnearbylist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetNearbyList", "CgiFinderGetNearbyList lat.lng:" + y81Var.getFloat(4) + ", " + y81Var.getFloat(3) + ' ' + i17 + ' ' + gVar);
        com.tencent.mm.plugin.finder.report.v1.t(com.tencent.mm.plugin.finder.report.v1.f125393a, 2, i17, qt2Var, 10L, false, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        ?? r27;
        r45.z81 resp = (r45.z81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int i27 = 2;
        v1Var.h(2, false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] pullType=");
        int i28 = this.f227953u;
        sb6.append(i28);
        sb6.append(" errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetNearbyList", sb6.toString());
        db2.v3 v3Var = this.f227954v;
        if (v3Var != null && v3Var.a(i17, i18, str, resp)) {
            com.tencent.mars.xlog.Log.w("Finder.CgiFinderGetNearbyList", "has consume.");
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<r45.gk2> list = resp.getList(1);
            if (list != null) {
                for (r45.gk2 gk2Var : list) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onCgiBack] pullType=");
                    sb7.append(i28);
                    sb7.append(" type:");
                    r45.xu2 xu2Var = (r45.xu2) gk2Var.getCustom(0);
                    sb7.append(xu2Var != null ? java.lang.Integer.valueOf(xu2Var.getInteger(8)) : null);
                    sb7.append(" t:");
                    r45.xu2 xu2Var2 = (r45.xu2) gk2Var.getCustom(0);
                    sb7.append(xu2Var2 != null ? xu2Var2.getString(0) : null);
                    sb7.append(" desc:");
                    r45.xu2 xu2Var3 = (r45.xu2) gk2Var.getCustom(0);
                    sb7.append(xu2Var3 != null ? xu2Var3.getString(2) : null);
                    sb7.append(' ');
                    sb7.append(hc2.o0.k(gk2Var.getList(1)));
                    com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetNearbyList", sb7.toString());
                    i27 = 2;
                }
            }
            i19 = i27;
        } else {
            i19 = 2;
            v1Var.w(2, this.f16135n);
        }
        eb2.x xVar = (eb2.x) this.f227952t;
        xVar.getClass();
        com.tencent.mm.plugin.finder.feed.model.n2 n2Var = new com.tencent.mm.plugin.finder.feed.model.n2(i17, i18, str);
        if (i17 == 0 && i18 == 0) {
            eb2.b0 b0Var = xVar.f250861a;
            b0Var.f250717i.f250858b = resp.getByteString(i19);
            java.util.LinkedList<r45.gk2> list2 = resp.getList(1);
            if (list2 != null) {
                r27 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (r45.gk2 gk2Var2 : list2) {
                    com.tencent.mm.plugin.finder.feed.im imVar = com.tencent.mm.plugin.finder.feed.im.f107046a;
                    kotlin.jvm.internal.o.d(gk2Var2);
                    r27.add(imVar.a(gk2Var2));
                }
            } else {
                r27 = kz5.p0.f313996d;
            }
            com.tencent.mm.plugin.finder.report.v1.f125393a.a(b0Var.f250715g, r27.size());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("incrementList size: ");
            java.util.List incrementList = n2Var.getIncrementList();
            sb8.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", sb8.toString());
            n2Var.setIncrementList(r27);
            n2Var.setPullType(i28);
            n2Var.setLastBuffer(resp.getByteString(2));
            n2Var.setHasMore(resp.getInteger(3) == 1);
            ((com.tencent.mm.plugin.finder.feed.model.p2) xVar.f250862b).a(n2Var);
        } else {
            n2Var.setHasMore(true);
        }
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetNearbyList", "[onCgiBack] Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, 2, true, null, false, 0L, false, 60, null);
        return super.l();
    }
}
