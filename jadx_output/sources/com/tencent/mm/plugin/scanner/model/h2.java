package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class h2 {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f158921b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f158922c = "";

    /* renamed from: g, reason: collision with root package name */
    public static int f158926g;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f158928i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f158929j;

    /* renamed from: k, reason: collision with root package name */
    public static com.tencent.mm.plugin.scanner.model.d2 f158930k;

    /* renamed from: l, reason: collision with root package name */
    public static long f158931l;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.h2 f158920a = new com.tencent.mm.plugin.scanner.model.h2();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f158923d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f158924e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f158925f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f158927h = new java.util.HashMap();

    public static final void A(int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_new_report_close_android, false)) {
            return;
        }
        if (i17 != 3) {
            str = "50167";
            str2 = "ScanPageScanTab";
        } else {
            str = "50168";
            str2 = "ScanPageTranslateTab";
        }
        int wi6 = ((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_out", kz5.c1.k(new jz5.l("page_id", str), new jz5.l("page_name", str2), new jz5.l("entrance_start_ms", f158922c), new jz5.l("tab_session_id", d(i17)), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(i18)), new jz5.l("face2face_status", java.lang.Integer.valueOf(wi6))), 33924);
    }

    public static final void B(int i17, e04.k2 retryReason) {
        kotlin.jvm.internal.o.g(retryReason, "retryReason");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportStartRetry retryType: " + i17 + ", retryReason: " + retryReason);
        if (retryReason == e04.k2.f246001f && i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1259, 20);
            g0Var.A(1259, 21);
        } else if (retryReason == e04.k2.f246002g && i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.A(1259, 20);
            g0Var2.A(1259, 37);
        }
    }

    public static final void C(int i17) {
        boolean h17 = h(i17);
        java.util.HashMap hashMap = f158925f;
        if (h17) {
            java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
            if (num != null && num.intValue() == 1) {
                return;
            }
            hashMap.put(java.lang.Integer.valueOf(i17), 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !f158929j ? 50 : 70);
            return;
        }
        if (i17 == 12) {
            java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
            if (num2 != null && num2.intValue() == 1) {
                return;
            }
            hashMap.put(java.lang.Integer.valueOf(i17), 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 100);
        }
    }

    public static final void D(int i17) {
        boolean h17 = h(i17);
        java.util.HashMap hashMap = f158925f;
        if (h17) {
            java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
            if (num == null || num.intValue() != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanReporter", "reportStopScan tab not start or stopped, and ignore");
                return;
            } else {
                hashMap.put(java.lang.Integer.valueOf(i17), 2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !f158929j ? 51 : 71);
                return;
            }
        }
        if (i17 == 12) {
            java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
            if (num2 == null || num2.intValue() != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanReporter", "reportStopScan tab not start or stopped, and ignore");
            } else {
                hashMap.put(java.lang.Integer.valueOf(i17), 2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 101);
            }
        }
    }

    public static final void E(kd0.g3 viewId, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        i("view_clk", viewId, kz5.c1.k(new jz5.l("is_expand", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("myqrcode_entrance", java.lang.Integer.valueOf(i17))));
        if (viewId == kd0.g3.f306650o) {
            z(0, 19, true);
        } else if (viewId == kd0.g3.f306649n) {
            z(0, 18, true);
        } else if (viewId == kd0.g3.f306647i) {
            z(0, 17, true);
        }
    }

    public static final void F(kd0.g3 viewId, int i17) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        i("view_exp", viewId, kz5.b1.e(new jz5.l("myqrcode_entrance", java.lang.Integer.valueOf(i17))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if ((r8.length() > 0) == true) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r8) {
        /*
            r0 = 12
            if (r8 == r0) goto Lb
            boolean r0 = h(r8)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r1 = com.tencent.mm.plugin.scanner.model.h2.f158923d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.get(r0)
            java.util.HashMap r0 = com.tencent.mm.plugin.scanner.model.h2.f158924e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4a
            int r3 = r0.length()
            if (r3 <= 0) goto L45
            r3 = r1
            goto L46
        L45:
            r3 = r2
        L46:
            if (r3 != r1) goto L4a
            r3 = r1
            goto L4b
        L4a:
            r3 = r2
        L4b:
            if (r3 == 0) goto Lab
            if (r8 == 0) goto L5b
            int r3 = r8.length()
            if (r3 <= 0) goto L57
            r3 = r1
            goto L58
        L57:
            r3 = r2
        L58:
            if (r3 != r1) goto L5b
            goto L5c
        L5b:
            r1 = r2
        L5c:
            if (r1 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r3 = 44
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.util.HashMap r3 = com.tencent.mm.plugin.scanner.model.h2.f158927h
            java.lang.Object r4 = r3.get(r1)
            com.tencent.mm.plugin.scanner.model.e2 r4 = (com.tencent.mm.plugin.scanner.model.e2) r4
            java.lang.String r5 = "<set-?>"
            if (r4 != 0) goto L91
            com.tencent.mm.plugin.scanner.model.e2 r2 = new com.tencent.mm.plugin.scanner.model.e2
            r2.<init>()
            kotlin.jvm.internal.o.g(r0, r5)
            r2.f158892a = r0
            kotlin.jvm.internal.o.g(r8, r5)
            r2.f158893b = r8
            r3.put(r1, r2)
            goto Lab
        L91:
            java.lang.String r1 = ""
            r4.f158892a = r1
            r4.f158893b = r1
            r6 = 0
            r4.f158894c = r6
            r4.f158895d = r6
            r4.f158896e = r6
            r4.f158897f = r2
            kotlin.jvm.internal.o.g(r0, r5)
            r4.f158892a = r0
            kotlin.jvm.internal.o.g(r8, r5)
            r4.f158893b = r8
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.h2.a(int):void");
    }

    public static final java.lang.String c(int i17) {
        return (java.lang.String) f158923d.get(java.lang.Integer.valueOf(i17));
    }

    public static final java.lang.String d(int i17) {
        return (java.lang.String) f158924e.get(java.lang.Integer.valueOf(i17));
    }

    public static final int f(com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest) {
        boolean z17 = baseScanRequest instanceof com.tencent.mm.plugin.scanner.api.ScanGoodsRequest;
        if (z17 && ((com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) baseScanRequest).f158668m == 5) {
            return 1;
        }
        return (z17 && ((com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) baseScanRequest).f158669n == 2) ? 2 : 0;
    }

    public static final boolean h(int i17) {
        return i17 == 1 || i17 == 8 || i17 == 4;
    }

    public static final void i(java.lang.String event, kd0.g3 viewId, java.util.Map map) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        java.util.Objects.toString(map);
        java.util.Map l17 = kz5.c1.l(new jz5.l("view_id", viewId.f306653d), new jz5.l("entrance_start_ms", f158922c), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(f158926g)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi())));
        if (map != null) {
            l17.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, l17, 33924);
    }

    public static final void j(int i17) {
        if (h(i17)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !f158929j ? 56 : 74);
        } else if (i17 == 12) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 104);
        }
    }

    public static final void k(java.util.List codeResultList, long j17, int i17, int i18, boolean z17, long j18, long j19) {
        kotlin.jvm.internal.o.g(codeResultList, "codeResultList");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportGalleryMultiCode codeResultList.size: " + codeResultList.size() + ", scanSession: " + j17 + ", resultOpType: " + i17 + ", chooseIndex: " + i18 + ", productCombine: " + z17 + ", multiCodeShowTimestamp: " + j18 + ", scanCost: " + j19);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = codeResultList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.qbar.WxQBarResult wxQBarResult = (com.tencent.qbar.WxQBarResult) it.next();
            if (wxQBarResult != null) {
                java.lang.String encode = java.net.URLEncoder.encode(wxQBarResult.f475332f, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                kotlin.jvm.internal.o.f(encode, "encode(...)");
                arrayList.add(encode);
                arrayList2.add(java.lang.Integer.valueOf(wxQBarResult.f475335i));
                java.lang.String str = wxQBarResult.f475331e;
                if (str == null) {
                    str = "";
                }
                arrayList3.add(str);
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j18);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Integer.valueOf(codeResultList.size());
        objArr[2] = kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
        objArr[3] = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
        objArr[4] = java.lang.Integer.valueOf(i17);
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(arrayList, i18);
        objArr[5] = str2 != null ? str2 : "";
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(arrayList2, i18);
        objArr[6] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
        objArr[7] = java.lang.Long.valueOf(j19);
        objArr[8] = 0;
        objArr[9] = kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null);
        objArr[10] = valueOf;
        objArr[11] = 3;
        objArr[12] = java.lang.Integer.valueOf(z17 ? 1 : 0);
        objArr[13] = 0;
        objArr[14] = 8;
        objArr[15] = java.lang.Long.valueOf(java.lang.Long.parseLong(f158921b));
        g0Var.d(19332, objArr);
    }

    public static final void l(java.lang.String event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, kz5.c1.l(new jz5.l("entrance_start_ms", f158922c), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(f158926g)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi()))), 37594);
    }

    public static final void m(java.lang.String event, java.lang.String viewId, int i17) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, kz5.c1.l(new jz5.l("view_id", viewId), new jz5.l("entrance_start_ms", f158922c), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(f158926g)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi())), new jz5.l("myqrcode_entrance", java.lang.Integer.valueOf(i17))), 37594);
    }

    public static final void n(int i17, int i18, boolean z17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.scanner.model.d2 d2Var = f158930k;
        if (d2Var == null) {
            return;
        }
        kotlin.jvm.internal.o.d(d2Var);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(d2Var.f158866a.size());
        com.tencent.mm.plugin.scanner.model.d2 d2Var2 = f158930k;
        kotlin.jvm.internal.o.d(d2Var2);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(d2Var2.f158868c);
        com.tencent.mm.plugin.scanner.model.d2 d2Var3 = f158930k;
        kotlin.jvm.internal.o.d(d2Var3);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportMultiCode result size: %d, tabSession: %d, scanSession: %d, chooseIndex: %d, resultOpType: %d", valueOf, valueOf2, java.lang.Long.valueOf(d2Var3.f158869d), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.scanner.model.d2 d2Var4 = f158930k;
        kotlin.jvm.internal.o.d(d2Var4);
        if (d2Var4.f158873h) {
            return;
        }
        kotlin.jvm.internal.o.d(f158930k);
        com.tencent.mm.plugin.scanner.model.d2 d2Var5 = f158930k;
        kotlin.jvm.internal.o.d(d2Var5);
        d2Var5.f158873h = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.tencent.mm.plugin.scanner.model.d2 d2Var6 = f158930k;
        kotlin.jvm.internal.o.d(d2Var6);
        java.util.Iterator it = d2Var6.f158866a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.qbar.WxQBarResult wxQBarResult = (com.tencent.qbar.WxQBarResult) it.next();
            if (wxQBarResult != null) {
                java.lang.String encode = java.net.URLEncoder.encode(wxQBarResult.f475332f, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                kotlin.jvm.internal.o.f(encode, "encode(...)");
                arrayList.add(encode);
                arrayList2.add(java.lang.Integer.valueOf(wxQBarResult.f475335i));
                java.lang.String str = wxQBarResult.f475331e;
                arrayList3.add(str != null ? str : "");
            }
        }
        com.tencent.mm.plugin.scanner.model.d2 d2Var7 = f158930k;
        kotlin.jvm.internal.o.d(d2Var7);
        if (d2Var7.f158871f > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.scanner.model.d2 d2Var8 = f158930k;
            kotlin.jvm.internal.o.d(d2Var8);
            obj = java.lang.String.valueOf(currentTimeMillis - d2Var8.f158871f);
        } else {
            obj = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        com.tencent.mm.plugin.scanner.model.d2 d2Var9 = f158930k;
        kotlin.jvm.internal.o.d(d2Var9);
        objArr[0] = java.lang.Long.valueOf(d2Var9.f158869d);
        com.tencent.mm.plugin.scanner.model.d2 d2Var10 = f158930k;
        kotlin.jvm.internal.o.d(d2Var10);
        objArr[1] = java.lang.Integer.valueOf(d2Var10.f158866a.size());
        java.lang.String g07 = kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportMultiCode result: ".concat(g07));
        objArr[2] = g07;
        objArr[3] = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
        objArr[4] = java.lang.Integer.valueOf(i17);
        java.lang.Object obj2 = (java.lang.String) kz5.n0.a0(arrayList, i18);
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[5] = obj2;
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(arrayList2, i18);
        objArr[6] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
        com.tencent.mm.plugin.scanner.model.d2 d2Var11 = f158930k;
        kotlin.jvm.internal.o.d(d2Var11);
        objArr[7] = java.lang.Long.valueOf(d2Var11.f158867b);
        com.tencent.mm.plugin.scanner.model.d2 d2Var12 = f158930k;
        kotlin.jvm.internal.o.d(d2Var12);
        objArr[8] = java.lang.Long.valueOf(d2Var12.f158868c);
        objArr[9] = kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null);
        objArr[10] = obj;
        objArr[11] = 3;
        objArr[12] = java.lang.Integer.valueOf(z17 ? 1 : 0);
        objArr[13] = 0;
        objArr[14] = 7;
        com.tencent.mm.plugin.scanner.model.d2 d2Var13 = f158930k;
        kotlin.jvm.internal.o.d(d2Var13);
        objArr[15] = java.lang.Long.valueOf(d2Var13.f158870e);
        g0Var.d(19332, objArr);
    }

    public static final void o(int i17, boolean z17, int i18, int i19) {
        java.lang.String valueOf;
        com.tencent.mm.plugin.scanner.model.d2 d2Var = f158930k;
        if (d2Var == null) {
            return;
        }
        kotlin.jvm.internal.o.d(d2Var);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(d2Var.f158868c);
        com.tencent.mm.plugin.scanner.model.d2 d2Var2 = f158930k;
        kotlin.jvm.internal.o.d(d2Var2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportMultiCodeOp tabSession:  %d, scanSession: %d, resultOpType: %d", valueOf2, java.lang.Long.valueOf(d2Var2.f158869d), java.lang.Integer.valueOf(i17));
        if (i17 == 4) {
            com.tencent.mm.plugin.scanner.model.d2 d2Var3 = f158930k;
            kotlin.jvm.internal.o.d(d2Var3);
            d2Var3.f158872g = java.lang.System.currentTimeMillis();
        }
        if (i17 == 5 || i17 == 6) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.scanner.model.d2 d2Var4 = f158930k;
            kotlin.jvm.internal.o.d(d2Var4);
            valueOf = java.lang.String.valueOf(currentTimeMillis - d2Var4.f158872g);
        } else if (i17 != 7 || (valueOf = d(i18)) == null) {
            valueOf = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.scanner.model.d2 d2Var5 = f158930k;
        kotlin.jvm.internal.o.d(d2Var5);
        com.tencent.mm.plugin.scanner.model.d2 d2Var6 = f158930k;
        kotlin.jvm.internal.o.d(d2Var6);
        com.tencent.mm.plugin.scanner.model.d2 d2Var7 = f158930k;
        kotlin.jvm.internal.o.d(d2Var7);
        g0Var.d(19332, java.lang.Long.valueOf(d2Var5.f158869d), 0, "", "", java.lang.Integer.valueOf(i17), "", 0, 0, java.lang.Long.valueOf(d2Var6.f158868c), "", valueOf, 3, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i19), 0, java.lang.Long.valueOf(d2Var7.f158870e));
        if (i17 == 4) {
            g0Var.A(1259, 64);
        } else if (i17 == 5) {
            g0Var.A(1259, 66);
        } else {
            if (i17 != 6) {
                return;
            }
            g0Var.A(1259, 65);
        }
    }

    public static final void p(int i17, int i18, int i19, int i27, int i28) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_new_report_close_android, false)) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("view_id", "scan_code_jump_dot"), new jz5.l("code_type", java.lang.Integer.valueOf(i18)), new jz5.l("code_sub_type", java.lang.Integer.valueOf(i17)), new jz5.l("pic_from", java.lang.Integer.valueOf(i19 != 1 ? i19 != 2 ? -1 : 1 : 2)), new jz5.l("result_id", c(i27)), new jz5.l("entrance_start_ms", f158922c), new jz5.l("tab_session_id", d(i27)), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(i28)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi()))), 33924);
    }

    public static final void q(int i17, int i18, int i19, int i27) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_new_report_close_android, false)) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("scan_code_kv_identify", kz5.c1.k(new jz5.l("code_type", java.lang.Integer.valueOf(i17)), new jz5.l("pic_from", java.lang.Integer.valueOf(i18 != 1 ? i18 != 2 ? -1 : 1 : 2)), new jz5.l("result_id", c(i19)), new jz5.l("entrance_start_ms", f158922c), new jz5.l("tab_session_id", d(i19)), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(i27)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi()))), 33924);
    }

    public static final void r(int i17, boolean z17, int i18, int i19) {
        if (h(i17)) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 != 4) {
                            return;
                        }
                    }
                }
                if (z17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !f158929j ? 58 : 76);
                    return;
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !f158929j ? 59 : 77);
                    return;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(1259, !f158929j ? 52 : 72);
                if (i19 == 1) {
                    g0Var.A(1259, !f158929j ? 60 : 80);
                } else if (i19 > 1) {
                    g0Var.A(1259, !f158929j ? 61 : 81);
                }
            }
        }
    }

    public static final void s(int i17, int i18, int i19, int i27, int i28, long j17, long j18, int i29) {
        t(i17, i18, i19, i27, i28, j17, j18, i29 != 2 ? 1 : 2, 0, 0, "", 0, 0);
    }

    public static final void t(int i17, int i18, int i19, int i27, int i28, long j17, long j18, int i29, int i37, int i38, java.lang.String cardTitle, int i39, int i47) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(cardTitle, "cardTitle");
        if (f158929j) {
            java.lang.Object d17 = d(i17);
            if (d17 == null) {
                d17 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            }
            java.lang.Object c17 = c(i17);
            if (c17 == null) {
                c17 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            }
            if (i27 > 0 || i28 > 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(i28);
                sb7.append(';');
                sb7.append(i27);
                sb6 = sb7.toString();
            } else {
                sb6 = "";
            }
            java.lang.String actionResult = sb6;
            java.lang.String tabSession = d17.toString();
            java.lang.String scanSession = c17.toString();
            java.lang.String detectSession = java.lang.String.valueOf(j18);
            java.lang.String enterSession = f158921b;
            kotlin.jvm.internal.o.g(actionResult, "actionResult");
            kotlin.jvm.internal.o.g(tabSession, "tabSession");
            kotlin.jvm.internal.o.g(scanSession, "scanSession");
            kotlin.jvm.internal.o.g(detectSession, "detectSession");
            kotlin.jvm.internal.o.g(enterSession, "enterSession");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24121, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), actionResult, java.lang.Long.valueOf(j17), tabSession, scanSession, detectSession, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), cardTitle, java.lang.Integer.valueOf(i39), enterSession, java.lang.Integer.valueOf(i47));
        }
    }

    public static final void u(int i17, int i18, int i19, int i27, int i28, long j17, long j18, int i29, int i37, int i38, java.lang.String cardTitle, int i39) {
        kotlin.jvm.internal.o.g(cardTitle, "cardTitle");
        t(i17, i18, i19, i27, i28, j17, j18, i29 == 2 ? 2 : 1, i37 + 1, i38, cardTitle, 0, i39);
    }

    public static final void v(int i17, int i18, int i19, long j17, long j18) {
        t(i17, i18, i19, 0, 0, j17, j18, 0, 0, 0, "", 0, 0);
    }

    public static final void w(int i17, int i18, int i19, int i27, int i28) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_new_report_close_android, false)) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("view_id", "scan_goods_bubble"), new jz5.l("goods_type", java.lang.Integer.valueOf(i27)), new jz5.l("pic_from", java.lang.Integer.valueOf(i17 != 1 ? i17 != 2 ? -1 : 1 : 2)), new jz5.l("result_id", c(i18)), new jz5.l("entrance_start_ms", f158922c), new jz5.l("tab_session_id", d(i18)), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(i19)), new jz5.l("ret_code", java.lang.Integer.valueOf(i28)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi()))), 33924);
    }

    public static final void x(boolean z17, int i17) {
        if (i17 == 1) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 102);
            }
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, z17 ? 106 : 107);
        } else if (i17 == 4 && f158929j) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, z17 ? 78 : 79);
        }
    }

    public static final void y(int i17, int i18, int i19, int i27) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_new_report_close_android, false)) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("scan_goods_svr_identify", kz5.c1.k(new jz5.l("pic_from", java.lang.Integer.valueOf(i17 != 1 ? i17 != 2 ? -1 : 1 : 2)), new jz5.l("result_id", c(i18)), new jz5.l("entrance_start_ms", f158922c), new jz5.l("tab_session_id", d(i18)), new jz5.l("entrance_id", f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(i19)), new jz5.l("goods_type", java.lang.Integer.valueOf(i27)), new jz5.l("face2face_status", java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi()))), 33924);
    }

    public static final void z(int i17, int i18, boolean z17) {
        java.lang.String str = (java.lang.String) f158924e.get(java.lang.Integer.valueOf(i17));
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18561, str, java.lang.Integer.valueOf(f158920a.g(i17, z17)), java.lang.Integer.valueOf(i18), f158921b, 0, java.lang.Integer.valueOf(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi()));
    }

    public final jz5.l b(com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest) {
        try {
            if ((baseScanRequest instanceof com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) && ((com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) baseScanRequest).f158668m == 5) {
                android.os.Bundle bundle = ((com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) baseScanRequest).f158667i;
                java.lang.String string = bundle != null ? bundle.getString("key_sns_ad_ux_info", "") : "";
                kotlin.jvm.internal.o.d(string);
                java.lang.String str = (java.lang.String) kz5.n0.a0(r26.n0.f0(string, new java.lang.String[]{"|"}, false, 0, 6, null), 1);
                if (str == null) {
                    str = "";
                }
                return new jz5.l(str, string);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanReporter", e17, "getBizId exception", new java.lang.Object[0]);
        }
        return new jz5.l("", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if ((r5.length() > 0) == true) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.scanner.model.e2 e(int r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = com.tencent.mm.plugin.scanner.model.h2.f158924e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r1 = com.tencent.mm.plugin.scanner.model.h2.f158923d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            int r3 = r0.length()
            if (r3 <= 0) goto L24
            r3 = r1
            goto L25
        L24:
            r3 = r2
        L25:
            if (r3 != r1) goto L29
            r3 = r1
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 == 0) goto L5a
            if (r5 == 0) goto L3a
            int r3 = r5.length()
            if (r3 <= 0) goto L36
            r3 = r1
            goto L37
        L36:
            r3 = r2
        L37:
            if (r3 != r1) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 == 0) goto L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 44
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.util.HashMap r0 = com.tencent.mm.plugin.scanner.model.h2.f158927h
            java.lang.Object r5 = r0.get(r5)
            com.tencent.mm.plugin.scanner.model.e2 r5 = (com.tencent.mm.plugin.scanner.model.e2) r5
            return r5
        L5a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.h2.e(int):com.tencent.mm.plugin.scanner.model.e2");
    }

    public final int g(int i17, boolean z17) {
        if (i17 != 1 && i17 != 8) {
            if (i17 == 12) {
                return 2;
            }
            if (i17 == 3) {
                return 3;
            }
            if (i17 != 4) {
                return 0;
            }
        }
        return z17 ? 4 : 1;
    }
}
