package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.q1 f171250d = new com.tencent.mm.plugin.sns.ui.widget.q1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$3");
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        x1Var.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$3");
    }
}
