package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class a1 {
    public static int A = 0;
    public static int B = 0;
    public static long C = 0;
    public static int D = 0;
    public static final com.tencent.mm.storage.i0 E;
    public static java.lang.String F = null;
    public static java.lang.String G = null;

    /* renamed from: b, reason: collision with root package name */
    public static long f193717b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f193718c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f193719d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f193720e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f193721f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f193722g = "";

    /* renamed from: h, reason: collision with root package name */
    public static r45.cm5 f193723h = null;

    /* renamed from: i, reason: collision with root package name */
    public static r45.rm5 f193724i = null;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f193725j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f193726k = "";

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f193728m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f193729n;

    /* renamed from: o, reason: collision with root package name */
    public static long f193730o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f193731p;

    /* renamed from: q, reason: collision with root package name */
    public static long f193732q;

    /* renamed from: r, reason: collision with root package name */
    public static long f193733r;

    /* renamed from: s, reason: collision with root package name */
    public static long f193734s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f193735t;

    /* renamed from: u, reason: collision with root package name */
    public static int f193736u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f193737v;

    /* renamed from: w, reason: collision with root package name */
    public static int f193738w;

    /* renamed from: x, reason: collision with root package name */
    public static int f193739x;

    /* renamed from: y, reason: collision with root package name */
    public static int f193740y;

    /* renamed from: z, reason: collision with root package name */
    public static int f193741z;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.storage.a1 f193716a = new com.tencent.mm.storage.a1();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f193727l = new java.util.concurrent.ConcurrentLinkedQueue();

    static {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        f193729n = R;
        f193730o = R.q("lastBoxExposeReaTimeReportTime", java.lang.System.currentTimeMillis());
        f193732q = -1L;
        F = "";
        f193733r = -1L;
        G = "";
        f193734s = -1L;
        com.tencent.mm.storage.g0[] g0VarArr = com.tencent.mm.storage.g0.f193942e;
        f193736u = R.o("bizLastDigestTimeType", 4);
        f193740y = R.o("lastUnreadCountType", 0);
        com.tencent.mm.storage.c0 c0Var = com.tencent.mm.storage.d0.f193826e;
        f193741z = R.o("reddotActType", 1);
        A = R.o("lastOffAccountPos", -1);
        com.tencent.mm.storage.e0 e0Var = com.tencent.mm.storage.f0.f193896e;
        B = R.o("lastReddotReason", 6);
        C = R.q("bizLastDigestTime", 0L);
        com.tencent.mm.storage.z zVar = com.tencent.mm.storage.a0.f193706e;
        D = R.o("curPosChangeScene", 5);
        E = new com.tencent.mm.storage.i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.tencent.mm.storage.a1 r4, boolean r5, com.tencent.mm.storage.b0 r6, dw5.h r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.e(com.tencent.mm.storage.a1, boolean, com.tencent.mm.storage.b0, dw5.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void f(com.tencent.mm.storage.a1 a1Var, com.tencent.mm.storage.x xVar, long j17) {
        a1Var.getClass();
        long c17 = c01.id.c();
        if (xVar == com.tencent.mm.storage.x.f196314e || xVar == com.tencent.mm.storage.x.f196317h) {
            if (java.lang.Math.abs(c17 - f193730o) < 300000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "postRealTimeReport: cgi request cancel! cgi:/cgi-bin/micromsg-bin/reddot_report, funcId:5171. previous request time within 5 minutes! time since last request:" + (java.lang.Math.abs(c17 - f193730o) / 60000) + "min.");
                return;
            }
            f193730o = c17;
            f193729n.B("lastBoxExposeReaTimeReportTime", c17);
        }
        com.tencent.mm.storage.x xVar2 = com.tencent.mm.storage.x.f196315f;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = f193727l;
        if (xVar == xVar2) {
            r45.cm5 cm5Var = f193723h;
            if (cm5Var != null) {
                cm5Var.f371669f = xVar.f196319d;
                if (concurrentLinkedQueue.isEmpty()) {
                    concurrentLinkedQueue.add(cm5Var);
                }
            }
        } else if (xVar == com.tencent.mm.storage.x.f196316g) {
            r45.cm5 cm5Var2 = new r45.cm5();
            r45.cm5 cm5Var3 = f193723h;
            if (cm5Var3 != null) {
                cm5Var2.parseFrom(cm5Var3.toByteArray());
            }
            cm5Var2.f371669f = xVar.f196319d;
            r45.vn vnVar = new r45.vn();
            vnVar.f388386g = (int) j17;
            cm5Var2.f371667d = vnVar;
            concurrentLinkedQueue.add(cm5Var2);
        }
        if (concurrentLinkedQueue.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "postRealTimeReport fail! accType = " + xVar.f196319d + ", reportItems is empty!");
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.dm5 dm5Var = new r45.dm5();
        dm5Var.f372577d.addAll(concurrentLinkedQueue);
        lVar.f70664a = dm5Var;
        lVar.f70665b = new r45.em5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/reddot_report";
        lVar.f70667d = 5171;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            r45.c14 c14Var = ((r45.cm5) it.next()).f371668e;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "postRealTimeReport: cgi request. cgi:/cgi-bin/micromsg-bin/reddot_report, funcId:5171, accType:" + xVar.f196319d + ", size:" + concurrentLinkedQueue.size() + ", bufferReqId:" + a1Var.l(c14Var != null ? c14Var.f371212m : null) + ", exposeId:" + f193717b);
        }
        concurrentLinkedQueue.clear();
        com.tencent.mm.modelbase.z2.d(a17, com.tencent.mm.storage.k0.f195064d, false);
    }

    public final void A(com.tencent.mm.storage.f0 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[update36986] updateReddotReason: lastReddotReason=");
        com.tencent.mm.storage.e0 e0Var = com.tencent.mm.storage.f0.f193896e;
        int i17 = B;
        e0Var.getClass();
        com.tencent.mm.storage.f0 f0Var = (com.tencent.mm.storage.f0) ((java.util.LinkedHashMap) com.tencent.mm.storage.f0.f193897f).get(java.lang.Integer.valueOf(i17));
        if (f0Var == null) {
            f0Var = com.tencent.mm.storage.f0.f193904p;
        }
        sb6.append(f0Var);
        sb6.append(", currentReddotReason=");
        sb6.append(reason);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        int i18 = reason.f193906d;
        B = i18;
        f193729n.A("lastReddotReason", i18);
    }

    public final void B(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[update36986] updateUnreadCountType: lastUnreadCountType=");
        sb6.append(f193740y);
        sb6.append(", currentUnreadCountType=");
        sb6.append(i17);
        sb6.append(", reddotActType=");
        com.tencent.mm.storage.c0 c0Var = com.tencent.mm.storage.d0.f193826e;
        int i18 = f193741z;
        c0Var.getClass();
        com.tencent.mm.storage.d0 d0Var = (com.tencent.mm.storage.d0) ((java.util.LinkedHashMap) com.tencent.mm.storage.d0.f193827f).get(java.lang.Integer.valueOf(i18));
        if (d0Var == null) {
            d0Var = com.tencent.mm.storage.d0.f193828g;
        }
        sb6.append(d0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        if (f193740y == 0 && i17 != 0) {
            f193741z = 1;
            com.tencent.mm.storage.y yVar = com.tencent.mm.storage.y.f196340e;
            int i19 = f193741z;
            int i27 = A;
            q(yVar, i19, i27, i27, D, B);
        }
        if (f193740y != 0 && i17 == 0) {
            f193741z = 0;
            com.tencent.mm.storage.y yVar2 = com.tencent.mm.storage.y.f196341f;
            int i28 = f193741z;
            int i29 = A;
            q(yVar2, i28, i29, i29, D, B);
        }
        f193740y = i17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f193729n;
        o4Var.A("lastUnreadCountType", i17);
        o4Var.A("reddotActType", f193741z);
    }

    public final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "lstExpTime_" + str + '}';
    }

    public final java.lang.String b(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "minExpIndex_" + str + '}';
    }

    public final java.lang.String c(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "totalExpCount_" + str + '}';
    }

    public final java.lang.String d(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "totalExpTime_" + str + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.cm5 g(com.tencent.wechat.mm.biz.f1 r7, java.lang.String r8, int r9, com.tencent.mm.storage.x r10) {
        /*
            r6 = this;
            java.lang.Class<zq1.y> r0 = zq1.y.class
            i95.m r0 = i95.n0.c(r0)
            zq1.y r0 = (zq1.y) r0
            yq1.k r0 = (yq1.k) r0
            r0.getClass()
            jz5.l r0 = yw.q0.f466431c
            r45.cm5 r1 = new r45.cm5
            r1.<init>()
            r45.c14 r2 = new r45.c14
            r2.<init>()
            java.lang.String r3 = r7.c()
            r2.f371210h = r3
            java.lang.Class<rv.y2> r3 = rv.y2.class
            i95.m r3 = i95.n0.c(r3)
            rv.y2 r3 = (rv.y2) r3
            vw.m r3 = (vw.m) r3
            r3.getClass()
            yw.h1 r3 = yw.h1.f466332a
            boolean r3 = r3.n()
            r4 = 0
            if (r3 == 0) goto L56
            boolean r3 = yw.q3.f466440d
            if (r3 != 0) goto L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "getResortBandwidthOptSwitch hasInit="
            r3.<init>(r5)
            boolean r5 = yw.q3.f466440d
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.FlutterBizMsgBridge"
            com.tencent.mars.xlog.Log.w(r5, r3)
            goto L56
        L4f:
            com.tencent.wechat.mm.biz.g0 r3 = com.tencent.wechat.mm.biz.g0.f218063b
            boolean r3 = r3.k()
            goto L57
        L56:
            r3 = r4
        L57:
            boolean[] r5 = r7.M
            if (r3 == 0) goto L6b
            r3 = 21
            boolean r3 = r5[r3]
            if (r3 == 0) goto L64
            com.tencent.mm.protobuf.g r7 = r7.A
            goto L66
        L64:
            com.tencent.mm.protobuf.g r7 = com.tencent.mm.protobuf.g.f192155b
        L66:
            java.lang.String r7 = r7.i()
            goto L76
        L6b:
            r3 = 13
            boolean r3 = r5[r3]
            if (r3 == 0) goto L74
            java.lang.String r7 = r7.f218017s
            goto L76
        L74:
            java.lang.String r7 = ""
        L76:
            r2.f371212m = r7
            r01.k r7 = r01.k.f368128g
            com.tencent.mm.storage.a1 r3 = com.tencent.mm.storage.a1.f193716a
            java.lang.String r5 = r3.c(r8)
            int r5 = r7.o(r5, r4)
            r2.f371216q = r5
            java.lang.String r8 = r3.d(r8)
            int r7 = r7.o(r8, r4)
            r2.f371217r = r7
            r1.f371668e = r2
            r45.vn r7 = new r45.vn
            r7.<init>()
            java.lang.Object r8 = r0.f302833d
            java.lang.String r8 = (java.lang.String) r8
            r7.f388387h = r8
            java.lang.Object r8 = r0.f302834e
            java.lang.String r0 = "<get-second>(...)"
            kotlin.jvm.internal.o.f(r8, r0)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.f388388i = r8
            long r2 = java.lang.System.currentTimeMillis()
            r7.f388383d = r2
            r7.f388384e = r9
            int r8 = com.tencent.mm.storage.a1.f193739x
            r9 = 1
            if (r8 != r9) goto Lba
            r4 = r9
        Lba:
            r7.f388385f = r4
            int r8 = com.tencent.mm.storage.s2.i()
            r7.f388389m = r8
            r45.qm5 r8 = new r45.qm5
            r8.<init>()
            r7.f388390n = r8
            long r8 = c01.id.c()
            r7.f388391o = r8
            r1.f371667d = r7
            int r7 = r10.f196319d
            r1.f371669f = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.g(com.tencent.wechat.mm.biz.f1, java.lang.String, int, com.tencent.mm.storage.x):r45.cm5");
    }

    public final com.tencent.wechat.mm.biz.f1 h(long j17) {
        com.tencent.wechat.mm.biz.f1 j18;
        boolean z17;
        if (!gm0.j1.a()) {
            return null;
        }
        if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
            ((y40.i0) z40.e.get()).getClass();
            a50.e1 e1Var = a50.e1.f1471a;
            synchronized (e1Var) {
                z17 = a50.e1.f1474d;
            }
            if (!z17) {
                return null;
            }
            ((y40.i0) z40.e.get()).getClass();
            com.tencent.wechat.mm.finder_box.c0 a17 = e1Var.a();
            j18 = (com.tencent.wechat.mm.biz.f1) y40.o0.a(a17 != null ? a17.h(j17) : null, new com.tencent.wechat.mm.biz.f1());
        } else {
            if (!((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj() || !((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Di()) {
                return null;
            }
            j18 = com.tencent.wechat.mm.biz.g0.f218063b.j(j17);
        }
        return j18;
    }

    public final long i() {
        if (gm0.j1.a() && ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj() && ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Di()) {
            return com.tencent.wechat.mm.biz.g0.f218063b.h();
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if ((r13.length() > 0) == true) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.storage.da j(com.tencent.mm.storage.s1 r18) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.j(com.tencent.mm.storage.s1):com.tencent.mm.storage.da");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        if ((r13.length() > 0) == true) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.storage.da k(com.tencent.wechat.mm.biz.f1 r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.k(com.tencent.wechat.mm.biz.f1):com.tencent.mm.storage.da");
    }

    public final java.lang.String l(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("req_id", "");
            kotlin.jvm.internal.o.d(optString);
            return optString;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizMainCellExposeHelper", "getReqIdFromBuffer: parse buffer to json failed: " + e17.getMessage());
            return "";
        }
    }

    public final dw5.h m() {
        dw5.h l17;
        boolean z17;
        if (!gm0.j1.a()) {
            return null;
        }
        if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
            ((y40.i0) z40.e.get()).getClass();
            a50.e1 e1Var = a50.e1.f1471a;
            synchronized (e1Var) {
                z17 = a50.e1.f1474d;
            }
            if (!z17) {
                return null;
            }
            ((y40.i0) z40.e.get()).getClass();
            com.tencent.wechat.mm.finder_box.c0 a17 = e1Var.a();
            l17 = (dw5.h) y40.o0.a(a17 != null ? a17.i() : null, new dw5.h());
        } else {
            if (!((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj() || !((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Di()) {
                return null;
            }
            l17 = com.tencent.wechat.mm.biz.g0.f218063b.l();
        }
        return l17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r1.equals("FindMoreFriendsUI") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ri(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r1.equals("MoreTabUI") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r1.equals("MvvmAddressUIFragment") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        if (r1.equals("TingFlutterActivity") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0189, code lost:
    
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ui(rv.g3.ClickFloatBall);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        if (r1.equals("FindMoreFriendsUI") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0172, code lost:
    
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ui(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if (r1.equals("TmplWebViewMMUI") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        if (r1.equals("WebViewUI") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
    
        if (r1.equals("GameWebViewUI") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        if (r1.equals("MoreTabUI") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        if (r1.equals("MvvmAddressUIFragment") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        if (r1.equals("BizAudioFlutterActivity") == false) goto L90;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00cd. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.n(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8 A[Catch: all -> 0x03a4, TryCatch #1 {all -> 0x03a4, blocks: (B:17:0x0035, B:21:0x0041, B:24:0x004e, B:26:0x0054, B:28:0x013a, B:64:0x005d, B:65:0x007c, B:67:0x0082, B:70:0x008c, B:72:0x0092, B:73:0x0099, B:75:0x00a3, B:77:0x00ab, B:82:0x00b8, B:84:0x00cb, B:85:0x00ed, B:88:0x00fe, B:90:0x0104, B:94:0x0120), top: B:16:0x0035 }] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r32, int r33, int r34, long r35, long r37, int r39, com.tencent.mm.storage.b0 r40) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.o(java.lang.String, int, int, long, long, int, com.tencent.mm.storage.b0):void");
    }

    public final void p(com.tencent.mm.storage.x actType) {
        kotlin.jvm.internal.o.g(actType, "actType");
        if (com.tencent.mm.storage.g2.f193945a.b()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.storage.l0(actType), "MicroMsg.BizMainCellExposeHelper");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "postRealTimeReport fail! accType = " + actType.f196319d + ", openRedDotSample = false");
        }
    }

    public final void q(com.tencent.mm.storage.y yVar, int i17, int i18, int i19, int i27, int i28) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.storage.n0(yVar, i17, i18, i19, i28, i27));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:48|(15:99|(3:101|(2:107|(1:109)(1:113))|114)(3:115|(1:117)(1:120)|(1:119))|52|53|(7:83|84|85|86|(2:88|(2:90|91))|92|91)(12:55|(1:57)(2:75|(3:77|(1:79)|80)(1:82))|58|59|60|61|62|63|64|65|66|67)|81|59|60|61|62|63|64|65|66|67)(1:50)|51|52|53|(0)(0)|81|59|60|61|62|63|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x04e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0370 A[Catch: all -> 0x03a4, TryCatch #0 {all -> 0x03a4, blocks: (B:86:0x0313, B:88:0x0323, B:90:0x0334, B:91:0x035c, B:59:0x03b2, B:55:0x0370, B:57:0x037a, B:75:0x0384, B:77:0x038a), top: B:53:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.String r45, int r46, com.tencent.mm.storage.l4 r47) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.a1.r(java.lang.String, int, com.tencent.mm.storage.l4):void");
    }

    public final void s(java.lang.String str, int i17, int i18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = f193737v;
        if (str2 == null) {
            return;
        }
        java.lang.String e17 = com.tencent.mm.pluginsdk.model.b0.f189197a.e(str2);
        long q17 = r01.k.f368128g.q(a(str2), 0L);
        int i19 = com.tencent.mm.storage.s2.i();
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.y9.a(str);
        int i27 = (int) (currentTimeMillis / 1000);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18218, java.lang.Integer.valueOf(i27), str2, 0, 0, java.lang.Integer.valueOf(i17), a17, java.lang.Integer.valueOf(i18), 1, java.lang.Long.valueOf(q17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i19), 7, java.lang.Integer.valueOf(f193739x), "", "", 0, 0, 0, "", "", "", e17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "report18218. reportFinderLiveRedDotHide: timestamp=" + i27 + ", bizUsername=" + str2 + ", mid=0, firstTimeExpose=0, pos=" + i17 + ", encodeDesc=" + a17 + ", unReadCount=" + i18 + ", isHide=1, lastExposeTime=" + q17 + ", currentTime=" + currentTimeMillis + ", finderLiveRedDotType=" + i19 + ", msgType=7, hasRedDot=" + f193739x + ", cardType=0, style=0, idx=0, recInfo=\"\", lastRecCardId=\"\", exportId=" + e17 + ", rankSessionId=\"\", notifyMsgType=1, reddotReportInfo=\"\", notifyWording=\"\", notifyType=0");
    }

    public final void t(java.lang.String str, int i17, com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.b0 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        if (l4Var == null) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = reason;
        if (f193733r != f193734s && reason == com.tencent.mm.storage.b0.f193754d) {
            h0Var.f310123d = com.tencent.mm.storage.b0.f193757g;
        }
        int d17 = l4Var.d1();
        long j17 = f193733r;
        f193734s = j17;
        int i18 = f193736u;
        long j18 = C;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.storage.r0(str, i17, l4Var, d17, j17, j18, i18, h0Var));
    }

    public final void u(int i17, long j17, com.tencent.mm.storage.b0 b0Var, dw5.h hVar) {
        com.tencent.wechat.mm.biz.f1 h17 = h(j17);
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        if (h17 == null || h17.f218005d != j17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" reportMainCellExposeEndForAff  info.localId != lastMsgId  info is null = ");
            sb6.append(h17 == null);
            sb6.append(' ');
            sb6.append(h17 != null ? h17.f218005d : 0L);
            sb6.append(' ');
            sb6.append(f193733r);
            com.tencent.mars.xlog.Log.w("MicroMsg.BizMainCellExposeHelper", sb6.toString());
            return;
        }
        ((com.tencent.mm.ui.conversation.b2) ((rv.c3) i95.n0.c(rv.c3.class))).getClass();
        boolean z17 = yw.h1.f466332a.m().o("reddot_expose_end_report", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "reportMainCellExposeEndForAff reportAllCardType=" + z17);
        if (!eq1.y.j(h17) && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "reportMainCellExposeEndForAff no rec msg");
            return;
        }
        if (!com.tencent.mm.storage.g2.f193945a.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "reportMainCellExposeEndForAff no openRedDotSample");
            return;
        }
        r45.cm5 g17 = g(h17, valueOf, i17, com.tencent.mm.storage.x.f196317h);
        f193723h = g17;
        r45.c14 c14Var = g17.f371668e;
        if (c14Var != null) {
            c14Var.f371211i = f193716a.k(h17).f193847e;
        }
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.storage.s0(b0Var, hVar, null), 2, null);
    }

    public final void v(java.lang.String str, int i17, int i18, com.tencent.mm.storage.b0 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        long j17 = f193734s;
        long j18 = C;
        int i19 = f193736u;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.storage.u0(str, i17, i18, j17, j18, i19, reason), "MicroMsg.BizMainCellExposeHelper");
    }

    public final void w(int i17) {
        if (gm0.j1.a() && ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj() && ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Di()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.storage.y0(i17), "BizNativeToCppThread");
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(com.tencent.mm.storage.z0.f196389d);
    }

    public final void x(long j17, long j18) {
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        r01.k kVar = r01.k.f368128g;
        long q17 = kVar.q(a(valueOf), 0L);
        if (q17 <= 0 || j18 - q17 <= 0) {
            return;
        }
        ((com.tencent.mm.sdk.platformtools.o4) kVar.i()).B(d(valueOf), (kVar.q(d(valueOf), 0L) + j18) - q17);
    }

    public final void y(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "[update36986] updatePos: lastOffAccountPos=" + A + ", currentPos=" + i17);
        int i18 = A;
        if (i17 < i18) {
            q(com.tencent.mm.storage.y.f196342g, f193741z, A, i17, D, B);
            w(i17);
        } else if (i17 > i18 || (i17 != i18 && i17 == -1)) {
            q(com.tencent.mm.storage.y.f196343h, f193741z, A, i17, D, B);
            w(i17);
        }
        A = i17;
        f193729n.A("lastOffAccountPos", i17);
    }

    public final void z(com.tencent.mm.storage.a0 scene, java.lang.String username) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[update36986] updatePosChangeScene: lastPosChangeScene:");
        com.tencent.mm.storage.z zVar = com.tencent.mm.storage.a0.f193706e;
        int i17 = D;
        zVar.getClass();
        com.tencent.mm.storage.a0 a0Var = (com.tencent.mm.storage.a0) ((java.util.LinkedHashMap) com.tencent.mm.storage.a0.f193707f).get(java.lang.Integer.valueOf(i17));
        if (a0Var == null) {
            a0Var = com.tencent.mm.storage.a0.f193713o;
        }
        sb6.append(a0Var);
        sb6.append(", curPosChangeScene:");
        sb6.append(scene);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        int i18 = scene.f193715d;
        D = i18;
        f193729n.A("curPosChangeScene", i18);
    }
}
