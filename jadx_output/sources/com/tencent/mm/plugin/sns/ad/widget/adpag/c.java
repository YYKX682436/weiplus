package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f163330a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adpag.y f163331b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163332c;

    public c(int i17) {
        this.f163330a = i17;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdGeneralPAGLogic");
        com.tencent.mars.xlog.Log.i("AdGeneralPAGLogic", "adGeneralPAGLogic, from not ad to resetUI");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163331b;
        if (yVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            com.tencent.mm.plugin.sns.ui.AdFrameLayout D = yVar.D();
            if (D != null) {
                D.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout = yVar.A;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout2 = yVar.B;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            yVar.f163375x.removeCallbacksAndMessages(null);
            yVar.f163376y = false;
            yVar.E();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdGeneralPAGLogic");
    }
}
