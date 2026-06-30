package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes.dex */
public final class s1 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1$run$$inlined$sortedBy$1");
        int b17 = mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.vfs.r6) obj).B()), java.lang.Long.valueOf(((com.tencent.mm.vfs.r6) obj2).B()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1$run$$inlined$sortedBy$1");
        return b17;
    }
}
