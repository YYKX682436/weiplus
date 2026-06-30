package db2;

/* loaded from: classes2.dex */
public final class w3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.u3 f228215t;

    /* renamed from: u, reason: collision with root package name */
    public final int f228216u;

    /* renamed from: v, reason: collision with root package name */
    public final int f228217v;

    /* renamed from: w, reason: collision with root package name */
    public final db2.v3 f228218w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f228219x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.ix2 f228220y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(db2.u3 callback, int i17, int i18, db2.v3 v3Var, com.tencent.mm.protobuf.g gVar, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        java.lang.Object b17;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f228215t = callback;
        this.f228216u = i17;
        this.f228217v = i18;
        this.f228218w = v3Var;
        this.f228219x = z17;
        r45.ix2 ix2Var = new r45.ix2();
        this.f228220y = ix2Var;
        if (i17 == 0 && z17) {
            gm0.j1.u().c().x(hc2.d0.c(i18), null);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(i18), "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            ix2Var.set(1, com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17)));
        } else {
            ix2Var.set(1, gVar);
        }
        ix2Var.set(3, java.lang.Integer.valueOf(i17));
        ix2Var.set(11, java.lang.Integer.valueOf(i18));
        if (i17 == 1 && (i18 == 1 || i18 == 3 || i18 == 4)) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.finder.viewmodel.component.c70.f133974g;
            java.lang.Long l17 = (java.lang.Long) com.tencent.mm.plugin.finder.viewmodel.component.c70.f133974g.remove(java.lang.Integer.valueOf(i18));
            ix2Var.set(15, java.lang.Long.valueOf(l17 == null ? 0L : l17.longValue()));
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderTimelineStream", "[request] tabType=" + i18 + " partialExposedObjectId=" + ix2Var.getLong(15) + " h:" + hashCode());
        }
        pf5.u uVar = pf5.u.f353936a;
        jz5.l P6 = ((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).P6();
        ix2Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        ix2Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        int Q6 = (int) (((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).Q6() / 1000);
        com.tencent.mm.plugin.finder.assist.n3 n3Var = com.tencent.mm.plugin.finder.assist.n3.f102399a;
        r45.fr0 fr0Var = new r45.fr0();
        fr0Var.set(0, java.lang.Float.valueOf(ix2Var.getFloat(5)));
        fr0Var.set(1, java.lang.Float.valueOf(ix2Var.getFloat(6)));
        ix2Var.set(38, java.lang.Integer.valueOf(n3Var.b(fr0Var, 0.0f, null, Q6)));
        db2.t4 t4Var = db2.t4.f228171a;
        ix2Var.set(4, t4Var.b(3901, qt2Var));
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        ix2Var.set(7, Ri != null ? Ri : "");
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().r0(i18);
        if (r07.getLong(0) != 0) {
            ix2Var.set(12, java.lang.Long.valueOf(r07.getLong(0)));
            ix2Var.set(13, r07.getString(1));
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderTimelineStream", "[request] tabType=" + i18 + " request with showInfo. objectId=" + pm0.v.u(ix2Var.getLong(12)) + " h:" + hashCode());
        }
        r45.dx0 n17 = t4Var.n();
        ix2Var.set(9, so2.h3.f410392d.h(i18));
        ix2Var.set(8, n17);
        ix2Var.set(21, zl2.q4.d(zl2.q4.f473933a, null, null, 3, null));
        java.util.LinkedList a17 = com.tencent.mm.plugin.finder.report.l1.I.a(i18);
        if (a17 != null) {
            ix2Var.set(14, a17);
        }
        lVar.f70664a = ix2Var;
        r45.mx2 mx2Var = new r45.mx2();
        mx2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) mx2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = mx2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderstream";
        lVar.f70667d = 3901;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxl CgiFetchFinderTimeline  tabType=");
        sb6.append(i18);
        sb6.append(" init ");
        sb6.append(i17);
        sb6.append(" lastBuffer ");
        sb6.append(ix2Var.getByteString(1) == null);
        sb6.append(", ");
        if (ix2Var.getByteString(1) == null) {
            b17 = '1';
        } else {
            com.tencent.mm.protobuf.g byteString = ix2Var.getByteString(1);
            b17 = com.tencent.mm.sdk.platformtools.w2.b(byteString != null ? byteString.f192156a : null);
        }
        sb6.append(b17);
        sb6.append(" longitude=");
        sb6.append(ix2Var.getFloat(5));
        sb6.append(" latitude=");
        sb6.append(ix2Var.getFloat(6));
        sb6.append(",locTime=");
        sb6.append(ix2Var.getInteger(38));
        sb6.append(", h:");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderTimelineStream", sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x02c6, code lost:
    
        if ((!r7.isEmpty()) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02d4, code lost:
    
        if ((r7.isEmpty() ^ r2) != false) goto L89;
     */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r21, int r22, java.lang.String r23, com.tencent.mm.protobuf.f r24, com.tencent.mm.modelbase.m1 r25) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.w3.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.j
    public boolean y() {
        return true;
    }
}
