package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fe implements com.tencent.mm.plugin.sns.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f168340a;

    public fe(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f168340a = snsBaseGalleryUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.a4
    public void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickDetail", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
        this.f168340a.h7(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickDetail", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
    }

    @Override // com.tencent.mm.plugin.sns.ui.a4
    public void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
    }

    @Override // com.tencent.mm.plugin.sns.ui.a4
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
    }
}
