package dt4;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final dt4.h f243266f = new dt4.h(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f243267g = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f243268a;

    /* renamed from: b, reason: collision with root package name */
    public int f243269b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f243270c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.sync.m f243271d = kotlinx.coroutines.sync.p.a(3, 0, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public dt4.i f243272e;

    public p(java.lang.String str, kotlin.jvm.internal.i iVar) {
        this.f243268a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r12.f(r4, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dt4.p r12, long r13, boolean r15) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt4.p.a(dt4.p, long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x02cd -> B:10:0x02ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0275 -> B:11:0x0280). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(dt4.p r16, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt4.p.b(dt4.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0369 -> B:10:0x036c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x00ed -> B:11:0x0135). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(dt4.p r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt4.p.c(dt4.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void d(dt4.p pVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "try initComplete cgi:" + ((java.util.ArrayList) pVar.f243270c).size());
        if (((java.util.ArrayList) pVar.f243270c).isEmpty()) {
            dt4.h hVar = f243266f;
            java.lang.String talker = pVar.f243268a;
            synchronized (hVar) {
                kotlin.jvm.internal.o.g(talker, "talker");
                java.util.Map map = f243267g;
                if (map.containsKey(talker)) {
                    map.remove(talker);
                }
            }
            pVar.s(3);
        }
    }

    public final boolean e(com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        com.tencent.mm.wallet_core.ui.m1 m1Var;
        if (o(qVar.f348736z1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "aa hasRecord msgid:" + f9Var.getMsgId() + " transferId:" + qVar.f348736z1 + '!');
            return false;
        }
        dm.ec ecVar = new dm.ec();
        ecVar.W0(qVar.f348736z1);
        ecVar.P0(this.f243268a);
        ecVar.L0(f9Var.getCreateTime());
        ecVar.I0(com.tencent.mm.wallet_core.ui.r1.t(f9Var.getCreateTime()));
        ecVar.J0(f9Var.getMsgId());
        ecVar.T0(101);
        com.tencent.mm.wallet_core.ui.m1 z17 = com.tencent.mm.wallet_core.ui.r1.z(qVar);
        if (z17.f214205a == 1) {
            ecVar.R0(1);
        } else {
            int i17 = z17.f214206b;
            if (i17 == 3 || i17 == 4) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerDataCenter", "transferId:" + qVar.f348736z1 + ", payer state is " + i17);
                return false;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(qVar.D1)) {
                java.util.Iterator it = ((java.util.ArrayList) qVar.D1).iterator();
                while (it.hasNext()) {
                    java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                    if (split.length == 4) {
                        m1Var = new com.tencent.mm.wallet_core.ui.m1(1, com.tencent.mm.sdk.platformtools.t8.P(split[1], -1), com.tencent.mm.sdk.platformtools.t8.P(split[2], -1), com.tencent.mm.sdk.platformtools.t8.P(split[3], -1));
                        m1Var.f214207c = split[0];
                        break;
                    }
                }
            }
            m1Var = null;
            if (m1Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDataCenter", "[convertGroupAARecord] AARole is null");
            }
            ecVar.U0(m1Var != null ? m1Var.f214207c : null);
            ecVar.R0(2);
        }
        q(ecVar, true);
        return true;
    }

    public final boolean f(com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        java.lang.String queryParameter;
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348704r1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDataCenter", "msgid:" + f9Var.getMsgId() + " content.c2cNativeUrl is null!");
            return false;
        }
        java.lang.String str = qVar.f348704r1;
        if (str == null) {
            str = "";
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            queryParameter = parse.getQueryParameter("sendid");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLedgerDataCenter", e17, "", new java.lang.Object[0]);
        }
        if (o(queryParameter)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "hongbao hasRecord msgid:" + f9Var.getMsgId() + " transferId:" + queryParameter + '!');
            return false;
        }
        java.lang.String queryParameter2 = parse.getQueryParameter("sendusername");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "msgid:" + f9Var.getMsgId() + " transferId:" + queryParameter + " sendUserName is null!");
            return false;
        }
        dm.ec ecVar = new dm.ec();
        ecVar.W0(queryParameter);
        ecVar.P0(this.f243268a);
        ecVar.L0(f9Var.getCreateTime());
        ecVar.I0(com.tencent.mm.wallet_core.ui.r1.t(f9Var.getCreateTime()));
        ecVar.J0(f9Var.getMsgId());
        ecVar.T0(201);
        ot0.c cVar = (ot0.c) qVar.y(ot0.c.class);
        if (r26.i0.q(queryParameter2, c01.z1.r(), false, 2, null)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f348421n)) {
                ecVar.U0(cVar.f348421n);
            }
            ecVar.R0(2);
            q(ecVar, true);
        } else {
            ecVar.U0(queryParameter2);
            ecVar.R0(1);
            at4.k1 D0 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().D0(qVar.f348704r1);
            if (D0 == null) {
                ecVar.Q0(0L);
            } else {
                if (D0.field_hbStatus == 5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "msgid:" + f9Var.getMsgId() + " transferId:" + queryParameter + " hongbao expired");
                    return false;
                }
                if (D0.field_receiveTime > 0) {
                    long j17 = D0.field_receiveAmount;
                    if (j17 > 0) {
                        ecVar.Q0(j17);
                        ecVar.L0(D0.field_receiveTime);
                        ecVar.I0(com.tencent.mm.wallet_core.ui.r1.t(D0.field_receiveTime));
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "receive hongbao msgid:" + f9Var.getMsgId() + " transferId:" + queryParameter + " amount:" + ecVar.y0() + " time:" + D0.field_receiveTime);
                    }
                }
                ecVar.Q0(0L);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "receive hongbao msgid:" + f9Var.getMsgId() + " transferId:" + queryParameter + " invalid time:" + D0.field_receiveTime);
            }
            q(ecVar, true);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.tencent.mm.storage.f9 r13, ot0.q r14) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt4.p.g(com.tencent.mm.storage.f9, ot0.q):boolean");
    }

    public final long h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1L;
        }
        java.lang.String substring = str.substring(1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return com.tencent.mm.wallet_core.ui.r1.D0(java.lang.Double.parseDouble(substring));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [p75.m] */
    public final int i(java.lang.String username, int i17) {
        p75.y yVar;
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(username, "username");
        if (com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            yVar = dm.ec.f236715r.j(this.f243268a).c(dm.ec.f236721x.o(0));
        } else {
            p75.y yVar2 = (p75.y) dm.ec.f236715r.j(this.f243268a).c(dm.ec.f236719v.j(username));
            yVar2.f(dm.ec.f236721x.o(0));
            yVar = yVar2;
        }
        if (i17 > 0) {
            yVar = yVar;
            yVar.f(dm.ec.f236720w.i(java.lang.Integer.valueOf(i17)));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.ec.f236717t);
        linkedList.add(dm.ec.f236721x);
        linkedList.add(dm.ec.f236721x);
        linkedList2.add(dm.ec.f236716s.v());
        p75.j0 j0Var = new p75.j0(2, 0);
        p75.i0 g17 = dm.ec.f236713p.g(linkedList);
        g17.f352657d = yVar;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(j0Var.f352667a, j0Var.f352668b);
        p75.l0 a18 = g17.a();
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        for (dm.ec ecVar : a18.k(((xs4.b) a17).Q4(), dm.ec.class)) {
            if (ecVar.t0() > 0) {
                return ecVar.t0();
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [p75.m] */
    public final int j(java.lang.String username) {
        p75.y yVar;
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(username, "username");
        if (com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            yVar = dm.ec.f236715r.j(this.f243268a).c(dm.ec.f236721x.o(0));
        } else {
            p75.y yVar2 = (p75.y) dm.ec.f236715r.j(this.f243268a).c(dm.ec.f236719v.j(username));
            yVar2.f(dm.ec.f236721x.o(0));
            yVar = yVar2;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.ec.f236717t);
        linkedList2.add(dm.ec.f236716s.u());
        p75.j0 j0Var = new p75.j0(2, 0);
        p75.i0 g17 = dm.ec.f236713p.g(linkedList);
        g17.f352657d = yVar;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(j0Var.f352667a, j0Var.f352668b);
        p75.l0 a18 = g17.a();
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        for (dm.ec ecVar : a18.k(((xs4.b) a17).Q4(), dm.ec.class)) {
            if (ecVar.t0() > 0) {
                return ecVar.t0();
            }
        }
        return 0;
    }

    public final dt4.s k(int i17, java.lang.String username, int i18, int i19) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(username, "username");
        dt4.s sVar = new dt4.s();
        sVar.f243282a = i18;
        sVar.f243283b = i19;
        p75.m0 j17 = dm.ec.f236715r.j(this.f243268a);
        p75.d dVar = dm.ec.f236717t;
        p75.m c17 = j17.c(dVar.w(java.lang.Integer.valueOf(sVar.f243283b)).c(dVar.n(java.lang.Integer.valueOf(sVar.f243282a))));
        p75.d dVar2 = dm.ec.f236721x;
        p75.y yVar = (p75.y) c17;
        yVar.f(dVar2.o(0));
        if (i17 > 0) {
            yVar.f(dm.ec.f236720w.i(java.lang.Integer.valueOf(i17)));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            yVar.f(dm.ec.f236719v.j(username));
        }
        dm.dc dcVar = new dm.dc();
        dcVar.d();
        ((java.util.LinkedList) dcVar.f236464a).add(dVar);
        dcVar.f();
        ((java.util.LinkedList) dcVar.f236464a).add(dm.ec.f236720w);
        ((java.util.LinkedList) dcVar.f236464a).add(dVar2);
        dcVar.c();
        dcVar.e();
        dcVar.f236465b = yVar;
        dcVar.b();
        p75.l0 a18 = dcVar.a();
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        java.util.Iterator it = ((java.util.ArrayList) a18.k(((xs4.b) a17).Q4(), dm.ec.class)).iterator();
        while (it.hasNext()) {
            dm.ec ecVar = (dm.ec) it.next();
            dt4.u uVar = new dt4.u();
            uVar.f243292a = ecVar.t0();
            java.lang.String D0 = ecVar.D0();
            kotlin.jvm.internal.o.f(D0, "getTradeUser(...)");
            uVar.f243293b = D0;
            uVar.f243295d = ecVar.v0();
            uVar.f243296e = ecVar.A0();
            uVar.f243297f = ecVar.u0();
            if (ecVar.z0() == 1) {
                sVar.f243285d += ecVar.y0();
                uVar.f243294c += ecVar.y0();
            } else {
                sVar.f243284c -= ecVar.y0();
                uVar.f243294c -= ecVar.y0();
            }
            ((java.util.ArrayList) sVar.f243286e).add(uVar);
        }
        return sVar;
    }

    public final java.util.List l(int i17, java.util.List sections) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(sections, "sections");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = sections.iterator();
        while (it.hasNext()) {
            dt4.t tVar = (dt4.t) it.next();
            p75.m0 j17 = dm.ec.f236715r.j(this.f243268a);
            p75.d dVar = dm.ec.f236717t;
            p75.m c17 = j17.c(dVar.w(java.lang.Integer.valueOf(tVar.f243288b)).c(dVar.n(java.lang.Integer.valueOf(tVar.f243287a))));
            p75.d dVar2 = dm.ec.f236721x;
            p75.y yVar = (p75.y) c17;
            yVar.f(dVar2.o(0));
            if (i17 > 0) {
                yVar.f(dm.ec.f236720w.i(java.lang.Integer.valueOf(i17)));
            }
            dm.dc dcVar = new dm.dc();
            dcVar.c();
            dcVar.d();
            ((java.util.LinkedList) dcVar.f236464a).add(dVar);
            dcVar.f();
            ((java.util.LinkedList) dcVar.f236464a).add(dm.ec.f236720w);
            ((java.util.LinkedList) dcVar.f236464a).add(dVar2);
            dcVar.e();
            dcVar.f236465b = yVar;
            dcVar.b();
            p75.l0 a18 = dcVar.a();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
            }
            java.util.Iterator it6 = ((java.util.ArrayList) a18.k(((xs4.b) a17).Q4(), dm.ec.class)).iterator();
            while (it6.hasNext()) {
                dm.ec ecVar = (dm.ec) it6.next();
                dt4.q qVar = new dt4.q();
                if (tVar.f243291e.containsKey(java.lang.Integer.valueOf(ecVar.t0()))) {
                    java.lang.Object obj = tVar.f243291e.get(java.lang.Integer.valueOf(ecVar.t0()));
                    kotlin.jvm.internal.o.d(obj);
                    qVar = (dt4.q) obj;
                }
                qVar.f243273a = ecVar.t0();
                if (ecVar.z0() == 1) {
                    tVar.f243290d += ecVar.y0();
                    qVar.f243275c += ecVar.y0();
                    dt4.u uVar = new dt4.u();
                    if (qVar.f243277e.containsKey(ecVar.D0())) {
                        java.lang.Object obj2 = qVar.f243277e.get(ecVar.D0());
                        kotlin.jvm.internal.o.d(obj2);
                        uVar = (dt4.u) obj2;
                    }
                    uVar.f243297f = ecVar.u0();
                    uVar.f243292a = ecVar.t0();
                    java.lang.String D0 = ecVar.D0();
                    kotlin.jvm.internal.o.f(D0, "getTradeUser(...)");
                    uVar.f243293b = D0;
                    uVar.f243294c += ecVar.y0();
                    java.util.LinkedHashMap linkedHashMap = qVar.f243277e;
                    java.lang.String D02 = ecVar.D0();
                    kotlin.jvm.internal.o.f(D02, "getTradeUser(...)");
                    linkedHashMap.put(D02, uVar);
                } else {
                    tVar.f243289c -= ecVar.y0();
                    qVar.f243274b -= ecVar.y0();
                    dt4.u uVar2 = new dt4.u();
                    if (qVar.f243276d.containsKey(ecVar.D0())) {
                        java.lang.Object obj3 = qVar.f243276d.get(ecVar.D0());
                        kotlin.jvm.internal.o.d(obj3);
                        uVar2 = (dt4.u) obj3;
                    }
                    uVar2.f243297f = ecVar.u0();
                    uVar2.f243292a = ecVar.t0();
                    java.lang.String D03 = ecVar.D0();
                    kotlin.jvm.internal.o.f(D03, "getTradeUser(...)");
                    uVar2.f243293b = D03;
                    uVar2.f243294c -= ecVar.y0();
                    java.util.LinkedHashMap linkedHashMap2 = qVar.f243276d;
                    java.lang.String D04 = ecVar.D0();
                    kotlin.jvm.internal.o.f(D04, "getTradeUser(...)");
                    linkedHashMap2.put(D04, uVar2);
                }
                tVar.f243291e.put(java.lang.Integer.valueOf(ecVar.t0()), qVar);
            }
            if (tVar.f243291e.size() > 0) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public final java.util.List m(int i17, java.util.List sections) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(sections, "sections");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = sections.iterator();
        while (it.hasNext()) {
            dt4.t tVar = (dt4.t) it.next();
            p75.m0 j17 = dm.ec.f236715r.j(this.f243268a);
            p75.d dVar = dm.ec.f236717t;
            p75.m c17 = j17.c(dVar.w(java.lang.Integer.valueOf(tVar.f243288b)).c(dVar.n(java.lang.Integer.valueOf(tVar.f243287a))));
            p75.d dVar2 = dm.ec.f236721x;
            p75.y yVar = (p75.y) c17;
            yVar.f(dVar2.o(0));
            if (i17 > 0) {
                yVar.f(dm.ec.f236720w.i(java.lang.Integer.valueOf(i17)));
            }
            dm.dc dcVar = new dm.dc();
            dcVar.c();
            dcVar.d();
            ((java.util.LinkedList) dcVar.f236464a).add(dVar);
            dcVar.f();
            ((java.util.LinkedList) dcVar.f236464a).add(dm.ec.f236720w);
            ((java.util.LinkedList) dcVar.f236464a).add(dVar2);
            dcVar.e();
            dcVar.f236465b = yVar;
            dcVar.b();
            p75.l0 a18 = dcVar.a();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) a18.k(((xs4.b) a17).Q4(), dm.ec.class);
            if (arrayList2.size() > 0) {
                dt4.q qVar = new dt4.q();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    dm.ec ecVar = (dm.ec) it6.next();
                    if (ecVar.z0() == 1) {
                        tVar.f243290d += ecVar.y0();
                        qVar.f243275c += ecVar.y0();
                        dt4.u uVar = new dt4.u();
                        if (qVar.f243277e.containsKey(ecVar.D0())) {
                            java.lang.Object obj = qVar.f243277e.get(ecVar.D0());
                            kotlin.jvm.internal.o.d(obj);
                            uVar = (dt4.u) obj;
                        }
                        uVar.f243297f = ecVar.u0();
                        uVar.f243292a = ecVar.t0();
                        java.lang.String D0 = ecVar.D0();
                        kotlin.jvm.internal.o.f(D0, "getTradeUser(...)");
                        uVar.f243293b = D0;
                        uVar.f243294c += ecVar.y0();
                        java.util.LinkedHashMap linkedHashMap = qVar.f243277e;
                        java.lang.String D02 = ecVar.D0();
                        kotlin.jvm.internal.o.f(D02, "getTradeUser(...)");
                        linkedHashMap.put(D02, uVar);
                    } else {
                        tVar.f243289c -= ecVar.y0();
                        qVar.f243274b -= ecVar.y0();
                        dt4.u uVar2 = new dt4.u();
                        if (qVar.f243276d.containsKey(ecVar.D0())) {
                            java.lang.Object obj2 = qVar.f243276d.get(ecVar.D0());
                            kotlin.jvm.internal.o.d(obj2);
                            uVar2 = (dt4.u) obj2;
                        }
                        uVar2.f243297f = ecVar.u0();
                        uVar2.f243292a = ecVar.t0();
                        java.lang.String D03 = ecVar.D0();
                        kotlin.jvm.internal.o.f(D03, "getTradeUser(...)");
                        uVar2.f243293b = D03;
                        uVar2.f243294c -= ecVar.y0();
                        java.util.LinkedHashMap linkedHashMap2 = qVar.f243276d;
                        java.lang.String D04 = ecVar.D0();
                        kotlin.jvm.internal.o.f(D04, "getTradeUser(...)");
                        linkedHashMap2.put(D04, uVar2);
                    }
                }
                tVar.f243291e.put(0, qVar);
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public final java.util.List n(java.lang.String username, int i17, int i18, int i19, boolean z17) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(username, "username");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = z17 ? "<=" : "<";
        java.util.List k17 = kz5.c0.k(this.f243268a, java.lang.String.valueOf(i18));
        java.lang.String str2 = "";
        if (i17 > 0) {
            str2 = "AND tradeType = ?";
            k17.add(java.lang.String.valueOf(i17));
        }
        java.lang.String str3 = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            str3 = "AND tradeUser = ?";
            k17.add(username);
        }
        k17.add(java.lang.String.valueOf(i19));
        java.lang.String format = java.lang.String.format("SELECT DISTINCT msgDate FROM WalletLedgerRecord WHERE ((talker = ?) AND msgDate %s ?) AND tradeAmount > 0 %s %s ORDER BY msgTime DESC LIMIT ? OFFSET 0", java.util.Arrays.copyOf(new java.lang.Object[]{str, str2, str3}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        android.database.Cursor B = Q4 != null ? Q4.B(format, (java.lang.String[]) k17.toArray(new java.lang.String[0])) : null;
        if (B != null) {
            while (B.moveToNext()) {
                try {
                    dm.ec ecVar = new dm.ec();
                    ecVar.convertFrom(B);
                    dt4.u uVar = new dt4.u();
                    uVar.f243292a = ecVar.t0();
                    arrayList.add(uVar);
                } finally {
                }
            }
            vz5.b.a(B, null);
        }
        return arrayList;
    }

    public final boolean o(java.lang.String str) {
        dm.ec ecVar;
        androidx.lifecycle.c1 a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDataCenter", "hasRecord transferId is null!");
            return true;
        }
        if (str != null) {
            p75.l0 G0 = dm.ec.G0(str);
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
            }
            ecVar = (dm.ec) G0.o(((xs4.b) a17).Q4(), dm.ec.class);
        } else {
            ecVar = null;
        }
        return ecVar != null;
    }

    public final void p(dt4.i listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f243272e = listener;
        int i17 = this.f243269b;
        if (i17 == 2 || i17 == 4) {
            return;
        }
        if (i17 == 3) {
            s(3);
        } else {
            this.f243269b = 2;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new dt4.j(this, null), 3, null);
        }
    }

    public final void q(dm.ec ecVar, boolean z17) {
        androidx.lifecycle.c1 a17;
        androidx.lifecycle.c1 a18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "isInsert:" + z17 + " type:" + ecVar.A0() + " transferId:" + ecVar.F0() + " amount:" + ecVar.y0() + " msgid:" + ecVar.u0());
        if (z17) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
            }
            ecVar.insertToDB(((xs4.b) a18).Q4(), true);
            return;
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        ecVar.updateToDB(((xs4.b) a17).Q4(), true);
    }

    public final void r(dm.ec ecVar) {
        androidx.lifecycle.c1 a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "invalidRecord type:" + ecVar.A0() + " transferId:" + ecVar.F0() + " amount:" + ecVar.y0());
        ecVar.P0("");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        ecVar.updateToDB(((xs4.b) a17).Q4(), true);
    }

    public final void s(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new dt4.k(this, i17));
    }
}
