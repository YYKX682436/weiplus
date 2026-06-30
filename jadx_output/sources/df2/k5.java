package df2;

/* loaded from: classes3.dex */
public final class k5 extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(kn0.r rVar, int i17) {
        boolean z17;
        r45.nw1 nw1Var;
        hn0.r rVar2;
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayerController", "switchStream selectQualityCfg: " + i17);
        if (rVar != null) {
            co0.s u07 = dk2.ef.f233372a.u0();
            if (u07 == null || (rVar2 = u07.R1) == null) {
                z17 = false;
            } else {
                je2.z zVar = (je2.z) business(je2.z.class);
                z17 = rVar2.e(i17, rVar, 0, zVar != null ? zVar.P6() : null);
            }
            if (z17) {
                be2.j Rj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Rj();
                mm2.e1 e1Var = (mm2.e1) business(mm2.e1.class);
                Rj.D0((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0), rVar.f309597b);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.ty4 ty4Var;
        r45.bh5 bh5Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        hn0.r rVar;
        kn0.g gVar;
        r45.ka4 ka4Var;
        r45.ah5 ah5Var;
        if (zl2.r4.f473950a.x1() || r71Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayerController", "checkPlayInfoControl isLivePlayInfoControlEnable: " + ((mm2.c1) business(mm2.c1.class)).L3 + " on_quality_change_info: " + ((r45.ty4) r71Var.getCustom(35)));
        if (!((mm2.c1) business(mm2.c1.class)).L3 || (ty4Var = (r45.ty4) r71Var.getCustom(35)) == null) {
            return;
        }
        int i17 = (int) ty4Var.getLong(0);
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            r45.nw1 nw1Var = (r45.nw1) r71Var.getCustom(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSdkInfoData liveInfo: ");
            sb6.append(nw1Var);
            sb6.append(" sdkInfo: ");
            sb6.append(nw1Var != null ? (r45.ma4) nw1Var.getCustom(23) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayerController", sb6.toString());
            r45.ma4 ma4Var = nw1Var != null ? (r45.ma4) nw1Var.getCustom(23) : null;
            if (nw1Var == null || ma4Var == 0) {
                return;
            }
            um2.m.f428873a.e(getStore().getLiveRoomData(), "FinderLiveVisitorPlayerController", N6(), nw1Var, ma4Var);
            return;
        }
        int integer = ty4Var.getInteger(2);
        r45.ah5 ah5Var2 = (r45.ah5) ty4Var.getCustom(1);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateLocalQualityTagInfo selectQualityCfg: ");
        sb7.append(integer);
        sb7.append(" \nlastQualityInfo: ");
        kn0.i iVar = ((mm2.e1) business(mm2.e1.class)).f328990t;
        sb7.append((iVar == null || (gVar = iVar.f309558b) == null || (ka4Var = gVar.f309548o) == null || (ah5Var = ka4Var.f378545p1) == null) ? null : dk2.nc.f233817a.a(ah5Var));
        sb7.append(" \nnewQualityInfo: ");
        sb7.append(ah5Var2 != null ? dk2.nc.f233817a.a(ah5Var2) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayerController", sb7.toString());
        tn0.w0 w0Var = dk2.ef.f233378d;
        boolean z17 = w0Var instanceof co0.s;
        co0.s sVar = z17 ? (co0.s) w0Var : null;
        co0.s sVar2 = z17 ? (co0.s) w0Var : null;
        kn0.g gVar2 = (sVar2 == null || (rVar = sVar2.R1) == null) ? null : rVar.f282410b;
        if (sVar == null || gVar2 == null) {
            return;
        }
        gVar2.f309548o.f378545p1 = ah5Var2;
        ko0.t tVar = ko0.t.f309903a;
        hn0.r rVar2 = sVar.R1;
        mn0.b0 b0Var = rVar2.f282409a;
        java.lang.String d17 = tVar.d(b0Var != null ? ((mn0.y) b0Var).f329815q : null);
        if (d17 == null) {
            d17 = "";
        }
        long j17 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
        cl0.g gVar3 = new cl0.g();
        int i18 = rVar2.f282413e;
        java.util.Set keySet = gVar2.f309544k.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        int b07 = kz5.n0.b0(keySet, java.lang.Integer.valueOf(i18));
        if (ah5Var2 == null || (linkedList2 = ah5Var2.f370013d) == null) {
            bh5Var = null;
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.bh5) obj).f370767d == b07) {
                        break;
                    }
                }
            }
            bh5Var = (r45.bh5) obj;
        }
        gVar3.s("liveId", java.lang.Long.valueOf(j17));
        gVar3.s("lastStreamId", d17);
        gVar3.s("lastCdnQuality", java.lang.Integer.valueOf(i18));
        gVar3.s("currentQualityDelete", java.lang.Boolean.valueOf(bh5Var == null));
        gVar3.s("targetCdnQuality", java.lang.Integer.valueOf(integer));
        if (bh5Var != null) {
            if (bh5Var.f370768e == 1) {
                pm0.z.b(xy2.b.f458155b, "livePlayError_autoSwitchStream", false, null, null, false, false, new df2.j5(gVar3), 60, null);
                Z6(gVar2.g(i18), i18);
                return;
            }
            return;
        }
        kn0.r g17 = gVar2.g(integer);
        java.util.Set keySet2 = gVar2.f309544k.keySet();
        kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
        int b08 = kz5.n0.b0(keySet2, java.lang.Integer.valueOf(integer));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateLocalQualityTagInfo use targetIndex: ");
        sb8.append(b08);
        sb8.append(" lastQualityInfo: ");
        r45.ah5 ah5Var3 = gVar2.f309548o.f378545p1;
        sb8.append(ah5Var3 != null ? dk2.nc.f233817a.a(ah5Var3) : null);
        sb8.append(" targetLiveUrlInfo: ");
        sb8.append(g17);
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayerController", sb8.toString());
        if (ah5Var2 != null && (linkedList = ah5Var2.f370013d) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.bh5) next).f370767d == b08) {
                    r8 = next;
                    break;
                }
            }
            r8 = (r45.bh5) r8;
        }
        boolean z18 = r8 != null;
        if (z18 && g17 != null) {
            pm0.z.b(xy2.b.f458155b, "livePlayError_autoSwitchStream", false, null, null, false, false, new df2.i5(gVar3), 60, null);
            Z6(g17, integer);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayerController", "updateLocalQualityTagInfo return, isTargetQualityExit: " + z18 + " targetLiveUrlInfo: " + g17);
    }
}
