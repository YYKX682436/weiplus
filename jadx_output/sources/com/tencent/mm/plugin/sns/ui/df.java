package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class df implements db5.z7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMViewPager f168182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f168183b;

    public df(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI, com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        this.f168183b = snsBrowseUI;
        this.f168182a = mMViewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3 == 0) goto L6;
     */
    @Override // db5.z7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.df.a(float, float):void");
    }

    @Override // db5.z7
    public void b(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetPreParam", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$6");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f168183b;
        snsBrowseUI.M1 = (int) f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.N1 = (int) f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetPreParam", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$6");
    }
}
