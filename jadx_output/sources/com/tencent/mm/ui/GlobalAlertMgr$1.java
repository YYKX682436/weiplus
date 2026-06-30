package com.tencent.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class GlobalAlertMgr$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GlobalAlertEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f196736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalAlertMgr$1(com.tencent.mm.ui.o7 o7Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f196736d = o7Var;
        this.__eventId = 1638723793;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.GlobalAlertEvent globalAlertEvent) {
        am.zg zgVar;
        final com.tencent.mm.autogen.events.GlobalAlertEvent globalAlertEvent2 = globalAlertEvent;
        if (globalAlertEvent2 == null || (zgVar = globalAlertEvent2.f54424g) == null || zgVar.f8561a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert event is illegal event[%s]", globalAlertEvent2);
        } else {
            com.tencent.mm.ui.HomeUI.ActivityStatus activityStatus = ((com.tencent.mm.ui.HomeUI) this.f196736d.f209451b).f196757p;
            com.tencent.mm.ui.HomeUI.ActivityStatus activityStatus2 = com.tencent.mm.ui.HomeUI.ActivityStatus.ACTIVITY_RESUME;
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert event launcherUI isResumeStatus[%b], tid[%d]", java.lang.Boolean.valueOf(activityStatus == activityStatus2), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.tencent.mm.ui.o7 o7Var = this.f196736d;
            if (((com.tencent.mm.ui.HomeUI) o7Var.f209451b).f196757p == activityStatus2) {
                o7Var.f209452c = null;
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.GlobalAlertMgr$1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.GlobalAlertMgr$1 globalAlertMgr$1 = com.tencent.mm.ui.GlobalAlertMgr$1.this;
                        globalAlertMgr$1.getClass();
                        globalAlertMgr$1.f196736d.f(globalAlertEvent2.f54424g);
                    }
                });
            } else {
                o7Var.f209452c = globalAlertEvent2.f54424g;
            }
        }
        return false;
    }
}
