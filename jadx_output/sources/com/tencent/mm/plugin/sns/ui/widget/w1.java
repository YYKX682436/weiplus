package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f171288d;

    /* renamed from: e, reason: collision with root package name */
    public int f171289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f171290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f171291g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(r45.e86 e86Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171290f = e86Var;
        this.f171291g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        com.tencent.mm.plugin.sns.ui.widget.w1 w1Var = new com.tencent.mm.plugin.sns.ui.widget.w1(this.f171290f, this.f171291g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        return w1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171289e;
        r45.e86 e86Var = this.f171290f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.l86 l86Var = (r45.l86) e86Var.f373140u.getFirst();
            if (android.text.TextUtils.isEmpty(l86Var.f379230d)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
                return f0Var;
            }
            java.lang.String str2 = l86Var.f379230d;
            if (com.tencent.mm.plugin.sns.ui.widget.x1.a().k(str2)) {
                r45.m86 m86Var = (r45.m86) com.tencent.mm.plugin.sns.ui.widget.x1.a().get(str2);
                com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
                kotlin.jvm.internal.o.d(m86Var);
                if (x1Var.g(m86Var)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
                    return f0Var;
                }
            }
            com.tencent.mm.plugin.sns.ui.widget.x1 x1Var2 = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
            kotlin.jvm.internal.o.d(str2);
            this.f171288d = str2;
            this.f171289e = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsEmotionCacheItemFromFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsEmotionCacheItemFromFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.sns.ui.widget.u1(str2, null), this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsEmotionCacheItemFromFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsEmotionCacheItemFromFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            if (g17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
                return aVar;
            }
            str = str2;
            obj = g17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
                throw illegalStateException;
            }
            str = (java.lang.String) this.f171288d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.m86 m86Var2 = (r45.m86) obj;
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var3 = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        if (x1Var3.g(m86Var2)) {
            com.tencent.mm.plugin.sns.ui.widget.x1.a().put(str, m86Var2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
            return f0Var;
        }
        if (m86Var2.f380248e != null) {
            com.tencent.mm.plugin.sns.ui.widget.x1.a().put(str, m86Var2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "updateEmojiInfo >> " + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$addBatchEmoticon", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        x1Var3.b(this.f171291g, e86Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$addBatchEmoticon", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$updateEmojiInfo$1");
        return f0Var;
    }
}
