package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i6 f112233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(int i17, com.tencent.mm.plugin.finder.live.plugin.i6 i6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112232e = i17;
        this.f112233f = i6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.d6(this.f112232e, this.f112233f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.d6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112231d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f112232e * 1000;
            this.f112231d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f112233f.a();
        return jz5.f0.f302826a;
    }
}
