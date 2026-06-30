package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b86 f171246d;

    public p1(r45.b86 b86Var) {
        this.f171246d = b86Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$2");
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEmoticonBatchList$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList = com.tencent.mm.plugin.sns.ui.widget.x1.f171309d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEmoticonBatchList$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.LinkedList ContentReqs = this.f171246d.f370633e;
        kotlin.jvm.internal.o.f(ContentReqs, "ContentReqs");
        arrayList.removeAll(ContentReqs);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRunning$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.widget.x1.f171310e = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRunning$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$2");
    }
}
