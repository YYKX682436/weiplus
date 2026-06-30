package qf2;

/* loaded from: classes10.dex */
public final class y1 extends if2.b implements mf2.c {

    /* renamed from: m */
    public jz5.l f362657m;

    /* renamed from: n */
    public kotlinx.coroutines.r2 f362658n;

    /* renamed from: o */
    public final jz5.g f362659o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f362659o = jz5.h.b(new qf2.k1(this));
    }

    public static final boolean Z6(qf2.y1 y1Var) {
        com.tencent.mm.plugin.finder.live.plugin.na naVar;
        java.util.List list = ((mm2.o4) y1Var.business(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        if (!pm0.v.F(list)) {
            return true;
        }
        if (((mm2.o4) y1Var.business(mm2.o4.class)).Z != null && (naVar = (com.tencent.mm.plugin.finder.live.plugin.na) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.na.class)) != null) {
            naVar.B1();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "[BattleTemplateInfo] checkAnchorPkMicing skip. anchorPkMicUserList is empty, curBattle = " + ((mm2.o4) y1Var.business(mm2.o4.class)).Z);
        return false;
    }

    public static final void a7(qf2.y1 y1Var, java.lang.String str, r45.im1 im1Var, r45.gd2 gd2Var) {
        y1Var.getClass();
        if (gd2Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpTempInfo source: ");
            sb6.append(str);
            sb6.append(" seq: ");
            sb6.append(gd2Var.getInteger(3));
            sb6.append(" svTime: ");
            sb6.append(gd2Var.getLong(4));
            sb6.append(" battleId: ");
            sb6.append(im1Var.getString(0));
            sb6.append(" lastId: ");
            dk2.u4 u4Var = ((mm2.o4) y1Var.business(mm2.o4.class)).Z;
            sb6.append(u4Var != null ? u4Var.f234154a : null);
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", sb6.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(qf2.y1 r19, dk2.m r20, int r21, boolean r22, yz5.l r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y1.b7(qf2.y1, dk2.m, int, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r5, r11 != null ? r11.f234154a : null) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c7(qf2.y1 r30, mm2.o4 r31, r45.im1 r32, jz5.l r33) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y1.c7(qf2.y1, mm2.o4, r45.im1, jz5.l):void");
    }

    public static final void d7(qf2.y1 y1Var, java.lang.String str) {
        dk2.u4 u4Var = ((mm2.o4) y1Var.business(mm2.o4.class)).Z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recoverToNormalMode: ");
        sb6.append(str);
        sb6.append(" finishPublicityJob: ");
        kotlinx.coroutines.r2 r2Var = y1Var.f362658n;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        sb6.append(" curBattle: ");
        sb6.append(u4Var);
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", sb6.toString());
        if (u4Var == null) {
            return;
        }
        pm0.v.X(new qf2.x1(y1Var, str));
    }

    public static void f7(qf2.y1 y1Var, yz5.l lVar, int i17, java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var = null;
        yz5.l lVar2 = (i17 & 1) != 0 ? null : lVar;
        dk2.u4 u4Var = ((mm2.o4) y1Var.business(mm2.o4.class)).Z;
        km2.c cVar = ((mm2.o4) y1Var.business(mm2.o4.class)).W;
        if (u4Var != null && cVar != null) {
            r2Var = com.tencent.mm.plugin.finder.live.util.y.d(y1Var, null, null, new qf2.b1(u4Var, cVar, y1Var, lVar2, null), 3, null);
        }
        if (r2Var == null) {
            db5.t7.g(y1Var.O6(), y1Var.O6().getResources().getString(com.tencent.mm.R.string.d6k));
            com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
            if (naVar != null) {
                naVar.y1();
            }
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = (com.tencent.mm.plugin.finder.live.plugin.x7) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.x7.class);
            if (x7Var != null) {
                x7Var.H1(2);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewAcceptBattle fail, curBattle: " + ((mm2.o4) y1Var.business(mm2.o4.class)).Z + " curAnchorMicPkData: " + ((mm2.o4) y1Var.business(mm2.o4.class)).W);
        }
    }

    public static /* synthetic */ void h7(qf2.y1 y1Var, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        y1Var.g7(z17, lVar);
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        r45.im1 im1Var;
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        jz5.l lVar = this.f362657m;
        if (lVar == null || (im1Var = (r45.im1) lVar.f302833d) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "onMicInfoChanged onBattleStart use tempBattleInfoPair, state: " + im1Var.getInteger(2));
        if (im1Var.getInteger(2) == 10) {
            n7((mm2.o4) business(mm2.o4.class), im1Var, lVar);
        }
    }

    public final void e7(dk2.m battleData, yz5.l lVar) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        km2.c cVar = ((mm2.o4) business(mm2.o4.class)).W;
        if (cVar != null) {
            ((mm2.y2) business(mm2.y2.class)).f329568u = battleData;
            com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.y0(battleData, cVar, this, lVar, null), 3, null);
        } else {
            db5.t7.g(O6(), O6().getResources().getString(com.tencent.mm.R.string.d6m));
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewApplyBattle fail , pk data is null");
        }
    }

    public final void g7(boolean z17, yz5.l lVar) {
        dk2.u4 u4Var = ((mm2.o4) business(mm2.o4.class)).Z;
        km2.c cVar = ((mm2.o4) business(mm2.o4.class)).W;
        if (((u4Var == null || cVar == null) ? null : com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.e1(u4Var, cVar, this, z17, lVar, null), 3, null)) == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewCloseBattle fail, curBattle: " + ((mm2.o4) business(mm2.o4.class)).Z + " curAnchorMicPkData: " + ((mm2.o4) business(mm2.o4.class)).W);
        }
    }

    public final void i7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "cancelPublicityJob: " + str + " finishPublicityJob: " + this.f362658n);
        kotlinx.coroutines.r2 r2Var = this.f362658n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f362658n = null;
    }

    public final void k7(dk2.u4 u4Var, java.lang.String source) {
        tn0.w0 Q6;
        kotlin.jvm.internal.o.g(source, "source");
        if (u4Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "checkOnMicModeSelectChanged battleScope: " + u4Var.f234166m + " source: " + source);
        if (zl2.r4.f473950a.x1() && (Q6 = Q6()) != null) {
            int i17 = u4Var.f234166m;
            boolean z17 = false;
            if (i17 == 0) {
                int i18 = u4Var.f234168o == 1 ? 8 : 1;
                zn0.a0 U = Q6.U();
                if (U != null && U.f474316t == i18) {
                    z17 = true;
                }
                if (z17) {
                    return;
                }
                Q6.i0(i18, "");
                return;
            }
            if (i17 != 3) {
                return;
            }
            zn0.a0 U2 = Q6.U();
            if (U2 != null && U2.f474316t == 7) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            Q6.i0(7, "");
        }
    }

    public final void l7() {
        tn0.w0 Q6;
        dk2.u4 u4Var;
        if (!zl2.r4.f473950a.x1() || (Q6 = Q6()) == null || (u4Var = ((mm2.o4) business(mm2.o4.class)).Z) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "checkResetToNormalMode battleData: " + u4Var);
        if (u4Var.f234166m == 0) {
            zn0.a0 U = Q6.U();
            boolean z17 = false;
            if (U != null && U.f474316t == 1) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            Q6.i0(1, "");
        }
    }

    public final void m7(dk2.u4 u4Var) {
        df2.wy wyVar = (df2.wy) controller(df2.wy.class);
        if (wyVar != null && !wyVar.f231744u) {
            wyVar.b7(u4Var);
        }
        pm0.v.X(new qf2.t1(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0176, code lost:
    
        if (((r3 != null ? r3.f234156c : 0) - r36.getInteger(3)) >= 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r4, r15 != null ? r15.f234154a : null) == false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(mm2.o4 r35, r45.im1 r36, jz5.l r37) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y1.n7(mm2.o4, r45.im1, jz5.l):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.w1(this, null), 3, null);
    }
}
