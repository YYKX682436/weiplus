package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f169983a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.o9 f169984b;

    public n9() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f169983a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1
            {
                this.__eventId = 1480328353;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent videoBackgroundRemuxResultEventEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent event = videoBackgroundRemuxResultEventEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.sns.ui.m9(event, com.tencent.mm.plugin.sns.ui.n9.this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                return true;
            }
        };
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.o9 a(com.tencent.mm.plugin.sns.ui.n9 n9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        com.tencent.mm.plugin.sns.ui.o9 o9Var = n9Var.f169984b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        return o9Var;
    }

    public void b(com.tencent.mm.plugin.sns.ui.o9 callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "alive event listener");
        this.f169983a.alive();
        this.f169984b = callback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }

    public void c(java.lang.String workTagId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "deleteWork >> ".concat(workTagId));
        if (workTagId.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightWidgetBackgroundVideoHandler", "deleteWork tagId is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            return;
        }
        wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
        xVar.getClass();
        com.tencent.mars.xlog.Log.i(xVar.f448453d, "deleteWork >> workTagId: ".concat(workTagId));
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new wp4.l(workTagId, xVar, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "destroy event listener");
        this.f169983a.dead();
        this.f169984b = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }

    public void e(java.lang.String workTagId, com.tencent.mm.plugin.sns.ui.o9 callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "getRemuxVideoWork >> workTagId: ".concat(workTagId));
        ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).wi(workTagId, new com.tencent.mm.plugin.sns.ui.k9(callback, workTagId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }
}
