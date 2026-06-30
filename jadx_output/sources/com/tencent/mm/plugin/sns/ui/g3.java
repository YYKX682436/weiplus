package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.h3 f168397d;

    public g3(com.tencent.mm.plugin.sns.ui.h3 h3Var) {
        this.f168397d = h3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1$1");
        this.f168397d.f168487d.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1$1");
    }
}
