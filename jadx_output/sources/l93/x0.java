package l93;

/* loaded from: classes10.dex */
public final class x0 extends com.tencent.mm.sdk.event.n {
    public x0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.StartActivityEvent event = (com.tencent.mm.autogen.events.StartActivityEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.mx mxVar = event.f54856g;
        java.lang.String str = mxVar.f7376a;
        boolean z17 = false;
        if (str != null && r26.n0.B(str, "com.tencent.mm.plugin.finder", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StartActivityEventListener", "startActivity: target class = " + mxVar.f7376a);
            com.tencent.mm.plugin.finder.report.j0 j0Var = com.tencent.mm.plugin.finder.report.j0.f125083a;
            com.tencent.mm.plugin.finder.report.j0.f125085c = c01.id.c();
        }
        java.lang.String str2 = mxVar.f7376a;
        if (str2 != null && str2.equals("com.tencent.mm.plugin.shake.ui.ShakeReportUI")) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.report.x5.f125436a = c01.id.c();
            com.tencent.mm.plugin.finder.report.x5.f125437b = "ShakeReportUI";
            if (!com.tencent.mm.plugin.finder.report.x5.f125438c) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(com.tencent.mm.plugin.finder.report.x5.f125440e);
                }
                com.tencent.mm.plugin.finder.report.x5.f125438c = true;
            }
        }
        return true;
    }
}
