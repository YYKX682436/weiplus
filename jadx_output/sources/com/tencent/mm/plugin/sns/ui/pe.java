package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pe implements db5.x7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f170213a;

    public pe(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f170213a = snsBaseGalleryUI;
    }

    @Override // db5.x7
    public boolean a(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$6");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = this.f170213a;
        sy3.c cVar = snsBaseGalleryUI.f166801J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (cVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$6");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        sy3.c cVar2 = snsBaseGalleryUI.f166801J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        boolean e17 = ((kz3.l) cVar2).e(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$6");
        return e17;
    }
}
