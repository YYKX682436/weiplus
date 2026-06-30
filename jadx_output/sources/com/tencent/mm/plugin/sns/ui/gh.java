package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class gh implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f168435d;

    public gh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f168435d = snsCommentImageFlowUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.graphics.BitmapFactory.Options n07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168435d;
        snsCommentImageFlowUI.f166810o.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = snsCommentImageFlowUI.f166810o.getWidth();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setScreenWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.f167126p0 = width;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setScreenWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int height = snsCommentImageFlowUI.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setScreenHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.f167128x0 = height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setScreenHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int width2 = snsCommentImageFlowUI.f166810o.getWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.Y = width2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int height2 = snsCommentImageFlowUI.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.Z = height2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        java.lang.String r17 = com.tencent.mm.plugin.sns.model.i1.r(snsCommentImageFlowUI.f166810o.getCntMedia());
        if (r17 != null && (n07 = com.tencent.mm.sdk.platformtools.x.n0(r17)) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            int i17 = snsCommentImageFlowUI.Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            snsCommentImageFlowUI.Z = (int) ((i17 / n07.outWidth) * n07.outHeight);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            int i18 = snsCommentImageFlowUI.Z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (i18 > snsCommentImageFlowUI.f166810o.getHeight()) {
                int height3 = snsCommentImageFlowUI.f166810o.getHeight();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                snsCommentImageFlowUI.Z = height3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
        }
        com.tencent.mm.ui.tools.s4 z76 = snsCommentImageFlowUI.z7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int i19 = snsCommentImageFlowUI.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int i27 = snsCommentImageFlowUI.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        z76.f210699f = i19;
        z76.f210700g = i27;
        com.tencent.mm.ui.tools.s4 z77 = snsCommentImageFlowUI.z7();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsCommentImageFlowUI.f166810o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getGalleryBg$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        android.view.View view = snsCommentImageFlowUI.f167129x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getGalleryBg$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        z77.c(snsInfoFlip, view, new com.tencent.mm.plugin.sns.ui.fh(snsCommentImageFlowUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1");
        return true;
    }
}
