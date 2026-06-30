package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f164375d;

    public l0(com.tencent.mm.plugin.sns.model.m0 m0Var) {
        this.f164375d = m0Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queueIdle", "com.tencent.mm.plugin.sns.model.DownloadManager$mmIdleHandler");
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.m0 m0Var = this.f164375d;
        m0Var.f164439b = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean a17 = com.tencent.mm.plugin.sns.model.m0.a(m0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queueIdle", "com.tencent.mm.plugin.sns.model.DownloadManager$mmIdleHandler");
        return a17;
    }
}
