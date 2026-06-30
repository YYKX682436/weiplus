package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f171204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(java.lang.String str, r45.e86 e86Var) {
        super(1);
        this.f171203d = str;
        this.f171204e = e86Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$2");
        java.lang.String md52 = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$2");
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentMediaLoadManager", "emoticon load fail:".concat(md52));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLoadMap$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.ui.widget.q2.f171252e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLoadMap$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        hashMap.remove(md52);
        com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentShowFail$default", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        r2Var.f(this.f171203d, this.f171204e, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentShowFail$default", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$2");
        return f0Var;
    }
}
