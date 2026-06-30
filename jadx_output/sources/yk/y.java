package yk;

/* loaded from: classes12.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker f462762d;

    public y(com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker msgRefactorReportWorker) {
        this.f462762d = msgRefactorReportWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<java.lang.Class> list;
        java.util.List<java.lang.String> list2;
        com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker msgRefactorReportWorker = this.f462762d;
        msgRefactorReportWorker.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "executeReport() start");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.util.Set set = qt0.b.f366492b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
            while (it.hasNext()) {
                qt0.e eVar = (qt0.e) it.next();
                arrayList.add(new qt0.f(eVar.f366502g, ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) eVar.f366501f).getValue()).getBoolean(eVar.f366502g, false)));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "reportIndexTasks() task count: " + arrayList.size());
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                qt0.f fVar = (qt0.f) it6.next();
                com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                msgRefactorReportStruct.p("msg_refactor_index_report");
                msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                msgRefactorReportStruct.r(fVar.f366504a);
                boolean z17 = fVar.f366505b;
                msgRefactorReportStruct.f59285n = z17 ? 1 : 0;
                msgRefactorReportStruct.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "reportIndexTasks() key: " + fVar.f366504a + ", isCreated: " + z17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRefactorReportWorker", th6, "reportIndexTasks failed", new java.lang.Object[0]);
        }
        try {
            list = com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53700o;
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRefactorReportWorker", th7, "reportDataCleanWorks failed", new java.lang.Object[0]);
        }
        if (list == null) {
            kotlin.jvm.internal.o.o("works");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "reportDataCleanWorks() work count: " + list.size());
        for (java.lang.Class cls : list) {
            java.lang.String simpleName = cls.getSimpleName();
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(cls.getName()).getConstructor(android.content.Context.class);
            java.lang.Object newInstance = constructor != null ? constructor.newInstance(msgRefactorReportWorker.f53706o) : null;
            yk.v vVar = newInstance instanceof yk.v ? (yk.v) newInstance : null;
            if (vVar == null || (list2 = vVar.b()) == null) {
                list2 = kz5.p0.f313996d;
            }
            for (java.lang.String str : list2) {
                boolean a17 = pt0.p.f358218a1.a(str);
                com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                msgRefactorReportStruct2.p("msg_refactor_dataclean_report");
                msgRefactorReportStruct2.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                msgRefactorReportStruct2.r(str);
                msgRefactorReportStruct2.f59285n = a17 ? 1 : 0;
                msgRefactorReportStruct2.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "reportDataCleanWorks() workName: " + simpleName + ", isCleaned: " + a17);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "executeReport() done, timeCost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
