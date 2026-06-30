package qf2;

/* loaded from: classes10.dex */
public final class c3 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f362311m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f362312n;

    /* renamed from: o, reason: collision with root package name */
    public int f362313o;

    /* renamed from: p, reason: collision with root package name */
    public int f362314p;

    /* renamed from: q, reason: collision with root package name */
    public jz5.l f362315q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f362316r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f362313o = 1;
        this.f362314p = -1;
        this.f362316r = jz5.h.b(new qf2.r2(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0424, code lost:
    
        if (kotlinx.coroutines.l.g(r3, r5, r4) == r6) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(qf2.c3 r34, dk2.pf r35, int r36, boolean r37, yz5.l r38, kotlin.coroutines.Continuation r39) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.c3.Z6(qf2.c3, dk2.pf, int, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r5, r12 != null ? r12.f234154a : null) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a7(qf2.c3 r31, mm2.o4 r32, r45.im1 r33, jz5.l r34) {
        /*
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = 0
            r0.f362315q = r4
            dk2.u4 r5 = r1.Z
            r6 = 15
            java.lang.String r7 = "getBattle_teams(...)"
            r8 = 9
            r9 = 8
            r10 = 0
            r11 = 13
            if (r5 == 0) goto L2a
            java.lang.String r5 = r2.getString(r10)
            dk2.u4 r12 = r1.Z
            if (r12 == 0) goto L24
            java.lang.String r4 = r12.f234154a
        L24:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.D0(r5, r4)
            if (r4 != 0) goto L72
        L2a:
            dk2.u4 r4 = new dk2.u4
            r12 = r4
            java.lang.String r13 = r2.getString(r10)
            r5 = 1
            long r14 = r2.getLong(r5)
            r16 = 0
            r17 = -1
            r18 = 6
            r19 = 0
            int r20 = r2.getInteger(r9)
            r21 = 0
            r22 = 0
            java.util.LinkedList r5 = r2.getList(r8)
            r23 = r5
            kotlin.jvm.internal.o.f(r5, r7)
            java.lang.Object r5 = r3.f302834e
            r24 = r5
            r45.gd2 r24 = (r45.gd2) r24
            r25 = 0
            int r26 = r2.getInteger(r11)
            int r27 = r2.getInteger(r6)
            r28 = 0
            r29 = 18848(0x49a0, float:2.6412E-41)
            r30 = 0
            r12.<init>(r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.Z = r4
            qf2.x2 r4 = new qf2.x2
            r4.<init>(r0, r1)
            pm0.v.X(r4)
        L72:
            dk2.u4 r4 = r1.Z
            if (r4 == 0) goto Ldc
            java.util.LinkedList r5 = r2.getList(r8)
            kotlin.jvm.internal.o.f(r5, r7)
            r4.f234163j = r5
            java.lang.Object r3 = r3.f302834e
            r45.gd2 r3 = (r45.gd2) r3
            r4.f234164k = r3
            int r3 = r2.getInteger(r9)
            r4.f234160g = r3
            int r3 = r2.getInteger(r11)
            r4.f234166m = r3
            r3 = 10
            int r5 = r2.getInteger(r3)
            r4.f234161h = r5
            int r5 = r2.getInteger(r6)
            r4.f234167n = r5
            int r3 = r2.getInteger(r3)
            r5 = 11
            com.tencent.mm.protobuf.g r5 = r2.getByteString(r5)
            java.lang.String r3 = r4.b(r3, r5)
            r4.f234162i = r3
            r3 = 4
            java.util.LinkedList r3 = r2.getList(r3)
            java.lang.String r5 = "getPlayer_info(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            r4.m(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "[BattleTemplateInfo] receive create battle status, curBattle:"
            r3.<init>(r5)
            dk2.u4 r1 = r1.Z
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "FinderLiveMicVisitorBattlePkController"
            com.tencent.mars.xlog.Log.i(r3, r1)
            int r1 = r4.f234160g
            int r2 = r2.getInteger(r11)
            java.lang.String r3 = "onBattleCreate"
            r0.e7(r1, r2, r3)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.c3.a7(qf2.c3, mm2.o4, r45.im1, jz5.l):void");
    }

    public static final void b7(qf2.c3 c3Var, java.lang.String str) {
        dk2.u4 u4Var = ((mm2.o4) c3Var.business(mm2.o4.class)).Z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recoverToNormalMode: ");
        sb6.append(str);
        sb6.append(" finishPublicityJob: ");
        kotlinx.coroutines.r2 r2Var = c3Var.f362311m;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        sb6.append(" curBattle: ");
        sb6.append(u4Var);
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", sb6.toString());
        if (u4Var == null) {
            return;
        }
        pm0.v.X(new qf2.a3(c3Var, str));
    }

    public static /* synthetic */ java.lang.Object h7(qf2.c3 c3Var, int i17, java.lang.String str, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        if ((i18 & 8) != 0) {
            lVar = null;
        }
        return c3Var.g7(i17, str, z18, lVar, continuation);
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        r45.im1 im1Var;
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        jz5.l lVar = this.f362315q;
        if (lVar == null || (im1Var = (r45.im1) lVar.f302833d) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "onMicInfoChanged onBattleStart use tempBattleInfoPair, state: " + im1Var.getInteger(2));
        if (im1Var.getInteger(2) == 10) {
            i7((mm2.o4) business(mm2.o4.class), im1Var, lVar);
        }
    }

    public final void c7(int i17, dk2.pf battleRequestData, yz5.l lVar) {
        kotlin.jvm.internal.o.g(battleRequestData, "battleRequestData");
        ((mm2.y2) business(mm2.y2.class)).f329566s = battleRequestData;
        this.f362312n = false;
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.b2(this, battleRequestData, i17, lVar, null), 3, null);
    }

    public final void d7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "cancelPublicityJob: " + str + " finishPublicityJob: " + this.f362311m);
        kotlinx.coroutines.r2 r2Var = this.f362311m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f362311m = null;
    }

    public final void e7(int i17, int i18, java.lang.String str) {
        tn0.w0 Q6;
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "checkOnMicModeSelectChanged battleMode: " + i17 + " source: " + str + " lastBattleMode: " + this.f362314p);
        if (((mm2.e1) business(mm2.e1.class)).g7()) {
            f7(i17);
            return;
        }
        if (zl2.r4.f473950a.x1() && (Q6 = Q6()) != null) {
            int i19 = i17 == 1 ? 5 : i18 == 3 ? 7 : 6;
            zn0.a0 U = Q6.U();
            java.lang.Integer valueOf = U != null ? java.lang.Integer.valueOf(U.f474316t) : null;
            if ((valueOf == null || valueOf.intValue() != 5) && ((valueOf == null || valueOf.intValue() != 6) && (valueOf == null || valueOf.intValue() != 7))) {
                this.f362313o = valueOf != null ? valueOf.intValue() : 1;
            }
            zn0.a0 U2 = Q6.U();
            if (U2 != null && U2.f474316t == i19) {
                return;
            }
            Q6.i0(i19, "");
        }
    }

    public final void f7(int i17) {
        zn0.a0 U;
        int i18 = i17 != 1 ? i17 != 2 ? 1 : 6 : 5;
        if (this.f362314p == i17) {
            if (!zl2.r4.f473950a.x1()) {
                return;
            }
            tn0.w0 Q6 = Q6();
            if ((Q6 == null || (U = Q6.U()) == null || U.f474316t != i18) ? false : true) {
                return;
            }
        }
        this.f362314p = i17;
        if (!zl2.r4.f473950a.x1()) {
            zi2.w wVar = (zi2.w) R6(zi2.w.class);
            if (wVar != null) {
                wVar.u1();
                return;
            }
            return;
        }
        zi2.w wVar2 = (zi2.w) R6(zi2.w.class);
        if (wVar2 != null) {
            wVar2.t1();
        }
        tn0.w0 Q62 = Q6();
        in0.q qVar = Q62 instanceof in0.q ? (in0.q) Q62 : null;
        if (qVar != null) {
            qVar.i0(i18, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g7(int r19, java.lang.String r20, boolean r21, yz5.l r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.c3.g7(int, java.lang.String, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x016f, code lost:
    
        if (((r3 != null ? r3.f234156c : 0) - r37.getInteger(3)) >= 3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r5, r4 != null ? r4.f234154a : null) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7(mm2.o4 r36, r45.im1 r37, jz5.l r38) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.c3.i7(mm2.o4, r45.im1, jz5.l):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.z2(this, null), 3, null);
    }
}
