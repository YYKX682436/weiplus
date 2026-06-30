package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f168431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.AnonymousClass13 f168432e;

    public ge(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.AnonymousClass13 anonymousClass13, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f168432e = anonymousClass13;
        this.f168431d = scanTranslationResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.AnonymousClass13 anonymousClass13 = this.f168432e;
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.this;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int i18 = snsBaseGalleryUI.f166821z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = this.f168431d;
        if (i18 == scanTranslationResultEvent.f54739g.f6400a) {
            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI2 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.this;
            snsBaseGalleryUI2.l5();
            am.ct ctVar = scanTranslationResultEvent.f54739g;
            if (ctVar.f6402c) {
                if (com.tencent.mm.vfs.w6.j(ctVar.f6403d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "trans result succ path %s", ctVar.f6403d);
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI2.f166811p;
                    if (snsInfoFlip != null) {
                        r45.m33 currentFlipItem = snsInfoFlip.getCurrentFlipItem();
                        if (currentFlipItem != null) {
                            currentFlipItem.f380113h = true;
                            currentFlipItem.f380114i = ctVar.f6403d;
                            if (snsBaseGalleryUI2.f166810o.getGallery() != null && snsBaseGalleryUI2.f166810o.getGallery().getAdapter() != null) {
                                snsBaseGalleryUI2.f166810o.getGallery().getAdapter().notifyDataSetChanged();
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsBaseGalleryUI", "ScanTranslationResultEvent current item is null");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsBaseGalleryUI", "trans result path %s not exist!", ctVar.f6403d);
            }
            snsBaseGalleryUI2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            snsBaseGalleryUI2.f166821z = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            db5.e1.G(snsBaseGalleryUI2, snsBaseGalleryUI2.getString(com.tencent.mm.R.string.iaw), "", false, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
    }
}
