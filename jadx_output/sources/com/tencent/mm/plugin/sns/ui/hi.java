package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f168507d;

    public hi(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        this.f168507d = snsGalleryUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$1");
        this.f168507d.f7().f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$1");
    }
}
