package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ShowCommentImageView f169982d;

    public n8(com.tencent.mm.plugin.sns.ui.ShowCommentImageView showCommentImageView) {
        this.f169982d = showCommentImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$2");
        android.graphics.Bitmap bitmap = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166627e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        this.f169982d.f166632d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$2");
    }
}
