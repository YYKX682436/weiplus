package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLikesTextView f168199d;

    public dl(com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView) {
        this.f168199d = snsLikesTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$3");
        this.f168199d.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$3");
    }
}
