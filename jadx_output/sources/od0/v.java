package od0;

@j95.b(dependencies = {fo3.j.class})
/* loaded from: classes13.dex */
public class v extends i95.w implements w04.k {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f344579g = new com.tencent.mm.sdk.platformtools.n3("SIRIWorker");

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.normsg.api.CameraStatus f344580d = new com.tencent.mm.plugin.normsg.api.CameraStatus();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.normsg.api.AudioModeStatus f344581e = new com.tencent.mm.plugin.normsg.api.AudioModeStatus();

    /* renamed from: f, reason: collision with root package name */
    public long f344582f = 0;

    public void Ai(int i17, byte[] bArr, boolean z17) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "data is null.");
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = fo3.s.INSTANCE.V6("Q\u001e\u001b\u0012W\u001b\u0011\u0019Y\u0018\u001d\u0010\u0000\u001e\u001d\u001c\t@\u000e\u0002\u0004F\u001a\u0002\u0016\n\u0016\u0017\u0001\r\t:0)?3?:3");
        lVar.f70667d = 771;
        lVar.f70664a = new r45.mp5();
        lVar.f70665b = new r45.np5();
        lVar.f70679p = z17 ? com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kTry : com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kDefault;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.mp5 mp5Var = (r45.mp5) a17.f70710a.f70684a;
        mp5Var.f380731e = i17;
        mp5Var.f380730d = new com.tencent.mm.protobuf.g("".getBytes());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        mp5Var.f380732f = cu5Var;
        jx3.f.INSTANCE.idkeyStat(416L, 0L, 1L, false);
        com.tencent.mm.modelbase.z2.f(a17, new com.tencent.mm.modelbase.g3(new od0.c0(this, i17)), com.tencent.mm.modelbase.z2.f70848c, true);
    }

    @Override // w04.k
    public void C2(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SecInfoReporterImpl", "[-] turingOwnerData is null.");
            return;
        }
        try {
            r45.d40 d40Var = new r45.d40();
            d40Var.f372065d = new com.tencent.mm.protobuf.g("".getBytes());
            d40Var.f372066e = 1;
            d40Var.f372067f = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
            d40Var.f372069h = 2;
            d40Var.f372068g = java.lang.System.currentTimeMillis() / 1000;
            d40Var.f372070i = 0;
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(d40Var.toByteArray());
            k57Var.f378403p = cu5Var;
            Ai(0, k57Var.toByteArray(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report turing owner through cgi, len: %d, type: sec", java.lang.Integer.valueOf(bArr.length));
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] report turing owner error");
        }
    }

    @Override // w04.k
    public boolean Cd(int i17, long j17, int i18) {
        return od0.o0.c(i17, j17, i18);
    }

    @Override // w04.k
    public void Ch(int i17, int i18) {
        if (i18 != 0) {
            boolean c17 = od0.o0.c(i18, 86400000L, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport called, res: %s", java.lang.Boolean.valueOf(c17));
            if (!c17) {
                return;
            }
        }
        com.tencent.mm.autogen.events.ReportCCDataByFinderEvent reportCCDataByFinderEvent = new com.tencent.mm.autogen.events.ReportCCDataByFinderEvent();
        reportCCDataByFinderEvent.f54682g.f8398a = i17;
        reportCCDataByFinderEvent.e();
    }

    @Override // w04.k
    public void D7(byte[] bArr) {
        f344579g.post(new od0.k0(this, bArr));
    }

    @Override // w04.k
    public void D9(android.app.Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // w04.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Eg(android.app.Activity r4) {
        /*
            r3 = this;
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "LauncherUI"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            android.net.Uri r0 = r4.getReferrer()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L28
            android.view.Display r4 = r4.getDisplay()
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L30
            int r4 = r4.getDisplayId()
            goto L31
        L30:
            r4 = -1
        L31:
            com.tencent.mm.sdk.platformtools.n3 r1 = od0.v.f344579g
            od0.a0 r2 = new od0.a0
            r2.<init>(r3, r4, r0)
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.v.Eg(android.app.Activity):void");
    }

    @Override // w04.k
    public void F5(java.lang.String str) {
        f344579g.post(new od0.m0(this, str));
    }

    @Override // w04.k
    public void Fe(android.content.Intent intent, java.lang.String str) {
        f344579g.post(new od0.h0(this, intent, str));
    }

    @Override // w04.k
    public void G7(int i17, com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus) {
        f344579g.post(new od0.i0(this, audioModeStatus, i17));
    }

    @Override // w04.k
    public void Ki() {
        f344579g.post(new od0.j0(this));
    }

    @Override // w04.k
    public boolean M5(int i17, long j17) {
        boolean z17;
        synchronized (this) {
            java.lang.StringBuilder reverse = new java.lang.StringBuilder("gsmron").reverse();
            reverse.append(new java.lang.StringBuilder("atadtsurt_").reverse().toString());
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(reverse.toString());
            long j18 = M.getLong(java.lang.String.format("%s", java.lang.Integer.valueOf(i17)), 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (j18 != 0 && currentTimeMillis >= j18) {
                if (currentTimeMillis - j18 > j17) {
                    M.putLong(java.lang.String.format("%s", java.lang.Integer.valueOf(i17)), currentTimeMillis);
                    z17 = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", java.lang.Boolean.valueOf(z17));
                }
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", java.lang.Boolean.valueOf(z17));
            }
            M.putLong(java.lang.String.format("%s", java.lang.Integer.valueOf(i17)), currentTimeMillis);
            if (j18 == 0) {
                z17 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", java.lang.Boolean.valueOf(z17));
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    @Override // w04.k
    public void Nc() {
        f344579g.post(new od0.w(this));
    }

    @Override // w04.k
    public void Nf(int i17) {
        java.lang.String[] split;
        r45.i0 i0Var = new r45.i0();
        i0Var.f376596d = android.os.Build.MANUFACTURER;
        i0Var.f376597e = wo.w0.m();
        i0Var.f376598f = android.os.Build.VERSION.RELEASE;
        i0Var.f376599g = android.os.Build.VERSION.INCREMENTAL;
        i0Var.f376600h = android.os.Build.DISPLAY;
        if (i17 == -2147483646) {
            i0Var.f376601i = android.os.Build.FINGERPRINT;
            java.lang.String Db = fo3.s.INSTANCE.Db(false);
            if (!android.text.TextUtils.isEmpty(Db) && (split = Db.split(",")) != null) {
                for (java.lang.String str : split) {
                    i0Var.f376602m.add(str);
                }
            }
        }
        try {
            byte[] byteArray = i0Var.toByteArray();
            r45.d40 d40Var = new r45.d40();
            d40Var.f372065d = new com.tencent.mm.protobuf.g("".getBytes());
            d40Var.f372066e = 1;
            byte[] wi6 = wi(byteArray, 0, byteArray.length);
            if (wi6 == null) {
                d40Var.f372067f = new com.tencent.mm.protobuf.g("compress data failed".getBytes());
                d40Var.f372069h = 1;
                d40Var.f372068g = java.lang.System.currentTimeMillis() / 1000;
                d40Var.f372070i = 1;
            } else {
                if (wi6.length > 5120) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(633L, 4L, 1L, false);
                }
                d40Var.f372067f = new com.tencent.mm.protobuf.g(wi6, 0, wi6.length);
                d40Var.f372069h = 4;
                d40Var.f372068g = java.lang.System.currentTimeMillis() / 1000;
                d40Var.f372070i = 0;
            }
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(d40Var.toByteArray());
            k57Var.f378398h = cu5Var;
            byte[] byteArray2 = k57Var.toByteArray();
            java.lang.String.format("[debug] report di info msg: len = %d \n", java.lang.Integer.valueOf(byteArray2.length));
            Ai(i17, byteArray2, false);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // w04.k
    public boolean Of(int i17, long j17) {
        boolean z17;
        r45.jw4 jw4Var = od0.o0.f344568a;
        synchronized (od0.o0.class) {
            z17 = false;
            if (j17 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SecInfoReporterImpl", "bad interval: %s", java.lang.Long.valueOf(j17));
            } else {
                if (od0.o0.f344568a == null) {
                    od0.o0.d();
                }
                r45.kw4 a17 = od0.o0.a(i17);
                if (a17 == null) {
                    a17 = new r45.kw4();
                    a17.f379001d = i17;
                    a17.f379002e = 0L;
                    od0.o0.f344568a.f378168d.add(a17);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j18 = a17.f379002e;
                if (currentTimeMillis < j18 || currentTimeMillis - j18 > j17) {
                    a17.f379002e = currentTimeMillis;
                    a17.f379003f = 1;
                    od0.o0.g();
                    z17 = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReportForRoutine called, res: %s, cycleTag:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        return z17;
    }

    @Override // w04.k
    public void Q3() {
        byte[] e17 = com.tencent.mm.normsg.WCProbe$Info.e(32);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] data is null.");
            return;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(e17);
            k57Var.f378396f = cu5Var;
            java.lang.String.format("[debug] ccd data len = %d in yap", java.lang.Integer.valueOf(e17.length));
            Ai(540999683, k57Var.toByteArray(), false);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report yap through cgi, type: sec");
    }

    @Override // w04.k
    public void Ta(java.lang.String str) {
        f344579g.post(new od0.l0(this, str));
    }

    @Override // w04.k
    public void Y3(int i17) {
        f344579g.post(new od0.z(this, i17));
    }

    @Override // w04.k
    public void a8(int i17, int i18, int i19, int i27, byte[] bArr, boolean z17) {
        byte[] f17 = com.tencent.mm.normsg.WCProbe$Info.f(i18, i19, i27, bArr);
        byte[] O9 = fo3.s.INSTANCE.O9();
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] data is null.");
            return;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            if (O9 != null) {
                r45.d40 d40Var = new r45.d40();
                d40Var.f372065d = new com.tencent.mm.protobuf.g("".getBytes());
                d40Var.f372066e = 1;
                d40Var.f372067f = new com.tencent.mm.protobuf.g(O9);
                d40Var.f372069h = 2;
                d40Var.f372068g = java.lang.System.currentTimeMillis() / 1000;
                d40Var.f372070i = 0;
                byte[] byteArray = d40Var.toByteArray();
                java.lang.String.format("[debug] tur ccd data len = %d", java.lang.Integer.valueOf(byteArray.length));
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(byteArray);
                k57Var.f378399i = cu5Var;
            } else {
                java.lang.String.format("[debug] tur ccd data is null ", new java.lang.Object[0]);
            }
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(f17);
            k57Var.f378396f = cu5Var2;
            java.lang.String.format("[debug] ccd data len = %d", java.lang.Integer.valueOf(f17.length));
            Ai(i17, k57Var.toByteArray(), z17);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report through cgi, type: sec, ctx: %d", java.lang.Integer.valueOf(i17));
    }

    @Override // w04.k
    public void ab(int i17, int i18, boolean z17) {
        a8(i17, i18, 0, 0, null, z17);
    }

    @Override // w04.k
    public void ac(int i17, java.lang.String str, boolean z17) {
        f344579g.post(new od0.x(this, str, z17, i17));
    }

    @Override // w04.k
    public void ae() {
        new com.tencent.mm.autogen.events.ReportCCDataByPayEvent().e();
    }

    @Override // w04.k
    public void eg(int i17, java.lang.String str, fo3.r rVar) {
        f344579g.post(new od0.y(this, rVar, str, i17));
    }

    @Override // w04.k
    public void f7(int i17, int i18) {
        ab(i17, i18, false);
    }

    @Override // w04.k
    public void ic(android.content.Intent intent) {
        f344579g.post(new od0.b0(this, intent));
    }

    @Override // w04.k
    public void k4(int i17, java.lang.String str, long j17, int i18, java.lang.String str2) {
        com.tencent.mm.network.AccInfo accInfo;
        try {
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 != null && (accInfo = c17.f71993n) != null && accInfo.isLogin()) {
                if (str == null) {
                    str = "";
                }
                byte[] U4 = fo3.s.INSTANCE.U4(i17, str, j17, i18, str2);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(U4);
                k57Var.f378408u = cu5Var;
                Ai(540999709, k57Var.toByteArray(), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report sre suc");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report sre error, msg:" + th6);
        }
    }

    @Override // w04.k
    public void kc(java.lang.String str, long j17, java.lang.String str2, int i17) {
        try {
            f344579g.post(new od0.e0(this, str, j17, str2, i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "post report cssi task error: %s", th6.toString());
        }
    }

    @Override // w04.k
    public void kd(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] behaviorID or data is null.");
            return;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(str.getBytes());
            k57Var.f378401n = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(bArr);
            k57Var.f378402o = cu5Var2;
            Ai(540999687, k57Var.toByteArray(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report sensor scene info through cgi, len: %d, type: sec", java.lang.Integer.valueOf(bArr.length));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // w04.k
    public void me(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            return;
        }
        com.tencent.mm.autogen.events.ReportSensorDataEvent reportSensorDataEvent = new com.tencent.mm.autogen.events.ReportSensorDataEvent();
        am.er erVar = reportSensorDataEvent.f54689g;
        erVar.f6604a = bArr;
        erVar.f6605b = str;
        reportSensorDataEvent.e();
    }

    @Override // w04.k
    public void pe(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "data is null.");
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = fo3.s.INSTANCE.V6("P\u001f\u001a\u0013V\u001a\u0010\u0018X\u0019\u001c\u0011\u0001\u001f\u001c\u001d\bA\u000f\u0003\u0005G\u001b\u0003\u0017\u000b\u0017\u0016\u0014\u0005\u000371:29<1");
        lVar.f70667d = 8108;
        lVar.f70664a = new r45.br5();
        lVar.f70665b = new r45.cr5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.br5 br5Var = (r45.br5) a17.f70710a.f70684a;
        br5Var.f371008d = 2;
        br5Var.f371009e = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        jx3.f.INSTANCE.idkeyStat(416L, 3L, 1L, false);
        com.tencent.mm.modelbase.z2.f(a17, new com.tencent.mm.modelbase.g3(new od0.d0(this)), com.tencent.mm.modelbase.z2.f70848c, true);
    }

    @Override // w04.k
    public void ue(java.lang.String str) {
        f344579g.post(new od0.g0(this, str));
    }

    @Override // w04.k
    public void vc(final int i17, android.view.MotionEvent motionEvent, final java.lang.String str) {
        if (motionEvent.getAction() == 1 && !android.text.TextUtils.isEmpty(str)) {
            final android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: od0.v$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str2 = str;
                    final od0.v vVar = od0.v.this;
                    vVar.getClass();
                    final int i18 = i17;
                    android.view.MotionEvent motionEvent2 = obtain;
                    if (i18 == 540999748) {
                        try {
                            fo3.s sVar = fo3.s.INSTANCE;
                            sVar.Z7("ceu_global", str2);
                            sVar.Oi("ceu_global", motionEvent2, false, str2);
                            sVar.Qa("ceu_global");
                            final boolean z17 = true;
                            final byte[] Y8 = sVar.Y8("ceu_global", new com.tencent.mm.normsg.i(true, false, true, true));
                            if (!com.tencent.mm.sdk.platformtools.t8.M0(Y8)) {
                                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                int i19 = 20;
                                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_global_click_report_count, 20);
                                if (Ni >= 0) {
                                    i19 = Ni;
                                }
                                if (od0.o0.c(13, 86400000L, i19) && !com.tencent.mm.sdk.platformtools.t8.M0(Y8)) {
                                    od0.v.f344579g.post(new java.lang.Runnable() { // from class: od0.v$$b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte[] bArr = Y8;
                                            int i27 = i18;
                                            od0.v vVar2 = od0.v.this;
                                            vVar2.getClass();
                                            try {
                                                r45.k57 k57Var = new r45.k57();
                                                r45.cu5 cu5Var = new r45.cu5();
                                                cu5Var.d(bArr);
                                                k57Var.f378395e = cu5Var;
                                                if (z17) {
                                                    r45.cu5 cu5Var2 = new r45.cu5();
                                                    cu5Var2.d(fo3.s.INSTANCE.h());
                                                    k57Var.f378396f = cu5Var2;
                                                }
                                                vVar2.Ai(i27, k57Var.toByteArray(), false);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report arcitc suc");
                                            } catch (java.lang.Throwable th6) {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] report arcitc error, msg:" + th6);
                                            }
                                        }
                                    });
                                }
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                }
            }, "SIRI.GTE");
        }
    }

    public final byte[] wi(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("dataIn is null.");
        }
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        deflater.setLevel(9);
        deflater.setInput(bArr, i17, i18);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i18);
        deflater.finish();
        byte[] bArr2 = new byte[4096];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        try {
            byteArrayOutputStream.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SecInfoReporterImpl", e17, "exception when compressing dump maps", new java.lang.Object[0]);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // w04.k
    public void xg(int i17) {
        byte[] e17 = com.tencent.mm.normsg.WCProbe$Info.e(560);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] data is null.");
            return;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(e17);
            k57Var.f378396f = cu5Var;
            java.lang.String.format("[debug] ccd data len = %d ctx=%d in finder", java.lang.Integer.valueOf(e17.length), java.lang.Integer.valueOf(i17));
            Ai(i17, k57Var.toByteArray(), false);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report finder through cgi, type: sec");
    }
}
