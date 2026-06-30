package yk;

/* loaded from: classes12.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        int i17 = java.util.Calendar.getInstance().get(11);
        return 1 <= i17 && i17 <= 6 ? ((java.lang.Number) ((jz5.n) com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53704s).getValue()).intValue() : ((java.lang.Number) ((jz5.n) com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53703r).getValue()).intValue();
    }

    public final a5.y b(android.content.Context context) {
        if (!(com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground()) && !((java.lang.Boolean) ((jz5.n) com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53702q).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "Foreground task not executed");
            return a5.y.a();
        }
        if (com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53705t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "is working, not executed");
            return a5.y.a();
        }
        com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53705t = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pt0.p.f358218a1.getClass();
        com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
        msgRefactorReportStruct.p("db_start_clean");
        msgRefactorReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "Background task executed start");
        java.util.List list = com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53700o;
        if (list == null) {
            kotlin.jvm.internal.o.o("works");
            throw null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object newInstance = java.lang.Class.forName(((java.lang.Class) it.next()).getName()).getConstructor(android.content.Context.class).newInstance(context);
            yk.v vVar = newInstance instanceof yk.v ? (yk.v) newInstance : null;
            if (vVar != null) {
                vVar.a();
            }
        }
        com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53705t = false;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        pt0.p.f358218a1.getClass();
        com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
        msgRefactorReportStruct2.p("db_end_clean");
        msgRefactorReportStruct2.f59285n = (int) (currentTimeMillis2 / 1000);
        msgRefactorReportStruct2.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "Background task executed done, timeCost: " + currentTimeMillis2);
        return a5.y.a();
    }
}
