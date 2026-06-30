package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class p implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163355a;

    public p(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        this.f163355a = yVar;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGFlushListener$1");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163355a;
        if (com.tencent.mm.plugin.sns.ad.widget.adpag.y.A(yVar) != null) {
            android.widget.ImageView A = com.tencent.mm.plugin.sns.ad.widget.adpag.y.A(yVar);
            boolean z17 = false;
            if (A != null && A.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(yVar.j(), "mThumbIv need to be gone");
                yVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.tencent.mm.view.MMPAGView mMPAGView = yVar.f163374w;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                if (mMPAGView != null) {
                    mMPAGView.j(this);
                }
                android.widget.ImageView A2 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.A(yVar);
                if (A2 != null) {
                    A2.clearAnimation();
                }
                android.widget.ImageView A3 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.A(yVar);
                if (A3 != null) {
                    A3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGFlushListener$1");
    }
}
