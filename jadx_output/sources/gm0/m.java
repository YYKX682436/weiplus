package gm0;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f273231t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f273232u;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f273236y;

    /* renamed from: a, reason: collision with root package name */
    public final hm0.u f273238a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelbase.n3 f273239b;

    /* renamed from: f, reason: collision with root package name */
    public c01.b f273243f;

    /* renamed from: g, reason: collision with root package name */
    public gm0.m0 f273244g;

    /* renamed from: h, reason: collision with root package name */
    public final gm0.b f273245h;

    /* renamed from: l, reason: collision with root package name */
    public int f273249l;

    /* renamed from: n, reason: collision with root package name */
    public long f273251n;

    /* renamed from: v, reason: collision with root package name */
    public static final gm0.l f273233v = new gm0.l();

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f273234w = "NoResetUinStack";

    /* renamed from: x, reason: collision with root package name */
    public static java.lang.String f273235x = null;

    /* renamed from: z, reason: collision with root package name */
    public static int f273237z = -1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f273240c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f273241d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273242e = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273246i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f273247j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f273248k = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f273250m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public volatile gm0.k f273252o = gm0.k.NotReady;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f273253p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f273254q = false;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f273255r = "";

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f273256s = new java.util.HashMap();

    public m(hm0.u uVar) {
        iz5.a.d(null, f273233v);
        gm0.j1.i();
        f273231t = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(17)) != 0;
        o45.qg.f343000a = new c01.f9(o45.ag.f342892a ? 763 : 702);
        this.f273238a = uVar;
        this.f273245h = new gm0.b();
    }

    public static void A(int i17) {
        int i18 = f273237z;
        if (i18 == -1 || i18 != i17) {
            f273237z = i17;
            v().edit().putInt("notification.user.state", i17).commit();
            com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "[NOTIFICATION SETTINGS]save UserStatus: %d", java.lang.Integer.valueOf(i17));
        }
    }

    public static void E() {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[2];
        gm0.j1.i();
        if (gm0.j1.b() != null) {
            gm0.j1.i();
            str = kk.v.a(gm0.j1.b().h());
        } else {
            str = "-1";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(gm0.j1.b().m());
        com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", " UN HOLD ACCOUNT! uin:%s init:%b", objArr);
        f273231t = false;
        gm0.j1.i();
        gm0.j1.u().f273148a.f(17, 0);
    }

    public static java.lang.String e() {
        gm0.j1.i();
        if (com.tencent.mm.sdk.platformtools.t8.K0(gm0.j1.b().f273255r)) {
            gm0.j1.i();
            gm0.j1.b().f273255r = wo.w0.k() + "_" + java.lang.System.currentTimeMillis();
        }
        gm0.j1.i();
        return gm0.j1.b().f273255r;
    }

    public static int f(java.lang.String str) {
        int intValue;
        gm0.j1.i();
        if (((java.util.HashMap) gm0.j1.b().f273256s).get(str) == null) {
            intValue = 0;
        } else {
            gm0.j1.i();
            intValue = ((java.lang.Integer) ((java.util.HashMap) gm0.j1.b().f273256s).get(str)).intValue();
        }
        int i17 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        if (intValue == 0) {
            gm0.j1.i();
            ((java.util.HashMap) gm0.j1.b().f273256s).put(str, java.lang.Integer.valueOf(i17));
            return intValue;
        }
        int i18 = i17 - intValue;
        gm0.j1.i();
        ((java.util.HashMap) gm0.j1.b().f273256s).put(str, java.lang.Integer.valueOf(i17));
        if (i18 >= 0) {
            return i18;
        }
        return 0;
    }

    public static int g() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
        return !M.i("has_uin_timely", false) ? i() : M.o("default_uin_timely", 0);
    }

    public static int i() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0));
        if (valueOf.intValue() == 0) {
            valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs").o("default_uin", 0));
            if (valueOf.intValue() != 0) {
                jx3.f.INSTANCE.idkeyStat(148L, 151L, 1L, false);
                com.tencent.mars.xlog.Log.e("MMKernel.CoreAccount", "getUinFromSharedPreferences get from sp fail");
            }
        }
        return valueOf.intValue();
    }

    public static void o() {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[3];
        gm0.j1.i();
        if (gm0.j1.b() != null) {
            gm0.j1.i();
            str = kk.v.a(gm0.j1.b().h());
        } else {
            str = "-1";
        }
        objArr[0] = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[1] = new com.tencent.mm.sdk.platformtools.z3();
        objArr[2] = java.lang.Boolean.valueOf(gm0.j1.b().m());
        com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", " HOLD ACCOUNT! uin:%s stack:%s init:%b", objArr);
        f273231t = true;
        gm0.j1.i();
        gm0.j1.u().f273148a.f(17, 1);
    }

    public static boolean r() {
        java.lang.String str;
        if (f273231t) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            gm0.j1.i();
            if (gm0.j1.b() != null) {
                gm0.j1.i();
                str = kk.v.a(gm0.j1.b().h());
            } else {
                str = "-1";
            }
            objArr[0] = str;
            objArr[1] = java.lang.Boolean.valueOf(gm0.j1.b().m());
            com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "account holded :%s init:%b", objArr);
        }
        return f273231t;
    }

    public static boolean s() {
        boolean i17 = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs").i("virtual_login_mark", false);
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "[!] isVirtualLogin: %s", java.lang.Boolean.valueOf(i17));
        return i17;
    }

    public static void u() {
        f273236y = true;
        nm.i iVar = (nm.i) nm.i.f338436g.b();
        iVar.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.FirstScreenArrangement2", "[!] cancelScheduledBail called.");
        nm.g gVar = iVar.f338438b;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] PendingActionScheduler.cancelWatchDog called.");
        gVar.removeMessages(1);
        gVar.removeMessages(2);
    }

    public static android.content.SharedPreferences v() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_key_pref_settings", 4);
    }

    public final void B() {
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "changeToNotReady");
        this.f273252o = gm0.k.NotReady;
        this.f273254q = false;
        hq.e.f282964a = false;
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "mAccountStatus to NotReady");
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putBoolean("isLogin", false).commit();
        com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "[arthurdan.AccountNR] account storage reset! uin:%d, resetStack is:%s, resetTime:%s", java.lang.Integer.valueOf(gm0.l.a(f273233v)), f273234w, new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.getDefault()).format(new java.util.Date()));
    }

    public void C() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f273254q);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "summerasyncinit setInitializedNotifyAllDone[%b] to true stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        this.f273254q = true;
        hq.e.f282964a = true;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "summerhardcoder setInitializedNotifyAllDone [%d %d] take[%d]ms, stack[%s]", java.lang.Long.valueOf(this.f273251n), java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime - this.f273251n), new com.tencent.mm.sdk.platformtools.z3());
    }

    public void D(int i17, int i18) {
        if ((this.f273248k == i17 && this.f273249l == i18) ? false : true) {
            this.f273248k = i17;
            this.f273249l = i18;
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new gm0.h(this));
        }
    }

    public void a(c01.y8 y8Var) {
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "UserStatusChange: add %s", y8Var);
        synchronized (this.f273250m) {
            if (!((java.util.LinkedList) this.f273250m).contains(y8Var)) {
                ((java.util.LinkedList) this.f273250m).add(y8Var);
            }
        }
    }

    public void b() {
        if (m() && im0.g.f292167g.f292169e) {
            com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "Flush client version.");
            gm0.b0 u17 = gm0.j1.u();
            u17.f273154g.w(14, java.lang.Integer.valueOf(o45.wf.f343029g));
            u17.f273154g.w(93, com.tencent.mm.sdk.platformtools.z.f193120p);
        }
    }

    public void c() {
        if (!m()) {
            throw new c01.c();
        }
    }

    public gm0.j d() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || "CN".equalsIgnoreCase(str)) ? gm0.j.WeiXin : gm0.j.WeChat;
    }

    public int h() {
        return gm0.l.a(f273233v);
    }

    public java.lang.String j() {
        return new kk.v(h()).toString();
    }

    public java.lang.String k() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f273241d)) {
            return this.f273241d;
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        return str == null ? "" : str;
    }

    public synchronized com.tencent.mm.modelbase.n3 l() {
        if (this.f273239b == null) {
            this.f273239b = new com.tencent.mm.modelbase.n3();
        }
        return this.f273239b;
    }

    public boolean m() {
        return this.f273252o == gm0.k.AccountHasReady;
    }

    public boolean n() {
        return gm0.l.a(f273233v) != 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:14|(1:16)(1:(1:328)(9:329|(8:332|333|334|335|(2:336|(4:349|350|351|352)(1:338))|341|(1:344)(1:343)|330)|368|(1:346)|347|18|(1:326)(1:22)|(1:325)|(49:30|31|32|(1:34)|35|36|(6:38|39|40|41|42|43)|59|(1:63)|64|65|66|(1:68)(2:300|(3:305|(3:307|(3:309|(2:311|312)(2:314|315)|313)|316)|317))|69|(2:71|369)|81|(2:83|(3:85|3db|92)(2:288|(1:295)(1:294)))(3:296|(1:298)|299)|93|(2:95|(1:97))|98|(1:100)(1:284)|(3:102|(1:104)|105)(1:283)|106|619|111|625|116|(2:265|266)|118|(1:120)|121|(10:123|(3:125|(2:127|128)(2:130|131)|129)|132|133|(2:135|(1:137))|138|(4:142|143|(1:145)|146)|263|(0)|146)(1:264)|147|(1:149)(1:260)|(1:151)(2:252|(3:254|(1:256)|257)(2:258|259))|152|(1:154)|155|(3:(3:245|242|243)|246|247)|157|(3:159|(1:161)|162)|163|93d|(1:171)(5:196|(1:198)(1:232)|(1:200)(2:213|(1:215)(4:216|(3:218|(1:230)(1:224)|(2:226|(1:228)(1:229)))|231|(0)(0)))|(4:202|(4:206|207|208|205)|204|205)|212)|(5:173|(1:175)|176|(1:178)(1:194)|(1:180))(1:195)|181|(1:183)|184|(2:186|(2:188|(1:193))))(2:28|29)))|17|18|(1:20)|326|(1:24)|325|(0)|30|31|32|(0)|35|36|(0)|59|(2:61|63)|64|65|66|(0)(0)|69|(0)|81|(0)(0)|93|(0)|98|(0)(0)|(0)(0)|106|619) */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x033c, code lost:
    
        if (r3 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x033f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0340, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ClearLegacyAccPath", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x061a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02bf A[Catch: all -> 0x033f, TryCatch #20 {all -> 0x033f, blocks: (B:66:0x0296, B:68:0x02b4, B:300:0x02bf, B:303:0x02c7, B:305:0x02cd, B:307:0x02f1, B:309:0x02f5, B:311:0x0311, B:313:0x0318, B:317:0x0329), top: B:65:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b9 A[LOOP:0: B:33:0x01b7->B:34:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b4 A[Catch: all -> 0x033f, TryCatch #20 {all -> 0x033f, blocks: (B:66:0x0296, B:68:0x02b4, B:300:0x02bf, B:303:0x02c7, B:305:0x02cd, B:307:0x02f1, B:309:0x02f5, B:311:0x0311, B:313:0x0318, B:317:0x0329), top: B:65:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r38) {
        /*
            Method dump skipped, instructions count: 3102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gm0.m.p(boolean):void");
    }

    public void q() {
        com.tencent.mm.app.u6.INSTANCE.h(com.tencent.mm.app.t6.UNTIL_INVOKE_KERNEL_EXTENSION_BEGIN);
        gm0.g2 g2Var = gm0.g2.INSTANCE;
        boolean[] zArr = g2Var.f273196e;
        if (!zArr[0]) {
            synchronized (zArr) {
                boolean[] zArr2 = g2Var.f273196e;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(14, null));
                    int i17 = o45.wf.f343029g;
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(93, null);
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193120p;
                    boolean k17 = gm0.j1.u().k();
                    com.tencent.mars.xlog.Log.i("MicroMsg.StorageManager", "dispatchCreateCoreDBTable, prev_cv: %s, curr_cv: %s, prev_build_rand_id: %s, curr_build_rand_id: %s, has corrupted DB %s", java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(i17), str, str2, java.lang.Boolean.valueOf(k17));
                    boolean z17 = (q17 == i17 && str2.equals(str) && !k17) ? false : true;
                    synchronized (g2Var.f273195d) {
                        g2Var.f273195d[0] = z17;
                    }
                    if (z17) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(gm0.e2.class)).all()).iterator();
                        while (true) {
                            fs.f fVar = (fs.f) it;
                            if (fVar.hasNext()) {
                                arrayList.add(((ku5.t0) ku5.t0.f312615d).a(new gm0.d2(g2Var, (fs.q) fVar.next())));
                            } else {
                                try {
                                    break;
                                } catch (java.lang.InterruptedException unused) {
                                }
                            }
                        }
                        java.util.concurrent.ForkJoinPool.managedBlock(new bm5.g0(arrayList));
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.StorageManager", "dispatchCreateCoreDBTable, not first startup, skip dispatching.");
                    }
                }
            }
        }
        gm0.j2 j2Var = gm0.j2.INSTANCE;
        boolean[] zArr3 = j2Var.f273221d;
        if (!zArr3[0]) {
            synchronized (zArr3) {
                boolean[] zArr4 = j2Var.f273221d;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    int q18 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(14, null));
                    int i18 = o45.wf.f343029g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.UpgradeManager", "dispatchClientUpgradedOnDemand, prev_cv: %s, curr_cv: %s", java.lang.Integer.valueOf(q18), java.lang.Integer.valueOf(i18));
                    if (q18 != i18) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(gm0.i2.class)).all()).iterator();
                        while (true) {
                            fs.f fVar2 = (fs.f) it6;
                            if (fVar2.hasNext()) {
                                arrayList2.add(((ku5.t0) ku5.t0.f312615d).a(new gm0.h2(j2Var, (fs.q) fVar2.next(), q18)));
                            } else {
                                try {
                                    break;
                                } catch (java.lang.InterruptedException unused2) {
                                }
                            }
                        }
                        java.util.concurrent.ForkJoinPool.managedBlock(new bm5.g0(arrayList2));
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.UpgradeManager", "dispatchClientUpgradedOnDemand, not upgrade, skip dispatching.");
                    }
                }
            }
        }
        this.f273253p = true;
        com.tencent.mm.app.u6.INSTANCE.h(com.tencent.mm.app.t6.UNTIL_INVOKE_KERNEL_EXTENSION_END);
    }

    public boolean t() {
        return (this.f273248k & 1) != 0;
    }

    public void w(boolean z17) {
        if (!this.f273247j) {
            com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "no need do account initialized notify.");
            return;
        }
        this.f273247j = false;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized tid:%d, stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.b bVar = this.f273245h;
        bVar.f273146f.d();
        bVar.f273145e = new com.tencent.mm.sdk.coroutines.LifecycleScope("AccountScope", bVar, 4);
        this.f273238a.r(this.f273244g);
        if (z17) {
            int[] iArr = nm.a.f338400a;
            gm0.c2.b("initializeAccountForActivatedServices-manual_login");
            i95.n0.e(true, true);
        }
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized run tid[%d] take[%d]ms", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        b();
    }

    public void x() {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new gm0.g(this));
    }

    public final void y() {
        java.lang.String a17 = kk.v.a(gm0.l.a(f273233v));
        java.lang.String name = java.lang.Thread.currentThread().getName();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "account storage release  uin:%s thread:%s stack:%s", a17, name, new com.tencent.mm.sdk.platformtools.z3());
        if (!m()) {
            com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "Fatal crash error!!! status is not initialized when release(), this callStack is:%s, last reset stack is:%s", com.tencent.mm.sdk.platformtools.z3.b(true), f273234w);
            return;
        }
        gm0.b bVar = this.f273245h;
        bVar.f273145e = null;
        bVar.f273146f.e();
        this.f273238a.a();
        android.app.Application application = i95.n0.f289817a;
        java.util.Set set = i95.n0.f289823g;
        java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
        boolean[] zArr = i95.n0.f289826j;
        synchronized (zArr) {
            zArr[0] = true;
        }
        synchronized (set) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(i95.n0.f289819c.submit((java.util.concurrent.Callable) new i95.z((i95.w) it.next(), th6)));
            }
            i95.n0.f289824h = false;
        }
        i95.n0.l(arrayList, true);
        gm0.j1.i();
        gm0.b0 u17 = gm0.j1.u();
        l75.k0 k0Var = u17.f273153f;
        if (k0Var != null) {
            k0Var.close();
        }
        u17.f273158k = false;
        B();
        gm0.j1.i();
        gm0.j1.u().f273159l.clear();
    }

    public void z(c01.y8 y8Var) {
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "UserStatusChange: remove %s", y8Var);
        synchronized (this.f273250m) {
            ((java.util.LinkedList) this.f273250m).remove(y8Var);
        }
    }
}
