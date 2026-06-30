package rd4;

/* loaded from: classes4.dex */
public final class d extends com.tencent.mm.plugin.sns.ui.n9 {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f394251c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.o9 f394252d;

    public d() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f394251c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1
            {
                this.__eventId = 399773850;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent templateBackgroundVideoResultEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent event = templateBackgroundVideoResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new rd4.c(event, rd4.d.this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                return true;
            }
        };
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.o9 f(rd4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        com.tencent.mm.plugin.sns.ui.o9 o9Var = dVar.f394252d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        return o9Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n9
    public void b(com.tencent.mm.plugin.sns.ui.o9 callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "alive event listener");
        this.f394251c.alive();
        this.f394252d = callback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n9
    public void c(java.lang.String workTagId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "deleteWork >> ".concat(workTagId));
        if (workTagId.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "deleteWork tagId is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
            return;
        }
        yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
        g8Var.getClass();
        com.tencent.mars.xlog.Log.i(g8Var.f468112d, "deleteWork >> workTagId: ".concat(workTagId));
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new yy0.u7(workTagId, g8Var, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n9
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "destroy event listener");
        this.f394251c.dead();
        this.f394252d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n9
    public void e(java.lang.String workTagId, com.tencent.mm.plugin.sns.ui.o9 callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "getRemuxVideoWork >> workTagId: ".concat(workTagId));
        ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Ai(workTagId, new rd4.a(callback, workTagId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }
}
