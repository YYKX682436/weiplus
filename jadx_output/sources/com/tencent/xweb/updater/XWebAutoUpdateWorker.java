package com.tencent.xweb.updater;

/* loaded from: classes12.dex */
public class XWebAutoUpdateWorker extends androidx.work.Worker {
    public XWebAutoUpdateWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public a5.y h() {
        by5.c4.f("XWebAutoUpdateWorker", "doWork, xweb auto check update");
        by5.t0 t0Var = org.xwalk.core.XWalkEnvironment.f347982o;
        if (t0Var != null) {
            java.lang.Object a17 = t0Var.a("autoCheckUpdate", new java.lang.Object[0]);
            if ((a17 instanceof java.lang.Boolean) && ((java.lang.Boolean) a17).booleanValue()) {
                by5.c4.f("XWebAutoUpdateWorker", "doWork, check update by app");
                return a5.y.a();
            }
        }
        if (com.tencent.xweb.a3.o(true)) {
            by5.c4.f("XWebAutoUpdateWorker", "doWork, check update by sdk");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", "7");
            com.tencent.xweb.a3.A(org.xwalk.core.XWalkEnvironment.f347970c, hashMap);
        } else {
            by5.c4.f("XWebAutoUpdateWorker", "doWork, no need check update");
        }
        return a5.y.a();
    }
}
