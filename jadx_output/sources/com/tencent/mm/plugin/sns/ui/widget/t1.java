package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.t1 f171273d = new com.tencent.mm.plugin.sns.ui.widget.t1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("timeline_emoticon_cache"));
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        int i17 = 0;
        int length = G != null ? G.length : 0;
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        int i18 = com.tencent.mm.plugin.sns.ui.widget.x1.f171308c;
        if (length > i18) {
            com.tencent.mm.vfs.r6[] G2 = r6Var.G();
            if (G2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1");
                return;
            }
            java.util.List z07 = kz5.z.z0(G2);
            kz5.n0.F0(z07, new com.tencent.mm.plugin.sns.ui.widget.s1());
            int size = z07.size();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEmotionCacheLimitCount$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            int i19 = size - i18;
            if (i19 > 0 && i19 >= 0) {
                while (true) {
                    com.tencent.mm.vfs.r6 r6Var2 = (com.tencent.mm.vfs.r6) z07.get(i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "clearExpiredItem path:" + r6Var2.u());
                    r6Var2.l();
                    if (i17 == i19) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$clearExpiredItem$1");
    }
}
