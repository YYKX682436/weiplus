package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter f168455d;

    public gq(com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter) {
        this.f168455d = snsSightUploadSayFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$3");
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = this.f168455d;
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.i(snsSightUploadSayFooter).performClick();
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.i(snsSightUploadSayFooter).requestFocus();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.ui.MMActivity mMActivity = snsSightUploadSayFooter.f167389n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        mMActivity.showVKB();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$3");
    }
}
