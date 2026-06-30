package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o7 f164620d;

    public q7(com.tencent.mm.plugin.sns.model.o7 o7Var) {
        this.f164620d = o7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.plugin.sns.model.o7 o7Var = this.f164620d;
        o7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (com.tencent.mm.plugin.sns.model.l4.Uj() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "workingHandler null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            if (!com.tencent.mm.plugin.sns.model.l4.Xj()) {
                gm0.j1.i();
                if (gm0.j1.u().l()) {
                    com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.r7(o7Var));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "core invalid or sdcard not Available");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$2");
    }
}
