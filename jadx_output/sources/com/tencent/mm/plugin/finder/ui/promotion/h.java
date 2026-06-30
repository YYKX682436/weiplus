package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f129662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129663e;

    /* renamed from: f, reason: collision with root package name */
    public int f129664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.ui.promotion.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f129663e = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f129662d = obj;
        this.f129664f |= Integer.MIN_VALUE;
        java.lang.Object O6 = com.tencent.mm.plugin.finder.ui.promotion.t.O6(this.f129663e, this);
        return O6 == pz5.a.f359186d ? O6 : kotlin.Result.m520boximpl(O6);
    }
}
