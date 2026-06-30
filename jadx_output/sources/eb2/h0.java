package eb2;

/* loaded from: classes2.dex */
public final class h0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f250765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f250766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f250767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f250768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f250769e;

    public h0(eb2.m0 m0Var, db2.v3 v3Var, com.tencent.mm.plugin.finder.feed.model.e eVar, int i17, db2.n3 n3Var) {
        this.f250765a = m0Var;
        this.f250766b = v3Var;
        this.f250767c = eVar;
        this.f250768d = i17;
        this.f250769e = n3Var;
    }

    @Override // db2.d3
    public boolean isBeginHistory() {
        return this.f250765a.f250828p;
    }

    @Override // db2.d3
    public boolean isResultConsume(int i17, int i18, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        db2.v3 v3Var = this.f250766b;
        if (v3Var != null) {
            return v3Var.a(i17, i18, null, resp);
        }
        return false;
    }

    @Override // db2.d3
    public void onBuildRequest(db2.b3 request) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.Long l17;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(request, "request");
        eb2.m0 m0Var = this.f250765a;
        eb2.f0 f0Var = m0Var.f250824i;
        if (f0Var != null && (obj2 = f0Var.f250743b) != null) {
            request.set(17, obj2);
        }
        eb2.f0 f0Var2 = m0Var.f250824i;
        if (f0Var2 != null && (l17 = f0Var2.f250742a) != null) {
            request.set(25, java.lang.Long.valueOf(l17.longValue()));
        }
        if (f0Var2 != null && (obj = f0Var2.f250744c) != null) {
            request.set(20, obj);
        }
        com.tencent.mm.plugin.finder.feed.model.e eVar = this.f250767c;
        java.lang.Integer num = eVar != null ? eVar.f107815a : null;
        com.tencent.mm.protobuf.g gVar = eVar != null ? eVar.f107816b : null;
        java.lang.String str3 = m0Var.f250833u;
        if (num != null && gVar != null) {
            int intValue = num.intValue();
            r45.gy0 gy0Var = new r45.gy0();
            gy0Var.set(0, java.lang.Integer.valueOf(intValue));
            gy0Var.set(1, gVar);
            request.set(29, gy0Var);
            com.tencent.mars.xlog.Log.i(str3, "byPassInfoType=" + intValue + " byPassInfo=" + new java.lang.String(gVar.g(), r26.c.f368865a));
        }
        if (m0Var.f250827o == 1) {
            r45.hx2 hx2Var = new r45.hx2();
            hx2Var.set(0, java.lang.Long.valueOf(f0Var2 != null ? f0Var2.f250745d : 0L));
            if (f0Var2 == null || (str2 = f0Var2.f250746e) == null) {
                str2 = "";
            }
            hx2Var.set(1, str2);
            hx2Var.set(2, java.lang.Integer.valueOf(f0Var2 != null ? f0Var2.f250751j : 0));
            com.tencent.mars.xlog.Log.i(str3, "related_info=".concat(pm0.v.u(hx2Var.getLong(0))));
            request.set(32, hx2Var);
        }
        if ((f0Var2 != null ? f0Var2.f250747f : 0) > 0) {
            java.util.LinkedList list = request.getList(26);
            r45.qx2 qx2Var = new r45.qx2();
            java.util.LinkedList list2 = qx2Var.getList(0);
            r45.xx4 xx4Var = new r45.xx4();
            xx4Var.set(0, java.lang.Long.valueOf(f0Var2 != null ? f0Var2.f250745d : 0L));
            if (f0Var2 == null || (str = f0Var2.f250746e) == null) {
                str = "";
            }
            xx4Var.set(1, str);
            com.tencent.mars.xlog.Log.i(str3, "top_objects=".concat(pm0.v.u(xx4Var.getLong(0))));
            list2.add(xx4Var);
            qx2Var.set(1, java.lang.Integer.valueOf(f0Var2 != null ? f0Var2.f250747f : 0));
            list.add(qx2Var);
        }
        int i17 = this.f250768d;
        if (i17 == 0 || i17 == 1) {
            r45.nx2 nx2Var = new r45.nx2();
            ey2.t0 t0Var = m0Var.f250829q;
            nx2Var.set(5, java.lang.Integer.valueOf(t0Var.f257506i.getInteger(5)));
            nx2Var.set(4, java.lang.Integer.valueOf(t0Var.f257506i.getInteger(4)));
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            nx2Var.set(3, java.lang.Boolean.valueOf(nk6.L0("TLRecommendTab") != null));
            nx2Var.set(2, java.lang.Boolean.valueOf(nk6.L0("TLFollow") != null));
            nx2Var.set(1, java.lang.Boolean.valueOf(nk6.L0("finder_tl_hot_tab") != null));
            nx2Var.set(6, java.lang.Integer.valueOf(f0Var2 != null && f0Var2.f250748g ? 0 : this.f250769e.f228079d));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBuildRequest] FinderStream, from_tab_type = ");
            sb6.append(nx2Var.getInteger(6));
            sb6.append(", requestArgs?.isFirstEnterFetch = ");
            sb6.append(f0Var2 != null ? java.lang.Boolean.valueOf(f0Var2.f250748g) : null);
            com.tencent.mars.xlog.Log.i(str3, sb6.toString());
            request.set(30, nx2Var);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onBuildRequest] FinderStream scene_status=");
            r45.nx2 nx2Var2 = (r45.nx2) request.getCustom(30);
            sb7.append(nx2Var2 != null ? pm0.b0.b(nx2Var2) : null);
            com.tencent.mars.xlog.Log.i(str3, sb7.toString());
        }
        if (f0Var2 != null) {
            f0Var2.f250742a = null;
            f0Var2.f250743b = null;
            f0Var2.f250744c = null;
            f0Var2.f250745d = 0L;
            f0Var2.f250746e = "";
            f0Var2.f250747f = 0;
        }
    }

    @Override // db2.d3
    public void onLoadFinish() {
        this.f250765a.f250831s = false;
    }
}
