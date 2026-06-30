package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class s2 implements com.tencent.mm.plugin.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168990a;

    public s2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC) {
        this.f168990a = snsWsFoldInputUIC;
    }

    @Override // com.tencent.mm.plugin.sns.ui.dg
    public final void a(zb4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$showInputView$2");
        kotlin.jvm.internal.o.d(aVar);
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.Q6(this.f168990a, aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$showInputView$2");
    }
}
