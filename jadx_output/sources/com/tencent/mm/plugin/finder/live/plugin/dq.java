package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dq extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: x1, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.hp f112318x1 = new com.tencent.mm.plugin.finder.live.plugin.hp(null);
    public boolean A;
    public java.lang.String B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public java.lang.Integer G;
    public java.util.LinkedList H;
    public final java.util.LinkedList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.Map f112319J;
    public final java.util.Map K;
    public final com.tencent.mm.plugin.finder.live.util.m L;
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn M;
    public com.tencent.mm.plugin.finder.live.util.t N;
    public com.tencent.mm.plugin.finder.live.plugin.jp P;
    public js4.k Q;
    public java.lang.String R;
    public boolean S;
    public java.lang.String T;
    public com.tencent.mm.ui.widget.dialog.k0 U;
    public volatile boolean V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public mm2.s5 Z;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.List f112320l1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112321p;

    /* renamed from: p0, reason: collision with root package name */
    public int f112322p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.os.Bundle f112323p1;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f112324q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f112325r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f112326s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f112327t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f112328u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f112329v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f112330w;

    /* renamed from: x, reason: collision with root package name */
    public mm2.r2 f112331x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.mo0 f112332x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f112333y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f112334y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f112335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112321p = statusMonitor;
        this.f112324q = root.getContext().getSystemService("vibrator");
        this.B = "";
        this.C = -1;
        this.I = new java.util.LinkedList();
        this.M = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn) root;
        this.R = "";
        this.T = "";
        this.V = true;
        this.W = true;
        this.X = true;
        this.f112320l1 = new java.util.ArrayList();
        root.post(new com.tencent.mm.plugin.finder.live.plugin.bp(root));
        this.L = new com.tencent.mm.plugin.finder.live.plugin.ep(this);
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R1).getValue()).r()).intValue();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.O1).getValue()).r()).intValue() * 1000;
        this.Y = intValue2;
        this.W = intValue == 0;
        this.X = intValue2 >= 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "sendLocalGiftToMsgValue :" + intValue + ",memberListAutoRefreshValue:" + intValue2);
        this.f112319J = new java.util.HashMap();
        this.K = new java.util.HashMap();
    }

    public static void D1(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, java.lang.String str, int i17, dk2.g gVar, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        r45.ad5 ad5Var;
        int i19;
        int i27 = i17;
        boolean z19 = (i18 & 8) != 0 ? true : z17;
        int i28 = 0;
        boolean z27 = (i18 & 16) != 0 ? false : z18;
        dqVar.getClass();
        dqVar.P = new com.tencent.mm.plugin.finder.live.plugin.sp(dqVar, str, z27, i17, z19);
        ce2.i e17 = dk2.u7.f234181a.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveGiftSendPlugin", "sendGift giftInfo is empty, giftId:" + str + " diffCnt:" + i27 + ",comboId:" + gVar.f233467b + ",sendGiftTargetUserName:" + dqVar.R);
            return;
        }
        com.tencent.mars.xlog.Log.e("Finder.FinderLiveGiftSendPlugin", "sendGift giftInfo giftId:" + str + " diffCnt:" + i27 + ",comboId:" + gVar.f233467b + ",sendGiftTargetUserName:" + dqVar.R + " isFromPatchSend: " + z27);
        if (zl2.q4.f473933a.E() && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3482p).getValue()).r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "sendGift mock");
            return;
        }
        r45.b82 A1 = dqVar.A1(str, z27);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "sendGift, scene: " + A1.getInteger(0) + " wishId: " + A1.getString(1) + " giftId:" + str + " diffCnt:" + i27 + " price:" + e17.P0() + ",comboId:" + gVar.f233467b + ",sendGiftTargetUserName:" + dqVar.R + ", isFromOneClick:" + dqVar.f112335z);
        mm2.v5 v5Var = (mm2.v5) dqVar.P0(mm2.v5.class);
        v5Var.f329489o = c01.id.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markGiftSend lastGiftSendTime: ");
        sb6.append(v5Var.f329489o);
        com.tencent.mars.xlog.Log.i("LiveRestrictConsumeSlice", sb6.toString());
        if (dqVar.f112334y0) {
            com.tencent.mm.plugin.finder.live.util.y.e(dqVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.qp(dqVar, null), 3, null);
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.tp tpVar = new com.tencent.mm.plugin.finder.live.plugin.tp(str, dqVar, e17, gVar, A1);
        if (!dqVar.A) {
            tpVar.invoke(java.lang.Integer.valueOf(i17), null, null);
            return;
        }
        if (dqVar.H == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "pkgGiftPatchInfoList is null, return");
            return;
        }
        int i29 = 0;
        while (i27 > 0) {
            java.util.LinkedList linkedList = dqVar.H;
            if (i29 >= (linkedList != null ? linkedList.size() : i28)) {
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[pkg-doPostGift] index = ");
            sb7.append(i29);
            sb7.append(", needToPostCnt = ");
            sb7.append(i27);
            sb7.append(", prefixSumArray = ");
            java.util.LinkedList linkedList2 = dqVar.I;
            sb7.append(linkedList2);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb7.toString());
            if (linkedList2.size() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "prefixSumArray is empty, return");
                return;
            }
            int size = linkedList2.size() - 1;
            if (i29 <= size) {
                size = i29;
            }
            java.lang.Object obj2 = linkedList2.get(size);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            long longValue = ((java.lang.Number) obj2).longValue();
            java.util.LinkedList linkedList3 = dqVar.H;
            if (linkedList3 == null || (ad5Var = (r45.ad5) kz5.n0.a0(linkedList3, i29)) == null) {
                int i37 = i28;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("pkgGiftPatchInfoList.get null, ");
                java.util.LinkedList linkedList4 = dqVar.H;
                sb8.append(linkedList4 != null ? linkedList4.size() : i37);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb8.toString());
                return;
            }
            long j17 = ad5Var.getLong(6);
            int e18 = c01.id.e();
            com.tencent.mm.plugin.finder.live.plugin.tp tpVar2 = tpVar;
            boolean z28 = j17 - ((long) e18) < 0;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "expireTime = " + j17 + ", currentTime = " + e18 + ", isExpire = " + z28);
            if (zl2.q4.f473933a.E() && z28) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.lp(dqVar, ad5Var, j17));
            }
            long j18 = i27;
            if (j18 <= longValue) {
                long j19 = ad5Var.getLong(1);
                ad5Var.set(1, java.lang.Long.valueOf(longValue - j18));
                long j27 = j19 - ad5Var.getLong(1);
                dqVar.w1("doPostGift-if");
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift-if] postCnt:" + j27);
                tpVar2.invoke(java.lang.Integer.valueOf((int) j27), ad5Var.getString(3), ad5Var.getString(0));
                tpVar = tpVar2;
                i27 = 0;
                i28 = 0;
            } else {
                int i38 = (int) ad5Var.getLong(1);
                if (i38 != 0) {
                    ad5Var.set(1, 0L);
                    i27 -= i38;
                    dqVar.w1("doPostGift-else");
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift-else] postCnt:" + i38);
                    i19 = 0;
                    tpVar2.invoke(java.lang.Integer.valueOf(i38), ad5Var.getString(3), ad5Var.getString(0));
                } else {
                    i19 = 0;
                    if (i29 + 1 >= linkedList2.size()) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift-else] batch isEmpty，return");
                        i27 = 0;
                    }
                }
                i29++;
                tpVar = tpVar2;
                i28 = i19;
            }
        }
    }

    public static final android.view.View t1(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var;
        android.view.View f76;
        if (dqVar.z1() == 7) {
            df2.s8 s8Var = (df2.s8) dqVar.U0(df2.s8.class);
            if (s8Var != null && (f76 = s8Var.f7()) != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "[getDelegateSendBtn] funding btn");
                return f76;
            }
        } else if (dqVar.D) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var2 = (com.tencent.mm.plugin.finder.live.plugin.ag0) dqVar.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if (ag0Var2 != null) {
                android.view.View view = (android.view.View) ((jz5.n) ag0Var2.H.f253817i).getValue();
                kotlin.jvm.internal.o.f(view, "<get-clickArea>(...)");
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "[getDelegateSendBtn] outerGiftView");
                return view;
            }
        } else if (dqVar.F && (ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) dqVar.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class)) != null) {
            com.tencent.mm.plugin.finder.live.widget.wm wmVar = ag0Var.A;
            android.view.ViewGroup viewGroup = wmVar.f120212m != null ? wmVar.f120209g : null;
            if (viewGroup != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "[getDelegateSendBtn] ktvSendFlowerBtn (visitor)");
                return viewGroup;
            }
        }
        return dqVar.M;
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, java.lang.Long l17) {
        qo0.c cVar = dqVar.f112321p;
        if (l17 == null) {
            qo0.c.a(cVar, qo0.b.Y1, null, 2, null);
            return;
        }
        qo0.b bVar = qo0.b.Y1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN", l17.longValue());
        cVar.statusChange(bVar, bundle);
    }

    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        dqVar.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.cq(str, str2, i17, dqVar, str3, str4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d2, code lost:
    
        if (((r1 == null || (r1 = (r45.nz3) kz5.n0.Z(r1)) == null || r1.getInteger(3) != 2) ? false : true) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01dd, code lost:
    
        if (r3 != null) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.b82 A1(java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.dq.A1(java.lang.String, boolean):r45.b82");
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        C1();
        return true;
    }

    public final boolean B1() {
        boolean z17 = (this.R.length() > 0) && !kotlin.jvm.internal.o.b(this.R, ((mm2.c1) P0(mm2.c1.class)).f328852o);
        dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
        return ((mm2.n2) P0(mm2.n2.class)).f329281i && (u4Var != null && u4Var.h()) && !z17;
    }

    public final void C1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.np(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void E0(int i17) {
        this.V = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "networkChange " + i17 + ",networkEnable:" + this.V);
        if (this.V) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.op(this));
    }

    public final void E1(java.lang.String str, ce2.i iVar, int i17, long j17) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.aq(this, str, iVar, i17, j17));
        if (this.f112321p.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327528i, "", 0);
        }
    }

    public final void F1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.bq(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        df2.pv pvVar;
        df2.s8 s8Var;
        df2.pv pvVar2;
        super.K0(i17);
        if (i17 == 0) {
            df2.s8 s8Var2 = (df2.s8) U0(df2.s8.class);
            if (s8Var2 == null || (pvVar = (df2.pv) U0(df2.pv.class)) == null) {
                return;
            }
            pvVar.b7(s8Var2);
            return;
        }
        if (i17 != 8 || (s8Var = (df2.s8) U0(df2.s8.class)) == null || kz5.z.G(new df2.h7[]{df2.h7.f230307m, df2.h7.f230306i}, s8Var.d7().f302833d) || (pvVar2 = (df2.pv) U0(df2.pv.class)) == null) {
            return;
        }
        pvVar2.d7(s8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.dq.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn finderLiveGiftSendBtn = this.M;
        com.tencent.mm.view.MMPAGView mMPAGView = finderLiveGiftSendBtn.f115951g;
        if (mMPAGView.f()) {
            mMPAGView.n();
        }
        pm0.v.C(finderLiveGiftSendBtn.singleClickPagTask);
        this.S = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        ((mm2.v5) P0(mm2.v5.class)).f329488n.observe(this, new com.tencent.mm.plugin.finder.live.plugin.pp(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void w1(java.lang.String str) {
        java.util.LinkedList linkedList = this.I;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.H;
        if (linkedList2 != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ad5 ad5Var = (r45.ad5) obj;
                if (i17 == 0) {
                    linkedList.add(java.lang.Long.valueOf(ad5Var.getLong(1)));
                } else {
                    java.lang.Object obj2 = linkedList.get(i17 - 1);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    linkedList.add(java.lang.Long.valueOf(((java.lang.Number) obj2).longValue() + ad5Var.getLong(1)));
                }
                i17 = i18;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", str + " buildPrefixSumArray = " + linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x1(int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.dq.x1(int, boolean):boolean");
    }

    public final com.tencent.mm.plugin.finder.live.plugin.fp y1(java.lang.String sendGiftTargetUserName, java.lang.String giftId, boolean z17) {
        kotlin.jvm.internal.o.g(sendGiftTargetUserName, "sendGiftTargetUserName");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        df2.wy wyVar = (df2.wy) U0(df2.wy.class);
        return new com.tencent.mm.plugin.finder.live.plugin.fp(S0(), sendGiftTargetUserName, A1(giftId, z17), wyVar != null ? wyVar.d7(sendGiftTargetUserName) : 0);
    }

    public final int z1() {
        if (this.f112335z) {
            return 3;
        }
        java.lang.String str = this.f112326s;
        if (!(str == null || str.length() == 0)) {
            return 2;
        }
        if (this.C > 0) {
            return 8;
        }
        java.lang.String str2 = this.B;
        if (!(str2 == null || str2.length() == 0)) {
            return 7;
        }
        mm2.r2 r2Var = this.f112331x;
        java.lang.String str3 = r2Var != null ? r2Var.f329374e : null;
        if (!(str3 == null || str3.length() == 0)) {
            return 1;
        }
        if (this.D) {
            return 9;
        }
        if (this.E) {
            return 10;
        }
        return this.F ? 11 : 0;
    }
}
