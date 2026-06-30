package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class l0 implements com.tencent.mm.plugin.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168933a;

    public l0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC) {
        this.f168933a = improveInputUIC;
    }

    @Override // com.tencent.mm.plugin.sns.ui.dg
    public final void a(zb4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$showInputView$2");
        kotlin.jvm.internal.o.d(aVar);
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.P6(this.f168933a, aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$showInputView$2");
    }
}
