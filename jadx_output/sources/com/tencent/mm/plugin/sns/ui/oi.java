package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class oi implements db5.z7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMViewPager f170100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f170101b;

    public oi(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI, com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        this.f170101b = snsGalleryUI;
        this.f170100a = mMViewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r6 == 0) goto L6;
     */
    @Override // db5.z7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(float r9, float r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.oi.a(float, float):void");
    }

    @Override // db5.z7
    public void b(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetPreParam", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$6");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f170101b;
        snsGalleryUI.A1 = (int) f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.B1 = (int) f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetPreParam", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$6");
    }
}
