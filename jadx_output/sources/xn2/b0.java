package xn2;

/* loaded from: classes2.dex */
public final class b0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455476g;

    public b0(xn2.p0 p0Var) {
        this.f455476g = p0Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof ec2.f) || (event instanceof fc2.t) || (event instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.d1);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        xn2.p0 p0Var = this.f455476g;
        if (z17) {
            fc2.t tVar = (fc2.t) ev6;
            if (tVar.f260985d != 6 || p0Var.f455551i == tVar.f260992k) {
                return;
            }
            com.tencent.mars.xlog.Log.i(p0Var.f455545c, "lastCenterFeedId=" + pm0.v.u(p0Var.f455551i) + ", new centerFeedId=" + pm0.v.u(tVar.f260992k));
            p0Var.f455551i = tVar.f260992k;
            ao2.a k17 = p0Var.k();
            k17.getClass();
            qg3.w wVar = k17.f12543l;
            if (wVar != null) {
                urgen.ur_54A4.UR_720C.UR_A58C(((qg3.x) wVar).getCppPointer(), 7, "ViewIdMainFeed");
                return;
            }
            return;
        }
        if (!(ev6 instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.d1)) {
            if (ev6 instanceof ec2.f) {
                if (vn2.u0.f438387a.g()) {
                    ec2.f fVar = (ec2.f) ev6;
                    int i17 = fVar.f250959d;
                    if (i17 == 4) {
                        ao2.a k18 = p0Var.k();
                        long j17 = fVar.f250965j;
                        if (!k18.f12536e && k18.f12535d && !k18.f12537f) {
                            k18.f12537f = true;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            k18.f12539h = currentTimeMillis;
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 4, java.lang.Integer.valueOf(k18.f12533b), java.lang.Long.valueOf(currentTimeMillis - k18.f12541j), 1, java.lang.Long.valueOf(k18.f12532a), java.lang.Integer.valueOf(k18.f12540i), pm0.v.u(j17));
                        }
                    } else if (i17 == 18) {
                        ao2.a k19 = p0Var.k();
                        long j18 = fVar.f250965j;
                        if (!k19.f12536e && k19.f12535d) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 6, java.lang.Integer.valueOf(k19.f12533b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - k19.f12539h), 1, java.lang.Long.valueOf(k19.f12532a), java.lang.Integer.valueOf(k19.f12540i), pm0.v.u(j18));
                        }
                    } else if (i17 == 19) {
                        ao2.a k27 = p0Var.k();
                        long j19 = fVar.f250965j;
                        if (!k27.f12536e && k27.f12535d && !k27.f12538g) {
                            k27.f12538g = true;
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 5, java.lang.Integer.valueOf(k27.f12533b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - k27.f12539h), 1, java.lang.Long.valueOf(k27.f12532a), java.lang.Integer.valueOf(k27.f12540i), pm0.v.u(j19));
                        }
                    }
                }
                ec2.f fVar2 = (ec2.f) ev6;
                if (fVar2.f250959d == 12) {
                    com.tencent.mars.xlog.Log.i(p0Var.f455545c, pm0.v.u(fVar2.f250965j).concat(" auto play"));
                    ao2.a k28 = p0Var.k();
                    k28.getClass();
                    qg3.w wVar2 = k28.f12543l;
                    if (wVar2 != null) {
                        urgen.ur_54A4.UR_720C.UR_A58C(((qg3.x) wVar2).getCppPointer(), 8, "ViewIdMainFeed");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String str = p0Var.f455545c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type=");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.d1 d1Var = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.d1) ev6;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c1 c1Var = d1Var.f120919e;
        sb6.append(c1Var);
        sb6.append(" SeeLaterFeedId=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = d1Var.f120918d;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (c1Var == com.tencent.mm.plugin.finder.megavideo.topstory.flow.c1.f120908d) {
            zn2.a aVar = baseFinderFeed instanceof zn2.a ? (zn2.a) baseFinderFeed : null;
            if (aVar != null) {
                bo2.c cVar = (bo2.c) cu2.u.f222441a.o(aVar.getFeedObject(), 11003);
                vn2.u0 u0Var = vn2.u0.f438387a;
                r45.dm2 object_extend = cVar.getFeedObject().getFeedObject().getObject_extend();
                r45.yu2 yu2Var = object_extend != null ? (r45.yu2) object_extend.getCustom(35) : null;
                if (yu2Var == null) {
                    yu2Var = new r45.yu2();
                }
                if (yu2Var.getInteger(1) <= 0) {
                    java.lang.Number valueOf = java.lang.Integer.valueOf(c01.id.e());
                    if (!(valueOf.intValue() > 0)) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
                    }
                    yu2Var.set(1, java.lang.Integer.valueOf(valueOf.intValue()));
                }
                r45.dm2 object_extend2 = cVar.getFeedObject().getFeedObject().getObject_extend();
                if (object_extend2 != null) {
                    object_extend2.set(35, yu2Var);
                }
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 c17 = p0Var.j().c();
                c17.getClass();
                if (c17.d().isEmpty()) {
                    c17.d().add(cVar);
                } else {
                    java.util.List d17 = c17.d();
                    kotlin.jvm.internal.o.f(d17, "<get-seeLaterDetailList>(...)");
                    pm0.v.I(d17, new com.tencent.mm.plugin.finder.megavideo.topstory.flow.b0(cVar));
                    c17.d().add(0, cVar);
                }
                c17.e(3);
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 c18 = p0Var.j().c();
                xn2.b bVar = p0Var.f455547e;
                c18.b(aVar, bVar != null ? ((xn2.f1) bVar).a() : null);
            }
        }
    }
}
