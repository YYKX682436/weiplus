package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class lg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter f169740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter snsCommentImageLoadMoreFooter) {
        super(0);
        this.f169740d = snsCommentImageLoadMoreFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1$1");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter snsCommentImageLoadMoreFooter = this.f169740d;
        if (snsCommentImageLoadMoreFooter != null) {
            snsCommentImageLoadMoreFooter.setOnRefreshStateNone(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1$1");
        return f0Var;
    }
}
