package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ik implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jk f168619d;

    public ik(com.tencent.mm.plugin.sns.ui.bk bkVar, com.tencent.mm.plugin.sns.ui.jk jkVar) {
        this.f168619d = jkVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$7");
        com.tencent.mm.plugin.sns.ui.jk jkVar = this.f168619d;
        jkVar.f169515b.setVisibility(8);
        jkVar.f169516c.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$7");
    }
}
