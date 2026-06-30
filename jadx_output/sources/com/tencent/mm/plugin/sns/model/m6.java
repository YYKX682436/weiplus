package com.tencent.mm.plugin.sns.model;

/* loaded from: classes2.dex */
public final class m6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f164477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.n6 f164478e;

    /* renamed from: f, reason: collision with root package name */
    public int f164479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.plugin.sns.model.n6 n6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f164478e = n6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper$doRequestSnsStarList$1");
        this.f164477d = obj;
        this.f164479f |= Integer.MIN_VALUE;
        java.lang.Object b17 = this.f164478e.b(null, 0L, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper$doRequestSnsStarList$1");
        return b17;
    }
}
