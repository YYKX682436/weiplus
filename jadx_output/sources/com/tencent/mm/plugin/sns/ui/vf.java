package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170632d;

    public vf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f170632d = snsCommentFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$3");
        java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f170632d.q(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$3");
    }
}
