package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f164184e;

    public f0(com.tencent.mm.plugin.sns.model.m0 m0Var, java.lang.String str) {
        this.f164184e = m0Var;
        this.f164183d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$6");
        com.tencent.mm.plugin.sns.model.m0 m0Var = this.f164184e;
        java.lang.String str = this.f164183d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.DownloadManager");
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownLoadFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "onDownLoadFinish by scene %s", str);
        com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
        synchronized (xj6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownLoadingS", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            ((java.util.HashMap) xj6.f164302e).remove(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownLoadingS", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        m0Var.s(str, true);
        m0Var.A();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownLoadFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.m0 m0Var2 = this.f164184e;
        java.lang.String str2 = this.f164183d;
        m0Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        m0Var2.C(str2, -1, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$6");
    }
}
