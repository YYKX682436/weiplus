package y40;

@j95.b
/* loaded from: classes11.dex */
public final class i0 extends i95.w implements z40.e {

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f459297f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.l1 f459298g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f459299h;

    /* renamed from: i, reason: collision with root package name */
    public long f459300i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f459301m;

    /* renamed from: w, reason: collision with root package name */
    public long f459311w;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f459295d = "Finder.BoxFlutterBizFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f459296e = kotlinx.coroutines.z0.b();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f459302n = jz5.h.b(new y40.z(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f459303o = jz5.h.b(new y40.h0(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f459304p = jz5.h.b(new y40.b(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f459305q = jz5.h.b(new y40.a(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f459306r = jz5.h.b(new y40.i(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f459307s = jz5.h.b(y40.b0.f459280d);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f459308t = jz5.h.b(new y40.y(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f459309u = jz5.h.b(y40.k.f459317d);

    /* renamed from: v, reason: collision with root package name */
    public final long f459310v = 15000;

    public static final void wi(y40.i0 i0Var) {
        i0Var.getClass();
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32266, new java.lang.Object[0]);
            com.tencent.wechat.mm.finder_box.c0 a17 = a50.e1.f1471a.a();
            if (a17 != null) {
                a17.p(y40.h.f459292a);
            }
        }
    }

    public void Ai() {
        if (Ni()) {
            boolean z17 = yw.h1.f466332a.m().o("hide_box_when_delete", 0) == 1;
            if (z17) {
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f459309u).getValue()).G("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", true);
            }
            com.tencent.wechat.mm.finder_box.c0 a17 = a50.e1.f1471a.a();
            if (a17 != null) {
                a17.v(z17, y40.f.f459287a);
            }
        }
        kotlinx.coroutines.l.d(this.f459296e, null, null, new y40.j(this, null), 3, null);
    }

    public boolean Bi(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - this.f459311w);
        java.lang.String str = this.f459295d;
        if (abs < 1000) {
            jx3.f.INSTANCE.w(1971L, 7L, 1L);
            com.tencent.mars.xlog.Log.i(str, "openBizTimeLineWithFlutter click in 1000ms");
            return false;
        }
        if (this.f459297f != null) {
            com.tencent.mars.xlog.Log.i(str, "current job not finish, return (lastClickTime=" + this.f459311w + "  current=" + currentTimeMillis + ')');
            return false;
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347325v);
        eq1.j.f255821a.j();
        this.f459311w = currentTimeMillis;
        this.f459300i = currentTimeMillis;
        this.f459297f = kotlinx.coroutines.l.d(this.f459296e, null, null, new y40.x(currentTimeMillis, intent, this, context, null), 3, null);
        return true;
    }

    public boolean Di() {
        int i17 = yw.h1.f466336e;
        if (!((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f459303o).getValue()).booleanValue()) || a50.e1.f1476f) {
            yw.h1 h1Var = yw.h1.f466332a;
            int i18 = yw.h1.f466335d;
            return (i18 == 1 || i18 != 0) && ((java.lang.Boolean) ((jz5.n) this.f459302n).getValue()).booleanValue();
        }
        com.tencent.mars.xlog.Log.e(this.f459295d, "openFlutterBizTimeLineUseAff dbInitDone false!, check BoxFlutterBizMsgBridge.init(), forceSetEnableFinderBox(false)");
        i95.m c17 = i95.n0.c(l85.g0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        l85.d0 d0Var = (l85.d0) ((l85.g0) c17);
        com.tencent.mars.xlog.Log.w("Finder.BoxFinderConfigToBoxSpi", "force set enableFinderBox from " + d0Var.f317144d + " to false");
        d0Var.f317144d = java.lang.Boolean.FALSE;
        return false;
    }

    public boolean Ni() {
        int i17 = yw.h1.f466336e;
        boolean z17 = ((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f459303o).getValue()).booleanValue()) && a50.e1.f1476f && Di();
        synchronized (a50.e1.f1471a) {
            if (a50.e1.f1477g == null) {
                jz5.g gVar = a50.e1.f1472b;
                boolean i18 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).i("openAff", false);
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).G("openAff", z17);
                if (i18 == z17 || !z17) {
                    a50.e1.f1477g = java.lang.Boolean.FALSE;
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.BoxFlutterBizMsgBridge", "resetData");
                    a50.e1.f1477g = java.lang.Boolean.TRUE;
                }
            }
        }
        return z17;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f459295d, "onAccountInitialized");
        if (z40.e.l4()) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.BoxFlutterBizFeatureService$onAccountInitialized$1
                {
                    this.__eventId = 915464157;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent bypCommonBizMMBizNotifyEvent) {
                    com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent event = bypCommonBizMMBizNotifyEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mars.xlog.Log.i(y40.i0.this.f459295d, "receive reliable notify");
                    if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
                        return true;
                    }
                    com.tencent.wechat.mm.finder_box.c0.f219335b.u(event.f54016g.f6727a, y40.l.f459318a);
                    return true;
                }
            };
            this.f459301m = iListener;
            iListener.alive();
            a50.e1.f1471a.b();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i(this.f459295d, "onAccountReleased");
        if (z40.e.l4()) {
            com.tencent.mm.sdk.event.IListener iListener = this.f459301m;
            if (iListener != null) {
                iListener.dead();
            }
            this.f459301m = null;
            synchronized (a50.e1.f1471a) {
                a50.e1.f1474d = false;
            }
        }
    }
}
