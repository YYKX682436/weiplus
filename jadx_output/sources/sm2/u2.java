package sm2;

/* loaded from: classes3.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(sm2.o4 o4Var) {
        super(7);
        this.f409733d = o4Var;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        java.lang.Class cls;
        dk2.xf g17;
        km2.m data;
        com.tencent.mm.live.api.LiveConfig liveConfig;
        fm2.a aVar;
        int i17;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        long j17;
        kn0.i iVar;
        kn0.g gVar;
        r45.vz1 vz1Var;
        r45.vz1 vz1Var2;
        fy2.d dVar;
        kn0.i iVar2;
        kn0.g gVar2;
        r45.nw1 nw1Var;
        java.util.LinkedList list3;
        java.lang.Object obj8;
        java.util.LinkedList list4;
        java.util.LinkedList list5;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        kn0.g liveRoomInfo = (kn0.g) obj5;
        com.tencent.trtc.TRTCCloudDef.TRTCParams trtcParams = (com.tencent.trtc.TRTCCloudDef.TRTCParams) obj6;
        r45.hc1 resp = (r45.hc1) obj7;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(liveRoomInfo, "liveRoomInfo");
        kotlin.jvm.internal.o.g(trtcParams, "trtcParams");
        kotlin.jvm.internal.o.g(resp, "resp");
        boolean z17 = ((mm2.t2) this.f409733d.c(mm2.t2.class)).f329428g;
        boolean h86 = ((mm2.c1) this.f409733d.c(mm2.c1.class)).h8();
        java.lang.String str = this.f409733d.f409610f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinLive success:");
        sb6.append(booleanValue);
        sb6.append(", errCode:");
        sb6.append(intValue);
        sb6.append(" isDestroyed:");
        fm2.a aVar2 = this.f409733d.f19595c;
        sb6.append(aVar2 != null ? java.lang.Boolean.valueOf(aVar2.isDestroyed()) : null);
        sb6.append(" cliBuff:");
        sb6.append(resp.getString(17));
        sb6.append(", isVerifying:");
        sb6.append(z17);
        sb6.append(", isMinGameLive:");
        sb6.append(h86);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        fm2.a aVar3 = this.f409733d.f19595c;
        if ((aVar3 != null && aVar3.isDestroyed()) && !z17) {
            if (h86 && !booleanValue) {
                sm2.o4 o4Var = this.f409733d;
                o4Var.getClass();
                switch (intValue) {
                    case -200018:
                    case -200017:
                    case -200013:
                        dk2.ef.f233372a.I(intValue, (r45.qp1) resp.getCustom(25));
                        break;
                    default:
                        com.tencent.mars.xlog.Log.i(o4Var.f409610f, "handleJoinRespErrorForMinGameLive unhandled errCode:" + intValue + '.');
                        break;
                }
            }
        } else {
            sm2.o4 o4Var2 = this.f409733d;
            o4Var2.getClass();
            if (booleanValue) {
                int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (netType != 0 && netType != -1) {
                    pm0.v.X(new sm2.p(o4Var2));
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).aj(((mm2.c1) o4Var2.c(mm2.c1.class)).f328852o, ((mm2.e1) o4Var2.c(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) o4Var2.c(mm2.e1.class)).f328983m);
                ((ku5.t0) ku5.t0.f312615d).h(new dk2.ig(((mm2.e1) o4Var2.c(mm2.e1.class)).f328988r.getLong(0)), "Finder.LiveExceptionMonitor");
                if (zl2.r4.f473950a.w1()) {
                    boolean z18 = resp.getInteger(23) != 1;
                    boolean N6 = ((mm2.f6) o4Var2.c(mm2.f6.class)).N6();
                    com.tencent.mars.xlog.Log.i(o4Var2.f409610f, "handleJoinLiveWxshopResponse haveBindShop:" + N6 + ", shopping_not_available:" + resp.getInteger(23) + ", canShowShopEntrance:" + z18);
                    if (z18) {
                        if (!N6) {
                            ((mm2.f6) o4Var2.c(mm2.f6.class)).U6(true);
                            i95.m c17 = i95.n0.c(c61.yb.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            c61.yb.t2((c61.yb) c17, 14, null, 2, null);
                        }
                        if (o4Var2.f409637w == null) {
                            o4Var2.A(((mm2.f6) o4Var2.c(mm2.f6.class)).N6());
                        }
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.on1 on1Var = (r45.on1) resp.getCustom(29);
                java.util.LinkedList list6 = on1Var != null ? on1Var.getList(0) : null;
                boolean z19 = list6 == null || list6.isEmpty();
                java.lang.String str2 = o4Var2.f409610f;
                if (z19) {
                    cls = mm2.c1.class;
                    r45.be1 be1Var = (r45.be1) resp.getCustom(19);
                    java.util.LinkedList list7 = be1Var != null ? be1Var.getList(0) : null;
                    if (list7 == null || list7.isEmpty()) {
                        com.tencent.mars.xlog.Log.i(str2, "handleCheerIconsInfo skip, no custom cheer info.");
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleCheerIconsInfo custom ad cheer info:");
                        r45.be1 be1Var2 = (r45.be1) resp.getCustom(19);
                        sb7.append((be1Var2 == null || (list2 = be1Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
                        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
                        r45.be1 be1Var3 = (r45.be1) resp.getCustom(19);
                        if (be1Var3 != null && (list = be1Var3.getList(0)) != null) {
                            linkedList.addAll(list);
                            ((mm2.c1) o4Var2.c(cls)).E3.f329472e = 1;
                            i17 = 1;
                        }
                    }
                    i17 = 0;
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleCheerIconsInfo custom cheer info:");
                    r45.on1 on1Var2 = (r45.on1) resp.getCustom(29);
                    sb8.append((on1Var2 == null || (list5 = on1Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list5.size()));
                    com.tencent.mars.xlog.Log.i(str2, sb8.toString());
                    r45.on1 on1Var3 = (r45.on1) resp.getCustom(29);
                    if (on1Var3 == null || (list4 = on1Var3.getList(0)) == null) {
                        cls = mm2.c1.class;
                        i17 = 0;
                    } else {
                        linkedList.addAll(list4);
                        r45.on1 on1Var4 = (r45.on1) resp.getCustom(29);
                        if (on1Var4 != null) {
                            i17 = on1Var4.getInteger(2);
                            cls = mm2.c1.class;
                        } else {
                            cls = mm2.c1.class;
                            i17 = 0;
                        }
                        ((mm2.c1) o4Var2.c(cls)).E3.f329472e = 0;
                    }
                    r45.on1 on1Var5 = (r45.on1) resp.getCustom(29);
                    if (on1Var5 != null) {
                        ((mm2.c1) o4Var2.c(cls)).F3 = new mm2.w0(on1Var5.getString(4), on1Var5.getInteger(5));
                    }
                }
                mm2.c1 c1Var = (mm2.c1) o4Var2.c(cls);
                r45.on1 on1Var6 = (r45.on1) resp.getCustom(29);
                c1Var.P9(linkedList, on1Var6 != null ? on1Var6.getString(1) : null, i17);
                mm2.l0 l0Var = (mm2.l0) o4Var2.c(mm2.l0.class);
                r45.on1 on1Var7 = (r45.on1) resp.getCustom(29);
                mm2.i0 i0Var = new mm2.i0(linkedList, on1Var7 != null ? on1Var7.getString(1) : null, i17);
                r45.on1 on1Var8 = (r45.on1) resp.getCustom(29);
                l0Var.O6(i0Var, on1Var8 != null ? on1Var8.getList(3) : null);
                com.tencent.mm.plugin.finder.live.plugin.ow owVar = o4Var2.f409635u;
                if (owVar != null) {
                    owVar.I1(((mm2.c1) o4Var2.c(cls)).E3.f329469b);
                }
                com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = o4Var2.f409639y;
                if (v6Var != null) {
                    v6Var.u1(((mm2.c1) o4Var2.c(cls)).E3.f329470c);
                }
                r45.ic1 ic1Var = (r45.ic1) resp.getCustom(85);
                if (ic1Var != null && (list3 = ic1Var.getList(14)) != null) {
                    mm2.e1 e1Var = (mm2.e1) o4Var2.c(mm2.e1.class);
                    ae2.in inVar = ae2.in.f3688a;
                    if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3895u7).getValue()).r()).booleanValue()) {
                        java.util.Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj8 = null;
                                break;
                            }
                            obj8 = it.next();
                            if (((r45.p12) obj8).getInteger(0) == 2) {
                                break;
                            }
                        }
                        r45.p12 p12Var = (r45.p12) obj8;
                        if (p12Var != null) {
                            int integer = p12Var.getInteger(3);
                            java.util.regex.Pattern pattern = pm0.v.f356802a;
                            p12Var.set(3, java.lang.Integer.valueOf(integer & (-9)));
                        }
                    }
                    e1Var.G = list3;
                }
                ((mm2.c1) o4Var2.c(cls)).f328803f4.f309049a.clear();
                ((mm2.c1) o4Var2.c(cls)).f328803f4.f309049a.addAll(resp.getList(18));
                ((mm2.c1) o4Var2.c(cls)).f328803f4.f309050b = resp.getString(17);
                ((mm2.c1) o4Var2.c(cls)).Q8(true);
                r45.ud2 ud2Var = (r45.ud2) resp.getCustom(81);
                int integer2 = ud2Var != null ? ud2Var.getInteger(2) : 0;
                if (dk2.ef.f233384g && !((mm2.c1) o4Var2.c(cls)).Y4 && dk2.ef.f233376c == 0 && integer2 > 0) {
                    dk2.ef.f233376c = integer2;
                    com.tencent.mars.xlog.Log.i(o4Var2.f409610f, "handleJoinResp restore selectedVideoQualityLevel:" + integer2);
                }
                if (((mm2.e1) o4Var2.c(mm2.e1.class)).f328990t == null) {
                    ((mm2.e1) o4Var2.c(mm2.e1.class)).o7(new kn0.i(trtcParams, liveRoomInfo, new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
                } else {
                    kn0.i iVar3 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f328990t;
                    if (iVar3 != null) {
                        iVar3.f309557a = trtcParams;
                    }
                    kn0.i iVar4 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f328990t;
                    if (iVar4 != null) {
                        iVar4.f309558b = liveRoomInfo;
                    }
                    kn0.i iVar5 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f328990t;
                    if (iVar5 != null) {
                        iVar5.f309559c = new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI");
                    }
                }
                kn0.i iVar6 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f328990t;
                if (iVar6 != null) {
                    iVar6.f309561e = java.lang.Long.valueOf(((mm2.e1) o4Var2.c(mm2.e1.class)).f328983m);
                }
                kn0.i iVar7 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f328990t;
                if (iVar7 != null) {
                    in0.q qVar = o4Var2.f19597e;
                    if (qVar != null) {
                        hn0.h.f(qVar, iVar7, false, ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3794k5).getValue()).r()).intValue() == 0, 2, null);
                    }
                    com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.f102579y.f102540b, null, false, false, 14, null);
                    zl2.r4.f473950a.d3(o4Var2.f19597e);
                    in0.q qVar2 = o4Var2.f19597e;
                    if (qVar2 != null) {
                        qVar2.E(new sm2.e0(o4Var2, resp));
                    }
                }
                fm2.a aVar4 = o4Var2.f19595c;
                if (aVar4 != null) {
                    zl2.r4.f473950a.E2(o4Var2.f19609a, aVar4);
                }
                gk2.e eVar = gk2.e.f272471n;
                if (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) {
                    in0.q qVar3 = o4Var2.f19597e;
                    j17 = (qVar3 == null || (iVar = qVar3.C) == null || (gVar = iVar.f309558b) == null) ? -1L : gVar.f309535b;
                } else {
                    j17 = nw1Var.getLong(0);
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                ml2.k5 k5Var = y4Var.T;
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String q17 = b52.b.q(j17);
                kotlin.jvm.internal.o.f(q17, "long2UnsignedString(...)");
                k5Var.getClass();
                k5Var.f327654a = q17;
                gk2.e eVar2 = gk2.e.f272471n;
                long j18 = ((mm2.e1) (eVar2 != null ? eVar2.a(mm2.e1.class) : o4Var2.c(mm2.e1.class))).f328983m;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.k5 k5Var2 = y4Var.T;
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String q18 = b52.b.q(j18);
                kotlin.jvm.internal.o.f(q18, "long2UnsignedString(...)");
                k5Var2.getClass();
                k5Var2.f327655b = q18;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                y4Var.T.f327657d = java.lang.System.currentTimeMillis();
                m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
                int integer3 = I1 != null ? I1.u0().getInteger(20) : 0;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                y4Var.T.f327659f = integer3;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                in0.q qVar4 = o4Var2.f19597e;
                jSONObject.put("liveid", (qVar4 == null || (iVar2 = qVar4.C) == null || (gVar2 = iVar2.f309558b) == null) ? -1L : gVar2.f309535b);
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j19 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f328983m;
                ((m30.m) rVar).getClass();
                jSONObject.put("feedid", b52.b.q(j19));
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var2 = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 12L, jSONObject.toString(), null, 4, null);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).nj(ml2.w1.f328175e);
                com.tencent.mm.plugin.finder.assist.u8.f102602d = c01.id.a();
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                java.lang.String valueOf = java.lang.String.valueOf(((mm2.e1) o4Var2.c(mm2.e1.class)).f328988r.getLong(0));
                long j27 = ((mm2.c1) o4Var2.c(cls)).Y4 ? 4L : 1L;
                ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) o4Var2.c(cls)).f328852o);
                j0Var.Rj(valueOf, j27, b17 != null ? b17.w0() : null, true);
                pm0.v.V(200L, new sm2.f0(o4Var2));
                fm2.a aVar5 = o4Var2.f19595c;
                if (aVar5 != null) {
                    r45.nw1 nw1Var2 = (r45.nw1) resp.getCustom(3);
                    aVar5.processFinderLiveLayerShowInfo(nw1Var2 != null ? (r45.jy1) nw1Var2.getCustom(25) : null);
                }
                i95.m c19 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                zy2.zb.I8((zy2.zb) c19, ml2.u1.f328040e, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
                fm2.a aVar6 = o4Var2.f19595c;
                if (aVar6 != null && (dVar = (fy2.d) aVar6.business(fy2.d.class)) != null) {
                    dVar.Q6(new sm2.l(o4Var2));
                }
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = o4Var2.N;
                if (c4Var != null) {
                    c4Var.G1();
                }
                mm2.c1 c1Var3 = (mm2.c1) o4Var2.c(cls);
                r45.gw0 gw0Var = (r45.gw0) resp.getCustom(24);
                c1Var3.f328882s5 = gw0Var != null ? gw0Var.getString(1) : null;
                ((je2.g) o4Var2.c(je2.g.class)).O6();
                zl2.r4.f473950a.u(o4Var2.f19594b, o4Var2.f19609a, o4Var2.f19595c);
                mm2.o4 o4Var3 = (mm2.o4) o4Var2.c(mm2.o4.class);
                r45.wz1 wz1Var = (r45.wz1) resp.getCustom(4);
                o4Var3.f329334y1 = (wz1Var == null || (vz1Var2 = (r45.vz1) wz1Var.getCustom(15)) == null) ? 0 : vz1Var2.getInteger(2);
                mm2.o4 o4Var4 = (mm2.o4) o4Var2.c(mm2.o4.class);
                r45.wz1 wz1Var2 = (r45.wz1) resp.getCustom(4);
                o4Var4.f329336z1 = (wz1Var2 == null || (vz1Var = (r45.vz1) wz1Var2.getCustom(15)) == null) ? 0 : vz1Var.getInteger(3);
            } else {
                cls = mm2.c1.class;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null && (data = k0Var.getData()) != null && (liveConfig = data.f309129d) != null) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).aj(liveConfig.f68542m, liveConfig.f68537e, liveConfig.f68549s);
                }
                com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
                java.lang.String str3 = com.tencent.mm.plugin.finder.assist.t8.f102578x.f102540b;
                r45.l84 l84Var = new r45.l84();
                l84Var.set(1, java.lang.Integer.valueOf(intValue));
                l84Var.set(2, errMsg);
                com.tencent.mm.plugin.finder.assist.p8.c(p8Var, str3, hc2.b.a(l84Var), false, true, 4, null);
                if (intValue != -100038 && (g17 = o4Var2.g()) != null) {
                    dk2.xf.f(g17, 0, new sm2.g0(o4Var2), 1, null);
                }
                o4Var2.z(intValue2, intValue, errMsg, null, (r45.qp1) resp.getCustom(25));
            }
            sm2.o4 o4Var5 = this.f409733d;
            o4Var5.getClass();
            pm0.v.X(new sm2.s3(o4Var5));
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.A3).getValue()).r()).booleanValue() && (aVar = this.f409733d.f19595c) != null) {
                aVar.postDelayed(sm2.s2.f409692d, 3000L);
            }
            if (!((mm2.e1) this.f409733d.c(mm2.e1.class)).g7()) {
                if (pm0.v.z((int) ((mm2.c1) this.f409733d.c(cls)).f328866q, 8192)) {
                    ((mm2.g1) this.f409733d.c(mm2.g1.class)).W6(1);
                } else {
                    ((mm2.g1) this.f409733d.c(mm2.g1.class)).W6(0);
                }
            }
            if (((mm2.e1) this.f409733d.c(mm2.e1.class)).Y6()) {
                pm0.v.X(new sm2.t2(this.f409733d));
            }
        }
        return jz5.f0.f302826a;
    }
}
