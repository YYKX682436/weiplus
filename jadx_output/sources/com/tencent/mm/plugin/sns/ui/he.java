package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class he implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ie f168499d;

    public he(com.tencent.mm.plugin.sns.ui.ie ieVar) {
        this.f168499d = ieVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$14$1");
        if (gm0.j1.d().n() != 6 && gm0.j1.d().n() != 4) {
            com.tencent.mm.plugin.sns.ui.ie ieVar = this.f168499d;
            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = ieVar.f168608d;
            int i17 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.R;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            int i18 = snsBaseGalleryUI.f166813r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            if (i18 == 1) {
                com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI2 = ieVar.f168608d;
                db5.e1.s(snsBaseGalleryUI2, snsBaseGalleryUI2.getString(com.tencent.mm.R.string.f490500wu), "");
                ieVar.f168608d.l5();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$14$1");
    }
}
