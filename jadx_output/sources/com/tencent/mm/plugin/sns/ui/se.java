package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class se implements com.tencent.mm.plugin.sns.ui.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f170455a;

    public se(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f170455a = snsBaseGalleryUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.e3
    public void a(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
        if (list != null && list.contains(1011)) {
            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = this.f170455a;
            sy3.d T6 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.T6(snsBaseGalleryUI);
            int d76 = snsBaseGalleryUI.d7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            int i17 = snsBaseGalleryUI.f166815t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            ((kz3.o) T6).a(2, d76, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
    }

    @Override // com.tencent.mm.plugin.sns.ui.e3
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
        ((kz3.o) com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.T6(this.f170455a)).f313905a.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
    }
}
