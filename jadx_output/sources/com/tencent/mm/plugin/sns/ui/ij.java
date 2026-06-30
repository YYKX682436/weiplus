package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ij extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f168613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jj f168614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168618i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(com.tencent.mm.plugin.sns.ui.jj jjVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168614e = jjVar;
        this.f168615f = str;
        this.f168616g = str2;
        this.f168617h = str3;
        this.f168618i = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
        com.tencent.mm.plugin.sns.ui.ij ijVar = new com.tencent.mm.plugin.sns.ui.ij(this.f168614e, this.f168615f, this.f168616g, this.f168617h, this.f168618i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
        return ijVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.ij) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.ij.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
