package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public enum g0 implements jx3.c {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public int f158174d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158175e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f158176f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f158177g;

    /* renamed from: h, reason: collision with root package name */
    public int f158178h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f158179i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.HashMap f158180m;

    /* renamed from: n, reason: collision with root package name */
    public int f158181n;

    /* renamed from: o, reason: collision with root package name */
    public int f158182o;

    /* renamed from: p, reason: collision with root package name */
    public long f158183p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f158184q;

    g0() {
        this.f158175e = false;
        this.f158176f = false;
        this.f158177g = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.report.service.j0 j0Var = new com.tencent.mm.plugin.report.service.j0(this);
            if (gm0.j1.h()) {
                j0Var.s();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMKernel", "[+] cb %s was added to post initialized callbacks.", j0Var);
                gm0.j1.f273207n.v(j0Var);
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            this.f158175e = ih.a.e(e42.c0.clicfg_mars2_push_isolated_report_enable, false);
            this.f158177g = ih.a.e(e42.c0.clicfg_mars2_push_isolated_idkey_report_enable, false);
            this.f158176f = ih.a.e(e42.c0.clicfg_mars2_push_isolated_report_disable_sos, false);
        }
    }

    public static void s(com.tencent.mm.plugin.report.service.g0 g0Var) {
        g0Var.getClass();
        try {
            byte[] N = com.tencent.mm.vfs.w6.N(com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getFileStreamPath("clog-settings")).u(), 0, -1);
            if (N == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "Settings local file missing.");
                g0Var.f158184q = true;
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "Load settings from local file.");
            g0Var.f158184q = false;
            r45.q0 q0Var = new r45.q0();
            q0Var.parseFrom(N);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = q0Var.f383528f.iterator();
            while (it.hasNext()) {
                r45.o0 o0Var = (r45.o0) it.next();
                if (o0Var.f381787e != 0) {
                    long j17 = (o0Var.f381789g * io.flutter.embedding.android.KeyboardMap.kValueMask) / 1000000;
                    hashMap.put(o0Var.f381786d, java.lang.Long.valueOf(j17));
                    com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "Update cLog ratio: %s => %d [0x%08x]", o0Var.f381786d, java.lang.Integer.valueOf(o0Var.f381789g), java.lang.Long.valueOf(j17));
                }
            }
            g0Var.f158180m = hashMap;
            int i17 = q0Var.f383526d;
            g0Var.f158181n = i17;
            g0Var.f158182o = q0Var.f383529g;
            com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "Update cLog version: %d / %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g0Var.f158182o));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.cLog", e17, "Failed to update cLog ratio.", new java.lang.Object[0]);
        }
    }

    public void A(int i17, int i18) {
        B(i17, i18);
    }

    public void B(long j17, long j18) {
        C(j17, j18, 1L);
    }

    public void C(long j17, long j18, long j19) {
        idkeyStat(j17, j18, j19, false);
    }

    public void D(final int i17, java.util.List list, final boolean z17, boolean z18) {
        java.lang.String str;
        final boolean z19 = false;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = list.size() - 1;
            for (int i18 = 0; i18 < size; i18++) {
                sb6.append((java.lang.String) list.get(i18));
                sb6.append(',');
            }
            sb6.append((java.lang.String) list.get(size));
            str = sb6.toString();
        }
        final java.lang.String str2 = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            L(new java.lang.Runnable(i17, str2, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$z

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158270d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158271e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158272f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.f(this.f158270d, this.f158271e, this.f158272f, false, false);
                }
            });
        } else if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
            L(new java.lang.Runnable(i17, str2, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$a0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158187d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158188e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158189f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.g(this.f158187d, this.f158188e, this.f158189f, false, false);
                }
            });
        } else {
            N(i17, str2, false, z17, false);
        }
    }

    public void E(int i17, java.lang.Object... objArr) {
        if (!kx3.a.f313280a) {
            G(i17, false, false, true, objArr);
        } else {
            boolean z17 = kx3.a.f313281b;
            G(i17, z17, z17, true, objArr);
        }
    }

    public void G(final int i17, final boolean z17, boolean z18, final boolean z19, java.lang.Object... objArr) {
        final boolean z27 = false;
        final java.lang.String w17 = w(objArr);
        z65.c.a();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            final boolean z28 = false;
            L(new java.lang.Runnable(i17, w17, z17, z28, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$x

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158262d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158263e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158264f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f158265g;

                {
                    this.f158265g = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.f(this.f158262d, this.f158263e, this.f158264f, false, this.f158265g);
                }
            });
        } else if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
            L(new java.lang.Runnable(i17, w17, z17, z27, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$y

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158266d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158267e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158268f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f158269g;

                {
                    this.f158269g = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.g(this.f158266d, this.f158267e, this.f158268f, false, this.f158269g);
                }
            });
        } else {
            N(i17, w17, false, z17, z19);
        }
    }

    public void H(final int i17, final boolean z17, boolean z18, java.lang.Object... objArr) {
        final java.lang.String w17 = w(objArr);
        z65.c.a();
        final boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            L(new java.lang.Runnable(i17, w17, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$m

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158225d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158226e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158227f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.f(this.f158225d, this.f158226e, this.f158227f, false, false);
                }
            });
        } else if (com.tencent.mm.sdk.platformtools.x2.p()) {
            L(new java.lang.Runnable(i17, w17, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$n

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158228d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158229e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158230f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.g(this.f158228d, this.f158229e, this.f158230f, false, true);
                }
            });
        } else {
            N(i17, w17, false, z17, false);
        }
    }

    public boolean I(final int i17, com.tencent.mm.protobuf.f fVar, final boolean z17, boolean z18) {
        final boolean z19 = false;
        try {
            fVar.getClass().getField("import_ds_").setInt(fVar, Integer.MAX_VALUE);
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis / 86400 != 0) {
                try {
                    this.f158178h = com.tencent.mm.sdk.platformtools.t8.P(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()), 0);
                } catch (java.lang.Exception unused) {
                }
            }
            fVar.getClass().getField("ds_").setInt(fVar, this.f158178h);
            fVar.getClass().getField("uin_").setLong(fVar, this.f158174d & io.flutter.embedding.android.KeyboardMap.kValueMask);
            fVar.getClass().getField("device_").setInt(fVar, 2);
            fVar.getClass().getField("clientVersion_").setInt(fVar, o45.wf.f343029g);
            fVar.getClass().getField("time_stamp_").setLong(fVar, currentTimeMillis);
            try {
                final byte[] byteArray = fVar.toByteArray();
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    if (kx3.a.f313280a) {
                        L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$o
                            @Override // java.lang.Runnable
                            public final void run() {
                                long j17 = i17;
                                boolean z28 = kx3.a.f313281b;
                                com.tencent.mm.plugin.report.service.x.d(j17, byteArray, z28, z28);
                            }
                        });
                    } else {
                        L(new java.lang.Runnable(i17, byteArray, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$p

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ int f158233d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ byte[] f158234e;

                            /* renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ boolean f158235f;

                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.report.service.x.d(this.f158233d, this.f158234e, this.f158235f, false);
                            }
                        });
                    }
                } else if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
                    L(new java.lang.Runnable(i17, byteArray, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$q

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ int f158236d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ byte[] f158237e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ boolean f158238f;

                        @Override // java.lang.Runnable
                        public final void run() {
                            long j17 = this.f158236d;
                            java.util.Map map = com.tencent.mm.plugin.report.service.x.f158320a;
                            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvPbData(j17, this.f158237e, this.f158238f);
                        }
                    });
                } else {
                    com.tencent.mars.xlog.Log.f("MicroMsg.ReportManagerKvCheck", "not in MM Process");
                }
                return true;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "pbKVStat LocalReportPb error, %d, %s", java.lang.Integer.valueOf(i17), e17.toString());
                return false;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "pbKVStat  set values error, %d, %s", java.lang.Integer.valueOf(i17), e18.toString());
            return false;
        }
    }

    public void J(long j17, long j18) {
        synchronized (this.f158179i) {
            ((java.util.LinkedList) this.f158179i).add(new android.util.Pair(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
        }
    }

    public final void L(java.lang.Runnable runnable) {
        if (!gm0.j1.h()) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReportManagerKvCheck", new java.lang.Throwable(), "[-] MMkernel was not initialized.", new java.lang.Object[0]);
            return;
        }
        if (gm0.j1.i().f273208a.f273299d || (fp.d0.d("wechatbase") && com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.smc.SmcManager.class) != null && ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).isInitiated())) {
            runnable.run();
        } else {
            gm0.j1.i().c(new com.tencent.mm.plugin.report.service.m0(this, runnable));
        }
    }

    public void M(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.StIDKeyDataInfo stIDKeyDataInfo = new com.tencent.mm.plugin.report.service.StIDKeyDataInfo();
        stIDKeyDataInfo.f158142d = j17;
        stIDKeyDataInfo.f158143e = j18;
        stIDKeyDataInfo.f158144f = j19;
        stIDKeyDataInfo.f158145g = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158124a;
        if (com.tencent.mm.plugin.report.service.j.b((int) j17)) {
            java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code, IDKey:(" + stIDKeyDataInfo.f158142d + "," + stIDKeyDataInfo.f158143e + ")");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.KVCommCrossProcessReceiver", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(exc));
            stIDKeyDataInfo.f158142d = 1566L;
            stIDKeyDataInfo.f158143e = 1L;
            stIDKeyDataInfo.f158144f = 1L;
        }
        synchronized (com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158130g) {
            long j27 = 28;
            if (j27 >= 102400) {
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "id-key data too large: %s", java.lang.Long.valueOf(j27));
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            if (j27 >= 307200) {
                throw new java.lang.OutOfMemoryError("id-key data too large: 28");
            }
            if (com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158126c == 0 || com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.a(j27)) {
                com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.c();
            }
            com.tencent.mm.plugin.report.service.BroadCastData broadCastData = com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158128e;
            broadCastData.f158118e.add(stIDKeyDataInfo);
            broadCastData.a(32);
        }
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.b();
    }

    public final void N(int i17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.report.service.KVReportDataInfo kVReportDataInfo = new com.tencent.mm.plugin.report.service.KVReportDataInfo();
        kVReportDataInfo.f158131d = i17;
        kVReportDataInfo.f158133f = str;
        kVReportDataInfo.f158132e = 0L;
        kVReportDataInfo.f158135h = false;
        kVReportDataInfo.f158134g = z18;
        kVReportDataInfo.f158136i = z19;
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.e(kVReportDataInfo);
    }

    @Override // jx3.c
    public void a(int i17) {
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).setUin(i17);
        this.f158174d = i17;
    }

    @Override // jx3.c
    public void b(java.util.ArrayList arrayList, boolean z17) {
        j(arrayList, z17, false);
    }

    @Override // jx3.c
    public void d(int i17, java.lang.Object... objArr) {
        if (!kx3.a.f313280a) {
            r(i17, false, false, objArr);
        } else {
            boolean z17 = kx3.a.f313281b;
            r(i17, z17, z17, objArr);
        }
    }

    @Override // jx3.c
    public void e(final int i17, final int i18, final java.lang.String str, final boolean z17, boolean z18, final boolean z19) {
        final boolean z27 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (kx3.a.f313280a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$u
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        boolean z28 = z19;
                        long j17 = i17;
                        long j18 = i18;
                        boolean z29 = kx3.a.f313281b;
                        com.tencent.mm.plugin.report.service.x.h(j17, j18, str2, z29, z29, z28);
                    }
                });
                return;
            } else {
                final boolean z28 = false;
                L(new java.lang.Runnable(i17, i18, str, z17, z28, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$v

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f158252d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f158253e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f158254f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ boolean f158255g;

                    /* renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ boolean f158256h;

                    {
                        this.f158256h = z19;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.report.service.x.h(this.f158252d, this.f158253e, this.f158254f, this.f158255g, false, this.f158256h);
                    }
                });
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
            L(new java.lang.Runnable(i17, i18, str, z17, z27, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$w

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158257d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f158258e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158259f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f158260g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f158261h;

                {
                    this.f158261h = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.i(this.f158257d, this.f158258e, this.f158259f, this.f158260g, false, this.f158261h);
                }
            });
            return;
        }
        com.tencent.mm.plugin.report.service.KVReportDataInfo kVReportDataInfo = new com.tencent.mm.plugin.report.service.KVReportDataInfo();
        kVReportDataInfo.f158131d = i17;
        kVReportDataInfo.f158133f = str;
        kVReportDataInfo.f158132e = i18;
        kVReportDataInfo.f158135h = false;
        kVReportDataInfo.f158134g = z17;
        kVReportDataInfo.f158136i = z19;
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.e(kVReportDataInfo);
    }

    @Override // jx3.c
    public void f(final int i17, final java.lang.String str, final boolean z17, boolean z18) {
        final boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (kx3.a.f313280a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        long j17 = i17;
                        boolean z27 = kx3.a.f313281b;
                        com.tencent.mm.plugin.report.service.x.f(j17, str2, z27, z27, false);
                    }
                });
                return;
            } else {
                L(new java.lang.Runnable(i17, str, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$l

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f158222d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f158223e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ boolean f158224f;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.report.service.x.f(this.f158222d, this.f158223e, this.f158224f, false, false);
                    }
                });
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
            L(new java.lang.Runnable(i17, str, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$t

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158245d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158246e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158247f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.g(this.f158245d, this.f158246e, this.f158247f, false, false);
                }
            });
        } else {
            N(i17, str, false, z17, false);
        }
    }

    @Override // jx3.c
    public void g(int i17, boolean z17, boolean z18, boolean z19, java.lang.Object... objArr) {
        p(i17, w(objArr), z17, z18, z19);
    }

    @Override // jx3.c
    public boolean h(int i17, java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            kvStat(i17, str);
            return true;
        }
        if (this.f158174d == 0) {
            return false;
        }
        kvStat(i17, str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // jx3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(java.lang.String r18, java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.report.service.g0.i(java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // jx3.c
    public void idkeyStat(final long j17, final long j18, final long j19, boolean z17) {
        boolean z18;
        final boolean z19 = false;
        if (j17 < 0 || j18 < 0 || j19 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "ID %d, key %d, value %d <0", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
            return;
        }
        com.tencent.mm.plugin.report.service.q qVar = com.tencent.mm.plugin.report.service.q.INSTANCE;
        qVar.getClass();
        com.tencent.mm.plugin.report.service.p pVar = qVar.f158303d[(((int) j17) ^ ((int) j18)) % 6];
        if (pVar != null && j17 == pVar.f158296a && j18 == pVar.f158297b) {
            java.util.concurrent.atomic.AtomicLong atomicLong = pVar.f158298c;
            if (atomicLong == null) {
                pVar.f158298c = new java.util.concurrent.atomic.AtomicLong(j19);
            } else {
                atomicLong.addAndGet(j19);
            }
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            final boolean z27 = false;
            L(new java.lang.Runnable(j17, j18, j19, z27) { // from class: com.tencent.mm.plugin.report.service.g0$$h

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f158212d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f158213e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f158214f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.b(this.f158212d, this.f158213e, this.f158214f, false);
                }
            });
        } else if (com.tencent.mm.sdk.platformtools.x2.p() && u() && this.f158177g) {
            L(new java.lang.Runnable(j17, j18, j19, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$i

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f158215d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f158216e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f158217f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.c(this.f158215d, this.f158216e, this.f158217f, false);
                }
            });
        } else {
            M(j17, j18, j19, false);
        }
    }

    @Override // jx3.c
    public void j(final java.util.ArrayList arrayList, boolean z17, final boolean z18) {
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat lstIdKeyDataInfos == null return");
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.smc.IDKey iDKey = (com.tencent.mars.smc.IDKey) it.next();
            if (iDKey == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat info == null return");
                return;
            } else if (iDKey.GetID() < 0 || iDKey.GetKey() < 0 || iDKey.GetValue() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat ID %d, key %d, value %d <0", java.lang.Long.valueOf(iDKey.GetID()), java.lang.Long.valueOf(iDKey.GetKey()), java.lang.Long.valueOf(iDKey.GetValue()));
                return;
            }
        }
        final boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            L(new java.lang.Runnable(arrayList, z19, z18) { // from class: com.tencent.mm.plugin.report.service.g0$$j

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ java.util.ArrayList f158218d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f158219e;

                {
                    this.f158219e = z18;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.a(this.f158218d, false, this.f158219e);
                }
            });
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.p() && u() && this.f158177g) {
            L(new java.lang.Runnable(arrayList, z19, z18) { // from class: com.tencent.mm.plugin.report.service.g0$$k

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ java.util.ArrayList f158220d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f158221e;

                {
                    this.f158221e = z18;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z27 = this.f158221e;
                    java.util.Map map = com.tencent.mm.plugin.report.service.x.f158320a;
                    java.util.ArrayList arrayList2 = this.f158220d;
                    if (arrayList2 != null) {
                        boolean z28 = false;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (com.tencent.mm.plugin.report.service.j.b((int) ((com.tencent.mars.smc.IDKey) arrayList2.get(i17)).GetID())) {
                                java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code. IDKey:(" + ((com.tencent.mars.smc.IDKey) arrayList2.get(i17)).GetID() + "," + ((com.tencent.mars.smc.IDKey) arrayList2.get(i17)).GetKey() + ")");
                                boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(exc));
                                com.tencent.mm.plugin.report.service.x.b(1566L, 1L, 1L, false);
                                z28 = true;
                            }
                        }
                        if (z28) {
                            return;
                        }
                        try {
                            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportListIDKey((com.tencent.mars.smc.IDKey[]) arrayList2.toArray(new com.tencent.mars.smc.IDKey[arrayList2.size()]), false, z27);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                            if (!fp.h.a(20)) {
                                throw th6;
                            }
                            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportListIDKey((com.tencent.mars.smc.IDKey[]) arrayList2.toArray(new com.tencent.mars.smc.IDKey[arrayList2.size()]), false, z27);
                        }
                    }
                }
            });
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158124a;
        arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (com.tencent.mm.plugin.report.service.j.b((int) ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).GetID())) {
                java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code. IDKey:(" + ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).GetID() + "," + ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).GetKey() + ")");
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.KVCommCrossProcessReceiver", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(exc));
                ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).SetID(1566);
                ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).SetKey(1);
                ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).SetValue(1L);
            }
        }
        synchronized (com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158130g) {
            com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo groupIDKeyDataInfo = new com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo(arrayList, false, z18);
            long size = (groupIDKeyDataInfo.f158121d.size() * 28) + 4 + 4 + 4;
            if (size >= 102400) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "grouped id-key data too large: %s", java.lang.Long.valueOf(size));
            }
            if (size >= 307200) {
                throw new java.lang.OutOfMemoryError("grouped id-key data too large: " + size);
            }
            if (com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158126c == 0 || com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.a(size)) {
                com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.c();
            }
            com.tencent.mm.plugin.report.service.BroadCastData broadCastData = com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158128e;
            broadCastData.f158119f.add(groupIDKeyDataInfo);
            broadCastData.a((groupIDKeyDataInfo.f158121d.size() * 28) + 4 + 4 + 4 + 4);
        }
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.b();
    }

    @Override // jx3.c
    public void k(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(i17);
        iDKey.SetKey(i19);
        iDKey.SetValue(i28);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(i18);
        iDKey2.SetKey(i27);
        iDKey2.SetValue(i29);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        j(arrayList, z17, false);
    }

    @Override // jx3.c
    public void kvStat(int i17, java.lang.String str) {
        if (!kx3.a.f313280a) {
            f(i17, str, false, false);
        } else {
            boolean z17 = kx3.a.f313281b;
            f(i17, str, z17, z17);
        }
    }

    @Override // jx3.c
    public void l(int i17, java.util.List list) {
        if (!kx3.a.f313280a) {
            D(i17, list, false, false);
        } else {
            boolean z17 = kx3.a.f313281b;
            D(i17, list, z17, z17);
        }
    }

    @Override // jx3.c
    public void m(int i17, int i18, int i19, int i27, boolean z17) {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(i17);
        iDKey.SetKey(i18);
        iDKey.SetValue(i27);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(i17);
        iDKey2.SetKey(i19);
        iDKey2.SetValue(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        j(arrayList, false, false);
    }

    @Override // jx3.c
    public void n(final int i17, final int i18, final java.lang.String str, final boolean z17, boolean z18) {
        final boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (kx3.a.f313280a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        long j17 = i17;
                        long j18 = i18;
                        boolean z27 = kx3.a.f313281b;
                        com.tencent.mm.plugin.report.service.x.h(j17, j18, str2, z27, z27, false);
                    }
                });
                return;
            } else {
                final boolean z27 = false;
                L(new java.lang.Runnable(i17, i18, str, z17, z27) { // from class: com.tencent.mm.plugin.report.service.g0$$f

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f158204d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f158205e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f158206f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ boolean f158207g;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.report.service.x.h(this.f158204d, this.f158205e, this.f158206f, this.f158207g, false, false);
                    }
                });
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
            L(new java.lang.Runnable(i17, i18, str, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$g

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158208d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f158209e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158210f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f158211g;

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.i(this.f158208d, this.f158209e, this.f158210f, this.f158211g, false, false);
                }
            });
            return;
        }
        com.tencent.mm.plugin.report.service.KVReportDataInfo kVReportDataInfo = new com.tencent.mm.plugin.report.service.KVReportDataInfo();
        kVReportDataInfo.f158131d = i17;
        kVReportDataInfo.f158133f = str;
        kVReportDataInfo.f158132e = i18;
        kVReportDataInfo.f158135h = false;
        kVReportDataInfo.f158134g = z17;
        kVReportDataInfo.f158136i = false;
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.e(kVReportDataInfo);
    }

    @Override // jx3.c
    public void o() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.WeChatMars.onSingalCrash(0);
            if (com.tencent.paymars.WeChatMars.isEnable()) {
                com.tencent.paymars.WeChatMars.onSingalCrash(0);
            }
        }
    }

    @Override // jx3.c
    public void p(final int i17, final java.lang.String str, final boolean z17, boolean z18, final boolean z19) {
        final boolean z27 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (kx3.a.f313280a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        boolean z28 = z19;
                        long j17 = i17;
                        boolean z29 = kx3.a.f313281b;
                        com.tencent.mm.plugin.report.service.x.f(j17, str2, z29, z29, z28);
                    }
                });
                return;
            } else {
                final boolean z28 = false;
                L(new java.lang.Runnable(i17, str, z17, z28, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$c

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f158193d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f158194e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ boolean f158195f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ boolean f158196g;

                    {
                        this.f158196g = z19;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.report.service.x.f(this.f158193d, this.f158194e, this.f158195f, false, this.f158196g);
                    }
                });
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.p() && u()) {
            L(new java.lang.Runnable(i17, str, z17, z27, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f158197d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f158198e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f158199f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f158200g;

                {
                    this.f158200g = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.report.service.x.g(this.f158197d, this.f158198e, this.f158199f, false, this.f158200g);
                }
            });
        } else {
            N(i17, str, false, z17, z19);
        }
    }

    @Override // jx3.c
    public void r(int i17, boolean z17, boolean z18, java.lang.Object... objArr) {
        G(i17, z17, z18, false, objArr);
    }

    public void t(java.lang.String str, java.lang.String str2) {
        i(str, str2, null);
    }

    public final boolean u() {
        return !this.f158176f && (this.f158175e || ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ui());
    }

    public java.lang.String w(java.lang.Object... objArr) {
        return jx3.f.INSTANCE.s(objArr);
    }

    public void y(int i17, int i18, int i19, boolean z17) {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(i17);
        iDKey.SetKey(i18);
        iDKey.SetValue(1L);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(i17);
        iDKey2.SetKey(i19);
        iDKey2.SetValue(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        j(arrayList, false, false);
    }
}
