package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.l86 f171282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m86 f171283e;

    public v1(r45.l86 l86Var, r45.m86 m86Var) {
        this.f171282d = l86Var;
        this.f171283e = m86Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$setEmojiInfo$1");
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        java.lang.String Md5 = this.f171282d.f379230d;
        kotlin.jvm.internal.o.f(Md5, "Md5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.lang.String e17 = x1Var.e(Md5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.vfs.w6.R(e17, this.f171283e.toByteArray());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$setEmojiInfo$1");
    }
}
