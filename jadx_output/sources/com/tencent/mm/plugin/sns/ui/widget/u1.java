package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171277d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        com.tencent.mm.plugin.sns.ui.widget.u1 u1Var = new com.tencent.mm.plugin.sns.ui.widget.u1(this.f171277d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        return u1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.m86 m86Var = new r45.m86();
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.lang.String e17 = x1Var.e(this.f171277d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        if (com.tencent.mm.vfs.w6.j(e17)) {
            m86Var = new r45.m86();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$safeParseCacheFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            x1Var.i(e17, m86Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$safeParseCacheFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$getSnsEmotionCacheItemFromFile$2");
        return m86Var;
    }
}
