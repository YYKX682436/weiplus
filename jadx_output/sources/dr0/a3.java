package dr0;

/* loaded from: classes12.dex */
public final class a3 {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f242405f;

    /* renamed from: a, reason: collision with root package name */
    public dr0.t2 f242408a;

    /* renamed from: b, reason: collision with root package name */
    public int f242409b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f242410c = jz5.h.a(jz5.i.f302829d, new dr0.y2(this));

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.w1 f242403d = new dr0.w1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f242404e = jz5.h.a(jz5.i.f302829d, dr0.v1.f242565d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f242406g = jz5.h.b(dr0.u1.f242561d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f242407h = jz5.h.b(dr0.t1.f242550d);

    public a3(kotlin.jvm.internal.i iVar) {
    }

    public static final boolean a(dr0.a3 a3Var) {
        return a3Var.g() && kotlin.jvm.internal.o.b(java.lang.String.valueOf(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.matrix.RepairerConfigProcLife())), "3357");
    }

    public static final dr0.t2 b(dr0.a3 a3Var, int i17) {
        dr0.t2 t2Var;
        a3Var.getClass();
        synchronized (f242403d.a()) {
            dr0.t2 t2Var2 = a3Var.f242408a;
            if (t2Var2 != null) {
                java.lang.String reason = "recycling-" + i17;
                kotlin.jvm.internal.o.g(reason, "reason");
                t2Var2.f242556e = "interrupt: ".concat(reason);
            }
            a3Var.f242408a = null;
            t2Var = new dr0.t2(i17);
            a3Var.f242408a = t2Var;
            t2Var.b();
        }
        return t2Var;
    }

    public static final void c(dr0.a3 a3Var) {
        a3Var.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#resetRecyclingStats");
        if (com.tencent.mm.sdk.platformtools.x2.f193077g) {
            ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            dr0.p1.f242489d.a().k(false);
        }
    }

    public final void d(java.lang.String reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "#cancelAllRecycleTasks");
        dr0.t2 t2Var = this.f242408a;
        if (t2Var != null) {
            t2Var.f242556e = "interrupt: ".concat(reason);
        }
        for (dr0.q3 q3Var : dr0.r3.f242523a) {
            if (q3Var.f242517f) {
                q3Var.h();
            }
        }
    }

    public final int e() {
        int i17;
        if (k() && mm.k.j(mm.k.D, null, 1, null) && (i17 = i()) > 0) {
            return i17;
        }
        return -1;
    }

    public final int f() {
        java.lang.Object valueOf;
        if (!k() || !mm.k.j(mm.k.F, null, 1, null)) {
            return -1;
        }
        if (mm.o.a()) {
            valueOf = 4;
        } else {
            java.lang.Long j17 = r26.h0.j(mm.k.G.f328524e);
            valueOf = java.lang.Long.valueOf(j17 != null ? j17.longValue() : 0L);
        }
        long k17 = mm.k.G.k(valueOf.toString());
        if (k17 >= 0) {
            return (int) k17;
        }
        return -1;
    }

    public final boolean g() {
        return com.tencent.mm.sdk.platformtools.s9.f192975c && com.tencent.mars.xlog.Log.getLogLevel() <= 1;
    }

    public final int h() {
        if (com.tencent.mm.sdk.platformtools.o4.L().getInt("battery-accproclife-lastpid-recycle", -1) == -1) {
            return -1;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            dr0.t tVar = dr0.t0.f242539j;
            return dr0.t0.f242540k.j();
        }
        dr0.p1 a17 = dr0.p1.f242489d.a();
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        if (!a17.j(PROCESS_MAIN)) {
            return com.tencent.mm.sdk.platformtools.o4.L().getInt("battery-accproclife-lastpid-" + ri.i.g(PROCESS_MAIN), 0);
        }
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.d0.f(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCVoid(), dr0.a1.class);
        if (iPCInteger != null) {
            return iPCInteger.f68404d;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "ipcGetLastMainPid failed");
        return -1;
    }

    public final int i() {
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.matrix.RepairerConfigProcLife());
        if (h17 > 0) {
            return h17;
        }
        com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
        java.lang.Integer c17 = sVar != null ? sVar.c(".com.tencent.mm.debug.bg_recycle_minute") : null;
        return (c17 == null || c17.intValue() <= 0) ? h17 : c17.intValue();
    }

    public final boolean j() {
        if (fp.e0.f265178b == null) {
            fp.e0.f265178b = fp.e0.f265177a.contains("google") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        if (fp.e0.f265178b.booleanValue() || fp.e0.g()) {
            return false;
        }
        if (fp.e0.f265180d == null) {
            fp.e0.f265180d = fp.e0.f265177a.contains("sony") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return !fp.e0.f265180d.booleanValue();
    }

    public final boolean k() {
        return !((java.lang.Boolean) ((jz5.n) f242406g).getValue()).booleanValue() && com.tencent.mm.sdk.platformtools.o4.L().getBoolean("battery-accproclife-recycle-enable", ((java.lang.Boolean) ((jz5.n) f242407h).getValue()).booleanValue());
    }

    public final boolean l() {
        java.lang.String m17 = wo.w0.m();
        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.o.f(ENGLISH, "ENGLISH");
        java.lang.String upperCase = m17.toUpperCase(ENGLISH);
        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
        mm.k kVar = mm.k.K;
        java.lang.String defVal = kVar.f328524e;
        kVar.getClass();
        kotlin.jvm.internal.o.g(defVal, "defVal");
        java.lang.String a17 = kVar.a(kVar.f328523d, defVal);
        if (a17 == null) {
            a17 = "";
        }
        return !r26.n0.f0(a17, new java.lang.String[]{";"}, false, 0, 6, null).contains(upperCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m() {
        /*
            r5 = this;
            boolean r0 = r5.k()
            r1 = 1
            if (r0 != 0) goto L12
            dr0.y1 r0 = dr0.z1.f242579c
            java.lang.String r2 = "MicroMsg.proc.Recycler"
            java.lang.String r3 = "supported NO: disabled"
            r0.a(r2, r3)
            goto L6b
        L12:
            dr0.h1 r0 = dr0.p1.f242489d
            dr0.p1 r0 = r0.a()
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r0.getClass()
            boolean r0 = com.tencent.mm.booter.o.f(r2)
            if (r0 != 0) goto L33
            dr0.y1 r0 = dr0.z1.f242579c
            java.lang.String r2 = "MicroMsg.proc.Recycler"
            java.lang.String r3 = "supported NO: ignoreBattOpt=false"
            r0.a(r2, r3)
            goto L6b
        L33:
            boolean r0 = r5.g()
            if (r0 == 0) goto L44
            dr0.y1 r0 = dr0.z1.f242579c
            java.lang.String r2 = "MicroMsg.proc.Recycler"
            java.lang.String r3 = "supported YES: hasDebugger"
            r0.a(r2, r3)
            goto L6d
        L44:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L5b
            boolean r0 = r5.j()
            if (r0 != 0) goto L5b
            dr0.y1 r0 = dr0.z1.f242579c
            java.lang.String r2 = "MicroMsg.proc.Recycler"
            java.lang.String r3 = "supported NO: forced splash logo"
            r0.a(r2, r3)
            goto L6b
        L5b:
            boolean r0 = r5.l()
            if (r0 != 0) goto L6d
            dr0.y1 r0 = dr0.z1.f242579c
            java.lang.String r2 = "MicroMsg.proc.Recycler"
            java.lang.String r3 = "supported NO: ban model"
            r0.a(r2, r3)
        L6b:
            r0 = 0
            goto L6e
        L6d:
            r0 = r1
        L6e:
            dr0.y1 r2 = dr0.z1.f242579c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r3 = dr0.a3.f242405f
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            r1 = r1 ^ r2
            jz5.g r2 = dr0.z1.f242580d
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            monitor-enter(r3)
            if (r1 == 0) goto La4
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb9
        L90:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto La4
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lb9
            dr0.z1 r2 = (dr0.z1) r2     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r2.f242581a     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = r2.f242582b     // Catch: java.lang.Throwable -> Lb9
            com.tencent.mars.xlog.Log.i(r4, r2)     // Catch: java.lang.Throwable -> Lb9
            goto L90
        La4:
            dr0.y1 r1 = dr0.z1.f242579c     // Catch: java.lang.Throwable -> Lb9
            jz5.g r1 = dr0.z1.f242580d     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb9
            r1.clear()     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            dr0.a3.f242405f = r1
            return r0
        Lb9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.a3.m():boolean");
    }

    public final int n() {
        return !mm.k.j(mm.k.M, null, 1, null) ? 2 : 4;
    }

    public final boolean o() {
        int i17 = com.tencent.mm.sdk.platformtools.o4.L().getInt("battery-accproclife-lastpid-recycle", -1);
        int h17 = h();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "lastPid=" + h17 + ", lastRecycledPid=" + i17);
        return i17 != -1 && i17 == h17;
    }

    public final boolean p() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-main");
            return false;
        }
        if (!m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-support");
            return false;
        }
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            return true;
        }
        if (ih.d.c()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: fg");
            return false;
        }
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: fg-legacy");
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort skip: matrix-fg but legacy-bg");
        return true;
    }

    public final void q(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", text);
        if (((java.lang.Boolean) this.f242410c.getValue()).booleanValue()) {
            ((ku5.t0) ku5.t0.f312615d).B(new dr0.z2(text));
        }
    }
}
