package dk2;

/* loaded from: classes3.dex */
public final class r4 implements dk2.xf {

    /* renamed from: h, reason: collision with root package name */
    public static final dk2.s0 f234005h = new dk2.s0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f234006a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f234007b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.qt2 f234008c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234009d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234010e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f234011f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f234012g;

    public r4(java.lang.ref.WeakReference weakReference, gk2.e buContext, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f234006a = weakReference;
        this.f234007b = buContext;
        this.f234008c = qt2Var;
        this.f234009d = "FinderLiveAssistant_" + hashCode() + '_' + buContext.hashCode();
        this.f234011f = new java.util.ArrayList();
        this.f234012g = jz5.h.b(dk2.l3.f233714d);
    }

    public static final java.lang.Object j(dk2.r4 r4Var, int i17, kotlin.coroutines.Continuation continuation) {
        r4Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0), true, null, new dk2.i3(r4Var, nVar), i17, null, null, null, 228, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if ((r6 != null && r6.getBoolean(1)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2.U1(r3) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(long r25, long r27, java.lang.String r29, int r30, yz5.p r31) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.A(long, long, java.lang.String, int, yz5.p):void");
    }

    public void B(int i17, int i18, yz5.r rVar) {
        pq5.g l17 = new ek2.z2(db2.t4.f228171a.a(3603), ((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), xy2.c.f(this.f234008c), ((mm2.e1) m(mm2.e1.class)).f328983m, 2, null, 0, null, null, i18, ((mm2.e1) m(mm2.e1.class)).C, 256, null).l();
        if (M() != null && (M() instanceof com.tencent.mm.ui.MMActivity)) {
            android.content.Context M = M();
            kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) M);
        }
        l17.K(new dk2.k1(rVar, this));
    }

    public void C(byte[] bArr, byte[] bArr2, ek2.n0 n0Var) {
        new ek2.o0(db2.t4.f228171a.a(6845), xy2.c.f(this.f234008c), bArr, bArr2, ((mm2.e1) m(mm2.e1.class)).f328985o, zl2.q4.d(zl2.q4.f473933a, null, null, 3, null), n0Var).l();
    }

    public void D(java.lang.String str, yz5.r rVar) {
        java.lang.ref.WeakReference weakReference = rVar != null ? new java.lang.ref.WeakReference(rVar) : null;
        r45.qt2 L = L();
        ke2.p0 p0Var = ke2.q0.f306981w;
        r45.ch1 ch1Var = new r45.ch1();
        r45.ri1 ri1Var = new r45.ri1();
        ri1Var.set(0, str);
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(ri1Var.toByteArray()));
        ch1Var.set(1, 20006);
        ch1Var.set(2, zl2.q4.f473933a.m());
        pq5.g l17 = new ke2.q0(ch1Var, this.f234007b, L, new dk2.l1(weakReference)).l();
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public void E(android.content.Context context, long j17, int i17, com.tencent.mm.protobuf.g gVar, yz5.u uVar) {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        long c17 = c01.id.c();
        r0Var.f327879r.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17));
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "LiveKeyReport1# putEnterSessionId liveId:" + pm0.v.u(j17) + ", enterSessionId:" + c17);
        pm0.v.O(this.f234009d, new dk2.p1(this, j17, context, i17, gVar, uVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(int r35, int r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.F(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(int r33, int r34, int r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.G(int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(android.content.Context r36, long r37, long r39, java.lang.String r41, int r42, int r43, dk2.g r44, java.lang.String r45, int r46, com.tencent.mm.protobuf.g r47, java.util.List r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, byte[] r52, com.tencent.mm.plugin.finder.live.plugin.jp r53) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.H(android.content.Context, long, long, java.lang.String, int, int, dk2.g, java.lang.String, int, com.tencent.mm.protobuf.g, java.util.List, java.lang.String, java.lang.String, java.lang.String, byte[], com.tencent.mm.plugin.finder.live.plugin.jp):void");
    }

    public void I(android.content.Context context, long j17, java.lang.String username, java.lang.Long l17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        ((mm2.c1) m(mm2.c1.class)).O1 = false;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) m(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            finderObject.setSessionBuffer(((mm2.e1) m(mm2.e1.class)).f328993w);
        } else {
            finderObject = null;
        }
        ((c61.p2) ybVar).xj(context, V6, j17, username, l17, i17, finderObject);
    }

    public final void J(r45.kp1 kp1Var) {
        if (!kp1Var.getBoolean(0) || this.f234010e) {
            return;
        }
        this.f234010e = true;
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        int d17 = nVar != null ? nVar.d() : 0;
        int integer = kp1Var.getInteger(1);
        int i17 = d17 + integer;
        com.tencent.mars.xlog.Log.i(this.f234009d, "Guide enabled, calling CgiFinderLiveEntranceNav, curPos=" + d17 + ", readLiveCount=" + integer + ", insertPosition=" + i17);
        long j17 = ((mm2.e1) m(mm2.e1.class)).f328983m;
        java.lang.String str = ((mm2.e1) m(mm2.e1.class)).f328992v;
        if (str == null) {
            str = "";
        }
        new ke2.o(new ke2.n(j17, str, ((mm2.e1) m(mm2.e1.class)).f328993w, null, null, null, 0), null, null, 6, null).l().K(new dk2.i2(this, i17, d17, integer));
    }

    public r45.o72 K(long j17) {
        return zl2.r4.f473950a.T(M(), j17, this.f234009d);
    }

    public final r45.qt2 L() {
        r45.qt2 qt2Var = new r45.qt2();
        android.content.Context M = M();
        if (M == null) {
            return qt2Var;
        }
        pf5.z zVar = pf5.z.f353948a;
        if (M instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) M).c(zy2.ra.class))).V6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final android.content.Context M() {
        java.lang.ref.WeakReference weakReference = this.f234006a;
        if (weakReference != null) {
            return (android.content.Context) weakReference.get();
        }
        return null;
    }

    public void N(java.lang.String lotteryId, com.tencent.mm.protobuf.g gVar, ek2.z0 z0Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        if (zl2.r4.f473950a.w1()) {
            str = xy2.c.f(this.f234008c);
        } else {
            str = "";
            r3 = (!((mm2.n0) m(mm2.n0.class)).f329273r ? 0 : 1) != 0 ? 16 : 2;
        }
        java.lang.String str2 = str;
        r45.nw1 nw1Var = ((mm2.e1) m(mm2.e1.class)).f328988r;
        if (nw1Var != null) {
            pq5.g l17 = new ek2.a1(r3, str2, nw1Var.getLong(0), ((mm2.e1) m(mm2.e1.class)).f328983m, ((mm2.e1) m(mm2.e1.class)).f328985o, ((mm2.e1) m(mm2.e1.class)).f328992v, lotteryId, gVar, null).l();
            if (M() != null && (M() instanceof com.tencent.mm.ui.MMActivity)) {
                android.content.Context M = M();
                kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) M);
            }
            l17.K(new dk2.k2(z0Var, this));
        }
    }

    public void O(long j17, byte[] bArr, java.lang.String str, long j18, int i17, java.util.List songInfoList, ek2.l0 callback) {
        kotlin.jvm.internal.o.g(songInfoList, "songInfoList");
        kotlin.jvm.internal.o.g(callback, "callback");
        pq5.g l17 = new ek2.m0(j17, bArr, str, j18, i17, songInfoList, null).l();
        l17.K(new dk2.m2(callback));
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public void P(java.lang.String str, long j17, long j18, byte[] bArr, long j19, ek2.g1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pq5.g l17 = new ek2.h1(str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), bArr, j19, callback).l();
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q(android.content.Context r11, gk2.e r12, java.lang.String r13, r45.x32 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.Q(android.content.Context, gk2.e, java.lang.String, r45.x32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void R(com.tencent.mm.ui.MMActivity activity, long j17, long j18, java.lang.String str, java.lang.String anchorUsername, byte[] bArr, java.lang.String str2, int i17, java.lang.String str3, yz5.l lVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        pq5.g l17 = new ek2.j1(j17, j18, str, anchorUsername, bArr, zl2.r4.f473950a.w1() ? !((mm2.f6) m(mm2.f6.class)).f329033g ? 2 : 1 : 0, xy2.c.e(activity), ((mm2.c1) m(mm2.c1.class)).P3, str2, null, i17, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6(), str3, null, 8704, null).l();
        l17.K(new dk2.p2(lVar, str2, this));
        l17.f(activity);
    }

    public void S(java.lang.String str, long j17, ek2.c0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pq5.g l17 = new ek2.d0(str, j17, callback).l();
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public void T(long j17, yz5.p pVar) {
        com.tencent.mars.xlog.Log.i(this.f234009d, "[WeCoin] getWeCoinBalance: requestId:" + j17);
        pq5.g l17 = new r45.qr1().d().l();
        l17.K(new dk2.q2(this, pVar, j17));
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public long U() {
        km2.j jVar = ((mm2.v5) m(mm2.v5.class)).f329487m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] getWeCoinBalanceFromCache, balance = ");
        sb6.append(jVar != null ? java.lang.Long.valueOf(jVar.f309111a) : null);
        com.tencent.mars.xlog.Log.i(this.f234009d, sb6.toString());
        if (jVar != null) {
            return jVar.f309111a;
        }
        return 0L;
    }

    public void V(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Ai = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ai();
        if (Ai == null) {
            Ai = "";
        }
        intent.putExtra("key_live_anchor_type", com.tencent.mm.sdk.platformtools.t8.D0(((mm2.e1) m(mm2.e1.class)).f328987q.f380301n, ((mm2.c1) m(mm2.c1.class)).m8()) ? 1 : 2);
        intent.putExtra("key_live_id", pm0.v.u(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0)));
        intent.putExtra("key_live_attach", ((mm2.c1) m(mm2.c1.class)).f328803f4.f309050b);
        intent.putExtra("key_from", 3);
        intent.putExtra("key_session_id", Ai);
        java.lang.String str = (java.lang.String) kz5.n0.Z(((mm2.c1) m(mm2.c1.class)).f328803f4.f309049a);
        if (str != null) {
            intent.putExtra("key_finder_live_username", str);
        }
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        j45.l.j(context, "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
        com.tencent.mars.xlog.Log.i(this.f234009d, "goPrepareLuckyMoney liveId:" + ((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0) + ", luckyMoneyData:" + ((mm2.c1) m(mm2.c1.class)).f328803f4 + ", sessionId:" + Ai);
    }

    public void W(android.app.Activity context, r45.v62 luckyMoneySendInfo, android.os.ResultReceiver resultReceiver, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(luckyMoneySendInfo, "luckyMoneySendInfo");
        java.lang.String str = "goReceiveLuckyMoney hashCode: " + ((mm2.c1) m(mm2.c1.class)).hashCode() + " visitorRole:" + ((mm2.c1) m(mm2.c1.class)).I7().getInteger(2);
        java.lang.String str2 = this.f234009d;
        com.tencent.mars.xlog.Log.i(str2, str);
        android.os.Bundle bundle = new android.os.Bundle();
        if (((mm2.c1) m(mm2.c1.class)).I7().getInteger(2) == 3 && !zl2.r4.f473950a.w1()) {
            if (lVar != null) {
                lVar.invoke(1);
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1.ii((c50.c1) c17, ml2.f5.f327464o, ml2.e5.f327389e, true, 0, 8, null);
            return;
        }
        if (((mm2.c1) m(mm2.c1.class)).I7().getInteger(2) == 2 && !zl2.r4.f473950a.w1()) {
            if (lVar != null) {
                lVar.invoke(2);
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c50.c1.ii((c50.c1) c18, ml2.f5.f327464o, ml2.e5.f327389e, true, 0, 8, null);
            return;
        }
        java.lang.String string = (((mm2.c1) m(mm2.c1.class)).I7().getInteger(2) == 1 || zl2.r4.f473950a.w1()) ? null : context.getResources().getString(com.tencent.mm.R.string.e2f);
        java.lang.String Ai = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ai();
        if (Ai == null) {
            Ai = "";
        }
        ot0.q v17 = ot0.q.v(luckyMoneySendInfo.getString(5));
        bundle.putInt("key_live_anchor_type", com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneySendInfo.getString(4)) ? 1 : 2);
        bundle.putString("key_live_error_msg", string);
        bundle.putString("key_live_id", pm0.v.u(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0)));
        bundle.putString("key_live_attach", ((mm2.c1) m(mm2.c1.class)).f328803f4.f309050b);
        bundle.putInt("key_from", 3);
        bundle.putString("key_session_id", Ai);
        bundle.putString("key_username", ((mm2.c1) m(mm2.c1.class)).f328852o);
        bundle.putParcelable("key_open_result_receiver", resultReceiver == null ? new android.os.ResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper())) : resultReceiver);
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        bundle.putString("key_live_session_buff", e1Var != null ? e1Var.f328993w : null);
        bundle.putLong("key_live_start_time", ((ml2.r0) i95.n0.c(ml2.r0.class)).f327865d);
        bundle.putString("key_live_feed_id", pm0.v.u(((mm2.e1) m(mm2.e1.class)).f328983m));
        bundle.putLong("key_live_enter_session_id", ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = r0Var.f327865d;
        bundle.putLong("key_live_now_live_time", currentTimeMillis > j17 ? currentTimeMillis - j17 : 0L);
        ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).getClass();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        intent.putExtra("key_way", 0);
        intent.putExtra("key_native_url", v17.f348704r1);
        intent.putExtra("scene_id", java.lang.Integer.parseInt(v17.f348700q1));
        intent.putExtra("key_invalidtime", v17.M0);
        ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
        ot0.j jVar = (ot0.j) v17.y(ot0.j.class);
        intent.putExtra("key_exclusive_username", cVar.f348421n);
        intent.putExtra("key_cropname", cVar.f348411d);
        intent.putExtra("key_receive_envelope_url", cVar.f348416i);
        intent.putExtra("key_receive_envelope_md5", cVar.f348417j);
        intent.putExtra("key_receive_envelope_widget_url", cVar.f348422o);
        intent.putExtra("key_receive_envelope_widget_md5", cVar.f348423p);
        intent.putExtra("key_receive_envelope_dynamic_url", cVar.f348433z);
        intent.putExtra("key_receive_envelope_dynamic_md5", cVar.A);
        intent.putExtra("key_receive_envelope_dynamic_type", cVar.B);
        intent.putExtra("key_detail_envelope_dynamic_url", cVar.C);
        intent.putExtra("key_detail_envelope_dynamic_md5", cVar.D);
        intent.putExtra("key_receive_envelope_atmosphere_dynamic_url", cVar.F);
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_url", cVar.G);
        intent.putExtra("key_full_envelope_atmosphere_dynamic_url", cVar.H);
        intent.putExtra("key_detail_envelope_url", cVar.f348418k);
        intent.putExtra("key_detail_envelope_md5", cVar.f348419l);
        intent.putExtra("key_about_url", jVar.f348538j);
        intent.putExtra("key_packet_id", jVar.f348539k);
        intent.putExtra("key_receive_envelope_widget_status_flag", cVar.f348428u);
        intent.putExtra("key_receive_envelope_fission_info", cVar.f348429v);
        intent.putExtra("key_packet_source", jVar.f348540l);
        intent.putExtra("key_has_story", jVar.f348543o);
        intent.putExtra("key_material_flag", jVar.f348544p);
        if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).aj()) {
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyNewReceiveUI", intent, null);
        } else {
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyNotHookReceiveUI", intent, null);
        }
        com.tencent.mars.xlog.Log.i(str2, "goReceiveLuckyMoney liveId:" + ((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0) + ", clientBuff:" + ((mm2.c1) m(mm2.c1.class)).f328803f4.f309050b + ", sessionId:" + Ai + ", anchorUsername:" + ((mm2.c1) m(mm2.c1.class)).f328852o + ", appMsgContent:" + v17);
        if (lVar != null) {
            lVar.invoke(0);
        }
    }

    public void X(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.content.Intent intent = new android.content.Intent();
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.c(activity, i17, 1, 30, 1, false, intent);
    }

    public void Y(android.content.Context context, android.content.Intent intent, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(context, "context");
        ((mm2.c1) m(mm2.c1.class)).O1 = false;
        if (intent == null) {
            return;
        }
        if (num != null) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, num.intValue());
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public void Z(com.tencent.mm.ui.MMActivity activity, java.lang.String stockId, int i17, int i18, long j17, yz5.s sVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(stockId, "stockId");
        new ek2.l1(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) m(mm2.e1.class)).f328983m, ((mm2.c1) m(mm2.c1.class)).f328852o, stockId, i17, i18, j17, new dk2.v2(sVar)).l().f(activity);
    }

    public void a0(com.tencent.mm.ui.MMActivity activity, long j17, long j18, java.lang.String audienceUsername, r45.hx0 finderCmdItem, yz5.q qVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(audienceUsername, "audienceUsername");
        kotlin.jvm.internal.o.g(finderCmdItem, "finderCmdItem");
        new ek2.u1(j17, j18, audienceUsername, finderCmdItem, new dk2.x2(qVar, finderCmdItem, this)).l().f(activity);
    }

    public void b0(android.os.Bundle bundle, java.lang.Object obj, java.lang.String keyUsername) {
        kotlin.jvm.internal.o.g(keyUsername, "keyUsername");
        android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
        if (bundle2 != null) {
            java.lang.String string = bundle2.getString(keyUsername);
            if (!(string == null || string.length() == 0)) {
                dk2.q4.j(dk2.q4.f233938a, M(), this.f234007b, false, string, this.f234008c, false, null, 96, null);
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f234009d, "onPostGoToVisitorProfileResult finderUsername:" + string);
        }
    }

    public final km2.b c0(r45.l71 resp) {
        int i17;
        long j17;
        r45.i72 i72Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        int e17 = c01.id.e();
        r45.nw1 nw1Var = (r45.nw1) resp.getCustom(1);
        int integer = nw1Var != null ? nw1Var.getInteger(6) : 0;
        if (integer == 0) {
            integer = e17;
        }
        r45.nw1 nw1Var2 = (r45.nw1) resp.getCustom(1);
        int integer2 = nw1Var2 != null ? nw1Var2.getInteger(4) : 0;
        if (integer2 != 0) {
            e17 = integer2;
        }
        int i18 = integer - e17;
        r45.nw1 nw1Var3 = (r45.nw1) resp.getCustom(1);
        int integer3 = nw1Var3 != null ? nw1Var3.getInteger(1) : 0;
        r45.nw1 nw1Var4 = (r45.nw1) resp.getCustom(1);
        long j18 = nw1Var4 != null ? nw1Var4.getLong(19) : 0L;
        int integer4 = resp.getInteger(2);
        long F0 = zl2.r4.f473950a.F0((r45.nw1) resp.getCustom(1));
        r45.nw1 nw1Var5 = (r45.nw1) resp.getCustom(1);
        int integer5 = nw1Var5 != null ? nw1Var5.getInteger(36) : 0;
        r45.nw1 nw1Var6 = (r45.nw1) resp.getCustom(1);
        int integer6 = nw1Var6 != null ? nw1Var6.getInteger(35) : 0;
        r45.nw1 nw1Var7 = (r45.nw1) resp.getCustom(1);
        long j19 = nw1Var7 != null ? nw1Var7.getLong(50) : 0L;
        int integer7 = resp.getInteger(5);
        r45.nw1 nw1Var8 = (r45.nw1) resp.getCustom(1);
        long j27 = nw1Var8 != null ? nw1Var8.getLong(62) : 0L;
        r45.nw1 nw1Var9 = (r45.nw1) resp.getCustom(1);
        long j28 = nw1Var9 != null ? nw1Var9.getLong(63) : 0L;
        r45.nw1 nw1Var10 = (r45.nw1) resp.getCustom(1);
        if (nw1Var10 != null) {
            i17 = integer5;
            j17 = nw1Var10.getLong(32);
        } else {
            i17 = integer5;
            j17 = 0;
        }
        boolean A = pm0.v.A(j17, 16L);
        r45.nw1 nw1Var11 = (r45.nw1) resp.getCustom(1);
        long j29 = nw1Var11 != null ? nw1Var11.getLong(65) : 0L;
        r45.nw1 nw1Var12 = (r45.nw1) resp.getCustom(1);
        long j37 = nw1Var12 != null ? nw1Var12.getLong(64) : 0L;
        java.util.LinkedList list = resp.getList(7);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) resp.getCustom(12);
        int integer8 = resp.getInteger(14);
        r45.nw1 nw1Var13 = (r45.nw1) resp.getCustom(1);
        int integer9 = (nw1Var13 == null || (i72Var = (r45.i72) nw1Var13.getCustom(44)) == null) ? 0 : i72Var.getInteger(3);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) resp.getCustom(16);
        r45.nw1 nw1Var14 = (r45.nw1) resp.getCustom(1);
        r45.sl1 sl1Var = (r45.sl1) resp.getCustom(36);
        kotlin.jvm.internal.o.d(list);
        return new km2.b(i18, integer3, j18, integer4, F0, integer6, i17, j19, integer7, j27, j28, A, j29, j37, list, integer8, finderJumpInfo, integer9, finderJumpInfo2, nw1Var14, sl1Var, resp, null, 4194304, null);
    }

    public void d0(int i17, int i18, ek2.v1 v1Var) {
        kn0.p pVar;
        boolean z17 = false;
        pq5.g l17 = new ek2.w1(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), xy2.c.f(this.f234008c), ((mm2.e1) m(mm2.e1.class)).f328983m, 0, i17, i18, v1Var).l();
        if (i18 == 1 || M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && (pVar = w0Var.D) != null && !pVar.f()) {
            z17 = true;
        }
        if (z17) {
            android.content.Context M = M();
            kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) M);
        }
    }

    public final void e0() {
        gk2.e eVar = this.f234007b;
        java.util.ArrayList arrayList = ((mm2.u0) eVar.a(mm2.u0.class)).f329449o;
        if (arrayList.isEmpty()) {
            return;
        }
        pq5.g l17 = new ek2.r1(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, 1, ek2.r1.f253524u.a(arrayList)).l();
        l17.K(new dk2.y2(this));
        if (M() != null && (M() instanceof com.tencent.mm.ui.MMActivity)) {
            android.content.Context M = M();
            kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) M);
        }
        ((mm2.u0) eVar.a(mm2.u0.class)).f329449o.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f0(gk2.e r17, java.lang.String r18, r45.ch1 r19, r45.xn1 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.f0(gk2.e, java.lang.String, r45.ch1, r45.xn1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void g0(int i17) {
        com.tencent.mm.plugin.finder.assist.o0 o0Var = com.tencent.mm.plugin.finder.assist.o0.f102420a;
        gk2.e eVar = this.f234007b;
        o0Var.e("joinlive", i17, eVar);
        ((mm2.c1) eVar.a(mm2.c1.class)).W6("joinlive", i17);
        ((mm2.c1) eVar.a(mm2.c1.class)).T6("joinlive", i17);
        ((mm2.c1) eVar.a(mm2.c1.class)).V6("joinlive", i17);
        ((mm2.c1) m(mm2.c1.class)).Q1 = i17;
        ((on2.z2) m(on2.z2.class)).f7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d3, code lost:
    
        if ((r2 instanceof so2.j5) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0df9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0e22  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0dfe  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0ec5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x105a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x107f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x109a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x10ad  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:374:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x10b1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1086  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1060  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0f27  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0ea6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0e8f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0e73  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(r45.hc1 r59, int r60, yz5.u r61) {
        /*
            Method dump skipped, instructions count: 4399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.h0(r45.hc1, int, yz5.u):void");
    }

    public final void i0(r45.hc1 hc1Var) {
        r45.gl1 gl1Var = (r45.gl1) hc1Var.getCustom(45);
        if (gl1Var != null) {
            gk2.e buContext = this.f234007b;
            kotlin.jvm.internal.o.g(buContext, "buContext");
            gl1Var.getString(0);
            com.tencent.mars.xlog.Log.i("Finder.OlympicsLiveRoomUtil", "processAudienceEventInfo joinLive, token:" + gl1Var.getString(0));
        }
    }

    public void j0(java.lang.String str, boolean z17, zy2.gc gcVar) {
        com.tencent.mars.xlog.Log.i(this.f234009d, "putInBlackList username:" + str + " isBlack: " + z17);
        if (str != null) {
            boolean z18 = ((mm2.c1) m(mm2.c1.class)).T;
            boolean z19 = ((mm2.n0) m(mm2.n0.class)).f329273r;
            if (!z18 && !z19) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y.f280114e.r(str, z17, gcVar);
                return;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f280114e;
            java.lang.String anchorUsername = ((mm2.c1) m(mm2.c1.class)).f328852o;
            java.lang.String f17 = xy2.c.f(this.f234008c);
            long j17 = ((mm2.e1) m(mm2.e1.class)).f328983m;
            yVar.getClass();
            kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
            com.tencent.mars.xlog.Log.i(hb2.y.f280115f, "modifyLiveBlackList anchorUsername:" + anchorUsername + ", username:" + str + ", opUsername:" + f17 + ", liveroomObjectId:" + j17);
            r45.kh2 kh2Var = new r45.kh2();
            kh2Var.set(3, str);
            if (z17) {
                kh2Var.set(0, 1);
            } else {
                kh2Var.set(0, 2);
            }
            if (j17 != 0) {
                kh2Var.set(10, java.lang.Long.valueOf(j17));
            }
            hb2.w0.a(yVar, anchorUsername, kh2Var, gcVar, false, false, f17, 24, null);
        }
    }

    public void k(r45.xn1 toContact, int i17, int i18, ek2.f fVar) {
        kotlin.jvm.internal.o.g(toContact, "toContact");
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, toContact);
        ch1Var.getList(6).add(toContact);
        r45.ih1 ih1Var = new r45.ih1();
        ih1Var.set(1, java.lang.Integer.valueOf(i17));
        ih1Var.set(0, 1);
        ih1Var.set(2, java.lang.Integer.valueOf(i18));
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(ih1Var.toByteArray()));
        ch1Var.set(1, 20104);
        ch1Var.set(2, zl2.q4.f473933a.m());
        new ek2.g(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) m(mm2.e1.class)).f328983m, ((mm2.e1) m(mm2.e1.class)).f328992v, ((mm2.e1) m(mm2.e1.class)).f328985o, 1, ch1Var, new dk2.v0(this, toContact, i17, fVar)).l();
    }

    public void k0(byte[] bArr, long j17, long j18, java.lang.String objectNonceId, java.lang.String finderUserName, int i17, int i18, ke2.f0 f0Var) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        com.tencent.mars.xlog.Log.i(this.f234009d, "randomLinkMic: liveId:" + j17 + ", objectId:" + j18 + ", objectNonceId:" + objectNonceId + ", finderUserName:" + finderUserName + ", opCode:" + i17);
        pq5.g l17 = new ke2.g0(bArr, j17, j18, objectNonceId, finderUserName, i17, i18, f0Var).l();
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public void l(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.xn1 xn1Var, dk2.a requestParams, ek2.h hVar) {
        r45.xn1 xn1Var2 = xn1Var;
        kotlin.jvm.internal.o.g(requestParams, "requestParams");
        java.lang.String str2 = this.f234009d;
        com.tencent.mars.xlog.Log.i(str2, "applyLinkMic liveId:" + j17 + ", objectId:" + j18 + ", nonceId:" + str + ", scene:" + i17 + ", requestParams:" + requestParams);
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, xn1Var2);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (xn1Var2 == null) {
            xn1Var2 = new r45.xn1();
        }
        linkedList.add(xn1Var2);
        ch1Var.set(6, linkedList);
        com.tencent.mars.xlog.Log.i(str2, "genApplyLinkMicMsg requestParams: " + requestParams);
        r45.lh1 lh1Var = new r45.lh1();
        lh1Var.set(0, java.lang.Integer.valueOf(requestParams.f233159a));
        lh1Var.set(1, java.lang.Integer.valueOf(requestParams.f233160b));
        lh1Var.set(2, java.lang.Boolean.valueOf(requestParams.f233161c));
        byte[] bArr2 = requestParams.f233162d;
        lh1Var.set(3, bArr2 != null ? new com.tencent.mm.protobuf.g(bArr2, 0, bArr2.length) : null);
        lh1Var.set(8, requestParams.f233163e);
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(lh1Var.toByteArray()));
        ch1Var.set(1, 20003);
        ch1Var.set(2, zl2.q4.f473933a.m());
        pq5.g l17 = new ek2.i(j17, j18, str, bArr, i17, ch1Var, hVar).l();
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public void l0(com.tencent.mm.ui.MMActivity activity, cm2.m0 product, yz5.p pVar) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(product, "product");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList list = product.f43368v.getList(19);
        if (list != null) {
            for (r45.l90 l90Var : kz5.n0.V(list)) {
                if (l90Var.getInteger(2) > 0 && (string = l90Var.getString(1)) != null) {
                    linkedList.add(string);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            m0(activity, linkedList, false, new dk2.e3(this, pVar));
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f234009d, "empty stockIds");
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, null);
        }
    }

    public androidx.lifecycle.c1 m(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return this.f234007b.a(bu6);
    }

    public void m0(com.tencent.mm.ui.MMActivity activity, java.util.LinkedList stockIds, boolean z17, yz5.p pVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(stockIds, "stockIds");
        boolean z18 = g92.b.f269769e.k2().getInteger(4) == 3;
        zl2.r4.f473950a.h3(activity, true);
        new db2.d2(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) m(mm2.e1.class)).f328983m, ((mm2.c1) m(mm2.c1.class)).f328852o, z18 ? xy2.c.e(activity) : null, com.tencent.mm.protobuf.g.b(((mm2.e1) m(mm2.e1.class)).f328985o), stockIds, new dk2.g3(activity, pVar, z17), "").l().f(activity);
    }

    public void n(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        pm0.v.X(new dk2.w0(this, view, i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n0(gk2.e r9, r45.n72 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof dk2.h3
            if (r0 == 0) goto L13
            r0 = r11
            dk2.h3 r0 = (dk2.h3) r0
            int r1 = r0.f233559g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233559g = r1
            goto L18
        L13:
            dk2.h3 r0 = new dk2.h3
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f233557e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f233559g
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r9 = r0.f233556d
            dk2.r4 r9 = (dk2.r4) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto Ld0
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Class<mm2.c1> r11 = mm2.c1.class
            androidx.lifecycle.c1 r11 = r9.a(r11)
            mm2.c1 r11 = (mm2.c1) r11
            java.lang.String r11 = r11.f328852o
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r9 = r9.a(r2)
            mm2.e1 r9 = (mm2.e1) r9
            long r4 = r9.f328983m
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "[reportTaskAction] action:"
            r9.<init>(r2)
            int r2 = r10.f381129d
            r9.append(r2)
            java.lang.String r2 = ", anchorUsername:"
            r9.append(r2)
            r9.append(r11)
            java.lang.String r2 = ", objectId:"
            r9.append(r2)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = r8.f234009d
            com.tencent.mars.xlog.Log.i(r2, r9)
            r45.l72 r9 = new r45.l72
            r9.<init>()
            db2.t4 r2 = db2.t4.f228171a
            r45.qt2 r6 = r8.L()
            r7 = 16416(0x4020, float:2.3004E-41)
            r45.kv0 r2 = r2.b(r7, r6)
            r9.set(r3, r2)
            r2 = 4
            r9.set(r2, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = c01.z1.r()
            r11.append(r2)
            r2 = 95
            r11.append(r2)
            r11.append(r4)
            r11.append(r2)
            long r6 = java.lang.System.currentTimeMillis()
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r2 = 3
            r9.set(r2, r11)
            r11 = 2
            int r10 = r10.f381129d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.set(r11, r10)
            r10 = 5
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            r9.set(r10, r11)
            com.tencent.mm.modelbase.i r9 = r9.d()
            r0.f233556d = r8
            r0.f233559g = r3
            java.lang.Object r11 = rm0.h.b(r9, r0)
            if (r11 != r1) goto Lcf
            return r1
        Lcf:
            r9 = r8
        Ld0:
            com.tencent.mm.modelbase.f r11 = (com.tencent.mm.modelbase.f) r11
            java.lang.String r9 = r9.f234009d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "[reportTaskAction] errCode = "
            r10.<init>(r0)
            int r0 = r11.f70616b
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r9, r10)
            com.tencent.mm.protobuf.f r9 = r11.f70618d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.n0(gk2.e, r45.n72, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(android.content.Context r18, ce2.i r19, r45.yi6 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.o(android.content.Context, ce2.i, r45.yi6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void o0(long j17, long j18, long j19, int i17, boolean z17, ke2.f fVar) {
        r45.il4 il4Var;
        r45.o63 o63Var;
        r45.o63 o63Var2;
        df2.oj ojVar;
        java.lang.String str;
        r45.kv1 kv1Var;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i(this.f234009d, "setAnchorStatus liveId:" + j17 + " objectId:" + j18 + " flag:" + j19 + " micSetting[" + ((mm2.o4) m(mm2.o4.class)).U.f377129d + ':' + ((mm2.o4) m(mm2.o4.class)).U.f377130e + ']');
        if (z17) {
            il4Var = null;
        } else {
            il4Var = new r45.il4();
            if (pm0.v.z((int) j19, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                ((mm2.o4) m(mm2.o4.class)).U.f377129d = 0L;
            }
            il4Var.f377129d = ((mm2.o4) m(mm2.o4.class)).U.f377129d;
            il4Var.f377132g = ((mm2.o4) m(mm2.o4.class)).U.f377132g;
            il4Var.f377134i = ((mm2.o4) m(mm2.o4.class)).U.f377134i;
            il4Var.f377135m = ((mm2.o4) m(mm2.o4.class)).U.f377135m;
        }
        r45.rw2 rw2Var = new r45.rw2();
        rw2Var.set(1, java.lang.String.valueOf(((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) m(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i));
        rw2Var.set(2, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) m(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h));
        rw2Var.set(3, ko0.l0.f309878a.b().f320063d.f320035a);
        rw2Var.set(4, dk2.ug.f234218a.a());
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (ojVar = (df2.oj) k0Var.getController(df2.oj.class)) == null || (str = ((mm2.c1) m(mm2.c1.class)).f328783b5) == null) {
            o63Var = null;
        } else {
            java.util.HashMap hashMap = ojVar.f230981w;
            df2.zi ziVar = (df2.zi) hashMap.get(str);
            java.lang.Integer num = ziVar != null ? ziVar.f231970a : null;
            if (num != null) {
                int intValue = num.intValue();
                mm2.c1 c1Var = (mm2.c1) m(mm2.c1.class);
                o63Var = new r45.o63();
                o63Var.f381980d = c1Var.H2;
                o63Var.f381981e = c1Var.r7();
                o63Var.f381980d = intValue;
            } else {
                o63Var = null;
            }
            df2.zi ziVar2 = (df2.zi) hashMap.get(str);
            r45.l73 l73Var = ziVar2 != null ? ziVar2.f231971b : null;
            if (l73Var != null && o63Var != null) {
                r45.k73 k73Var = new r45.k73();
                java.util.LinkedList<r45.pt3> list = l73Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getGift_teamup_info(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.pt3 pt3Var : list) {
                    r45.m73 m73Var = new r45.m73();
                    r45.kv1 kv1Var2 = (r45.kv1) pt3Var.getCustom(0);
                    if (kv1Var2 == null || (str2 = kv1Var2.getString(0)) == null) {
                        str2 = "";
                    }
                    m73Var.f380179d = str2;
                    m73Var.f380180e = pt3Var.getInteger(1);
                    arrayList.add(m73Var);
                }
                k73Var.f378451d = new java.util.LinkedList(arrayList);
                k73Var.f378452e = l73Var.getBoolean(1);
                r45.m73 m73Var2 = new r45.m73();
                r45.pt3 pt3Var2 = (r45.pt3) l73Var.getCustom(2);
                m73Var2.f380179d = (pt3Var2 == null || (kv1Var = (r45.kv1) pt3Var2.getCustom(0)) == null) ? null : kv1Var.getString(0);
                r45.pt3 pt3Var3 = (r45.pt3) l73Var.getCustom(2);
                m73Var2.f380180e = pt3Var3 != null ? pt3Var3.getInteger(1) : 0;
                k73Var.f378453f = m73Var2;
                o63Var.f381982f = k73Var;
            }
        }
        java.lang.String f17 = xy2.c.f(this.f234008c);
        if (i17 != 1) {
            o63Var2 = null;
        } else if (((mm2.c1) m(mm2.c1.class)).A7() == null) {
            mm2.c1 c1Var2 = (mm2.c1) m(mm2.c1.class);
            r45.o63 o63Var3 = new r45.o63();
            o63Var3.f381980d = c1Var2.H2;
            o63Var3.f381981e = c1Var2.r7();
            o63Var2 = o63Var3;
        } else {
            o63Var2 = o63Var;
        }
        new ke2.g(j17, j18, j19, f17, i17, il4Var, o63Var2, ((on2.z2) m(on2.z2.class)).f347097r, i17 == 1 ? ((mm2.c1) m(mm2.c1.class)).Y5 : null, 0L, fVar, rw2Var, 512, null).l();
    }

    public final void p(r45.hc1 hc1Var) {
        boolean g76 = ((mm2.e1) m(mm2.e1.class)).g7();
        java.lang.String str = this.f234009d;
        if (!g76) {
            com.tencent.mars.xlog.Log.i(str, "not VoiceRoomLive, ignore");
            return;
        }
        r45.up1 up1Var = (r45.up1) hc1Var.getCustom(68);
        com.tencent.mars.xlog.Log.i(str, "micExtFlag: " + (up1Var != null ? up1Var.getLong(0) : 0L));
        r45.up1 up1Var2 = (r45.up1) hc1Var.getCustom(68);
        boolean A = pm0.v.A(up1Var2 != null ? up1Var2.getLong(0) : 0L, 131072);
        mm2.c1 c1Var = (mm2.c1) m(mm2.c1.class);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(A);
        if (kotlin.jvm.internal.o.b(c1Var.f328847n2, valueOf)) {
            return;
        }
        java.lang.Boolean bool = c1Var.f328847n2;
        java.lang.String str2 = c1Var.f328800f;
        if (bool != null) {
            com.tencent.mm.sdk.platformtools.Log.c(str2, "usePublishMediaStream is " + c1Var.f328847n2 + ", ignore", new java.lang.Object[0]);
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c(str2, "usePublishMediaStream change to " + valueOf, new java.lang.Object[0]);
        c1Var.f328847n2 = valueOf;
    }

    public void p0(long j17, long j18, long j19, long j27, int i17, ke2.f fVar) {
        com.tencent.mars.xlog.Log.i(this.f234009d, "setAnchorStatus opFlag:" + pm0.v.u(j27) + ", liveId:" + j17 + " objectId:" + j18 + " flag:" + j19 + " micSetting[" + ((mm2.o4) m(mm2.o4.class)).U.f377129d + ':' + ((mm2.o4) m(mm2.o4.class)).U.f377130e + ']');
        new ke2.g(j17, j18, j19, xy2.c.f(this.f234008c), i17, null, null, null, null, j27, fVar, null, 2528, null).l();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.q(android.content.Intent):boolean");
    }

    public void q0(long j17, long j18, long j19, java.lang.String str, r45.kf5 kf5Var, boolean z17, long j27, int i17, ke2.f fVar) {
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i(this.f234009d, "setMicSetting liveId:" + j17 + " focusMicUserId: " + str2 + " objectId:" + j18 + " micSettingFlag:" + j19 + " pkSettingFlag:" + j27 + " baseMicMode:" + i17 + " BUPROVIDER.get(LiveLinkMicSlice::class.java).micSetting[" + ((mm2.o4) m(mm2.o4.class)).U.f377129d + ':' + ((mm2.o4) m(mm2.o4.class)).U.f377130e + ']');
        r45.il4 il4Var = new r45.il4();
        il4Var.f377129d = j19;
        if (str2 == null) {
            str2 = "";
        }
        il4Var.f377131f = str2;
        il4Var.f377132g = kf5Var;
        il4Var.f377133h = z17;
        il4Var.f377134i = j27;
        il4Var.f377135m = i17;
        long j28 = ((mm2.c1) m(mm2.c1.class)).f328866q;
        java.lang.String f17 = xy2.c.f(this.f234008c);
        int i18 = ke2.g.f306946x;
        pq5.g l17 = new ke2.g(j17, j18, j28, f17, 0, il4Var, null, null, null, 0L, fVar, null, 2512, null).l();
        if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        android.content.Context M = M();
        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) M);
    }

    public void r(android.app.Activity activity, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Intent intent = new android.content.Intent();
        java.util.LinkedList linkedList = ((mm2.c1) m(mm2.c1.class)).V3;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.of1) it.next()).toByteArray());
        }
        intent.putExtra("KEY_VISITOR_ROLE_LIST", arrayList);
        intent.putExtra("KEY_VISITOR_ROLE", ((mm2.c1) m(mm2.c1.class)).c7());
        intent.putExtra("KEY_MODIFY_TIME", ((mm2.c1) m(mm2.c1.class)).W3);
        intent.putExtra("KEY_SOURCE", 1);
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        intent.putExtra("KEY_IS_FROM_SETTING", z17);
        intent.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.f302772s).getValue());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(1009);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveVisitorRoleUI", "(Landroid/app/Activity;Landroid/content/Intent;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
    }

    public final void r0(java.lang.String str) {
        pm0.v.X(new dk2.s3(this, str));
    }

    public void s(int i17, int i18, r45.xn1 xn1Var, java.lang.String str, java.lang.String str2, ek2.l lVar) {
        java.lang.String str3;
        boolean w17 = zl2.r4.f473950a.w1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeLinkMic isAnchor:");
        sb6.append(w17);
        sb6.append(", linkMicState:");
        sb6.append(((mm2.o4) m(mm2.o4.class)).C);
        sb6.append(", liveId:");
        sb6.append(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0));
        sb6.append(", objectId:");
        sb6.append(((mm2.e1) m(mm2.e1.class)).f328983m);
        sb6.append(", nonceId:");
        sb6.append(((mm2.e1) m(mm2.e1.class)).f328992v);
        sb6.append(", scene:");
        sb6.append(i17);
        sb6.append(", userId:");
        km2.q l76 = ((mm2.o4) m(mm2.o4.class)).l7();
        sb6.append(l76 != null ? l76.f309170a : null);
        sb6.append(", selfSdkId:");
        sb6.append(((mm2.c1) m(mm2.c1.class)).m8());
        sb6.append(", sessionId:");
        km2.q l77 = ((mm2.o4) m(mm2.o4.class)).l7();
        if (l77 == null || (str3 = l77.f309175f) == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", applySessionId:");
        sb6.append(((mm2.o4) m(mm2.o4.class)).f329317n);
        com.tencent.mars.xlog.Log.i(this.f234009d, sb6.toString());
        long j17 = ((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) m(mm2.e1.class)).f328983m;
        java.lang.String str4 = ((mm2.e1) m(mm2.e1.class)).f328992v;
        byte[] bArr = ((mm2.e1) m(mm2.e1.class)).f328985o;
        java.lang.String str5 = str == null ? "" : str;
        java.lang.String str6 = str2 != null ? str2 : "";
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(7, str6);
        r45.xh1 xh1Var = new r45.xh1();
        xh1Var.set(0, str5);
        xh1Var.set(1, java.lang.Integer.valueOf(i18));
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(xh1Var.toByteArray()));
        ch1Var.set(1, 20005);
        ch1Var.set(2, zl2.q4.f473933a.m());
        new ek2.m(j17, j18, str4, bArr, i17, ch1Var, lVar).l();
    }

    public js4.k s0(androidx.fragment.app.FragmentActivity context, int i17, int i18, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String Ai = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ai();
        if (Ai == null) {
            Ai = "";
        }
        com.tencent.mars.xlog.Log.i(this.f234009d, "showRechargeFoodsDialog diffWecoinCount:" + i18 + ", sessionId:" + Ai);
        js4.n nVar = new js4.n();
        nVar.f301543a = i17;
        nVar.f301545c = Ai;
        nVar.f301555m = true;
        nVar.f301553k = i18;
        nVar.f301546d = new dk2.u3(this, context, callback);
        nVar.f301549g = js4.m.COMMON_CHARGE;
        return ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(context, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.t(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t0(android.content.Context r18, ce2.i r19, r45.yi6 r20, java.lang.String r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.t0(android.content.Context, ce2.i, r45.yi6, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void u(int i17, yz5.s sVar) {
        long j17 = ((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) m(mm2.e1.class)).f328983m;
        java.lang.String str = "doCloseLive liveId:" + j17 + " objectId:" + j18 + " nonceId:" + ((mm2.e1) m(mm2.e1.class)).f328992v;
        java.lang.String str2 = this.f234009d;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (j17 == 0 || j18 == 0) {
            com.tencent.mars.xlog.Log.i(str2, "doCloseLive return by invalid params");
        } else {
            new ek2.k(j17, xy2.c.f(this.f234008c), j18, ((mm2.e1) m(mm2.e1.class)).f328992v, i17, new dk2.a1(this, sVar)).l();
            new com.tencent.mm.autogen.events.FeedLiveLifeEvent().e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(yz5.u r51) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r4.v(yz5.u):void");
    }

    public void w(java.lang.String str, boolean z17, int i17, yz5.p pVar) {
        if (str != null) {
            pq5.g l17 = new ke2.j(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) m(mm2.e1.class)).f328983m, str, i17, z17, new dk2.d1(this, str, i17, pVar)).l();
            if (M() == null || !(M() instanceof com.tencent.mm.ui.MMActivity)) {
                return;
            }
            android.content.Context M = M();
            kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) M);
        }
    }

    public void x(java.lang.String str, yz5.p pVar, yz5.p pVar2) {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.b6.ji((zy2.b6) c17, str == null ? "" : str, 0L, null, 0, null, 0, 0L, true, null, null, null, pVar, pVar2, 1896, null);
    }

    public void y(kotlinx.coroutines.y0 scope, boolean z17, yz5.s sVar) {
        kotlin.jvm.internal.o.g(scope, "scope");
        com.tencent.mars.xlog.Log.i(this.f234009d, "doFinishLive manualFinish:" + z17);
        ((ku5.t0) ku5.t0.f312615d).h(new dk2.f1(scope, z17, this, sVar), "doFinishLive");
    }

    public void z(java.lang.String str, int i17, com.tencent.mm.protobuf.g gVar, boolean z17, long j17, r45.yn1 yn1Var, yz5.p pVar) {
        android.content.Context M;
        if (str != null) {
            ke2.t tVar = new ke2.t(((mm2.e1) m(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) m(mm2.e1.class)).f328983m, str, i17, gVar, yn1Var, null);
            if (z17 && (M = M()) != null) {
                az2.j.u(tVar, M, null, j17, 2, null);
            }
            pq5.g l17 = tVar.l();
            if (M() != null && (M() instanceof com.tencent.mm.ui.MMActivity)) {
                android.content.Context M2 = M();
                kotlin.jvm.internal.o.e(M2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) M2);
            }
            l17.K(new dk2.h1(this, str, pVar));
        }
    }
}
