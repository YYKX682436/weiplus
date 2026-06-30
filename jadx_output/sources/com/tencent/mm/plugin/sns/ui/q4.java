package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f170312a = new java.util.HashMap();

    static {
        new com.tencent.mm.plugin.sns.ui.n9().b(new com.tencent.mm.plugin.sns.ui.o4());
        new rd4.d().b(new com.tencent.mm.plugin.sns.ui.p4());
    }

    public static final /* synthetic */ java.util.HashMap a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExportProgressMap$p", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager");
        java.util.HashMap hashMap = f170312a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExportProgressMap$p", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager");
        return hashMap;
    }
}
