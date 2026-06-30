package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class q implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168863a;

    public q(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        this.f168863a = improveHeaderUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$initMsgNotifyReport$1");
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168863a;
        java.util.Map k17 = kz5.c1.k(new jz5.l("message_num", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getMsgNotifyNum$p(improveHeaderUIC))), new jz5.l("show_username", com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getUsrNotifyName$p(improveHeaderUIC)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$initMsgNotifyReport$1");
        return k17;
    }
}
