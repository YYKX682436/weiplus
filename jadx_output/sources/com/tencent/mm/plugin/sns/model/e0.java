package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f164163d;

    public e0(com.tencent.mm.plugin.sns.model.m0 m0Var) {
        this.f164163d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$5");
        com.tencent.mm.plugin.sns.model.m0.a(this.f164163d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$5");
    }
}
