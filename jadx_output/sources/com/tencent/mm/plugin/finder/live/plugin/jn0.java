package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113142e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.jn0(this.f113142e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.jn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113141d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f113141d = 1;
            if (com.tencent.mm.plugin.finder.live.plugin.wn0.t1(this.f113142e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
