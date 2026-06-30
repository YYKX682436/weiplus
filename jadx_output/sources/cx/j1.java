package cx;

/* loaded from: classes7.dex */
public abstract class j1 extends i95.w implements bx.t {

    /* renamed from: e */
    public cx.w0 f224422e;

    /* renamed from: d */
    public final jz5.g f224421d = jz5.h.b(new cx.e1(this));

    /* renamed from: f */
    public long f224423f = -1;

    /* renamed from: g */
    public final jz5.g f224424g = jz5.h.b(new cx.g1(this));

    /* renamed from: h */
    public boolean f224425h = true;

    /* renamed from: i */
    public final java.lang.Runnable f224426i = new cx.c1(this);

    /* renamed from: m */
    public final com.tencent.mm.sdk.platformtools.n3 f224427m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: n */
    public final java.lang.Runnable f224428n = new cx.z0(this);

    /* renamed from: o */
    public final cx.a1 f224429o = new cx.a1(this);

    /* renamed from: p */
    public final com.tencent.mm.feature.brandservice.flutter.magicbrush.biz.MagicBrandBaseFeatureService$preCleanFileEvent$1 f224430p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.feature.brandservice.flutter.magicbrush.biz.MagicBrandBaseFeatureService$preCleanFileEvent$1
        {
            this.__eventId = 1489935310;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
            com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = beforeAggressiveCleanCacheEvent;
            kotlin.jvm.internal.o.g(event, "event");
            ((ku5.t0) ku5.t0.f312615d).B(new cx.f1(event, cx.j1.this));
            return false;
        }
    };

    public static final boolean Ai(cx.j1 j1Var) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(j1Var.cj());
        int o17 = M.o("crashCount", 0);
        long q17 = M.q("lastCrashTimeStamp", -1L);
        int o18 = M.o("lastCrashVersion", -1);
        com.tencent.mars.xlog.Log.i(j1Var.pj(), "hy: stability log: crashCount: " + o17 + ", lastCrashTimeStamp: " + q17 + ", lastCrashVersion: " + o18);
        jz5.g gVar = j1Var.f224424g;
        boolean z17 = q17 != -1 && (android.os.SystemClock.elapsedRealtime() - q17) / ((long) 1000) > ((cx.y0) ((jz5.n) gVar).getValue()).f224488c;
        boolean z18 = (o18 == -1 || o18 == o45.wf.f343029g) ? false : true;
        if (!z17 && !z18) {
            boolean z19 = o17 < ((cx.y0) ((jz5.n) gVar).getValue()).f224487b;
            if (!z19) {
                ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandStabilityClose", 1, null, 1.0f);
            }
            return z19;
        }
        com.tencent.mars.xlog.Log.i(j1Var.pj(), "hy: recover status because shouldRecoverForTimeout " + z17 + ", shouldRecoverForVersion " + z18);
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandStabilityRecover", 1, null, 1.0f);
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M(j1Var.cj());
        M2.A("crashCount", 0);
        M2.B("lastCrashTimeStamp", -1L);
        M2.A("lastCrashVersion", -1);
        return true;
    }

    public static final /* synthetic */ java.lang.String Bi(cx.j1 j1Var) {
        return j1Var.pj();
    }

    private final java.lang.String cj() {
        return "MagicBrushBrandStability_" + Ri();
    }

    public final java.lang.String pj() {
        return "MicroMsg.MagicBrandBaseFeatureService." + Ri();
    }

    public static final void wi(cx.j1 j1Var, int i17, java.lang.String frameSetName, java.lang.String data) {
        cx.w0 w0Var = j1Var.f224422e;
        if (w0Var != null) {
            cl0.g gVar = new cl0.g();
            gVar.h("frameSetName", frameSetName);
            gVar.o("preLayoutScene", i17);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            kotlin.jvm.internal.o.g(data, "data");
            pm0.v.X(new cx.s0(i17, w0Var, frameSetName, data, gVar2));
        }
    }

    public final synchronized boolean Di(int i17) {
        if (!bj()) {
            com.tencent.mars.xlog.Log.e(pj(), "create not open!");
            return false;
        }
        this.f224427m.removeCallbacksAndMessages(null);
        if (this.f224425h && !bx.y.f36235a.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i(pj(), "canDestroy set to false, scene: " + i17);
            this.f224425h = false;
        }
        if (this.f224425h) {
            java.lang.Runnable task = this.f224426i;
            kotlin.jvm.internal.o.g(task, "task");
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f224427m;
            n3Var.removeCallbacksAndMessages(null);
            n3Var.postDelayed(task, 60000L);
        }
        if (this.f224422e != null) {
            com.tencent.mars.xlog.Log.w(pj(), "has created, skip biz create, scene: " + i17);
            return false;
        }
        com.tencent.mars.xlog.Log.i(pj(), "createBrandServiceBiz scene:" + i17);
        this.f224422e = Ni(i17);
        return true;
    }

    public synchronized void K6(int i17) {
        if (this.f224422e == null) {
            com.tencent.mars.xlog.Log.i(pj(), "destroyBrandServiceBiz hasDestroy");
            return;
        }
        mq0.d1 d1Var = mq0.d1.f330546a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "clearCardExposeKeys");
        mq0.d1.f330548c.clear();
        this.f224423f = -1L;
        com.tencent.mars.xlog.Log.i(pj(), "destroyBrandServiceBiz " + i17);
        cx.w0 w0Var = this.f224422e;
        if (w0Var != null) {
            w0Var.destroy();
        }
        this.f224422e = null;
        this.f224425h = true;
    }

    public abstract cx.w0 Ni(int i17);

    public abstract java.lang.String Ri();

    public java.lang.String Ui() {
        jc3.x E1;
        java.lang.String e17;
        cx.w0 w0Var = this.f224422e;
        return (w0Var == null || (E1 = w0Var.E1()) == null || (e17 = E1.e()) == null) ? ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi(Vi()) : e17;
    }

    public abstract java.lang.String Vi();

    public abstract dq0.a0 Zi();

    public abstract int aj();

    public final boolean bj() {
        return ((java.lang.Boolean) ((jz5.n) this.f224421d).getValue()).booleanValue();
    }

    public abstract boolean fj();

    public void hj(long j17, java.lang.String frameSetName, java.lang.String frameSetData) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        com.tencent.mars.xlog.Log.i(pj(), "notifyFrameSetInfo " + j17 + ' ' + frameSetName + ' ' + frameSetData.length());
        pm0.v.X(new cx.b1(this, frameSetName, frameSetData));
    }

    public synchronized void ij(java.lang.String eventName) {
        java.lang.String gVar;
        kotlin.jvm.internal.o.g(eventName, "eventName");
        if (!bj()) {
            com.tencent.mars.xlog.Log.e(pj(), "dispatch event not open!");
            return;
        }
        com.tencent.mars.xlog.Log.i(pj(), "notifyStateChange ".concat(eventName));
        if (kotlin.jvm.internal.o.b(eventName, "brandServiceBoxClick")) {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("eventName", eventName);
            gVar2.p(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis());
            gVar = gVar2.toString();
        } else {
            cl0.g gVar3 = new cl0.g();
            gVar3.h("eventName", eventName);
            gVar = gVar3.toString();
        }
        kotlin.jvm.internal.o.d(gVar);
        pj();
        cx.d1 d1Var = new cx.d1(this, gVar);
        if (kotlin.jvm.internal.o.b(eventName, "brandServiceBoxClick")) {
            Di(7);
            dq0.a0 Zi = Zi();
            synchronized (Zi) {
                if (Zi.f242292h) {
                    d1Var.run();
                } else {
                    Zi.f242293i.add(d1Var);
                }
            }
        } else {
            d1Var.run();
        }
    }

    public abstract void mj();

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x00f1, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0013, B:12:0x0017, B:14:0x001d, B:17:0x002d, B:19:0x0037, B:22:0x0051, B:24:0x005c, B:26:0x006a, B:28:0x006e, B:29:0x0076, B:31:0x007a, B:32:0x007d, B:34:0x008a, B:35:0x0094, B:39:0x0099, B:40:0x00f0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x00f1, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0013, B:12:0x0017, B:14:0x001d, B:17:0x002d, B:19:0x0037, B:22:0x0051, B:24:0x005c, B:26:0x006a, B:28:0x006e, B:29:0x0076, B:31:0x007a, B:32:0x007d, B:34:0x008a, B:35:0x0094, B:39:0x0099, B:40:0x00f0), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void nj() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cx.j1.nj():void");
    }

    public abstract boolean oj();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(this.f224429o);
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        cx.w0 w0Var = this.f224422e;
        if (w0Var != null) {
            w0Var.destroy();
        }
        this.f224422e = null;
        this.f224425h = true;
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.removeLifecycleCallback(this.f224429o);
        dead();
    }
}
