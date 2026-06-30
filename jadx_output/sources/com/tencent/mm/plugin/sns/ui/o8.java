package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightUploadUI f170090e;

    public o8(com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI, int i17) {
        this.f170090e = sightUploadUI;
        this.f170089d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightUploadUI$1");
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI = this.f170090e;
        com.tencent.mm.plugin.sns.ui.SnsEditText T6 = com.tencent.mm.plugin.sns.ui.SightUploadUI.T6(sightUploadUI);
        double d17 = this.f170089d;
        T6.setWidth((int) (0.7d * d17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        android.widget.LinearLayout linearLayout = sightUploadUI.f166636f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        android.widget.LinearLayout linearLayout2 = sightUploadUI.f166636f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int) (d17 * 0.3d), linearLayout2.getHeight()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightUploadUI$1");
    }
}
