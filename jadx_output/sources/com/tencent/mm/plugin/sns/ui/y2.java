package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class y2 implements com.tencent.mm.plugin.scanner.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f171605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f171607c;

    public y2(com.tencent.mm.plugin.sns.ui.FlipView flipView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        this.f171607c = flipView;
        this.f171605a = snsInfo;
        this.f171606b = str;
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMultiCodeView", "com.tencent.mm.plugin.sns.ui.FlipView$3");
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f171607c;
        d0Var.d(flipView.H.longValue(), flipView.A.size(), arrayList.size(), 1, "");
        boolean z17 = true;
        if (arrayList.size() > 1) {
            d0Var.b(flipView.H.longValue(), 11, arrayList3, null, flipView.I.longValue(), 1, 6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.f3 f3Var = flipView.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String str = this.f171606b;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f171605a;
        if (f3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
            com.tencent.mm.plugin.sns.ui.f3 f3Var2 = flipView.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
            com.tencent.mm.plugin.sns.ui.le leVar = (com.tencent.mm.plugin.sns.ui.le) f3Var2;
            leVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMultiCodeViewShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2");
            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = leVar.f169739a;
            com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = snsBaseGalleryUI.f166816u;
            if (multiCodeMaskView != null) {
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f166810o;
                if (snsInfoFlip != null) {
                    multiCodeMaskView.c(6, arrayList3, arrayList, arrayList2, snsInfoFlip.getMeasuredHeight());
                } else {
                    multiCodeMaskView.c(6, arrayList3, arrayList, arrayList2, multiCodeMaskView.getRootView().getMeasuredHeight());
                }
                snsBaseGalleryUI.f166816u.setMMultiCodeMaskViewListener(new com.tencent.mm.plugin.sns.ui.ke(leVar, snsInfo, str));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMultiCodeViewShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMultiCodeViewShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2");
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMultiCodeView", "com.tencent.mm.plugin.sns.ui.FlipView$3");
                return;
            }
        }
        if (arrayList2.isEmpty()) {
            flipView.g((com.tencent.mm.plugin.scanner.ImageQBarDataBean) flipView.A.get(0), snsInfo, str);
        } else {
            flipView.g((com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList2.get(0), snsInfo, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMultiCodeView", "com.tencent.mm.plugin.sns.ui.FlipView$3");
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void b(com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOutsideCode", "com.tencent.mm.plugin.sns.ui.FlipView$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f171605a;
        java.lang.String str = this.f171606b;
        com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f171607c;
        flipView.g(imageQBarDataBean, snsInfo, str);
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        d0Var.d(flipView.H.longValue(), arrayList.size(), 0, 1, "");
        d0Var.b(flipView.H.longValue(), 1, arrayList, imageQBarDataBean, flipView.I.longValue(), 1, 6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOutsideCode", "com.tencent.mm.plugin.sns.ui.FlipView$3");
    }
}
