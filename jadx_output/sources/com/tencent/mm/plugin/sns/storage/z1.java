package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f166185d;

    public z1(java.lang.String... paths) {
        kotlin.jvm.internal.o.g(paths, "paths");
        this.f166185d = paths;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$SnsCoverClearTask");
        for (java.lang.String str : this.f166185d) {
            com.tencent.mm.plugin.sns.storage.y1 y1Var = com.tencent.mm.plugin.sns.storage.a2.f165920g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "delete path:" + str + " size:" + com.tencent.mm.vfs.w6.k(str));
            com.tencent.mm.vfs.w6.h(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$SnsCoverClearTask");
    }
}
