package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f117281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f117282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f117283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f117284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117285i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(yl2.g1 g1Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var, boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117281e = g1Var;
        this.f117282f = f0Var;
        this.f117283g = h0Var;
        this.f117284h = z17;
        this.f117285i = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.n6(this.f117281e, this.f117282f, this.f117283g, this.f117284h, this.f117285i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117280d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f117282f.f310116d;
            java.lang.String str = (java.lang.String) this.f117283g.f310123d;
            this.f117280d = 1;
            obj = this.f117281e.b(i18, str, this.f117284h, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.m6(this.f117285i, (yl2.o) obj));
        return jz5.f0.f302826a;
    }
}
