package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.h0 f164110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f164111e;

    public c0(com.tencent.mm.plugin.sns.model.m0 m0Var, com.tencent.mm.plugin.sns.model.h0 h0Var) {
        this.f164111e = m0Var;
        this.f164110d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$3");
        com.tencent.mm.plugin.sns.model.m0 m0Var = this.f164111e;
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        ((java.util.concurrent.CopyOnWriteArraySet) m0Var.f164447j).remove(this.f164110d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$3");
    }
}
