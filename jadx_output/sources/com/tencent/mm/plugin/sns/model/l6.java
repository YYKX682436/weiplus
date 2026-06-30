package com.tencent.mm.plugin.sns.model;

/* loaded from: classes2.dex */
public final class l6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f164430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.n6 f164431e;

    /* renamed from: f, reason: collision with root package name */
    public int f164432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.plugin.sns.model.n6 n6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f164431e = n6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper$doRequestSnsStarAction$1");
        this.f164430d = obj;
        this.f164432f |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f164431e.a(0, 0L, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper$doRequestSnsStarAction$1");
        return a17;
    }
}
