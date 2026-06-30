package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC) {
        super(0);
        this.f168750d = improveInputUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) this.f168750d.findViewById(com.tencent.mm.R.id.c76);
        snsCommentFooter.setEnlargeEmoticonSmileyHeight(j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsCmtEmoFooterHeight()) == 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        snsCommentFooter.setAfterEditAction(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
        return snsCommentFooter;
    }
}
