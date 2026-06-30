package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f171239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b86 f171240e;

    public o1(com.tencent.mm.modelbase.o oVar, r45.b86 b86Var) {
        this.f171239d = oVar;
        this.f171240e = b86Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$1");
        com.tencent.mm.protobuf.f fVar = this.f171239d.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsCommentDetailResponse");
        r45.c86 c86Var = (r45.c86) fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "batchCommentContentFromServer count:" + c86Var.f371376e.size());
        java.util.LinkedList<r45.a86> ContentResults = c86Var.f371376e;
        kotlin.jvm.internal.o.f(ContentResults, "ContentResults");
        for (r45.a86 a86Var : ContentResults) {
            java.util.LinkedList SnsEmojiInfo = a86Var.f369829g;
            kotlin.jvm.internal.o.f(SnsEmojiInfo, "SnsEmojiInfo");
            if (!SnsEmojiInfo.isEmpty()) {
                com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
                java.lang.Object first = a86Var.f369829g.getFirst();
                kotlin.jvm.internal.o.f(first, "getFirst(...)");
                r45.l86 l86Var = (r45.l86) first;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                if (android.text.TextUtils.isEmpty(l86Var.f379230d)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                } else {
                    r45.cu5 cu5Var = l86Var.f379231e;
                    if (cu5Var == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                    } else if (cu5Var.f371841f.f192156a.length <= 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "setEmojiInfo >> md5: " + l86Var.f379230d + " expireTime: " + l86Var.f379237n);
                        r45.m86 m86Var = new r45.m86();
                        m86Var.f380247d = l86Var.f379230d;
                        m86Var.f380248e = l86Var;
                        m86Var.f380249f = (int) (java.lang.System.currentTimeMillis() / ((long) 1000));
                        com.tencent.mm.plugin.sns.ui.widget.x1.f171307b.put(l86Var.f379230d, m86Var);
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ui.widget.v1(l86Var, m86Var));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            }
        }
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var2 = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEmoticonBatchList$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList = com.tencent.mm.plugin.sns.ui.widget.x1.f171309d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEmoticonBatchList$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.LinkedList ContentReqs = this.f171240e.f370633e;
        kotlin.jvm.internal.o.f(ContentReqs, "ContentReqs");
        arrayList.removeAll(ContentReqs);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRunning$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.widget.x1.f171310e = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRunning$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$1");
    }
}
