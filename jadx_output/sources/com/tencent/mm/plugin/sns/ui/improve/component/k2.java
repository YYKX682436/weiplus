package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC) {
        super(0);
        this.f168929d = snsWsFoldInputUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentFooter$2");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) this.f168929d.findViewById(com.tencent.mm.R.id.c76);
        snsCommentFooter.setEnlargeEmoticonSmileyHeight(j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsCmtEmoFooterHeight()) == 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$initComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        snsCommentFooter.setAfterEditAction(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$initComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentFooter$2");
        return snsCommentFooter;
    }
}
