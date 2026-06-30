package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ne implements sy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f169989a;

    public ne(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f169989a = snsBaseGalleryUI;
    }

    @Override // sy3.e
    public void a(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogCancel", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogCancel", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
    }

    @Override // sy3.e
    public void b(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f169989a.i7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
    }

    @Override // sy3.e
    public void c(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.U6(this.f169989a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
    }

    @Override // sy3.e
    public void d(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "dealWithImageOcr onDialogShow");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = this.f169989a;
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.U6(snsBaseGalleryUI);
        snsBaseGalleryUI.p7();
        snsBaseGalleryUI.o7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
    }

    @Override // sy3.e
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        int i19 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = this.f169989a;
        snsBaseGalleryUI.i7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        snsBaseGalleryUI.o7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
    }
}
