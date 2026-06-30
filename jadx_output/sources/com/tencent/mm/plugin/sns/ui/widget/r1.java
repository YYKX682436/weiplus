package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class r1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b86 f171258d;

    public r1(r45.b86 b86Var) {
        this.f171258d = b86Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "batchCommentContentFromServer errType:" + i17 + " errCode:" + i18 + " reqSize:" + this.f171258d.f370633e.size());
        if (i17 == 0 && i18 == 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.widget.o1(oVar, this.f171258d));
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.widget.p1(this.f171258d));
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.sns.ui.widget.q1 q1Var = com.tencent.mm.plugin.sns.ui.widget.q1.f171250d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReqCgiTimeIntervalSeconds$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReqCgiTimeIntervalSeconds$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        long j17 = (com.tencent.mm.plugin.sns.ui.widget.x1.f171312g * 1000) + 100;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(q1Var, j17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1");
        return 0;
    }
}
