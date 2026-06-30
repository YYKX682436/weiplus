package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f170375d;

    public r3(com.tencent.mm.plugin.sns.ui.p3 p3Var) {
        this.f170375d = p3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$1");
        this.f170375d.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$1");
    }
}
