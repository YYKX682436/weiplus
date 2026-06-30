package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f171381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 f171382e;

    /* renamed from: f, reason: collision with root package name */
    public int f171383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f171382e = snsWsFoldDetailUIV3;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$wsFoldSetting$1");
        this.f171381d = obj;
        this.f171383f |= Integer.MIN_VALUE;
        java.lang.Object V6 = com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.V6(this.f171382e, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$wsFoldSetting$1");
        return V6;
    }
}
