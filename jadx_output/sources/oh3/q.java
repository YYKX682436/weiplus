package oh3;

@j95.b
/* loaded from: classes8.dex */
public final class q extends i95.w implements p90.j {

    /* renamed from: n, reason: collision with root package name */
    public static final long f345449n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f345450o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f345451d = new com.tencent.mm.sdk.platformtools.n3("MMEcInit-Handler");

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f345452e = jz5.h.b(oh3.p.f345448d);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyEntranceListener$1 f345453f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyRedDotListener$1 f345454g;

    /* renamed from: h, reason: collision with root package name */
    public long f345455h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.vt f345456i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f345457m;

    static {
        int i17 = s26.a.f402368f;
        f345449n = s26.a.g(s26.c.e(6, s26.d.f402374i), s26.d.f402371f);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyEntranceListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyRedDotListener$1] */
    public q() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new oh3.l(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f345453f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyEntranceListener$1
            {
                this.__eventId = 1178720674;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent bypCommonBizMMECCardHolderEntranceNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent event = bypCommonBizMMECCardHolderEntranceNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = oh3.q.f345450o;
                oh3.q qVar = oh3.q.this;
                qVar.f345451d.post(new oh3.o(false, qVar, "notify"));
                return true;
            }
        };
        this.f345454g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMECRedDotNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyRedDotListener$1
            {
                this.__eventId = 82275100;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizMMECRedDotNotifyEvent bypCommonBizMMECRedDotNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizMMECRedDotNotifyEvent event = bypCommonBizMMECRedDotNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = oh3.q.f345450o;
                nh3.d wi6 = oh3.q.this.wi();
                byte[] bufferCtx = event.f54017g.f6805a;
                kotlin.jvm.internal.o.f(bufferCtx, "bufferCtx");
                wi6.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRedDotNotify] bufferCtx=");
                sb6.append(bufferCtx.length);
                sb6.append(" isAfterMMEcInit=");
                sb6.append(wi6.f337119a);
                sb6.append(" pendingSyncList=");
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = wi6.f337120b;
                sb6.append(concurrentLinkedQueue.size());
                com.tencent.mars.xlog.Log.i("MMEcRedDotHandler", sb6.toString());
                if (!wi6.f337119a) {
                    concurrentLinkedQueue.add(new nh3.b(bufferCtx));
                    return true;
                }
                w71.m1 wi7 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
                if (wi7 == null) {
                    return true;
                }
                urgen.ur_C563.UR_379F.UR_6FB1(((w71.n1) wi7).getCppPointer(), 11L, 5L, bufferCtx);
                return true;
            }
        };
        this.f345456i = new r45.vt();
        this.f345457m = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public final void Ai(r45.vt vtVar) {
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_MMEC_NEW_CARD_ENTRANCE_STRING, "");
        if (v17 != null) {
            try {
                vtVar.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
    }

    public final java.lang.String Bi(r45.vt vtVar) {
        kotlin.jvm.internal.o.g(vtVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show_type=");
        sb6.append(vtVar.f388511d);
        sb6.append(" need_preload=");
        sb6.append(vtVar.f388513f);
        sb6.append(" jump_info=");
        sb6.append(vtVar.f388512e != null);
        sb6.append(']');
        return sb6.toString();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        alive();
        alive();
        r45.vt vtVar = this.f345456i;
        Ai(vtVar);
        com.tencent.mars.xlog.Log.i("PluginMMEcFeatureService", "[onAccountInitialized] " + Bi(vtVar));
        this.f345451d.post(new oh3.o(false, this, "onAccountInitialized"));
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        nh3.d handler = wi();
        ((h70.a) eVar).getClass();
        kotlin.jvm.internal.o.g(handler, "handler");
        w71.l1.f443418a.add(handler);
        ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).Ai();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        dead();
        dead();
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        nh3.d handler = wi();
        ((h70.a) eVar).getClass();
        kotlin.jvm.internal.o.g(handler, "handler");
        w71.l1.f443418a.remove(handler);
        this.f345451d.removeCallbacksAndMessages(null);
    }

    public final nh3.d wi() {
        return (nh3.d) ((jz5.n) this.f345452e).getValue();
    }
}
